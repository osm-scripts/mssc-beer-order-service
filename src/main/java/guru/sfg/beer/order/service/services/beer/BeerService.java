package guru.sfg.beer.order.service.services.beer;

import guru.sfg.beer.order.service.web.model.BeerDto;

import java.util.Optional;
import java.util.UUID;

/**
 * @Author mustola
 * Since 04/05/2023
 **/
public interface BeerService {

    Optional<BeerDto> getBeerById(UUID uuid);
    Optional<BeerDto> getBeerByUpc(String upc);
}
