package com.rahatbek.javacore.chapter2library.utilcollectionframeworke2;

import java.util.Observable;
import java.util.Observer;

// Это наблюдающий класс
public class Watcher implements Observer {
    public void update(Observable obj, Object arg) {
        System.out.println("Метода update() вызван, отсчет count равен " + ((Integer) arg).intValue());
    }
}

class Watcher1 implements Observer {
    public void update(Observable obj, Object arg) {
        System.out.println("Метода update() вызван, отсчет count равен " + ((Integer) arg).intValue());
    }
}

class Watcher2 implements Observer {
    public void update(Observable obj, Object arg) {
        // по окончании выдать звуковой сигнал
        if (((Integer)arg).intValue() == 0)
            System.out.println("Готово" + '\7');
    }
}

// А это наблюдаемый класс
class BeingWatched extends Observable {
    void counter(int period) {
        for (; period >= 0; period--) {
            setChanged();
            notifyObservers(new Integer(period));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Ожидание прервано");
            }
        }
    }
}

class ObserverDemo {
    public static void main(String[] args) {
        BeingWatched observed = new BeingWatched();
        Watcher observing = new Watcher();
        // Ввусти наблюдающий объект в список наблюдателей за наблюдаемым объектом
        observed.addObserver(observing);
        observed.counter(10);
    }
}

class TwoObservers {
    public static void main(String[] args) {
        BeingWatched observed = new BeingWatched();
        Watcher1 observing1 = new Watcher1();
        Watcher2 observing2 = new Watcher2();

        observed.addObserver(observing1);
        observed.addObserver(observing2);
        observed.counter(10);
    }
}