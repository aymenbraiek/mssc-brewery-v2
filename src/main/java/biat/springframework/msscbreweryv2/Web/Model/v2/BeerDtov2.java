package biat.springframework.msscbreweryv2.Web.Model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDtov2 {

    private UUID id;
    private String beerName;
    private BeerDtoEnum beerStyle;
    private Long ubc;
}
