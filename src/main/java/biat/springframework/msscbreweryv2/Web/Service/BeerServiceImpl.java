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

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();

        }

    @Override
    public void updatebeerId(UUID beerId, BeerDto beerDto) {
        // todo impl -would add a real update Beer
        System.out.println("update beer");


    }
}


