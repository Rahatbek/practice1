package com.rahatbek.javacore.chapter1.inheritance.abstracts;

abstract class A {
    abstract void callMe();

    //абстрактные классы все же могут содержать конкретные методы
    void callMeToo() {
        System.out.println("Это конкретный метод.");
    }
}

class B extends A {
    void callMe() {
        System.out.println("Реализация метода callMe() из класса B.");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        B b = new B();
        b.callMe();
        b.callMeToo();
    }
}