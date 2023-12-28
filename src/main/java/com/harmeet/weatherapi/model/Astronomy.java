package com.harmeet.weatherapi.model;

import lombok.Data;

@Data
public class Astronomy {
    private String dawn;
    private String sunrise;
    private String suntransit;
    private String sunset;
    private String dusk;
    private String moonrise;
    private String moontransit;
    private String moonset;
    private Double moonphase;
    private Double moonzodiac;

}
