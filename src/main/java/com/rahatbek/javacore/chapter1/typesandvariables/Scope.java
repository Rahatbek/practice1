package com.rahatbek.javacore.chapter1.typesandvariables;

public class Scope {
    public static void main(String[] args) {
        int x;

        x = 10;
        if (x == 10) {
            int y = 20;

            System.out.println("x и y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // Ошибка! переменная y недоступна
                    // в этой области действия, тогда как
                    // переменная x доступна и здесь
        System.out.println("x равно " + x);
    }
}
