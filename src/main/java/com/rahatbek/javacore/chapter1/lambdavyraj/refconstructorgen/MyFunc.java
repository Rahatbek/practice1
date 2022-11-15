package com.rahatbek.javacore.chapter1.lambdavyraj.refconstructorgen;

public interface MyFunc<T> {
    MyClass<T> func(int n);
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

class ConstructorRefDemo2 {
    public static void main(String[] args) {

        MyFunc<Integer> myClassCons = MyClass::new;

        MyClass<Integer> mc = myClassCons.func(100);

        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}