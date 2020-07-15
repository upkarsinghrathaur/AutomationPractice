package com.Test.testCase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.Test.pageObject.HomePage;
import com.Test.pageObject.LoginPage;
import com.Test.setUp.BaseTest;

public class LoginTest extends BaseTest {

	@Test(priority=1)
	public void checkSignIn()
	{
		softAssert= new SoftAssert();
		HomePage home= new HomePage(driver, wait);
		LoginPage login= new LoginPage(driver, wait);
		home.clickSignInButton();
		login.enterCreateEmail("upkarsinghj@gmail.com");
		login.clickCreateButton();
	}
	
}
