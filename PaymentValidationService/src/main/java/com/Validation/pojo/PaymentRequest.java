package com.Validation.pojo;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

@Data
public class PaymentRequest {

    @NotBlank(message = "ERR_MODE_REQUIRED")
    private String mode;

    @NotBlank(message = "ERR_SUCCESS_URL_REQUIRED")
    @JsonProperty("success_url")
    private String successUrl;

    @NotBlank(message = "ERR_CANCEL_URL_REQUIRED")
    @JsonProperty("cancel_url")
    private String cancelUrl;

    @NotEmpty(message = "ERR_LINE_ITEMS_EMPTY")
    @Valid
    @JsonProperty("line_items")
    private List<LineItem> lineItems;
}