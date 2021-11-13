package com.pb.korotkaya.hw7;

public class Atelier {
    public static void main(String[] args) {

        Tshort tshort1 = new Tshort(Size.XXS, 300, "black");
        Tshort tshort2 = new Tshort(Size.L, 400, "white");
        Pants pants3 = new Pants(Size.M, 280, "blue");
        Pants pants4 = new Pants(Size.XS, 600, "brown");
        Skirt skirt5 = new Skirt(Size.S, 200, "red");
        Skirt skirt6 = new Skirt(Size.M, 300, "grey");
        Tie tie7 = new Tie(Size.L, 150, "black");
        Tie tie8 = new Tie(Size.XS, 100, "blue");

        Clothes[] clothes = {tshort1, tshort2, pants3, pants4, skirt5, skirt6, tie7, tie8};

        System.out.println("Men's clothing: ");
        dressMan(clothes);

        System.out.println();

        System.out.println("Women's clothing: ");
        dressWoman(clothes);
    }

    static void dressMan(Clothes[] clothes) {
        for (Clothes x : clothes) {
            if (x instanceof ManClothes) {
               ((ManClothes) x).dressMan();
            }

        }
    }
    static void dressWoman(Clothes[] clothes){
        for (Clothes x : clothes){
           if(x instanceof  WomanClothes){
                ((WomanClothes) x).dressWoman();
                }
            }
        }
}

        /*
        static void dressWoman(Clothes[] clothes){
            for (Clothes x : clothes){
                if(x instanceof  WomanClothes){
                    System.out.println(new StringBuilder().append(x.clothesSize).append(" (").append(x.clothesSize.getEuroSize()).append(") ").append(x.clothesSize.getDescription()).append("Price: ").append(x.price).append(" USD.").append(" Color: ").append(x.color).toString());
                }
            }
        }
        */