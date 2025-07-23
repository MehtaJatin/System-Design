package org.concepts.builder;

public class VehicleBuilder implements Builder<Vehicle>{
    private String tyre;
    private String brakes;

    /**
     * @return
     */
    public static VehicleBuilder builder() {
        return new VehicleBuilder();
    }

    public VehicleBuilder setTyre(String tyre) {
        this.tyre = tyre;
        return this;
    }

    public VehicleBuilder setBreaks(String breaks) {
        this.brakes = breaks;
        return this;
    }

    @Override
    public Vehicle build() {
        return new Vehicle(tyre, brakes);
    }
}
