package com.rahatbek.mytest.multithreads.exServImplDifferents;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IOTaskDemo {
    public static void main(String[] args) {

        // much higher count for IO tasks
        ExecutorService service = Executors.newFixedThreadPool(100);

        // submit the tasks for execution
        for (int i = 0; i < 100; i++) {
            service.execute(new IOTask());
        }
    }

    static class IOTask implements Runnable {
        public void run() {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        }
    }
}
