package org.example.FactoryMethodPattern;

/**
 * factory method pattern relies heavily on inheritance
 * and we will all together remove dependence from Request string to create the type of burger
 *
 *
 */
public abstract class RestaurantV2 {
    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    /**

    * concreate class apne burger khud bnayegi, jo usko chahiye
     * hence we removed dependence from Request object also, and no if-else were introduced
     * so now following SRP and Open-closed Principle as well
    **/
    public abstract Burger createBurger();
}
