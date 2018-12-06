package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_AccountLookupPage;
import generatedClass.POM_Generated_AccountSecurityPage;
import generatedClass.POM_Generated_CongratulationsPage;
import generatedClass.POM_Generated_ContactInfoPage;
import generatedClass.POM_Generated_Homepage;

public class Computed_PreEnrollment_Flow 
{

	//Signup page
	public WebDriver neworpresignup(WebDriver driver,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException, EncryptedDocumentException, InvalidFormatException 
	{
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		Data obj=new Data();
		try
		{
			obj.waitForElementClickable(driver, homepage.click_Login_Or_Signup_Button);
			homepage.click_click_Login_Or_Signup_Button();
			obj.waitForElementClickable(driver, homepage.click_Register_Button);
			homepage.click_click_Register_Button();			
		}
		catch(Exception e)
		{
			Assert.fail("Error in Signup page");
		}
		return driver;
	}
	
	//Accountlookup page for pre enrolled and net new user
	public WebDriver neworprecardnumber(WebDriver driver, String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException, EncryptedDocumentException, InvalidFormatException 
	{
		POM_Generated_AccountLookupPage accountlookuppage = new POM_Generated_AccountLookupPage(driver);
		POM_Generated_ContactInfoPage contactinfopage = new POM_Generated_ContactInfoPage(driver);
		Data obj=new Data();
		
	  
		new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
		try
		{		
			obj.waitForElementClickable(driver, accountlookuppage.txt_Card_Number_Field);
			if(Readexcel_RowName.getValue("Card_Type(Card/Phone/CRC)").equalsIgnoreCase("Card")||Readexcel_RowName.getValue("Card_Type(Card/Phone/CRC)").equalsIgnoreCase("CRC"))
			{
				accountlookuppage.type_txt_Card_Number_Field(Readexcel_RowName.getValue("Phone/Card_Number"));
				obj.scrollingToElementofAPage(driver, accountlookuppage.click_Get_Started_With_SEG_Button);
				accountlookuppage.click_click_Get_Started_With_SEG_Button();
			}
			else if(Readexcel_RowName.getValue("Card_Type(Card/Phone/CRC)").equalsIgnoreCase("Phone"))
			{
				accountlookuppage.type_txt_Phone_Number_Field(Readexcel_RowName.getValue("Phone/Card_Number"));
				obj.scrollingToElementofAPage(driver, accountlookuppage.click_Get_Started_With_SEG_Button);
				accountlookuppage.click_click_Get_Started_With_SEG_Button();
			}
			else if(Readexcel_RowName.getValue("Card_Type(Card/Phone/CRC)").equalsIgnoreCase("NewMember"))
			{	
				obj.scrollingToElementofAPage(driver, accountlookuppage.click_Signup_As_New_Member_Button);
				accountlookuppage.click_click_Signup_As_New_Member_Button();
			}
			obj.waitForElement(driver, contactinfopage.txt_HeaderName_Text)	;
			
			Reporter.log("Account lookup page completed successfully");
		}	
		catch (Exception e) 
		{
			Reporter.log("Invalid Card number or Error in Account lookup page");
        }
		return driver;
	}
	
	//Contact info page
	public WebDriver neworprecontactinfo(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException, EncryptedDocumentException, InvalidFormatException 
	{	
		POM_Generated_ContactInfoPage contactinfopage = new POM_Generated_ContactInfoPage(driver);
		POM_Generated_AccountSecurityPage accountsecuritypage = new POM_Generated_AccountSecurityPage(driver);
		Data obj=new Data();
		
		new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
		try
		{
			if(!contactinfopage.getText_txt_HeaderName_Text().equals("Hello"))
			{
				Assert.fail("Contact info header is displaying wrongly");
			}
			if (contactinfopage.getValue_ddl_Salutation_Field().equals("--"))
			{
				contactinfopage.select_ddl_Salutation_Field(Readexcel_RowName.getValue("Salutation"));
			}
			else
			{
				Assert.fail("Salutation is pre populating");
			}
			if (contactinfopage.getValue_txt_Fname_Field().equals(""))
			{
				contactinfopage.type_txt_Fname_Field(Readexcel_RowName.getValue("FirstName"));
			}
			else
			{
				Assert.fail("FirstName is pre populating");
			}
			if (contactinfopage.getValue_txt_Address_Field().equals(""))
			{
				contactinfopage.type_txt_Address_Field(Readexcel_RowName.getValue("Address1"));
			}
			else
			{
				Assert.fail("Address is pre populating");
			}
			if (contactinfopage.getValue_txt_Lname_Field().equals(""))
			{
				contactinfopage.type_txt_Lname_Field(Readexcel_RowName.getValue("LastName"));
			}
			else
			{
				Assert.fail("LastName is pre populating");
			}	
			if (Readexcel_RowName.getValue("Address2")!=null)
			{
				if (contactinfopage.getValue_txt_Additional_Address_Field().equals(""))
				{
					contactinfopage.type_txt_Additional_Address_Field(Readexcel_RowName.getValue("Address2"));
				}
				else
				{
					Assert.fail("Additional Address is pre populating");
				}
			
			}
			else
			{
				if (!contactinfopage.getValue_txt_Additional_Address_Field().equals(""))
				{
					Assert.fail("Additional Address is pre populating");
				}
			}
			obj.scrollingToElementofAPage(driver, contactinfopage.txt_Month_Field);
			if (contactinfopage.getValue_txt_Month_Field().equals(""))
			{
				contactinfopage.type_txt_Month_Field(Readexcel_RowName.getValue("Month"));
			}
			else
			{
				Assert.fail("Month is pre populating");
			}	
			if (contactinfopage.getValue_txt_Date_Field().equals(""))
			{
				contactinfopage.type_txt_Date_Field(Readexcel_RowName.getValue("Date"));
			}
			else
			{
				Assert.fail("Date is pre populating");
			}
		
			if (contactinfopage.getValue_txt_Year_Field().equals(""))
			{
				contactinfopage.type_txt_Year_Field(Readexcel_RowName.getValue("Year"));
			}
			else
			{
				Assert.fail("Year is pre populating");
			}	
			obj.scrollingToElementofAPage(driver, contactinfopage.txt_City_Field);
			if (contactinfopage.getValue_txt_City_Field().equals(""))
			{
				contactinfopage.type_txt_City_Field(Readexcel_RowName.getValue("City"));
			}
			else
			{
				Assert.fail("City is pre populating");
			}
			obj.scrollingToElementofAPage(driver, contactinfopage.ddl_State_Field);
			
			
			if (contactinfopage.getValue_ddl_State_Field().equals("Select"))
			{
				contactinfopage.select_ddl_State_Field(Readexcel_RowName.getValue("State"));
			}
			else
			{
				Assert.fail("State is pre populating");
			}
		
			obj.scrollingToElementofAPage(driver, contactinfopage.txt_Primary_Phone_Number_Field);
			if (contactinfopage.getValue_txt_Primary_Phone_Number_Field().equals(""))
			{
				contactinfopage.type_txt_Primary_Phone_Number_Field(Readexcel_RowName.getValue("Primary_Phone"));
			}
			else
			{
				Assert.fail("Primary_Phone_Number is pre populating");
			}
			obj.scrollingToElementofAPage(driver, contactinfopage.txt_Zipcode_Field);
			if (contactinfopage.getValue_txt_Zipcode_Field().equals(""))
			{
				contactinfopage.type_txt_Zipcode_Field(Readexcel_RowName.getValue("Zip"));
			}
			else
			{
				Assert.fail("ZipCode is pre populating");
			}
			
			if(!(contactinfopage.isSelected_click_TextMeOffers_Yes_Button() || contactinfopage.isSelected_click_TextMeOffers_No_Button()))
			{
				if(Readexcel_RowName.getValue("Text_Me_Offers(Y/N)").equalsIgnoreCase("Y"))
				{
					contactinfopage.click_click_TextMeOffers_Yes_Button();
				}
				else
				{
					contactinfopage.click_click_TextMeOffers_No_Button();
				}
			}
			else
			{
				Assert.fail("Text_Me_Offers radio button is already selected");
			}
				
			contactinfopage.click_click_Submit_Form_Button();;			
			obj.waitForElementClickable(driver, accountsecuritypage.txt_Email_Address_Field);
			
			Reporter.log("Contact info page completed successfully");
		}
		catch (Exception e) 
		{
			Assert.fail("Error in Contactinfo page");
			
    	}
		return driver;
	}
	
	//Account Info page
	public WebDriver neworpreaccountinfo(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException, EncryptedDocumentException, InvalidFormatException 
	{
		POM_Generated_AccountSecurityPage accountsecuritypage = new  POM_Generated_AccountSecurityPage(driver);
		POM_Generated_CongratulationsPage congratulationspage = new POM_Generated_CongratulationsPage(driver);
		Data obj=new Data();
		
		
		new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality , TCName);
		try
		{
			if (accountsecuritypage.getValue_txt_Email_Address_Field().equals(""))
			{
				accountsecuritypage.type_txt_Email_Address_Field(Readexcel_RowName.getValue("EmailAddress"));
			}
			else
			{
				Assert.fail("Email address is pre populating");
			}
		
			if (accountsecuritypage.getValue_txt_Set_Password1_Field().equals(""))
			{
				accountsecuritypage.type_txt_Set_Password1_Field(Readexcel_RowName.getValue("Password"));
			}
			else
			{
				Assert.fail("Password is pre populating");
			}				
			if (accountsecuritypage.getValue_txt_Set_Password2_Field().equals(""))
			{
				accountsecuritypage.type_txt_Set_Password2_Field(Readexcel_RowName.getValue("Confirm_Password"));	
			}
			else
			{
				Assert.fail("Confirm Password is pre populating");
			}	 	

			if (accountsecuritypage.getValue_txt_Set_Pin1_Field().equals(""))
			{
				accountsecuritypage.type_txt_Set_Pin1_Field(Readexcel_RowName.getValue("Pin"));
			}
			else
			{
				Assert.fail("Pin is pre populating");
			} 					
			if (accountsecuritypage.getValue_txt_Set_Pin2_Field().equals(""))
			{
				accountsecuritypage.type_txt_Set_Pin2_Field(Readexcel_RowName.getValue("Confirm_Pin"));
			}
			else
			{
				Assert.fail("Confirm Pin is pre populating");
			}
			obj.scrollingToElementofAPage(driver, accountsecuritypage.click_Terms_And_Condition_Checkbox);
			accountsecuritypage.click_click_Terms_And_Condition_Checkbox();
			
			obj.scrollingToElementofAPage(driver, accountsecuritypage.txt_NeverMissADeal_Yes_Button);
			String cpn=Readexcel_RowName.getValue("Save_With_Digital_Coupons(Y/N)");
			if(cpn.equalsIgnoreCase("Y"))
			{
				accountsecuritypage.click_txt_NeverMissADeal_Yes_Button();
			}
			else if(cpn.equalsIgnoreCase("N"))
			{
				accountsecuritypage.click_txt_NeverMissADeal_No_Button();
			}
			obj.scrollingToElementofAPage(driver, accountsecuritypage.click_Security_Next_Button);
			obj.waitForElementClickable(driver, accountsecuritypage.click_Security_Next_Button);	
			accountsecuritypage.click_click_Security_Next_Button();
			
			Reporter.log("Account info page completed successfully");
			
			obj.waitForElement(driver, congratulationspage.txt_ThankYou_Message_Text);
			
			
			if(congratulationspage.isDisplayed_txt_ThankYou_Message_Text())
			{
				Reporter.log("Congratulations Message is displayed correctly");
			}	
			else
			{
				Assert.fail("Congratulations Message not displayed");
				
			}
		}
		catch (Exception e) 
		{	
			Assert.fail("Error in Accountinfo page");
			
		}
		return driver;
	}
}