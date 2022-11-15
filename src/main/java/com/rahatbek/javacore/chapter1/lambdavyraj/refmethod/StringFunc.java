package com.rahatbek.javacore.chapter1.lambdavyraj.refmethod;

public interface StringFunc {
    String func(String n);
}

class MyStringOps {

    String strReverse(String str) {
        String result = "";
        int i;

        for (i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);

        return result;
    }
}

class MethodRefDemo2 {

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышаюте эффективность Java";
        String outStr;

        MyStringOps strOps = new MyStringOps();

        outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}