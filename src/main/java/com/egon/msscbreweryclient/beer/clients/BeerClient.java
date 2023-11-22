package com.egon.msscbreweryclient.beer.clients;

import com.egon.msscbreweryclient.beer.dtos.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Component
@ConfigurationProperties(prefix = "sfg.brewery", ignoreUnknownFields = false)
@RequiredArgsConstructor
public class BeerClient {
    public final String BEER_PATH_V1 = "/api/v1/beer";
    private String apiHost;

    private final RestTemplate restTemplate;

    public BeerDto getById(UUID id) {
        return null;
    }

    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }
}
