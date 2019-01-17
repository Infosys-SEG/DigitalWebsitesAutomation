package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import Utility.Data;
import generatedClass.POM_Generated_Homepage;

public class Computed_Logout 
{
	Data obj=new Data();
	public WebDriver Logout(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		
		try
		{
			
			obj.waitForElement(driver, homepage.click_Logout_button);
            homepage.click_click_Logout_button();
            obj.waitForElement(driver, homepage.click_Login_Or_Signup_Button);
            if(homepage.isDisplayed_click_Login_Or_Signup_Button())
            {
                  Reporter.log("User is logged out successfully");
            }
            else
            {
            	obj.Ashot_Screenshot(driver, Functionality, TCName, "Logout_NoLoginORRegButton");
            	Assert.fail("Login / Register button is not displayed");
            }
		}
		catch(Exception e)
	    {
			obj.Ashot_Screenshot(driver, Functionality, TCName, "Logout_Err");
			driver.close();
	    	Assert.fail("Error in Logout Page");
	    	
	    }
		return driver;	
	}
}
