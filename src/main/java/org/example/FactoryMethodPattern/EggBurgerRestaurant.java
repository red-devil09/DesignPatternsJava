package org.example.FactoryMethodPattern;

public class EggBurgerRestaurant extends RestaurantV2{
    @Override
    public Burger createBurger() {
        return new EggBurger();
    }
}
