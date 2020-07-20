package com.Test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsMethods {

	public static void hoverOverElement(By element, WebDriverWait wait, WebDriver driver)
	{
		Actions action= new Actions(driver);
		action.moveToElement(WaitingMethods.waitElementTillVisibility(element, wait));
		action.build().perform();
	}
}
