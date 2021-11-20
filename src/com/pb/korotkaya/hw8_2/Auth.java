package com.pb.korotkaya.hw8_2;

import java.util.regex.Pattern;

import static java.lang.System.*;

public class Auth {

    String login;
    String password;

    public Auth(String log, String password2){
        this.login = log;
        this.password = password2;
    }
    public  Auth(){
    }

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if(Pattern.matches("[a-zA-Z0-9]{5,20}", login)){
            this.login = login;
        } else {
            throw new WrongLoginException("Логин не соответствует требованиям! ");
        }

        if(!(Pattern.matches("\\w{5,}", password))){
             throw new WrongPasswordException("Пароль не соответствует требованиям! ");
        } else if(!(password.equals(confirmPassword))){
             throw new WrongPasswordException("Введенные пароли не совпадают! ");
        } else {
            this.password = password;
        }
    }

    public void signIn(String log, String password2) throws WrongLoginException {

        if(login.equals(log) && password.equals(password2)) {
            System.out.println(new StringBuilder().append("Добро пожаловать, ").append(login).toString());
            throw new WrongLoginException("Вы ввели неверные данные! ");
        } else {
            throw new WrongLoginException("Вы ввели неверные данные! ");
        }
    }
}
