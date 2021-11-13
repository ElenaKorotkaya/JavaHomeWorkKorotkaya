package com.pb.korotkaya.hw7;

public abstract class Clothes{

    Size clothesSize;
    int price;
    String color;

    Clothes(Size size, int price, String color){
        clothesSize = size;
        this.price = price;
        this.color = color;
    }
}
