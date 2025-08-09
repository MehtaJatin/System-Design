package org.concepts.template;

public class OnlinePaymentProcessor extends PaymentProcessor {
    public OnlinePaymentProcessor(PaymentStrategy paymentStrategy) {
        super(paymentStrategy);
    }
}
