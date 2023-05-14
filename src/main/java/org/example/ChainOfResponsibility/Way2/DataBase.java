package org.example.ChainOfResponsibility.Way2;

import java.util.HashMap;
import java.util.Map;

public class DataBase {

    private final Map<String,String> users;

    public DataBase(){
        users = new HashMap<>();
        users.put("admin_username","admin_password");
        users.put("user_username","user_password");
    }

    public boolean isValidUser(String username){
        return users.containsKey(username);
    }

    public boolean isValidPassword(String username,String pass){
        return users.get(username).equals(pass);
    }
}
