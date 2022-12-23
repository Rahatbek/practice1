package com.rahatbek.mytest.multithreads.lessonjava;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Main: " + Thread.currentThread().getName());

        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread: " + Thread.currentThread().getName());
        System.out.println("this is new thread");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable: " + Thread.currentThread().getName());
    }
}