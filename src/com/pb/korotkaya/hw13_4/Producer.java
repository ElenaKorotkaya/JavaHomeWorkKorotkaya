package com.pb.korotkaya.hw13_4;

import java.util.List;
import java.util.Random;

public class Producer implements Runnable{

    private final List list;

    public Producer(List list, int size) {
        this.list = list;
        this.SIZE = size;
    }

    private final int SIZE;

    @Override
    public void run() {

        while (true) {
            synchronized (list) {
                while (list.size() == SIZE) {
                    try {
                        System.out.println(" Producer is waiting ");
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int x = new Random().nextInt(100);
                System.out.println(" Producer produces: " + x);
                list.add(x);
                list.notifyAll();
            }
        }

    }
}
