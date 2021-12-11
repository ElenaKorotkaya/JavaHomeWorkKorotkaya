package com.pb.korotkaya.hw10;

import java.io.IOException;

public class NumBox <T extends Number> {

    int size, index;
    T [] numbers;

    public NumBox(int size) {
        numbers = (T[]) new Number[size];
    }

    public void add(int index, T num) throws ArrayIndexOutOfBoundsException {
        if(index > numbers.length) { throw new ArrayIndexOutOfBoundsException();
        } else numbers[index] = num;                       //работает и без this
        }

    public T get(int index){
        return numbers[index];
    }          //возвр. число по индексу
    public int getSize(){ return numbers.length;}               //возвр. устан. длину массива

    public int length(){
        int count = 0;
        for(T i : numbers){
            if(!(i == null)){
                count++;
            } else count+=0;
        }
        return count;
    }

    public double average(){
        double average = (sum()/length());
        return average;
    }

    public double sum() {
        double sum = 0.0;
        for(T i : numbers){
            if(i == null){
                sum+=0;
            } else sum+=i.doubleValue();
        }
        return sum;
    }

    public T max(){
        T maX = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i].doubleValue() > maX.doubleValue()) {
                maX = numbers[i];
            }
        }
        return maX;
    }

    public static void main(String[] args) throws IOException {
        NumBox<Integer> objInt = new NumBox<Integer>(5);

        try {
            objInt.add(0, 4);
            objInt.add(1, 7);
            objInt.add(2, 2);
            objInt.add(3, 5);
            objInt.add(4, 3);
            //objInt.add(5, 3);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Массив переполнен! Длина массива  " + objInt.getSize());
            e.printStackTrace();
        }

        System.out.println(objInt.get(3));                 //печатаем элемент индекс 3
        System.out.println(objInt.length());               //печатаем текущее количество элементов
        System.out.println(objInt.sum());                  //печатаем сумму элементов
        System.out.println(objInt.average());              //ПЕЧАТАЕМ СРЕДНЕЕ АРИФМ
        System.out.println(objInt.max());
        System.out.println();

     NumBox<Float> objFloat = new NumBox<>(7);

    try {
        objFloat.add(0, 3.50F);
        objFloat.add(1, 6.50F);
        objFloat.add(2, 7.50F);
        objFloat.add(3, 8.50F);
        objFloat.add(4, 9.50F);
        objFloat.add(5, 4.50F);
        objFloat.add(6, 2.50F);
    } catch (ArrayIndexOutOfBoundsException e2) {
        System.out.println("Массив переполнен! Длина массива  " + objFloat.getSize());
        e2.printStackTrace();
    }

        System.out.println(objFloat.get(3));                 //печатаем элемент индекс 3
        System.out.println(objFloat.length());               //печатаем текущее количество элементов
        System.out.println(objFloat.sum());                  //печатаем сумму элементов
        System.out.println(objFloat.average());
        System.out.println(objFloat.max());



}
}
//public void setNumbers(T[] numbers) {this.numbers = numbers;}

/*

 */
