package com.example.tests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class DataDrivenGetTest {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @DataProvider(name = "postIds")
    public Object[][] getPostIds() {
        return new Object[][] {
            {1, 1},   // postId, expectedUserId
            {2, 1},
            {3, 1},
            {4, 1},
            {5, 1}
        };
    }
}