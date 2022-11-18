package com.rahatbek.javacore.chapter2library.regex30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// TODO: find() group();
public class RegExpr6 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("e.+?d");
        Matcher mat = pat.matcher("extend cup end table");

        while (mat.find())
            System.out.println("Совпадение: " +mat.group());
    }
}
