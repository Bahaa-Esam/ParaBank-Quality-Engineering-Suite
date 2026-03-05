package com.bahaa.parabank.base;

import com.bahaa.parabank.utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    protected WebDriver driver;
    protected static Properties prop;

    static {
        prop = new Properties();
        try (FileInputStream fis = new FileInputStream("src/test/resources/config.properties")) {
            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Could not load configuration file: " + e.getMessage());
        }
    }

    @BeforeMethod
    public void setup() {
        initializeDriver();
        configureBrowser();
        driver.get(prop.getProperty("url"));
    }

    private void initializeDriver() {
        String browser = prop.getProperty("browser", "chrome");
        driver = BrowserFactory.getBrowser(browser);
    }

    private void configureBrowser() {
        driver.manage().window().maximize();

        long waitTime = Long.parseLong(prop.getProperty("implicitWait", "10"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}