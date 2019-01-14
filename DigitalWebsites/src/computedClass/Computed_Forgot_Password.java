package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_ForgotPasswordPage;
import generatedClass.POM_Generated_HardLoginPage;
import generatedClass.POM_Generated_Homepage;

public class Computed_Forgot_Password 
{
	public WebDriver ValidateErrorMsg_Invalid_Email(WebDriver driver,String functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_ForgotPasswordPage forgotpassword = new POM_Generated_ForgotPasswordPage(driver);
		POM_Generated_HardLoginPage hardloginpage = new POM_Generated_HardLoginPage(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		Data obj=new Data();
		try
		{
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",functionality, TCName);
	    //	String Valid_Test_Email= Readexcel_RowName.getValue("Valid_Test_Email");
	    //	String Valid_Test_Password= Readexcel_RowName.getValue("Valid_Test_Password");
	    	String Invalid_Email_NotExist=Readexcel_RowName.getValue("Invalid_Email_NotExist");
	    	System.out.println(Invalid_Email_NotExist);
	    	obj.waitForElement(driver, homepage.click_Login_Or_Signup_Button);		
	    	homepage.click_click_Login_Or_Signup_Button();
			obj.waitForElement(driver, homepage.click_Close_Button);
			homepage.click_click_HardLogin_button();
	    	obj.waitForElement(driver, hardloginpage.txt_Email_Id_Field);
	    	hardloginpage.click_click_Forget_Password_Link();
	    	obj.waitForElement(driver, forgotpassword.txt_Page_header_text);
	    	if(forgotpassword.isDisplayed_txt_Page_header_text())
	    	{
	    		Reporter.log("Forgot password page is displayed");
	    	}
	    	else
	    	{
	    		Assert.fail("Forgot password page is not displayed");
	    	}
	    	forgotpassword.type_txt_Email_Address_Field("Invalid");
	    	forgotpassword.click_click_Send_Reset_Link_Button();
	    	if(forgotpassword.isDisplayed_txt_Error_Invalid_Email_Msg())
	    	{
	    		System.out.println("Error message is displayed when invalid email is entered");
	    	   Reporter.log("Error message is displayed when invalid email is entered");
	    	}
	    	else
	    	{
	    		Assert.fail("Error message is not displayed when invalid email is entered");
	    	}	
	    	forgotpassword.type_txt_Email_Address_Field("");
	    	forgotpassword.type_txt_Email_Address_Field(Invalid_Email_NotExist);
	    	forgotpassword.click_click_Send_Reset_Link_Button();
	    	if(forgotpassword.isDisplayed_txt_Error_Email_NotExist())
	    	{
	    	   Reporter.log("Error message is displayed when email not exist is entered");
	    	}
	    	else
	    	{
	    		Assert.fail("Error message is not displayed when email not exist is entered");
	    	}	
		}
		catch(Exception e)
	    {
			
	    	Assert.fail("Error in Forgot Password Page");
	    	
	    }
		return driver;	
	}
		
		public WebDriver Validate_ForgotPassword(WebDriver driver,String functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
		{
			POM_Generated_ForgotPasswordPage forgotpassword = new POM_Generated_ForgotPasswordPage(driver);
			POM_Generated_HardLoginPage hardloginpage = new POM_Generated_HardLoginPage(driver);
			POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
			Data obj=new Data();
			try
			{
				new Readexcel_RowName().excelRead("Global_TestData_Sheet",functionality, TCName);
		    	String Valid_Test_Email= Readexcel_RowName.getValue("Valid_Test_Email");
		    	//String Valid_Test_Password= Readexcel_RowName.getValue("Valid_Test_Password");
		    	
		    	obj.waitForElement(driver, homepage.click_Login_Or_Signup_Button);		
		    	homepage.click_click_Login_Or_Signup_Button();
				obj.waitForElement(driver, homepage.click_Close_Button);
				homepage.click_click_HardLogin_button();
		    	obj.waitForElement(driver, hardloginpage.txt_Email_Id_Field);
		    	hardloginpage.click_click_Forget_Password_Link();
		    	obj.waitForElement(driver, forgotpassword.txt_Page_header_text);
		    	if(forgotpassword.isDisplayed_txt_Page_header_text())
		    	{
		    		Reporter.log("Forgot password page is displayed");
		    	}
		    	else
		    	{
		    		Assert.fail("Forgot password page is not displayed");
		    	}
		    	forgotpassword.type_txt_Email_Address_Field(Valid_Test_Email);
		    	forgotpassword.click_click_Send_Reset_Link_Button();
		    	if(forgotpassword.isDisplayed_txt_Text_AfterEnteringEmail())
		    	{
		    	   Reporter.log("Mail has been sent to the given mail address");
		    	}
		    	else
		    	{
		    		Assert.fail("Mail is not sent");
		    	}	
		    	forgotpassword.click_click_Home_Button();
		    	//Opening Gmail in a new Tab
		    	String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		    	driver.findElement(By.linkText("gmail.com")).sendKeys(selectLinkOpeninNewTab);
		    	
			}
		    	
			catch(Exception e)
		    {
				driver.close();
		    	Assert.fail("Error in Logout Page");
		    	
		    }
			return driver;	
		
	}
}
