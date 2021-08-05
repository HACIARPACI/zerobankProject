package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummary extends BasePage {

    @FindBy(xpath = "(//a[text()='Savings'])[1]")
    public WebElement savings;
    @FindBy(xpath = "(//a[text()='Brokerage'])[1]")
    public WebElement brokerage;
    @FindBy(xpath = "(//a[text()='Checking'])[1]")
    public WebElement checking;
    @FindBy(xpath = "(//a[text()='Credit Card'])[1]")
    public WebElement creditCard;
    @FindBy(xpath = "(//a[text()='Loan'])[1]")
    public WebElement loan;
}
