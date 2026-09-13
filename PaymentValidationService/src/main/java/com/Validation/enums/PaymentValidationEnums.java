package com.Validation.enums;

public enum PaymentValidationEnums {

    // ==============================
    // Payment URL validations
    // ==============================

    SUCCESS_URL_REQUIRED(
        "10001",
        "Success URL is required"
    ),

    SUCCESS_URL_INVALID(
        "10002",
        "Success URL must be a valid HTTP/HTTPS URL"
    ),

    CANCEL_URL_REQUIRED(
        "10003",
        "Cancel URL is required"
    ),

    CANCEL_URL_INVALID(
        "10004",
        "Cancel URL must be a valid HTTP/HTTPS URL"
    ),


    // ==============================
    // Payment validations
    // ==============================

    MODE_REQUIRED(
        "10005",
        "Mode is required"
    ),

    MODE_INVALID(
        "10006",
        "Mode must be 'payment'"
    ),

    LINE_ITEMS_REQUIRED(
        "10007",
        "At least one line item is required"
    ),

    LINE_ITEMS_LIMIT(
        "10008",
        "Maximum 100 line items are allowed"
    ),

    QUANTITY_REQUIRED(
        "10009",
        "Quantity is required"
    ),

    QUANTITY_INVALID(
        "10010",
        "Quantity must be greater than 0"
    ),

    PRODUCT_NAME_REQUIRED(
        "10011",
        "Product name is required"
    ),

    CURRENCY_REQUIRED(
        "10012",
        "Currency is required"
    ),

    CURRENCY_INVALID(
        "10013",
        "Currency must be a 3-letter uppercase currency code"
    ),

    UNIT_AMOUNT_REQUIRED(
        "10014",
        "Unit amount is required"
    ),

    UNIT_AMOUNT_INVALID(
        "10015",
        "Unit amount must be greater than 0"
    ),


    // ==============================
    // Root validations
    // ==============================

    USER_REQUIRED(
        "10016",
        "User information is required"
    ),

    PAYMENT_REQUIRED(
        "10017",
        "Payment information is required"
    ),


    // ==============================
    // User validations
    // ==============================

    END_USER_ID_REQUIRED(
        "10018",
        "End user ID is required"
    ),

    FIRST_NAME_REQUIRED(
        "10019",
        "First name is required"
    ),

    LAST_NAME_REQUIRED(
        "10020",
        "Last name is required"
    ),

    EMAIL_REQUIRED(
        "10021",
        "Email is required"
    ),

    EMAIL_INVALID(
        "10022",
        "Email must be a valid email address"
    ),

    MOBILE_PHONE_REQUIRED(
        "10023",
        "Mobile phone is required"
    ),

    MOBILE_PHONE_INVALID(
        "10024",
        "Mobile phone must be a valid phone number"
    ),


    // ==============================
    // Payment field validations
    // ==============================

    PAYMENT_CURRENCY_REQUIRED(
        "10025",
        "Payment currency is required"
    ),

    PAYMENT_CURRENCY_INVALID(
        "10026",
        "Payment currency must be a 3-letter uppercase currency code"
    ),

    PAYMENT_AMOUNT_REQUIRED(
        "10027",
        "Payment amount is required"
    ),

    PAYMENT_AMOUNT_INVALID(
        "10028",
        "Payment amount must be greater than 0"
    ),

    BRAND_NAME_REQUIRED(
        "10029",
        "Brand name is required"
    ),

    LOCALE_REQUIRED(
        "10030",
        "Locale is required"
    ),

    COUNTRY_REQUIRED(
        "10031",
        "Country is required"
    ),

    COUNTRY_INVALID(
        "10032",
        "Country must be a 2-letter uppercase country code"
    ),

    MERCHANT_TXN_REF_REQUIRED(
        "10033",
        "Merchant transaction reference is required"
    ),

    PAYMENT_METHOD_REQUIRED(
        "10034",
        "Payment method is required"
    ),

    PAYMENT_METHOD_INVALID(
        "10035",
        "Payment method must be 'APM'"
    ),

    PROVIDER_REQUIRED(
        "10036",
        "Provider is required"
    ),

    PROVIDER_INVALID(
        "10037",
        "Provider must be 'STRIPE'"
    ),

    PAYMENT_TYPE_REQUIRED(
        "10038",
        "Payment type is required"
    ),

    PAYMENT_TYPE_INVALID(
        "10039",
        "Payment type must be 'SALE'"
    ),


    // ==============================
    // Line Item validations
    // ==============================

    LINE_ITEM_CURRENCY_REQUIRED(
        "10040",
        "Line item currency is required"
    ),

    LINE_ITEM_CURRENCY_INVALID(
        "10041",
        "Line item currency must be a 3-letter uppercase currency code"
    );


    private final String errorCode;

    private final String errorMessage;


    PaymentValidationEnums(
        String errorCode,
        String errorMessage
    ) {
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