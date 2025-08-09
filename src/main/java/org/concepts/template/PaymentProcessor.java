package org.concepts.template;

public abstract class PaymentProcessor {
    PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(PaymentContext paymentContext) {
        authenticateUser();
        validatePayment(paymentContext);
        paymentStrategy.processPayment(paymentContext);
        sendReceipt(paymentContext);
    }

    private void authenticateUser() {
        System.out.println("Authenticating user");
    }

    private void validatePayment(PaymentContext paymentContext) {
        System.out.println("Validating payment");
    }

    private void sendReceipt(PaymentContext paymentContext) {
        System.out.println("Sending receipt");
    }
}
