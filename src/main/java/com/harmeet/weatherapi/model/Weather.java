package com.harmeet.weatherapi.model;

import lombok.Data;

@Data
public class Weather {
    private Double state;
    private String text;
    private String icon;
}
