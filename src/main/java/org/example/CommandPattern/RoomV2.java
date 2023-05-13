package org.example.CommandPattern;

public class RoomV2 {
    Command command;

    public RoomV2(){

    }

    void setCommand(Command command){
        this.command =  command;
    }

    public void executeCommand(){
        command.execute();
    }
}
