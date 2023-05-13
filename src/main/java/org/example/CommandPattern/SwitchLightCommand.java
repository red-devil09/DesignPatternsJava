package org.example.CommandPattern;

public class SwitchLightCommand implements Command{
    /**
     * ye hai vo code jo hmari hr ek class mei present tha, isko bahar
     * nikal dia as a concrete command
     *
     * hence baaki classes fir ab command ko hold kregi thats it
     */
    LightV2 light;

    public SwitchLightCommand(LightV2 light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchLight();
    }
}
