package biat.springframework.msscbreweryv2.Web.Service;

import biat.springframework.msscbreweryv2.Web.Model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy cat")
                .beerStyle("Pale pe")
                .build();
    }

}
