package com.rahatbek.javacore.chapter2library.utilcollectionsframework;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComp2 {
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>((aStr, bStr) -> bStr.compareTo(aStr));

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String element : ts)
            System.out.print(element + " ");

        System.out.println();
    }

}
