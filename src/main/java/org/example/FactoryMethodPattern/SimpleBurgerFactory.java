package org.example.FactoryMethodPattern;

public class SimpleBurgerFactory {
    //now this code is atleast separated from restaurant class, if menu changes we only need to open this class
    //this class only creates the burger, not even call prepare method. preparing is the task for Restaurant.

    /**
     *
     * this class is still open for modification of menu
     */
    public Burger createBurger(String request){
        Burger burger = null;
        if("vegBurger".equals(request))
            burger = new VegBurger();

        return burger;
    }
}
