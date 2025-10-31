package com.example.converter.observer;


 // Observer that prints to console.

public final class ConsoleObserver implements Observer {
    private final String name;

    public ConsoleObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("[" + name + "] " + message);
    }
}
