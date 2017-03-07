package com.imaginea.spring.webservices.restassured;

/**
 * Created by satyad on 21/11/16.
 */

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import static org.hamcrest.Matchers.containsString;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.expect;
import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;

public class RestAssuredTest {

    @Test
    public void basicPingTest() {
        given().when().get("/").then().statusCode(200);
    }

    @Test
    public void wishMessageTest(){
        given().when().get("/rest/user/").then()
                .body(containsString("hey"));
    }
}
