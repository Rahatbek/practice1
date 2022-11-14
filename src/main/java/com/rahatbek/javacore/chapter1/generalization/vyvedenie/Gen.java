package com.rahatbek.javacore.chapter1.generalization.vyvedenie;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
}

class Gen2 extends Gen<String> {

    Gen2(String o) {
        super(o);
    }

    String getOb() {
        System.out.print("Вызван метод String getOb(): ");
        return ob;
    }
}

class BridgeDemo {
    public static void main(String[] args) {

        Gen2 strOb2 = new Gen2("Тест обобщений");

        System.out.println(strOb2.getOb());
    }
}