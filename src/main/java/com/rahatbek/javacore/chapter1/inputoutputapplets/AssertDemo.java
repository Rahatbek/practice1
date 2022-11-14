package com.rahatbek.javacore.chapter1.inputoutputapplets;

public class AssertDemo {
    static int val = 3;

    static int getNum() {
        return val--;
    }

    public static void main(String[] args) {
        int n;

        for (int i = 0; i < 10; i++) {
            n = getNum();

            assert n > 0 : "n отрицательное!";

            System.out.println("n равно " + n);
        }
    }
}
