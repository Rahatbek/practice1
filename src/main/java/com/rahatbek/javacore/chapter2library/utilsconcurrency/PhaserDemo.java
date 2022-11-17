package com.rahatbek.javacore.chapter2library.utilsconcurrency;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phsr = new Phaser(1);
        int curPhase;

        System.out.println("запуск потоков");
        new MyThread2(phsr, "A");
        new MyThread2(phsr, "B");
        new MyThread2(phsr, "C");

        // ожидать з авершения всеми пото ками исполнения первой фазы
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // ожидать за вершения всеми потоками исполнения в торой фазы
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // снять основной поток исполнения с регистрации
        phsr.arriveAndDeregister();

        if (phsr.isTerminated())
            System.out.println("Синхронизатор фаз завершен");
    }
}

class MyThread2 implements Runnable {
    Phaser phsr;
    String name;

    MyThread2(Phaser p, String n) {
        phsr = p;
        name = n;
        phsr.register();
        new Thread(this).start();
    }

    public void run() {

        System.out.println("Поток " + name + " начинает первую фазу");
        phsr.arriveAndAwaitAdvance(); // известить о достижений фазы

        // Неболь ша я пауза , ч тобы не нарушить порядок вывода .
        // Тол ь к о для иллюс трации , но необязательно для правильного
        // функционирования синхр о низатора фаз
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Поток " + name + " начинает вторую фазу");
        phsr.arriveAndAwaitAdvance(); // известить о достижений фазы

        // Неболь ша я пауза , ч тобы не нарушить порядок вывода .
        // Тол ь к о для иллюс трации , но необязательно для правильного
        // функционирования синхр о низатора фаз
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Поток " + name + " начинает третью фазу");
        phsr.arriveAndDeregister(); // известить о достижении фазы и снять потоки с регистрации
    }
}