package com.rahatbek.mytest.multithreads.alekseivladykin.concurr.demo11;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGeneratorGood2 {

    private static final AtomicInteger counter = new AtomicInteger();

    public static int nextInt() {
        return counter.getAndIncrement();
    }

    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; ++j) nextInt();});
            thread.start();
            threads.add(thread);
            }
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println("Counter final value: " + counter);
    }
}
