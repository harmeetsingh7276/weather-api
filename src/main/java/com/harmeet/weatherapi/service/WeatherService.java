package com.harmeet.weatherapi.service;

import com.harmeet.weatherapi.model.WeatherResponse;
import org.springframework.stereotype.Service;

@Service
public interface WeatherService {
    WeatherResponse getForecastSummary(String city);

    WeatherResponse getHourlyForecastSummary(String city);
}
