package org.example.upi;

public class PayPalPayment extends BasePayment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        logTransaction("PayPal", amount);
    }

    // Overloaded: Pass email
    public void processPayment(double amount, String email, String currency) {
        System.out.println("Processing PayPal payment of " + amount + " " + currency + " for " + email);
        logTransaction("PayPal", amount);
    }
}
