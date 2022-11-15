package com.rahatbek.javacore.chapter1.lambdavyraj.fabricrefcons;

public interface MyFunc<R, T> {
    R func(T n);
}

class MyClass<T> {
    private T val;

    MyClass(T v) {
        val = v;
    }

    MyClass() {
        val = null;
    }

    T getVal() {
        return val;
    }
}

class MyClass2 {
    String str;

    MyClass2(String s) {
        str = s;
    }

    MyClass2() {
        str = "";
    }

    String getVal() {
        return str;
    }
}

class ConstructorRefDemo3 {

    static <R, T> R myClassFactory(MyFunc<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {

        MyFunc<MyClass<Double>, Double> myClassCons = MyClass<Double>::new;

        MyClass<Double> mc = myClassFactory(myClassCons, 100.1);

        System.out.println("Значение val в объекте mc равно " + mc.getVal());

        MyFunc<MyClass2, String> myClassCons2 = MyClass2::new;

        MyClass2 mc2 = myClassFactory(myClassCons2, "Лямбда");

        System.out.println("Значение str в объекте mc2 равно " + mc2.getVal());
    }
}