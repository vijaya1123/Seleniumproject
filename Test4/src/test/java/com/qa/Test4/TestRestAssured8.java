package com.qa.Test4;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestRestAssured8 {
	
	@Test
	public void restAssuredGet()
	{
		RestAssured
		  .get("https://restful-booker.herokuapp.com/booking/10")
		  .then()
		  .time(Matchers.lessThanOrEqualTo(10000L));
		
		
		Response response = RestAssured
		  .get("https://restful-booker.herokuapp.com/booking/10");
		
		long l = response.getTime();
		System.out.println(l);
		
		
	}

}
