package org.concepts.bridge;

public abstract class Vehicle {
    VehicleManufacturer vehicleManufacturer;

    public Vehicle(VehicleManufacturer vehicleManufacturer) {
        this.vehicleManufacturer = vehicleManufacturer;
    }

    public abstract void assemble();
}
