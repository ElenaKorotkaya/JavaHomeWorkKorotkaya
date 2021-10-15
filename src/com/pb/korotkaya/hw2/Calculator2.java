package com.pb.korotkaya.hw2;

import java.util.Scanner;

public class Calculator2 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число. ");
        int operand1 = in.nextInt();

        System.out.println("Введите знак. ");
        String sign = in.next();

        System.out.println("Введите число." );
        int operand2 = in.nextInt();

        int result = 0;
        switch (sign){
            case "+":
                result = operand1+operand2;
                System.out.println("Ответ " + result);
                break;
            case "-":
                result = operand1-operand2;
                System.out.println("Ответ " + result);
                break;
            case "*":
                result = operand1*operand2;
                System.out.println("Ответ " + result);
                break;
            case "/":
                if(operand2 ==0) {
                    System.out.println("На 0 делить нельзя. ");
                    break;
                } else { result = operand1/operand2;
                    System.out.println("Ответ " + result);
                    break;
                }
            default:
                throw new IllegalStateException("Unexpected value: " + sign);
        }
    }


}
