package com.rahatbek.mytest.multithreads.exServImplDifferents;

public class TestDemoThread {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Task());
        thread1.start();
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }

    static class Task implements Runnable {
        public void run() {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        }
    }
}
