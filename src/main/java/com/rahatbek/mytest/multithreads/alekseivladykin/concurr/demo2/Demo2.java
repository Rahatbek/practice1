package com.rahatbek.mytest.multithreads.alekseivladykin.concurr.demo2;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new WorkerThread();
//        worker.setDaemon(true);
        Thread sleeper = new SleeperThread();
//        sleeper.setDaemon(true);

        System.out.println("    Starting threads");
        worker.start();
        sleeper.start();

        Thread.sleep(100L);

        System.out.println("    Interrupting threads");
        worker.interrupt();
        sleeper.interrupt();

        System.out.println("    Joining threads");
        worker.join();
        sleeper.join();

        System.out.println("All done");
    }

    private static class WorkerThread extends Thread {

        @Override
        public void run() {
            long sum = 0;
            for (int i = 0; i < 1_000_000_000; ++i) {
                sum += i;
//                System.out.println(i);
                if (i % 100 == 0 && isInterrupted()) {
                    System.out.println("Loop interrupted at i = " + i);
                    break;
                }
            }
        }
    }

    private static class SleeperThread extends Thread {

        @Override
        public void run() {
            try {
                Thread.sleep(10000L);
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted");
            }
        }
    }


}
