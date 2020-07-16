package com.Test.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Test.utilities.SelectDropdown;
import com.Test.utilities.WaitingMethods;

public class CreateAccountPage {

	public CreateAccountPage(WebDriver driver, WebDriverWait wait) {
		//super();
		this.driver = driver;
		this.wait = wait;
	}
	WebDriver driver;
	WebDriverWait wait;
	
	private static final By id_mrGender= By.id("id_gender1");
	private static final By id_mrsGender= By.id("id_gender1");
	private static final By id_firstName= By.id("customer_firstname");
	private static final By id_lastName= By.id("customer_lastname");
	private static final By id_email= By.id("email");
	private static final By id_password= By.id("passwd");
	private static final By id_days= By.id("days");
	private static final By id_months= By.id("months");
	private static final By id_years= By.id("years");
	private static final By id_newsLetter= By.id("newsletter");
	private static final By id_specialOffer= By.id("optin");
	private static final By id_addressFirstName= By.id("firstname");
	private static final By id_addressLastName= By.id("lastname");
	private static final By id_company= By.id("company");
	private static final By id_address= By.id("address1");
	private static final By id_addressLine2= By.id("address2");
	private static final By id_city= By.id("city");
	private static final By id_states= By.id("id_state");
	private static final By id_postalCode= By.id("postcode");
	private static final By id_country= By.id("id_country");
	private static final By id_additionalInformation= By.id("other");
	private static final By id_homePhone= By.id("phone");
	private static final By id_mobilePhone= By.id("phone_mobile");
	private static final By id_addressAlias= By.id("alias");
	private static final By id_registerButton= By.id("submitAccount");
	
	public void selectGender(String gender)
	{
		if(gender.equalsIgnoreCase("Male"))
		{
			WaitingMethods.waitElementTillVisibility(id_mrGender, wait).click();
		}
		else if(gender.equalsIgnoreCase("Female"))
		{
			WaitingMethods.waitElementTillVisibility(id_mrsGender, wait).click();
		}
		else
		{
			System.out.println("Gender not found");
		}
	}
	
	public void enterFisrtName(String firstName)
	{
		WaitingMethods.waitElementTillVisibility(id_firstName, wait).sendKeys(firstName);
	}
	
	public void enterLastName(String lastName)
	{
		WaitingMethods.waitElementTillVisibility(id_lastName, wait).sendKeys(lastName);
	}
	
	public void enterEmailId(String email)
	{
		WaitingMethods.waitElementTillVisibility(id_email, wait).clear();
		WaitingMethods.waitElementTillVisibility(id_email, wait).sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		WaitingMethods.waitElementTillVisibility(id_password, wait).sendKeys(password);
	}
	
	public void selectDateOfBirth(String date)
	{
		
	}
	
	public void selectNewsLetterBox(String check)
	{
		if(check.equalsIgnoreCase("Yes"))
		{
			WaitingMethods.waitElementTillClickable(id_newsLetter, wait).click();
		}
		
	}
	
	public void selectSpecialOfferBox(String offer)
	{
		if(offer.equalsIgnoreCase("Yes"))
		{
			WaitingMethods.waitElementTillClickable(id_specialOffer, wait).click();
		}
	}
	
	public void enterAddressFirstName(String addFirstName)
	{
		//js.executeScript("arguments[0].scrollIntoView();", id_addressFirstName);
		WaitingMethods.waitElementTillVisibility(id_addressFirstName, wait).sendKeys(addFirstName);		
	}
	
	public void enterAddressLastName(String addLastName)
	{
		WaitingMethods.waitElementTillVisibility(id_addressLastName, wait).sendKeys(addLastName);
	}
	
	public void enterCompanyName(String company)
	{
		WaitingMethods.waitElementTillVisibility(id_company, wait).sendKeys(company);
	}
	
	public void enterAddress(String address)
	{
		WaitingMethods.waitElementTillVisibility(id_address, wait).sendKeys(address);
	}
	
	public void enterAddressLine2(String addressLine2)
	{
		//js.executeScript("arguments[0].scrollIntoView();", id_addressLine2);
		WaitingMethods.waitElementTillVisibility(id_addressLine2, wait).sendKeys(addressLine2);
	}
	
	public void enterCity(String city)
	{
		WaitingMethods.waitElementTillVisibility(id_city, wait).sendKeys(city);
	}
	
	public void selectState(String state)
	{
		SelectDropdown.selectByText(id_states, wait, state, driver);
	}
	
	public void enterZipCode(String zipCode)
	{
		WaitingMethods.waitElementTillVisibility(id_postalCode, wait).sendKeys(zipCode);
	}
	
	public void selectCountry(String country)
	{
		//js.executeScript("arguments[0].scrollIntoView();", id_country);
		SelectDropdown.selectByText(id_country, wait, country, driver);
	}
	
	public void enterAdditionalInformation(String information)
	{
		WaitingMethods.waitElementTillVisibility(id_additionalInformation, wait).sendKeys(information);
	}
	
	public void enterHomePhoneNumber(String phoneNumber)
	{
		
		WaitingMethods.waitElementTillVisibility(id_homePhone, wait).sendKeys(phoneNumber);
	}
	
	public void enterMobilePhoneNumber(String mobileNumber)
	{
		//js.executeScript("arguments[0].scrollIntoView();", id_mobilePhone);
		WaitingMethods.waitElementTillVisibility(id_mobilePhone, wait).sendKeys(mobileNumber);
	}
	
	public void enterAddressAlias(String addressAlias)
	{
		WaitingMethods.waitElementTillVisibility(id_addressAlias, wait).sendKeys(addressAlias);
	}
	
	public void clickRegisterButton()
	{
		WaitingMethods.waitElementTillClickable(id_registerButton, wait).click();
	}
}
