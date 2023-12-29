package com.harmeet.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class ErrorResponse {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;
    private String message;
}
