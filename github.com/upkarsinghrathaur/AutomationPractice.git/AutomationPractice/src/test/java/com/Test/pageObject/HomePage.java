package com.Test.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Test.utilities.WaitingMethods;

public class HomePage {

	WebDriver driver;
	WebDriverWait wait;
	
	public HomePage(WebDriver driver, WebDriverWait wait) {
		//super();
		this.driver = driver;
		this.wait = wait;
	}

	private static final By xpath_signIn= By.xpath(".//a[@class='login']");
	private static final By xpath_contactUs= By.xpath(".//a[@title='Contact Us']");
	
	public void clickSignInButton()
	{
		WaitingMethods.waitElementTillClickable(xpath_signIn, wait).click();
	}
	
	public void clickContactUsButton()
	{
		WaitingMethods.waitElementTillClickable(xpath_contactUs, wait).click();
	}
}
