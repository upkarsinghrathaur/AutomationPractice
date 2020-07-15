package com.Test.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Test.utilities.WaitingMethods;

public class LoginPage {

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		//super();
		this.driver = driver;
		this.wait = wait;
	}
	WebDriver driver;
	WebDriverWait wait;
	
	private static final By id_createEmail= By.id("email_create");
	private static final By id_createButton= By.id("SubmitCreate");
	private static final By id_email= By.id("email");
	private static final By id_password= By.id("passwd");
	private static final By id_submitLoginButton= By.id("SubmitLogin");
	
	public void enterCreateEmail(String createEmail)
	{
		WaitingMethods.waitElementTillVisibility(id_createEmail, wait).sendKeys(createEmail);
	}
	
	public void clickCreateButton()
	{
		WaitingMethods.waitElementTillClickable(id_createButton, wait).click();
	}
	
	public void enterEmail(String email)
	{
		WaitingMethods.waitElementTillVisibility(id_email, wait).sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		WaitingMethods.waitElementTillVisibility(id_password, wait).sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		WaitingMethods.waitElementTillClickable(id_submitLoginButton, wait).click();
	}
}
