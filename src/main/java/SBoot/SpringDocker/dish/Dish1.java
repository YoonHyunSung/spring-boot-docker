package SBoot.SpringDocker.dish;


import lombok.Data;

@Data
class Dish1 {
    private String description;
    private boolean delivered = false;

    Dish1(String description){
        this.description = description;
    }
    public static Dish1 deliver(Dish1 dish){
        Dish1 deliveredDish = new Dish1(dish.description);
        deliveredDish.delivered = true;
        return deliveredDish;

    }

}
