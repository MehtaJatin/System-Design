package org.design.patterns.template;

public class OnlinePaymentProcessor extends PaymentProcessor {
    public OnlinePaymentProcessor(PaymentStrategy paymentStrategy) {
        super(paymentStrategy);
    }
}
