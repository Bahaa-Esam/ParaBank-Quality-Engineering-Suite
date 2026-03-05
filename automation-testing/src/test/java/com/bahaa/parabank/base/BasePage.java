package com.bahaa.parabank.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    // Default timeout in seconds
    public static final long WAIT_TIME = 30;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
    }

    // ------------------------------------------------------
    // Core Actions
    // ------------------------------------------------------

    /** Wait for element to be clickable then click */
    public void clickOnElement(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    }

    /** Wait for visibility, clear existing text, then type */
    public void sendKeysToElement(By locator, String value){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        WebElement element = driver.findElement(locator);
        element.sendKeys(value);
    }

    /** Get text safely (Trims spaces & handles errors) */
    public String  getTextFromElement(By locator){
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return driver.findElement(locator).getText().trim();
        }catch (Exception e){
            System.out.println("Error getting text from element: "+e.getMessage());
            return "";
        }
    }

    // ------------------------------------------------------
    // Verification Helpers
    // ------------------------------------------------------

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    /** Check visibility using Default Wait */
    public boolean isElemenVisible  (By locator){
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return driver.findElement(locator).isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    /** Check visibility using Custom Timeout */
    public boolean isElementVisible(By locator, long timeout){
        try{
            new WebDriverWait(driver, Duration.ofSeconds(timeout))
                    .until(ExpectedConditions.elementToBeClickable(locator));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /** Check invisibility using Default Wait */
    public boolean isElementInVisible(By locator){
        return isElementVisible(locator, WAIT_TIME);
    }

    /** Check invisibility using Custom Timeout */
    public boolean isElementInVisible (By locator, long timeout){
        try{
            new WebDriverWait(driver, Duration.ofSeconds(timeout))
                    .until(ExpectedConditions.elementToBeClickable(locator));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    // ------------------------------------------------------
    // Dropdown Handling
    // ------------------------------------------------------

    /**
     * Selects an option from a standard HTML <select> dropdown by its visible text.
     *
     * @param locator The locator of the <select> element (not the option!).
     * @param text    The exact text to select (e.g., "12345").
     */
    public void selectFromDropdown(By locator, String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Select dropdown = new Select(driver.findElement(locator));
        dropdown.selectByVisibleText(text);
    }

}
