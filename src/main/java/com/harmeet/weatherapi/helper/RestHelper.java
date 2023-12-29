package com.harmeet.weatherapi.helper;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

@Data
@Component
public class RestHelper {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${rapidapi.key}")
    private String rapidApiKey; //"2a3089207bmsh984f31de5c5b40fp1844b8jsnc694caa00828";
    @Value("${rapidapi.host}")
    private String rapidApiHost ;

    public <T> T get(String apiEndpoint, Object entity, Class<T> responseType) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
//        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("X-RapidAPI-Key", rapidApiKey);
        headers.set("X-RapidAPI-Host", rapidApiHost);
        HttpEntity<Object> httpEntity = new HttpEntity<>(entity, headers);
        ResponseEntity<T> responseEntity = restTemplate.exchange(apiEndpoint, HttpMethod.GET, httpEntity, responseType);
        return responseEntity.getBody();
    }

    public Object post(String apiEndpoint, Object entity, Object cls) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        headers.set("X-RapidAPI-Key", rapidApiKey);
        headers.set("X-RapidAPI-Host", rapidApiHost);
        HttpEntity<Object> httpEntity = new HttpEntity<>(entity, headers);
        return restTemplate.exchange(apiEndpoint, HttpMethod.POST, httpEntity, cls.getClass()).getBody();
    }
}
