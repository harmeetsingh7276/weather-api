package com.harmeet.weatherapi.model;

import lombok.Data;

import java.util.Date;

@Data
public class ForecastDetails {
    private Date date;
    private Date dateWithTimezone;
    private int freshSnow;
    private int snowHeight;
    private Weather weather;
    private Precipitation precipitation;
    private Double sunHours;
    private Double rainHours;
    private Temperature temperature;
    private Wind wind;
    private WindChill windChill;
    private SnowLine snowLine;
    private Astronomy astronomy;
}
