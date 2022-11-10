package com.rahatbek.javacore.chapter1.detailedconsiderationofclasses;

public class StackU {
    private int stck[];
    private int tos;

    StackU(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stck.length-1)
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Стек загружен.");
            return 0;
        }
        else return stck[tos--];
    }
}

class TestStack2 {
    public static void main(String[] args) {
        StackU myStack1 = new StackU(5);
        StackU myStack2 = new StackU(8);

        for (int i = 0; i< 5; i++)
            myStack1.push(i);
        for (int i = 0; i< 8; i++)
            myStack2.push(i);

        System.out.println("Стек в myStack1:");
        for (int i = 0; i<5; i++)
            System.out.println(myStack1.pop());

        System.out.println("Стек в myStack2:");
        for (int i = 0; i< 8; i++)
            System.out.println(myStack2.pop());
    }
}