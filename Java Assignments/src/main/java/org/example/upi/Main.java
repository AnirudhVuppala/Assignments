package org.example.upi;

public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment();
        creditCard.processPayment(1500.00);

        PaymentMethod paypal = new PayPalPayment();
        paypal.processPayment(2200.50);

        PaymentMethod upi = new UPIPayment();
        upi.processPayment(500.75);

        System.out.println("----- Overloaded methods -----");

        CreditCardPayment ccp = new CreditCardPayment();
        ccp.processPayment(1800.00, "1234567890123456");

        PayPalPayment pp = new PayPalPayment();
        pp.processPayment(3400.00, "user@example.com", "USD");

        UPIPayment up = new UPIPayment();
        up.processPayment(999.99, "user@upi");
    }
}

