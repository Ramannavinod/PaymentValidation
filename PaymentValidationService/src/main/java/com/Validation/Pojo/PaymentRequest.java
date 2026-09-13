package com.Validation.Pojo;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PaymentRequest {

    @Valid
    @NotNull(message = "USER_REQUIRED")
    private User user;

    @Valid
    @NotNull(message = "PAYMENT_REQUIRED")
    private Payment payment;
}