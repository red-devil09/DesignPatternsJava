package org.example.ChainOfResponsibility.Way2;

public class ValidPassHandler extends Handler{
    private DataBase dataBase;

    public ValidPassHandler(DataBase dataBase){
        this.dataBase = dataBase;
    }

    @Override
    public boolean handle(String username, String pass) {
        if(true){
            System.out.println("checking valid password");
        }
        return handleNext(username,pass);
    }
}
