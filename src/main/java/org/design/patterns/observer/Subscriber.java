package org.design.patterns.observer;

public class Subscriber implements Observer {
    private String name;
    public Subscriber(final String name) {
        this.name = name;
    }


    /**
     * @param price
     */
    @Override
    public void update(final String stock, final double price) {
        System.out.println("Price of " + stock + " stock is " + price);
    }
}
