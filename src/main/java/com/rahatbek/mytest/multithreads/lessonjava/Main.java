package com.rahatbek.mytest.multithreads.lessonjava;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Main: " + Thread.currentThread().getName());
//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread2 = new Thread(myRunnable);
//        thread2.start();

//        MyThread myThread = new MyThread();
//        myThread.start();

        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
    }
}

//class MyThread extends Thread {
//
//    @Override
//    public void run() {
//        System.out.println("MyThread: " + Thread.currentThread().getName());
//        System.out.println("this is new thread");
//    }
//}
//
//class MyRunnable implements Runnable {
//    @Override
//    public void run() {
//        System.out.println("MyRunnable: " + Thread.currentThread().getName());
//    }
//}

class  MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread name is - " + Thread.currentThread().getName() + " i = " + i);
        }
    }
}