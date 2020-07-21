package com.Test.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Test.listeners.ExtentReportListeners;
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
	
	private static final By mrGender_radioButton= By.id("id_gender1");
	private static final By mrsGender_radioButton= By.id("id_gender1");
	private static final By firstName_field= By.id("customer_firstname");
	private static final By lastName_field= By.id("customer_lastname");
	private static final By email_field= By.id("email");
	private static final By password_field= By.id("passwd");
	private static final By days_select= By.id("days");
	private static final By months_select= By.id("months");
	private static final By years_select= By.id("years");
	private static final By newsLetter_chekBox= By.id("newsletter");
	private static final By specialOffer_checkBox= By.id("optin");
	private static final By addressFirstName_field= By.id("firstname");
	private static final By addressLastName_field= By.id("lastname");
	private static final By company_field= By.id("company");
	private static final By address_field= By.id("address1");
	private static final By addressLine2_field= By.id("address2");
	private static final By city_field= By.id("city");
	private static final By states_select= By.id("id_state");
	private static final By postalCode_field= By.id("postcode");
	private static final By country_select= By.id("id_country");
	private static final By additionalInformation_field= By.id("other");
	private static final By homePhone_field= By.id("phone");
	private static final By mobilePhone_field= By.id("phone_mobile");
	private static final By addressAlias_field= By.id("alias");
	private static final By register_button= By.id("submitAccount");
	
	public void selectGender(String gender)
	{
		if(gender.equalsIgnoreCase("Male"))
		{
			WaitingMethods.waitElementTillVisibility(mrGender_radioButton, wait).click();
		}
		else if(gender.equalsIgnoreCase("Female"))
		{
			WaitingMethods.waitElementTillVisibility(mrsGender_radioButton, wait).click();
		}
		else
		{
			ExtentReportListeners.testReport.get().fail("Gender not found");
		}
	}
	
	public void enterFisrtName(String firstName)
	{
		WaitingMethods.waitElementTillVisibility(firstName_field, wait).sendKeys(firstName);
	}
	
	public void enterLastName(String lastName)
	{
		WaitingMethods.waitElementTillVisibility(lastName_field, wait).sendKeys(lastName);
	}
	
	public void enterEmailId(String email)
	{
		WaitingMethods.waitElementTillVisibility(email_field, wait).clear();
		WaitingMethods.waitElementTillVisibility(email_field, wait).sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		WaitingMethods.waitElementTillVisibility(password_field, wait).sendKeys(password);
	}
	
	public void selectDateOfBirth(String date)
	{
		
	}
	
	public void selectNewsLetterBox(String check)
	{
		if(check.equalsIgnoreCase("Yes"))
		{
			WaitingMethods.waitElementTillClickable(newsLetter_chekBox, wait).click();
		}
		
	}
	
	public void selectSpecialOfferBox(String offer)
	{
		if(offer.equalsIgnoreCase("Yes"))
		{
			WaitingMethods.waitElementTillClickable(specialOffer_checkBox, wait).click();
		}
	}
	
	public void enterAddressFirstName(String addFirstName)
	{
		WaitingMethods.waitElementTillVisibility(addressFirstName_field, wait).clear();
		WaitingMethods.waitElementTillVisibility(addressFirstName_field, wait).sendKeys(addFirstName);		
	}
	
	public void enterAddressLastName(String addLastName)
	{
		WaitingMethods.waitElementTillVisibility(addressLastName_field, wait).clear();
		WaitingMethods.waitElementTillVisibility(addressLastName_field, wait).sendKeys(addLastName);
	}
	
	public void enterCompanyName(String company)
	{
		WaitingMethods.waitElementTillVisibility(company_field, wait).sendKeys(company);
	}
	
	public void enterAddress(String address)
	{
		WaitingMethods.waitElementTillVisibility(address_field, wait).sendKeys(address);
	}
	
	public void enterAddressLine2(String addressLine2)
	{
		//js.executeScript("arguments[0].scrollIntoView();", id_addressLine2);
		WaitingMethods.waitElementTillVisibility(addressLine2_field, wait).sendKeys(addressLine2);
	}
	
	public void enterCity(String city)
	{
		WaitingMethods.waitElementTillVisibility(city_field, wait).sendKeys(city);
	}
	
	public void selectState(String state)
	{
		SelectDropdown.selectByText(states_select, wait, state, driver);
	}
	
	public void enterZipCode(String zipCode)
	{
		WaitingMethods.waitElementTillVisibility(postalCode_field, wait).sendKeys(zipCode);
	}
	
	public void selectCountry(String country)
	{
		//js.executeScript("arguments[0].scrollIntoView();", id_country);
		SelectDropdown.selectByText(country_select, wait, country, driver);
	}
	
	public void enterAdditionalInformation(String information)
	{
		WaitingMethods.waitElementTillVisibility(additionalInformation_field, wait).sendKeys(information);
	}
	
	public void enterHomePhoneNumber(String phoneNumber)
	{
		
		WaitingMethods.waitElementTillVisibility(homePhone_field, wait).sendKeys(phoneNumber);
	}
	
	public void enterMobilePhoneNumber(String mobileNumber)
	{
		//js.executeScript("arguments[0].scrollIntoView();", id_mobilePhone);
		WaitingMethods.waitElementTillVisibility(mobilePhone_field, wait).sendKeys(mobileNumber);
	}
	
	public void enterAddressAlias(String addressAlias)
	{
		WaitingMethods.waitElementTillVisibility(addressAlias_field, wait).sendKeys(addressAlias);
	}
	
	public void clickRegisterButton()
	{
		WaitingMethods.waitElementTillClickable(register_button, wait).click();
	}
}
