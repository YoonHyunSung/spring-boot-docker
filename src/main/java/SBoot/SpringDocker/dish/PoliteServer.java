package SBoot.SpringDocker.dish;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
/**
 *
 * 주방장의 인스턴스를 생성자 주입으로 받는다(연관관계)
 * kitchen.getDishes() 알바가 주방에  가서 가져오는 모습이다.
 * 요리가 완성되면 즉시 손님에게 전달한다.. map()
 * Reactiv Consumer 는 다른 Reactive Service 를 호출하고 결과를 변환(transform)한다.
 * 서빙 점원의 역할은 웹컨트롤 이다.
 */

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
