package com.rahatbek.javacore.chapter2library.charstringprocessing;

public class MakeString {
    public static void main(String[] args) {
        char c[] = {'J', 'a', 'v', 'a'};
        String s1 = new String(c);
        String s2 = new String(s1);
        System.out.println(s1);
        System.out.println(s2);

        char chars[] = {'a', 'b', 'c'};
        String s = new String(chars);
        System.out.println(s.length());

        String str = "abc";
        System.out.println(str.length());

        String age = "9";
        String str1 = "Ему " + age + " лет.";
        System.out.println(str1);
    }
}
