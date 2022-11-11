package com.rahatbek.javacore.chapter1.interfaces;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "Объект типа String по умолчанию";
    }
}

class MyIFImp implements MyIF {

    @Override
    public int getNumber() {
        return 100;
    }
}

class DefaultMethodDemo {

    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();

        System.out.println(obj.getNumber());

        System.out.println(obj.getString());
    }
}

class MyIFImp2 implements MyIF {
    public int getNumber() {
        return 100;
    }

    public String getString() {
        return "Это другая символьная строка.";
    }
}