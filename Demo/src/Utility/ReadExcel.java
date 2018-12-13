package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
	static HashMap<String, String> excelValue;
	static Workbook wb;
	static FileInputStream fs;
	public void openExcel() throws IOException
	{
		//String testData = System.getProperty("user.dir");
		fs = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Global_TestData_Sheet.xlsx");
		wb = new XSSFWorkbook(fs);
	}
	@SuppressWarnings({ "deprecation", "unused", "unchecked", "rawtypes" })
	public void excelRead(String SheetName, int j) 
	{
		Sheet sh = wb.getSheet(SheetName);
		excelValue = new HashMap();
		int lastRow = sh.getLastRowNum();
		
		int rowNum;
		Row row = null;
		Row row0 = sh.getRow(0);
		//for (rowNum = 1; rowNum <= lastRow; rowNum++)
		//{
			row = sh.getRow(j);
		//}
		for (int i = 0; i < row.getLastCellNum(); i++)
		{
			if (row.getCell(i).getCellType() == 1)
				excelValue.put(row0.getCell(i).getStringCellValue(), row.getCell(i).getStringCellValue());
			else if (row.getCell(i).getCellType() == 0)
				excelValue.put(row0.getCell(i).getStringCellValue(), row.getCell(i).getNumericCellValue() + "");
			else if (row.getCell(i).getCellType() == 3)
				continue;
		}
	}
	public static String getValue(String key)
	{
		return excelValue.get(key);
	}
	
	public void closeExcel() throws IOException
	{
		wb.close();
		fs.close();
	}
}
