package org.example.FactoryMethodPattern;

public class EggBurger extends Burger{
    @Override
    void prepare() {
        System.out.println("prepare egg burger");
    }
}
