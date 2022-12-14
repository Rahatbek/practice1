package com.rahatbek.javacore.chapter2library.utilsconcurrency;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Sum1 extends RecursiveTask<Double> {

    final int seqThresHold = 500;

    double[] data;

    int start, end;

    Sum1(double[] vals, int s, int e) {
        data = vals;
        start = s;
        end = e;
    }

    protected Double compute() {
        double sum = 0;

        if ((end - start) < seqThresHold) {
            for (int i = start; i < end; i++)
                sum += data[i];
        } else {
            int middle = (start + end) /2;

            Sum1 subTaskA = new Sum1(data, start, middle);
            Sum1 subTaskB = new Sum1(data, middle, end);

            subTaskA.fork();
            subTaskA.fork();

            sum = subTaskA.join() + subTaskB.join();
        }
        return sum;
    }
}

class RecurTaskDemo {
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool();

        double[] nums = new double[5000];

        for (int i = 0; i < nums.length; i++)
            nums[i] = (double) (((i%2) == 0) ? i : -i);

        Sum1 task = new Sum1(nums, 0, nums.length);

        double summation = fjp.invoke(task);

        System.out.println("Суммирование " + summation);
    }
}