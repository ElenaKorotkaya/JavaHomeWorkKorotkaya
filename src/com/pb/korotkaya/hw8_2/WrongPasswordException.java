package com.pb.korotkaya.hw8_2;

public class WrongPasswordException extends Exception{

        //private String errorPassword = "Пароль не подходит! ";

        public WrongPasswordException(String message){
            super(message);
        //    this.errorPassword = errorPassword;
        }
        public WrongPasswordException(){}

        //public String getErrorPassword(){return errorPassword;}

}
