package com.Validation.Pojo;

import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Payment {

    @NotBlank(message = "PAYMENT_CURRENCY_REQUIRED")
    @Pattern(
        regexp = "^[A-Z]{3}$",
        message = "PAYMENT_CURRENCY_INVALID"
    )
    private String currency;


    @DecimalMin(
        value = "0.01",
        message = "PAYMENT_AMOUNT_INVALID"
    )
    private Integer amount;


    @NotBlank(message = "BRAND_NAME_REQUIRED")
    private String brandName;


    @NotBlank(message = "LOCALE_REQUIRED")
    private String locale;


    @NotBlank(message = "COUNTRY_REQUIRED")
    @Pattern(
        regexp = "^[A-Z]{2}$",
        message = "COUNTRY_INVALID"
    )
    private String country;


    @NotBlank(message = "MERCHANT_TXN_REF_REQUIRED")
    private String merchantTxnRef;


    @NotBlank(message = "PAYMENT_METHOD_REQUIRED")
    @Pattern(
        regexp = "APM",
        message = "PAYMENT_METHOD_INVALID"
    )
    private String paymentMethod;


    @NotBlank(message = "PROVIDER_REQUIRED")
    @Pattern(
        regexp = "STRIPE",
        message = "PROVIDER_INVALID"
    )
    private String provider;


    @NotBlank(message = "PAYMENT_TYPE_REQUIRED")
    @Pattern(
        regexp = "SALE",
        message = "PAYMENT_TYPE_INVALID"
    )
    private String paymentType;


    @NotBlank(message = "SUCCESS_URL_REQUIRED")
    @Pattern(
        regexp = "https?://.*",
        message = "SUCCESS_URL_INVALID"
    )
    private String successUrl;


    @NotBlank(message = "CANCEL_URL_REQUIRED")
    @Pattern(
        regexp = "https?://.*",
        message = "CANCEL_URL_INVALID"
    )
    private String cancelUrl;


    @NotEmpty(message = "LINE_ITEMS_REQUIRED")
    @Size(
        max = 100,
        message = "LINE_ITEMS_LIMIT"
    )
    @Valid
    private List<LineItem> lineItems;
}