package org.example.banking;

public class savingsaccount extends bankaccount{
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName); // public - accessible
        System.out.println("Account Type: " + accountType);         // protected - accessible
        // System.out.println("Balance: " + balance);               // private - not accessible
        System.out.println("Balance: " + getBalance());             // protected method - accessible
        System.out.println("Account Number: " + getMaskedAccountNumber()); // default - same package
    }
}
