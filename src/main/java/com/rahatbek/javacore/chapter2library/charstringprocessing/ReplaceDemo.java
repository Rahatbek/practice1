package com.rahatbek.javacore.chapter2library.charstringprocessing;

public class ReplaceDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Это простой тест.");
        sb.replace(4, 11, "был");
        System.out.println("После замены: " + sb);
    }
}
