package org.design.patterns.observer;

public class Main {
    public static void main(String[] args) {
        Observable observable = new MetaStock();
        Observable observable1 = new AmazonStock();
        observable.addObserver(new Subscriber("abc"));
        observable.addObserver(new Subscriber("def"));
        observable1.addObserver(new Subscriber("abc"));
        observable.setState(100.0);
        observable1.setState(50.0);
    }
}
