package com.rahatbek.javacore.chapter1.controloperation;

public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("такт " + n);
            n--;
        } while (n > 0);

//        do {
//            System.out.println("такт " + n);
//        } while (--n > 0);
    }
}
