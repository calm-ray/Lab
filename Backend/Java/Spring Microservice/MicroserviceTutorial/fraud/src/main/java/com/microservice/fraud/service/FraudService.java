package com.microservice.fraud.service;

import com.microservice.client.fraud.FraudResponse;
import com.microservice.fraud.entity.Fraud;
import com.microservice.fraud.repository.FraudRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudService {

    private final FraudRepository fraudRepository;

    public FraudResponse isFraudCustomer(Long customerId) {
        Fraud fraud = Fraud.builder()
                .customerId(customerId)
                .isFraudster(false)
                .createdAt(LocalDateTime.now())
                .build();

        fraudRepository.save(fraud);
        return new FraudResponse(false);
    }
}
