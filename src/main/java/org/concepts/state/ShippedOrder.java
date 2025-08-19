package org.concepts.state;

public class ShippedOrder implements OrderState {
    @Override
    public void confirmOrder(OrderManager manager) {
        System.out.println("Order is already confirmed");
    }

    @Override
    public void shipOrder(OrderManager manager) {
        System.out.println("Order is already shipped");
        manager.setState(new ShippedOrder());
    }

    @Override
    public void deliverOrder(OrderManager manager) {
        manager.setState(new DeliveredOrder());
    }

    @Override
    public void cancelOrder(OrderManager manager) {
        System.out.println("Cancelling the order");
    }
}
