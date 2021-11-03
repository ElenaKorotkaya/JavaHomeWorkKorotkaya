package com.pb.korotkaya.hw6;

public class Horse extends Animal{

    String horseName;
    String horseVoice;
    String horseFood;
    int horseWeight;

    public Horse(String food, String location, String horseName, int horseWeight) {
        super(food, location);
        this.horseName = horseName;
        this.horseWeight = horseWeight;
        horseVoice = "Иго-го! ";
        horseFood = "сено, овес, воду.";

    }

    @Override
    public void makeNoise(){
        System.out.println(horseName + " говорит " + horseVoice);}

    @Override
    public void eat(){
        System.out.println(horseName + " ест " + horseFood);
    }

    @Override
    public void sleep_action(){ System.out.println("Осторожно! " + horseName + " лягается ногами. ");}

    @Override
    public String toString() {
        return "На прием приглащается " + horseName + location;
    }

    @Override
    public int hashCode() {
        return 4 * horseName.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Horse))
            return false;
        Horse h = (Horse) obj;
        return (this.horseName.equals(h.horseName) && this.horseWeight == h.horseWeight);
    }

    public static void main(String[] args) {

    }
}
