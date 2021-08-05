package SBoot.SpringDocker.dish;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class SimpleServer {
    private final KitchenService1 kitchen;
    Flux<Dish1> doingMyjob(){
        return this.kitchen.getDishes().map(dish -> Dish1.deliver(dish));
    }

}
