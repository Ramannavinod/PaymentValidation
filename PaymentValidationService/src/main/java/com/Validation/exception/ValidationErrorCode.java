package com.Validation.exception;

public enum ValidationErrorCode {

    ERR_MODE_REQUIRED("20001", "mode is required"),
    ERR_SUCCESS_URL_REQUIRED("20002", "success_url is required"),
    ERR_CANCEL_URL_REQUIRED("20003", "cancel_url is required"),
    ERR_LINE_ITEMS_EMPTY("20004", "line_items cannot be empty"),

    ERR_PRODUCT_NAME_REQUIRED("20005", "productName is required"),
    ERR_CURRENCY_REQUIRED("20006", "currency is required"),
    ERR_UNIT_AMOUNT_REQUIRED("20007", "unitAmount is required"),
    ERR_UNIT_AMOUNT_INVALID("20008", "unitAmount must be greater than 0"),
    ERR_QUANTITY_INVALID("20009", "quantity must be at least 1");

    private final String code;
    private final String message;

    ValidationErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static ValidationErrorCode fromKey(String key) {
        try {
            return ValidationErrorCode.valueOf(key);
        } catch (Exception e) {
            return null;
        }
    }
}
