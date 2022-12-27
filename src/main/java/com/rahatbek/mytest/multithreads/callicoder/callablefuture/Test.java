package com.rahatbek.mytest.multithreads.callicoder.callablefuture;

import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) {

        // using simple type
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                // Perform some computation
                Thread.sleep(2000);
                return "Return some result";
            }
        };
        System.out.println(callable);

        // using lambda expressive type
        Callable<String> callableLambda = () -> {
            // Perform some computation
            Thread.sleep(2000);
            return "Return some result";
        };
    }
}
