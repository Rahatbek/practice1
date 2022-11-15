package com.rahatbek.javacore.chapter2library.charstringprocessing;

public class SubStringCons {
    public static void main(String[] args) {
        byte ascii[] = {65, 66, 67, 68, 69, 79};
        String s1 = new String(ascii);
        System.out.println(s1);
        String s2 = new String(ascii, 2, 3);
        System.out.println(s2);
    }
}
