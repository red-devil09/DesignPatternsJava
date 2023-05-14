package org.example.ChainOfResponsibility.Way2;

public class Clinet {
    public static void main(String[] args) {
        DataBase db  = new DataBase();
        Handler userExisthandler = new UserExistsHandler(db);
        userExisthandler.setNextHandler(new ValidPassHandler(db));


        userExisthandler.handle("sgdsdg","sgdsg");

    }
}
