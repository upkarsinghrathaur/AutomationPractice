package com.Test.APITesting;
import static io.restassured.RestAssured.given;
import java.io.File;
import java.io.IOException;
import com.Test.utilities.PropertyReader;
import io.restassured.response.Response;

public class JiraAPI {

	public static Response createIssue(String data, String resource) throws IOException
	{		
		Response response= given().headers("Content-Type", PropertyReader.getInstance().getProperty("contentType")).headers("Cookie",PropertyReader.getInstance().getProperty("cookie")).body(new File(System.getProperty("user.dir")+data)).post(resource);
		return response;
	}
	
	public static Response getIssue(String resource, String key) throws IOException
	{
		Response response= given().headers("Cookie",PropertyReader.getInstance().getProperty("cookie")).get(resource+"/"+key);
		return response;
	}
	public static Response addComment(String data, String resource, String key) throws IOException
	{
		Response response= given().headers("Content-Type", PropertyReader.getInstance().getProperty("contentType")).headers("Cookie",PropertyReader.getInstance().getProperty("cookie")).body(new File(System.getProperty("user.dir")+data)).post(resource+"/"+key+"/comment");
		return response;
	}
	public static Response deleteComment(String resource, String key, String userId) throws IOException
	{
		Response response= given().headers("Cookie",PropertyReader.getInstance().getProperty("cookie")).delete(resource+"/"+key+"/comment/"+userId);
		return response;
	}
}
