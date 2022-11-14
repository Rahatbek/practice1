package com.rahatbek.javacore.chapter1.generalization.errorgen;

public class MyGenClass<T, V> {
    T ob1;
    V ob2;

//    void set(T o) {
//        ob1 = o;
//    }

    void set(V o) {
        ob2 = o;
    }
}

class Gen<T extends Number> {
    T ob;

    T vals[];

    Gen(T o, T[] nums) {
        ob = o;
//        vals = new T[10];
        vals = nums;
    }

    Gen() {
//        ob = new T();
    }
}

class Wrong<T> {
//    static T ob;
//
//    static T getOb() {
//        return ob;
//    }
}

class GenArrays {
    public static void main(String[] args) {
        Integer n[] = {1, 2, 3, 4, 5};

        Gen<Integer> iOb = new Gen<>(50, n);

//        Gen<Integer> gens[] = new Gen<Integer>[10];

        Gen<?> gens[] = new Gen<?>[10];
    }
}