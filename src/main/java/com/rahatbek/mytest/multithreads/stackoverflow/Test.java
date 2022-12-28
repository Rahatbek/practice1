package com.rahatbek.mytest.multithreads.stackoverflow;

public class Test {
    public static void main(String[] args) throws Exception {
        Foo foo = new Foo();
        Thread t1 = new Thread(() -> call(foo::first));
        Thread t2 = new Thread(() -> call(foo::second));
        Thread t3 = new Thread(() -> call(foo::third));

        // Start threads out of order, with delay between them, giving each thread
        // enough time to complete, if not adequately coded to ensure execution order.
        t2.start();
        Thread.sleep(500);
        t3.start();
        Thread.sleep(500);
        t1.start();

        // Wait for threads to complete
        t2.join();
        t3.join();
        t1.join();

        // At this point, the program output should be "first,second,third."
    }
    interface FooMethod {
        public void call(Runnable printFirst);
    }
    private static void call(FooMethod method) {
            method.call(System.out::println);
    }
}
