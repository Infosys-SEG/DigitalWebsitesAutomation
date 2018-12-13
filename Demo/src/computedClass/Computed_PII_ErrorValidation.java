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
		obj.waitForElementClickable(driver, verificationpage.txt_PII_Verification_Month_Field);
			
		try
		{
			obj.scrollingToElementofAPage(driver, verificationpage.txt_PII_Verification_Month_Field);
    		String dob=String.valueOf(Readexcel_RowName.getValue(TestDataColumn));
    		String[] dobsplit=dob.split("/");
    		String month=dobsplit[0];
    		String date=dobsplit[1];
    		String year=dobsplit[2];
    		verificationpage.type_txt_PII_Verification_Month_Field(month);
    		verificationpage.type_txt_PII_Verification_Date_Field(date);
    		verificationpage.type_txt_PII_Verification_Year_Field(year);
    		obj.scrollingToElementofAPage(driver, verificationpage.txt_PII_Verification_Zipcode_Field);
    		verificationpage.click_txt_PII_Verification_Zipcode_Field();
    		
		}
		catch(Exception e)
		{
			driver.close();
			Assert.fail("Error in PII Verification page");
		}
		return driver;
	}
	
	// Validate 
	public WebDriver Invalid_Month_ErrMsg(WebDriver driver,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_VerificationPage verificationpage = new POM_Generated_VerificationPage(driver);
		
			
		try
		{
			new Readexcel_RowName().excelRead("ErrorMessageSheet","AccountLookupPage",labelname);
			if(verificationpage.isDisplayed_txt_Error_PII_InvalidMonth_Msg())
    		{
    			if(verificationpage.getText_txt_Error_PII_InvalidMonth_Msg().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Error_Message"))));
    			{
    				Reporter.log("Error Message matched");
    			}
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
