package org.concepts.template;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new OnlinePaymentProcessor(new UPI());
        PaymentContext paymentContext = new PaymentContext("upiId", 100, "");
        paymentProcessor.makePayment(paymentContext);

        System.out.println("--------");
        PaymentProcessor paymentProcessor2 = new OnlinePaymentProcessor(new CreditCard());
        PaymentContext paymentContext2 = new PaymentContext("", 100, "creditCardNumber");
        paymentProcessor2.makePayment(paymentContext2);
    }
}
