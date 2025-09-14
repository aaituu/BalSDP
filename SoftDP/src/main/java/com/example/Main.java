package com.example;

public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setModel("BMW")
                .setColor("Black")
                .setYear(2024)
                .setHasGPS(true)
                .build();

        System.out.println(car);

    }
}




