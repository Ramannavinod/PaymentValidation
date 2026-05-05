package com.Validation.pojo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LineItem {

    @Min(value = 1, message = "ERR_QUANTITY_INVALID")
    private int quantity;

    @NotBlank(message = "ERR_PRODUCT_NAME_REQUIRED")
    private String productName;

    @NotBlank(message = "ERR_CURRENCY_REQUIRED")
    private String currency;

    @NotNull(message = "ERR_UNIT_AMOUNT_REQUIRED")
    @Min(value = 1, message = "ERR_UNIT_AMOUNT_INVALID")
    private Long unitAmount;
}