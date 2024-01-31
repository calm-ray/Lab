package com.microservice.fraud.repository;

import com.microservice.fraud.entity.Fraud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudRepository extends JpaRepository<Fraud, Long> {
}
