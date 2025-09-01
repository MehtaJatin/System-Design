package org.design.patterns.template;

public class CreditCard implements PaymentStrategy {
    @Override
    public void processPayment(PaymentContext paymentContext) {
        System.out.println("Processing credit card payment");
    }
}
