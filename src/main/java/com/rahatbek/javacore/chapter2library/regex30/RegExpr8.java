package com.rahatbek.javacore.chapter2library.regex30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// TODO: replaceAll();
public class RegExpr8 {
    public static void main(String[] args) {
        String str = "Jon Jonathan Frank Ken Todd";

        Pattern pat = Pattern.compile("Jon.*? ");
        Matcher mat = pat.matcher(str);

        System.out.println("Исходная последовательность: " + str);
        str = mat.replaceAll("Eric ");

        System.out.println("Измененная последовательность: " + str);
    }
}
