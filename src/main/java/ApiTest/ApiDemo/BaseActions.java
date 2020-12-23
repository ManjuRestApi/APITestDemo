package ApiTest.ApiDemo;

import io.restassured.response.Response;

public class BaseActions extends BaseEng {

	public void addQueryParam(String key, String value) {
		try {
			requestSpecification.when().queryParam(key, value);
			System.out.println("Successfully added Query param");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failure to add Query param");
		}

	}

	public void addHeader(String key, String value) {
		try {
			requestSpecification.when().headers(key, value);
			System.out.println("Successfully added header");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failure to add header");
		}
	}

	public void addBody(String body) {
		try {
			requestSpecification.when().body(body);
			System.out.println("Successfully added body");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failure to add body");
		}
		
	}

	public Response getOperation(String path) {
		try {
			Response res = requestSpecification.when().get(path);
			System.out.println("Successfully perfomed Get operation");
			return res;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failure to perform Get operations");
			return null;
		}		
	}

	public Response deleteOperation(String path) {
		try {
			Response res = requestSpecification.when().delete(path);
			System.out.println("Successfully perform Delete operation");
			return res;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failure to perform Delete operation");
			return null;
		}
		
	}

	public Response postOperation(String path) {
		try {
			Response res = requestSpecification.when().post(path);
			System.out.println("Successfully perform post operation");
			return res;
		} catch (Exception e) {
			System.out.println("Failure to perform Post operation");
			return null;
			// TODO: handle exception
		}
		
	}

	public Response putOperation(String path) {
		try {
			Response res = requestSpecification.when().put(path);
			System.out.println("Successfully perform Put operation");
			return res;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failure to perform Put opetation");
			return null;
		}
		
	}
}
