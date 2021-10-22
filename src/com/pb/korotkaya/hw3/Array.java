package com.pb.korotkaya.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        /*
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ", ");
            }
         */

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum+= arr[i];
        }
        System.out.println("Сумма элементов массива = " + sum + ".");

        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0)  ++counter;
        }
        System.out.println("Количество положительных элементов " + (counter) + ".");

        //сортировка

        //int min = arr[0];
            for(int i = 0; i < arr.length-1; i++){
                for(int j = i +1 ; j < arr.length; j++){
                    if(arr[i] > arr[j]){
                        int t = arr[i];
                        arr[i] = arr[j];
                        arr[j] = t;
                    }
                }
            }

        System.out.println(Arrays.toString(arr));

    }
}
