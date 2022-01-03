package com.pb.korotkaya.hw14_1;

import java.io.IOException;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainForClient {

    public static void main(String[] args) throws InterruptedException, IOException {

       ExecutorService executorService = Executors.newFixedThreadPool(1);


        while (true) {
            executorService.execute(new Client());
            Thread.sleep(10);
        }
    }
}
