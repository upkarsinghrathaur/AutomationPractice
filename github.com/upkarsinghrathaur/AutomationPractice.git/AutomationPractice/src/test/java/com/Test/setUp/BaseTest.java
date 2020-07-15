package com.Test.setUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

public class BaseTest {

	public WebDriver driver;
	public WebDriverWait wait;
	public SoftAssert softAssert;
	
	@Parameters({"browser"})
	@BeforeClass
	public void launchApplication(String browser)
	{
		driver= DriverFactory.getBrowser(browser);
		wait= new WebDriverWait(driver, 20);
		driver.get("http://automationpractice.com/index.php");		
	}
	
	
	@AfterClass
	public void closeApplication()
	{
		driver.close();
	}
}
