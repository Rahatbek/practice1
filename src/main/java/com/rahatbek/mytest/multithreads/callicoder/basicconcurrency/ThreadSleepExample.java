package com.rahatbek.mytest.multithreads.callicoder.basicconcurrency;

// Pausing execution of a Thread using sleep()
public class ThreadSleepExample {

    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        String[] messages = {"If I can stop one heart from breaking,",
                "I shall not live in vain.",
                "If I can ease one life the aching,",
                "Or cool one pain,",
                "Or help one fainting robin",
                "Unto his nest again,",
                "I shall not live in vain"};

        Runnable runnable = () -> {
            System.out.println("Inside : " + Thread.currentThread().getName());

            for (String message : messages) {
                System.out.println(message);
                try {
                    Thread.sleep(0);
                } catch (InterruptedException e) {
                    throw new IllegalArgumentException(e);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}