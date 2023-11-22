package com.egon.msscbreweryclient.beer.clients;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BeerClientTest {

    @Autowired
    BeerClient client;

    @Test
    void shouldCallGetById() {
        var result = client.getById(UUID.randomUUID());
        assertNotNull(result);
    }
}