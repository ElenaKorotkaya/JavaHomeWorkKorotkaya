package com.pb.korotkaya.hw8;

import java.io.PrintWriter;

public class WrongLoginException extends Exception{

    private String errorLogin = "Логин не подходит! ";

    public WrongLoginException(String message, String errorLogin){
        super(message);
        this.errorLogin = errorLogin;
    }
    public WrongLoginException(){}

    public String getErrorLogin(){
        return errorLogin;
    }
}
