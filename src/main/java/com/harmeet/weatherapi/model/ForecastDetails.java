package com.harmeet.weatherapi.model;

import lombok.Data;

import java.util.Date;

@Data
public class ForecastDetails {
    private Date date;
    private Date dateWithTimezone;
    private Double freshSnow;
    private Double snowHeight;
    private Weather weather;
    private Precipitation prec;
    private Double sunHours;
    private Double rainHours;
    private Temperature temperature;
    private Wind wind;
    private WindChill windChill;
    private SnowLine snowLine;
    private Astronomy astronomy;
}
