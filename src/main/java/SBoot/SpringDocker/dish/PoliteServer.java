package SBoot.SpringDocker.dish;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Data
public class PoliteServer {
    private final KitchenService kitchen;

    Flux<Dish> doingMyJob(){
        return kitchen.getDishes()
                .doOnNext(dish -> System.out.println("Thank you for"+dish+"!"))
                .doOnError(error-> System.out.println("So sorry about"+error.getMessage()))
                .doOnComplete(()-> System.out.println("Tanks for all your hard work!"))
                .map(Dish::deliver);
    }
}
