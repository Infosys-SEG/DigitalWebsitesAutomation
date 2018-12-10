package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_AccountLookupPage;
import generatedClass.POM_Generated_ContactInfoPage;
import generatedClass.POM_Generated_HardLoginPage;
import generatedClass.POM_Generated_Homepage;
import generatedClass.POM_Generated_LoggedIn_RewardsPage;
import generatedClass.POM_Generated_StaticInfoBar;

public class Computed_HardLogin 
{
	// Global hardlogin
	

	public WebDriver Global_HardLogin(WebDriver driver,String functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_HardLoginPage hardloginpage = new POM_Generated_HardLoginPage(driver);
		
		Data obj=new Data();
	     
	    try
		{	
	    	new Readexcel_RowName().excelRead("Global_TestData_Sheet",functionality, TCName);
	    	String Hardlogin_Email_Address= Readexcel_RowName.getValue("Hardlogin_Email_Address");
	    	String Hardlogin_Password= Readexcel_RowName.getValue("Hardlogin_Password");
	    	
	    	obj.waitForElementClickable(driver, homepage.click_Login_Or_Signup_Button);		
	    	
	    	homepage.click_click_Login_Or_Signup_Button();
	    	
			obj.waitForElementClickable(driver, homepage.click_HardLogin_button);
			
			homepage.click_click_HardLogin_button();
			
	    	obj.waitForElement(driver, hardloginpage.txt_Email_Id_Field);
	    	hardloginpage.type_txt_Email_Id_Field(Hardlogin_Email_Address);
	    	hardloginpage.type_txt_Password_Field(Hardlogin_Password);
	    	hardloginpage.click_click_Login_Button();
	    	obj.waitForElementClickable(driver, homepage.click_Logout_button);
	    	if(homepage.isDisplayed_click_Logout_button())
	    	{	
				Reporter.log("Logged in successfully ");
			}
			else
			{
				Assert.fail("Hardlogin failed");
			}
		}
	    catch(Exception e)
	    {
	    	Assert.fail("Error in hardlogin page");
	    }
	   
	    
	    return driver;
	}
	@Test
	public WebDriver Account_HardLogin(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		
		POM_Generated_HardLoginPage hardloginpage = new POM_Generated_HardLoginPage(driver);
		POM_Generated_StaticInfoBar staticinfobar = new POM_Generated_StaticInfoBar(driver);
		
		Data obj=new Data();
		
		String editacctext="Edit Account Details";
		
	    
	    try
		{	
	    	new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
	    	String Hardlogin_Email_Address= Readexcel_RowName.getValue("Hardlogin_Email_Address");
	    	String Hardlogin_Password= Readexcel_RowName.getValue("Hardlogin_Password");
	    	
	    	obj.waitForElementClickable(driver, staticinfobar.click_Static_info_My_Account_Link);
	    	staticinfobar.click_click_Static_info_My_Account_Link();
	    	obj.waitForElement(driver, hardloginpage.txt_Email_Id_Field);
	    	hardloginpage.type_txt_Email_Id_Field(Hardlogin_Email_Address);
	    	hardloginpage.type_txt_Password_Field(Hardlogin_Password);
	    	hardloginpage.click_click_Login_Button();
	    	obj.waitForElement(driver, staticinfobar.click_Static_info_My_Account_Text);
	    	if(editacctext.equals(staticinfobar.getText_click_Static_info_My_Account_Text()))
	    	   {
	    	
					Reporter.log("Logged in successfully ");
				}
				else
				{
					driver.close();
					Assert.fail("Hardlogin failed");
				}
	  
		}
	    catch(Exception e)
	    {
	    	driver.close();
	    	Assert.fail("Error in Hardlogin Page");
	    }
	    return driver;
	}	
	
