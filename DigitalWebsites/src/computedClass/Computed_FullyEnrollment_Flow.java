package computedClass;
import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.BrowserHelper.BrowserFactory;

import Utility.Data;
import Utility.Readexcel_RowName;
import Utility.Writeexcel_RowName;
import generatedClass.POM_Generated_AccountLookupPage;
import generatedClass.POM_Generated_AccountSecurityPage;
import generatedClass.POM_Generated_CongratulationsPage;
import generatedClass.POM_Generated_ContactInfoPage;
import generatedClass.POM_Generated_Homepage;
import generatedClass.POM_Generated_One_Quick_Thing_Popup;
import generatedClass.POM_Generated_VerificationPage;
public class Computed_FullyEnrollment_Flow 
{
	//signup page
	public WebDriver SignUpPage(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException, AWTException, EncryptedDocumentException, InvalidFormatException 
	{
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_AccountLookupPage accountlookuppage = new POM_Generated_AccountLookupPage(driver);
		Data obj=new Data();
		obj.waitForElement(driver, homepage.click_Login_Or_Signup_Button);
		homepage.click_click_Login_Or_Signup_Button();
		obj.waitForElement(driver, homepage.click_Register_Button);
		homepage.click_click_Register_Button();	
		obj.waitForElement(driver, accountlookuppage.txt_Title_Text);
		
		Reporter.log("Register button clicked successfully");
		
		return driver;
	}

	//Account lookup page 
	public WebDriver AccountLookupPage(WebDriver driver,String Functionality, String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException, EncryptedDocumentException, InvalidFormatException 
	{
		POM_Generated_AccountLookupPage accountlookuppage = new POM_Generated_AccountLookupPage(driver);
		POM_Generated_VerificationPage verificationpage = new POM_Generated_VerificationPage(driver);
		POM_Generated_One_Quick_Thing_Popup onequickthing = new POM_Generated_One_Quick_Thing_Popup(driver);
		Data obj= new Data();
		new Readexcel_RowName().excelRead("Global_TestData_Sheet", Functionality, TCName);
		
		try
		{
			
			obj.waitForElement(driver, accountlookuppage.txt_Card_Number_Field);
			
			if(Readexcel_RowName.getValue("Card_Type(Card/Phone/CRC)").equalsIgnoreCase("Card")||Readexcel_RowName.getValue("Card_Type(Card/Phone/CRC)").equalsIgnoreCase("CRC"))
			{
				accountlookuppage.type_txt_Card_Number_Field(Readexcel_RowName.getValue("Phone/Card_Number"));
			}
			else if(Readexcel_RowName.getValue("Card_Type(Card/Phone/CRC)").equalsIgnoreCase("Phone"))
			{
				accountlookuppage.type_txt_Phone_Number_Field(Readexcel_RowName.getValue("Phone/Card_Number"));
			}
			Thread.sleep(1500);
			obj.movetoElementofAPage_Click(driver, accountlookuppage.click_Get_Started_With_SEG_Button);
			
			//accountlookuppage.click_click_Get_Started_With_SEG_Button();
			
			try
			{
				
				obj.waitForElement(driver, onequickthing.click_Ok_I_Will_Do_This_Now_Button);
				
				onequickthing.click_click_Ok_I_Will_Do_This_Now_Button();
				
			}
			catch(Exception e1)
			{
				
			}
			obj.waitForElement(driver, verificationpage.txt_VerificationPage_HeaderName_Text);
		
		}
		catch (Exception e) 
		{
		//	driver.close();
			obj.Ashot_Screenshot(driver, Functionality, TCName,"card_err");
			System.out.println(e);
			Assert.fail("Card Number is already registered or Invalid card number");
	    }
		return driver;
	}	
	
	public WebDriver Verificationpage(WebDriver driver,String Functionality, String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException, EncryptedDocumentException, InvalidFormatException 
	{
		POM_Generated_VerificationPage verificationpage = new POM_Generated_VerificationPage(driver);
		
		Data obj= new Data();
	   
	   
		try
		{
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName); 	
	
			
			if(!verificationpage.getText_txt_VerificationPage_HeaderName_Text().equals("Hi "+Readexcel_RowName.getValue("FirstName")+"! Thanks for helping us find your account"))
			{
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_header");
				driver.close();
				Assert.fail("Verification page header is displaying wrongly");
			}
			if(Readexcel_RowName.getValue("Verify_By(SMS/Email/PII)").equalsIgnoreCase("PII")) 
			{
				verificationpage.click_click_PII_Verification_Button();
				obj.waitForElement(driver, verificationpage.txt_PII_Verification_Month_Field);
				
				Reporter.log("PII Verification page displayed successfully");
				
			}	
			else if(Readexcel_RowName.getValue("Verify_By(SMS/Email/PII)").equalsIgnoreCase("SMS"))
			{
				verificationpage.click_click_SMS_Verification_Button();
			}
			else if(Readexcel_RowName.getValue("Verify_By(SMS/Email/PII)").equalsIgnoreCase("Email"))
			{
				verificationpage.click_click_Email_Verification_Button();
				
			}			
		}
		catch(Exception e)
		{
			obj.Ashot_Screenshot(driver, Functionality, TCName,"err_verify");
			driver.close();
			Assert.fail("Error in verification page");
		}
		return driver;
	}
	
	
	
	//Verify by PII page
	public WebDriver VerifyByPIIPage(WebDriver driver,String Functionality, String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException, EncryptedDocumentException, InvalidFormatException 
	{
		POM_Generated_VerificationPage verificationpage = new POM_Generated_VerificationPage(driver);
		POM_Generated_ContactInfoPage contactinfopage = new POM_Generated_ContactInfoPage(driver);
		Data obj=new Data();
		try
		{
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality, TCName);	
			verificationpage.type_txt_PII_Verification_Month_Field(Readexcel_RowName.getValue("Month"));
			verificationpage.type_txt_PII_Verification_Date_Field(Readexcel_RowName.getValue("Date"));
			verificationpage.type_txt_PII_Verification_Year_Field(Readexcel_RowName.getValue("Year"));
			verificationpage.type_txt_PII_Verification_Zipcode_Field(Readexcel_RowName.getValue("Zip"));
			if(Readexcel_RowName.getValue("Card_Type(Card/Phone/CRC)").equalsIgnoreCase("Card"))
			{
				obj.scrollingToElementofAPage(driver, verificationpage.txt_PII_Verification_Phone_Number_Field);
				verificationpage.type_txt_PII_Verification_Phone_Number_Field(Readexcel_RowName.getValue("Primary_Phone"));
			}
			else if(Readexcel_RowName.getValue("Card_Type(Card/Phone/CRC)").equalsIgnoreCase("Phone"))
			{
				obj.scrollingToElementofAPage(driver, verificationpage.txt_PII_Verification_Last_Name_Field);
				verificationpage.type_txt_PII_Verification_Last_Name_Field(Readexcel_RowName.getValue("LastName"));
			}
			verificationpage.click_click_PII_Verification_Next_Button();
			obj.waitForElement(driver, contactinfopage.txt_Fname_Field);
			
			Reporter.log("PII Verification done successfully");
			
		}
		catch(Exception e)
		{
			//driver.close();
			obj.Ashot_Screenshot(driver, Functionality, TCName,"invalid_PII");
			Assert.fail("Invalid PII verification details");
		}
		return driver;
	}
	
	//Contact info page
	public WebDriver ContactInfoPage(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException, EncryptedDocumentException, InvalidFormatException 
	{
		POM_Generated_ContactInfoPage contactinfopage = new POM_Generated_ContactInfoPage(driver);
		POM_Generated_AccountSecurityPage accountsecuritypage = new POM_Generated_AccountSecurityPage(driver);
		Writeexcel_RowName write = new Writeexcel_RowName();
		Data obj=new Data();
	    try
	    {
	    	new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
		   /* if(!contactinfopage.getText_txt_HeaderName_Text().equals("Hello "+Readexcel_RowName.getValue("FirstName")))
		    {		
		    	driver.close();
		    	Assert.fail("Verification page header is displaying wrongly");
		    }*/
		    if (!contactinfopage.getValue_ddl_Salutation_Field().equals(Readexcel_RowName.getValue("Salutation")))
		    {
		    	//driver.close();
		    	obj.Ashot_Screenshot(driver, Functionality, TCName,"data_sal");
		    	Assert.fail("Salutation is not pre populating");
			}
		    if (!contactinfopage.getValue_txt_Fname_Field().equals(Readexcel_RowName.getValue("FirstName")))
		    {
		    	obj.Ashot_Screenshot(driver, Functionality, TCName,"data_fname");
		    	driver.close();
		    	Assert.fail("First Name is not pre populating");
			}	
		    if (!contactinfopage.getValue_txt_Address_Field().equals(Readexcel_RowName.getValue("Address1")))
		    {
		    //	driver.close();
		    	//Assert.fail("Address is not pre populating");
			}
		    if (!contactinfopage.getValue_txt_Lname_Field().equals(Readexcel_RowName.getValue("LastName")))
		    {
		    	//driver.close();
		    	obj.Ashot_Screenshot(driver, Functionality, TCName,"data_lname");
		    	Assert.fail("Last Name is not pre populating");
			}	
		    if (!(contactinfopage.getValue_txt_Additional_Address_Field()).equals(String.valueOf(Readexcel_RowName.getValue("Address2")).replace( "null","")))
		    {
		    	//driver.close();
		    	obj.Ashot_Screenshot(driver, Functionality, TCName,"data_addr");
		    	Assert.fail("Additional address is not pre populating");
			}
		    obj.scrollingToElementofAPage(driver, contactinfopage.txt_Month_Field);
		    if (!contactinfopage.getValue_txt_Month_Field().equals(Readexcel_RowName.getValue("Month")))
		    {
		    	obj.Ashot_Screenshot(driver, Functionality, TCName,"data_mnth");
		    	driver.close();
		    	Assert.fail("Month is not pre populating");
			}
		    if (!contactinfopage.getValue_txt_Date_Field().equals(Readexcel_RowName.getValue("Date")))
		    {
		    	//driver.close();
		    	obj.Ashot_Screenshot(driver, Functionality, TCName,"data_dat");
		    	Assert.fail("Date is not pre populating");
			}
		    if (!contactinfopage.getValue_txt_Year_Field().equals(Readexcel_RowName.getValue("Year")))
		    {
		    	//driver.close();
		    	obj.Ashot_Screenshot(driver, Functionality, TCName,"data_yr");
		    	Assert.fail("Year is not pre populating");
			}		
		    obj.scrollingToElementofAPage(driver, contactinfopage.txt_City_Field);
		    if (!contactinfopage.getValue_txt_City_Field().equals(Readexcel_RowName.getValue("City")))
		    {
		    	//driver.close();
		    	obj.Ashot_Screenshot(driver, Functionality, TCName,"data_city");
		    	Assert.fail("City is not pre populating");
			}
		    obj.scrollingToElementofAPage(driver, contactinfopage.ddl_State_Field);
		    if (!contactinfopage.getValue_ddl_State_Field().equals(Readexcel_RowName.getValue("State_Code")))
		    {
		    	/*driver.close();*/
		    	obj.Ashot_Screenshot(driver, Functionality, TCName,"data_state");
		    	Assert.fail("State is not pre populating");
			}
		    obj.scrollingToElementofAPage(driver, contactinfopage.txt_Primary_Phone_Number_Field);	
		    contactinfopage.click_txt_Primary_Phone_Number_Field();
		    String phonenumsheet=Readexcel_RowName.getValue("Primary_Phone");		    
		    phonenumsheet=phonenumsheet.replaceAll("-", "");
		   
		    String phonenumsite=contactinfopage.getValue_txt_Primary_Phone_Number_Field();		  
		    phonenumsite=phonenumsite.replaceAll("-", "");
		    String changephonenumsheet="";
		    if(Readexcel_RowName.getValue("Change_Phone_Number")!=null)
		    {
		    	changephonenumsheet=Readexcel_RowName.getValue("Change_Phone_Number");
		    	changephonenumsheet=changephonenumsheet.replaceAll("-", "");
		    }
			if (phonenumsite.equals(phonenumsheet))
			{
				
				try
				{
					if(contactinfopage.isDisplayed_txt_Error_Invalid_PhoneNumber())
					{
						if(changephonenumsheet.equals(""))
						{
							obj.Ashot_Screenshot(driver, Functionality, TCName,"empty_ph");
							Assert.fail("Change phonenumber value is empty in datasheet");
						}
						else
						{
							contactinfopage.type_txt_Primary_Phone_Number_Field(changephonenumsheet);
							write.excelwrite(Functionality, TCName, "Primary_Phone", changephonenumsheet);
						}
					}
				}				
				catch(Exception e)
				{
					try
					{
						if(contactinfopage.isDisplayed_txt_Error_AlreadyRegistered_PhoneNo())
						{
							if(changephonenumsheet.equals(""))
							{
								obj.Ashot_Screenshot(driver, Functionality, TCName,"data_empty");
								Assert.fail("Change phonenumber value is empty in datasheet");
							}
							else
							{
								contactinfopage.type_txt_Primary_Phone_Number_Field(changephonenumsheet);
								write.excelwrite(Functionality, TCName, "Primary_Phone", changephonenumsheet);
							}
						}
					}
					catch(Exception e1)
					{
						try
						{
							if(contactinfopage.isDisplayed_txt_Error_Invalid_PhoneType())
							{
								if(changephonenumsheet.equals(""))
								{
									obj.Ashot_Screenshot(driver, Functionality, TCName,"empty_ph");
									Assert.fail("Change phonenumber value is empty in datasheet");
								}
								else
								{
									contactinfopage.type_txt_Primary_Phone_Number_Field(changephonenumsheet);
									write.excelwrite(Functionality, TCName, "Primary_Phone", changephonenumsheet);
								}
							}
						}
						catch(Exception e2)
						{
							Reporter.log("Valid phone number");
						}
					}
				}
			}
			else
			{
				//driver.close();
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_ph");
				Assert.fail("Primary Phone number is not pre populating");
			}
			obj.scrollingToElementofAPage(driver, contactinfopage.txt_Zipcode_Field);
			if (!contactinfopage.getValue_txt_Zipcode_Field().equals(Readexcel_RowName.getValue("Zip")))
			{
				//driver.close();
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_zip");
				Assert.fail("ZipCode is not pre populating");
			}
			if(Readexcel_RowName.getValue("Text_Me_Offers(Y/N)").equalsIgnoreCase("Y"))
			{
				try
				{
					if(!contactinfopage.isSelected_click_TextMeOffers_Yes_Button())
					{
						contactinfopage.click_click_TextMeOffers_Yes_Button();
						contactinfopage.click_click_TextMeOffers_Yes_Button();
					}
					
				}
				catch(Exception e2)
				{
					Reporter.log("Textme offers is not clicked because of already opted in");
				}
			}
			else if(Readexcel_RowName.getValue("Text_Me_Offers(Y/N)").equalsIgnoreCase("N"))
			{
				try
				{
					if(!contactinfopage.isSelected_click_TextMeOffers_No_Button())
					{
						contactinfopage.click_click_TextMeOffers_No_Button();
						contactinfopage.click_click_TextMeOffers_No_Button();
					}
					
				}
				catch(Exception e2)
				{
					Reporter.log("Textme offers is not clicked because of already opted in");
				}
			}
			Thread.sleep(1000);
			
			obj.waitForElement(driver, contactinfopage.click_Submit_Form_Button);
			
			obj.movetoElementofAPage(driver, contactinfopage.click_Submit_Form_Button);
			obj.waitForElement(driver, contactinfopage.click_Submit_Form_Button);
			contactinfopage.click_click_Submit_Form_Button();		
			Thread.sleep(1000);
			
	    	obj.waitForElement(driver, accountsecuritypage.txt_Account_Security_Verify_Text);
			
	    	Reporter.log("Contact info page completed successfully");
	    }
	    catch(Exception e)
	    {
	    	//driver.close();
	    	obj.Ashot_Screenshot(driver, Functionality, TCName,"err_contpage");
	    	System.out.println(e);
	    	Assert.fail("Error in contactinfo page");
	    }
		return driver;
	}
	
	//Account info page
	public WebDriver AccountSecurityPage(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException, EncryptedDocumentException, InvalidFormatException 
	{

		POM_Generated_AccountSecurityPage accountsecuritypage = new POM_Generated_AccountSecurityPage(driver);
		POM_Generated_CongratulationsPage congratulationspage = new POM_Generated_CongratulationsPage(driver);
		Data obj=new Data();
		Writeexcel_RowName write = new Writeexcel_RowName();
		
	   
	    new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
	    
		try
		{
			String emailsheet="";
			if(Readexcel_RowName.getValue("EmailAddress")!=null)
			{
				emailsheet=Readexcel_RowName.getValue("EmailAddress");		    
			}	   
		    String emailsite=accountsecuritypage.getValue_txt_Email_Address_Field();	  
		   
		    String changeemailsheet="";
		    if(Readexcel_RowName.getValue("Change_EmailAddress")!=null)
		    {
		    	changeemailsheet=Readexcel_RowName.getValue("Change_EmailAddress");
		    	
		    }
			boolean presentt;
			try 
			{
				if(accountsecuritypage.isDisplayed_txt_Email_Address_Field())
				{
					presentt=true;
				}
				else
				{
					presentt = false;
				}
			}
			catch (NoSuchElementException e) 
			{
				presentt = false;
			}
			if(presentt==true)
			{
				if (emailsheet.equals(emailsite))
				{
					/*if(!accountsecuritypage.isDisplayed_click_Email_Address_Message_Verify())
					{	
						//driver.close();
						Assert.fail("Email message is not displayed");
					}*/
					try
					{
						if(emailsheet.equals("") && emailsite.equals(""))
						{
							accountsecuritypage.type_txt_Email_Address_Field(changeemailsheet);
							write.excelwrite(Functionality, TCName, "EmailAddress", changeemailsheet);
						}
						if(accountsecuritypage.isDisplayed_txt_Error_InvalidEmail())
						{
							if(changeemailsheet.equals(""))
							{
								obj.Ashot_Screenshot(driver, Functionality, TCName,"empty_email");
								Assert.fail("Change email address value is empty in datasheet");
							}
							else
							{
								accountsecuritypage.type_txt_Email_Address_Field(changeemailsheet);
								write.excelwrite(Functionality, TCName, "EmailAddress", changeemailsheet);
							}
							
						}
					}
					catch(Exception e)
					{
						
						try
						{
							if(accountsecuritypage.isDisplayed_txt_Error_AlreadyRegistered_Email())
							{
								if(changeemailsheet.equals(""))
								{
									obj.Ashot_Screenshot(driver, Functionality, TCName,"empty_email");
									Assert.fail("Change email address value is empty in datasheet");
								}
								else
								{
									accountsecuritypage.type_txt_Email_Address_Field(changeemailsheet);
									write.excelwrite(Functionality, TCName, "EmailAddress", changeemailsheet);
								}
							}
						}
						catch(Exception e1)
						{
							
						}
					}
				}
				else
				{
					//driver.close();
					obj.Ashot_Screenshot(driver, Functionality, TCName,"err_email");
					Assert.fail("Email address is not pre populating or not matched");
				}
			}
			boolean present;
			try 
			{
				if(accountsecuritypage.isDisplayed_txt_Set_Password1_Field())
				{
					present = true;
				}
				else
				{
					present = false;
				}
			} 
			catch (NoSuchElementException e) 
			{
				present = false;
			}
			if(present==true)
			{
				if (accountsecuritypage.getValue_txt_Set_Password1_Field().equals(""))
				{
					accountsecuritypage.type_txt_Set_Password1_Field(Readexcel_RowName.getValue("Password"));
				}
				else
				{
					//driver.close();
					obj.Ashot_Screenshot(driver, Functionality, TCName,"err_pwd");
					Assert.fail("Password is pre populating");
				}				
				if (accountsecuritypage.getValue_txt_Set_Password2_Field().equals(""))
				{
					accountsecuritypage.type_txt_Set_Password2_Field(Readexcel_RowName.getValue("Confirm_Password"));	
				}
				else
				{
					//driver.close();
					obj.Ashot_Screenshot(driver, Functionality, TCName,"conf_pwd_err");
					Assert.fail("Confirm Password is pre populating");
				}
			}
			boolean present1;
			try 
			{
				if(accountsecuritypage.isDisplayed_txt_Set_Pin1_Field())
				{
					present1 = true;
				}
				else
				{
					present1 = false;
				}
			} 
			catch (NoSuchElementException e) 
			{
			   present1 = false;
			}
			if(present1==true)
			{
				if (accountsecuritypage.getValue_txt_Set_Pin1_Field().equals(""))
				{
					accountsecuritypage.type_txt_Set_Pin1_Field(Readexcel_RowName.getValue("Pin"));
				}
				else
				{
					obj.Ashot_Screenshot(driver, Functionality, TCName,"err_pin");
					driver.close();
					Assert.fail("Pin is pre populating");
				} 					
				if (accountsecuritypage.getValue_txt_Set_Pin2_Field().equals(""))
				{
					accountsecuritypage.type_txt_Set_Pin2_Field(Readexcel_RowName.getValue("Confirm_Pin"));
				}
				else
				{
					//driver.close();
					obj.Ashot_Screenshot(driver, Functionality, TCName,"err_confpin");
					Assert.fail("Confirm Pin is pre populating");
				}
			}
			obj.scrollingToElementofAPage(driver, accountsecuritypage.click_Terms_And_Condition_Checkbox);
			if(!accountsecuritypage.isSelected_click_Terms_And_Condition_Checkbox())
			{
				accountsecuritypage.click_click_Terms_And_Condition_Checkbox();
			}
			
			boolean present2;
			try 
			{
				if(accountsecuritypage.isDisplayed_txt_NeverMissADeal_Yes_Button())
				{
					present2 = true;
				}
				else
				{
					present2 = false;
				}
			} 
			catch (NoSuchElementException e) 
			{
			   present2 = false;
			}
			if(present2==true)
			{
				if(Readexcel_RowName.getValue("Save_With_Digital_Coupons(Y/N)").equalsIgnoreCase("Y"))
				{
					accountsecuritypage.click_txt_NeverMissADeal_Yes_Button();
					
				}
				else if(Readexcel_RowName.getValue("Save_With_Digital_Coupons(Y/N)").equalsIgnoreCase("N"))
				{
					accountsecuritypage.click_txt_NeverMissADeal_No_Button();
				}
			}
			obj.waitForElement(driver, accountsecuritypage.click_Security_Next_Button);
			accountsecuritypage.click_click_Security_Next_Button();
			obj.waitForElement(driver, congratulationspage.txt_ThankYou_Message_Text);
			
			if(congratulationspage.isDisplayed_txt_ThankYou_Message_Text())
			{
				Reporter.log("Congratulations Message is displayed correctly");
			}	
			else
			{
				obj.Ashot_Screenshot(driver, Functionality, TCName,"no_msg");
				//driver.close();
				Assert.fail("Congratulations Message not displayed");
				
			}
		}
		catch (Exception e) 
		{
			//driver.close();
			obj.Ashot_Screenshot(driver, Functionality, TCName,"err_accinfo");
			System.out.println(e);
			Assert.fail("Error in Accountinfo Page");
	    }
		return driver;
	}
	
	//Data Persistence
	public WebDriver Validate_DataPersistency_VerificationPage(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException, EncryptedDocumentException, InvalidFormatException 
	{
		POM_Generated_ContactInfoPage contactinfopage = new POM_Generated_ContactInfoPage(driver);
		POM_Generated_VerificationPage verificationpage= new POM_Generated_VerificationPage(driver);
		Data obj=new Data();
		new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality , TCName);
		
		try
		{
			if(contactinfopage.isDisplayed_txt_Fname_Field())
			driver.navigate().back();
			obj.waitForElement(driver,verificationpage.txt_PII_Verification_Date_Field);
			if(verificationpage.getValue_txt_PII_Verification_Date_Field().equals(Readexcel_RowName.getValue("Date")))
			{
				Reporter.log("Data persists in PII page when the user navigates back from contact info page");
			}
			else
			{
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_nodata");
				Assert.fail("Data is not displayed in PII page when the user navigates back from contact info page");
			}
			if(verificationpage.isDisplayed_txt_img_stepCounter_verificationPage_Active())
			{
				Reporter.log("Verification tab is highlighted in Step counter");
			}
			else
			{
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_verify");
				Assert.fail("verification tab is NOT highlighted in step counter");
			}
			if(verificationpage.isDisplayed_txt_img_stepCounter_contactinfo_InActive())
			{
				Reporter.log("Contact info tab is NOT highlighted in Step counter");
			}
			else
			{
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_contactinfo");
				Assert.fail("Contact info tab is highlighted in step counter");
			}
			if(verificationpage.isDisplayed_txt_img_stepCounter_SecurityInfo_InActive())
			{
				Reporter.log("Security info tab is NOT highlighted in Step counter");
			}
			else
			{
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_secinfo");
				Assert.fail("Security info tab is highlighted in step counter");
			}	
		    verificationpage.click_txt_PII_Verification_Date_Field();
		    verificationpage.click_click_PII_Verification_Next_Button();
		    if(contactinfopage.isDisplayed_txt_Fname_Field())
		    	Reporter.log("Contact info page is displayed");
		    else
		    	obj.Ashot_Screenshot(driver, Functionality, TCName,"err_coninfo");
		    	Assert.fail("contact info page is not displayed");
		    if(contactinfopage.isDisplayed_txt_img_stepcounter_verification_done())
		    {
		    	Reporter.log("Verification tab in Step counter is displayed as completed");
		    }
		    else
		    {
		    	obj.Ashot_Screenshot(driver, Functionality, TCName,"err_verifytab");
		    	Assert.fail("Verification tab in Step counter is NOT displayed as completed");
		    }
		}
		catch (Exception e) 
		{	
			System.out.println(e);
			obj.Ashot_Screenshot(driver, Functionality, TCName,"err_PII");
			Assert.fail("Error when user navigates back to PII verification page from contact info page");
			
		}
	return driver;
	}
	public WebDriver Validate_DataPersistency_ContactInfoPage(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException, EncryptedDocumentException, InvalidFormatException 
	{
		POM_Generated_AccountSecurityPage accountsecuritypage = new  POM_Generated_AccountSecurityPage(driver);
		POM_Generated_ContactInfoPage contactinfopage = new POM_Generated_ContactInfoPage(driver);
		
		Data obj=new Data();
		new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality , TCName);
		
		try
		{
			if(accountsecuritypage.isDisplayed_txt_Email_Address_Field())
			driver.navigate().back();
			obj.waitForElement(driver,contactinfopage.txt_Lname_Field);
			if(contactinfopage.getValue_txt_Fname_Field().equals(Readexcel_RowName.getValue("FirstName")))
			{
				Reporter.log("Data persists in contact info page when the user navigates back from Security info page");
			}
			else
			{
				obj.Ashot_Screenshot(driver, Functionality, TCName,"nodata_err");
				Assert.fail("Data is not displayed in contact info page when the user navigates back from Security info page");
			}
			if(contactinfopage.isDisplayed_txt_img_stepcounter_contactinfo_active())
			{
				Reporter.log("Contact info tab is highlighted in Step counter");
			}
			else
			{
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_contactinfo");
				Assert.fail("contact info tab is NOT highlighted in step counter");
			}
			if(contactinfopage.isDisplayed_txt_img_stepcounter_verification_done())
			{
				Reporter.log("Verification tab is showing as completed in Step counter");
			}
			else
			{
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_verifytab");
				Assert.fail("Verification tab is NOT showing as completed in step counter");
			}
			if(contactinfopage.isDisplayed_txt_img_stepCounter_SecurityInfo_InActive())
			{
				Reporter.log("Security info tab is NOT highlighted in Step counter");
			}
			else
			{
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_secinfo");
				Assert.fail("security info tab is highlighted in step counter");
			}
			contactinfopage.click_txt_Primary_Phone_Number_Field();
		    contactinfopage.click_click_Submit_Form_Button();
		    obj.waitForElement(driver, accountsecuritypage.txt_Email_Address_Field);
		    if(accountsecuritypage.isDisplayed_txt_img_stepcounter_contactinfo_done())
		    {
		    	Reporter.log("Contact info page is displayed as completed in stepcounter");
		    }
		    else
		    {
		    	obj.Ashot_Screenshot(driver, Functionality, TCName,"err_contactinfo");
		    	Assert.fail("contact info page is NOT displayed as completed in stepcounter");
		    }
		    
		}
		catch (Exception e) 
		{	
			obj.Ashot_Screenshot(driver, Functionality, TCName,"err_contactinfo");
			System.out.println(e);
			Assert.fail("Error when user navigates back to contact info page from security info page");
			
		}
	return driver;
	}

	public WebDriver DataPersistency_Closebrowser(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException, EncryptedDocumentException, InvalidFormatException 
	{
		POM_Generated_AccountSecurityPage accountsecuritypage = new  POM_Generated_AccountSecurityPage(driver);
		POM_Generated_ContactInfoPage contactinfopage = new POM_Generated_ContactInfoPage(driver);
		BrowserFactory browserFactory = new BrowserFactory();
		
		String url1 = null;
		String browser = null;
		Data obj=new Data();
		new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global" ,TCName);
		if(Readexcel_RowName.getValue("Chrome(Y/N)").equalsIgnoreCase("Y"))
		{
			browser="Chrome";
			System.out.println(browser);
		}	
		else if(Readexcel_RowName.getValue("IE(Y/N)").equalsIgnoreCase("Y"))
		{
			browser="IE";
		}
		try
		{
			if(accountsecuritypage.isDisplayed_txt_Email_Address_Field())
			{
			driver.navigate().back();
			}
			obj.waitForElement(driver,contactinfopage.txt_Lname_Field);
			url1= driver.getCurrentUrl();
			System.out.println(url1);
			driver.close();							
			driver=browserFactory.startbrowser(driver, browser, url1);	
			
			driver.findElement(By.xpath("//a[@id='CookieClsBtn']")).click();
			//if(contactinfopage.getValue_txt_Fname_Field().equals(""))
				if(driver.findElement(By.id("fName")).getAttribute("value").equals(""))
			{
				Reporter.log("Data is not displayed in contact info page when the user opens the session after closing it");
				
			}
			else
			{
				obj.Ashot_Screenshot(driver, Functionality, TCName,"data_err");
				Assert.fail("Data is displayed in contact info page when the user opens the session after closing it");
			}
		}
		catch (Exception e) 
		{	
			obj.Ashot_Screenshot(driver, Functionality, TCName,"err_close");
			System.out.println(e);
			Assert.fail("Error while validating after closing the browser");
			
		}
		return driver;
	}
}
