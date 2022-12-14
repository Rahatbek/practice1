package com.rahatbek.mytest.multithreads.callicoder.basicconcurrency;

// By providing a Runnable object
public class RunnableExample implements Runnable{
    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating Runnable... (Runnable runnable = new RunnableExample();) ");
        Runnable runnable = new RunnableExample();

        System.out.println("Creating Thread... (Thread thread = new Thread(runnable);) ");
        Thread thread = new Thread(runnable);

        System.out.println("Starting Thread... (thread.start();) ");
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Inside : " + Thread.currentThread().getName());
    }
}
