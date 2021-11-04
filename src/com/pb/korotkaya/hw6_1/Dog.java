package com.pb.korotkaya.hw6_1;

public class Dog extends Animal {
    String dogName;
    String dogVoice;
    int dogWeight;

    public Dog(String dogName, int dogWeight, String location) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
        dogVoice = "Гав! ";
        this.food = "мясо, молоко.";
        this.location = location;
    }
    @Override
    public void makeNoise(){
        System.out.println(dogName + "  говорит " + dogVoice);
    }

    @Override
    public void eat(){
        System.out.println(dogName + " ест " + food);
    }

    @Override
    public void sleep_action(){ System.out.println("Осторожно! " + dogName + " кусает за ногу. ");}

    @Override
    public String toString(){
        return "На прием приглащается " + dogName + location;}

    @Override
    public int hashCode(){
        return 2 * dogName.hashCode();
    }

    /*
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Dog))
            return false;
        Dog d = (Dog) obj;
            return (this.dogName.equals(d.dogName) && this.dogWeight == d.dogWeight);
    }
     */

}
