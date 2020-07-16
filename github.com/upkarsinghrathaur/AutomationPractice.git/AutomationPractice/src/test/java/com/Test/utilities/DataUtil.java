package com.Test.utilities;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.testng.annotations.DataProvider;


public class DataUtil {

	@DataProvider(name="excelData")
	public static Object[][] getData(Method m) throws IOException 
	{
		String testName = m.getName();
		new ExcelReader(System.getProperty("user.dir")+PropertyReader.getInstance().getProperty("excelDataFile"), testName);
		int row= ExcelReader.getRowCount();
		int col= ExcelReader.getColumnCount();
		int temp=0;
		Object[][] data = new Object[row][1];
		Hashtable<String, String> table=null;
		
		for(int rowNum=1; rowNum<=row; rowNum++)
		{
			if(ExcelReader.isRowEmpty(rowNum)== true)
			{
				continue;
			}
			
			table= new Hashtable<String, String>();
			for(int colNum=0; colNum< col; colNum++)
			{
				table.put(ExcelReader.getCellData(colNum, 0), ExcelReader.getCellData(colNum, rowNum));
			}
				data[temp][0]= table;
				temp++;
		}
		 			
		Object[][] excelValue= new Object[temp][1];
		 for(int i=0;i<temp;i++)
		 {
			 excelValue[i]= data[i];
		 }
				
		 return excelValue;	
	}
}
