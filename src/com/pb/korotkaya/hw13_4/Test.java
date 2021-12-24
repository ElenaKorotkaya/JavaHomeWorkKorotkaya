package com.pb.korotkaya.hw13_4;

import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List list = new LinkedList();
        int size = 4;

        Thread p = new Thread(new Producer(list, size), " Producer");
        Thread c = new Thread(new Consumer(list, size), " Consumer");

        p.start();
        c.start();
    }
}
