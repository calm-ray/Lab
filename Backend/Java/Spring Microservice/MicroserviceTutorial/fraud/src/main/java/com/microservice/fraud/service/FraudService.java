package com.microservice.fraud.service;

import com.microservice.fraud.entity.Fraud;
import com.microservice.fraud.repository.FraudRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudService {

    private final FraudRepository fraudRepository;

    public Boolean isFraudCustomer(Long customerId) {
        Fraud fraud = Fraud.builder()
                .customerId(customerId)
                .isFraudster(false)
                .createdAt(LocalDateTime.now())
                .build();

        fraudRepository.save(fraud);
        return false;
    }
}
