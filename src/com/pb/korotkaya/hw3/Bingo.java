package com.pb.korotkaya.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите число от 0 до 100. ");
        System.out.println("У Вас 10 попыток. ");
        System.out.println("Для завершения игры введите: 102. ");

        //String s1 = "END";
        Random random = new Random();
        int x = (int)(Math.random()*101);

        for(int counter = 0; counter < 10; counter++){
            int y = in.nextInt();

            if(y == x) {
                System.out.println("Вы угадали с " + (counter + 1) + " попытки. ");
                break;
            }
            if(y == 102){
                System.out.println("Игра прервана. ");
                break;
            }
            if(y != x) {
                System.out.println("Загаданное число " + (y < x ? "больше. " : "меньше. "));
                continue;
            }
        }

    }
}
