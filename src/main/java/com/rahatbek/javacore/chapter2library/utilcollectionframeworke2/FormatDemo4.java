package com.rahatbek.javacore.chapter2library.utilcollectionframeworke2;

import java.util.Formatter;

public class FormatDemo4 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        fmt.format("|%f|%n|%12f|%n|%012f|", 10.12345, 10.12345, 10.12345);

        System.out.println(fmt);
        fmt.close();
    }
}
