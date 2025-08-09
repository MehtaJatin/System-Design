package org.concepts.template;

public interface PaymentStrategy {
    void processPayment(PaymentContext paymentContext);
}
