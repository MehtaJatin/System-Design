package org.concepts.decorator;

public abstract class VehicleUpgrade implements Vehicle {
    Vehicle vehicle;

    public VehicleUpgrade(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void assemble() {
        vehicle.assemble();
    }
}
