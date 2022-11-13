package com.rahatbek.javacore.chapter1.exceptions;

public class ChainExcDemo {
    static void demoProc() {
        NullPointerException e = new NullPointerException("верхний уровень");

        e.initCause(new ArithmeticException("Причина"));

        throw e;
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Перехвачено исключение: " + e);
            System.out.println("Первопричина: " + e.getCause());
        }
    }
}
