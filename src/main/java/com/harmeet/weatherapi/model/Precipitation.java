package com.harmeet.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Precipitation {
    private Double sum;
    private int probability;
    private int sumAsRain;
    @JsonProperty("class")
    private int precipitationClass;
}
