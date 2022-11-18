package com.rahatbek.javacore.chapter2library.regex30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// TODO: find() group();
public class RegExpr4 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("W+");
        Matcher mat = pat.matcher("W WW WWW");

        while (mat.find())
            System.out.println("Совпадение: " +mat.group());
    }
}
