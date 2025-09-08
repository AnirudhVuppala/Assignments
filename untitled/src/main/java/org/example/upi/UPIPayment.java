package org.example.upi;

public class UPIPayment extends BasePayment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
        logTransaction("UPI", amount);
    }

    // Overloaded with UPI ID
    public void processPayment(double amount, String upiId) {
        System.out.println("Processing ₹" + amount + " to UPI ID: " + upiId);
        logTransaction("UPI", amount);
    }
}

