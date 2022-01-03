package com.pb.korotkaya.hw14_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EchoServer {

    /*
    public static void main(String[] args) throws IOException {
        int port = 3004;
        ServerSocket server = new ServerSocket(port);
        System.out.println("The server started on the port - " + port);
        ExecutorService threadPool = Executors.newFixedThreadPool(1);

        while (true) {
            Socket client = server.accept();
            threadPool.submit(new EchoHandler(client, LocalDateTime.now()));
        }
    }
     */

    public static void main(String[] args) {

        try {
            int port = 3004;
            ExecutorService executeIt = Executors.newFixedThreadPool(10);
            ServerSocket server = new ServerSocket(port);
            System.out.println("The server started on the port - " + port);

            for (int i = 0; i < 10; i++) {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                Socket client = server.accept();

                executeIt.execute(new EchoHandler(client, LocalDateTime.now()));
                System.out.println("Connection accepted!");
            }
            executeIt.shutdown();
            server.close();
        } catch (Exception e) {
            System.err.println("Exception caught: " + e);
            e.printStackTrace();
        }
    }
}
