package com.rahatbek.mytest.multithreads.alekseivladykin.baseSyntax;

import java.util.Arrays;

public class BaseSyntax {
    public static void main(String[] args) {
        double e = Math.E;
        double pi = Math.PI;
        System.out.println("double e = Math.E = " + e);
        System.out.println("double pi = Math.PI = " + pi);

        double sin = Math.sin(5);
        double cos = Math.cos(5);
        System.out.println("sin 5 = " + sin);
        System.out.println("cos 5 = " + cos);

        double sqrt = Math.sqrt(9);
        double pow = Math.pow(2, 3);
        double exp = Math.exp(10);
        System.out.println("sqrt 9 = " + sqrt);
        System.out.println("pow (2, 3) = " + pow);
        System.out.println("exp 10 = " + exp);

        int min = Math.min(1, 2);
        int max = Math.max(1, 2);
        System.out.println("min (1, 2) = " + min);
        System.out.println("max (1, 2) = " + max);

        Integer a = 6;
        Integer b = 7;
        System.out.println(a == b); // сравнивает ссылки
        System.out.println(a.equals(b)); // сравнивает ссылки
//        System.out.println(Arrays.equals(a, b)); // сравнивает содержимое
//        System.out.println(Arrays.deepEquals(a, b)); // сравнивает содержимое многомерных массивов

        // Class java.lang.String
        // Последовательность символов произвольной длины в кодировке UTF-16
        // Строка - это не char[], хотя есть способы конвертации
        // Никаких нулевых символов в конце, длина хранится отдельно
        char[] charArray = {'a', 'b', 'c'};
        String string = new String(charArray);
        System.out.println(string); // String is immutable
        char[] chars = string.toCharArray();

        // java.langStringBuilder
        StringBuilder buf = new StringBuilder();
        buf.append("Hello");
        buf.append(" World!");
        String result = buf.toString();
        System.out.println("StringBuilder = " + buf);
        System.out.println("String result = buf.toString() = " + result);

        /*Conditionals
        * If I study, I will pass. - 1st conditional
        * If I studied, I would pass = 2nd conditional
        * If I had studied, I would have passed - 3rd conditional*/

        boolean weatherIsGod = true;
        if (weatherIsGod) {
            System.out.println("Weather is good");
        } else {
            System.out.println("Weather is bad");
        }

        weatherIsGod = false;
        System.out.println("Weather id " + (weatherIsGod ? "good" : "bad"));
    }
}
