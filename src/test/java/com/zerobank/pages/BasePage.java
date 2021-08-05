package com.zerobank.pages;


import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BasePage {
    @FindBy(css = "span.title-level-1")
    public List<WebElement> menuOptions;


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//ul[@class='nav nav-tabs']//a[text()='Account Summary']")
    public WebElement accountSummary;
    @FindBy(xpath = "//ul[@class='nav nav-tabs']//a[text()='Account Activity']")
    public WebElement accountActivity;
    @FindBy(xpath = "//ul[@class='nav nav-tabs']//a[text()='Transfer Funds']")
    public WebElement transferfunds;
    @FindBy(xpath = "//ul[@class='nav nav-tabs']//a[text()='Pay Bills']")
    public WebElement payBills;
    @FindBy(xpath = "//ul[@class='nav nav-tabs']//a[text()='My Money Map']")
    public WebElement myMoneyMap;
    @FindBy(xpath = "//ul[@class='nav nav-tabs']//a[text()='Online Statements']")
    public WebElement onlineStatements;

    @FindBy(xpath = "(//li[@class='dropdown'])[2]")
    public WebElement userName;

    @FindBy(xpath = "(//li[@class='dropdown'])[1]")
    public WebElement settings;

    @FindBy(css = "#logout_link")
    public WebElement logOutLink;

    @FindBy(css = "#searchTerm")
    public WebElement searchBox;

    public String getUserName(){
        BrowserUtils.waitForVisibility(userName, 5);
        return userName.getText();
    }

    public void logOut(){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(userName);
        BrowserUtils.clickWithJS(logOutLink);
    }

    public void search(String item){
        searchBox.sendKeys(item+ Keys.ENTER);
    }



}
