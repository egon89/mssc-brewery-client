package com.egon.msscbreweryclient.client;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.client.RestTemplate;

@ConfigurationProperties(prefix = "sfg.brewery")
@RequiredArgsConstructor
public abstract class BreweryClient {
    @Getter
    private String apiHost;

    protected final RestTemplate restTemplate;

    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }
}
