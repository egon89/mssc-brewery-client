package com.egon.msscbreweryclient.beer.clients;

import com.egon.msscbreweryclient.beer.dtos.BeerDto;
import com.egon.msscbreweryclient.client.BreweryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.UUID;

@Component
public class BeerClient extends BreweryClient {
    public final String BEER_PATH_V1 = "api/v1/beers";

    public BeerClient(RestTemplate restTemplate) {
        super(restTemplate);
    }

    public BeerDto getById(UUID id) {
        return restTemplate.getForObject(getBeerPath(id), BeerDto.class);
    }

    public URI save(BeerDto beerDto) {
        return restTemplate.postForLocation(getBeerPath(), beerDto);
    }

    public void update(UUID id, BeerDto beerDto) {
        restTemplate.put(getBeerPath(id), beerDto);
    }

    public void delete(UUID id) {
        restTemplate.delete(getBeerPath(id));
    }

    private String getBeerPath(UUID id) {
        return String.format("%s/%s", getBeerPath(), id.toString());
    }

    private String getBeerPath() {
        return String.format("%s/%s", getApiHost(), BEER_PATH_V1);
    }
}
