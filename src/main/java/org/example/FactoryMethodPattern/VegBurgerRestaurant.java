package org.example.FactoryMethodPattern;

public class VegBurgerRestaurant extends RestaurantV2{
    @Override
    public Burger createBurger() {
        return new VegBurger();
    }
}
