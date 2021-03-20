package biat.springframework.msscbreweryv2.Web.Service.v2;

import biat.springframework.msscbreweryv2.Web.Model.BeerDto;
import biat.springframework.msscbreweryv2.Web.Model.v2.BeerDtov2;
import biat.springframework.msscbreweryv2.Web.Service.BeerService;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class BeerServiceV2Imp implements BeerServiceV2 {

    @Override
    public BeerDtov2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDto saveNewBeer(BeerDtov2 beerDtov2) {
        return null;
    }

    @Override
    public void updatebeerId(UUID beerId, BeerDtov2 beerDto) {

    }
}
