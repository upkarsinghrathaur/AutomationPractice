package com.Test.APITesting;
import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;
import com.Test.utilities.PropertyReader;
import io.restassured.RestAssured;

public class ApiBaseTest {
	
	public static SoftAssert softAssert;
	
	@BeforeClass
	public void setURI() throws IOException
	{
		RestAssured.baseURI=PropertyReader.getInstance().getProperty("baseURI");
	}
}
