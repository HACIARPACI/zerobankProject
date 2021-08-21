package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
    new LoginPage().login();
    }
    @Given("the user is logged in {string} and {string}")
    public void the_user_enters_and(String username, String password) {
        new LoginPage().login(username,password);

    }


    @Then("the user should see the the title {string}")
    public void the_user_should_see_the_the_title(String expectedTitle) {
        Assert.assertEquals(expectedTitle,Driver.get().getTitle());
    }


    @Then("the user should see the message {string}")
    public void the_user_should_see_the_message(String expected) {

        Assert.assertEquals(expected,new LoginPage().errorMessage.getText());

    }



}
