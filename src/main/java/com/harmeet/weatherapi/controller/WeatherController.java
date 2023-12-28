package com.harmeet.weatherapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class WeatherController {
    @GetMapping("/weather/forecast/{city}")
    public ResponseEntity<String> getForecastSummary(@PathVariable String city) {
        return ResponseEntity.ok("Hellow");
    }
}
