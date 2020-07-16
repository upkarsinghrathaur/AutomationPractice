package com.Test.testCase;
import java.util.Hashtable;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.Test.pageObject.CreateAccountPage;
import com.Test.pageObject.HomePage;
import com.Test.pageObject.LoginPage;
import com.Test.setUp.BaseTest;
import com.Test.utilities.DataUtil;

public class LoginTest extends BaseTest {

	@Test(priority=1, dataProviderClass=DataUtil.class , dataProvider="excelData")
	public void checkSignIn(Hashtable<String, String> data)
	{
		softAssert= new SoftAssert();
		HomePage home= new HomePage(driver, wait);
		LoginPage login= new LoginPage(driver, wait);
		CreateAccountPage account= new CreateAccountPage(driver, wait);
		home.clickSignInButton();
		login.enterCreateEmail(data.get("createEmail"));
		login.clickCreateButton();
		account.selectGender(data.get("gender"));
		account.enterFisrtName(data.get("firstName"));
		account.enterLastName(data.get("lastName"));
		account.enterPassword(data.get("password"));
		//account.selectNewsLetterBox(data.get("newLetterBox"));
		account.enterAddressFirstName(data.get("addressFirstName"));
		account.enterAddressLastName(data.get("addressLastName"));
		account.enterCompanyName(data.get("company"));
		account.enterAddress(data.get("address"));
		account.enterAddressLine2(data.get("addressLine2"));
		account.enterCity(data.get("city"));
		account.selectState(data.get("state"));
		account.enterZipCode(data.get("zipCode"));
		account.selectCountry(data.get("country"));
		account.enterHomePhoneNumber(data.get("homePhone"));
		account.enterMobilePhoneNumber(data.get("mobilePhone"));
		account.enterAddressAlias(data.get("addressAlias"));
		//account.clickRegisterButton();
		softAssert.assertAll();
	}
	
}
