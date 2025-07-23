package org.concepts.abstractFactory;

public class SedanVehicleFactory extends AbstractVehicleFactory {
    /**
     * @return
     */
    @Override
    public Vehicle createTwoWheeler() {
        return new SedanTwoWheeler();
    }

    /**
     * @return
     */
    @Override
    Vehicle createFourWheeler() {
        return new SedanFourWheeler();
    }
}
