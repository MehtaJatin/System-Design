package org.design.patterns.bridge;

public class MarutiManufacturer implements VehicleManufacturer {
    @Override
    public void manufactureBus() {
        System.out.println("Manufacturing Maruti Bus");
    }

    /**
     *
     */
    @Override
    public void manufactureCar() {
        System.out.println("Manufacturing Maruti Car");
    }
}
