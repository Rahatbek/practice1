package com.rahatbek.javacore.chapter1.multithread;

//public class NewThread implements Runnable{
//    Thread t;
//
//    NewThread() {
//        t = new Thread(this, "Демонстрационный поток");
//        System.out.println("Дочерний поток создан: " + t);
//        t.start();
//    }
//
//    public void run() {
//        try {
//            for (int i = 5; i > 0; i--) {
//                System.out.println("Дочерний поток: " + i);
//                Thread.sleep(500);
//            }
//        } catch (InterruptedException e) {
//            System.out.println("Дочерний поток прерван");
//        }
//        System.out.println("Дочерний поток завершен.");
//    }
//}
//
//class ThreadDemo {
//    public static void main(String[] args) {
//        new NewThread();
//
//        try {
//            for (int i = 5; i > 0; i--) {
//                System.out.println("Главный поток: " + i);
//                Thread.sleep(1000);
//            }
//        } catch (InterruptedException e) {
//            System.out.println("Главный поток прерван.");
//        }
//        System.out.println("Главный поток завершен");
//    }
//}

//public class NewThread extends Thread {
//
//    NewThread() {
//        super("Демонстрационный поток");
//        System.out.println("Дочерний поток: " + this);
//        start();
//    }
//
//    public void run() {
//        try {
//            for (int i = 5; i > 0; i--) {
//                System.out.println("Дочерний поток: " + i);
//                Thread.sleep(500);
//            }
//        } catch (InterruptedException e) {
//            System.out.println("Дочерний поток прерван.");
//        }
//        System.out.println("Дочерний поток завершен.");
//    }
//}
//class ExtendThread {
//    public static void main(String[] args) {
//        new NewThread();
//
//        try {
//            for (int i = 5; i > 0; i--) {
//                System.out.println("Главный поток: " + i);
//                Thread.sleep(1000);
//            }
//        } catch (InterruptedException e) {
//            System.out.println("Главный поток прерван.");
//        }
//        System.out.println("Главный поток завершен.");
//    }
//}

// Приостановка и возобновление исполнения потока современным способом
public class NewThread implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        suspendFlag = false;
        t.start();
    }

    // Точка входа в поток исполнения
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен.");
    }

    synchronized void mySuspend() {
        suspendFlag = true;
    }

    synchronized void myResume() {
        suspendFlag = false;
        notify();
    }
}

class SuspendResume {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("Один");
        NewThread ob2 = new NewThread("Два");

        try {
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("Приостановка потока Один");
            Thread.sleep(1000);
            ob1.myResume();
            System.out.println("Возобновление потока Один");
            ob2.mySuspend();
            System.out.println("Приостанова потока Два");
            ob2.myResume();
            System.out.println("Возобновление потока Два");
        } catch (InterruptedException e)  {
            System.out.println("Главный поток прерван");
        }

        try {
            System.out.println("Ожидание зваершения потоков");
            ob1.t.join();
            ob1.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
//class MultiThreadDemo {
//    public static void main(String[] args) {
//        new NewThread("Один");
//        new NewThread("Два");
//        new NewThread("Три");
//
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            System.out.println("Главный поток прерван");
//        }
//        System.out.println("Главный поток завершен.");
//    }
//}