
package com.atm;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

public class ATMSteps {

    private ATMService atm;
    private String result;
    private boolean pinAccepted;

    @Given("the ATM system is ready")
    public void atmIsReady() {
        atm = new ATMService();
    }

    @When("the user enters PIN {string}")
    public void userEntersPin(String pin) {
        pinAccepted = atm.verifyPin(pin);
    }

    @Then("the PIN should be accepted")
    public void pinShouldBeAccepted() {
        assertTrue(pinAccepted);
    }

    @When("the user enters an incorrect PIN three times")
    public void userEntersIncorrectPinThreeTimes() {
        atm.verifyPin("1111");
        atm.verifyPin("2222");
        atm.verifyPin("3333");
    }

    @Then("the account should be locked")
    public void accountShouldBeLocked() {
        assertTrue(atm.isAccountLocked());
    }

    @When("the user withdraws {double}")
    public void userWithdraws(double amount) {
        result = atm.withdraw(amount);
    }

    @Then("the transaction should fail with {string}")
    public void transactionShouldFail(String expectedMessage) {
        assertEquals(expectedMessage, result);
    }

    @Then("the remaining balance should be {double}")
    public void remainingBalanceShouldBe(double expectedBalance) {
        assertEquals(expectedBalance, atm.getBalance(), 0.01);
    }
}
