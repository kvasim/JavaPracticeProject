package com.desingpattern.behavioral.observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObeserver();
}
