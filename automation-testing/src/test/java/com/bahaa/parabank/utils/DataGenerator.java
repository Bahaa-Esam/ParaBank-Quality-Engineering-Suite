package com.bahaa.parabank.utils;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

public class DataGenerator {

    private static final Faker FAKER = new Faker();

    public static Map<String, String> generateCustomerPayload() {
        Map<String, String> payload = new HashMap<>();
        // بنشيل أي حاجة مش حروف أو أرقام عشان السيرفر ميهنجش
        payload.put("customer.firstName", FAKER.name().firstName().replaceAll("[^a-zA-Z]", ""));
        payload.put("customer.lastName", FAKER.name().lastName().replaceAll("[^a-zA-Z]", ""));
        payload.put("customer.address.street", "Street 123");
        payload.put("customer.address.city", "Alexandria");
        payload.put("customer.address.state", "ALX");
        payload.put("customer.address.zipCode", "12345");
        payload.put("customer.phoneNumber", "0100000000");
        payload.put("customer.ssn", "999");
        payload.put("customer.username", "user" + System.currentTimeMillis());
        payload.put("customer.password", "Pass123");
        payload.put("repeatedPassword", "Pass123");
        return payload;
    }
}