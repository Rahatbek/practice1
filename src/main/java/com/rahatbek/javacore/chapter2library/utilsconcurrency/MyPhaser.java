package com.rahatbek.javacore.chapter2library.utilsconcurrency;

import java.util.concurrent.Phaser;

public class MyPhaser extends Phaser {
    int numPhases;

    MyPhaser(int parties, int phaseCount) {
        super(parties);
        numPhases = phaseCount -1;
    }

    protected boolean onAdvance(int p, int regParties) {
        //Следующий оператор println ( ) требуе т с я только для
        // целей иллюстрации . Как правило , ме тод onAdvance ( )
        // н е отобража е т выв одимые данные
        System.out.println("Фаза " + p + " завершена.\n");

        // возвратить логическое значение true ,
        // если все фазы завершены
        if (p == numPhases || regParties == 0)
            return true;
        // В противном случае возвратить логическое значение false
        else
            return false;
    }
}

class PhaserDemo2 {
    public static void main(String[] args) {

        MyPhaser phsr = new MyPhaser(1, 4);

        System.out.println("Запуск потоко\n");

        new MyThread3(phsr, "A");
        new MyThread3(phsr, "B");
        new MyThread3(phsr, "C");

        while (!phsr.isTerminated()) {
            phsr.arriveAndAwaitAdvance();
        }

        System.out.println("Синхронизатор фаз завершен");
    }
}

class MyThread3 implements Runnable {
    Phaser phsr;
    String name;

    MyThread3(Phaser p, String n) {
        phsr = p;
        name = n;
        phsr.register();
        new Thread(this).start();
    }

    public void run() {

        while (!phsr.isTerminated()) {
            System.out.println("Поток " + name + " начинает фазу " + phsr.getPhase());
            phsr.arriveAndAwaitAdvance();

            // Неболь шая пауз а , чтобы не наруши т ь порядок вывода .
            // Только для иллюстрации , но необязательно для правильного
            // функционирования синхронизатора фаз
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}