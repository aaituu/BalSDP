package com.example;


public class LengthAdapter implements MetricTarget {

    // The Adapter holds a reference to the Adaptee (ImperialData).
    private final ImperialData imperialData;

    //  Using a named constant instead of a "magic number".
    private static final double MILES_TO_KM_FACTOR = 1.60934;

    public LengthAdapter(ImperialData imperialData) {
        // Initializes the link to the incompatible object
        this.imperialData = imperialData;
    }

    @Override
    public double getDistanceInKilometers() {

        // 1. Get the incompatible data (miles)
        double miles = imperialData.getDistanceInMiles();

        // 2.  Convert miles to kilometers
        double kilometers = miles * MILES_TO_KM_FACTOR;

        // 3. Return the adapted result
        return kilometers;
    }
}