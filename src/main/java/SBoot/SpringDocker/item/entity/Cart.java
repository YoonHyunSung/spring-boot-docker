package SBoot.SpringDocker.item.entity;

import lombok.Data;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
@Data
public class Cart {
    private @Id String id;
    private List<CartItem> cartItems;

    private Cart(){}
    public Cart(String id, List<CartItem> cartItems){
        this.id = id;
        this.cartItems = cartItems;
    }
    public Cart(String id){
        this(id, new ArrayList<>());
    }
}
