package org.example.CommandPattern;

public class ClientV2 {
    public static void main(String[] args) {
        RoomV2 livingRoom = new LivingRoomV2();
        LightV2 lightV2 = new LightV2();
        Command switchLightCommand = new SwitchLightCommand(lightV2);

        /**
         * setter injection to hoga hi
         *
         *
         * this main is the client
         *
         * Command is the interface
         * SwitchLightCommand is the concrete command
         * Light is the receiver
         * RoomV2 is the invoker
         *
         * command se pehle picture mei sirf Light and RoomV2 thee
         * and jo bhi class ko light on krni hai, usko Light ki dependency injection chahiye
         * ab uss class ko sirf Command chahiye
         */
        livingRoom.setCommand(switchLightCommand);
        livingRoom.executeCommand();
    }
}
