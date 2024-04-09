package com.microservice.customer.service;

import com.microservice.customer.messaging.RabbitMQProducer;
import com.microservice.client.fraud.FraudClient;
import com.microservice.client.fraud.FraudResponse;
import com.microservice.client.notification.NotificationClient;
import com.microservice.client.notification.NotificationRequest;
import com.microservice.customer.entity.Customer;
import com.microservice.customer.entity.CustomerRequest;
import com.microservice.customer.repository.CustomerRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
//    private final RestTemplate restTemplate;
    private final FraudClient fraudClient;
    private final NotificationClient notificationClient;
    private final RabbitMQProducer messageProducer;

    @CircuitBreaker(name="customerCircuitBreaker", fallbackMethod = "fallback")
//    @Retry(name="customerRetry")
//    @RateLimiter(name="customerRateLimiter", fallbackMethod = "fallback")
    public void registerCustomer(CustomerRequest customerRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRequest.firstName())
                .lastName(customerRequest.lastName())
                .email(customerRequest.email())
                .build();

        customerRepository.saveAndFlush(customer);

//        FraudResponse fraudResponse = restTemplate.getForObject(
//                "http://FRAUD/api/v1/fraud/{customerId}",
//                FraudResponse.class,
//                customer.getId()
//        );

        FraudResponse fraudResponse = fraudClient.isFraudCustomer(customer.getId());

        assert fraudResponse != null;
        if(fraudResponse.isFraudster()) {
            throw new IllegalStateException("Fraudster!");
        }

//        notificationClient.sendNotifications(
//                new NotificationRequest(
//                        String.format("Hi %s! Happy Coding!!", customer.getFirstName()),
//                        customer.getId(),
//                        customer.getEmail()
//                )
//        );
        NotificationRequest notificationRequest = new NotificationRequest(
                String.format("Hi %s! Happy Coding!!", customer.getFirstName()),
                customer.getId(),
                customer.getEmail()
        );
        messageProducer.publish(notificationRequest);
    }

    public void fallback(CustomerRequest customerRequest, Exception e) {
        System.out.println("Fallback Method");
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomer(Long customerId) {
        return customerRepository.findById(customerId).orElseThrow(() -> new RuntimeException("Not Found"));
    }
}
