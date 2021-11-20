package com.pb.korotkaya.hw8;

public class Auth {

    String login;
    String password;

    public Auth(String log, String confirmPassword){
        this.login = log;
        this.password = confirmPassword;
    }

    public Auth signUp(String login, String password) throws WrongLoginException, WrongPasswordException {

        if ((!(login == null)) && (!(password == null))) {
            return new Auth(login, password);

        } else { new WrongLoginException();throw new WrongPasswordException();

        }
    }

    public void signIn(String log, String confirmPassword) throws WrongLoginException{
        if(login.equals(log) && password.equals(confirmPassword)){
            System.out.println("Добро пожаловать, " + login);

        } else throw new WrongLoginException();
    }

}

/*
public void signUp() throws WrongLoginException, WrongPasswordException{

        if(!(login == null)){
             ;

        } else throw new WrongLoginException();

        if(!(password == null)){

                //this.password = confirmPassword;

        } else throw new WrongPasswordException();

    }
 */
