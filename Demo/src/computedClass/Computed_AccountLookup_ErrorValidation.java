package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_AccountLookupPage;
import generatedClass.POM_Generated_Homepage;

public class Computed_AccountLookup_ErrorValidation 
{
	//enter the phone number in phone number field and clicking submit in account lookup page
	public WebDriver AccountLookup_EnterPhoneNumber(WebDriver driver,String Functionality,String TCName , String TestDataColumn) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_AccountLookupPage accountlookuppage = new POM_Generated_AccountLookupPage(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		Data obj = new Data();
		
		try
		{
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality ,TCName);
			obj.scrollingToTop(driver);
			obj.waitForElementClickable(driver, accountlookuppage.txt_Phone_Number_Field);
			accountlookuppage.type_txt_Phone_Number_Field(String.valueOf(Readexcel_RowName.getValue(TestDataColumn)));
			obj.scrollingToElementofAPage(driver, accountlookuppage.click_Get_Started_With_SEG_Button);
			accountlookuppage.click_click_Get_Started_With_SEG_Button();
			
			obj.waitForElementClickable(driver, homepage.click_Login_Or_Signup_Button);
		}
		catch(Exception e)
		{
			driver.close();
			Assert.fail("Error in accountlookup page");
		}
		return driver;
	}
	
	// validate invalid phone number message
	public WebDriver Error_Invalid_PhoneNumber_Msg(WebDriver driver,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_AccountLookupPage accountlookuppage = new POM_Generated_AccountLookupPage(driver);
		try
		{
			new Readexcel_RowName().excelRead("ErrorMessageSheet","AccountLookupPage",labelname);
			if(accountlookuppage.isDisplayed_txt_Error_Invalid_PhoneNumber_Msg()) 
			{
				if(accountlookuppage.getText_txt_Error_Invalid_PhoneNumber_Msg().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Error_Message"))))
				{
					Reporter.log("Errormessage Matched");
				}
				else
				{	
					driver.close();
					Assert.fail("Error message mismatched");	 
				}
			}		
			else
			{	
				driver.close();
				Assert.fail("Error message mismatched or not displayed");	 
			}
		}
		catch(Exception e)
		{	
			driver.close();
			Assert.fail("Wrong phone number");
		}    		
		return driver;		
	}
	
	// validate invalid phone number message lessthan 10 digits or special characters
	public WebDriver Error_Invalid_PhoneNumber_Lessthan10Digits_Msg(WebDriver driver,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_AccountLookupPage accountlookuppage = new POM_Generated_AccountLookupPage(driver);
		try
		{
			new Readexcel_RowName().excelRead("ErrorMessageSheet","AccountLookupPage",labelname);
			if(accountlookuppage.isDisplayed_txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg()) 
			{
				if(accountlookuppage.getText_txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Error_Message"))))
				{
					Reporter.log("Errormessage Matched");
				}
				else
				{	
					driver.close();
					Assert.fail("Error message mismatched");	 
				}
			}		
			else
			{	
				driver.close();
				Assert.fail("Error message mismatched or not displayed");	 
			}
		}
		catch(Exception e)
		{	
			driver.close();
			Assert.fail("Wrong phone number");
		}    		
		return driver;		
	}
	
	// validate AlreadyRegistered phone number message 
	public WebDriver Error_PhoneNumber_AlreadyRegistered_Msg(WebDriver driver,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_AccountLookupPage accountlookuppage = new POM_Generated_AccountLookupPage(driver);
		try
		{
			new Readexcel_RowName().excelRead("ErrorMessageSheet","AccountLookupPage",labelname);
			if(accountlookuppage.isDisplayed_txt_Error_PhoneNumber_AlreadyRegistered_Msg()) 
			{
				if(accountlookuppage.getText_txt_Error_PhoneNumber_AlreadyRegistered_Msg().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Error_Message"))))
				{
					Reporter.log("Errormessage Matched");
				}
				else
				{	
					driver.close();
					Assert.fail("Error message mismatched");	 
				}
			}		
			else
			{	
				driver.close();
				Assert.fail("Error message mismatched or not displayed");	 
			}
		}
		catch(Exception e)
		{	
			driver.close();
			Assert.fail("Un Expected Error");
		}    		
		return driver;		
	}
	
	//enter the card number in card number field and clicking submit in account lookup page
	public WebDriver AccountLookup_EnterCardNumber(WebDriver driver,String Functionality ,String TCName ,String TestDataColumn) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_AccountLookupPage accountlookuppage = new POM_Generated_AccountLookupPage(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		Data obj = new Data();
		
		try
		{
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality ,TCName);
			obj.scrollingToTop(driver);
			obj.waitForElementClickable(driver, accountlookuppage.txt_Card_Number_Field);
			accountlookuppage.type_txt_Card_Number_Field(String.valueOf(Readexcel_RowName.getValue(TestDataColumn)));
			obj.scrollingToElementofAPage(driver, accountlookuppage.click_Get_Started_With_SEG_Button);
			accountlookuppage.click_click_Get_Started_With_SEG_Button();
			
			obj.waitForElementClickable(driver, homepage.click_Login_Or_Signup_Button);
		}
		catch(Exception e)
		{
			driver.close();
			Assert.fail("Error in accountlookup page");
		}
		return driver;
	}
	
	// validate invalid Cardnumber number message
	public WebDriver Error_Invalid_CardNumber_Msg(WebDriver driver,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_AccountLookupPage accountlookuppage = new POM_Generated_AccountLookupPage(driver);
		try
		{
			new Readexcel_RowName().excelRead("ErrorMessageSheet","AccountLookupPage",labelname);
			if(accountlookuppage.isDisplayed_txt_Error_Invalid_CardNumber_Msg()) 
			{
				if(accountlookuppage.getText_txt_Error_Invalid_CardNumber_Msg().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Error_Message"))))
				{
					Reporter.log("Errormessage Matched");
				}
				else
				{	
					driver.close();
					Assert.fail("Error message mismatched");	 
				}
			}		
			else
			{	
				driver.close();
				Assert.fail("Error message mismatched or not displayed");	 
			}
		}
		catch(Exception e)
		{	
			driver.close();
			Assert.fail("Wrong Card number");
		}    		
		return driver;		
	}
	
	// validate Already Registered Cardnumber number message
	public WebDriver Error_CardNumber_AlreadyRegistered_Msg(WebDriver driver,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_AccountLookupPage accountlookuppage = new POM_Generated_AccountLookupPage(driver);
		try
		{
			new Readexcel_RowName().excelRead("ErrorMessageSheet","AccountLookupPage",labelname);
			if(accountlookuppage.isDisplayed_txt_Error_CardNumber_AlreadyRegistered_Msg()) 
			{
				if(accountlookuppage.getText_txt_Error_CardNumber_AlreadyRegistered_Msg().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Error_Message"))))
				{
					Reporter.log("Errormessage Matched");
				}
				else
				{	
					driver.close();
					Assert.fail("Error message mismatched");	 
				}
			}		
			else
			{	
				driver.close();
				Assert.fail("Error message mismatched or not displayed");	 
			}
		}
		catch(Exception e)
		{	
			driver.close();
			Assert.fail("Wrong Card number");
		}    		
		return driver;		
	}
}
