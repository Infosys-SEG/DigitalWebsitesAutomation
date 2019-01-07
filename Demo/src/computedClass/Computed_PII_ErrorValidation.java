package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_VerificationPage;

public class Computed_PII_ErrorValidation 
{
	
	// Enter PII DOB column
	public WebDriver PII_Validation_EnterDOB(WebDriver driver,String Functionality , String TCName, String TestDataColumn) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_VerificationPage verificationpage = new POM_Generated_VerificationPage(driver);
		Data obj = new Data();
		String Global="Global";
		obj.waitForElementClickable(driver, verificationpage.txt_PII_Verification_Month_Field);
		new Readexcel_RowName().excelRead("Global_TestData_Sheet","PII_Validation",TCName);	
		try
		{ 
			
			obj.movetoElementofAPage(driver, verificationpage.txt_PII_Verification_Month_Field);
    		String dob=String.valueOf(Readexcel_RowName.getValue(TestDataColumn));
    		//System.out.println(dob);
    		String[] dobsplit=dob.split("/");
    		String month=dobsplit[0];
    		String date=dobsplit[1];
    		String year=dobsplit[2];
    		verificationpage.type_txt_PII_Verification_Month_Field(month);
    		verificationpage.type_txt_PII_Verification_Date_Field(date);
    		verificationpage.type_txt_PII_Verification_Year_Field(year);
    		obj.movetoElementofAPage(driver, verificationpage.txt_PII_Verification_Zipcode_Field);
    		verificationpage.click_txt_PII_Verification_Zipcode_Field();
    		
		}
		catch(Exception e)
		{
			System.out.println(e);
			Assert.fail("Error in PII Verification page");
		}
		return driver;
	}
	
	// Validate invalid month
	public WebDriver Invalid_Month_ErrMsg(WebDriver driver,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_VerificationPage verificationpage = new POM_Generated_VerificationPage(driver);
		
			
		try
		{
			new Readexcel_RowName().excelRead("ErrorMessageSheet","VerificationPage",labelname);
			String Error_Msg= Readexcel_RowName.getValue("ErrorMessage");
			
			if(verificationpage.isDisplayed_txt_Error_PII_InvalidMonth_Msg())
    		{
    			if(verificationpage.getText_txt_Error_PII_InvalidMonth_Msg().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Error_Message"))));
    			{
    				Reporter.log("Error message is displayed on entering invalid month in Birthday field -" +Error_Msg);
    			}
    		}
			else
			{
				
				Assert.fail("Error message is not  displayed on entering invalid month in Birthday field ");
    		}
    		
		}
		catch(Exception e)
		{
			driver.close();
			Assert.fail("Error in PII Verification page");
		}
		return driver;
	}
	
	//validate invalid date
	public WebDriver Invalid_Day_ErrMsg(WebDriver driver,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_VerificationPage verificationpage = new POM_Generated_VerificationPage(driver);
		
			
		try
		{
			new Readexcel_RowName().excelRead("ErrorMessageSheet","VerificationPage",labelname);
			String Error_Msg= Readexcel_RowName.getValue("ErrorMessage");
			//System.out.println(Error_Msg);
			if(verificationpage.isDisplayed_txt_Error_PII_InvalidDate_Msg())
    		{
				
    			if(verificationpage.getText_txt_Error_PII_InvalidDate_Msg().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Error_Message"))));
    			{
    				Reporter.log("Error message is displayed on entering invalid date in Birthday field -" +Error_Msg);
    			}
    		}
			else
			{
				
				Assert.fail("Error message is not  displayed on entering invalid date in Birthday field ");
    		}
    		
		}
		catch(Exception e)
		{
			driver.close();
			Assert.fail("Error in PII Verification page");
		}
		return driver;
	}
	//validate invalid year
	public WebDriver Invalid_Year_ErrMsg(WebDriver driver,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_VerificationPage verificationpage = new POM_Generated_VerificationPage(driver);
		
			
		try
		{
			new Readexcel_RowName().excelRead("ErrorMessageSheet","VerificationPage",labelname);
			String Error_Msg= Readexcel_RowName.getValue("ErrorMessage");
			
			if(verificationpage.isDisplayed_txt_Error_PII_InvalidYear_Msg())
    		{
    			if(verificationpage.getText_txt_Error_PII_InvalidYear_Msg().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Error_Message"))));
    			{
    				Reporter.log("Error message is displayed on entering invalid year in Birthday field -" +Error_Msg);
    			}
    		}
			else
			{
				Assert.fail("Error message is not  displayed on entering invalid year in Birthday field ");
			}
    		
		}
		catch(Exception e)
		{
			driver.close();
			Assert.fail("Error in PII Verification page");
		}
		return driver;
	}
	
	
//validate zip issue
public WebDriver Invalid_Zipcode_ErrMsg(WebDriver driver,String Functionality,String TCName,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_VerificationPage verificationpage = new POM_Generated_VerificationPage(driver);
		
		new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);	
		try
		{
			if(verificationpage.getValue_txt_PII_Verification_Zipcode_Field().equals(""))
			{
				verificationpage.type_txt_PII_Verification_Zipcode_Field(Readexcel_RowName.getValue("zip"));
			}
			if(verificationpage.getValue_txt_PII_Verification_Zipcode_Field().equals(""));
			{
				Reporter.log("Special characters are not allowed in Zip code field");
			}
			if(verificationpage.getValue_txt_PII_Verification_Zipcode_Field().equals(""))
			{
				verificationpage.type_txt_PII_Verification_Zipcode_Field(Readexcel_RowName.getValue("zip1"));
			}
			verificationpage.click_txt_PII_Verification_Month_Field();
			new Readexcel_RowName().excelRead("ErrorMessageSheet","VerificationPage",labelname);
			if(verificationpage.isDisplayed_txt_Error_PII_Zip_Lessthan5digit_Msg())
    		{
				String err1 = Readexcel_RowName.getValue("ErrorMessage");
    			if(verificationpage.getText_txt_Error_PII_Zip_Lessthan5digit_Msg().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Error_Message"))));
    			{
    				Reporter.log("Error Message is displayed on entering zip code less than 5 digits : "+ err1);
    			}
    		}
			else
			{
				Assert.fail("Error message is not displayed on entering zip less than 5 digits");
			}
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
			if(!verificationpage.getValue_txt_PII_Verification_Zipcode_Field().equals(""))
			{
				verificationpage.type_txt_PII_Verification_Zipcode_Field(Readexcel_RowName.getValue("zip2"));
			}
			String pzip = verificationpage.getValue_txt_PII_Verification_Zipcode_Field();
			if(pzip.length()==5)
			{
				Reporter.log("More than 5 digits is not allowed in zip code field");
			}
			else
			{
				Assert.fail("More than 5 digits is allowed in zip code field");
			}
    		
		}
		catch(Exception e)
		{
			driver.close();
			Assert.fail("Error in PII Verification page");
		}
		return driver;
	}

//validate invalid month & date
	public WebDriver Invalid_Month_Day_ErrMsg(WebDriver driver,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_VerificationPage verificationpage = new POM_Generated_VerificationPage(driver);
	
		try
		{
			new Readexcel_RowName().excelRead("ErrorMessageSheet","VerificationPage",labelname);
			String Error_Msg= Readexcel_RowName.getValue("ErrorMessage");
			
			if(verificationpage.isDisplayed_txt_Error_PII_InvalidMonthDate_Msg())
  		{
  			if(verificationpage.getText_txt_Error_PII_InvalidMonthDate_Msg().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Error_Message"))));
  			{
  				Reporter.log("Error message is displayed on entering invalid Date & Month in Birthday field -" +Error_Msg);
  			}
  		}
			else
			{
				Assert.fail("Error message is not  displayed on entering invalid Date & Month in Birthday field ");
			}
  		
		}
		catch(Exception e)
		{
			driver.close();
			Assert.fail("Error in PII Verification page");
		}
		return driver;
	}
	
//validate invalid date & year
    public WebDriver Invalid_Day_Year_ErrMsg(WebDriver driver,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
		{
			POM_Generated_VerificationPage verificationpage = new POM_Generated_VerificationPage(driver);
		
			try
			{
				new Readexcel_RowName().excelRead("ErrorMessageSheet","VerificationPage",labelname);
				String Error_Msg= Readexcel_RowName.getValue("ErrorMessage");
				
				if(verificationpage.isDisplayed_txt_Error_PII_InvalidDateYear_Msg())
	  		{
	  			if(verificationpage.getText_txt_Error_PII_InvalidDateYear_Msg().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Error_Message"))));
	  			{
	  				Reporter.log("Error message is displayed on entering invalid Date & Year in Birthday field -" +Error_Msg);
	  			}
	  		}
				else
				{
					Assert.fail("Error message is not  displayed on entering invalid Date & Year in Birthday field ");
				}
	  		
			}
			catch(Exception e)
			{
				//driver.close();
				Assert.fail("Error in PII Verification page");
			}
			return driver;
		}		

  //validate invalid month & year
	public WebDriver Invalid_Month_Year_ErrMsg(WebDriver driver,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_VerificationPage verificationpage = new POM_Generated_VerificationPage(driver);
	
		try
		{
			new Readexcel_RowName().excelRead("ErrorMessageSheet","VerificationPage",labelname);
			String Error_Msg= Readexcel_RowName.getValue("ErrorMessage");
			
			if(verificationpage.isDisplayed_txt_Error_PII_InvalidMonthYear_Msg())
  		{
  			if(verificationpage.getText_txt_Error_PII_InvalidMonthYear_Msg().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Error_Message"))));
  			{
  				Reporter.log("Error message is displayed on entering invalid Month & Year in Birthday field -" +Error_Msg);
  			}
  		}
			else
			{
				Assert.fail("Error message is not  displayed on entering invalid Month & Year in Birthday field ");
			}
  		
		}
		catch(Exception e)
		{
			driver.close();
			Assert.fail("Error in PII Verification page");
		}
		return driver;
	}
	
	//validate invalid month,date & year
	public WebDriver Invalid_Month_Day_Year_ErrMsg(WebDriver driver,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_VerificationPage verificationpage = new POM_Generated_VerificationPage(driver);
	
		try
		{
			new Readexcel_RowName().excelRead("ErrorMessageSheet","VerificationPage",labelname);
			String Error_Msg= Readexcel_RowName.getValue("ErrorMessage");
			
			if(verificationpage.isDisplayed_txt_Error_PII_InvalidMonthDateYear_Msg())
  		{
  			if(verificationpage.getText_txt_Error_PII_InvalidMonthDateYear_Msg().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Error_Message"))));
  			{
  				Reporter.log("Error message is displayed on entering invalid Month, Date & Year in Birthday field -" +Error_Msg);
  			}
  		}
			else
			{
				Assert.fail("Error message is not  displayed on entering invalid Month, Date & Year in Birthday field ");
			}
  		
		}
		catch(Exception e)
		{
			driver.close();
			Assert.fail("Error in PII Verification page");
		}
		return driver;
	}
}
