package com.rahatbek.mytest.multithreads.alekseivladykin.concurr.demo16;

public class Sequential {

    public static void main(String[] args) {
        int[] array = Commons.prepareArray();

        long startTime = System.currentTimeMillis();

        double sum = Commons.calculate(array);

        long endTime = System.currentTimeMillis();

        System.out.println("sum = " + sum);
        System.out.println("time = " + (endTime - startTime) + " ms");
    }
}
