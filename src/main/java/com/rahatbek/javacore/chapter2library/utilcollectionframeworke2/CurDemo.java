package com.rahatbek.javacore.chapter2library.utilcollectionframeworke2;

import java.util.Currency;
import java.util.Locale;

public class CurDemo {
    public static void main(String[] args) {
        Currency c;

        c = Currency.getInstance(Locale.US);

        System.out.println("Символ: " + c.getSymbol());
        System.out.println("Количество цифро в дробной части числа по умолчанию: " + c.getDefaultFractionDigits());
    }
}
