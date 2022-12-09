package com.test.kerja.sqa.sqaapijavabddrestassuredtestng;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test04_POST {

	@Test
	public void test01_post() {
		
		JSONObject request = new JSONObject();
		
		request.put("id", "2");
		request.put("name", "andreX");
		request.put("email", "andreX@gmail.com");
		request.put("gender", "male");
		request.put("status", "inactive");
		
//		System.out.println(request);
		System.out.println(request.toJSONString());
//		https://gorest.co.in/public/v1/users
		given()
		.auth().oauth2("864ba7fd66f0e86658fee3c51809f945696f9d20f07482e6f69a7f4dd4614c26")
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("https://gorest.co.in/public/v1/users") //POST
		.then()
		.statusCode(201)
		.log().all();

	}
}
