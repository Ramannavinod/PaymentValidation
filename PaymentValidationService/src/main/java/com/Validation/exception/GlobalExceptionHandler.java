package com.Validation.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public List<FieldErrorResponse> handleValidationExceptions(MethodArgumentNotValidException ex) {

        List<FieldErrorResponse> errors = new ArrayList<>();

        ex.getBindingResult().getFieldErrors().forEach(error -> {

            String key = error.getDefaultMessage(); // 🔥 message key

            ValidationErrorCode enumValue = ValidationErrorCode.fromKey(key);

            String code = enumValue != null ? enumValue.getCode() : "9999";
            String message = enumValue != null ? enumValue.getMessage() : key;

            errors.add(new FieldErrorResponse(
                    error.getField(),
                    code,
                    message
            ));
        });

        return errors;
    }
}