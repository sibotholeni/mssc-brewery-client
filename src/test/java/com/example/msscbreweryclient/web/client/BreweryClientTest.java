package com.example.msscbreweryclient.web.client;

import static org.junit.jupiter.api.Assertions.*;

import com.example.msscbreweryclient.web.model.BeerDto;
import java.net.URI;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BreweryClientTest {

  @Autowired
  BreweryClient client;

  @Test
  void getBeerById() {
    BeerDto dto = client.getBeerById(UUID.randomUUID());
    assertNotNull(dto);
  }

  @Test
  void testSaveNewBeer() {
    BeerDto beerDto = BeerDto.builder().beerName("New Beer").build();
    URI uri = client.saveNewBeer(beerDto);
    assertNotNull(uri);
    System.out.println(uri.toString());
  }
}
