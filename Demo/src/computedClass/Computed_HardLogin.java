package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_HardLoginPage;
import generatedClass.POM_Generated_Homepage;
import generatedClass.POM_Generated_StaticInfoBar;

public class Computed_HardLogin 
{
	// Global hardlogin
	
	public WebDriver Global_HardLogin(WebDriver driver,String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_HardLoginPage hardloginpage = new POM_Generated_HardLoginPage(driver);
		
		Data obj=new Data();
		
		
	     
	    try
		{	
	    	new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global",Functionality);
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
	    	if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
	    	{
	    		homepage.click_click_Winndixie_logo();
	    	}
	    	if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
	    	{
	    		homepage.click_click_Bilo_logo();
	    	}
	    	if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
	    	{
	    		homepage.click_click_Harveys_logo();
	    	}	
		}
	    catch(Exception e)
	    {
	    	Assert.fail("Error in hardlogin page");
	    }
	   
	    
	    return driver;
	}
	@Test
	public WebDriver Account_HardLogin(WebDriver driver,String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_HardLoginPage hardloginpage = new POM_Generated_HardLoginPage(driver);
		POM_Generated_StaticInfoBar staticinfobar = new POM_Generated_StaticInfoBar(driver);
		
		Data obj=new Data();
		
		String editacctext="Edit Account Details";
		
	    
	    try
		{	
	    	new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global",Functionality);
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
	    		if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
	    		{
	    			homepage.click_click_Winndixie_logo();
	    		}
	    		if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
	    		{
	    			homepage.click_click_Bilo_logo();
	    		}
	    		if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
	    		{
	    			homepage.click_click_Harveys_logo();
	    		}	
	    	}
	    	else
	    	{
	    		Assert.fail("Hardlogin failed");
	    		
	    	}
		}
	    catch(Exception e)
	    {
	    	Assert.fail("Error in Hardlogin Page");
	    	
	    }
	    
	    
	    return driver;
	}	
	
}
