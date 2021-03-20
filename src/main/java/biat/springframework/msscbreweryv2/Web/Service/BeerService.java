package biat.springframework.msscbreweryv2.Web.Service;

import biat.springframework.msscbreweryv2.Web.Model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);
}
