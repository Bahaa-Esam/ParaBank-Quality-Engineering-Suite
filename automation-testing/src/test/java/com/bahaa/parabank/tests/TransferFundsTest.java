package com.bahaa.parabank.tests;

import com.bahaa.parabank.api.AccountClient;
import com.bahaa.parabank.base.BaseTest;
import com.bahaa.parabank.pages.HomePage;
import com.bahaa.parabank.pages.LoginPage;
import com.bahaa.parabank.pages.TransferFundPage;
import com.bahaa.parabank.utils.DataGenerator;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Map;

public class TransferFundsTest extends BaseTest {

    private String validUsername;
    private String validPassword;

    @BeforeMethod
    public void setupDataViaApi() {
        Map<String, String> requestPayload = DataGenerator.generateCustomerPayload();
        validUsername = requestPayload.get("customer.username");
        validPassword = requestPayload.get("customer.password");

        String baseApiUrl = prop.getProperty("apiUrl");
        Response response = AccountClient.registerCustomer(baseApiUrl, requestPayload);

        Assert.assertEquals(response.statusCode(), 200, "API Registration Failed");
    }

    @Test
    public void testTransferMoneySuccessfully() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.doLogin(validUsername, validPassword);

        TransferFundPage transferPage = homePage.openTransferFundsLink();

        String activeAccount = transferPage.getFirstAvailableAccount();
        transferPage.transferMoney("100", activeAccount, activeAccount);

        Assert.assertTrue(transferPage.isSuccessMessageDisplayed(), "Transfer message not displayed");
    }
}