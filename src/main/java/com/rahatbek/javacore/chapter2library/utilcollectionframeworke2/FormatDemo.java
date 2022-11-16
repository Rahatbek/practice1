package com.rahatbek.javacore.chapter2library.utilcollectionframeworke2;

import java.util.Formatter;

public class FormatDemo {
    public static void main(String[] args) {
        try(Formatter fmt = new Formatter()) {

            fmt.format("Форматировать %s просто %d %f", "средствами Java", 10, 98.6);
            System.out.println(fmt);
        }
    }
}
