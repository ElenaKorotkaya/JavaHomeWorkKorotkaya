package com.pb.korotkaya.hw2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Interval {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        String t = reader.readLine();
        int i = Integer.parseInt(t);

        if (i > -1 && i < 15)
            System.out.println("Число попало в промежуток [0-14]");

        if (i > 14 && i < 36)
            System.out.println("Число попало в промежуток [15-35]");

        if (i > 35 && i < 51)
                System.out.println("Число попало в промежуток [36-50]");

        if (i > 50 && i < 101)
            System.out.println("Число попало в промежуток [51-100]");

        else
            System.out.println("Число не попало ни в один интервал");

    }
}
