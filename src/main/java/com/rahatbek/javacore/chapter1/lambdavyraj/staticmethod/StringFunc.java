package com.rahatbek.javacore.chapter1.lambdavyraj.staticmethod;

// Продемонстрировать ссылку на статический метод
// Функциональный интерфейс для операций с символьными строками
public interface StringFunc {
    String func(String n);
}

class MyStringOps {

    static String strReverse(String str) {
        String result = "";
        int i;

        for (i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);

        return result;
    }
}

class MethodRefDemo {

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышаюте эффективность Java";
        String outStr;

        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}