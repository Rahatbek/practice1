package com.rahatbek.javacore.chapter1.inheritance.poryadok;

public class A {
    A() {
        System.out.println("Внутри конструкторе A.");
    }
}

class B extends A {
    B() {
        System.out.println("Внутри конструкторе B.");
    }
}

class C extends B {
    C() {
        System.out.println("Внутри конструкторе C.");
    }
}
class CallingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}
