package com.Validation.GlobalException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.Validation.PaymentValidationServiceApplication;
import com.Validation.enums.PaymentValidationEnums;

import lombok.extern.slf4j.Slf4j;


@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationException(
            MethodArgumentNotValidException ex) {

        String validationKey = ex.getBindingResult()
                .getFieldErrors()
                .get(0)
                .getDefaultMessage();

        PaymentValidationEnums error =
                PaymentValidationEnums.fromName(validationKey);

        ErrorResponse response = new ErrorResponse(
                error.getErrorCode(),
                error.getErrorMessage()
        );
        log.info("ErrorResponse:"+response);

        return ResponseEntity.badRequest().body(response);
    }
}