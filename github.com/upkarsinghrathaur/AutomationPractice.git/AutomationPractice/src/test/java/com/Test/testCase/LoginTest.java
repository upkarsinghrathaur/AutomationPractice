package com.Test.testCase;
import java.util.Hashtable;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.Test.pageObject.CreateAccountPage;
import com.Test.pageObject.HomePage;
import com.Test.pageObject.LoginPage;
import com.Test.pageObject.MyAccountPage;
import com.Test.pageObject.PaymentPage;
import com.Test.setUp.BaseTest;
import com.Test.utilities.DataUtil;
import com.Test.utilities.RandomGenerator;

public class LoginTest extends BaseTest {

	@Test(priority=1, dataProviderClass=DataUtil.class , dataProvider="excelData")
	public void checkSignIn(Hashtable<String, String> data)
	{
		softAssert= new SoftAssert();
		HomePage home= new HomePage(driver, wait);
		LoginPage login= new LoginPage(driver, wait);
		CreateAccountPage account= new CreateAccountPage(driver, wait);
		home.clickSignInButton();
		login.enterCreateEmail(RandomGenerator.getStringForEmail()+"@gmail.com");
		login.clickCreateButton();
		account.selectGender(data.get("gender"));
		account.enterFisrtName(data.get("firstName"));
		account.enterLastName(data.get("lastName"));
		account.enterPassword(data.get("password"));
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
		account.clickRegisterButton();
		softAssert.assertAll();
	}
	
	@Test(priority=2, dataProviderClass=DataUtil.class , dataProvider="excelData")
	public void addToCartProduct(Hashtable<String, String> data)
	{		
	    softAssert= new SoftAssert();
		MyAccountPage account= new MyAccountPage(driver, wait);
		PaymentPage payment= new PaymentPage(driver, wait);
		softAssert.assertEquals(account.VerifyMyAccountPage(), data.get("accountName"));
		account.clickOnWomenMenu();
		account.clickOnAddToCartProduct();
		softAssert.assertEquals(account.verifyProductAddedToCart(), data.get("cartMessage"));
		account.clickOnProceedToCheckOutButton();	
		account.clickOnProceedToCheckOutFromCartButton();
		account.clickOnProceedToCheckOutFromAddressButton();
		account.clickOnAgreeTermsConditionsCheckBox();
		account.clickOnProceedToCheckOutFromShippingButton();
		softAssert.assertEquals(payment.verifyProductPrice(), data.get("productPrice"));
		payment.clickOnPayByBankWireButton();
		payment.clickOnConfirmOrderButton();
		softAssert.assertEquals(payment.verifyOrderIsCompeleted(), data.get("orderCompleteMessage"));
		softAssert.assertAll();
	}
	
}
