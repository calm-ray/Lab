package com.microservice.notification.service;

import com.microservice.client.notification.NotificationRequest;
import com.microservice.notification.entity.Notification;
import com.microservice.notification.repository.NotificationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public void sendNotifications(NotificationRequest notificationRequest) {
        Notification notification = Notification.builder()
                .message(notificationRequest.message())
                .sender("akr")
                .sentAt(LocalDateTime.now())
                .toCustomerEmail(notificationRequest.toCustomerEmail())
                .toCustomerId(notificationRequest.toCustomerId())
                .build();
        notificationRepository.save(notification);
    }
}
