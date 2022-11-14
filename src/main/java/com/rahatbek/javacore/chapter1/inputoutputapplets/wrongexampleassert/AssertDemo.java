package com.rahatbek.javacore.chapter1.inputoutputapplets.wrongexampleassert;

// Неудачное применение оператора assert!!!
public class AssertDemo {
    static int val = 3;

    static int getNum() {
        return val--;
    }

    public static void main(String[] args) {
        int n;

        for (int i = 0; i < 10; i++) {
            n = getNum();

            assert (n = getNum()) > 0;
            if (n < 0)
                return;

            System.out.println("n is " + n);
        }
    }
}
