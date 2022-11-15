package com.rahatbek.javacore.chapter2library.charstringprocessing;

public class ConCat {
    public static void main(String[] args) {
        String longStr = "Это может быть очень длинная строка, " +
                "которую следовало бы перенести на " +
                "новую строку. но благодаря сцеплению " +
                "этого удается избежать.";
        System.out.println(longStr);

        String s = "четыре: " + 2 + 2;
        System.out.println(s);

        String s1 = "четыре: " + (2 + 2);
        System.out.println(s1);
    }
}
