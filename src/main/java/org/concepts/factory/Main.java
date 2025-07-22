package org.concepts.factory;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new FourVehicleFactory());
        Vehicle vehicle = client.getVehicle();
        vehicle.printVehicle();
    }
}
