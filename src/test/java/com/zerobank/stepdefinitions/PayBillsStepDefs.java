package com.zerobank.stepdefinitions;

import com.zerobank.pages.*;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class PayBillsStepDefs {





    @Given("Add New Payee tab")
    public void add_New_Payee_tab() {
        new LoginPage().login();
        new AccountSummary().payBills.click();
        new PayBills().addNewPayee.click();

    }

    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String,String>information) {
        new AddNewPayee().payeeName.sendKeys(information.get("Payee Name"));
        new AddNewPayee().payeeAdress.sendKeys(information.get("Payee Address"));
        new AddNewPayee().payeeAccount.sendKeys(information.get("Account"));
        new AddNewPayee().payeeDetails.sendKeys(information.get("Payee Details"));

        new AddNewPayee().addButton.click();
    }

    @Then("message {string} should be displayed")
    public void message_The_new_payee_should_be_displayed(String expectedMessage) {
        Assert.assertEquals(expectedMessage,new PayBills().theMessage.getText());

    }

    @Given("the user accesses the Purchase foreign currency cash tab")
    public void the_user_accesses_the_Purchase_foreign_currency_cash_tab() {
        new LoginPage().login();
        new AccountSummary().payBills.click();
        new PayBills().purchaseForeignCurrency.click();
        BrowserUtils.waitFor(2);

    }

    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> expectedCurrenyOptions) {

        Select select = new Select(new PurchaseForeignCurrency().currencyDropdown);
        List<WebElement> options = select.getOptions();
        List<String> actualCurrencyOptions = BrowserUtils.getElementsText(options);

        Assert.assertTrue(actualCurrencyOptions.containsAll(expectedCurrenyOptions));


    }
    @When("user tries to calculate cost without selecting a currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {
        new PurchaseForeignCurrency().amount.sendKeys("45");
        new PurchaseForeignCurrency().calculateButton.click();

    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {


    Alert alert= Driver.get().switchTo().alert();
     Assert.assertFalse(alert.getText().isEmpty());
    }
    @When("user tries to calculate cost without entering a value")
    public void user_tries_to_calculate_cost_without_entering_a_value() {

        Select select= new Select(new PurchaseForeignCurrency().currencyDropdown);
        select.selectByIndex(12);
        new PurchaseForeignCurrency().calculateButton.click();

    }


}
