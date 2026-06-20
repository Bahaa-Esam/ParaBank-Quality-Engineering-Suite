package com.bahaa.parabank.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public static WebDriver getBrowser(String browserName) {
        WebDriver driver;
        browserName = browserName.toLowerCase().trim();
        switch (browserName) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                 driver = new FirefoxDriver();
                    break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "chrome-headless":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless=new");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--window-size=1920,1080");
                driver = new ChromeDriver(options);
                break;
            default:
                throw new IllegalArgumentException("Browser not supported: " + browserName);
        }
        return driver;
    }
}
