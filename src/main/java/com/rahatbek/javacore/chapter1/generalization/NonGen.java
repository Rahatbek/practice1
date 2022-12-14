package com.rahatbek.javacore.chapter1.generalization;

public class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getOb () {
        return ob;
    }

    void showType() {
        System.out.println("Объект ob относится к типу " + ob.getClass().getName());
    }
}

class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;

        iOb = new NonGen(88);

        iOb.showType();

        int v = (Integer) iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();

        NonGen strOb = new NonGen("Тест без обобщений");

        strOb.showType();

        String str = (String) strOb.getOb();
        System.out.println("Значение: " + str);

        iOb = strOb;
//        v = (Integer) iOb.getOb();
    }
}
