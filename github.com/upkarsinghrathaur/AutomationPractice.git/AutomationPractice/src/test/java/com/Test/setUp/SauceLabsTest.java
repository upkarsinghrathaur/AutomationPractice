package com.Test.setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SauceLabsTest {

	public static final String USERNAME= "upkar";
	public static final String ACCESS_KEY= "637e8f09-03a7-4c79-ac8e-531d8315185c";
	public static final String URL= "https://"+USERNAME+":"+ACCESS_KEY+"@ondemand.saucelabs.com:443/wd/hub";
	
	
	public static WebDriver openBrowser() throws MalformedURLException
	{
		DesiredCapabilities capabilities= DesiredCapabilities.chrome();
		capabilities.setCapability("platform", "Windows 10");
		capabilities.setCapability("version", "latest");
		
		WebDriver driver= new RemoteWebDriver(new URL(URL), capabilities);
		return driver;
		
	}
}
