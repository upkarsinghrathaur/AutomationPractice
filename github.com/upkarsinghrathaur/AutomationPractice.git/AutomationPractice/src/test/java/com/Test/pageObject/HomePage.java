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

	private static final By signIn_button= By.xpath(".//a[@class='login']");
	private static final By contactUs_button= By.xpath(".//a[@title='Contact Us']");
	
	public void clickSignInButton()
	{
		WaitingMethods.waitElementTillClickable(signIn_button, wait).click();
	}
	
	public void clickContactUsButton()
	{
		WaitingMethods.waitElementTillClickable(contactUs_button, wait).click();
	}
}
