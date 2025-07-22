package org.concepts.factory;

public class TwoVehicleFactory implements VehicleFactory{

    /**
     * @return
     */
    @Override
    public Vehicle createInstance() {
        return new TwoWheeler();
    }
}
