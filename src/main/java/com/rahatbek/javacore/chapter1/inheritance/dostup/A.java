package com.rahatbek.javacore.chapter1.inheritance.dostup;

public class A {
    int i;
    private int j;

    void setIJ(int x, int y) {
        i = x;
        j = y;
    }
}

class B extends A {
    int total;

    void sum() {
//        total = i + j;
    }
}

class Access {
    public static void main(String[] args) {
        B subOb = new B();

        subOb.setIJ(10, 10);

        subOb.sum();
        System.out.println("Сумма равна " + subOb.total);
    }
}