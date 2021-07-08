package com.qa.Test4;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestRestAsured2 {
	
	public static void main(String[] args) {
		
		Response response = RestAssured
				  .get("https://restful-booker.herokuapp.com/booking/10");
				
				
				System.out.println(response.asString());
				
				response.prettyPrint();
				
	}
	
}
