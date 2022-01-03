package com.pb.korotkaya.hw14_1;

import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainForTesRunnable {
    public static void main(String[] args) throws InterruptedException, IOException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        int j = 0;

        while ( (j < 10)) {
            j++;
            executorService.execute(new TestRunnableClientTester());
            Thread.sleep(10);
        }
        executorService.shutdown();
    }
}
