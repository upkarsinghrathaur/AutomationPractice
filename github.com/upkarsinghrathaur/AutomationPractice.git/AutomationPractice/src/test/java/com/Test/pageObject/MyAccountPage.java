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
	
	private static final By xpath_verifyMyAccount= By.xpath(".//a[@class='account']");
	private static final By xpath_menuListWomen= By.xpath(".//a[@title='Women']");
	private static final By xpath_productNeedtoBuy= By.xpath(".//div[@id='center_column']/ul[@class='product_list grid row']/li[2]");
	private static final By xpath_addToCart= By.xpath(".//a[@title='Add to cart'][@data-id-product='2']");
	private static final By xpath_verifyAddToCart= By.xpath(".//div[@id='layer_cart']//div[@class='layer_cart_product col-xs-12 col-md-6']/h2");
	private static final By xpath_proceedToCheckOut= By.xpath(".//div[@id='layer_cart']//a[@title='Proceed to checkout']");
	private static final By xpath_checkShoppingCart= By.xpath(".//h1[@id='cart_title']");
	private static final By xpath_proceedToCheckOutFromCart= By.xpath(".//div[@id='center_column']//a[@title='Proceed to checkout']");
	private static final By xpath_addressProceedButton= By.xpath(".//button[@type='submit'][@name='processAddress']");
	private static final By xpath_agreeTermsCondition= By.xpath(".//div[@id='uniform-cgv']/span");
	private static final By xpath_proceedToCheckoutFromShipping= By.xpath(".//button[@type='submit'][@name='processCarrier']");
	
	
	public String VerifyMyAccountPage()
	{
		String value= WaitingMethods.waitElementTillVisibility(xpath_verifyMyAccount, wait).getText();
		return value;
	}
	
	public void clickOnWomenMenu()
	{
		WaitingMethods.waitElementTillClickable(xpath_menuListWomen, wait).click();
	}
	
	public void clickOnAddToCartProduct()
	{
		ActionsMethods.hoverOverElement(xpath_productNeedtoBuy, wait, driver);
		WaitingMethods.waitElementTillClickable(xpath_addToCart, wait).click();
	}
	
	public String verifyProductAddedToCart()
	{
		String value= WaitingMethods.waitElementTillVisibility(xpath_verifyAddToCart, wait).getText();
		return value;
	}
	
	public void clickOnProceedToCheckOutButton()
	{
		WaitingMethods.waitElementTillClickable(xpath_proceedToCheckOut, wait).click();
	}
	
	public String verifyShoppingCartPage()
	{
		String value= WaitingMethods.waitElementTillVisibility(xpath_checkShoppingCart, wait).getText();
		return value;
	}
	
	public void clickOnProceedToCheckOutFromCartButton()
	{
		WaitingMethods.waitElementTillClickable(xpath_proceedToCheckOutFromCart, wait).click();
	}
	
	public void clickOnProceedToCheckOutFromAddressButton()
	{
		WaitingMethods.waitElementTillClickable(xpath_addressProceedButton, wait).click();
	}
	
	public void clickOnAgreeTermsConditionsCheckBox()
	{
		WaitingMethods.waitElementTillVisibility(xpath_agreeTermsCondition, wait).click();
	}
	
	public void clickOnProceedToCheckOutFromShippingButton()
	{
		WaitingMethods.waitElementTillClickable(xpath_proceedToCheckoutFromShipping, wait).click();
	}
	
}
