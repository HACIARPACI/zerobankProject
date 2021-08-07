package com.zerobank.pages;

import org.jsoup.Connection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountActivity extends BasePage {
    @FindBy(xpath = "//select[@name='accountId']")
    public WebElement accountDropdown;


    @FindBy(xpath = "//a[text()='Show Transactions']")
    public WebElement showTransactions;

    @FindBy(xpath = "//a[text()='Find Transactions']")
    public  WebElement findTransactions;
}