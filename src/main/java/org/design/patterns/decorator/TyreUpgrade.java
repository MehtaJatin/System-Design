package org.design.patterns.decorator;

public class TyreUpgrade extends VehicleUpgrade {

    public TyreUpgrade(Vehicle vehicle) {
        super(vehicle);
    }

    /**
     *
     */
    @Override
    public void assemble() {
        vehicle.assemble();
        System.out.println("Tyre upgraded");
    }
}
