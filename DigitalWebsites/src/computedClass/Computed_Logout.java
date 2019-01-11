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
	public WebDriver Logout(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		Data obj=new Data();
		try
		{
			
			obj.waitForElementClickable(driver, homepage.click_Logout_button);
            homepage.click_click_Logout_button();
            obj.waitForElementClickable(driver, homepage.click_Login_Or_Signup_Button);
            if(homepage.isDisplayed_click_Login_Or_Signup_Button())
            {
                  Reporter.log("User is logged out successfully");
            }

            else
            {
                  Assert.fail("Login / Register button is not displayed");
            }
		}
		catch(Exception e)
	    {
			driver.close();
	    	Assert.fail("Error in Logout Page");
	    	
	    }
		return driver;	
	}
}
