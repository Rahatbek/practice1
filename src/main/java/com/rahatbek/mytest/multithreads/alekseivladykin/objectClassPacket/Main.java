package com.rahatbek.mytest.multithreads.alekseivladykin.objectClassPacket;

public class Main {
    public static void main(String[] args) {
        MyInteger integerWithSet = new MyInteger(); // ctrl + q - info documentation
        integerWithSet.setValue(20);
        System.out.println("integerWithSet = " + integerWithSet);

        MyInteger integerWithConstructor = new MyInteger(10);
        System.out.println("integerWithConstructor = " + integerWithConstructor);

        System.out.println("integerWithSet.equals(integerWithConstructor) = " + integerWithSet.equals(integerWithConstructor)); // false
        System.out.println(integerWithSet == integerWithConstructor); // false

        System.out.println("integerWithSet.hashCode() = " + integerWithSet.hashCode());
        System.out.println("integerWithConstructor.hashCode() = " + integerWithConstructor.hashCode());

        System.out.println("MyInteger.MAX_VALUE = " + MyInteger.MAX_VALUE);

        System.out.println("MyInteger.valueOf(20) = " + MyInteger.valueOf(20));

        Foo foo = new Foo();
        System.out.println(foo);

        MyInteger.FooBar fooBar = null;
        MyInteger.FooBar fooBarNew = integerWithSet.new FooBar();

        System.out.println(Direction.LEFT);
    }
}
