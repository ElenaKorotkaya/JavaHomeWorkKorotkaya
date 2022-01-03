package com.pb.korotkaya.hw14_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TestRunnableClientTester implements Runnable {

    static Socket socket;

    public TestRunnableClientTester() throws IOException {
        try {
            socket = new Socket("localhost", 3003);
            System.out.println("Client connected to socked");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

        try {
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            System.out.println("Client writer and reader initialized");

            int i = 0;

            while (i < 5) {
                writer.println("clientCommand " + (i) + ", ");
                writer.flush();
                Thread.sleep(10);
                System.out.println("Client wrote and is waiting ");
                System.out.println("reading");

                String dataFromServer = reader.readLine();
                System.out.println(dataFromServer);
                i++;
                Thread.sleep(5000);
            }
        }
        catch(Exception e){
             e.printStackTrace();
        }

    }
}
