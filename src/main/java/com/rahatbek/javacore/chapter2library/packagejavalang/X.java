package com.rahatbek.javacore.chapter2library.packagejavalang;

public class X {
    int a;
    float b;
}

class Y extends X {
    double c;
}

class RTTI {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();

        Class<?> clObj;
        clObj = x.getClass();
        System.out.println("x - объект типа: " + clObj.getName());
        clObj = y.getClass();
        System.out.println("y - объект типа: " + clObj.getName());
        clObj = clObj.getSuperclass();
        System.out.println("Супркласс объекта y: " + clObj.getName());
    }
}