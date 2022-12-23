package com.rahatbek.mytest.streamapi;

// Прототип Stream.map() является:
/*
 * @param Тип элемента нового потока
 * @param картограф невмешательный метод без сохранения состояния для применения к каждому элементу
 * @вернуть новый поток
 */
//<R> Stream<R> map(Function<? super T, ? extends R> mapper);

// Прототип Stream.flatMap() является:
/*
  @param Тип элемента нового потока
  @param картограф невмешательный метод без сохранения состояния, применяемый к каждому
  элемент который производит поток новых значений
  @вернуть новый поток
*/

//<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Как использовать map() метод
public class StreamMap {
    public static void main(String[] args) {

//        Например, вот как мы можем преобразовать список Character в список Integer (при условии правильного ввода).
        Stream<Integer> integerStream = Stream.of('1', '2', '3')    // Stream<Character>
                .map(String::valueOf)                                       // Stream<String>
                .map(Integer::parseInt);                                    // Stream<Integer>

//        Приведенный выше код можно дополнительно сократить с помощью лямбда-выражений, как показано ниже:
        Stream<Integer> integerStream1 = Stream.of('1', '2', '3')                        // Stream<Character>
                .map(ch -> Integer.parseInt(ch.toString()));                                    // Stream<Integer>

//        Вот как мы можем преобразовать список Integer к списку Character.
        Stream<Character> characterStream = Arrays.asList(1, 2, 3).stream()             // Stream<Integer>
                .map(String::valueOf)                                                   // Stream<String>
                .map(s -> s.charAt(0));                                                 // Stream<Character>

//        Мы также можем сделать это с помощью одного вызова map() метод, как показано ниже:
        Stream<Character> characterStream1 = Arrays.asList(1, 2, 3).stream()                     // Stream<Integer>
                .map(s -> String.valueOf(s).charAt(0));                                         // Stream<Character>
    }
}


// Зачем нам нужен flatMap()?
class StreamFlatMap {
    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(4, 5);
        List<Integer> c = Arrays.asList(6, 7, 8);

        List<List<Integer>> listOfListOfInts = Arrays.asList(a, b, c);

        System.out.println("Before flattening: " + listOfListOfInts);

        List<Integer> listOfInts = listOfListOfInts.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println("After flattening : " + listOfInts);
    }
}

class MethodLikeFlatMap {
    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(4, 5);
        List<Integer> c = Arrays.asList(6, 7, 8);

        List<List<Integer>> listOfListOfInts = Arrays.asList(a, b, c);

        System.out.println("Before flattening: " + listOfListOfInts);

        List<Integer> listOfInts = new ArrayList<>();
        for (List<Integer> list : listOfListOfInts) {
            for (Integer integer : list) {
                listOfInts.add(integer);
            }
        }
        System.out.println("After flattening : " + listOfInts);
    }
}