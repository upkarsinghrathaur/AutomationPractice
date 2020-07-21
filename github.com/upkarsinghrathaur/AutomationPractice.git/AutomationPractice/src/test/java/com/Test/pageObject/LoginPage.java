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
	
	private static final By createEmail_field= By.id("email_create");
	private static final By create_button= By.id("SubmitCreate");
	private static final By email_field= By.id("email");
	private static final By password_field= By.id("passwd");
	private static final By submitLogin_button= By.id("SubmitLogin");
	
	public void enterCreateEmail(String createEmail)
	{
		WaitingMethods.waitElementTillVisibility(createEmail_field, wait).sendKeys(createEmail);
	}
	
	public void clickCreateButton()
	{
		WaitingMethods.waitElementTillClickable(create_button, wait).click();
	}
	
	public void enterEmail(String email)
	{
		WaitingMethods.waitElementTillVisibility(email_field, wait).sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		WaitingMethods.waitElementTillVisibility(password_field, wait).sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		WaitingMethods.waitElementTillClickable(submitLogin_button, wait).click();
	}
}
