package org.example.FactoryMethodPattern;

public class ClientV2 {
    public static void main(String[] args) {
        RestaurantV2 restaurant = new EggBurgerRestaurant();
        restaurant.orderBurger();
        //prepare egg burger - output
    }
}
