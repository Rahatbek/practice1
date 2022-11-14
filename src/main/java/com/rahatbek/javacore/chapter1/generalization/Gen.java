package com.rahatbek.javacore.chapter1.generalization;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Типом Т является " + ob.getClass().getName());
    }
}

class Gen2<T, V> extends Gen<T> {
    V ob2;

    Gen2(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getOb2() {
        return ob2;
    }
}

class HierDemo {
    public static void main(String[] args) {

        Gen2<String, Integer> x = new Gen2<>("Значениче равно: ", 99);

        System.out.print(x.getOb());
        System.out.println(x.getOb2());
    }
}

class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<Integer>(88);

        iOb.showType();;

        int v = iOb.getOb();

        System.out.println("Значение: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<String>("Тест обобщений");

        strOb.showType();

        String str = strOb.getOb();
        System.out.println("Значение " + str);
    }
}

class RawDemo {
    public static void main(String[] args) {

        Gen<Integer> iOb = new Gen<>(88);

        Gen<String> strOb = new Gen<>("Тест обобщений");

        Gen raw = new Gen(new Double(98.6));

        double d = (Double) raw.getOb();
        System.out.println("Значение: " + d);

//        int i = (Integer) raw.getOb();

        strOb = raw;

//        String str = strOb.getOb();

        raw = iOb;
//        d = (Double) raw.getOb();
    }
}