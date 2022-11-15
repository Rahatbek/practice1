package com.rahatbek.javacore.chapter2library.charstringprocessing;

public class IndexOfDemo {
    public static void main(String[] args) {
        String s = " Now is the time for all good men " +
        "to come to the aid of their country." ;
        System.out.println(s);
        System.out.println("indexOf(t) = " + s.indexOf('t'));
        System.out.println("lastIndexOf(t) = " + s.lastIndexOf('t'));
        System.out.println("indexOf(the) = " + s.indexOf("the"));
        System.out.println("lastIndexOf(the) = " + s.lastIndexOf("the"));
        System.out.println("indexOf(t, 10) = " + s.indexOf('t', 10));
        System.out.println("lastIndexOf(the, 60) = " + s.lastIndexOf('t', 60));
        System.out.println("indexOf(the, 10) = " + s.indexOf("the", 10));
        System.out.println("lastIndexOf(the, 60) = " + s.lastIndexOf("the", 60));


        System.out.println();
        System.out.println("StringBuffer");
        StringBuffer sb = new StringBuffer("one two one");
        int i;

        i = sb.indexOf("one");
        System.out.println("Индекс первого вхождения: " + i);

        i = sb.lastIndexOf("one");
        System.out.println("Индекс последнего вхождения: " + i);
    }
}
