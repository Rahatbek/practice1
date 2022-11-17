package com.rahatbek.javacore.chapter2library.utilsconcurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    public static void main(String[] args) {
        new AtomThread("A");
        new AtomThread("B");
        new AtomThread("C");
    }
}

class Shared3 {
    static AtomicInteger ai = new AtomicInteger(0);
}

class AtomThread implements Runnable {
    String name;
    AtomThread(String n) {
        new Thread(this).start();
        }

    public void run() {
        System.out.println("Запуск потока " + name);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Поток " + name + " получено: " + Shared3.ai.getAndSet(i));
        }
    }
}