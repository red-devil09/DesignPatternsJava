package org.example.FactoryMethodPattern;

public class VegBurger extends Burger {
    @Override
    void prepare() {
        System.out.println("preparing veggie burger");
    }
}
