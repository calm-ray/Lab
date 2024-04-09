package com.microservice.customer.messaging;

import com.microservice.client.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RabbitMQProducer {
    private final RabbitTemplate customAmqpTemplate;

    public void publish(NotificationRequest payload) {
        System.out.println("going to get published");
        customAmqpTemplate.convertAndSend("myQueue", payload);
    }
}
