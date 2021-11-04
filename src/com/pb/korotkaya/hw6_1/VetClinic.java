package com.pb.korotkaya.hw6_1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class VetClinic {

    public static void main(String[] args) {

        Animal animal1 = new Dog("Шарик ", 5, "(Вольер 1). ");

        Animal animal2 = new Dog("Тобик ", 10, "(Вольер 2). ");

        Animal animal3 = new Cat("Барсик ", 3, "(Кабинка 1). ");

        Animal animal4 = new Cat("Мурзик ", 2, "(Кабинка 2). ");

        Animal animal5 = new Horse("Арамис ", 100, "(Загон 3). ");

        Animal animal6 = new Horse("Партос ", 130, "(Загон 4). ");

        //ПРИГЛАШЕНИЕ НА ПРИЕМ
        Animal[] arr = {animal1, animal2, animal3, animal4, animal5, animal6};
        for(Animal x : arr)
            System.out.println(x.toString());

        //ДЕМОНСТРАЦИЯ МЕТОДОВ
        for(Animal x : arr){
            x.makeNoise();
            x.eat();
            x.sleep_action();
            System.out.println("hashCode " + x.hashCode());
        }

        //РЕФЛЕКСИЯ
        Veterinarian veterinarian = null;
        try {
            Class clazz = Class.forName(Veterinarian.class.getName());
            veterinarian = (Veterinarian) clazz.newInstance();

        }   catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        for(Animal x : arr)
            veterinarian.treatAnimal(x);
        //veterenarian.treatAnimal(animal1);
    }

}
