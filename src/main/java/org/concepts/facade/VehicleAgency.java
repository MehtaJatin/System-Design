package org.concepts.facade;

import java.util.List;

public interface VehicleAgency {
    List<Vehicle> getHigPowerVehicles();
    List<Vehicle> getLatestModelVehicles();
}
