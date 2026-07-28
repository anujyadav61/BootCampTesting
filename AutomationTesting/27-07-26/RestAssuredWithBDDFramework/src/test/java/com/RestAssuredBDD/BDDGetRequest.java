package com.RestAssuredBDD;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class BDDGetRequest {

    public static void main(String[] args) {

        Response response =
                given()
                .when()
                .get("https://dummy.restapiexample.com/api/v1/employees")
                .then()
                .extract()
                .response();

        // Status Code
        System.out.println("Status Code : " + response.getStatusCode());

        // Complete Response
        System.out.println("\nComplete Response:");
        System.out.println(response.asPrettyString());

        // Response Body
        System.out.println("\nResponse Body:");
        System.out.println(response.getBody().asPrettyString());

        // Status Line
        System.out.println("\nStatus Line : " + response.getStatusLine());

        // Content Type
        System.out.println("Content Type : " + response.getContentType());

        // Response Time
        System.out.println("Response Time : " + response.getTime() + " ms");
    }
}