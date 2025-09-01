package org.design.patterns.factory;

public class FourVehicleFactory implements VehicleFactory {

    /**
     * @return
     */
    @Override
    public Vehicle createInstance() {
       return new FourWheeler();
    }
}
