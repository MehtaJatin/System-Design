package org.concepts.abstractFactory;

public class MarutiVehicleFactory extends AbstractVehicleFactory {
    /**
     * @return
     */
    @Override
    public Vehicle createTwoWheeler() {
        return new MarutiTwoWheeler();
    }

    /**
     * @return
     */
    @Override
    Vehicle createFourWheeler() {
        return new MarutiFourWheeler();
    }
}
