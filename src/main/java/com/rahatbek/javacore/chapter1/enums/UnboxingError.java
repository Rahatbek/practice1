package com.rahatbek.javacore.chapter1.enums;

public class UnboxingError {
    public static void main(String[] args) {
        Integer iOb = 1000;

        int i = iOb.byteValue();

        System.out.println(i);

        // Неудачное применение автоупаковки и автораспоковки!
        Double a, b, c;

        a = 10.0;
        b = 4.0;

        c = Math.sqrt(a * a + b* b);
        System.out.println("Гипотенуза равна " + c);
    }
}
