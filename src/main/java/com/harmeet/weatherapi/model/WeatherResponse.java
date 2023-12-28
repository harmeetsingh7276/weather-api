package com.harmeet.weatherapi.model;

import lombok.Data;

@Data
public class WeatherResponse {
    private Location location;
    private Forecast forecast;
}
