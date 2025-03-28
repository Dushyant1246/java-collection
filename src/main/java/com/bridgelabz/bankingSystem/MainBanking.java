package com.bridgelabz.bankingSystem;

public class MainBanking {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Open accounts
        bank.openAccount(101, 5000.00);
        bank.openAccount(102, 3000.00);
        bank.openAccount(103, 7000.00);
        bank.openAccount(104, 4000.00);

        // Request withdrawals
        bank.requestWithdrawal(102);
        bank.requestWithdrawal(103);

        // Display sorted accounts
        bank.displaySortedAccounts();

        // Process withdrawals
        bank.processWithdrawals();
    }
}
/*
Withdrawal request added for Account: 102
Withdrawal request added for Account: 103

Accounts Sorted by Balance:
Account: 102 -> Balance: $3000.0
Account: 104 -> Balance: $4000.0
Account: 101 -> Balance: $5000.0
Account: 103 -> Balance: $7000.0
Processing withdrawal for Account: 102
Processing withdrawal for Account: 103
 */