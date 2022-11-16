package com.rahatbek.javacore.chapter2library.utilcollectionframeworke2;

import java.util.Optional;

public class OpptionalDemo {
    public static void main(String[] args) {
        Optional<String> noVal = Optional.empty();

        Optional<String> hasVal = Optional.of("ABCDEFG");

        if (noVal.isPresent())
            System.out.println("Не подлежит выводу");
        else
            System.out.println("Объект noVal не содержит значение");

        if (hasVal.isPresent())
            System.out.println("Объект hasVal содержит следующую строку: " + hasVal.get());

        String defStr = noVal.orElse("Строка по умолчанию");
        System.out.println(defStr);
    }
}
