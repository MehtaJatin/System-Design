package org.design.patterns.state;

public class ConfirmedOrder implements OrderState {
    @Override
    public void confirmOrder(OrderManager manager) {
        System.out.println("Order is already confirmed");
    }

    @Override
    public void shipOrder(OrderManager manager) {
        System.out.println("Shipping the order");
        manager.setState(new ShippedOrder());
    }

    @Override
    public void deliverOrder(OrderManager manager) {
        System.out.println("Order is not Shipped");
    }

    @Override
    public void cancelOrder(OrderManager manager) {
        System.out.println("Cancelling the order");
        manager.setState(new CancelledOrder());
    }
}
