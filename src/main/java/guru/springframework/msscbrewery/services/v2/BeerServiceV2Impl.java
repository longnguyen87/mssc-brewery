package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import guru.springframework.msscbrewery.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BeerServiceV2Impl implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(beerId)
                .beerName(RandomStringUtils.randomAlphabetic(5))
                .beerStyle(BeerStyleEnum.IPA)
                .build();
    }

    @Override
    public BeerDtoV2 saveBeer(BeerDtoV2 beerDtoV2) {
        log.debug("Save beer:" + beerDtoV2.toString());
        return BeerDtoV2.builder()
                .id(beerDtoV2.getId())
                .beerStyle(beerDtoV2.getBeerStyle())
                .beerName(beerDtoV2.getBeerName())
                .build();
    }

    @Override
    public void updateBeerById(UUID beerID, BeerDtoV2 beerDtoV2) {
        log.debug("Update beer by ID: " + beerID);
    }

    @Override
    public void deleteBeerById(UUID beerId) {
        log.debug("Delete beer by id: "+ beerId);
    }
}
