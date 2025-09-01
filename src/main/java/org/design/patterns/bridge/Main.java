package org.design.patterns.bridge;

public class Main {
    public static void main(String[] args) {
        VehicleManufacturer vehicleManufacturer = new BMWManufacturer();
        Vehicle vehicleCar = new Car(vehicleManufacturer);
        Vehicle vehicleBus = new Bus(vehicleManufacturer);
        vehicleCar.assemble();
        vehicleBus.assemble();

    }
}
