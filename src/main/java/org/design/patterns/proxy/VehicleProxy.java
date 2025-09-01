package org.design.patterns.proxy;

public class VehicleProxy implements Vehicle {
    Vehicle vehicle;

    @Override
    public void assemble() {
       if (vehicle == null) {
           vehicle = new TwoWheeler();
       }
       vehicle.assemble();
    }
}
