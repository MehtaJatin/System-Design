package org.design.patterns.abstractFactory;

public class Client {
    private final Vehicle fourWheeler;
    private final Vehicle twoWheeler;
    public Client(AbstractVehicleFactory abstractVehicleFactory) {
        fourWheeler = abstractVehicleFactory.createFourWheeler();
        twoWheeler = abstractVehicleFactory.createTwoWheeler();
    }

    public Vehicle getFourWheeler() {
        return this.fourWheeler;
    }

    public Vehicle getTwoWheeler() {
        return this.twoWheeler;
    }

}
