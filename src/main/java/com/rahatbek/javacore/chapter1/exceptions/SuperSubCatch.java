package com.rahatbek.javacore.chapter1.exceptions;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Перехватит исключений общего Exception.");
        }
        /*catch (ArithmeticException e) {
            System.out.println("Этот код вообще недостижим.");
        }*/
    }
}
