package com.rahatbek.mytest.streamapi;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
