package com.harmeet.weatherapi.model;

import lombok.Data;

@Data
public class Location {
    private String code;
    private String name;
    private String timezone;
    private Coordinates coordinates;
}
