package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivity;
import com.zerobank.pages.AccountSummary;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityNavigationStepDefs {


    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String accountsLabel) {
    switch (accountsLabel){
        case "Savings":
            new AccountSummary().savings.click();
            break;
        case "Loan":
            new AccountSummary().loan.click();
            break;
        case "Credit Card":
            new AccountSummary().creditCard.click();
            break;
        case "Brokerage":
            new AccountSummary().brokerage.click();
            break;
        case "Checking":
            new AccountSummary().checking.click();
            break;


    }

    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        Assert.assertTrue(Driver.get().getTitle().contains("Account Activity"));
    }

    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String dropdownExcepted) {

        Select select= new Select(new AccountActivity().accountDropdown);
        Assert.assertEquals(dropdownExcepted,select.getFirstSelectedOption().getText());

    }


}
