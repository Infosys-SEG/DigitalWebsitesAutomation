package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import Utility.Data;
import generatedClass.POM_Generated_AccountLookupPage;
import generatedClass.POM_Generated_RegisterNowPage;

public class Computed_Register {

	public WebDriver Enrollment_Landing_Page(WebDriver driver,String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException
	{
		Data obj =new Data();
		POM_Generated_RegisterNowPage register= new POM_Generated_RegisterNowPage(driver);
		POM_Generated_AccountLookupPage Acctlookup= new POM_Generated_AccountLookupPage(driver);
		try
		{
			register.click_click_Rewards_Link_hover();
			register.click_click_Register_button();
			obj.waitForElement(driver, register.click_RegisterNowButton_Section1);
			if(register.isDisplayed_txt_NeverMiss_Section1())
			{
			 Reporter.log("Enrollment landing page is displayed after clicking Register from Rewards menu");
			 	if(register.isDisplayed_txt_SEG_Card_Image())
				 {
				   Reporter.log("SEG rewards card image is displayed");
				 }
				 else	 
				 {
					 Assert.fail("SEG rewards card image is NOT displayed");
				 }
			    register.click_click_RegisterNowButton_Section1();
			    obj.waitForElement(driver, Acctlookup.txt_Card_Number_Field);
			    if(Acctlookup.isDisplayed_txt_Card_Number_Field())
			    {
			     Reporter.log("Account lookup page is displayed after clicking Register now button in Enrollment landing page" );
			    }
			    else
			    {
			     Assert.fail("Account lookup page is NO displayed after clicking Register now button in Enrollment landing page" );
			    }
			    driver.navigate().back();
			    if(register.isDisplayed_txt_Benefits_Section2())
			    {
			     Reporter.log("Benefits section is displayed");
			    }
			    else
			    {
			    	Assert.fail("Benefits section is not displayed");
			    }
			    if(register.isDisplayed_txt_GoldStatus_Section3())
			    {
				Reporter.log("Gold status section is displayed");
				}
				else
				{
				Assert.fail("Gold Status section is not displayed");
				}
			    if(register.isDisplayed_txt_NeverMiss_Section4())
			    {
				Reporter.log("Never miss a deal section is displayed at the bottom");
				}
				else
				{
				Assert.fail("Never miss a deal section is NOT displayed at the bottom");
				}
			    register.click_txt_RegisterNow_Section4();
			    obj.waitForElement(driver, Acctlookup.txt_Card_Number_Field);
			    if(Acctlookup.isDisplayed_txt_Card_Number_Field())
			    {
			     Reporter.log("Account lookup page is displayed after clicking Register now button in Enrollment landing page" );
			    }
			    else
			    {
			     Assert.fail("Account lookup page is NO displayed after clicking Register now button in Enrollment landing page" );
			    }
			    driver.navigate().back();
			    register.click_Click_RewardFAQs_link();
			    if(register.isDisplayed_txt_Hearder_Text_In_FAQPage())
			    {
			    	Reporter.log("Rewards FAQ page is displayed");
			    }
			    else
			    {
			     Assert.fail("Rewards FAQ page is NOT displayed");
			    }
			 }
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			Assert.fail("Error in Register Now Page");
		}
		return driver;
	}
}
