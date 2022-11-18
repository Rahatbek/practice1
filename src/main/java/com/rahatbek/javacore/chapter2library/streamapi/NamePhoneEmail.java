package com.rahatbek.javacore.chapter2library.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NamePhoneEmail {
    String name;
    String phoneNum;
    String email;

    public NamePhoneEmail(String name, String phoneNum, String email) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }
}

class NamePhone {
    String name;
    String phoneNum;

    public NamePhone(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }
}

class StreamDemo5 {
    public static void main(String[] args) {

        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Ларри", "555-5555", "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Джеймс", "555-4444", "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Мэри", "555-3333", "Mary@HerbSchildt.com"));

        System.out.println("Исходные элементы из списка myList: ");
//        myList.forEach((a) -> System.out.println(a.name + " " + a.phoneNum + " " + a.email));
        myList.stream().forEach((a) -> System.out.println(a.name + " " + a.phoneNum + " " + a.email));

        System.out.println();

        Stream<NamePhone> nameAndPhone = myList.stream().map((a) -> new NamePhone(a.name, a.phoneNum));

        System.out.println("Список имен и номеров телефонов:");
        nameAndPhone.forEach((a)->{
            System.out.println(a.name + " " + a.phoneNum);
        });
    }
}

class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Ларри", "555-5555", "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Джеймс", "555-4444", "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Мэри", "555-3333", "Mary@HerbSchildt.com"));

        Stream<NamePhone> namAndPhone = myList.stream().map((a) -> new NamePhone(a.name, a.phoneNum));

        List<NamePhone> npList = namAndPhone.collect(Collectors.toList());

        System.out.println("Имена и номера телефонов в списке типа List:");
        for (NamePhone e : npList)
            System.out.println(e.name + ": " + e.phoneNum);

        namAndPhone = myList.stream().map((a) -> new NamePhone(a.name,a.phoneNum));

        Set<NamePhone> npSet = namAndPhone.collect(Collectors.toSet());

        System.out.println("\nИмена и номера телефонов в множестве типа Set:");
        for (NamePhone e : npSet)
            System.out.println(e.name + ": " + e.phoneNum);
    }
}