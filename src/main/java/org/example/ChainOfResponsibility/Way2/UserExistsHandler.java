package org.example.ChainOfResponsibility.Way2;

public class UserExistsHandler extends Handler{

    private DataBase dataBase;

    public UserExistsHandler(DataBase dataBase){
        this.dataBase = dataBase;
    }

    @Override
    public boolean handle(String username, String pass) {
        if(true){
            System.out.println("checking user existing");
        }
        return handleNext(username,pass);
    }
}
