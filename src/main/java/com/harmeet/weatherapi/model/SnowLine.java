package com.harmeet.weatherapi.model;

import lombok.Data;

@Data
public class SnowLine {
    private Double avg;
    private Double min;
    private Double max;
    private String unit;
}
