package com.pb.korotkaya.hw7;

public class Pants extends Clothes implements ManClothes, WomanClothes{

    String sex;

    Pants(Size size, int price, String color) {

        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Pants, " + clothesSize + " (" + clothesSize.getEuroSize() + ") " + clothesSize.getDescription()
                + " Price: " + price + " USD." + " Color: " + color + ".");
    }

    @Override
    public void dressWoman() {
        System.out.println("Pants, " + clothesSize + " (" + clothesSize.getEuroSize() + ") " + clothesSize.getDescription()
                + " Price: " + price + " USD." + " Color: " + color + ".");
    }
}
