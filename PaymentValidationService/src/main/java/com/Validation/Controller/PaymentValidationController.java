package com.Validation.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Validation.PaymentServiceInterface.PaymentServiceinter;
import com.Validation.Pojo.PaymentRequest;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@RequestMapping("/V1/Payments")
@RestController
@Slf4j
@AllArgsConstructor
public class PaymentValidationController {
	
	private PaymentServiceinter paymentServiceinter;

	@PostMapping
	public String createPayment(@Valid @RequestBody PaymentRequest paymentRequest) {
      log.info("Service is created "+paymentServiceinter.processPayment(paymentRequest));
      return paymentServiceinter.processPayment(paymentRequest);
      }
}
