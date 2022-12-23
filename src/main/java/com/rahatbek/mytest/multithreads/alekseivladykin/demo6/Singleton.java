package com.rahatbek.mytest.multithreads.alekseivladykin.demo6;

public class Singleton {

    private int foo;
    private String bar;

    private Singleton() {
        foo = 13;
        bar = "zap";
    }

    private static volatile Singleton instance;

    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
