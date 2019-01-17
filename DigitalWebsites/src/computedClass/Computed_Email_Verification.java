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

public class Computed_Email_Verification 
{
	Data obj=new Data();
	public WebDriver email_validatingNext (WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException
	{		
		POM_Generated_VerificationPage email = new POM_Generated_VerificationPage(driver);
		try 
		{
			 if (email.isDisplayed_txt_Email_verification_header())
			 {
				 String hdr = email.getText_txt_Email_verification_header();
				 Reporter.log("Navigated to Email verification page with header : "+hdr);
				
			 }
			 else
			 {
				 obj.Ashot_Screenshot(driver, Functionality, TCName, "EmailNavErr");
				 Assert.fail("Issue in navigating to Email verification page");
			 }
			 new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality, TCName);
			 email.type_txt_Enter_Verification_Code_Field(Readexcel_RowName.getValue("inv_Code"));
			 
			 //checking if next is enabled
			 if(!email.isEnabled_txt_Email_verification_Next())
			 {
				 Reporter.log("Next button is not enabled until 6 digits code is entered");
			 }
			 else
			 {
				 obj.Ashot_Screenshot(driver, Functionality, TCName, "Verify_NextButEnableBef6Dig");
				 Assert.fail("Next button is enabled before entering the 6 digits");
			 }
			 //checking if >6 is not allowed(6 digits & a space)
			 email.type_txt_Enter_Verification_Code_Field(Readexcel_RowName.getValue("err_Code"));
		
			// String err_cd = Readexcel_RowName.getValue("err_Code");
			 //int i=err_cd.length();
			 String entry_cd = email.getValue_txt_Enter_Verification_Code_Field();
			 int a = entry_cd.length();
			 if(a==7)
			 {
				 Reporter.log("Unable to enter more than 6 digits in email verification code field");
			 }
			 else
			 {
				 obj.Ashot_Screenshot(driver, Functionality, TCName, "Verify_MoreThn6DigAllow");
				 Assert.fail("More than 6 digits is allowed in email verification code field");
			 }
			 email.type_txt_Enter_Verification_Code_Field(Readexcel_RowName.getValue("Code"));
			 if(email.isEnabled_txt_Email_verification_Next())
			 {
				 Reporter.log("Next button is enabled on entering 6 digits code");
			 }
			 else
			 {
				 obj.Ashot_Screenshot(driver, Functionality, TCName, "Verify_NextButNotEnableAftr6Dig");
				 Assert.fail("Next button is not enabled after entering the 6 digits");
			 }
			 
		}
		catch(Exception e)
		{
			Assert.fail("Issue in email verification screen");
		}
		
		
		return driver;
	}
	
	public WebDriver email_NextSpl (WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException
	{
		
		//Data obj = new Data();
		POM_Generated_VerificationPage email = new POM_Generated_VerificationPage(driver);
		try 
		{
			 new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality, TCName);
			 email.type_txt_Enter_Verification_Code_Field(Readexcel_RowName.getValue("inv_Code"));
			 //checking if special char is allowed
			 if(email.getValue_txt_Enter_Verification_Code_Field().equals(""))
			 {
				 Reporter.log("Special characters are not allowed in Email verification code field");
			 }
			 else
			 {
			 Assert.fail("Special characters are allowed in Email verification code field");
			 }
		}
		catch(Exception e)
		{
			Assert.fail("Issue in email verification screen");
		}

		return driver;
   }
	
