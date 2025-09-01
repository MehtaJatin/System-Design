package org.design.patterns.bridge;

public class Bus extends Vehicle {

    public Bus(VehicleManufacturer vehicleManufacturer) {
        super(vehicleManufacturer);
    }

    @Override
    public void assemble() {
        vehicleManufacturer.manufactureBus();
    }
}
