package com.rahatbek.mytest.multithreads.alekseivladykin.exceptiondebug;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (; ; ) {
            String expr = reader.readLine();

            System.out.println(expr);
            if (expr.equalsIgnoreCase("exit")) {
                reader.close();
                return;
            }
        }
    }
}
/*
* Гарантии безопасности

* Гарантии отсутствия исключений
* Сильные гарантии
* Слабые гарантии
* Гарантия отсутствия
* Никаких гарантии
* */