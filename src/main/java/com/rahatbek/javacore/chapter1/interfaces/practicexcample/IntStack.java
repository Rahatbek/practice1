package com.rahatbek.javacore.chapter1.interfaces.practicexcample;

public interface IntStack {
    void push (int item);
    int pop();

    default void clear(){
        System.out.println("Метод clear() не реализован.");
    }
}

