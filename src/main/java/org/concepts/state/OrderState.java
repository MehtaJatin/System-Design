package org.concepts.state;

public interface OrderState {
    void confirmOrder(OrderManager manager);
    void shipOrder(OrderManager manager);
    void deliverOrder(OrderManager manager);
    void cancelOrder(OrderManager manager);
}
