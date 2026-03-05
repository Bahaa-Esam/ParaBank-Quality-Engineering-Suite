package com.bahaa.parabank.pages;

import com.bahaa.parabank.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private final By transferFundsLink = By.linkText("Transfer Funds");

    public TransferFundPage openTransferFundsLink(){
        clickOnElement(transferFundsLink);
        return new TransferFundPage(driver);
    }
}
