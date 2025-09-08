package org.example.banking;

public class bankaccount {
    private String accountNumber;
    private double balance;
    protected String accountType;
    public String accountHolderName;
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            logTransaction("Deposit", amount);
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            logTransaction("Withdraw", amount);
        }
    }

    private void logTransaction(String type, double amount) {
        // Only accessible within this class
        System.out.println("Transaction: " + type + " of $" + amount);
    }

    protected double getBalance() {
        return balance;
    }

    String getMaskedAccountNumber() {
        // Default access - accessible within the same package
        if (accountNumber.length() >= 4) {
            return "****" + accountNumber.substring(accountNumber.length() - 4);
        }
        return "****";
    }
}
