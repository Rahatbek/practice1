package com.rahatbek.mytest.testbyme;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationThrows {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList();
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList();
        for (int i = 1; i <= 10; i++) {
            new Thread(new AddListRunnable(list, i)).start();
            new Thread(new AddListRunnable(list, i)).start();
        }

        System.out.println(list);
    }

    private static class AddListRunnable implements Runnable {
//        private ArrayList<Integer> list;
        private CopyOnWriteArrayList<Integer> list;
        private int number;

        public AddListRunnable(CopyOnWriteArrayList<Integer> list, int number) {
            this.list = list;
            this.number = number;
        }
        @Override
        public void run() {
//            System.out.println("Hello from " + Thread.currentThread().getName());
            list.add(number);
        }
    }
}
