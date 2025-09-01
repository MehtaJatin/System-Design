package org.design.patterns.template;

public class UPI implements PaymentStrategy {
    @Override
    public void processPayment(PaymentContext paymentContext) {
        System.out.println("Paying " + paymentContext.amount + " using UPI");
    }
}
