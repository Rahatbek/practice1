package com.rahatbek.javacore.chapter1.inputoutputapplets;

//public class MyClass {
//    int a;
//    int b;
//
//    MyClass(int i, int j) {
//        a = i;
//        b = j;
//    }
//
//    MyClass(int i) {
//        a = i;
//        b = i;
//    }
//
//    MyClass() {
//        a = 0;
//        b = 0;
//    }
//}
public class MyClass {
    int a;
    int b;

    MyClass(int i, int j) {
        a = i;
        b = j;
    }

    MyClass(int i) {
        this(i,i);
    }

    MyClass() {
        this(0);
    }
}