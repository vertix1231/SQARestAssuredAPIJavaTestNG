package com.test.kerja.sqa.sqaapijavabddrestassuredtestng;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test05_PATCH {
	@Test
	public void test03_patch() {
		
		JSONObject request = new JSONObject();
		
//		request.put("name", "Chika");
//		request.put("job", "SQA Engineer");
		
//		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given()
		.auth().oauth2("864ba7fd66f0e86658fee3c51809f945696f9d20f07482e6f69a7f4dd4614c26")
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.patch("https://gorest.co.in/public/v1/users/5672") //PATCH
		.then()
		.statusCode(200)
		.log().all();
	}
}
