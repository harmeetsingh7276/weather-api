package com.harmeet.weatherapi.controller;

import com.harmeet.weatherapi.model.WeatherResponse;
import com.harmeet.weatherapi.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather/forecast/{city}")
    public ResponseEntity<WeatherResponse> getForecastSummary(@PathVariable String city) {
        return ResponseEntity.ok(weatherService.getForecastSummary(city));
    }
}
