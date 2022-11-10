package com.rahatbek.javacore.chapter1.detailedconsiderationofclasses;

public class Stack {
    private int stck[] = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9)
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else
            return stck[tos--];
    }
}

class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        for (int i = 0; i < 10; i++)
            myStack1.push(i);
        for (int i = 10; i < 20; i++)
            myStack2.push(i);

        System.out.println("Стек в myStack1:");
        for (int i = 0; i < 10; i++)
            System.out.println(myStack1.pop());

        System.out.println("Стек в myStack2:");
        for (int i = 0; i < 10; i++)
            System.out.println(myStack2.pop());

//        myStack1.tos = -2;
//        myStack2.stck[3] = 100;
    }
}