package org.example.CommandPattern;

public class Intuition {
    /**
     * we want to switch on a Light oe we can we want to call a method of an object, from  multiple places
     */
}

class Light{
    private boolean switchedOn;

    boolean isSwithcedOn(){
        return this.switchedOn;
    }

    /**
     *we want to call this method, but it is happening that, it will be called from multiple places
     * as different rooms will have a light
     */
    void setSwitchedOn(boolean switchedOn){
        this.switchedOn = switchedOn;
    }
}

/**
 * as switching a light will happen for every room, hence we write this in base class(Room)
 */
class Room{
    Light light;

    public Room(){
        this.light = new Light();
    }

    void switchLight(){
        //toggling the light behavior
        light.setSwitchedOn(!light.isSwithcedOn());
    }
}

class LivingRoom extends Room{

}

class Bathroom extends Room{

}

class Client{
    public static void main(String[] args) {
        /**
         * this way we can switch light
         *
         * the flaw here is, any change made to base class light behaviour will reflect in every child class
         * suppose bathroom don't have the facility of switching light, violates Open-closed principle
         *
         * so to tackle this, we move "light switching" logic from Room baseclass to Light class,
         * hence jisko light switch krna hai, will compose Light class in its attribute
         *
         * but here also 1 problem remains, that ant class who wants to switch light has to contain light object,
         * and need to call that, so several classes will call this logic, hence violates SRP
         *
         * hence we need command pattern:
         * as upar several classes has to call a method on Light object, so all of those will have same code i.e.
         *
         * Light light;
         *
         * light.switchLight();
         *
         * so we will take out this code in a separate class
         */
        Room livingRoom = new LivingRoom();
        livingRoom.switchLight();
    }
}
