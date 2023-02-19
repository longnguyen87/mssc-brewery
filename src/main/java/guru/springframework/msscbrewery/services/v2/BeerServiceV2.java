package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveBeer(BeerDtoV2 beerDtoV2);

    void updateBeerById(UUID beerID, BeerDtoV2 beerDtoV2);

    void deleteBeerById(UUID beerId);
}
