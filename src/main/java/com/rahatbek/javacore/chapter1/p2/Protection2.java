package com.rahatbek.javacore.chapter1.p2;

import com.rahatbek.javacore.chapter1.packagesinterfaces.Protection;

public class Protection2 extends Protection {
    Protection2() {
        System.out.println("конструктор унаследованный из другого пакета");
//        доступно только для данного класса или пакета
//        System.out.println("n = " + n);

//      доступно только для данного класса
//        System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
class OtherPackage {
    OtherPackage() {
        Protection p = new Protection();
        System.out.println("конструктор из другого пакета");

//        доступно только для данного класса или пакета
//        System.out.println("n = " + p.n);

//        оступно только для данного класса
//        System.out.println("n_pri = " + p.n_pri);

//        доступно только для данного класса, подкласса или пакета
//        System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}
class Demo {
    public static void main(String[] args) {
        Protection2 ob1 = new Protection2();
        OtherPackage ob2 = new OtherPackage();
    }
}