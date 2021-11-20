package com.pb.korotkaya.hw8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnlineShop {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Зарегистрируйтесь! ");

        Auth auth = null;
        try {
            System.out.println("Придумайте логин 5-20 символов. ");
            String login = reader.readLine();
            System.out.println("Придумайте пароль не менее 5 символов. ");
            String password = reader.readLine();

            auth = new Auth(login, password);
            auth.signUp(login, password);

        } catch (WrongLoginException e1) {
            e1.printStackTrace();
            e1.getErrorLogin();
        } catch (WrongPasswordException e2) {
            e2.printStackTrace();
            e2.getErrorPassword();
        }

        System.out.println("Войдите на сайт! ");

        try {
            System.out.println("Введите логин! ");
            String login = reader.readLine();
            System.out.println("Введите пароль! ");
            String password = reader.readLine();
            auth.signIn(login, password);
        } catch (WrongLoginException e1) {
            e1.printStackTrace();
            e1.getErrorLogin();
        }
    }
}
