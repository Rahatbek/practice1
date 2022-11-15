package com.rahatbek.javacore.chapter1.lambdavyraj.refconsructors;

public interface MyFunc {
    MyClass func(int n);
}

class MyClass {
    private int val;

    MyClass(int val) {
        this.val = val;
    }

    MyClass() {
        val = 0;
    }

    int getVal() {
        return val;
    }
}

class ConstructorRefDemo {
    public static void main(String[] args) {

        MyFunc myClassCons = MyClass::new;

        MyClass mc = myClassCons.func(100);

        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}