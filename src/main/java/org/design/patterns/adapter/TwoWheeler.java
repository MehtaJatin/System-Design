package org.design.patterns.adapter;

public class TwoWheeler implements Vehicle {
    VehicleAdapter vehicleAdapter;

    public TwoWheeler(VehicleAdapter vehicleAdapter) {
        this.vehicleAdapter = vehicleAdapter;
    }

    /**
     * @param vehicleParts
     * @return
     */
    @Override
    public void assemble(VehicleParts vehicleParts) {
         vehicleAdapter.assemble(vehicleParts);
    }
}
