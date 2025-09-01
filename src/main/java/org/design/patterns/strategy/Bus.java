package org.design.patterns.strategy;

public class Bus implements Transportation {
    /**
     * @param distance
     * @return
     */
    @Override
    public int calculateFare(int distance) {
        return distance * 10;
    }
}
