package org.design.patterns.strategy;

public class Main {
    public static void main(String[] args) {
        Trip trip = new Trip(new Bus());
        int fare = trip.calculateTripAmount(125);
        System.out.println("Trip Fare by Bus: " + fare);


        Trip trip2 = new Trip(new Train());
        int fare2 = trip2.calculateTripAmount(125);
        System.out.println("Trip Fare by Train: " + fare2);

    }
}
