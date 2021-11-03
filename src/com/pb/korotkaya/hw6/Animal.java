package com.pb.korotkaya.hw6;

public abstract class Animal {

    String food;
    String location;

    public Animal(String food, String location){
        this.food = food;
        this.location = location;
    }

    void makeNoise(){
        System.out.println("Животное подает голос! ");
    }

    void eat(){
        System.out.println("Животное ест. ");
    }

    void sleep_action(){
        System.out.println("Животное спит. ");
        System.out.println("Животное бодрствует. ");
    }

    public static void main(String[] args) {
    }

}
