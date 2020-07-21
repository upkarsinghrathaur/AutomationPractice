package com.Test.utilities;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Test.listeners.ExtentReportListeners;

public class ExcelReader {

	public  FileInputStream fis = null;
	public static  XSSFWorkbook workbook = null;
	public static  XSSFSheet sheet = null;
	private static XSSFRow row   =null;
	private static XSSFCell cell = null;
	static DataFormatter formatter= new DataFormatter();
	
	public ExcelReader(String filePath, String sheetName)
	{
		try 
		{
			fis = new FileInputStream(filePath);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(sheetName);
		} catch (Exception e) 
		{		
			e.printStackTrace();
		} 	
	}
	
	    //returns the row count in a sheet
		public static int getRowCount()
		{	
			int rowNumber=0;
			try {
				rowNumber= sheet.getLastRowNum();
			} catch (Exception e) {
				ExtentReportListeners.testReport.get().fail("Row number not found.");
			}	
			return rowNumber;
		}
		
		// returns number of columns in a sheet	
		public static int getColumnCount()
		{		
				int colNumber=0;
				try {
					row = sheet.getRow(0);
					colNumber = row.getLastCellNum();
				} catch (Exception e) {
					ExtentReportListeners.testReport.get().fail("Column number not found.");
				}
				return colNumber;
		}
		
		public static String getCellData(int colNum,int rowNum)
		{
			try
			{
				
				row= sheet.getRow(rowNum);
				cell= row.getCell(colNum);
				String value= formatter.formatCellValue(cell).trim();
				return value;
				
			}catch(Exception e)
			{
				e.printStackTrace();
				return "row "+rowNum+" or column "+colNum +" does not exist in xls";
			}
			
		}
		
		public static boolean isRowEmpty(int rowNum)
		{			
			XSSFRow rowCount= sheet.getRow(rowNum);
			if (rowCount == null || rowCount.getLastCellNum() <= 0) 
			{
	            return true;
	        }
		   	    			    
			for (int c = rowCount.getFirstCellNum(); c < rowCount.getLastCellNum(); c++) 
		    {
		        XSSFCell cell = rowCount.getCell(c);
		        if (cell != null && cell.getCellType() != XSSFCell.CELL_TYPE_BLANK)
		        return false;
		    }		   
		    return true;
		}
}
