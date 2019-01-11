package computedClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class POMComputed 
{	
	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws FileNotFoundException,IOException
	{
		try 
		{
			
			String packAge="generatedClass";   
			//String sheetName="Specify the package";
			//String inputfile="Input file Path";
			String sheetName="VerificationPage";
			String inputfile="O:\\QA and Testing Department\\Roadrunner\\Digital Websites\\LocatorsSheet.xlsx";
			
			String className="POM_Generated_VerificationPage";
			
			@SuppressWarnings("resource")
		
			XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File(inputfile)));
			
			XSSFSheet sheet1=wb.getSheet(sheetName);
			
			ArrayList<String> lstOfControlTypes=new ArrayList<String>();
			ArrayList<String> lstOfLabelNames=new ArrayList<String>();
			ArrayList<String> lstOfIdentifierTypes=new ArrayList<String>();
			ArrayList<String> lstOfIdentifierValues=new ArrayList<String>();
			
			 
			Iterator<Row> rowIterator=sheet1.iterator();
			
			while(rowIterator.hasNext())
			{
			 		
				Row row=rowIterator.next();
				Iterator<Cell> cellIterator=row.cellIterator();
				Cell cell;
				cell=cellIterator.next();
				cell.setCellType(Cell.CELL_TYPE_STRING);
				lstOfControlTypes.add(cell.getStringCellValue());
				
				cell=cellIterator.next();
				cell.setCellType(Cell.CELL_TYPE_STRING);
				lstOfLabelNames.add(cell.getStringCellValue());
				
				cell=cellIterator.next();
				cell.setCellType(Cell.CELL_TYPE_STRING);
				lstOfIdentifierTypes.add(cell.getStringCellValue());
				
				cell=cellIterator.next();
				cell.setCellType(Cell.CELL_TYPE_STRING);
				lstOfIdentifierValues.add(cell.getStringCellValue());
				
			}
			
			 	System.out.println("//******************************");
			 	
			   
			
			
			System.out.println("package  "+ packAge + ";" );
			System.out.println("import org.openqa.selenium.WebDriver;");
			System.out.println("import org.openqa.selenium.WebElement;");
			System.out.println("import org.openqa.selenium.support.CacheLookup;");
			System.out.println("import org.openqa.selenium.support.FindBy;");
			System.out.println("import org.openqa.selenium.support.PageFactory;");
			System.out.println("import org.openqa.selenium.support.ui.Select;");
			System.out.println("import org.openqa.selenium.interactions.Actions;");
			System.out.println("");
			System.out.println("public class "+  className	+ " { "   );
			System.out.println("\t" + "WebDriver driver;");
			System.out.println("\t" + "public "+ className
					+ " (WebDriver driver)  {");
			System.out.println("\t\t" + "this.driver = driver;");
			System.out.println("\t\t" + "PageFactory.initElements(driver, this);");
			System.out.println("\t"   + "}");
			System.out.println("");
			System.out.println("");
			System.out.println("\t// Object Repository");
			System.out.println("");
			System.out.println("");
			int i=1;
			
			while (i<lstOfControlTypes.size()) {
				
				String computedVariableName = lstOfControlTypes.get(i)  + "_"
						+ lstOfLabelNames.get(i).replaceAll(" ", "_");
				System.out.println("\t// Associated Label : "
						+ lstOfLabelNames.get(i) );
				System.out.println("\t" + "@FindBy(" + lstOfIdentifierTypes.get(i)
										+ " = \"" + lstOfIdentifierValues.get(i)  +    "\")");
				System.out.println("\t" + "public WebElement " 
										+ computedVariableName + ";");
				System.out.println("\t" + "");
				i++;		
							
			}
			System.out.println("");
			System.out.println("//*******************************************************************************");
			System.out.println("");
			System.out.println("");
			System.out.println("\t// Element Actions");
			System.out.println("");
			System.out.println("");
			
			int m=1;
			while(m<lstOfControlTypes.size())
			{
				
				String computedVariableName=lstOfControlTypes.get(m) + "_"
						+ lstOfLabelNames.get(m).replaceAll(" ", "_");
				
				if(lstOfControlTypes.get(m).equals("ddl")) {
					System.out.
							println("// Method to select a value from dropDown :"
											+lstOfLabelNames.get(m));
					System.out.println("\tpublic void select_"
							+computedVariableName + "(String value){");
					
					System.out.println("\t\tSelect Select=new Select("
							+computedVariableName +");");
					System.out.println("\tSelect.selectByVisibleText(value);");
					System.out.println("\t}");
					System.out.println("");
					
					System.out.println("\t // Method to retrieve selected value from drop Down :"
										+ lstOfLabelNames.get(m));
					System.out.println("\tpublic String get_first_Selected_value_"
							+ computedVariableName + "(){");
					System.out.println("\t\tSelect Select=new Select("
							+computedVariableName +");");
					System.out.println("\t\treturn Select.getFirstSelectedOption().getText();");
					System.out.println("\t}");
					System.out.println("");
				
			}
			
			if(lstOfControlTypes.get(m).equals("txt"))
			{
		
				System.out.println("\t// Type:  "+lstOfLabelNames.get(m));
				System.out.println("\tpublic void type_" + computedVariableName
									+ "(String value) {");
				System.out.println("\t\t" + computedVariableName + ".clear();");
				System.out.println("\t\t" + computedVariableName + 
											".sendKeys(value);");
				System.out.println("\t}");
				System.out.println("");
			}
			
			System.out.println("\t//click:  "+lstOfLabelNames.get(m));
			System.out.println("\tpublic void click_" + computedVariableName
					+ "(){");
			System.out.println("\t\t" + computedVariableName + ".click();");
			System.out.println("\t}");
			System.out.println("");
			
			System.out.println("\t// Hover:  "+lstOfLabelNames.get(m));
			System.out.println("\tpublic void hover_" + computedVariableName
					+ "(){");
			System.out.println("\t\tActions action=new Actions(driver); ");
			System.out.println("\t\taction.moveToElement("
						+ computedVariableName +").build().perform();");
			System.out.println("\t}");
			System.out.println("");
			System.out.println("\t// visible or Not :  "+lstOfLabelNames.get(m));
			System.out.println("\tpublic boolean isDisplayed_" + computedVariableName
					+ "(){");
			System.out.println("\t\tif("+computedVariableName
							+".isDisplayed()) { return true; } else { return false;} ");
			System.out.println("\t}");
			System.out.println("");
			System.out.println("\t// Enabled or Not :  "+lstOfLabelNames.get(m));
			System.out.println("\tpublic boolean isEnabled_" + computedVariableName
					+ "(){");
			System.out.println("\t\tif("+computedVariableName
					+".isEnabled()) { return true; } else { return false;} ");
			System.out.println("\t}");
			System.out.println("");
			System.out.println("\t// Get CSS attribute :  "+lstOfLabelNames.get(m));
			System.out.println("\tpublic String getCssValue_"
								+ computedVariableName +"(String attribute) {");
			System.out.println("\t\treturn " + computedVariableName
								+".getCssValue(attribute);");
			System.out.println("\t}");
			System.out.println("");
			System.out.println("\t//Get the text :  "+lstOfLabelNames.get(m));
			System.out.println("\tpublic String getText_" + computedVariableName
					+ "(){");
			System.out.println("\t\treturn " + computedVariableName
					+".getText();");
			System.out.println("\t}");
			System.out.println("");
			System.out.println("\t//Get the value :  "+lstOfLabelNames.get(m));
			System.out.println("\tpublic String getValue_" + computedVariableName
					+ "(){");
			System.out.println("\t\treturn " + computedVariableName
					+".getAttribute(\"value\");");
			System.out.println("\t}");
			System.out.println("\t// selected or Not :  "+lstOfLabelNames.get(m));
			System.out.println("\tpublic boolean isSelected_" + computedVariableName
					+ "(){");
			System.out.println("\t\tif("+computedVariableName
							+".isSelected()) { return true; } else { return false;} ");
			System.out.println("\t}");
			System.out.println("");
			m++;
			
		}
		System.out.println("}");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
  }
	
}
