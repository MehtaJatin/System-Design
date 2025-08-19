package org.concepts.state;

public class Main {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager();
        manager.setState(new PendingOrder());
        manager.shipOrder();
        manager.confirmOrder();
        manager.deliverOrder();
        manager.cancelOrder();
    }
}
