package com.rahatbek.javacore.chapter1.packagesinterfaces;

public class Protection {
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    public Protection() {
        System.out.println("конструктор базового класса");
        System.out.println("n = " + n);
        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}

class Derived extends Protection {
    Derived() {
        System.out.println("конструктор подкласса");
        System.out.println("n = " + n);

//        доступно только для класса
//        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub + " + n_pub);
    }
}

class SamePackage {
    SamePackage() {

        Protection p = new Protection();
        System.out.println("конструктор этого же пакета");
        System.out.println("n = " + p.n);

//        доступкно только для класса
//        System.out.println("n_pri = " p.n_pri);

        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}

class Demo {
    public static void main(String[] args) {
        Protection ob1 = new Protection();
        Derived ob2 = new Derived();
        SamePackage ob3 = new SamePackage();
    }
}