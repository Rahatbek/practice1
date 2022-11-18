package com.rahatbek.javacore.chapter2library.regex30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// TODO: find() group();
public class RegExpr7 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("[a-z]+");
        Matcher mat = pat.matcher("this is a test.");

        while (mat.find())
            System.out.println("Совпадение: " +mat.group());
    }
}
