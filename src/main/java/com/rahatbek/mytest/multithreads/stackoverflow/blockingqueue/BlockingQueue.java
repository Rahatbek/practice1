package com.rahatbek.mytest.multithreads.stackoverflow.blockingqueue;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue<T> {

    private Queue<T> queue = new LinkedList<>();
    private int capacity;

    public BlockingQueue(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void put(T element) {
        while (queue.size() == capacity) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
            queue.add(element);
            notify();
        }
    }

    public synchronized T take() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        T item = queue.remove();
        notify();
        return item;
    }
}
