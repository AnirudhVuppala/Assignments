package org.example.upi;

public abstract class BasePayment implements PaymentMethod {

    protected void logTransaction(String method, double amount) {
        System.out.println("[LOG] Processed " + amount + " using " + method);
    }

    public void processPayment(double amount, String currency) {
        System.out.println("Processing " + amount + " " + currency + " using " + this.getClass().getSimpleName());
        processPayment(amount);
    }

    @Override
    public abstract void processPayment(double amount);
}

