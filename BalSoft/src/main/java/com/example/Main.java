package com.example;


import com.example.logistics.Logistics;
import com.example.logistics.RoadLogistics;
import com.example.logistics.SeaLogistics;

public class Main {
    public static void main(String[] args) {
        Logistics road = new RoadLogistics();
        road.planDelivery();

        Logistics sea = new SeaLogistics();
        sea.planDelivery();
    }
}

