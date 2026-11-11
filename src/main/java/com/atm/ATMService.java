
package com.atm;

public class ATMService {

    private static final String PIN = "1234";
    private double balance = 5000.0;
    private int attempts = 0;
    private boolean accountLocked = false;

    // 1. Verify ATM PIN
    public boolean verifyPin(String enteredPin) {

        if (accountLocked) {
            return false;
        }

        if (PIN.equals(enteredPin == null ? "" : enteredPin.trim())) {
            return true;
        }

        attempts++;

        if (attempts >= 3) {
            accountLocked = true;
        }

        return false;
    }

    // 2. Validate account type
    public boolean isValidAccountType(String type) {

        return type != null &&
              (type.equalsIgnoreCase("Savings") ||
               type.equalsIgnoreCase("Current"));
    }

    // 3. Withdraw money
    public String withdraw(double amount) {

        if (amount <= 0) {
            return "Withdrawal amount must be positive.";
        }

        if (amount > balance) {
            return "Insufficient balance. Transaction failed.";
        }

        balance -= amount;

        return String.format(
            "Withdrawal successful. Remaining balance: %.2f",
            balance
        );
    }

    // 4. Get current balance
    public double getBalance() {
        return balance;
    }

    // 5. Check account lock status
    public boolean isAccountLocked() {
        return accountLocked;
    }

    // 6. Get incorrect PIN attempts
    public int getAttempts() {
        return attempts;
    }
}
