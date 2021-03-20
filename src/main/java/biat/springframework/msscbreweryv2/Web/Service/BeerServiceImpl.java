package biat.springframework.msscbreweryv2.Web.Service;

import biat.springframework.msscbreweryv2.Web.Model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Slf4j
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

    @Override
    public void deleteByid(UUID beerId) {
        System.out.println("delete beer");
        log.debug("deleting a Beer.......");
    }
}


