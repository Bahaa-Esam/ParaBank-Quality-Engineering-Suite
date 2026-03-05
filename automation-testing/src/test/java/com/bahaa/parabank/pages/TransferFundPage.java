package com.bahaa.parabank.pages;

import com.bahaa.parabank.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransferFundPage extends BasePage {

    private final By amountField = By.id("amount");
    private final By fromAccountDropdown = By.id("fromAccountId");
    private final By toAccountDropdown = By.id("toAccountId");
    private final By transferBtn = By.xpath("//input[@value='Transfer']");
    private final By transferCompleteMessage = By.xpath("//h1[text()='Transfer Complete!']");

    public TransferFundPage(WebDriver driver) {
        super(driver);
    }

    public void transferMoney(String amount, String fromAccountId, String toAccountId) {
        sendKeysToElement(amountField, amount);
        selectFromDropdown(fromAccountDropdown, fromAccountId);
        selectFromDropdown(toAccountDropdown, toAccountId);
        clickOnElement(transferBtn);
    }
    public String getFirstAvailableAccount() {
        Select dropdown = new Select(driver.findElement(fromAccountDropdown));
        return dropdown.getFirstSelectedOption().getText();
    }

    public boolean isSuccessMessageDisplayed() {
        return new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(transferCompleteMessage))
                .isDisplayed();
    }
}