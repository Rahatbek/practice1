package com.rahatbek.mytest.streamapi;

import com.rahatbek.javacore.chapter1.interfaces.A;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) throws IOException {
        // From Collection
        Stream<String> fromCollectionOld = Arrays.asList("x", "y", "z").stream();

        // from a set of values
        Stream<String> fromValues = Stream.of("x", "y", "z");

        // from arrays
        Stream<String> fromArray = Arrays.stream(new String[]{"x", "y", "z"});

        // from file (every string in file will be separate element in stream)
//        Stream<String> fromFile = Files.lines(Paths.get("input.txt"));

        // from string
        IntStream fromString = "0123456789".chars();

        // with stream.builder();
        Stream<Object> fromBuilder = Stream.builder().add("z").add("y").add("z").build();

        // with Stream.iterate (infinitive)
        Stream<Integer> fromIterate = Stream.iterate(1, n -> n + 1);

        // with Stream.generate() (infinitive)
        Stream<String> fromGenerate = Stream.generate(() -> "0");


        Collector<String, List<String>, List<String>> toList = Collector.of(
                ArrayList::new,
                List::add,
                (l1, l2) -> {
                    l1.addAll(l2);
                    return l1;
                });

        int[] ints = Stream.of("12", "22", "4", "444", "123").mapToInt(Integer::parseInt).toArray();
//        Arrays.stream(ints).forEach(System.out::println);

        String[] strings = Stream.of("H e l l o", "w o r l d !").flatMap((p) -> Arrays.stream(p.split(" ")))
                .toArray(String[]::new);
//        Arrays.stream(strings).forEach(System.out::println);

        ArrayList collection = new ArrayList();
//        collection
//                .stream()
//                .peek(...) // операция последовательна
//                .parallel()
//                .map(...) // операция может выполняться параллельно
//                .sequential()
//                .reduce(...); // операция снова последовательна
//      collection.parallelStream()
//              .sorted()
//              .unordered()
//              .collect(Collectors.toList());

//        (new Random())
//                .ints()
//                .limit(10)
//                .forEach(System.out::println);

//        IntStream limit = (new Random())
//                .ints()
//                .limit(10);

//        Stream.of(1, 2, 3, 2, 1)
//                .map(s -> s * s)
//                .distinct()
//                .forEach(System.out::println);

//        System.out.println(Stream.of("Hello", "", ", ", "world", "!")
//                .filter(String::isEmpty)
//                .count());

//        (new Random())
//                .ints()
//                .limit(10)
//                .sorted()
//                .forEach(System.out::println);

        int maxInt = Stream.of(5, 3, 4, 55, 2)
                .mapToInt(a -> a)
                .max()
                .getAsInt();
//        System.out.println(maxInt);

        int minInt = Stream.of(5, 3, 4, 55, 2)
                .mapToInt(a -> a)
                .min()
                .getAsInt();
//        System.out.println(minInt);

        int sum = Stream.of(5, 3, 4, 55, 2)
                .mapToInt(a -> a)
                .sum();
//        System.out.println(sum);

        double average = Stream.of(5, 3, 4, 55, 2)
                .mapToInt(a -> a)
                .average()
                .getAsDouble();
        System.out.println(average);
    }
}
