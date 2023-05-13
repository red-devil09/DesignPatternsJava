package org.example.FactoryMethodPattern;

public class Restaurant {
    //this code violates Open-closed principle as in future if more burger comes, then we have to update this class(Restaurant)
    //we might remove veg-burger at all and add chicken burger instead of it. so we should update restaurant class again and again
    //so to solve it, encapsulate what varies : create a burgerFactory
    public Burger orderBurgerV1(String request){
        if(request.equalsIgnoreCase("vegBurger")){
            Burger burger = new VegBurger();
            burger.prepare();
            return burger;
        }
        return null;
    }

    /**
     * SIMPLE FACTORY IDIOM
     * <p>
     * Client -> restaurant
     * Factory -> SimpleBurgerFactory
     * ConcreteProduct -> VegBurger
     * Interface -> Burger
     */
    public Burger orderBurgerV2(String request){
        SimpleBurgerFactory factory = new SimpleBurgerFactory();
        //creating of the burger was a varying step, so we encapsulated it
        Burger burger = factory.createBurger(request);
        burger.prepare();
        return burger;
    }
}
