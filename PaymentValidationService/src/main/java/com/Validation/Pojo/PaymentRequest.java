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

    @NotBlank(message = "SUCCESS_URL_REQUIRED")
    @Pattern(
        regexp = "https?://.*",
        message = "SUCCESS_URL_INVALID"
    )
    private String successurl;


    @NotBlank(message = "CANCEL_URL_REQUIRED")
    @Pattern(
        regexp = "https?://.*",
        message = "CANCEL_URL_INVALID"
    )
    private String cancelurl;


    @NotBlank(message = "MODE_REQUIRED")
    @Pattern(
        regexp = "payment",
        message = "MODE_INVALID"
    )
    private String mode;


    @NotEmpty(message = "LINE_ITEMS_REQUIRED")
    @Size(
        max = 100,
        message = "LINE_ITEMS_LIMIT"
    )
    @Valid
    private List<LineItem> lineitems;
}