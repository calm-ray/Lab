package com.microservice.client.notification;

public record NotificationRequest(String message, Long toCustomerId, String toCustomerEmail) {
}
