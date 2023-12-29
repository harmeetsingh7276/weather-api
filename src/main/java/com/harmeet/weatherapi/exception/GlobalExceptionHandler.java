package com.harmeet.weatherapi.exception;

import com.harmeet.weatherapi.model.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<?> handleGenericException(Exception exception) {
        log.error(exception.getMessage());
        ErrorResponse response = new ErrorResponse();
//        response.setStatus(HttpStatus.NOT_FOUND.toString());
        response.setMessage(exception.getMessage());
        return ResponseEntity.internalServerError().body(response);
    }
}
