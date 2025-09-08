package org.example.upi;

public class CreditCardPayment extends BasePayment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount);
        logTransaction("Credit Card", amount);
    }

    public void processPayment(double amount, String cardNumber) {
        System.out.println("Processing $" + amount + " using Credit Card: ****" + cardNumber.substring(cardNumber.length() - 4));
        logTransaction("Credit Card", amount);
    }
}

