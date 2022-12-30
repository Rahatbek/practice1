package com.rahatbek.mytest.multithreads.stackoverflow;

public class RunnerA implements Runnable {
    private Foo f;

    public RunnerA(Foo f) {
        this.f = f;
    }

    @Override
    public void run() {
        f.first(this);
    }
}
