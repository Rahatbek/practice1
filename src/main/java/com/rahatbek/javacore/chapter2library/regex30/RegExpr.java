package com.rahatbek.javacore.chapter2library.regex30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// TODO: matches();
public class RegExpr {
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;

        pat = Pattern.compile("Java");
        mat = pat.matcher("Java");
        found = mat.matches();

        System.out.println("Проверка совпадения Java с Java:");
        if (found)
            System.out.println("Совпадает");
        else
            System.out.println("Не совпадает");

        System.out.println();

        System.out.println("Проверка совпадения Java с Java 8:");
        mat = pat.matcher("Java 8");

        found = mat.matches();

        if (found)
            System.out.println("Совпадает");
        else
            System.out.println("Не совпадает");
    }
}
