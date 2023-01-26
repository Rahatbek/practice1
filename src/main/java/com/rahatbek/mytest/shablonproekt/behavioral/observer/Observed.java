package com.rahatbek.mytest.shablonproekt.behavioral.observer;

public interface Observed {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
