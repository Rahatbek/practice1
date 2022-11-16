package com.rahatbek.javacore.chapter2library.utilcollectionframeworke2;

import java.util.Formatter;

// TODO: REMEMBER this code on page 692
public class FormatDemo5 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        fmt.format("% d", -100);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("% d", 100);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("% d", -200);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("% d", 200);
        System.out.println(fmt);
        fmt.close();
    }
}
