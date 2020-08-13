package com.restassured.study;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01_GET {

	@Test
	void test_01(){
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println("***** response.asString() ******		"+response.asString());
		System.out.println("**** response.getBody().asString() ******	"+response.getBody().asString());
		System.out.println("**** response.getStatusCode()  ******	"+response.getStatusCode());
		System.out.println("**** response.getTime()  ******		"+response.getTime());
	}
}
