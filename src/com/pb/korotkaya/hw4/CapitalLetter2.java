package com.pb.korotkaya.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CapitalLetter2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку.");
        String s = reader.readLine();
        //System.out.println(s);

        toTitleCase(s);
    }

    static String toTitleCase(String s) {
        StringBuilder buf = new StringBuilder();
        String result = null;
        String[] words = s.split(" ");
        for (String word : words) {
            //System.out.println(word);                //печатает отдельные слова

            String s1 = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase(); //слова с заглавной буквы

            buf.append(s1);
            buf.append(" ");
            result = buf.toString();                   //в цикле поэтапно объединяет слова и пробелы, в несколько строк
        }
        System.out.println(result);                    //печать целой строки
        return result;
    }
}

