package SBoot.SpringDocker.item.sevice;

import SBoot.SpringDocker.item.entity.Cart;
import SBoot.SpringDocker.item.rpository.CartRepository;
import SBoot.SpringDocker.item.rpository.ItemRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
class CartService {
    Mono<Cart> addToCart(String cartId, String id) {
        return null;
    }
//    private final ItemRepository itemRepository;
//    private final CartRepository cartRepository;
////
////    CartService(ItemRepository itemRepository,CartRepository cartRepository){
////        this.itemRepository = itemRepository;
////        this.cartRepository = cartRepository;
////    }
////    Mono<Cart> addToCart(String cartId, String id){
////        return this.cartRepository.findById(cartId).
////                defaultIfEmpty(new Cart(cartId)).
////                flatMap(cart -> cart.getCartItems().stream())
////    }
}
