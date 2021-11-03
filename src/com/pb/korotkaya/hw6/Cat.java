package com.pb.korotkaya.hw6;

public class Cat extends Animal{

    String catName;
    String catVoice;
    String catFood;
    int catWeight;

    public Cat(String food, String location, String catName, int catWeight) {
        super(food, location);
        this.catName = catName;
        this.catWeight = catWeight;
        catVoice = "Мяу! ";
        catFood = "рыбу, молоко.";

    }

    @Override
    public void makeNoise(){
        System.out.println(catName + " говорит " + catVoice);
    }

    @Override
    public void eat(){
        System.out.println(catName + " ест " + catFood);
    }

    @Override
    public void sleep_action(){ System.out.println("Осторожно! " + catName + " цепляется в волосы. ");}

    @Override
    public String toString() {
        return "На прием приглащается " + catName + location;
    }

    @Override
    public int hashCode() {
        return 3 * catName.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Cat))
            return false;
        Cat c = (Cat) obj;
        return (this.catName.equals(c.catName) && this.catWeight == c.catWeight);
    }

    public static void main(String[] args) {

    }
}
