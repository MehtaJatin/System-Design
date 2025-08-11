package org.concepts.observer;

import java.util.ArrayList;
import java.util.List;

public class AmazonStock implements Observable {
    private double stockPrice;
    private List<Observer> observersList;

    public AmazonStock() {
        observersList = new ArrayList<>();
    }
    /**
     * @param observer
     */
    @Override
    public void addObserver(Observer observer) {
        observersList.add(observer);
    }

    /**
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        observersList.remove(observer);
    }

    /**
     * @param price
     */
    @Override
    public void setState(double price) {
        this.stockPrice = price;
        notfiyObservers(price);
    }

    private void notfiyObservers(double price) {
        for (Observer observer : observersList) {
            observer.update("Amazon", price);
        }
    }
}
