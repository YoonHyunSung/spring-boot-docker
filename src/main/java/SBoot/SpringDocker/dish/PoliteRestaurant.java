package SBoot.SpringDocker.dish;

/**
 * 구독(subscription)을하기 전에 어떤 연산도 일어나 지 않는다.
 *
 */
public class PoliteRestaurant {

    public static void main(String[] args) {
        PoliteServer server =new PoliteServer(new KitchenService());
        server.doingMyJob().subscribe(
                dish -> System.out.println("Consuming"+dish),
                throwable -> System.out.println(throwable)
        );
    }
}
