package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivity;
import com.zerobank.pages.AccountSummary;
import com.zerobank.pages.FindTransactions;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.util.*;
import java.util.concurrent.Callable;

public class findTransactionsStepDefs {
    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
       new LoginPage().login();
       new AccountSummary().accountActivity.click();
       new AccountActivity().findTransactions.click();

    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String fromDate, String toDate) {

        new FindTransactions().fromDate.sendKeys(fromDate);
        new FindTransactions().toDate.sendKeys(toDate);

    }

    @When("clicks search")
    public void clicks_search() {
        new FindTransactions().search.click();
        BrowserUtils.waitFor(2);
        new FindTransactions().fromDate.clear();
        new FindTransactions().toDate.clear();
        new FindTransactions().description.clear();

    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String fromDate, String toDate) {

        for ( String  str: BrowserUtils.getElementsText(new FindTransactions().dateColumnData)) {
            Assert.assertTrue(str.compareTo(fromDate)>=0&str.compareTo(toDate)<=0);
        }

        System.out.println("on numero");


    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {
        List<String> actualText = BrowserUtils.getElementsText(new FindTransactions().dateColumnData);
        List<String> expected = BrowserUtils.getElementsText(new FindTransactions().dateColumnData);

        Collections.sort(expected);
        Collections.reverse(expected);

        Assert.assertEquals(expected,actualText);

        System.out.println("onbir numero");
    }

    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String notInside) {
        List<String> elementsText = BrowserUtils.getElementsText(new FindTransactions().dateColumnData);
        Assert.assertFalse(elementsText.contains(notInside));

    }

    @When("the user enters description {string}")
    public void the_user_enters_description(String string) {

        new FindTransactions().description.sendKeys(string.toUpperCase());

    }

    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String string) {
      for(String str: BrowserUtils.getElementsText(new FindTransactions().descriptionColumnData)){
          Assert.assertTrue(str.contains(string));
      }

    }

    @Then("results table should not show descriptions containing {string}")
    public void results_table_should_not_show_descriptions_containing(String string) {
        for(String str: BrowserUtils.getElementsText(new FindTransactions().descriptionColumnData)){
            Assert.assertFalse(str.contains(string));
        }
    }


    @Then("results table should show at least one result under {string}")
    public void results_table_should_show_at_least_one_result_under(String string) {
        if(string.toLowerCase().equals("deposit")) {
            List<String> elementsText = BrowserUtils.getElementsText(new FindTransactions().depositColumnData);
            elementsText.removeIf(String::isEmpty);
            Assert.assertTrue(elementsText.size() >= 1);
        }
        if(string.toLowerCase().equals("withdrawal")) {
            List<String> elementsText = BrowserUtils.getElementsText(new FindTransactions().withdrawalColumnData);
            elementsText.removeIf(String::isEmpty);
            Assert.assertTrue(elementsText.size() >= 1);
        }
    }

    @When("user selects type {string}")
    public void user_selects_type(String string) {
       Select select= new Select(new FindTransactions().typeDropDown);
       select.selectByValue(string.toUpperCase());
    }

    @Then("results table should show no result under {string}")
    public void results_table_should_show_no_result_under(String string) {
        if (string.toLowerCase().equals("withdrawal")){
            for (String str :BrowserUtils.getElementsText(new FindTransactions().withdrawalColumnData) ) {
                Assert.assertTrue(str.isEmpty());
            }
        }
        if (string.toLowerCase().equals("deposit")){
            for (String str :BrowserUtils.getElementsText(new FindTransactions().depositColumnData) ) {
                Assert.assertTrue(str.isEmpty());
            }
        }


    }
}
