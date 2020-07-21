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
	
	private static final By verifyProductPrice= By.xpath(".//table[@id='cart_summary']/tbody/tr/td[4]/span/span");
	private static final By verifyTotalPrice= By.xpath(".//span[@id='total_price']");
	private static final By payByBankWire_button= By.xpath(".//div[@id='HOOK_PAYMENT']//a[@title='Pay by bank wire']");
	private static final By payByCheck_button= By.xpath(".//div[@id='HOOK_PAYMENT']//a[@title='Pay by check.']");
	private static final By confirmOrder_button= By.xpath(".//p[@id='cart_navigation']/button[@type='submit']");
	private static final By verifyOrderCompleted_message= By.xpath(".//p[@class='cheque-indent']/strong");
	
	
	public String verifyProductPrice()
	{
		String value= WaitingMethods.waitElementTillVisibility(verifyProductPrice, wait).getText();
		return value;
	}
	
	public String verifyTotalPrice()
	{
		String value= WaitingMethods.waitElementTillVisibility(verifyTotalPrice, wait).getText();
		return value;
	}
	
	public void clickOnPayByBankWireButton()
	{
		WaitingMethods.waitElementTillClickable(payByBankWire_button, wait).click();
	}
	
	public void clickOnPayByCheckButton()
	{
		WaitingMethods.waitElementTillClickable(payByCheck_button, wait).click();
	}
	
	public void clickOnConfirmOrderButton()
	{
		WaitingMethods.waitElementTillClickable(confirmOrder_button, wait).click();
	}
	
	public String verifyOrderIsCompeleted()
	{
		String value= WaitingMethods.waitElementTillVisibility(verifyOrderCompleted_message, wait).getText();
		return value;
	}
	
}
