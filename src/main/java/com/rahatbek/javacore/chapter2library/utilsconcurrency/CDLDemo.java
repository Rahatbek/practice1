package com.rahatbek.javacore.chapter2library.utilsconcurrency;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cd1 = new CountDownLatch(5);
        System.out.println("Запуск потока исполнения");
        new MyThread1(cd1);

        try {
            cd1.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Завершения потока исполнения");
    }
}

class MyThread1 implements Runnable {
    CountDownLatch latch;

    MyThread1(CountDownLatch c) {
        latch = c;
        new Thread(this).start();;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            latch.countDown(); // обратный отсчет
        }
    }
}