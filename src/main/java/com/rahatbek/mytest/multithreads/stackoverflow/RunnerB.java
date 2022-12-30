package com.rahatbek.mytest.multithreads.stackoverflow;

public class RunnerB implements Runnable {
    private Foo f;

    public RunnerB(Foo f) {
        this.f = f;
    }

    @Override
    public void run() {
        f.second(this);
    }
}
