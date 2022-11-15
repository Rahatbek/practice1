package com.rahatbek.javacore.chapter2library.packagejavalang;

public class StringConversions {
    public static void main(String[] args) {
        int num = 19648;
        System.out.println("Число num в двоичной форме: " + Integer.toBinaryString(num));
        System.out.println("Число num в восьмиричной форме: " + Integer.toOctalString(num));
        System.out.println("Число num в шестнадцатеричной форме: " + Integer.toHexString(num));
    }
}
