package com.rahatbek.mytest.multithreads.alekseivladykin.concurr.demo1;

public class Demo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
//            new HelloThread().start();
//            new Thread(() -> System.out.println("Hello from")).start();
            new Thread(new HelloRunnable()).start();
        }

        System.out.println("Hello from main thread");
    }

    private static class HelloThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello from " + Thread.currentThread().getName());
        }
    }

    private static class HelloRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello from " + Thread.currentThread().getName());
        }
    }
}
