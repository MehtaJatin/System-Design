package org.concepts.adapter;

public class VehicleAdapter implements Vehicle {
    LegacyVehicle legacyVehicle;

    VehicleAdapter() {
        legacyVehicle = new LegacyTwoWheeler();
    }

    @Override
    public void assemble(VehicleParts vehicleParts) {
        legacyVehicle.assemble(vehicleParts.tyre);
    }
}
