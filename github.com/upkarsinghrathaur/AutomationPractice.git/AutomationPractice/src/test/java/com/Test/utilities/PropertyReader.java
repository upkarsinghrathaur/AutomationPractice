package com.Test.utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static String propertyFilePath= System.getProperty("user.dir")+"\\src/test/resources/propertyFile/config.properties";
	
	public static Properties getInstance() throws IOException
	{
		Properties obj= new Properties();
		FileInputStream file= new FileInputStream(propertyFilePath);
		obj.load(file);
		return obj;
	}
}
