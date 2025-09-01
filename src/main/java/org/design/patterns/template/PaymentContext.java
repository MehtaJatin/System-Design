package org.design.patterns.template;

public class PaymentContext {
    String upiId;
    double amount;
    String creditCardNumber;

    public PaymentContext(String upiId, double amount, String creditCardNumber) {
        this.upiId = upiId;
        this.amount = amount;
        this.creditCardNumber = creditCardNumber;
    }
}
