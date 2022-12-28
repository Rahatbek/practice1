package com.rahatbek.mytest.multithreads.arcticlehabr.post164487.way2;

class AffableThread extends Thread{
    @Override
    public void run() {
        System.out.println("Привет из побочного потока!");
    }
}

public class Program {
    static AffableThread mSecondThread;

    public static void main(String[] args) {
        mSecondThread = new AffableThread();
        mSecondThread.start();

        System.out.println("Главный поток завершен...");
    }
}
