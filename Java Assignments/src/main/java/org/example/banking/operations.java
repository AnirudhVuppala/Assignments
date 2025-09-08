package org.example.banking;

public class operations {
    public void showAccountInfo(bankaccount account) {
        System.out.println("Account Holder: " + account.accountHolderName);
        // System.out.println("Account Type: " + account.accountType);
        System.out.println("Masked Account Number: " + account.getMaskedAccountNumber()); // default - accessible

        // System.out.println(account.balance);    //
        // account.logTransaction("Test", 0);      //
        // System.out.println(account.getBalance()); //
    }

}
