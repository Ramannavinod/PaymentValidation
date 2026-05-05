package com.Validation.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Validation.pojo.PaymentRequest;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("v1/payment")
@Slf4j
public class PaymentController {
	
	@PostMapping
	public String payment(@Valid @RequestBody PaymentRequest paymentRequest) {
		log.info("Received payment request: {}", paymentRequest);
		return "Payment API is working fine"+paymentRequest;
	}

}
