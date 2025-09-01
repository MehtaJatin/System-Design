package org.design.patterns.strategy;

public class Trip {
    Transportation transportation;

    public Trip(Transportation transportation) {
        this.transportation = transportation;
    }

    public int calculateTripAmount(int distance) {
        return transportation.calculateFare(distance);
    }
}
