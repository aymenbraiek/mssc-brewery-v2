package biat.springframework.msscbreweryv2.Web.Service.v2;

import biat.springframework.msscbreweryv2.Web.Model.BeerDto;
import biat.springframework.msscbreweryv2.Web.Model.v2.BeerDtov2;

import java.util.UUID;

public interface BeerServiceV2 {

    BeerDtov2 getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDtov2 beerDtov2);

    void updatebeerId(UUID beerId, BeerDtov2 beerDto);
}
