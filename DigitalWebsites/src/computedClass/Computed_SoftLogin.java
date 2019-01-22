package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_ContactInfoPage;
import generatedClass.POM_Generated_Homepage;
import generatedClass.POM_Generated_LoggedOut_RewardsPage;
import generatedClass.POM_Generated_One_Quick_Thing_Popup;
import generatedClass.POM_Generated_SoftLoginPage;

public class Computed_SoftLogin 
{
	Data obj=new Data();
	//Softlogin by clicking save coupon button in homepage
	public WebDriver SoftLogin_SaveCoupon(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_SoftLoginPage softloginpage = new POM_Generated_SoftLoginPage(driver);
		Data obj=new Data();
		WebElement logo = null;
		
		new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global", Functionality);
		
		if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
		{
			
			logo=homepage.click_Winndixie_logo;
		}
		else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
		{
			
			logo = homepage.click_Bilo_logo;
		}
		else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
		{
			
			logo = homepage.click_Harveys_logo;
		}
		try
		{		
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality, TCName);
		    String Softlogin_Phone_number1= Readexcel_RowName.getValue("Softlogin_Phone_number");
		    String Softlogin_Zipcode1= Readexcel_RowName.getValue("Softlogin_Zipcode");
		  
		    obj.waitForElement(driver, logo);
			logo.click();
			
			obj.waitForElement(driver, homepage.click_Login_Or_Signup_Button);		
	    	obj.scrollingToElementofAPage(driver, (WebElement) homepage.click_Save_Coupon_Button);
	  		//obj.waitForElement(driver, (WebElement) sl.click_HomePage_Coupons_Button_List);
	  		List<WebElement> buttons = homepage.click_Save_Coupon_Button;  
	  		int sizee=buttons.size();
	  		boolean aa=true;
	  		for(int n=1;n<sizee;n++)
	  		{
	  			if(aa==true)
	  			{
	  				
	  				if(buttons.get(n).isDisplayed())
	  				{	  	
	  					obj.scrollingToElementofAPage(driver, buttons.get(n));
	  					buttons.get(n).click();
	  					aa=false;
	  				}
	  			}
	  		}  
			
		    
			softloginpage.type_txt_Phone_Number_Field(Softlogin_Phone_number1);
			softloginpage.type_txt_Zipcode_Field(Softlogin_Zipcode1);
			softloginpage.click_click_Submit_Button();
			obj.waitForElement(driver, homepage.click_Logout_button);

			
			if(homepage.isDisplayed_click_Logout_button())
			{	
				Reporter.log("Logged in successfully using SoftLogin");
			}
			else
			{
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_SoftLoginFailed"); 
				driver.close();
				Assert.fail("Softlogin failed");
			}
		}
		catch (Exception e)
		{
			obj.Ashot_Screenshot(driver, Functionality, TCName,"err_SoftLoginFailed"); 
			driver.close();
			Assert.fail("Error in Softlogin Page or invalid credentials");
	    }	
		return driver;	
	}
	
	//Softlogin by clicking Rewards button 
	public WebDriver SoftLogin_Rewards(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_LoggedOut_RewardsPage logoutrewardspage = new POM_Generated_LoggedOut_RewardsPage(driver);
		POM_Generated_SoftLoginPage softloginpage = new POM_Generated_SoftLoginPage(driver);
		Data obj1=new Data();
	
		
		WebElement logo = null;
		
		new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global", Functionality);
		
		if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
		{
			
			logo=homepage.click_Winndixie_logo;
		}
		else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
		{
			
			logo = homepage.click_Bilo_logo;
		}
		else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
		{
			
			logo = homepage.click_Harveys_logo;
		}
		
		
		try
		{		
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality, TCName);
		    String Softlogin_Phone_number1= Readexcel_RowName.getValue("Softlogin_Phone_number");
		    String Softlogin_Zipcode1= Readexcel_RowName.getValue("Softlogin_Zipcode");
		  
		    obj1.waitForElementClickable(driver, logo);
		    logo.click();
		   
			obj1.waitForElementClickable(driver, homepage.click_Login_Or_Signup_Button);	
		
			obj1.waitForElementClickable(driver, homepage.click_Rewards_link_Hover);
			homepage.click_click_Rewards_link_Hover();
			homepage.click_click_Rewards_Rewards_Button();
    	
			obj1.waitForElementClickable(driver, logoutrewardspage.click_Rewards_Login_Button);
			//Functionality of Login button in logged out rewards page
			logoutrewardspage.click_click_Rewards_Login_Button();
			
		    
			softloginpage.type_txt_Phone_Number_Field(Softlogin_Phone_number1);
			softloginpage.type_txt_Zipcode_Field(Softlogin_Zipcode1);
			softloginpage.click_click_Submit_Button();
			obj1.waitForElement(driver, homepage.click_Logout_button);	
			
			if(homepage.isDisplayed_click_Logout_button())
			{	
				Reporter.log("Logged in successfully using SoftLogin");
			}
			else
			{
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_SoftLoginFailed"); 
				//driver.close();
				Assert.fail("Softlogin failed");
			}		
		}
		catch (Exception e)
		{
			System.out.println(driver);
			System.out.println(Functionality);
			System.out.println(TCName);
			obj.Ashot_Screenshot(driver, Functionality, TCName,"err_SoftLoginFailed");
			//driver.close();
			System.out.println(e);
			Assert.fail("Error in Softlogin Page or invalid credentials");
	    }		
		return driver;	
	}
	
	public WebDriver SoftLogin_PreEnrolledUser(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_LoggedOut_RewardsPage logoutrewardspage = new POM_Generated_LoggedOut_RewardsPage(driver);
		POM_Generated_SoftLoginPage softloginpage = new POM_Generated_SoftLoginPage(driver);
		POM_Generated_One_Quick_Thing_Popup onequickthing = new POM_Generated_One_Quick_Thing_Popup(driver);
		POM_Generated_ContactInfoPage contactinfopage = new POM_Generated_ContactInfoPage(driver);
		Data obj1=new Data();
		WebElement logo = null;
		
		new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global", Functionality);
		
		if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
		{
			
			logo=homepage.click_Winndixie_logo;
		}
		else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
		{
			
			logo = homepage.click_Bilo_logo;
		}
		else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
		{
			
			logo = homepage.click_Harveys_logo;
		}
		
		
		try
		{		
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality, TCName);
		    String Softlogin_Phone_number1= Readexcel_RowName.getValue("Softlogin_Phone_number");
		    String Softlogin_Zipcode1= Readexcel_RowName.getValue("Softlogin_Zipcode");
		  
		    obj1.waitForElement(driver, logo);
		    logo.click();
			obj1.waitForElement(driver, homepage.click_Login_Or_Signup_Button);	
		
			obj1.waitForElement(driver, homepage.click_Rewards_link_Hover);
			homepage.hover_click_Rewards_link_Hover();
			homepage.click_click_Rewards_Rewards_Button();
    	
			//Functionality of Login button in logged out rewards page
			logoutrewardspage.click_click_Rewards_Login_Button();
			
		    
			softloginpage.type_txt_Phone_Number_Field(Softlogin_Phone_number1);
			softloginpage.type_txt_Zipcode_Field(Softlogin_Zipcode1);
			softloginpage.click_click_Submit_Button();
			obj1.waitForElement(driver, onequickthing.click_Ok_I_Will_Do_This_Now_Button);	
			
			onequickthing.click_click_Ok_I_Will_Do_This_Now_Button();
			obj1.waitForElement(driver, contactinfopage.txt_HeaderName_Text);
			if(contactinfopage.isDisplayed_txt_HeaderName_Text())
			{	
				Reporter.log("Contactinfo page is displayed for preenrolled user through softlogin by clicking one quick thing button");
			}
			else
			{
				obj.Ashot_Screenshot(driver, Functionality, TCName,"err_SoftLoginFailed"); 
				driver.close();
				Assert.fail("Contactinfo page is not displayed for preenrolled user through softlogin by clicking one quick thing button");
			}		
		}
		catch (Exception e)
		{
			obj.Ashot_Screenshot(driver, Functionality, TCName,"err_SoftLoginFailed"); 
			driver.close();
			Assert.fail("Error in Softlogin Page or one quick thing popup");
	    }	
		
		
		return driver;	
	}
}
