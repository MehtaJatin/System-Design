package org.design.patterns.bridge;

public class BMWManufacturer implements VehicleManufacturer {
    /**
     *
     */
    @Override
    public void manufactureBus() {
        System.out.println("Manufacturing BMW Bus");
    }

    /**
     *
     */
    @Override
    public void manufactureCar() {
        System.out.println("Manufacturing BMW Car");
    }

}
