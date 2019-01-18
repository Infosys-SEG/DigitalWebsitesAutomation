package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_AccountLookupPage;
import generatedClass.POM_Generated_AccountSecurityPage;
import generatedClass.POM_Generated_ContactInfoPage;
import generatedClass.POM_Generated_Homepage;

public class Computed_ContactInfo_ErrorValidation 
{
	String Global="Global";
	Data obj=new Data();
	public WebDriver Contactinfo_nav(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_ContactInfoPage contactinfo= new POM_Generated_ContactInfoPage(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_AccountLookupPage acctlookup = new POM_Generated_AccountLookupPage(driver);
		new Readexcel_RowName().excelRead("Global_TestData_Sheet",Global,Functionality);
		try 
		{
			
			obj.waitForElementClickable(driver, homepage.click_Login_Or_Signup_Button);
			homepage.click_click_Login_Or_Signup_Button();
			obj.waitForElementClickable(driver, homepage.click_Register_Button);
			homepage.click_click_Register_Button();
			obj.waitForElementClickable(driver, acctlookup.click_Signup_As_New_Member_Button);
			obj.scrollingToElementofAPage(driver,acctlookup.click_Signup_As_New_Member_Button);
			acctlookup.click_click_Signup_As_New_Member_Button();
			if(contactinfo.isDisplayed_txt_ContactUs_Stepcounter())
			{
				Reporter.log("Navigated to Contact info page");
			}
			
		}
		catch(Exception e)
		{
			obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact"); 
			Assert.fail("Unable to navigate to Contact info screen");
		}
		return driver;
    }
	public WebDriver Invalid_Or_Empty_FirstName_ErrMsg(WebDriver driver,String Functionality,String TCName,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		 POM_Generated_ContactInfoPage contactinfo= new POM_Generated_ContactInfoPage(driver);
		 try
		 {
			new Readexcel_RowName().excelRead("ErrorMessageSheet","ContactInfoPage",labelname);
			contactinfo.click_click_Submit_Form_Button();
			String Error_Msg7= Readexcel_RowName.getValue("ErrorMessage");
			System.out.println(Error_Msg7);
			if(contactinfo.isDisplayed_txt_Error_FirstName_Blank()) 
			{
				if(contactinfo.getText_txt_Error_FirstName_Blank().equalsIgnoreCase(String.valueOf(Error_Msg7)))
				{
					Reporter.log("Appropriate error message is displayed in Contact info for blank firstname:" +Error_Msg7);
				}
				else
				{	
					obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact"); 
					Assert.fail("Error message mismatched");	 
				}
			}		
			else
			{	
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
				Assert.fail("Error message mismatched or not displayed for blank first name");	 
			}
		}
		catch(Exception e)
		{	
			obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
			driver.close();
			Assert.fail("Un Expected Error");
		}    		
		return driver;		
	}
	
	public WebDriver Invalid_Or_Empty_LastName_ErrMsg(WebDriver driver,String Functionality,String TCName,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		 POM_Generated_ContactInfoPage contactinfo= new POM_Generated_ContactInfoPage(driver);
		 try
		 {
			new Readexcel_RowName().excelRead("ErrorMessageSheet","ContactInfoPage",labelname);
			contactinfo.click_click_Submit_Form_Button();
			String Error_Msg8= Readexcel_RowName.getValue("ErrorMessage");
			System.out.println(Error_Msg8);
			if(contactinfo.isDisplayed_txt_Error_LastName_Blank()) 
			{
				if(contactinfo.getText_txt_Error_LastName_Blank().equalsIgnoreCase(String.valueOf(Error_Msg8)))
				{
					Reporter.log("Appropriate error message is displayed in Contact info for blank last name:" +Error_Msg8);
				}
				else
				{	
					obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
					Assert.fail("Error message mismatched");	 
				}
			}		
			else
			{	
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
				Assert.fail("Error message mismatched or not displayed for blank last name");	 
			}
		}
		catch(Exception e)
		{	
			obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
			driver.close();
			Assert.fail("Un Expected Error");
		}    		
		return driver;		
	}
	public WebDriver Empty_DOB_ErrMsg(WebDriver driver,String Functionality,String TCName,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		 POM_Generated_ContactInfoPage contactinfo= new POM_Generated_ContactInfoPage(driver);
		 try
		 {
			new Readexcel_RowName().excelRead("ErrorMessageSheet","ContactInfoPage",labelname);
			contactinfo.click_click_Submit_Form_Button();
			String Error_Msg1= Readexcel_RowName.getValue("ErrorMessage");
			System.out.println(Error_Msg1);
			if(contactinfo.isDisplayed_txt_Error_Birthday_Blank()) 
			{
				if(contactinfo.getText_txt_Error_Birthday_Blank().equalsIgnoreCase(String.valueOf(Error_Msg1)))
				{
					Reporter.log("Appropriate error message is displayed in Contact info for blank DOB:" +Error_Msg1);
				}
				else
				{	
					obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
					Assert.fail("Error message mismatched");	 
				}
			}		
			else
			{	
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
				Assert.fail("Error message mismatched or not displayed for blank DOB");	 
			}
		}
		catch(Exception e)
		{	
			obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
			driver.close();
			Assert.fail("Un Expected Error");
		}    		
		return driver;		
	}
	
	public WebDriver Empty_PhoneNumber_ErrMsg(WebDriver driver,String Functionality,String TCName,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		 POM_Generated_ContactInfoPage contactinfo= new POM_Generated_ContactInfoPage(driver);
		 try
		 {
			new Readexcel_RowName().excelRead("ErrorMessageSheet","ContactInfoPage",labelname);
			contactinfo.click_click_Submit_Form_Button();
			String Error_Msg2= Readexcel_RowName.getValue("ErrorMessage");
			System.out.println(Error_Msg2);
			if(contactinfo.isDisplayed_txt_Error_PhoneNumber_Blank()) 
			{
				if(contactinfo.getText_txt_Error_PhoneNumber_Blank().equalsIgnoreCase(String.valueOf(Error_Msg2)))
				{
					Reporter.log("Appropriate error message is displayed in Contact info for blank phone number:" +Error_Msg2);
				}
				else
				{	
					obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
					Assert.fail("Error message mismatched");	 
				}
			}		
			else
			{	
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
				Assert.fail("Error message mismatched or not displayed for blank phone");	 
			}
		}
		catch(Exception e)
		{	
			obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
			driver.close();
			Assert.fail("Un Expected Error");
		}    		
		return driver;		
	}
	
	
	public WebDriver validate_phoneNumber_InvalidCentralOfficeCodeNumber(WebDriver driver,String labelname,String Functionality,String TCName) throws IOException
	{
		try
		{
			
			POM_Generated_ContactInfoPage contactinfo= new POM_Generated_ContactInfoPage(driver);
			//Data obj=new Data();
			
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality ,TCName);
			obj.scrollingToTop(driver);
			obj.waitForElementClickable(driver, contactinfo.txt_Primary_Phone_Number_Field);
			contactinfo.type_txt_Primary_Phone_Number_Field(String.valueOf(Readexcel_RowName.getValue("InvalidCountryCode_PhoneNumber")));
			contactinfo.txt_Text_me_offers.click();
			
		
			
		new Readexcel_RowName().excelRead("ErrorMessageSheet","ContactInfoPage",labelname);
		if(contactinfo.isDisplayed_txt_Error_Invalid_PhoneNumber()) 
		{
			
			if(contactinfo.getText_txt_Error_Invalid_PhoneType().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("ErrorMessage"))))
			{
				Reporter.log("Errormessage Matched");
			}
			else
			{	
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
				driver.close();
				Assert.fail("Error message mismatched");	 
			}
		}
		else
		{
			if(driver.getTitle().equalsIgnoreCase("Account Info | Security"))
			{
				Reporter.log("Invalid Central office code format is accpeted and application navigates to contact info page");
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
				Assert.fail("Invalid Central office code is accepted");
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
	
	public WebDriver validate_phoneNumber_InvalidNPACodeNumber(WebDriver driver,String labelname,String Functionality,String TCName) throws IOException
	{
		try
		{
			
		
			POM_Generated_ContactInfoPage contactinfo= new POM_Generated_ContactInfoPage(driver);
			Data obj=new Data();
			
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality ,TCName);
			obj.scrollingToTop(driver);
			obj.waitForElementClickable(driver, contactinfo.txt_Primary_Phone_Number_Field);
			contactinfo.type_txt_Primary_Phone_Number_Field(String.valueOf(Readexcel_RowName.getValue("InvalidNPACode_PhoneNumber")));
			contactinfo.txt_Text_me_offers.click();
			
			new Readexcel_RowName().excelRead("ErrorMessageSheet","AccountLookupPage",labelname);

			if(contactinfo.isDisplayed_txt_Error_Invalid_PhoneNumber()) 
			{

				if(contactinfo.getText_txt_Error_Invalid_PhoneNumber().equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("ErrorMessage"))))
				{
					Reporter.log("Errormessage Matched");
				}
				else
				{	
					obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
					driver.close();
					Assert.fail("Error message mismatched");	 
				}
			}
			else
			{
				if(driver.getTitle().equalsIgnoreCase("Account Info | Security"))
				{
					obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
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
	
	
	public WebDriver Empty_Address_ErrMsg(WebDriver driver,String Functionality,String TCName,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		 POM_Generated_ContactInfoPage contactinfo= new POM_Generated_ContactInfoPage(driver);
		 try
		 {
			new Readexcel_RowName().excelRead("ErrorMessageSheet","ContactInfoPage",labelname);
			contactinfo.click_click_Submit_Form_Button();
			String Error_Msg3= Readexcel_RowName.getValue("ErrorMessage");
			System.out.println(Error_Msg3);
			if(contactinfo.isDisplayed_txt_Error_Address_Blank()) 
			{
				if(contactinfo.getText_txt_Error_Address_Blank().equalsIgnoreCase(String.valueOf(Error_Msg3)))
				{
					Reporter.log("Appropriate error message is displayed in Contact info for blank address:" +Error_Msg3);
				}
				else
				{	
					obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
					Assert.fail("Error message mismatched");	 
				}
			}		
			else
			{	
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
				Assert.fail("Error message mismatched or not displayed for blank address");	 
			}
		}
		catch(Exception e)
		{	
			obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
			driver.close();
			Assert.fail("Un Expected Error");
		}    		
		return driver;		
	}
	
	public WebDriver Empty_City_ErrMsg(WebDriver driver,String Functionality,String TCName,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		 POM_Generated_ContactInfoPage contactinfo= new POM_Generated_ContactInfoPage(driver);
		 try
		 {
			new Readexcel_RowName().excelRead("ErrorMessageSheet","ContactInfoPage",labelname);
			contactinfo.click_click_Submit_Form_Button();
			String Error_Msg4= Readexcel_RowName.getValue("ErrorMessage");
			System.out.println(Error_Msg4);
			if(contactinfo.isDisplayed_txt_Error_City_Blank()) 
			{
				if(contactinfo.getText_txt_Error_City_Blank().equalsIgnoreCase(String.valueOf(Error_Msg4)))
				{
					Reporter.log("Appropriate error message is displayed in Contact info for blank city:" +Error_Msg4);
				}
				else
				{	
					obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
					Assert.fail("Error message mismatched");	 
				}
			}		
			else
			{	
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
				Assert.fail("Error message mismatched or not displayed for blank city");	 
			}
		}
		catch(Exception e)
		{	
			obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
			driver.close();
			Assert.fail("Un Expected Error");
		}    		
		return driver;		
	}
	
	public WebDriver Empty_State_ErrMsg(WebDriver driver,String Functionality,String TCName,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		 POM_Generated_ContactInfoPage contactinfo= new POM_Generated_ContactInfoPage(driver);
		 try
		 {
			new Readexcel_RowName().excelRead("ErrorMessageSheet","ContactInfoPage",labelname);
			contactinfo.click_click_Submit_Form_Button();
			String Error_Msg5= Readexcel_RowName.getValue("ErrorMessage");
			System.out.println(Error_Msg5);
			if(contactinfo.isDisplayed_txt_Error_State_Blank()) 
			{
				if(contactinfo.getText_txt_Error_State_Blank().equalsIgnoreCase(String.valueOf(Error_Msg5)))
				{
					Reporter.log("Appropriate error message is displayed in Contact info for blank state:" +Error_Msg5);
				}
				else
				{	
					obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
					Assert.fail("Error message mismatched");	 
				}
			}		
			else
			{	
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
				Assert.fail("Error message mismatched or not displayed for blank state");	 
			}
		}
		catch(Exception e)
		{	
			obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
			driver.close();
			Assert.fail("Un Expected Error");
		}    		
		return driver;		
	}
	
	public WebDriver Empty_Zipcode_ErrMsg(WebDriver driver,String Functionality,String TCName,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		 POM_Generated_ContactInfoPage contactinfo= new POM_Generated_ContactInfoPage(driver);
		 try
		 {
			new Readexcel_RowName().excelRead("ErrorMessageSheet","ContactInfoPage",labelname);
			contactinfo.click_click_Submit_Form_Button();
			String Error_Msg6= Readexcel_RowName.getValue("ErrorMessage");
			System.out.println(Error_Msg6);
			if(contactinfo.isDisplayed_txt_Error_ZipCode_Blank()) 
			{
				if(contactinfo.getText_txt_Error_ZipCode_Blank().equalsIgnoreCase(String.valueOf(Error_Msg6)))
				{
					Reporter.log("Appropriate error message is displayed in Contact info for blank zipcode:" +Error_Msg6);
				}
				else
				{	
					obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
					
					Assert.fail("Error message mismatched");	 
				}
			}		
			else
			{	
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_wrongmsg");
				Assert.fail("Error message mismatched or not displayed for blank zip");	 
			}
		}
		catch(Exception e)
		{	
			obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
			driver.close();
			Assert.fail("Un Expected Error");
		}    		
		return driver;		
	}

	public WebDriver Empty_Offers_selection(WebDriver driver,String Functionality,String TCName,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException,  InvalidFormatException 
	{	
		POM_Generated_ContactInfoPage contactinfopage = new POM_Generated_ContactInfoPage(driver);
		//POM_Generated_AccountSecurityPage accountsecuritypage = new POM_Generated_AccountSecurityPage(driver);
		Data obj=new Data();
		//Writeexcel_RowName write = new Writeexcel_RowName();
		new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
		
		try
		{    //mandatory field address 1
		    if (contactinfopage.getValue_txt_Address_Field().equals(""))
			{
				contactinfopage.type_txt_Address_Field(Readexcel_RowName.getValue("Address1"));
			}
			
		    //mandatory field DOB
		    obj.scrollingToElementofAPage(driver, contactinfopage.txt_Month_Field);
			if (contactinfopage.getValue_txt_Month_Field().equals(""))
			{
				contactinfopage.type_txt_Month_Field(Readexcel_RowName.getValue("Month"));
			}
			
			if (contactinfopage.getValue_txt_Date_Field().equals(""))
			{
				contactinfopage.type_txt_Date_Field(Readexcel_RowName.getValue("Date"));
			}
			
			if (contactinfopage.getValue_txt_Year_Field().equals(""))
			{
				contactinfopage.type_txt_Year_Field(Readexcel_RowName.getValue("Year"));
			}
			//Mandatory field city	
			obj.scrollingToElementofAPage(driver, contactinfopage.txt_City_Field);
			if (contactinfopage.getValue_txt_City_Field().equals(""))
			{
				contactinfopage.type_txt_City_Field(Readexcel_RowName.getValue("City"));
			}
			//Mandatory field state
			obj.scrollingToElementofAPage(driver, contactinfopage.ddl_State_Field);
			
			if (contactinfopage.getValue_ddl_State_Field().equals("Select"))
			{
				contactinfopage.select_ddl_State_Field(Readexcel_RowName.getValue("State"));
				//Thread.sleep(500);
				//String statecode= contactinfopage.getValue_ddl_State_Field();
				//System.out.println(statecode);
				//write.excelwrite(Functionality, TCName, "State_Code", statecode);
				//System.out.println("done");
			}
			//Mandatory field zip
			obj.scrollingToElementofAPage(driver, contactinfopage.txt_Zipcode_Field);
			if (contactinfopage.getValue_txt_Zipcode_Field().equals(""))
			{
				contactinfopage.type_txt_Zipcode_Field(Readexcel_RowName.getValue("Zip"));
			}
		    //Mandatory field phone-enter landline & then cellphone
			obj.scrollingToElementofAPage(driver, contactinfopage.txt_Primary_Phone_Number_Field);
			if (contactinfopage.getValue_txt_Primary_Phone_Number_Field().equals(""))
			{
				contactinfopage.type_txt_Primary_Phone_Number_Field(Readexcel_RowName.getValue("Landline"));
				contactinfopage.click_txt_Text_me_offers();
				if(contactinfopage.isDisplayed_txt_Error_Invalid_PhoneType())
				{
				String error=contactinfopage.getText_txt_Error_Invalid_PhoneType();
				Reporter.log("Error message is displayed on entering landline as primary phone:" +error);
				}
			}
			if (!contactinfopage.getValue_txt_Primary_Phone_Number_Field().equals(""))
			{
			 contactinfopage.type_txt_Primary_Phone_Number_Field(Readexcel_RowName.getValue("Primary_Phone"));
			}
			//entering number in first name field
			if (contactinfopage.getValue_txt_Fname_Field().equals(""))
			{
				contactinfopage.type_txt_Fname_Field(Readexcel_RowName.getValue("FirstName"));
				if (contactinfopage.getValue_txt_Fname_Field().equals("")) 
				{
				Reporter.log("Number not allowed in First name field");
				}
			}
			else
			{
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
				//driver.close();
				Assert.fail("Number is allowed in first name");
			}	
			
			//entering number in last name field
			if (contactinfopage.getValue_txt_Lname_Field().equals(""))
			{
				contactinfopage.type_txt_Lname_Field(Readexcel_RowName.getValue("LastName"));
				if (contactinfopage.getValue_txt_Lname_Field().equals(""))
				{
				Reporter.log("Number not allowed in Last name field");
				}	
			}
			else
			{
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
				//driver.close();
				Assert.fail("Number is allowed in last name");
			}	
			contactinfopage.click_click_Submit_Form_Button();
			//validate error mesasge for no radiobutton selection
			new Readexcel_RowName().excelRead("ErrorMessageSheet","ContactInfoPage",labelname);
			String Error_Msg= Readexcel_RowName.getValue("ErrorMessage");
			System.out.println(Error_Msg);
			obj.scrollingToElementofAPage(driver, contactinfopage.txt_Zipcode_Field);
			contactinfopage.click_click_Submit_Form_Button();
			if(contactinfopage.isDisplayed_txt_Error_Nooffer_selection()) 
			{
				if(contactinfopage.getText_txt_Error_Nooffer_selection().equalsIgnoreCase(String.valueOf(Error_Msg)))
				{
					Reporter.log("Appropriate error message is displayed if no radiobuttons are selected for texting offers :" +Error_Msg);
				}
				else
				{	
					obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
					Assert.fail("Error message mismatched");	 
				}
			}		
			else
			{	
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
				Assert.fail("Error message mismatched or not displayed for blank radiobuttons");	 
			}
			
		}
		catch (Exception e) 
		{
			obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
			driver.close();
			System.out.println(e);
			Assert.fail("Error in Contactinfo page");
			
    	}
		return driver;
	}
	
	public WebDriver ContactInfoPage_Nosalutation(WebDriver driver,String Functionality,String TCName,String labelname) throws FileNotFoundException, IOException, InterruptedException, AWTException,  InvalidFormatException 
	{	
		POM_Generated_ContactInfoPage contactinfopage = new POM_Generated_ContactInfoPage(driver);
		POM_Generated_AccountSecurityPage accountsecuritypage = new POM_Generated_AccountSecurityPage(driver);
		Data obj=new Data();
		//Writeexcel_RowName write = new Writeexcel_RowName();
		
		try
		{    
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
			
		    if (contactinfopage.getValue_txt_Fname_Field().equals(""))
		    {
				contactinfopage.type_txt_Fname_Field(Readexcel_RowName.getValue("FirstName"));
				String fname = contactinfopage.getValue_txt_Fname_Field();
				Reporter.log("Special characters-apostrophe and hyphen accepted in firstname field:" +fname);
				
			}
			
			if (contactinfopage.getValue_txt_Lname_Field().equals(""))
			{
				contactinfopage.type_txt_Lname_Field(Readexcel_RowName.getValue("LastName"));
				String lname = contactinfopage.getValue_txt_Lname_Field();
				Reporter.log("Special characters-apostrophe and hyphen accepted in lastname field:" +lname);
			}
		
		    if (contactinfopage.getValue_txt_Address_Field().equals(""))
			{
				contactinfopage.type_txt_Address_Field(Readexcel_RowName.getValue("Address1"));
				String aname=contactinfopage.getValue_txt_Address_Field();
				Reporter.log("Special characters-apostrophe and hyphen accepted in address field:" +aname);
			}
		    
		    if (contactinfopage.getValue_txt_Additional_Address_Field().equals(""))
			{
				contactinfopage.type_txt_Additional_Address_Field(Readexcel_RowName.getValue("Address2"));
				String adname=contactinfopage.getValue_txt_Address_Field();
				Reporter.log("Special characters-apostrophe and hyphen accepted in additional address field:" +adname);
			}
			
		    //mandatory field DOB
		    obj.scrollingToElementofAPage(driver, contactinfopage.txt_Month_Field);
			if (contactinfopage.getValue_txt_Month_Field().equals(""))
			{
				contactinfopage.type_txt_Month_Field(Readexcel_RowName.getValue("Month"));
			}
			
			if (contactinfopage.getValue_txt_Date_Field().equals(""))
			{
				contactinfopage.type_txt_Date_Field(Readexcel_RowName.getValue("Date"));
			}
			
			if (contactinfopage.getValue_txt_Year_Field().equals(""))
			{
				contactinfopage.type_txt_Year_Field(Readexcel_RowName.getValue("Year"));
			}
			//enter landline & re-enter
			
			if (contactinfopage.getValue_txt_Primary_Phone_Number_Field().equals(""))
			{  
				
				contactinfopage.type_txt_Primary_Phone_Number_Field(Readexcel_RowName.getValue("Landline"));
				
				contactinfopage.click_txt_Text_me_offers();
				
				new Readexcel_RowName().excelRead("ErrorMessageSheet","ContactInfoPage",labelname);
				String Error_Msg= Readexcel_RowName.getValue("ErrorMessage");
			    if(contactinfopage.isDisplayed_txt_Error_Invalid_PhoneType())
			    {
				   if(contactinfopage.getText_txt_Error_Invalid_PhoneType().equalsIgnoreCase(String.valueOf(Error_Msg)))
				  {
				    Reporter.log("Error message is displayed on entering landline as primary phone:" +Error_Msg);
				    new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
				    contactinfopage.type_txt_Primary_Phone_Number_Field(Readexcel_RowName.getValue("Landline"));
				    Reporter.log("Re-entered the landline number again");
				    contactinfopage.click_txt_Text_me_offers();
				    
				    new Readexcel_RowName().excelRead("ErrorMessageSheet","ContactInfoPage",labelname);
		            try 
				    {
				       if(contactinfopage.isDisplayed_txt_Error_Invalid_PhoneType())
				       {
				    	   obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
				    	   System.out.println("null4");
					    Assert.fail("Error message is displayed on re-entering landline as primary phone");
				       }
				      else
				      {
					   Reporter.log("Error message is not displayed on re-entering landline as primary phone");
				      }   
				    }
			        catch(Exception e)
				    {
					 Reporter.log("Error message is not displayed on re-entering landline as primary phone");
					 //System.out.println(e);
				    }
				   }
				
			    }
				else
				{
				 Reporter.log("enter in entering landline");
				}
			
			}
			else
			{
			 Reporter.log("error in phone number field");
			}
			//Mandatory field city	
			 new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
			obj.scrollingToElementofAPage(driver, contactinfopage.txt_City_Field);
			if (contactinfopage.getValue_txt_City_Field().equals(""))
			{
				contactinfopage.type_txt_City_Field(Readexcel_RowName.getValue("City"));
				String cname = contactinfopage.getValue_txt_City_Field();
				Reporter.log("Special characters-apostrophe and hyphen accepted in city field:" +cname);
			}
			//Mandatory field state
			obj.scrollingToElementofAPage(driver, contactinfopage.ddl_State_Field);
			
			if (contactinfopage.getValue_ddl_State_Field().equals("Select"))
			{
				contactinfopage.select_ddl_State_Field(Readexcel_RowName.getValue("State"));
				
			}
			//Mandatory field zip
			obj.scrollingToElementofAPage(driver, contactinfopage.txt_Zipcode_Field);
			if (contactinfopage.getValue_txt_Zipcode_Field().equals(""))
			{
				contactinfopage.type_txt_Zipcode_Field(Readexcel_RowName.getValue("Zip"));
			}  
			//yes or no radio button
		    if(!(contactinfopage.isSelected_click_TextMeOffers_Yes_Button() || contactinfopage.isSelected_click_TextMeOffers_No_Button()))
			 {
				Reporter.log("None of the radio buttons are selected for text me offers");
			 }
		    
		    //navigating to security page with blank salutation
			obj.scrollingToTop(driver);
			
			if (contactinfopage.getValue_ddl_Salutation_Field().equals("--"))
		    {
		    	
		       obj.scrollingToElementofAPage(driver, contactinfopage.txt_Text_me_offers);
		      
			   contactinfopage.click_click_Submit_Form_Button(); 
			   obj.waitForElementClickable(driver, accountsecuritypage.txt_Email_Address_Field);
			   
			    if(accountsecuritypage.isDisplayed_txt_Email_Address_Field())
			    {  
				
			       Reporter.log("Salutation is optional in contact info page and navigated to account security page successfully");
			       Reporter.log("Text me offers selection is not mandatory if phone is landline");
			    }
		    }
		}
		catch (Exception e) 
		{
			obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
			//	driver.close();
			//System.out.println(e);
			Assert.fail("Error in Contactinfo page");
			
    	}
		return driver;
	}
	
	public WebDriver ContactInfoPage_phone(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException,  InvalidFormatException 
	{	
		POM_Generated_ContactInfoPage contactinfopage = new POM_Generated_ContactInfoPage(driver);
		Data obj=new Data();
		
		new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
		try
		{    
		    
			obj.scrollingToElementofAPage(driver, contactinfopage.txt_Primary_Phone_Number_Field);
			
            if (contactinfopage.getValue_txt_Primary_Phone_Number_Field().equals(""))
			{
			 contactinfopage.type_txt_Primary_Phone_Number_Field(Readexcel_RowName.getValue("Primary_Phone"));
			 String spl = Readexcel_RowName.getValue("Primary_Phone");
			 if (contactinfopage.getValue_txt_Primary_Phone_Number_Field().equals(""))
			  { 
			   Reporter.log("Special character & alphabet is not allowed in Phone number field - " + spl);
			  }
			 else
			 {
			 Reporter.log("Special character & alphabet is allowed in Phone number field");
			 }			
            }
		}
		catch (Exception e) 
		{
			obj.Ashot_Screenshot(driver, Functionality, TCName,"err_UnablNavigate to Contact");
			//	driver.close();
			//System.out.println(e);
			Assert.fail("Error in phone number field");
			
    	}
		return driver;

      }

}
	
	