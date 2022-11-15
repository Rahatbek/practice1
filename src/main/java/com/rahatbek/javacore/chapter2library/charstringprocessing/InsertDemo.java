package com.rahatbek.javacore.chapter2library.charstringprocessing;

public class InsertDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Мне Java!");

        sb.insert(4, "нравится ");
        System.out.println(sb);
    }
}
