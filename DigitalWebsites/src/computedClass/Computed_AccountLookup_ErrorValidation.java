package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_AccountLookupPage;
import generatedClass.POM_Generated_Homepage;
import generatedClass.POM_Generated_One_Quick_Thing_Popup;

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
			obj.waitForElement(driver, homepage.click_Login_Or_Signup_Button);		
	    	
	    	homepage.click_click_Login_Or_Signup_Button();
	    	homepage.click_click_Register_Button();
	    	
	    	
			obj.waitForElement(driver, accountlookuppage.txt_Phone_Number_Field);
			
			accountlookuppage.type_txt_Phone_Number_Field(String.valueOf(Readexcel_RowName.getValue(TestDataColumn)));
			
			obj.scrollingToElementofAPage(driver, accountlookuppage.click_Get_Started_With_SEG_Button);
			accountlookuppage.click_click_Get_Started_With_SEG_Button();
			
			//obj.waitForElement(driver, homepage.click_Login_Or_Signup_Button);
		}
		catch(Exception e)
		{
			driver.close();
			Assert.fail("Error in accountlookup page");
		}
		return driver;
	}
	
	public WebDriver AccountLookup_EnterPhoneNumberCardNumberWithChars(WebDriver driver,String Functionality,String TCName , String TestDataColumn) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_AccountLookupPage accountlookuppage = new POM_Generated_AccountLookupPage(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		Data obj = new Data();
		
		try
		{
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality ,TCName);
			String enteredNumber="";
			String inputPhoneNumber="";
			obj.scrollingToTop(driver);
			obj.waitForElement(driver, homepage.click_Login_Or_Signup_Button);		
	    	
	    	homepage.click_click_Login_Or_Signup_Button();
	    	homepage.click_click_Register_Button();
	    	
	    	
			obj.waitForElement(driver, accountlookuppage.txt_Phone_Number_Field);
			inputPhoneNumber=String.valueOf(Readexcel_RowName.getValue(TestDataColumn));
			
			obj.scrollingToElementofAPage(driver, accountlookuppage.click_Get_Started_With_SEG_Button);
			obj.waitForElement(driver, accountlookuppage.txt_Phone_Number_Field);
			enteredNumber=String.valueOf(accountlookuppage.getText_txt_Phone_Number_Field());
			if (!enteredNumber.equals(inputPhoneNumber))
			{
				
				Reporter.log("charecters are not accepted in phone number field");
				
			}
			else
			{
				Assert.fail("Charecters are entered in phone number field");
			}
			
			
		}
		catch(Exception e)
		{
			driver.close();
			Assert.fail("Error in accountlookup page");
		}
		return driver;
	}
	
	public WebDriver AccountLookup_CardNumberGreaterthan16(WebDriver driver,String Functionality,String TCName , String TestDataColumn) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_AccountLookupPage accountlookuppage = new POM_Generated_AccountLookupPage(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		Data obj = new Data();
		
		try
		{
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality ,TCName);
			String enteredNumber="";
			String inputPhoneNumber="";
			int lenEnteredNumber;
			obj.scrollingToTop(driver);
			obj.waitForElement(driver, homepage.click_Login_Or_Signup_Button);		
	    	
	    	homepage.click_click_Login_Or_Signup_Button();
	    	homepage.click_click_Register_Button();
	    	
	    	
			obj.waitForElement(driver, accountlookuppage.txt_Phone_Number_Field);
			inputPhoneNumber=String.valueOf(Readexcel_RowName.getValue(TestDataColumn));
			
			obj.scrollingToElementofAPage(driver, accountlookuppage.click_Get_Started_With_SEG_Button);
			obj.waitForElement(driver, accountlookuppage.txt_Phone_Number_Field);
			enteredNumber=String.valueOf(accountlookuppage.getText_txt_Phone_Number_Field());
			lenEnteredNumber=String.valueOf(enteredNumber).length();
			if (!(lenEnteredNumber>16))
			{
				
				Reporter.log("Card number field does not accept more than 16 digits");
				
			}
			else
			{
				Assert.fail("Card number field accepts more than 16 digits");
			}
			
			
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
	
	//validate if already registered or proceeding for central office code
	
	public WebDriver validate_phoneNumber_CentralOfficeCodeNumber(WebDriver driver,String labelname) throws IOException
	{
		try
		{
			
		
		POM_Generated_AccountLookupPage accountLookupPage=new POM_Generated_AccountLookupPage(driver);
		new Readexcel_RowName().excelRead("ErrorMessageSheet","AccountLookupPage",labelname);
		POM_Generated_One_Quick_Thing_Popup pom_Generated_One_Quick_Thing_Popup = new POM_Generated_One_Quick_Thing_Popup(driver);
		if(accountLookupPage.isDisplayed_txt_Error_PhoneNumber_AlreadyRegistered_Msg()) 
		{
			
			System.out.println(String.valueOf(Readexcel_RowName.getValue(labelname)));
			if(accountLookupPage.getText_txt_Error_PhoneNumber_AlreadyRegistered_Msg().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue(labelname))))
			{
				System.out.println("Printed");
				Reporter.log("Country Code format is accepted but phone number is already registered to another account");
			}
			else
			{	
				driver.close();
				Assert.fail("Error message mismatched");	 
			}
			
		}
		else
		{
			if(driver.getTitle().equalsIgnoreCase("Account Info | Contact"))
			{
				Reporter.log("Country code format is accpeted and application navigates to contact info page");
			}
			else if (pom_Generated_One_Quick_Thing_Popup.isDisplayed_click_Ok_I_Will_Do_This_Now_Button())
			{
				Reporter.log("Country code format is accpeted and One quick thing pop up is displayed");
			}
		}
		return driver;
			
	}
	catch(NoSuchElementException | StaleElementReferenceException e1) 
	{
		Reporter.log("Given phone number is not registered to SEG and the system accepts the given country code number");
	}
		return driver;
	}
	
	
	public WebDriver validate_phoneNumber_InvalidCentralOfficeCodeNumber(WebDriver driver,String labelname) throws IOException
	{
		try
		{
			
		
		POM_Generated_AccountLookupPage accountLookupPage=new POM_Generated_AccountLookupPage(driver);
		new Readexcel_RowName().excelRead("ErrorMessageSheet","AccountLookupPage",labelname);
		POM_Generated_One_Quick_Thing_Popup pom_Generated_One_Quick_Thing_Popup = new POM_Generated_One_Quick_Thing_Popup(driver);
		if(accountLookupPage.isDisplayed_txt_Error_Invalid_PhoneNumber_Msg()) 
		{
			
			if(accountLookupPage.getText_txt_Error_Invalid_PhoneNumber_Msg().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Error_Message"))))
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
			if(driver.getTitle().equalsIgnoreCase("Account Info | Contact"))
			{
				Reporter.log("Invalid Country code format is accpeted and application navigates to contact info page");
				Assert.fail("Invalid country code is accepted");
			}
			else if (pom_Generated_One_Quick_Thing_Popup.isDisplayed_click_Ok_I_Will_Do_This_Now_Button())
			{
				Reporter.log("Invalid Country code format is accpeted and application navigates to contact info page");
				Assert.fail("Invalid country code is accepted");
			}
		}
		return driver;
			
	}
	catch(NoSuchElementException | StaleElementReferenceException e1) 
	{
		Reporter.log("Given phone number is not registered to SEG and the system accepts the given country code number");
	}
		return driver;
	}
	
	public WebDriver validate_phoneNumber_InvalidNPACodeNumber(WebDriver driver,String labelname) throws IOException
	{
		try
		{
			
		
		POM_Generated_AccountLookupPage accountLookupPage=new POM_Generated_AccountLookupPage(driver);
		new Readexcel_RowName().excelRead("ErrorMessageSheet","AccountLookupPage",labelname);
		POM_Generated_One_Quick_Thing_Popup pom_Generated_One_Quick_Thing_Popup = new POM_Generated_One_Quick_Thing_Popup(driver);
		if(accountLookupPage.isDisplayed_txt_Error_Invalid_PhoneNumber_Msg()) 
		{
			
			if(accountLookupPage.getText_txt_Error_Invalid_PhoneNumber_Msg().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Error_Message"))))
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
			if(driver.getTitle().equalsIgnoreCase("Account Info | Contact"))
			{
				Reporter.log("Invalid NPA code format is accpeted and application navigates to contact info page");
				Assert.fail("Invalid country code is accepted");
			}
			else if (pom_Generated_One_Quick_Thing_Popup.isDisplayed_click_Ok_I_Will_Do_This_Now_Button())
			{
				Reporter.log("Invalid NPA code format is accpeted and application navigates to contact info page");
				Assert.fail("Invalid country code is accepted");
			}
		}
		return driver;
			
	}
	catch(NoSuchElementException | StaleElementReferenceException e1) 
	{
		Reporter.log("Given phone number is not registered to SEG and the system accepts the given country code number");
	}
		return driver;
	}
	
	
	public WebDriver validate_phoneNumber_NPACodeNumber(WebDriver driver,String labelname) throws IOException
	{
		try
		{
			
		
		POM_Generated_AccountLookupPage accountLookupPage=new POM_Generated_AccountLookupPage(driver);
		new Readexcel_RowName().excelRead("ErrorMessageSheet","AccountLookupPage",labelname);
		POM_Generated_One_Quick_Thing_Popup pom_Generated_One_Quick_Thing_Popup = new POM_Generated_One_Quick_Thing_Popup(driver);
		if(accountLookupPage.isDisplayed_txt_Error_PhoneNumber_AlreadyRegistered_Msg()) 
		{
			if(accountLookupPage.getText_txt_Error_PhoneNumber_AlreadyRegistered_Msg().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue(labelname))))
			{
				Reporter.log("Country Code format is accepted but phone number is already registered to another account");
			}
			else
			{	
				driver.close();
				Assert.fail("Error message mismatched");	 
			}
			
		}
		else
		{
			if(driver.getTitle().equalsIgnoreCase("Account Info | Contact"))
			{
				Reporter.log("Country code format is accpeted and application navigates to contact info page");
			}
			else if (pom_Generated_One_Quick_Thing_Popup.isDisplayed_click_Ok_I_Will_Do_This_Now_Button())
			{
				Reporter.log("Country code format is accpeted and One quick thing pop up is displayed");
			}
		}
		return driver;
			
	}
		catch(NoSuchElementException | StaleElementReferenceException e1) 
		{
			Reporter.log("Given phone number is not registered to SEG and the system accepts the given country code number");
		}
			return driver;
		}
	
	
	public WebDriver validate_phoneNumber_SubscriberNumber(WebDriver driver,String labelname) throws IOException
	{
		try
		{
			
		
		POM_Generated_AccountLookupPage accountLookupPage=new POM_Generated_AccountLookupPage(driver);
		new Readexcel_RowName().excelRead("ErrorMessageSheet","AccountLookupPage",labelname);
		POM_Generated_One_Quick_Thing_Popup pom_Generated_One_Quick_Thing_Popup = new POM_Generated_One_Quick_Thing_Popup(driver);
		if(accountLookupPage.isDisplayed_txt_Error_PhoneNumber_AlreadyRegistered_Msg()) 
		{
			if(accountLookupPage.getText_txt_Error_PhoneNumber_AlreadyRegistered_Msg().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue(labelname))))
			{
				Reporter.log("Country Code format is accepted but phone number is already registered to another account");
			}
			else
			{	
				driver.close();
				Assert.fail("Error message mismatched");	 
			}
			
		}
		else
		{
			if(driver.getTitle().equalsIgnoreCase("Account Info | Contact"))
			{
				Reporter.log("Country code format is accpeted and application navigates to contact info page");
			}
			else if (pom_Generated_One_Quick_Thing_Popup.isDisplayed_click_Ok_I_Will_Do_This_Now_Button())
			{
				Reporter.log("Country code format is accpeted and One quick thing pop up is displayed");
			}
		}
		return driver;
			
	}
		catch(NoSuchElementException | StaleElementReferenceException e1) 
		{
			Reporter.log("Given phone number is not registered to SEG and the system accepts the given country code number");
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
				if(accountlookuppage.getText_txt_Error_PhoneNumber_AlreadyRegistered_Msg().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue(labelname))))
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
			obj.waitForElement(driver, accountlookuppage.txt_Card_Number_Field);
			accountlookuppage.type_txt_Card_Number_Field(String.valueOf(Readexcel_RowName.getValue(TestDataColumn)));
			obj.scrollingToElementofAPage(driver, accountlookuppage.click_Get_Started_With_SEG_Button);
			accountlookuppage.click_click_Get_Started_With_SEG_Button();
			
			obj.waitForElement(driver, homepage.click_Login_Or_Signup_Button);
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
				if(accountlookuppage.getText_txt_Error_Invalid_CardNumber_Msg().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue(labelname))))
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
