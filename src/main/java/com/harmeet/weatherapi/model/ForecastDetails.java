package com.harmeet.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ForecastDetails {
    private Date date;
    private Date dateWithTimezone;
    private Double period;
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
    private Double pressure;
    private Double relativeHumidity;
    private Clouds clouds;
    @JsonProperty("isNight")
    private boolean isNight;
}
