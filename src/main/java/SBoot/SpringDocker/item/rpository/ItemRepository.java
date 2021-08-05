package SBoot.SpringDocker.item.rpository;

import SBoot.SpringDocker.item.entity.Item;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ItemRepository extends ReactiveCrudRepository<Item, String > {
    Flux<Item> findByNameContaining(String partialName);
}
