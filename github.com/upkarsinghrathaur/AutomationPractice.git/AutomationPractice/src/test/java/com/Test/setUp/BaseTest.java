package com.Test.setUp;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.Test.utilities.PropertyReader;

public class BaseTest {

	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	public SoftAssert softAssert;
	
	@Parameters({"browser"})
	@BeforeClass
	public void launchApplication(String browser) throws IOException
	{
		driver= DriverFactory.getBrowser(browser);
		wait= new WebDriverWait(driver, 20);	
		driver.get(PropertyReader.getInstance().getProperty("pageUrl"));		
	}
	
	
	@AfterClass
	public void closeApplication()
	{
		driver.close();
	}
}
