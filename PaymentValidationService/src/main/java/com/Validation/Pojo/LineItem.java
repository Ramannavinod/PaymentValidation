
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

    @NotNull(message = "Quantity is required")
    @Positive(message = "Quantity must be greater than 0")
    private Integer quantity;

    @NotBlank(message = "Product name is required")
    private String productName;

    @NotBlank(message = "Currency is required")
    @Pattern(
        regexp = "[A-Z]{3}",
        message = "Currency must be a 3-letter uppercase currency code"
    )
    private String currency;

    @NotNull(message = "Unit amount is required")
    @DecimalMin(
        value = "0.01",
        message = "Unit amount must be greater than 0"
    )
    private BigDecimal unitAmount;
}