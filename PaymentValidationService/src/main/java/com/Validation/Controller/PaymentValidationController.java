package com.Validation.Controller;

import java.lang.System.Logger;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Validation.PaymentValidationServiceApplication;
import com.Validation.Pojo.PaymentRequest;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;


@RequestMapping("/V1/Payments")
@RestController
@Slf4j
public class PaymentValidationController {

	@PostMapping
	public String createPayment(@Valid @RequestBody PaymentRequest paymentRequest) {
      log.info("Payment created successfully" +paymentRequest);
		return "Payment created successfully"+paymentRequest;
	}

}
