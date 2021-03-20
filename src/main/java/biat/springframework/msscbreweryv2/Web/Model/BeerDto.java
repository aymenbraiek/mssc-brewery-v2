package biat.springframework.msscbreweryv2.Web.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BeerDto {

    private UUID id;

    private String beerName;

    private String beerStyle;

    private Long ubc;
}