package com.example.converter.observer;

 ///ust prints with a different tag so we see two listeners.
public final class LogObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("[LogObserver] " + message);
    }
}
