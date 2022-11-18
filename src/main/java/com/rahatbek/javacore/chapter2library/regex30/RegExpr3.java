package com.rahatbek.javacore.chapter2library.regex30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// TODO: find() start();
public class RegExpr3 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("test");

        Matcher mat = pat.matcher("test 1 2 3 test");
        while (mat.find()) {
            System.out.println("Последовательность test найдена по индексу " + mat.start());
        }
    }
}
