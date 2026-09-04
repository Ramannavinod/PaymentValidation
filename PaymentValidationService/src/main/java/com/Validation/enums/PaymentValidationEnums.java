package com.Validation.enums;

public enum PaymentValidationEnums {

	SUCCESS_URL_REQUIRED("10001","Success URL is required"),
	SUCCESS_URL_INVALID("10002","Success URL must be a valid HTTP/HTTPS URL"),
	CANCEL_URL_REQUIRED("10003","Cancel URL is required"),
	CANCEL_URL_INVALID("10004","Cancel URL must be a valid HTTP/HTTPS URL"),
	MODE_REQUIRED("10005","Mode is required"),
	MODE_INVALID("10006","Mode must be 'payment'"),
	LINE_ITEMS_REQUIRED("10007","At least one line item is required"),
	LINE_ITEMS_LIMIT("10008","Maximum 100 line items are allowed"),
	QUANTITY_REQUIRED("10009","Quantity is required"),
	QUANTITY_INVALID("10010","Quantity must be greater than 0"),
	PRODUCT_NAME_REQUIRED("10011","Product name is required"),
	CURRENCY_REQUIRED("10012","Currency is required"),
	CURRENCY_INVALID("10013","Currency must be a 3-letter uppercase currency code"),
	UNIT_AMOUNT_REQUIRED("10014","Unit amount is required"),
	UNIT_AMOUNT_INVALID("10015","Unit amount must be greater than 0");

    private final String errorCode;
    private final String errorMessage;

    PaymentValidationEnums(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public static PaymentValidationEnums fromName(String name) {
        return PaymentValidationEnums.valueOf(name);
    }

}