package com.harmeet.weatherapi.service.impl;

import com.harmeet.weatherapi.constants.Endpoints;
import com.harmeet.weatherapi.helper.RestHelper;
import com.harmeet.weatherapi.model.WeatherResponse;
import com.harmeet.weatherapi.model.WeatherSummaryRequest;
import com.harmeet.weatherapi.service.WeatherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WeatherServiceImpl implements WeatherService {
    @Autowired
    private RestHelper restHelper;

    @Override
    public WeatherResponse getForecastSummary(String city) {
        WeatherSummaryRequest request = createWeatherSummaryRequestObject(city);
        String apiEndpoint = String.format(Endpoints.RAPID_API_GET_FORECAST_SUMMARY_BY_LOCATION_NAME, city);
        return restHelper.get(apiEndpoint, request, WeatherResponse.class);
    }

    private WeatherSummaryRequest createWeatherSummaryRequestObject(String city) {
        WeatherSummaryRequest request = new WeatherSummaryRequest();
        request.setLocationName(city);
        return request;
    }
}
