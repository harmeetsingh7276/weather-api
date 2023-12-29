package com.harmeet.weatherapi.exception;

import com.harmeet.weatherapi.model.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.ResourceAccessException;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<?> handleGenericException(Exception exception) {
        log.error(exception.getMessage());
        ErrorResponse response = new ErrorResponse();
        response.setMessage(exception.getMessage());
        return ResponseEntity.internalServerError().body(response);
    }

    @ExceptionHandler(ResourceAccessException.class)
    @ResponseStatus(HttpStatus.REQUEST_TIMEOUT)
    public ResponseEntity<?> handleResourceAccessException(ResourceAccessException exception) {
        log.error("Unable to connect to RAPID API SERVER");
        ErrorResponse response = new ErrorResponse();
        response.setStatus(HttpStatus.REQUEST_TIMEOUT.toString());
        response.setMessage(exception.getMessage());
        return ResponseEntity.internalServerError().body(response);
    }
}
