package com.test.kerja.sqa.sqaapijavabddrestassuredtestng;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test06_DELETE {
	@Test
	public void test04_delete() {
		JSONObject request = new JSONObject();

//		request.put("name", "Chika");
//		request.put("job", "SQA Engineer");
		given()
		.auth().oauth2("864ba7fd66f0e86658fee3c51809f945696f9d20f07482e6f69a7f4dd4614c26")
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.delete("https://gorest.co.in/public/v1/users/5672") // DELETE
		.then()
		.statusCode(204)
		.log().all();
	}
}
