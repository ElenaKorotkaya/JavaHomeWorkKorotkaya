package com.pb.korotkaya.hw7;

public class Skirt extends Clothes implements WomanClothes{

    Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Skirt, " + clothesSize + " (" + clothesSize.getEuroSize() + ") " + clothesSize.getDescription()
                + " Price: " + price + " USD." + " Color: " + color + ".");
    }
}
