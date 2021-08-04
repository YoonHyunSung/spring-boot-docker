package SBoot.SpringDocker.dish;

import reactor.core.publisher.Flux;

/**
 *Futre 의리턴타입은 scalar 이다
 * Flux의 리턴타입은 Vetor이다.
 * just()를 통해 비동기적으로 제공한다
 */

public class KitchenService {

    Flux<Dish> getDishes(){
        return Flux.just(
                new Dish("Sesame chicken"), //
                new Dish("Lo mein noodles, plain"), //
                new Dish("Sweet & sour beef"));

    }
}
