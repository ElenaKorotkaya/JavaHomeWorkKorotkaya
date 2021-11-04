package com.pb.korotkaya.hw6_1;

public class Cat extends Animal {
    String catName;
    String catVoice;
    int catWeight;

    public Cat(String catName, int catWeight, String location) {
        this.catName = catName;
        this.catWeight = catWeight;
        catVoice = "Мяу! ";
        this.food = " рыбу, молоко.";
        this.location = location;
    }
    @Override
    public void makeNoise(){
        System.out.println(catName + " говорит " + catVoice);
    }

    @Override
    public void eat(){
        System.out.println(catName + " ест " + food);
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

    /*
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Cat))
            return false;
        Cat c = (Cat) obj;
        return (this.catName.equals(c.catName) && this.catWeight == c.catWeight);
    }
     */

}
