package com.rahatbek.javacore.chapter1.detailedconsiderationofclasses;

public class Test2 {
    int a;
    public int b;
    private int c;

    void setC(int i) {
        c = i;
    }

    int getC() {
        return c;
    }
}

class AccessTest {
    public static void main(String[] args) {
        Test2 ob = new Test2();

        ob.a = 10;
        ob.b = 20;

//        ob.c = 100; // ОШИБКА!

        ob.setC(100);
        System.out.println("a, b и c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}