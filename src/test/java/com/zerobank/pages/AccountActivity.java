package com.zerobank.pages;

import org.jsoup.Connection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountActivity extends BasePage {
    @FindBy(xpath = "//select[@name='accountId']")
    public WebElement accountDropdown;
}
