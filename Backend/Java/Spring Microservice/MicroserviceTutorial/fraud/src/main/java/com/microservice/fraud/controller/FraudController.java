package com.microservice.fraud.controller;

import com.microservice.client.fraud.FraudResponse;
import com.microservice.fraud.service.FraudService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud")
@AllArgsConstructor
public class FraudController {

    private final FraudService fraudService;

    @GetMapping("/{customerId}")
    public FraudResponse isFraudCustomer(@PathVariable("customerId") Long customerId) {
        return fraudService.isFraudCustomer(customerId);
    }

}
