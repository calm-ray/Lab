package com.microservice.notification.messaging;

import com.microservice.client.notification.NotificationRequest;
import com.microservice.notification.service.NotificationService;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RabbitMQConsumer {
    private final NotificationService notificationService;
    @RabbitListener(queues = "myQueue")
    public void consume(NotificationRequest notificationRequest) {
        notificationService.sendNotifications(notificationRequest);
    }
}
