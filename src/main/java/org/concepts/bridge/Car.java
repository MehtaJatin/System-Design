package org.concepts.bridge;

public class Car extends Vehicle {


    public Car(VehicleManufacturer vehicleManufacturer) {
        super(vehicleManufacturer);
    }

    /**
     *
     */
    @Override
    public void assemble() {
        vehicleManufacturer.manufactureCar();
    }
}
