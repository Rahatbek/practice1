package com.rahatbek.mytest.multithreads.alekseivladykin.genericsCollections;

import java.lang.ref.WeakReference;

public class Demo {
    private int hello;
    private int bye;
    public static void main(String[] args) {
        WeakReference<Integer> weakReference = new WeakReference<>(1000);
        System.out.printf("Before GC: %s\n", weakReference.get());

        for (int i = 1; weakReference.get() != null; i++) {
            System.gc();
            System.out.printf("After GC iteration %d: %s\n", i, weakReference.get());
        }

        WeakReference<Demo> demoWeakReference = new WeakReference<>(new Demo());
        Demo demo = demoWeakReference.get();
        System.out.println(demo);

    }
}
