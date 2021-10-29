package com.pb.korotkaya.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CapitalLetter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку.");
        String s = reader.readLine();
        //System.out.println(s);

        toTitleCase(s);
    }
   static String toTitleCase(String s) {
        String[] words = s.split(" ");
        for(String word : words) {

            //System.out.println(word);

            String s1 = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();

            System.out.print(s1 + " ");

            /* String.join(separator, word); */
            }
        return s;
    }
}

