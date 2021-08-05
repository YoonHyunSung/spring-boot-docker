package SBoot.SpringDocker.dish;

import reactor.core.publisher.Flux;

/**
 *Futre 의리턴타입은 scalar 이다
 * Flux의 리턴타입은 Vetor이다.
 * just()를 통해 비동기적으로 제공한다
 */

public class KitchenService1 {

    Flux<Dish1> getDishes(){
        return Flux.just(
                new Dish1("Sesame chicken"), //
                new Dish1("Lo mein noodles, plain"), //
                new Dish1("Sweet & sour beef"));

    }
}
