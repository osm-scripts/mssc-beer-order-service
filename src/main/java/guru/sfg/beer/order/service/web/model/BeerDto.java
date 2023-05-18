package guru.sfg.beer.order.service.web.model;

import lombok.*;

import java.math.BigDecimal;

/**
 * @Author mustola
 * Since 04/05/2023
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BeerDto extends BaseItem{

    private String beerName;
    private String beerStyle;
    private String upc;
    private BigDecimal price;
}
