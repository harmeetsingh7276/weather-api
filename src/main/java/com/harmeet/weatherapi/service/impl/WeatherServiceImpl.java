package com.harmeet.weatherapi.service.impl;

import com.harmeet.weatherapi.constants.Endpoints;
import com.harmeet.weatherapi.helper.RestHelper;
import com.harmeet.weatherapi.model.WeatherResponse;
import com.harmeet.weatherapi.model.WeatherSummaryRequest;
import com.harmeet.weatherapi.service.WeatherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import java.net.URISyntaxException;

@Service
@Slf4j
public class WeatherServiceImpl implements WeatherService {
    @Autowired
    private RestHelper restHelper;

    @Override
    public WeatherResponse getForecastSummary(String city) {
        WeatherResponse response = new WeatherResponse();
        WeatherSummaryRequest request = createWeatherSummaryRequestObject(city);
        String apiEndpoint = String.format(Endpoints.RapidApiGetForecastSummaryByLocationName, city);
        try {
            response = restHelper.get(apiEndpoint, request, WeatherResponse.class);
        } catch (ResourceAccessException e) {
            log.error("Unable to connect to RAPID API SERVER");
        }
        return response;
    }

    private WeatherSummaryRequest createWeatherSummaryRequestObject(String city) {
        WeatherSummaryRequest request = new WeatherSummaryRequest();
        request.setLocationName(city);
        return request;
    }
}
