package org.concepts.adapter;

public class Main {
    public static void main(String[] args) {
        VehicleAdapter vehicleAdapter = new VehicleAdapter();
        Vehicle vehicle = new TwoWheeler(vehicleAdapter);
        vehicle.assemble(new VehicleParts("abc"));
    }
}
