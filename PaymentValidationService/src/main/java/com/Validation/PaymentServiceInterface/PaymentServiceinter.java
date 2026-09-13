package com.Validation.PaymentServiceInterface;

import org.springframework.stereotype.Service;

import com.Validation.Pojo.PaymentRequest;

@Service
public interface PaymentServiceinter {
	
	String processPayment(PaymentRequest paymentRequest);
}
