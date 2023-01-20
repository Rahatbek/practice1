package com.rahatbek.mytest.multithreads.alekseivladykin.genericsCollections;

import java.util.HashMap;
import java.util.Map;

public class IteratorUsing {
    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        {
            stringMap.put("one", "one");
            stringMap.put("two", "two");
            stringMap.put("three", "three");
            stringMap.put("four", "four");
        }
        System.out.println(stringMap);

        Map<String, String> strings = new HashMap<String, String>() {{
            put("one", "first");
            put("two", "second");
        }};
        System.out.println(strings);

        // foreach syntax
        for (Map.Entry<String, String> map : stringMap.entrySet()) {
            System.out.println("key : " + map.getKey() + ", value : " + map.getValue());
        }

        // using lambda
        strings.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
    }
}
