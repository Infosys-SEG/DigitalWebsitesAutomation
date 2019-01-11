package Utility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Readexcel_RowName 
{
	static HashMap<String, String> excelValue;
	static Workbook wb;
	static FileInputStream fs;
	
	@SuppressWarnings({ "unchecked", "rawtypes", "deprecation" })
	public void excelRead(String ExcelName,String SheetName, String testCaseName) throws IOException 
	{
		if(ExcelName.equalsIgnoreCase("Global_TestData_Sheet"))
		{
			fs = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Global_TestData_Sheet.xlsx");
		}
		else if(ExcelName.equalsIgnoreCase("ErrorMessageSheet"))
		{
			fs = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\ErrorMessageSheet.xlsx");
		}
		else
		{
			System.out.println("error");
		}
		wb=new XSSFWorkbook(fs);
		
		Sheet sh = wb.getSheet(SheetName);
		excelValue = new HashMap();
		int lastRow = sh.getLastRowNum();
		int rowNum;
		Row row = null;
		Row row0 = sh.getRow(0);
		for (rowNum = 1; rowNum <= lastRow; rowNum++)
		{
			row = sh.getRow(rowNum);
			
			if (row.getCell(0).getStringCellValue().equalsIgnoreCase(testCaseName))
			{
				
				break;
			}
			
			
		}
		for (int i = 1; i < row.getLastCellNum(); i++)
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


