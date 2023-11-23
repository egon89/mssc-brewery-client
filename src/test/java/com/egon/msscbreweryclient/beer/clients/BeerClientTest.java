package com.egon.msscbreweryclient.beer.clients;

import com.egon.msscbreweryclient.beer.dtos.BeerDto;
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

    @Test
    void shouldCallSave() {
        var result = client.save(BeerDto.builder().name("Beer 1").build());

        assertNotNull(result);
    }

    @Test
    void shouldCallUpdate() {
        var id = UUID.randomUUID();
        client.update(id,
                BeerDto.builder()
                        .id(id)
                        .name("Beer 2")
                        .style("Style 2")
                        .build());
    }

    @Test
    void shouldCallDelete() {
        client.delete(UUID.randomUUID());
    }
}