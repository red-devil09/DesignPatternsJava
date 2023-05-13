package org.example.CommandPattern;

public class LightV2 {
    boolean switchedOn;

    boolean isSwitchedOn(){
        return switchedOn;
    }

    void switchLight(){
        System.out.println("Switching lights in Lights class");
        switchedOn = !switchedOn;
    }
}
