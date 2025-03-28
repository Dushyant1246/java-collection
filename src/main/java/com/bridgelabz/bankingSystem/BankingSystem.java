package com.bridgelabz.bankingSystem;

import java.util.*;

public class BankingSystem {
    private Map<Integer, Double> accounts = new HashMap<>();
    private TreeMap<Double, Integer> sortedBalances = new TreeMap<>();
    private Queue<Integer> withdrawalQueue = new LinkedList<>();

    // Open a new account
    public void openAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
        sortedBalances.put(balance, accountNumber);
    }

    // Request withdrawal
    public void requestWithdrawal(int accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(accountNumber);
            System.out.println("Withdrawal request added for Account: " + accountNumber);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Process withdrawal
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            System.out.println("Processing withdrawal for Account: " + accountNumber);
        }
    }

    // Display sorted accounts
    public void displaySortedAccounts() {
        System.out.println("\nAccounts Sorted by Balance:");
        sortedBalances.forEach((balance, accountNumber) -> System.out.println("Account: " + accountNumber + " -> Balance: $" + balance));
    }
}
