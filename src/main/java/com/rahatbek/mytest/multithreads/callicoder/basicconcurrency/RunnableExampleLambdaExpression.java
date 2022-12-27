package com.rahatbek.mytest.multithreads.callicoder.basicconcurrency;

public class RunnableExampleLambdaExpression {

    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating Runnable... \n(Runnable runnable = () -> {\n" +
                "            System.out.println(\"Inside : \" + Thread.currentThread().getName());\n" +
                "        };) ");
        Runnable runnable = () -> {
            System.out.println("Inside : " + Thread.currentThread().getName());
        };

        System.out.println("Creating Thread... (Thread thread = new Thread(runnable);) ");
        Thread thread = new Thread(runnable);

        System.out.println("Starting Thread... (thread.start();) ");
        thread.start();
    }
}
