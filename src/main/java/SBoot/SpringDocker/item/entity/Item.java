package SBoot.SpringDocker.item.entity;

import lombok.Data;


@Data
public class Item {
    private String id;
    private String name;
    private  double price;

    //private Item(){}
    Item(String name, double price){
        this.name = name;
        this.price = price;
    }

}
