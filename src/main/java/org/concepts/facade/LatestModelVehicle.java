package org.concepts.facade;

import java.util.List;

public class LatestModelVehicle implements VehicleType {

    /**
     * @return
     */
    @Override
    public List<Vehicle> getVehicles() {
        return List.of(new Vehicle("Maruti"), new Vehicle("Honda"));
    }
}
