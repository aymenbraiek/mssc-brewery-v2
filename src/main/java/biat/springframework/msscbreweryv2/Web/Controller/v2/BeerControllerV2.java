package biat.springframework.msscbreweryv2.Web.Controller.v2;

import biat.springframework.msscbreweryv2.Web.Model.BeerDto;
import biat.springframework.msscbreweryv2.Web.Model.v2.BeerDtoEnum;
import biat.springframework.msscbreweryv2.Web.Model.v2.BeerDtov2;
import biat.springframework.msscbreweryv2.Web.Service.v2.BeerServiceV2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/api/v2/beer")
public class BeerControllerV2 {
    private final BeerServiceV2 beerServiceV2;
@Autowired
    public BeerControllerV2(BeerServiceV2 beerServiceV2) {
        this.beerServiceV2 = beerServiceV2;
    }


    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDtov2> getBeer(@PathVariable("beerId") UUID beerId){

        return new ResponseEntity<>(beerServiceV2.getBeerById(beerId), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity handlePost(@Valid @RequestBody BeerDtov2 beerDtov2) {


            BeerDto savedDto = beerServiceV2.saveNewBeer(beerDtov2);

            HttpHeaders headers = new HttpHeaders();
            //todo add hostname to url  when creacted new beer back to client URL where it was created
            headers.add("Location", "/api/v1/beer/" + savedDto.getId().toString());

            return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId,@Valid @RequestBody BeerDtov2 beerDto) {
        beerServiceV2.updatebeerId(beerId, beerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
