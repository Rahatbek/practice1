package com.rahatbek.javacore.chapter2library.utilcollectionsframework;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ComLastNames implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;

        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}

class CompThenByFirstname implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;

        return aStr.compareToIgnoreCase(bStr);
    }
}

class TreeMapDemo2A {
    public static void main(String[] args) {
        ComLastNames compLN = new ComLastNames();
        Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirstname());

        TreeMap<String, Double> tm = new TreeMap<>(compLastThenFirst);
//        TreeMap<String, Double> tm = new TreeMap<>();

        tm.put("Джон Доу", 3434.34);
        tm.put("Том Смит", 123.22);
        tm.put("Джейн Бейкер", 1378.00);
        tm.put("Тод Холл", 99.22);
        tm.put("Ральф Смит", -19.08);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);

        System.out.println("Новый остаток на счете Джона Доу: " + tm.get("Джон Доу"));
    }
}