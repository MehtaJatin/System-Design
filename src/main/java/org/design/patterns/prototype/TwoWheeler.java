package org.design.patterns.prototype;

public class TwoWheeler implements Vehicle {
    private final String tyre;
    private final String brakes;

    public TwoWheeler(String tyre, String brakes) {
        this.tyre = tyre;
        this.brakes = brakes;
    }

    @Override
    public Vehicle clone() {
        return new TwoWheeler(this.tyre, this.brakes);
    }

    @Override
    public String toString() {
        return "TwoWheeler{" +
                "tyre='" + tyre + '\'' +
                ", brakes='" + brakes + '\'' +
                '}';
    }
}
