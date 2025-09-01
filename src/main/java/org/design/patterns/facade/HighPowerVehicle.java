package org.design.patterns.facade;

import java.util.List;

public class HighPowerVehicle implements VehicleType {
    /**
     * @return
     */
    @Override
    public List<Vehicle> getVehicles() {
        return List.of(new Vehicle("BMW"), new Vehicle("Audi"));
    }
}
