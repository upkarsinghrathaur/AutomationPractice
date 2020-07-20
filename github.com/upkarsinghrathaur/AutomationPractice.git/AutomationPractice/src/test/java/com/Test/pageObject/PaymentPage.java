package com.Test.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Test.utilities.WaitingMethods;

public class PaymentPage {

	public PaymentPage(WebDriver driver, WebDriverWait wait) {
		//super();
		this.driver = driver;
		this.wait = wait;
	}
	WebDriver driver;
	WebDriverWait wait;
	
	private static final By xpath_verifyProductPrice= By.xpath(".//table[@id='cart_summary']/tbody/tr/td[4]/span/span");
	private static final By xpath_verifyTotalPrice= By.xpath(".//span[@id='total_price']");
	private static final By xpath_clickOnPayByBankWire= By.xpath(".//div[@id='HOOK_PAYMENT']//a[@title='Pay by bank wire']");
	private static final By xpath_clickOnPayByCheck= By.xpath(".//div[@id='HOOK_PAYMENT']//a[@title='Pay by check.']");
	private static final By xpath_confirmOrderButton= By.xpath(".//p[@id='cart_navigation']/button[@type='submit']");
	private static final By xpath_verifyOrderCompleted= By.xpath(".//p[@class='cheque-indent']/strong");
	
	
	public String verifyProductPrice()
	{
		String value= WaitingMethods.waitElementTillVisibility(xpath_verifyProductPrice, wait).getText();
		return value;
	}
	
	public String verifyTotalPrice()
	{
		String value= WaitingMethods.waitElementTillVisibility(xpath_verifyTotalPrice, wait).getText();
		return value;
	}
	
	public void clickOnPayByBankWireButton()
	{
		WaitingMethods.waitElementTillClickable(xpath_clickOnPayByBankWire, wait).click();
	}
	
	public void clickOnPayByCheckButton()
	{
		WaitingMethods.waitElementTillClickable(xpath_clickOnPayByCheck, wait).click();
	}
	
	public void clickOnConfirmOrderButton()
	{
		WaitingMethods.waitElementTillClickable(xpath_confirmOrderButton, wait).click();
	}
	
	public String verifyOrderIsCompeleted()
	{
		String value= WaitingMethods.waitElementTillVisibility(xpath_verifyOrderCompleted, wait).getText();
		return value;
	}
	
}
