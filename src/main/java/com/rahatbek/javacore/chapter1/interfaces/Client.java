package com.rahatbek.javacore.chapter1.interfaces;

public class Client implements Callback {

    public void callback(int p) {
        System.out.println("Метод callback(), вызываемый со значением " + p);
    }

    void nonIfaceMeth() {
        System.out.println("В классах, реализующих интерфейсы, могут определяться и другие члены.");
    }
}

class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}

class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Еще один вариант метода callback()");
        System.out.println("p в квадарате равно " + (p * p));
    }
}

class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

        c = ob;
        c.callback(42);
    }
}

abstract class Incomplete implements Callback {
    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }
}