package com.rahatbek.javacore.chapter2library.charstringprocessing;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("буфер = " + sb);
        System.out.println("длина = " + sb.length());
        System.out.println("емкость = " + sb.capacity());
    }
}
