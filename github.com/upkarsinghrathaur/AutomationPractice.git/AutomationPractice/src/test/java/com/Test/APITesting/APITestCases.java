package com.Test.APITesting;
import java.io.IOException;
import java.util.Hashtable;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.Test.utilities.DataUtil;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class APITestCases extends ApiBaseTest{
		
	String key= null;
	String userId= null;
	
  @Test(priority=1, dataProvider= "excelData", dataProviderClass= DataUtil.class)
  public void createIssueTest(Hashtable<String, String> data) throws IOException 
  {
	  softAssert= new SoftAssert();
	  Response response= JiraAPI.createIssue(data.get("bodyData"), data.get("resource"));
	  response.prettyPrint();
	  softAssert.assertEquals(response.getStatusCode(), 201);
	  JsonPath path= response.jsonPath();
	  key= path.get("key");
	  softAssert.assertAll();
  }
  @Test(priority=2, dataProvider= "excelData", dataProviderClass= DataUtil.class)
  public void getIssueTest(Hashtable<String, String> data) throws IOException
  {
	  softAssert= new SoftAssert();
	  Response response= JiraAPI.getIssue(data.get("resource"), key);
	  response.prettyPrint();
	  softAssert.assertEquals(response.getStatusCode(), 200);
	  JsonPath path= response.jsonPath();
	  softAssert.assertEquals(key, path.get("key"));
	  softAssert.assertAll();
  }
  
  @Test(priority=3, dataProvider= "excelData", dataProviderClass= DataUtil.class)
  public void addCommentTest(Hashtable<String, String> data) throws IOException
  {
	  softAssert= new SoftAssert();
	  Response response= JiraAPI.addComment(data.get("bodyData"), data.get("resource"),key);
	  response.prettyPrint();
	  softAssert.assertEquals(response.getStatusCode(), 201);
	  JsonPath path= response.jsonPath();
	  userId= path.get("id");
	  softAssert.assertAll();
  }
  
  @Test(priority=4, dataProvider= "excelData", dataProviderClass= DataUtil.class)
  public void deleteCommentTest(Hashtable<String, String> data) throws IOException
  {
	  softAssert= new SoftAssert();
	  Response response= JiraAPI.deleteComment(data.get("resource"), key, userId);
	  softAssert.assertEquals(response.getStatusCode(), 204);
	  softAssert.assertAll();  
  }
  
}
