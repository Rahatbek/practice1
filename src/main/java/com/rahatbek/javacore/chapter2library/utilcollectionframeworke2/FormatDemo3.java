package com.rahatbek.javacore.chapter2library.utilcollectionframeworke2;

import java.util.Formatter;

public class FormatDemo3 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        fmt.format("Копирование файла%nПередача завершена на %d%%", 88);
        System.out.println(fmt);
        fmt.close();
    }
}
