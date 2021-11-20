package com.pb.korotkaya.hw8;

import java.io.PrintStream;

public class WrongPasswordException extends Exception{

    private String errorPassword = "Пароль не подходит! ";

    public WrongPasswordException(String message, String errorPassword){
        super(message);
        this.errorPassword = errorPassword;
    }
    public WrongPasswordException(){}

    public String getErrorPassword(){
        return errorPassword;
    }

}
