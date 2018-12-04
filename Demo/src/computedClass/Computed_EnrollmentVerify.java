package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_AccountSecurityPage;
import generatedClass.POM_Generated_CongratulationsPage;
import generatedClass.POM_Generated_ContactInfoPage;
import generatedClass.POM_Generated_DigitalCouponsPage;
import generatedClass.POM_Generated_Homepage;
import generatedClass.POM_Generated_LoggedIn_RewardsPage;

public class Computed_EnrollmentVerify 
{
	
	public WebDriver Enrollverify(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException, EncryptedDocumentException, InvalidFormatException 
	{
		POM_Generated_CongratulationsPage congratulationspage = new POM_Generated_CongratulationsPage(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_LoggedIn_RewardsPage loginrewardspage = new POM_Generated_LoggedIn_RewardsPage(driver);
		POM_Generated_DigitalCouponsPage digitalcouponspage = new POM_Generated_DigitalCouponsPage(driver);
		POM_Generated_ContactInfoPage contactinfopage = new POM_Generated_ContactInfoPage(driver);
		POM_Generated_AccountSecurityPage accountsecuritypage = new POM_Generated_AccountSecurityPage(driver);
		Data obj=new Data();
		String neverdealsurl="";
		String v="";
		
	    new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global",Functionality);
    	if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
    	{
    		v="winndixie";
  		
    	}
    	else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
    	{
    		v="bi-lo";
    		
    	}
    	else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
    	{
    		v="harveyssupermarkets";		
    	}
    	String coup="https://"+v+".pdn.retaileriq.com - Google Chrome";
	    String ie="Windows Security";
	    String bro="";
		if(Readexcel_RowName.getValue("Chrome(Y/N)").equalsIgnoreCase("Y"))
		{
			bro= coup;
		}	
		else if(Readexcel_RowName.getValue("IE(Y/N)").equalsIgnoreCase("Y"))
		{
			bro=ie;
		}
		String Val = obj.popuppath()+" "+bro;
		
		new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
		try 
    	{
    		obj.waitForElement(driver, congratulationspage.txt_ThankYou_Message_Text);
		    neverdealsurl=driver.getCurrentUrl();
		    obj.scrollingToElementofAPage(driver, congratulationspage.click_Fuel_Rewards_Link);
		    congratulationspage.click_click_Fuel_Rewards_Link();
		    obj.waitForElementClickable(driver, congratulationspage.txt_Fuel_Rewards_Page_Button);
		    driver.get(neverdealsurl);
		    obj.waitForElement(driver, congratulationspage.txt_ThankYou_Message_Text);
    	}
    	catch(Exception e)
		{
			Assert.fail("Error in Fuel rewards page after enrollment");
		}	
	    try
	    {
	    	obj.scrollingToElementofAPage(driver, congratulationspage.click_Digital_coupons_button);
	    	
	    	Runtime.getRuntime().exec(Val);
			
	    	congratulationspage.click_click_Digital_coupons_button();
	    	obj.waitForElement(driver, digitalcouponspage.click_Digital_Coupon_page_Link);
	    	driver.get(neverdealsurl);
	    	obj.waitForElement(driver, congratulationspage.txt_ThankYou_Message_Text);
	    }
	    catch(Exception e)
		{
			Assert.fail("Error in Digital coupons page after enrollment");
			
		}	
	    
	    try
	    {
	    	obj.scrollingToElementofAPage(driver, congratulationspage.click_My_Rewards_Link);
	    	congratulationspage.click_click_My_Rewards_Link();
		    obj.waitForElement(driver, loginrewardspage.txt_MyRewards_Name_Verify);
		    String namev= loginrewardspage.getText_txt_MyRewards_Name_Verify();
		    if(!namev.equals("Hello "+Readexcel_RowName.getValue("FirstName")+"!"))
		    {
		    	Assert.fail("Incorrect rewards page");
		    }
		    obj.waitForElementClickable(driver, loginrewardspage.click_MyRewards_Edit_Acc_Det_Link);
	    }
	    catch(Exception e)
	    {
			Assert.fail("Error in rewards page after enrollment");
			
		}	
		
	    try
	    {
	    	loginrewardspage.click_click_MyRewards_Edit_Acc_Det_Link();
	    	obj.waitForElement(driver, loginrewardspage.click_EditAccountDetails_Page_Text);
	    	if (!contactinfopage.getValue_ddl_Salutation_Field().equals(Readexcel_RowName.getValue("Salutation")))
	    	{
	    		Assert.fail("Salutation is not pre populating");
	    	}
		    if (!contactinfopage.getValue_txt_Fname_Field().equals(Readexcel_RowName.getValue("FirstName")))
			{
		    	Assert.fail("First Name is not pre populating");
			}
		    if (!contactinfopage.getValue_txt_Lname_Field().equals(Readexcel_RowName.getValue("LastName")))
			{
		    	Assert.fail("Last Name is not pre populating");
			}
		    if (!contactinfopage.getValue_txt_Month_Field().equals(Readexcel_RowName.getValue("Month")))
			{
		    	Assert.fail("Month is not pre populating");
			}
			if (!contactinfopage.getValue_txt_Date_Field().equals(Readexcel_RowName.getValue("Date")))
			{
				Assert.fail("Date is not pre populating");
			}
			if (!contactinfopage.getValue_txt_Year_Field().equals(Readexcel_RowName.getValue("Year")))
			{
				Assert.fail("Year is pre populating");
			}		
			if (!accountsecuritypage.getValue_txt_Email_Address_Field().equals(Readexcel_RowName.getValue("EmailAddress")))
			{
				Assert.fail("Email address is not pre populating");
			}
			if (!contactinfopage.getValue_txt_Address_Field().equals(Readexcel_RowName.getValue("Address1")))
			{
				Assert.fail("Address is not pre populating");
			}
			if (!(contactinfopage.getValue_txt_Additional_Address_Field().replace("", "null")).equals(String.valueOf(Readexcel_RowName.getValue("Address2"))))
			{
				Assert.fail("Additional address is not pre populating");
			}			
			if (!contactinfopage.getValue_txt_Primary_Phone_Number_Field().equals(Readexcel_RowName.getValue("Primary_Phone")))
			{
				Assert.fail("Primary phone number is not pre populating");
			}
			/*if(ReadExcel.getValue("save_coupons(Y/N)").equalsIgnoreCase("N"))
			{
				if (!Ev.isSelected_click_Enrollment_My_Account_Save_With_Mobile_Coupons_No())
				{
					result=result+"Save with coupons value is not pre populating or nothing selected"+"\n";
				}	
			}*/
			obj.scrollingToElementofAPage(driver, homepage.click_Logout_button);
			homepage.click_click_Logout_button();
	    }
	    catch(Exception e)
	    {
	    	Assert.fail("Error in Edit Account Details page after enrollment");
			
		}	
		return driver;
	}
}
