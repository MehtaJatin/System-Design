package org.concepts.state;

public class OrderManager {
    private OrderState state;

    public void setState(OrderState state) {
        this.state = state;
    }

    public void confirmOrder() {
        state.confirmOrder(this);
    }

    public void shipOrder() {
        state.shipOrder(this);
    }

    public void deliverOrder() {
        state.deliverOrder(this);
    }

    public void cancelOrder() {
        state.cancelOrder(this);
    }
}
