package org.design.patterns.facade;

import java.util.List;

public interface VehicleAgency {
    List<Vehicle> getHigPowerVehicles();
    List<Vehicle> getLatestModelVehicles();
}