	public WebDriver Invalid_code_email(WebDriver driver,String Functionality,String TCName , String LabelName) throws FileNotFoundException, IOException, InterruptedException, AWTException
	{
		
		//Data obj = new Data();
		POM_Generated_VerificationPage email = new POM_Generated_VerificationPage(driver);
		try 
		{
			 if (email.isDisplayed_txt_Email_verification_header())
			 {
				 String hdr = email.getText_txt_Email_verification_header();
				 Reporter.log("Navigated to Email verification page with header : "+hdr);
				
			 }
			 else
			 {
				 Assert.fail("issue in navigating to Email verification page");
			 }
			 //first time error message
			 new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality, TCName);
			 email.type_txt_Enter_Verification_Code_Field(Readexcel_RowName.getValue("inv_Code"));
			 email.click_txt_Email_verification_Next();
			 new Readexcel_RowName().excelRead("ErrorMessageSheet","VerificationPage",LabelName);
		     String Error_Msg1= Readexcel_RowName.getValue("ErrorMessage");
		     //System.out.println(Error_Msg1);
		     if(email.isDisplayed_txt_Error_Email_InvalidCode_Msg())
		     {
		    	 //String s1 = email.getText_txt_Error_Email_InvalidCode_Msg();
		    	 //System.out.println(s1);
		    	 if(email.getText_txt_Error_Email_InvalidCode_Msg().equalsIgnoreCase(String.valueOf(Error_Msg1)))
		    	 {
		    		 Reporter.log("Error message is displayed on entering invalid code for the first time : "+Error_Msg1);
		    	 }
		    	 else
		    	 {
		    		 Assert.fail("Error message is not displayed on entering invalid code for the first time");
		    	 }
		    		 
		     }
		     //second time error msg
		     new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality, TCName);
			 email.type_txt_Enter_Verification_Code_Field(Readexcel_RowName.getValue("err_Code"));
			 email.click_txt_Email_verification_Next();
			 new Readexcel_RowName().excelRead("ErrorMessageSheet","VerificationPage",LabelName);
		     String Error_Msg2= Readexcel_RowName.getValue("ErrorMessage");
		     if(email.isDisplayed_txt_Error_Email_InvalidCode_Msg())
		     {
		    	 //String s2 = email.getText_txt_Error_Email_InvalidCode_Msg();
		    	 //System.out.println(s2);
		    	 if(email.getText_txt_Error_Email_InvalidCode_Msg().equalsIgnoreCase(String.valueOf(Error_Msg2)))
		    	 {
		    		 Reporter.log("Error message is displayed on entering invalid code for the second time : "+Error_Msg2);
		    	 }
		    	 else
		    	 {
		    		 Assert.fail("Error message is not displayed on entering invalid code for the second time");
		    	 }
		    		 
		     }
		     
		}
		catch(Exception e)
		{
			Assert.fail("Issue in email verification screen");
		}
		
		
		return driver;
	}
	
	public WebDriver Invalid_code_email_thirdtym(WebDriver driver,String Functionality,String TCName , String LabelName) throws FileNotFoundException, IOException, InterruptedException, AWTException
	{
		
		//Data obj = new Data();
		POM_Generated_VerificationPage email = new POM_Generated_VerificationPage(driver);
		try 
		{
			//third time error msg
		     new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality, TCName);
			 email.type_txt_Enter_Verification_Code_Field(Readexcel_RowName.getValue("Code"));
			 email.click_txt_Email_verification_Next();
			 new Readexcel_RowName().excelRead("ErrorMessageSheet","VerificationPage",LabelName);
		     String Error_Msg3= Readexcel_RowName.getValue("ErrorMessage");
		     if(email.isDisplayed_txt_Error_InvalidCode_After3Attempts_Msg())
		     {
		    	 //String s3 = email.getText_txt_Error_InvalidCode_After3Attempts_Msg();
		    	 //System.out.println(s3);
		    	 if(email.getText_txt_Error_InvalidCode_After3Attempts_Msg().equalsIgnoreCase(String.valueOf(Error_Msg3)))
		    	 {
		    		 
		    		 Reporter.log("Error message is displayed on entering invalid code for the third time : "+Error_Msg3);
		    	 }
		    	 else
		    	 {
		    		 Assert.fail("Error message is not displayed on entering invalid code for the third time");
		    	 }
		    	 //if(!email.isDisplayed_txt_Email_verification_Next())
				 //{
					 //Reporter.log("Next button is not displayed after entering  invalid code 3 times");
				 //}
	 
		     }

		}
		catch(Exception e)
		{
			Assert.fail("Issue in email verification screen");
		}
		
		
		return driver;
	}
		
}

