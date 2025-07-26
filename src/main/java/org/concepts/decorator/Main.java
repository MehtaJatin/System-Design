package org.concepts.decorator;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new TwoWheeler();
        vehicle = new TyreUpgrade(vehicle);
        vehicle.assemble();
    }
}
