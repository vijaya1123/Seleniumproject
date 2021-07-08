package com.qa.Test4;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestRestAssured9 {
	
	@Test
	public void restAssuredGet()
	{
		
		
		Response response = RestAssured
		  .get("https://restful-booker.herokuapp.com/booking/10");
		
//		Headers headers = response.getHeaders();
//		
//		for(Header h : headers)
//		{
//			System.out.println(h.getName() +" : "+h.getValue());
//		}
		
		
		System.out.println(response.getHeader("Connection"));
		
	}


}
