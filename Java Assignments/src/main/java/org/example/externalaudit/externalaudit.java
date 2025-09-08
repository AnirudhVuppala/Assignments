package org.example.externalaudit;

import org.example.banking.bankaccount;

public class externalaudit {
    public void auditAccount(bankaccount account) {
        System.out.println("Auditing account of: " + account.accountHolderName); // ✅ public - accessible

        // The following are NOT accessible from outside the package:
        // System.out.println(account.accountType);           // ❌ protected
        // System.out.println(account.getBalance());          // ❌ protected
        // System.out.println(account.getMaskedAccountNumber()); // ❌ default
        // System.out.println(account.balance);               // ❌ private
        // account.logTransaction("Audit", 0);                // ❌ private
    }
}
