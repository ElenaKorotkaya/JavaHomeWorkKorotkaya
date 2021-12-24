package com.pb.korotkaya.hw13_4;

import java.util.List;

public class Consumer implements Runnable {

    private  final List list;
    private final int SIZE;

    public Consumer(List list, int size) {
        this.list = list;
        this.SIZE = size;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (list) {
                while (list.isEmpty()) {
                    System.out.println(" Consumer is waiting ");
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(" Consumer consumed: " + list.remove(0));
                list.notifyAll();
            }
        }

    }
}
