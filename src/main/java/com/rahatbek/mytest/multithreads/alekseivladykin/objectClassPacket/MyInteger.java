package com.rahatbek.mytest.multithreads.alekseivladykin.objectClassPacket;

import java.util.Objects;

public class MyInteger {

    public static int MAX_VALUE = 0x7FFFFFFF;
    private int value;

    public MyInteger() {
    }

    /**
     * @param value wrapped primitive value
     * */
    public MyInteger(int value) {
        this.value = value;
    }

    /**
     * @return wrapped value
     * */
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void dispose() { // destructors
    }

    public void close() { // destructors
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
//    @Override
//    public String toString() {
//        return "MyInteger{" +
//                "value=" + value +
//                '}';
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyInteger integer = (MyInteger) o;
        return value == integer.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public static MyInteger valueOf(int value) {
        return new MyInteger(value); // По факту можно кэшировать ну только 1000, остальные нужно создавать
    }

    class FooBar {
    }
}

class Foo {
}

class Bar {
}