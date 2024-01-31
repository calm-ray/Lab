package com.microservice.client.fraud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        value = "fraud"
)
public interface FraudClient {
    @GetMapping(path = "api/v1/fraud/{customerId}")
    public FraudResponse isFraudCustomer(@PathVariable("customerId") Long customerId);
}
