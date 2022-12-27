package com.rahatbek.mytest.multithreads.callicoder.synchronizaedthreads;

public class SynchronizedCounter {
    private int count = 0;

    // Synchronized Method
    public void increment() {
        // Synchronized Block -

        // Acquire Lock
        synchronized (this) {
            count = count + 1;
        }
        // Release Lock
    }

    public int getCount() {
        return count;
    }
}
