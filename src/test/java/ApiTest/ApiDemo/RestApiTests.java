package ApiTest.ApiDemo;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class RestApiTests extends BaseActions {

	@Test
	public void getDemo() {
		addQueryParam("page", "2");
		Response res = getOperation("/api/users");

		System.out.println("Get");
		System.out.println(res.statusCode());
		System.out.println(res.getBody().asString());
		
		
		
	}

	@Test
	public void deleteDemo() {

		Response res = deleteOperation("/api/users/2");

		System.out.println("Delete");
		System.out.println(res.statusCode());
	}

	@Test
	public void postDemo() {

		addBody("{\"name\":\"morpheus1\",\"job\":\"leader1\"}");
		addHeader("Content-Type", "application/json");
		Response res = postOperation("/api/users");

		System.out.println("Post");
		System.out.println(res.statusCode());
		System.out.println(res.getBody().asString());
	}

	@Test
	public void putDemo() {
		addBody("{\"name\":\"morpheus\",\"job\":\"zion resident\"}");
		addHeader("Content-Type", "application/json");
		Response res = putOperation("/api/users/2");

		System.out.println("Put");
		System.out.println(res.statusCode());
		System.out.println(res.getBody().asString());
	}
}
