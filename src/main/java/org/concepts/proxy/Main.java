package org.concepts.proxy;

public class Main {
    public static void main(String[] args) {
        VehicleProxy proxy = new VehicleProxy();
        proxy.assemble(); //assemble tyre and brakes
        System.out.printf("\n");

        proxy.assemble(); //return assembled vehicle
    }
}
