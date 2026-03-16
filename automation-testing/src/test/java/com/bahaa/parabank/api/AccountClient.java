package com.bahaa.parabank.api;

import io.restassured.response.Response;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class AccountClient {

    private static final String REGISTER_PATH = "/register.htm";
    private static final String CREATE_ACCOUNT_PATH = "/services/bank/createAccount";
    private static final String SESSION_COOKIE = "JSESSIONID";

    public static Response registerCustomer(String baseUri, Map<String, String> payload) {
        io.restassured.filter.session.SessionFilter sessionFilter = new io.restassured.filter.session.SessionFilter();
        given()
                .baseUri(baseUri)
                .filter(sessionFilter)
                .get(REGISTER_PATH);

        return given()
                .baseUri(baseUri)
                .filter(sessionFilter)
                .contentType("application/x-www-form-urlencoded")
                .formParams(payload)
                .when()
                .post(REGISTER_PATH)
                .then()
                .extract().response();
    }

    public static Response createBankAccount(String baseUri, int customerId, int type, int fromAccount) {
        return given()
                .baseUri(baseUri)
                .header("Accept", "application/json")
                .queryParams(Map.of(
                        "customerId", customerId,
                        "newAccountType", type,
                        "fromAccountId", fromAccount
                ))
                .when()
                .post(CREATE_ACCOUNT_PATH)
                .then()
                .extract().response();
    }
}