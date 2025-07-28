package org.concepts.facade;

import java.util.List;

public class VehicleAgencyImpl implements VehicleAgency {

    VehicleType highPowerVehicle;
    VehicleType latestModelVehicle;

    public VehicleAgencyImpl() {
        this.highPowerVehicle = new HighPowerVehicle();
        this.latestModelVehicle = new LatestModelVehicle();
    }

    /**
     * @return
     */
    @Override
    public List<Vehicle> getHigPowerVehicles() {
        return highPowerVehicle.getVehicles();
    }

    /**
     * @return
     */
    @Override
    public List<Vehicle> getLatestModelVehicles() {
        return latestModelVehicle.getVehicles();
    }
}
