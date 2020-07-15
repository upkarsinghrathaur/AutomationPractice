package com.Test.setUp;
import java.util.Collections;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver driver;
	
	public static WebDriver getBrowser(String browserType)
	{
		if(driver == null)
		{
			if(browserType.equalsIgnoreCase("GC"))
			{
				WebDriverManager.chromedriver().setup();
				ChromeOptions options= new ChromeOptions();
				options.addArguments("start-maximized");
				options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
				options.setExperimentalOption("useAutomationExtension", false);
				driver= new ChromeDriver(options);
			}
			
			else if(browserType.equalsIgnoreCase("FF"))
			{
				WebDriverManager.firefoxdriver().setup();
				FirefoxOptions options= new FirefoxOptions();
				options.addArguments("start-maximized");
				options.addArguments("disable-infobars");
				driver= new FirefoxDriver(options);
			}
			
			else if(browserType.equalsIgnoreCase("IE"))
			{
				WebDriverManager.edgedriver().setup();
				driver= new EdgeDriver();
			}
		}
		return driver;
	}
}
