package com.microservice.notification.controller;

import com.microservice.client.notification.NotificationRequest;
import com.microservice.notification.service.NotificationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/notification")
@AllArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    @PostMapping
    public void sendNotifications(@RequestBody NotificationRequest notificationRequest) {
        notificationService.sendNotifications(notificationRequest);
    }
}
