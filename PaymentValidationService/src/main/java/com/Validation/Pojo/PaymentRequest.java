
package com.Validation.Pojo;

import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PaymentRequest {

    @NotBlank(message = "Success URL is required")
    @Pattern(
        regexp = "https?://.*",
        message = "Success URL must be a valid HTTP/HTTPS URL"
    )
    private String successurl;

    @NotBlank(message = "Cancel URL is required")
    @Pattern(
        regexp = "https?://.*",
        message = "Cancel URL must be a valid HTTP/HTTPS URL"
    )
    private String cancelurl;

    @NotBlank(message = "Mode is required")
    @Pattern(
        regexp = "payment",
        message = "Mode must be 'payment'"
    )
    private String mode;

    @NotEmpty(message = "At least one line item is required")
    @Size(max = 100, message = "Maximum 100 line items are allowed")
    @Valid
    private List<LineItem> lineitems;
}
