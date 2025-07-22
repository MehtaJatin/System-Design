package org.concepts.factory;

public class Client {
    Vehicle vehicle;
    public Client(VehicleFactory factory) {
        this.vehicle = factory.createInstance();
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }
}
