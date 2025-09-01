package org.design.patterns.template;

public interface PaymentStrategy {
    void processPayment(PaymentContext paymentContext);
}
