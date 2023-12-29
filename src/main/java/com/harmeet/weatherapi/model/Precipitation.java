package com.harmeet.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Precipitation {
    private Double sum;
    private Double probability;
    private Double sumAsRain;
    @JsonProperty("class")
    private int precipitationClass;
}
