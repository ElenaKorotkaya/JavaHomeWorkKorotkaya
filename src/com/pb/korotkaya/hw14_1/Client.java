package com.pb.korotkaya.hw14_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDateTime;

public class Client implements Runnable {

    Socket socket;

    @Override
    public void run() {
        try {
            socket = new Socket("localhost", 3004);
            System.out.println("Client connected to socked");
            Thread.sleep(2000);
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }

        try {
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Client writer and reader initialized");
            System.out.println("Input your message and type 'bye' to disconnect! ");

            String dataFromUser, dataFromServer;

            while (((dataFromUser = consoleReader.readLine()) != null) && (!socket.isClosed())) {
                writer.println(dataFromUser);
                //writer.flush();
                System.out.println("Client wrote and is waiting ");
                Thread.sleep(10);
                System.out.println("reading: ");
                dataFromServer = reader.readLine();

                System.out.println(dataFromServer);
                if ("bye".equalsIgnoreCase(dataFromUser)) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}



/*

 */