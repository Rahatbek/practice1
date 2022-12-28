package com.rahatbek.mytest.multithreads.arcticlehabr.post164487.way1;


class SomeThing implements Runnable {
    public void run() {
        System.out.println("Привет из побочного потока!");
    }
}
public class Program {
//   static SomeThing mThing;
//
    public static void main(String[] args) {
//        mThing = new SomeThing();
//
//        Thread myThread = new Thread(mThing);
//        myThread.start();
//
//        System.out.println("Главный поток завершен...");

        Thread myThready = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Привет из побочного потока!");
            }
        });
        myThready.start();

        System.out.println("Главный поток завершен...");
    }

}
