package SBoot.SpringDocker.dish;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class RestaurantCotroller {
    private final KitchenService kitchen;
    @GetMapping(value ="/dishes", produces = "application/json; charset=utf8")
    Flux<Dish> serveDishes(){
        return kitchen.getDishes();
    }
}
