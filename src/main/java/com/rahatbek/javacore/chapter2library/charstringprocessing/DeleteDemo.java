package com.rahatbek.javacore.chapter2library.charstringprocessing;

public class DeleteDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Это простой тест");

        sb.delete(3, 11);
        System.out.println("После вызова delete(3, 11): " + sb);

        sb.deleteCharAt(0);
        System.out.println("После вызова deleteCharAt(0): " + sb);

    }
}
