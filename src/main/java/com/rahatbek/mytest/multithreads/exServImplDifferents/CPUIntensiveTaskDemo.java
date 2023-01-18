package com.rahatbek.mytest.multithreads.exServImplDifferents;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CPUIntensiveTaskDemo {
    public static void main(String[] args) {
        // get count of available cores
        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println(coreCount);
        ExecutorService service = Executors.newFixedThreadPool(coreCount);

        // submit the tasks for execution
        for (int i = 0; i < 100; i++) {
            service.execute(new CpuIntensiveTask());
        }

        service.shutdown();
    }

    static class CpuIntensiveTask implements Runnable {
        public void run() {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        }
    }
}
