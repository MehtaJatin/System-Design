package org.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class MetaStock implements Observable {
    double stockPrice;
    private List<Observer> observersList;

    public MetaStock() {
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
            observer.update("Meta", price);
        }
    }
}

