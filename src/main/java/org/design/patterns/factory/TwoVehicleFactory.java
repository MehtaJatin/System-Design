package org.design.patterns.factory;

public class TwoVehicleFactory implements VehicleFactory{

    /**
     * @return
     */
    @Override
    public Vehicle createInstance() {
        return new TwoWheeler();
    }
}