	public WebDriver Validate_HardLogin_Modal_Links(WebDriver driver,String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_HardLoginPage hardloginpage = new POM_Generated_HardLoginPage(driver);
		POM_Generated_AccountLookupPage acctlookup = new POM_Generated_AccountLookupPage(driver);
		
		Data obj=new Data();
		
  
	    try
		{	
	    	
	    	obj.waitForElementClickable(driver, homepage.click_Login_Or_Signup_Button);		
	    	
	    	homepage.click_click_Login_Or_Signup_Button();
	    	
			obj.waitForElementClickable(driver, homepage.click_HardLogin_button);
			
			homepage.click_click_HardLogin_button();
			
	    	obj.waitForElement(driver, hardloginpage.txt_Email_Id_Field);
	    	
	    	if (hardloginpage.isDisplayed_click_Forget_Password_Link())
	    	{
		    	
				Reporter.log("Forgot password link is displayed");
			}
			else
			{
				driver.close();
				Assert.fail("Forgot password link is not displayed");
			}
	    	if (hardloginpage.isDisplayed_click_NotAMember_SignUpNow_Link())
              {
		    	
				Reporter.log("Not a member?Sign Up now link is displayed ");
				hardloginpage.click_click_NotAMember_SignUpNow_Link();
				if (acctlookup.isDisplayed_txt_Title_Text())
				{
			    	
					Reporter.log("Account lookup page is displayed by clicking on Signup now ");
				}
				else
				{
					driver.close();
					Assert.fail("Account lookup page is not displayed by clicking on Signup now");
				}
			}
			else
			{
				driver.close();
				Assert.fail("Not a member?Sign Up now link is not displayed ");	
			}
	    	
            homepage.click_click_Login_Or_Signup_Button();
	    	obj.waitForElementClickable(driver, homepage.click_HardLogin_button);
			homepage.click_click_HardLogin_button();
			obj.waitForElementClickable(driver, hardloginpage.txt_Email_Id_Field);
			hardloginpage.click_click_FAQ_link();
			//get window handlers as list
			List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
			//switch to new tab
			driver.switchTo().window(browserTabs .get(1));
			// Associated Label : Login_Button
			WebElement txt_FAQPage_title;
			txt_FAQPage_title=driver.findElement(By.xpath ("//h2[contains(text(),'Getting to know SE Grocers rewards')]"));
			if (txt_FAQPage_title.isDisplayed())
			{
				Reporter.log("FAQ page is opened in a new tab");
			}
			else
			{
				driver.close();
				Assert.fail("FAQ page is not displayed in a new tab");
				
			}
			//then close tab and get back
			driver.close();
			driver.switchTo().window(browserTabs.get(0));
	     }
	    catch(Exception e)
	    {
	    	driver.close();
	    	Assert.fail("Error in Hardlogin Page");
	    	
	    }
	        
	    return driver;
	}	

