package com.pb.korotkaya.hw8_2;

public class WrongLoginException extends Exception{


        //private String errorLogin = "Логин не подходит! ";

        public WrongLoginException(String message){
            super(message);
        //    this.errorLogin = errorLogin;
        }
        public WrongLoginException(){}

        //public String getErrorLogin(){return errorLogin;}

}
