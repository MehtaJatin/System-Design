package org.concepts.strategy;

public class Train implements Transportation {

    /**
     * @param distance
     * @return
     */
    @Override
    public int calculateFare(int distance) {
        return distance * 5;
    }
}
