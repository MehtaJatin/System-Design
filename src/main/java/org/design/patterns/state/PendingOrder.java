package org.design.patterns.state;

public class PendingOrder implements OrderState {
    @Override
    public void confirmOrder(OrderManager manager) {
        System.out.println("Confirming order...");
        manager.setState(new ConfirmedOrder());
    }

    @Override
    public void shipOrder(OrderManager manager) {
        System.out.println("Order is not confirmed");
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
