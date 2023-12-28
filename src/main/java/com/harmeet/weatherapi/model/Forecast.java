package com.harmeet.weatherapi.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Forecast {
    private List<ForecastDetails> items;
    private Date forecastDate;
    private Date nextUpdate;
    private String source;
    private String point;
    private String fingerprint;
}
