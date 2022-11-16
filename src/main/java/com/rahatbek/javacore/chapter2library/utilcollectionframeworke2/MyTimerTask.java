package com.rahatbek.javacore.chapter2library.utilcollectionframeworke2;

import java.util.Timer;
import java.util.TimerTask;

// TODO: REMEMBER this code and read more about it
public class MyTimerTask extends TimerTask {
    public void run() {
        System.out.println("Задание по таймеру выполняется.");
    }
}

class TTest {
    public static void main(String[] args) {
        MyTimerTask myTask = new MyTimerTask();
        Timer myTimer = new Timer();

        myTimer.schedule(myTask, 1000, 500);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
        myTimer.cancel();
    }
}