package com.rahatbek.javacore.chapter1;

public class IfSample {
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y)
            System.out.println("x меншье y");

        x = x * 2;
        if (x == y)
            System.out.println("x теперь равно y");

        x = x * 2;
        if (x > y)
            System.out.println("x теперь больше y");

        if (x == y)
            System.out.println("вы не увидите этого");
    }
}
