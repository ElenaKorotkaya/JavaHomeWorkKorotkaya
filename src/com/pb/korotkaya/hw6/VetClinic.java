package com.pb.korotkaya.hw6;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class VetClinic {

    public static void main(String[] args) {

            //ОБЪЕКТЫ
        Animal animal1 = new Dog("" , "(Вольер 1). ", "Шарик ", 5);

        Animal animal2 = new Dog("", "(Вольер 2). ", "Тобик ", 10);

        Animal animal3 = new Cat("", "(Кабинка 1). ", "Барсик ", 3);

        Animal animal4 = new Cat("", "(Кабинка 2). ", "Мурзик ", 2);

        Animal animal5 = new Horse("", "(Загон 3). ", "Арамис ", 100);

        Animal animal6 = new Horse("", "(Загон 4). ", "Партос ", 130);

        //ПРИГЛАШЕНИЕ НА ПРИЕ
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
        Veterinarian veterenarian = null;
        try {
            Class clazz = Class.forName(Veterinarian.class.getName());
            veterenarian = (Veterinarian) clazz.newInstance();

        }   catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
        }
                for(Animal x : arr)
                veterenarian.treatAnimal(x);
                //veterenarian.treatAnimal(animal1);
        }

}
