package com.rahatbek.javacore.chapter1.interfaces;

public interface IntStack {
    void push(int item);

    int pop();
}

class FixedStack implements IntStack {
    private int stck[];
    private int tos;

    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos == stck.length - 1)
            System.out.println("Стек заполнен");
        else
            stck[++tos] = item;
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        } else
            return stck[tos--];
    }
}

class IFTest {
    public static void main(String[] args) {
        FixedStack myStack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);

        for (int i = 0; i < 5; i++)
            myStack1.push(i);
        for (int i = 0; i < 8; i++)
            myStack2.push(i);

        System.out.println("Стек в myStack1: ");
        for (int i = 0; i < 5; i++)
            System.out.println(myStack1.pop());

        System.out.println("Стек в myStack2: ");
        for (int i = 0; i < 8; i++)
            System.out.println(myStack2.pop());
    }
}

class DynStack implements IntStack {
    private int stck[];
    private int tos;

    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }


    @Override
    public void push(int item) {
        if (tos == stck.length-1) {
            int temp[] = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++)
                temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        }
        else
            stck[++tos] = item;
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else
            return stck[tos--];
    }
}

class IFTest2{
    public static void main(String[] args) {
        DynStack myStack1 = new DynStack(5);
        DynStack myStack2 = new DynStack(8);

        for (int i = 0; i < 5; i++)
            myStack1.push(i);
        for (int i = 0; i < 8; i++)
            myStack2.push(i);

        System.out.println("Стек в myStack1: ");
        for (int i = 0; i < 5; i++)
            System.out.println(myStack1.pop());

        System.out.println("Стек в myStack2: ");
        for (int i = 0; i < 8; i++)
            System.out.println(myStack2.pop());
    }
}

class IFTest3 {
    public static void main(String[] args) {
        IntStack myStack;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        myStack = ds;
        for (int i = 0; i < 12; i++)
            myStack.push(i);

        myStack = fs;
        for (int i = 0; i < 8; i++)
            myStack.push(i);

        myStack = ds;
        for (int i = 0; i < 12; i++)
            System.out.println(myStack.pop());

        myStack = fs;
        for (int i = 0; i < 8; i++)
            System.out.println(myStack.pop());
    }
}