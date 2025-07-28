package org.concepts.facade;

public class Main {
    public static void main(String[] args) {
        VehicleAgency vehicleAgency = new VehicleAgencyImpl();
        System.out.println(vehicleAgency.getHigPowerVehicles());
        System.out.println(vehicleAgency.getLatestModelVehicles());
    }
}
