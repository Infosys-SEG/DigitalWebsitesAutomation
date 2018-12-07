package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_ContactInfoPage;
import generatedClass.POM_Generated_HardLoginPage;
import generatedClass.POM_Generated_Homepage;
import generatedClass.POM_Generated_One_Quick_Thing_Popup;
import generatedClass.POM_Generated_StaticInfoBar;

public class Computed_HardLogin 
{
	// Global hardlogin
	
	public WebDriver Global_HardLogin(WebDriver driver,String Functionality, String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_HardLoginPage hardloginpage = new POM_Generated_HardLoginPage(driver);
		WebElement logo = null;
		Data obj=new Data();   
		new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global",Functionality);
		if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
		{
			logo=homepage.click_Winndixie_logo;
		}
		if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
		{
			logo=homepage.click_Bilo_logo;
		}
		if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
		{
			logo=homepage.click_Harveys_logo;
		}	
	    try
		{	
	    	new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
	    	String Hardlogin_Email_Address= Readexcel_RowName.getValue("Hardlogin_Email_Address");
	    	String Hardlogin_Password= Readexcel_RowName.getValue("Hardlogin_Password");
	    	obj.waitForElementClickable(driver, logo);
	    	logo.click();
	    	obj.waitForElementClickable(driver, homepage.click_Login_Or_Signup_Button);		
	    	
	    	homepage.click_click_Login_Or_Signup_Button();
	    	
			obj.waitForElementClickable(driver, homepage.click_HardLogin_button);
			
			homepage.click_click_HardLogin_button();
			
	    	obj.waitForElement(driver, hardloginpage.txt_Email_Id_Field);
	    	hardloginpage.type_txt_Email_Id_Field(Hardlogin_Email_Address);
	    	hardloginpage.type_txt_Password_Field(Hardlogin_Password);
	    	hardloginpage.click_click_Login_Button();
	    	obj.waitForElementClickable(driver, homepage.click_Logout_button);	
		}
	    catch(Exception e)
	    {
	    	Assert.fail("Error in hardlogin page");
	    }
	   
	    
	    return driver;
	}
	
	
	public WebDriver Account_HardLogin(WebDriver driver,String Functionality, String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_HardLoginPage hardloginpage = new POM_Generated_HardLoginPage(driver);
		POM_Generated_StaticInfoBar staticinfobar = new POM_Generated_StaticInfoBar(driver);
		WebElement logo = null;
		Data obj=new Data();   
		new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global",Functionality);
		if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
		{
			logo=homepage.click_Winndixie_logo;
		}
		if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
		{
			logo=homepage.click_Bilo_logo;
		}
		if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
		{
			logo=homepage.click_Harveys_logo;
		}	
	    try
		{	
	    	new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
	    	String Hardlogin_Email_Address= Readexcel_RowName.getValue("Hardlogin_Email_Address");
	    	String Hardlogin_Password= Readexcel_RowName.getValue("Hardlogin_Password");
	    	obj.waitForElementClickable(driver, logo);
	    	logo.click();
	    	obj.waitForElementClickable(driver, staticinfobar.click_Static_info_My_Account_Link);
	    	staticinfobar.click_click_Static_info_My_Account_Link();
	    	obj.waitForElement(driver, hardloginpage.txt_Email_Id_Field);
	    	hardloginpage.type_txt_Email_Id_Field(Hardlogin_Email_Address);
	    	hardloginpage.type_txt_Password_Field(Hardlogin_Password);
	    	hardloginpage.click_click_Login_Button();
	    	obj.waitForElement(driver, staticinfobar.click_Static_info_My_Account_Text);
	    	if(staticinfobar.isDisplayed_click_Static_info_My_Account_Text())
	    	{
	    		Reporter.log("Hardlogin successful from my account page");
	    	}
	    	else
	    	{
	    		Assert.fail("Hardlogin failed from My Account page");
	    		
	    	}
		}
	    catch(Exception e)
	    {
	    	Assert.fail("Error in Hardlogin Page");
	    	
	    }
	    
	    return driver;
	}	
	
	
	public WebDriver Global_HardLogin_PreEnrolledUser(WebDriver driver,String Functionality, String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_HardLoginPage hardloginpage = new POM_Generated_HardLoginPage(driver);
		POM_Generated_One_Quick_Thing_Popup onequickthing = new POM_Generated_One_Quick_Thing_Popup(driver);
		POM_Generated_ContactInfoPage contactinfopage = new POM_Generated_ContactInfoPage(driver);
		WebElement logo = null;
		Data obj=new Data();   
		new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global",Functionality);
		if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
		{
			logo=homepage.click_Winndixie_logo;
		}
		if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
		{
			logo=homepage.click_Bilo_logo;
		}
		if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
		{
			logo=homepage.click_Harveys_logo;
		}	
	    try
		{	
	    	new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
	    	String Hardlogin_Email_Address= Readexcel_RowName.getValue("Hardlogin_Email_Address");
	    	String Hardlogin_Password= Readexcel_RowName.getValue("Hardlogin_Password");
	    	obj.waitForElementClickable(driver, logo);
	    	logo.click();
	    	obj.waitForElementClickable(driver, homepage.click_Login_Or_Signup_Button);		
	    	
	    	homepage.click_click_Login_Or_Signup_Button();
	    	
			obj.waitForElementClickable(driver, homepage.click_HardLogin_button);
			
			homepage.click_click_HardLogin_button();
			
	    	obj.waitForElement(driver, hardloginpage.txt_Email_Id_Field);
	    	hardloginpage.type_txt_Email_Id_Field(Hardlogin_Email_Address);
	    	hardloginpage.type_txt_Password_Field(Hardlogin_Password);
	    	hardloginpage.click_click_Login_Button();
	    	obj.waitForElementClickable(driver, homepage.click_Logout_button);
	    	obj.waitForElement(driver, onequickthing.click_Ok_I_Will_Do_This_Now_Button);	
			
			onequickthing.click_click_Ok_I_Will_Do_This_Now_Button();
			obj.waitForElementClickable(driver, contactinfopage.txt_HeaderName_Text);
			if(contactinfopage.isDisplayed_txt_HeaderName_Text())
			{	
				Reporter.log("Contactinfo page is displayed for preenrolled user through HardLogin by clicking one quick thing button");
			}
			else
			{
				Assert.fail("Contactinfo page is not displayed for preenrolled user through HardLogin by clicking one quick thing button");
			}		
		}
		catch (Exception e)
		{
				Assert.fail("Error in HardLogin Page or one quick thing popup");
	    }		
		
	    return driver;
	}
}
