package biat.springframework.msscbreweryv2.Web.Controller;

import biat.springframework.msscbreweryv2.Web.Model.BeerDto;
import biat.springframework.msscbreweryv2.Web.Service.BeerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;
@Deprecated //source code it does not include it to your client
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {
    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerId(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping // POST - create new beer
    public ResponseEntity handlePost(@Valid @RequestBody  BeerDto beerDto){

        BeerDto savedDto = beerService.saveNewBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();
        //todo add hostname to url  when creacted new beer back to client URL where it was created
        headers.add("Location", "/api/v1/beer/" + savedDto.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    /* Update beer */
    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId,@Valid @RequestBody BeerDto beerDto) {
        beerService.updatebeerId(beerId, beerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // when method is type void
    public void handleDelete(@PathVariable("beerId") UUID beerId) {
        beerService.deleteByid(beerId);
    }
}
