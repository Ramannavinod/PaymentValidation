package com.Validation.Pojo;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class LineItem {

    @NotNull(message = "QUANTITY_REQUIRED")
    @Positive(message = "QUANTITY_INVALID")
    private Integer quantity;


    @NotBlank(message = "PRODUCT_NAME_REQUIRED")
    private String productName;


    @NotBlank(message = "CURRENCY_REQUIRED")
    @Pattern(
        regexp = "[A-Z]{3}",
        message = "CURRENCY_INVALID"
    )
    private String currency;


    @NotNull(message = "UNIT_AMOUNT_REQUIRED")
    @DecimalMin(
        value = "0.01",
        message = "UNIT_AMOUNT_INVALID"
    )
    private BigDecimal unitAmount;
}