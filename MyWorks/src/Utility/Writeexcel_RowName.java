package Utility;
	import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writeexcel_RowName 
{
	static Workbook wb;
	static FileInputStream fs;

	public void excelwrite(String Functionality, String TCName,String ColumnName, String Value) throws IOException 
	{
		
		String Filepath = System.getProperty("user.dir")+"\\TestData\\Global_TestData_Sheet.xlsx";
		fs = new FileInputStream(Filepath);
		
		wb=new XSSFWorkbook(fs);
			
		Sheet sh = wb.getSheet(Functionality);
	
		int lastRow = sh.getLastRowNum();
		int rowNum;
		Row row = null;
		Row row0 = sh.getRow(0);
		for (rowNum = 1; rowNum <= lastRow; rowNum++)
		{
			row = sh.getRow(rowNum);
			if (row.getCell(0).getStringCellValue().equalsIgnoreCase(TCName))
			{
				System.out.println(TCName);
				for (int i = 1; i < row.getLastCellNum(); i++)
				{
					if(row0.getCell(i).getStringCellValue().equalsIgnoreCase(ColumnName))
					{
						System.out.println(ColumnName);
						sh.getRow(rowNum).createCell(i).setCellValue(Value);
						fs.close();
						FileOutputStream fileOut = new FileOutputStream(Filepath);
						wb.write(fileOut);
						wb.close();
					     
						fileOut.flush();
						   
						fileOut.close();
						System.out.println("done");
					}
				}
			}		
		}
	}	
}
