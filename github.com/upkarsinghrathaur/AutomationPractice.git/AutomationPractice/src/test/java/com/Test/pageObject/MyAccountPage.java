package com.Test.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Test.utilities.ActionsMethods;
import com.Test.utilities.WaitingMethods;

public class MyAccountPage {

	public MyAccountPage(WebDriver driver, WebDriverWait wait) {
		//super();
		this.driver = driver;
		this.wait = wait;
	}
	WebDriver driver;
	WebDriverWait wait;
	
	private static final By verifyMyAccount_link= By.xpath(".//a[@class='account']");
	private static final By menuListWomen_button= By.xpath(".//a[@title='Women']");
	private static final By productNeedtoBuy= By.xpath(".//div[@id='center_column']/ul[@class='product_list grid row']/li[2]");
	private static final By addToCart_button= By.xpath(".//a[@title='Add to cart'][@data-id-product='2']");
	private static final By verifyAddToCart_message= By.xpath(".//div[@id='layer_cart']//div[@class='layer_cart_product col-xs-12 col-md-6']/h2");
	private static final By proceedToCheckOut_button= By.xpath(".//div[@id='layer_cart']//a[@title='Proceed to checkout']");
	private static final By verifyShoppingCart_name= By.xpath(".//h1[@id='cart_title']");
	private static final By proceedToCheckOutFromCart_button= By.xpath(".//div[@id='center_column']//a[@title='Proceed to checkout']");
	private static final By addressProceed_button= By.xpath(".//button[@type='submit'][@name='processAddress']");
	private static final By agreeTermsCondition_checkBox= By.xpath(".//div[@id='uniform-cgv']/span");
	private static final By proceedToCheckoutFromShipping_button= By.xpath(".//button[@type='submit'][@name='processCarrier']");
	
	
	public String VerifyMyAccountPage()
	{
		String value= WaitingMethods.waitElementTillVisibility(verifyMyAccount_link, wait).getText();
		return value;
	}
	
	public void clickOnWomenMenu()
	{
		WaitingMethods.waitElementTillClickable(menuListWomen_button, wait).click();
	}
	
	public void clickOnAddToCartProduct()
	{
		ActionsMethods.hoverOverElement(productNeedtoBuy, wait, driver);
		WaitingMethods.waitElementTillClickable(addToCart_button, wait).click();
	}
	
	public String verifyProductAddedToCart()
	{
		String value= WaitingMethods.waitElementTillVisibility(verifyAddToCart_message, wait).getText();
		return value;
	}
	
	public void clickOnProceedToCheckOutButton()
	{
		WaitingMethods.waitElementTillClickable(proceedToCheckOut_button, wait).click();
	}
	
	public String verifyShoppingCartPage()
	{
		String value= WaitingMethods.waitElementTillVisibility(verifyShoppingCart_name, wait).getText();
		return value;
	}
	
	public void clickOnProceedToCheckOutFromCartButton()
	{
		WaitingMethods.waitElementTillClickable(proceedToCheckOutFromCart_button, wait).click();
	}
	
	public void clickOnProceedToCheckOutFromAddressButton()
	{
		WaitingMethods.waitElementTillClickable(addressProceed_button, wait).click();
	}
	
	public void clickOnAgreeTermsConditionsCheckBox()
	{
		WaitingMethods.waitElementTillVisibility(agreeTermsCondition_checkBox, wait).click();
	}
	
	public void clickOnProceedToCheckOutFromShippingButton()
	{
		WaitingMethods.waitElementTillClickable(proceedToCheckoutFromShipping_button, wait).click();
	}
	
}
