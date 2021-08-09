package SBoot.SpringDocker.util;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.apache.kafka.common.protocol.types.Field;

@ToString
@RequiredArgsConstructor
@Getter
class Product{
    private final int productId;
    private final String description;
}

public class ObjectArray {
    public Product[] createCart() {
        Product[] cart = new Product[5];
        String[] productNames = {"Coffe", "Computer", "Apple", "Dress", "Fariy-tale book"};
        int j = 0;

        for (int i = 0; i < cart.length; i++) {
            cart[j] = new Product(i+1, productNames[i]);
            j++;
        }
        return cart;
    }
}