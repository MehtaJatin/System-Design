package org.concepts.state;

public class CancelledOrder implements OrderState {
    @Override
    public void confirmOrder(OrderManager manager) {
        System.out.println("Order is already confirmed");
    }

    @Override
    public void shipOrder(OrderManager manager) {
        System.out.println("Order is already shipped");
    }

    @Override
    public void deliverOrder(OrderManager manager) {
        System.out.println("Order is already delivered");
    }

    @Override
    public void cancelOrder(OrderManager manager) {
        System.out.println("Order is already cancelled");
    }
}
