package com.Validation.PaymentServiceimpl;

import org.springframework.stereotype.Service;

import com.Validation.PaymentServiceInterface.PaymentServiceinter;
import com.Validation.Pojo.PaymentRequest;

@Service
public class PaymentServiceimpl implements PaymentServiceinter {

	@Override
	public String processPayment(PaymentRequest paymentRequest) {
		return "Payment created successfully in service engine";
	}

}
