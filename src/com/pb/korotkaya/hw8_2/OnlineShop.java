package com.pb.korotkaya.hw8_2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnlineShop {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Зарегистрируйтесь! ");

        System.out.println("Придумайте логин 5-20 символов. ");
        String login = reader.readLine();

        System.out.println("Придумайте пароль не менее 5 символов. ");
        String password = reader.readLine();
        System.out.println("Продублируйте пароль! ");
        String confirmPassword = reader.readLine();

        Auth auth = new Auth(login, password);

        try {
            auth.signUp(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e1) {
            e1.printStackTrace();
            return;
        }

        System.out.println("Войдите на сайт! ");
        System.out.println("Введите логин! ");
        String log = reader.readLine();
        System.out.println("Введите пароль! ");
        String password2 = reader.readLine();

        try {
            auth.signIn(log, password2);
        } catch (WrongLoginException e2) {
            e2.printStackTrace();
            return;
        }
    }
}

