package SBoot.SpringDocker.item.rpository;

import SBoot.SpringDocker.item.entity.Cart;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CartRepository extends ReactiveCrudRepository<Cart, String> {

}
