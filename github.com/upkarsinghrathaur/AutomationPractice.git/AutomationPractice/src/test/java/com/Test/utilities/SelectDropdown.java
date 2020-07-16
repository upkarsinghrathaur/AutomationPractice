package com.Test.utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectDropdown {

	public static void selectByText(By element, WebDriverWait wait, String option, WebDriver driver)
	{
		Select value= new Select(driver.findElement(element));
		value.selectByVisibleText(option);
	}
}
