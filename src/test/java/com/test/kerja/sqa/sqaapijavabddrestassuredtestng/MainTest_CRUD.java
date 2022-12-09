package com.test.kerja.sqa.sqaapijavabddrestassuredtestng;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class MainTest_CRUD {

	/*
	 * https://reqres.in/
	 * https://www.youtube.com/watch?v=mkIliGAePBM&ab_channel=AutomationStepbyStep
	 */
	
	@Test(priority = 0)
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
	@Test(priority = 1)
	public void test02_patch() {
		
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
	@Test(priority = 2)
	public void test03_put() {
		
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
	@Test(priority = 3)
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
	
//	@Test
//	public void test01_post() {
//		
//		JSONObject request = new JSONObject();
//		
//		request.put("name", "Budi");
//		request.put("job", "SQA Engineer");
//		
////		System.out.println(request);
//		System.out.println(request.toJSONString());
////		https://gorest.co.in/public/v1/users
//		given()
//		.header("Content-Type", "application/json")
//		.contentType(ContentType.JSON)
//		.accept(ContentType.JSON)
//		.body(request.toJSONString())
//		.when()
//		.post("https://reqres.in/api/users") //POST
//		.then()
//		.statusCode(201)
//		.log().all();
//	}
//	
//	@Test
//	public void test02_put() {
//		
//		JSONObject request = new JSONObject();
//		
//		request.put("name", "Chika");
//		request.put("job", "SQA Engineer");
//		
////		System.out.println(request);
//		System.out.println(request.toJSONString());
//		
//		given()
//		.header("Content-Type", "application/json")
//		.contentType(ContentType.JSON)
//		.accept(ContentType.JSON)
//		.body(request.toJSONString())
//		.when()
//		.put("https://reqres.in/api/users/2") //PUT
//		.then()
//		.statusCode(200)
//		.log().all();
//	}
//	
//	@Test
//	public void test03_patch() {
//		
//		JSONObject request = new JSONObject();
//		
//		request.put("name", "Chika");
//		request.put("job", "SQA Engineer");
//		
////		System.out.println(request);
//		System.out.println(request.toJSONString());
//		
//		given()
//		.header("Content-Type", "application/json")
//		.contentType(ContentType.JSON)
//		.accept(ContentType.JSON)
//		.body(request.toJSONString())
//		.when()
//		.patch("https://reqres.in/api/users/2") //PATCH
//		.then()
//		.statusCode(200)
//		.log().all();
//	}
//	
//	@Test
//	public void test04_delete() {
//		
//		when()
//		.delete("https://reqres.in/api/users/2") //DELETE
//		.then()
//		.statusCode(204)
//		.log().all();
//	}
}
