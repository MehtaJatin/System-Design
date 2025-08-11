package org.concepts.observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void setState(double price);
}