	public WebDriver HardLogin_ErrorValidation(WebDriver driver,String functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_HardLoginPage hardloginpage = new POM_Generated_HardLoginPage(driver);
		
		Data obj=new Data();

	    try
		{	
	    	//Invalid Email error verification
	    	new Readexcel_RowName().excelRead("Global_TestData_Sheet",functionality, TCName);
	    	String Hardlogin_Email_Address;
	    	String Hardlogin_Password;
	    	String Error1;
	    	String Invalid_Email= Readexcel_RowName.getValue("Invalid_Email");
	    	String Email_NotExist=Readexcel_RowName.getValue("Email_NotExist");
	    	String Invalid_Password=Readexcel_RowName.getValue("Invalid_Password");
	    	String Incorrect_Password=Readexcel_RowName.getValue("Incorrect_Password");
	    	Hardlogin_Email_Address=Readexcel_RowName.getValue("Hardlogin_Email_Address");
	    	Hardlogin_Password=Readexcel_RowName.getValue("Hardlogin_Password");
	    	obj.waitForElementClickable(driver, homepage.click_Login_Or_Signup_Button);		
	    	homepage.click_click_Login_Or_Signup_Button();
	    	obj.waitForElementClickable(driver, homepage.click_HardLogin_button);
	    	homepage.click_click_HardLogin_button();
	    	obj.waitForElement(driver, hardloginpage.txt_Email_Id_Field);
	    	hardloginpage.type_txt_Email_Id_Field(Invalid_Email);
	    	hardloginpage.click_txt_Password_Field();
			obj.waitForElement(driver, hardloginpage.txt_Error_Invalid_Email_Msg);
			Error1=hardloginpage.getText_txt_Error_Invalid_Email_Msg();
			new Readexcel_RowName().excelRead("ErrorMessageSheet",functionality, "Error_InvalidEmail");
			System.out.println(Readexcel_RowName.getValue("Error_Message"));
			if(Readexcel_RowName.getValue("Error_Message").equalsIgnoreCase(Error1))
	    	{	
				Reporter.log("error message is displayed correctly for Invalid Email address :"+Error1);
			}
			else
			{
				driver.close();
				Assert.fail("error message is NOT displayed correctly for Invalid Email address :"+ Error1);	
			}
			// Email not exists error message verification
			hardloginpage.type_txt_Email_Id_Field(Email_NotExist);
	    	hardloginpage.type_txt_Password_Field(Hardlogin_Password);
	    	hardloginpage.click_click_Login_Button();
	    	obj.waitForElementClickable(driver, hardloginpage.txt_Error_Email_NotExist_Msg);
			Error1=hardloginpage.getText_txt_Error_Email_NotExist_Msg();
			new Readexcel_RowName().excelRead("ErrorMessageSheet",functionality, "Error_Email_NotExist");
			System.out.println(Readexcel_RowName.getValue("Error_Message"));
			if(Readexcel_RowName.getValue("Error_Message").equalsIgnoreCase(Error1))
	    	{	
				Reporter.log("error message is displayed correctly if Email doesnt exist :"+Error1);
			}
			else
			{
				driver.close();	
				Assert.fail("error message is NOT displayed correctly if email doesnt exist :"+ Error1);
		    }
			//Invalid Password error message verification
			hardloginpage.type_txt_Email_Id_Field(Hardlogin_Email_Address);
	    	hardloginpage.type_txt_Password_Field(Invalid_Password);
	    	hardloginpage.click_click_Login_Button();
	    	obj.waitForElement(driver, hardloginpage.txt_Error_Invalid_Password_Msg);
	    	Error1=hardloginpage.getText_txt_Error_Invalid_Password_Msg();
	    	new Readexcel_RowName().excelRead("ErrorMessageSheet",functionality, "Error_Invalid_Password");
	    	System.out.println(Readexcel_RowName.getValue("Error_Message"));
			if(Readexcel_RowName.getValue("Error_Message").equalsIgnoreCase(Error1))
	    	{	
				Reporter.log("error message is displayed correctly for Invalid Password :"+Error1);
			}
			else
			{
				driver.close();	
				Assert.fail("error message is NOT displayed correctly for Invalid Password :"+ Error1);
		    }
			//Incorrect Password error message verification
			hardloginpage.type_txt_Email_Id_Field(Hardlogin_Email_Address);
	    	hardloginpage.type_txt_Password_Field(Incorrect_Password);
	    	hardloginpage.click_click_Login_Button();
	    	obj.waitForElement(driver, hardloginpage.txt_Error_Incorrect_Password_Msg);
	    	Error1=hardloginpage.getText_txt_Error_Incorrect_Password_Msg();
	    	new Readexcel_RowName().excelRead("ErrorMessageSheet",functionality, "Error_Incorrect_Password");
	    	System.out.println(Readexcel_RowName.getValue("Error_Message"));
			if(Readexcel_RowName.getValue("Error_Message").equalsIgnoreCase(Error1))
	    	{	
				Reporter.log("error message is displayed correctly for Invalid Password :"+Error1);
			}
			else
			{
				driver.close();	
				Assert.fail("error message is NOT displayed correctly for Invalid Password :"+ Error1);
		    }
		}
	    catch(Exception e)
	    {
	    	driver.close();
	    	Assert.fail("Error in hardlogin page");
	    }
	   
	    
	    return driver;
	}
	
	
	public WebDriver HardLogin_CheckExpiration(WebDriver driver,String functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_LoggedIn_RewardsPage loginrewardspage = new POM_Generated_LoggedIn_RewardsPage(driver);
		POM_Generated_HardLoginPage hardloginpage = new POM_Generated_HardLoginPage(driver);
		POM_Generated_StaticInfoBar staticinfobar = new POM_Generated_StaticInfoBar(driver);
		POM_Generated_ContactInfoPage contactinfopage = new POM_Generated_ContactInfoPage(driver);
		
		Data obj=new Data();

	    try
		{	
	    	obj.waitForElement(driver, staticinfobar.click_Static_info_My_Account_Link);
	    	staticinfobar.click_click_Static_info_My_Account_Link();
	    	obj.waitForElement(driver,contactinfopage.txt_Fname_Field);
	    	driver.manage().timeouts().implicitlyWait(16, TimeUnit.MINUTES);
	    	if(loginrewardspage.isDisplayed_click_EditAccountDetails_Page_Text())
	    	{
	    	Reporter.log("After 15 minuts, Edit account page is automatically navigated to Logged in Rewards page");
	    	loginrewardspage.click_click_MyRewards_Edit_Acc_Det_Link();
		    	if(hardloginpage.isDisplayed_txt_Email_Id_Field())
		    	{
		    		Reporter.log("After 15 mins,hard login is changed to softlogin mode");
		    	}
		    	else
		    	{
					driver.close();	
					Assert.fail("After 15 mins,hard login is NOT changed to softlogin mode");
			    }	
	    	}
	    	else
			{
				driver.close();	
				Assert.fail("After 15 minuts, Edit account page is NOT automatically navigated to Logged in Rewards page");
		    }
//	    	
		}
	    catch(Exception e)
	    {
	    	driver.close();
	    	Assert.fail("Error in Account expiration");
	    }
	    return driver;
	    }
}
