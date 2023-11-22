package com.egon.msscbreweryclient.beer.clients;

import com.egon.msscbreweryclient.beer.dtos.BeerDto;
import com.egon.msscbreweryclient.client.BreweryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Component
public class BeerClient extends BreweryClient {
    public final String BEER_PATH_V1 = "api/v1/beers";

    public BeerClient(RestTemplate restTemplate) {
        super(restTemplate);
    }

    public BeerDto getById(UUID id) {
        return restTemplate.getForObject(String.format("%s/%s", getBeerPath(), id.toString()), BeerDto.class);
    }

    private String getBeerPath() {
        return String.format("%s/%s", getApiHost(), BEER_PATH_V1);
    }
}
