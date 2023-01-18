package com.rahatbek.mytest.multithreads.alekseivladykin.concurr.demo16;

import java.util.Arrays;

public class ParallelStreamBroken {

    public static void main(String[] args) {
        int[] array = Commons.prepareArray();


        long startTime = System.currentTimeMillis();

        double[] sum = new double[1];
//        DoubleAdder sum = new DoubleAdder(); // right solution
        Arrays.stream(array)
                .parallel()
                .mapToDouble(Commons::function)
                .forEach(x -> sum[0] += x);
//                .forEach(sum::add);

        long endTime = System.currentTimeMillis();

        System.out.println("sum = " + sum[0]);
//        System.out.println("sum = " + sum.doubleValue());
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}
