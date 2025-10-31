package com.example.converter.observer;


//Subject — manages observers.

public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers(String message);
}
