
Feature: ATM Transaction System

  Scenario: Successful PIN verification
    Given the ATM system is ready
    When the user enters PIN "1234"
    Then the PIN should be accepted

  Scenario: Account gets locked after three incorrect PIN attempts
    Given the ATM system is ready
    When the user enters an incorrect PIN three times
    Then the account should be locked

  Scenario: Withdrawal with insufficient balance
    Given the ATM system is ready
    When the user withdraws 6000
    Then the transaction should fail with "Insufficient balance. Transaction failed."

  Scenario: Successful withdrawal
    Given the ATM system is ready
    When the user withdraws 1000
    Then the remaining balance should be 4000
