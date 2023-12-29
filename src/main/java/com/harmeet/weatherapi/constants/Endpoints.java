package com.harmeet.weatherapi.constants;

import lombok.Data;

@Data
public class Endpoints {
    public static final String BASE_URL = "https://forecast9.p.rapidapi.com/rapidapi";
    public static final String RAPID_API_GET_FORECAST_SUMMARY_BY_LOCATION_NAME = BASE_URL + "/forecast/%s/summary/";


    public static final String RAPID_API_GET_HOURLY_FORECAST_BY_LOCATION_NAME = BASE_URL + "/forecast/%s/hourly/";
    ;
}
