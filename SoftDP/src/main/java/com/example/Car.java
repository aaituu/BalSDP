package com.example;

public class Car {
    private String model;
    private String color;
    private int year;
    private boolean hasGPS;

    Car(CarBuilder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.year = builder.year;
        this.hasGPS = builder.hasGPS;
    }

    @Override
    public String toString() {
        return "Model = " + model +
                ", Color = " + color +
                ", Year = " + year +
                ", hasGPS = " + hasGPS;
    }

}



