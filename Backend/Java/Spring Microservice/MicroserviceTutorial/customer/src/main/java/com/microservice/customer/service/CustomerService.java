package com.microservice.customer.service;

import com.microservice.customer.entity.Customer;
import com.microservice.customer.entity.CustomerRequest;
import com.microservice.customer.entity.FraudResponse;
import com.microservice.customer.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final RestTemplate restTemplate;

    public void registerCustomer(CustomerRequest customerRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRequest.firstName())
                .lastName(customerRequest.lastName())
                .email(customerRequest.email())
                .build();

        customerRepository.saveAndFlush(customer);

        FraudResponse fraudResponse = restTemplate.getForObject(
                "http://FRAUD/api/v1/fraud/{customerId}",
                FraudResponse.class,
                customer.getId()
        );

        assert fraudResponse != null;
        if(fraudResponse.isFraudster()) {
            throw new IllegalStateException("Fraudster!");
        }
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomer(Long customerId) {
        return customerRepository.findById(customerId).orElseThrow(() -> new RuntimeException("Not Found"));
    }
}
