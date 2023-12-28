package com.harmeet.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Wind {
    private String unit;
    private String direction;
    private Double avg;
    private Double min;
    private Double max;
    private String text;
    @JsonProperty("significationWind")
    private boolean significationWind;
    private Gusts gusts;
}
