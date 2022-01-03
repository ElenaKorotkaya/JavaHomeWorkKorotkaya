package com.pb.korotkaya.hw14_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.Date;

public class EchoHandler implements Runnable {
    private static Socket client;
    LocalDateTime clientTime;

    public LocalDateTime getClientTime() {
        return LocalDateTime.now();
    }

    EchoHandler (Socket socket, LocalDateTime clientTime) {
        this.client = socket;
        this.clientTime = clientTime;
    }
    public void run () {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter writer = new PrintWriter(client.getOutputStream(), true);
            System.out.println("Reader and writer created by Handler");

            String line = null;
            while (!client.isClosed()) {
                line = reader.readLine();
                if (line.equals("bye")) {
                    writer.println("[echo] - bye! " + clientTime);
                    client.close();
                    writer.close();
                    reader.close();
                }
                System.out.println("Server is reading!");

                System.out.println("Read of client: " + line + ", " + clientTime);
                System.out.println("Server try returning the message! ");
                writer.println("[echo] - " + " " + clientTime + ": "+ line);
            }

            //System.out.println("We close the connection ");
            //writer.close();
            //reader.close();
        } catch (Exception e) {
            System.err.println("Exception caught: client disconnected.");
            e.printStackTrace();
        }
        finally {
            {
                try {
                    client.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
