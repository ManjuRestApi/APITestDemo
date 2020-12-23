package ApiTest.ApiDemo;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BaseEng {
	public RequestSpecification requestSpecification;

	@BeforeClass
	public void beforeClass() {
		Properties prop = readPropertyFile();
		String env = prop.getProperty("Environment");
		String url = null;
		if (env.equalsIgnoreCase("qa"))
			url = prop.getProperty("QA_Url");
		else if (env.equalsIgnoreCase("dev"))
			url = prop.getProperty("Dev_Url");
		requestSpecification = RestAssured.given();
		requestSpecification.baseUri(url);
	}

	public Properties readPropertyFile() {
		try {
			String currentDir = System.getProperty("user.dir");
			Properties prop = new Properties();
			prop.load(new FileInputStream(currentDir + "//app.properties"));
			return prop;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}
}
