package com.rahatbek.mytest.multithreads.stackoverflow;

public class Test {
    public static void main(String[] args) throws Exception {
        Foo foo = new Foo();

        RunnerA A = new RunnerA(foo);
        RunnerB B = new RunnerB(foo);
        RunnerC C = new RunnerC(foo);

        Thread threadA = new Thread(A);
        Thread threadB = new Thread(B);
        Thread threadC = new Thread(C);

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
