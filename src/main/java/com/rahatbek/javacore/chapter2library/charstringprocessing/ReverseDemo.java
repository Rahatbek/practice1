package com.rahatbek.javacore.chapter2library.charstringprocessing;

public class ReverseDemo {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("abcdef");

        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }
}
