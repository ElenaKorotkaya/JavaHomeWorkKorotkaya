package com.pb.korotkaya.hw11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SerialMain {
    public static void main(String[] args)  throws Exception {

        File file = Paths.get("person.data").toFile();
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        Person person1 = new Person("Alex", "0673547685", "str.Riverside 2",
                LocalDate.of(2000, 10, 25), LocalDateTime.now());
        Person person2 = new Person("Sarah", "0973547561", "str.Countryside 5",
                LocalDate.of(2001, 2, 28), LocalDateTime.now());
        Person person3 = new Person("Sandra", "0502437564", "str.Lakeside 7",
                LocalDate.of(1990, 2, 21), LocalDateTime.now() );

        List<Person> list = new ArrayList<>();

        list.add(new Person("Bob", "0638672435", "str.Lakeside 34",
                LocalDate.of(1994, 5, 14), LocalDateTime.now()));
        list.add(person1);
        list.add(person2);
        list.add(person3);

        objectOutputStream.writeObject(list);
        System.out.println("File has been written!");
        objectOutputStream.close();

        System.out.println(new String(Files.readAllBytes(Paths.get("person.data"))));


        ArrayList<Person> newList = new ArrayList<>();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.data"));
        newList = (ArrayList<Person>)objectInputStream.readObject();

        // System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());;
        for(Person p : newList) {
            System.out.println(p.getName());
            System.out.println(p.toString());
        }

    }
}
