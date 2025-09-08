package org.example.banking;

public class Main {
    public static void main(String[] args) {
        bankaccount bankAccount = new bankaccount();
        bankAccount.accountHolderName = "Alice Smith";
        bankAccount.deposit(1000);
        bankAccount.withdraw(300);
        // bankAccount.logTransaction("Test", 0);
        bankAccount.setAccountNumber("1234567890");

        System.out.println("Masked Account Number: " + bankAccount.getMaskedAccountNumber()); // ✅ default - accessible

        System.out.println("-------------");

        savingsaccount savings = new savingsaccount();
        savings.accountHolderName = "Bob Johnson";
        savings.accountType = "Savings";
        savings.deposit(5000);
        savings.withdraw(1500);
        savings.setAccountNumber("9876543210");

        savings.displayAccountDetails();


        operations ops = new operations();
        ops.showAccountInfo(savings);

        System.out.println("-------------");

    }

}
