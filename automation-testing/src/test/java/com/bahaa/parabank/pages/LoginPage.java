package com.bahaa.parabank.pages;

import com.bahaa.parabank.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By usernameField = By.name("username");
    private final By passwordField = By.name("password");
    private final By login_btn = By.cssSelector("input[value=\"Log In\"]");
    private final By errorMsg = By.cssSelector("p.error");

    public void enterUsername(String username) {
        sendKeysToElement(usernameField, username);
    }
    public void enterPassword(String password) {
        sendKeysToElement(passwordField, password);
    }
    public void clickLoginBtn() {
        clickOnElement(login_btn);
    }
    public HomePage doLogin(String username, String password){
        enterUsername(username);
        enterPassword(password);
        clickLoginBtn();
        return new HomePage(driver);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMsg);
    }
}

