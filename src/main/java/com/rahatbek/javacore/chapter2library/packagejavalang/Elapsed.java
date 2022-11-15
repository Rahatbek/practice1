package com.rahatbek.javacore.chapter2library.packagejavalang;

public class Elapsed {
    public static void main(String[] args) {
        long start, end;

        System.out.println("Измерение времени перебора от 0 до 1000000000");

        start = System.currentTimeMillis();
        for (long i = 0; i < 1000000000; i++);
        end = System.currentTimeMillis();

        System.out.println("Время выполнения: " + (end - start));
    }
}
