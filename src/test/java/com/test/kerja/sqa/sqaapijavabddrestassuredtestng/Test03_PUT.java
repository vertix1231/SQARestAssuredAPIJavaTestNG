package com.test.kerja.sqa.sqaapijavabddrestassuredtestng;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test03_PUT {
	@Test
	public void test02_put() {
		
		JSONObject request = new JSONObject();
		
	
		request.put("gender", "female");
		request.put("status", "active");
//		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given()
		.auth().oauth2("864ba7fd66f0e86658fee3c51809f945696f9d20f07482e6f69a7f4dd4614c26")
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.put("https://gorest.co.in/public/v1/users/5672") //PUT
		.then()
		.statusCode(200)
		.log().all();
	}
}
