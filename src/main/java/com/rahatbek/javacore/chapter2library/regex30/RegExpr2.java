package com.rahatbek.javacore.chapter2library.regex30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// TODO: find();
public class RegExpr2 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("Java");
        Matcher mat = pat.matcher("Java 8");

        System.out.println("Поиск Java в Java 8:");

        if (mat.find())
            System.out.println("Подпоследовательность найдена");
        else
            System.out.println("Совпадения отсутствуют");
    }
}
