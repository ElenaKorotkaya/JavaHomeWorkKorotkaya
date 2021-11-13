package com.pb.korotkaya.hw7;

public class Tie extends Clothes implements ManClothes{

    Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Tie, " + clothesSize + " (" + clothesSize.getEuroSize() + ") " + clothesSize.getDescription()
                + " Price: " + price + " USD." + " Color: " + color + ".");
    }
}
