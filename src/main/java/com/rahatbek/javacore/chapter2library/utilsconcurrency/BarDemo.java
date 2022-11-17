package com.rahatbek.javacore.chapter2library.utilsconcurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

// TODO: Read this code
public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

        System.out.println("Запуск потоков");

        new MyThread(cb, "A");
        new MyThread(cb, "B");
        new MyThread(cb, "C");
        new MyThread(cb, "X");
        new MyThread(cb, "Y");
        new MyThread(cb, "Z");
    }
}

class MyThread implements Runnable {
    CyclicBarrier cBar;
    String name;

    MyThread(CyclicBarrier c, String n) {
        cBar = c;
        name = n;
        new Thread(this).start();
    }

    public void run() {
        System.out.println(name);

        try {
            cBar.await();
        } catch (BrokenBarrierException exc) {
            System.out.println(exc);
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }
}

class BarAction implements Runnable {
    public void run() {
        System.out.println("Барьер достигнут!");
    }
}