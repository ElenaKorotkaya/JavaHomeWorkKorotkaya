package com.pb.korotkaya.hw4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку. ");
        String a = scanner.nextLine();
        System.out.println("Введите строку для сравнения. ");
        String b = scanner.nextLine();
         String a1 = delNoDigOrLet(a);
         String b1 = delNoDigOrLet(b);

         //System.out.println(a1);
         //System.out.println(b1);

        System.out.println(isAnagram(a1, b1));


    }
    static String delNoDigOrLet(String s) {
        StringBuilder sb = new StringBuilder();

        String s1 = s.toLowerCase(Locale.ROOT);

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s1.charAt(i)))
                sb.append(s1.charAt(i));
        }
        return sb.toString();
    }
    static boolean isAnagram(String a1, String b1){

        char[] a2 = a1.toCharArray();
        char[] b2 = b1.toCharArray();

        Arrays.sort(a2);
        Arrays.sort(b2);

        String x = new String(a2), y = new String(b2);
        return x.equals(y);
    }
}
