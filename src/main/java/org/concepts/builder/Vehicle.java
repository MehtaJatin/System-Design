package org.concepts.builder;

public class Vehicle {
    private final String tyre;
    private final String brakes;

    public Vehicle(String tyre, String brakes) {
        this.brakes = brakes;
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "tyre='" + tyre + '\'' +
                ", brakes='" + brakes + '\'' +
                '}';
    }
}
