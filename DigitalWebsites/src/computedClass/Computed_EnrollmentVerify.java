package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_CongratulationsPage;
import generatedClass.POM_Generated_ContactInfoPage;
import generatedClass.POM_Generated_DigitalCouponsPage;
import generatedClass.POM_Generated_Homepage;
import generatedClass.POM_Generated_LoggedIn_RewardsPage;
import generatedClass.POM_Generated_MyAccountPage;


public class Computed_EnrollmentVerify 
{
	
	public WebDriver Enrollverify(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException, EncryptedDocumentException, InvalidFormatException 
	{
		POM_Generated_CongratulationsPage congratulationspage = new POM_Generated_CongratulationsPage(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_MyAccountPage myaccountpage = new POM_Generated_MyAccountPage(driver);
		POM_Generated_LoggedIn_RewardsPage loginrewardspage = new POM_Generated_LoggedIn_RewardsPage(driver);
		POM_Generated_DigitalCouponsPage digitalcouponspage = new POM_Generated_DigitalCouponsPage(driver);
		POM_Generated_ContactInfoPage contactinfopage = new POM_Generated_ContactInfoPage(driver);
		
		Data obj=new Data();
		String neverdealsurl="";
		String v="";
		String notpickeduptext = "Rewards #: Be sure to pick up your new card next time you shop!";
		String pickeduptext = "Rewards #: ";
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
    	String fuelrewardsurl = "https://www.fuelrewards.com/";
    	String coup="https://"+v+".pdn.retaileriq.com";
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
		String cardstatus="";
		if(Readexcel_RowName.getValue("Card_Type(Card/Phone/CRC)").equalsIgnoreCase("NewMember"))
		{
			cardstatus="";
		}
		else
		{
		 cardstatus = Readexcel_RowName.getValue("Phone/Card_Number");
		}
		try
		{
			if(congratulationspage.isDisplayed_click_CloseModal_Button())
		    {
		    	congratulationspage.click_click_CloseModal_Button();
		    	
		    }
		}
		catch(Exception e)
		{
			
		}
		
		
		neverdealsurl=driver.getCurrentUrl();	    
		if(cardstatus.startsWith("722"))
		{
			obj.waitForElement(driver, congratulationspage.txt_ThankYou_Message_Text);
			

			try
			{
				
				if(congratulationspage.isDisplayed_txt_Pick_Up_Text())
				{
					Reporter.log("Pickup text message is displayed for G&G card");
				}
				
				
		    }
			catch(Exception e)
			{
				Reporter.log("Pickup text message is not displayed for G&G card");
		    }
		}
		else
		{
			try
			{
				obj.waitForElement(driver, congratulationspage.txt_ThankYou_Message_Text);
				if(congratulationspage.isDisplayed_txt_Pick_Up_Text())
				{
					Reporter.log("Pickup text message is displayed");
		    	}
				else
				{
					obj.Ashot_Screenshot(driver, Functionality, TCName,"pickup_error");
					Assert.fail("Pickup text message is not displayed");
		    	}
		    }
			catch(Exception e)
			{
				obj.Ashot_Screenshot(driver, Functionality, TCName,"pickup_err");
				Assert.fail("Pickup text message is not displayed");
		    }
		}		
		try 
    	{
			try
			{
				if(congratulationspage.isDisplayed_click_CloseModal_Button())
			    {
			    	congratulationspage.click_click_CloseModal_Button();
			    	
			    }
			}
			catch(Exception e)
			{
				
			}
		    
			obj.movetoElement_JS(driver, congratulationspage.click_Fuel_Rewards_Link);
			
		  
		   try
		   {
			   congratulationspage.click_click_Fuel_Rewards_Link();
			 
			   if(congratulationspage.isDisplayed_click_Fuel_Rewards_Link())
			   {
				   congratulationspage.click_click_Fuel_Rewards_Link();
				  
			   }
		   }
		   catch(Exception e)
		   {
			   
		   }
			
		   
		    
		    obj.waitForElementClickable(driver, congratulationspage.txt_Fuel_Rewards_Page_Button);
		    if(driver.getCurrentUrl().equalsIgnoreCase(fuelrewardsurl))
		    {
		    	Reporter.log("Fuel rewards URL is correct");
		    }
		    else
		    {
		    	obj.Ashot_Screenshot(driver, Functionality, TCName, "fuelrew_err");
		    	Assert.fail("Fuel rewards URL is wrong");
		    }
		 
		    driver.get(neverdealsurl);
		    obj.waitForElement(driver, congratulationspage.txt_ThankYou_Message_Text);
    	}
    	catch(Exception e)
		{
    		//driver.close();
    		obj.Ashot_Screenshot(driver, Functionality, TCName,"fuelrew_err");
    		System.out.println(e);
			Assert.fail("Error in Fuel rewards page after enrollment");
		}	
	    /*try
	    {
	    	try
			{
			Runtime.getRuntime().exec(Val);
				if(congratulationspage.isDisplayed_click_CloseModal_Button())
			    {
			    	congratulationspage.click_click_CloseModal_Button();
			    	Reporter.log("Coupon Modal is displayed");
			    }
			}
			catch(Exception e1)
			{
				
			}
	    	obj.scrollingToElementofAPage(driver, congratulationspage.click_Digital_coupons_button);
	    	
	    	
			
	    	congratulationspage.click_click_Digital_coupons_button();
	    	obj.waitForElement(driver, digitalcouponspage.click_Digital_Coupon_page_Link);
	    	driver.get(neverdealsurl);
	    	obj.waitForElement(driver, congratulationspage.txt_ThankYou_Message_Text);
	    }
	    catch(Exception e2)
		{
	    	//driver.close();
	    	System.out.println(e2);
			Assert.fail("Error in Digital coupons page after enrollment");
			
		}	*/
	    
	    try
	    {
	    	try
			{
				if(congratulationspage.isDisplayed_click_CloseModal_Button())
			    {
			    	congratulationspage.click_click_CloseModal_Button();
			    	
			    }
			}
			catch(Exception e3)
			{
				
			}
	    	Thread.sleep(1000);
	    	obj.movetoElementofAPage(driver, congratulationspage.click_My_Rewards_Link);
	    	obj.waitForElementClickable(driver, congratulationspage.click_My_Rewards_Link);
	    	congratulationspage.click_click_My_Rewards_Link();
		    obj.waitForElement(driver, loginrewardspage.txt_MyRewards_Name_Verify);
		    String namev= loginrewardspage.getText_txt_MyRewards_Name_Verify();
		    if(!namev.equals("Hello "+Readexcel_RowName.getValue("FirstName")+"!"))
		    {
		    	//driver.close();
		    	obj.Ashot_Screenshot(driver, Functionality, TCName,"incorrect_rew");
		    	Assert.fail("Incorrect rewards page");
		    }
		    else
		    {
		    	Reporter.log("Navigated to correct rewards page and first name matched");
		    }
		    obj.waitForElementClickable(driver, loginrewardspage.click_MyRewards_Edit_Acc_Det_Link);
	    }
	    catch(Exception e4)
	    {
	    	//driver.close();
	    	obj.Ashot_Screenshot(driver, Functionality, TCName,"error_rew");
	    	System.out.println(e4);
			Assert.fail("Error in rewards page after enrollment");
			
		}	
	
	    try
	    {
	    	loginrewardspage.click_click_MyRewards_Edit_Acc_Det_Link();
	    	obj.waitForElement(driver, loginrewardspage.click_EditAccountDetails_Page_Text);
	    	
	    	try
	 	    {
	    		if(cardstatus.startsWith("722"))
	    		{
	    			//String rewardstatus = Readexcel_RowName.getValue("Phone/Card_Number");
	    			
	    			if(myaccountpage.getText_txt_Rewards_Card_Number_Text().equalsIgnoreCase(pickeduptext+cardstatus))
	    			{
	    				Reporter.log("pickedup text is displayed with card status");
	    			}
	    			else
	    			{
	    				obj.Ashot_Screenshot(driver, Functionality, TCName, "pickup_err");
	    				Assert.fail("pickedup text not matched or not displayed");
	    			}
	    		}
	    		else
	    			
	    		{
	    			
	    			if(myaccountpage.getText_txt_Pick_Up_Text().equalsIgnoreCase(notpickeduptext))
	    			{
	    				Reporter.log("not pickedup text is displayed");
	    			}
	    			else
	    			{
	    				//Assert.fail("not pickedup text not matched or not displayed");
	    			}
		    	
	    		}
	 	    }
	    	catch(Exception e5)
	    	{
	    		obj.Ashot_Screenshot(driver, Functionality, TCName,"err_rew");
	    		Assert.fail("Error in rewards status in my account page");
	    	} 	
	    	
	    	if (!contactinfopage.getValue_ddl_Salutation_Field().equals(Readexcel_RowName.getValue("Salutation")))
	    	{
	    		//driver.close();
	    		obj.Ashot_Screenshot(driver, Functionality, TCName,"data_sal");
	    		Assert.fail("Salutation is not pre populating");
	    	}
		    if (!contactinfopage.getValue_txt_Fname_Field().equals(Readexcel_RowName.getValue("FirstName")))
			{
		    	//driver.close();
		    	obj.Ashot_Screenshot(driver, Functionality, TCName,"data_fname");
		    	Assert.fail("First Name is not pre populating");
			}
		    if (!contactinfopage.getValue_txt_Lname_Field().equals(Readexcel_RowName.getValue("LastName")))
			{
		    	//driver.close();
		    	obj.Ashot_Screenshot(driver, Functionality, TCName,"data_lname");
		    	Assert.fail("Last Name is not pre populating");
			}
		    if (!contactinfopage.getValue_txt_Month_Field().equals(Readexcel_RowName.getValue("Month")))
			{
		    	//driver.close();
		    	obj.Ashot_Screenshot(driver, Functionality, TCName,"data_mnth");
		    	Assert.fail("Month is not pre populating");
			}
			if (!contactinfopage.getValue_txt_Date_Field().equals(Readexcel_RowName.getValue("Date")))
			{
				//driver.close();
				obj.Ashot_Screenshot(driver, Functionality, TCName,"data_dat");
				Assert.fail("Date is not pre populating");
			}
			if (!contactinfopage.getValue_txt_Year_Field().equals(Readexcel_RowName.getValue("Year")))
			{
				//driver.close();
				obj.Ashot_Screenshot(driver, Functionality, TCName,"data_yr");
				Assert.fail("Year is pre populating");
			}		
			if (!myaccountpage.getValue_txt_Email_Address_Field().equals(Readexcel_RowName.getValue("EmailAddress")))
			{
			//	driver.close();
				obj.Ashot_Screenshot(driver, Functionality, TCName,"data_email");
				Assert.fail("Email address is not pre populating");
			}
			if (!contactinfopage.getValue_txt_Address_Field().equals(Readexcel_RowName.getValue("Address1")))
			{
				//driver.close();
				obj.Ashot_Screenshot(driver, Functionality, TCName,"data_add");
				Assert.fail("Address is not pre populating");
			}
			if (!(contactinfopage.getValue_txt_Additional_Address_Field().replace("", "null")).equals(String.valueOf(Readexcel_RowName.getValue("Address2"))))
			{
				//driver.close();
				obj.Ashot_Screenshot(driver, Functionality, TCName,"data_add1");
				Assert.fail("Additional address is not pre populating");
			}			
			  String phonenumsheet=Readexcel_RowName.getValue("Primary_Phone");		    
			  phonenumsheet=phonenumsheet.replaceAll("-", "");
			   
			  String phonenumsite=contactinfopage.getValue_txt_Primary_Phone_Number_Field();		  
			  phonenumsite=phonenumsite.replaceAll("-", "");
			if (!phonenumsite.equals(phonenumsheet))
			{
				//driver.close();
				obj.Ashot_Screenshot(driver, Functionality, TCName,"data_ph");
				Assert.fail("Primary phone number is not pre populating");
			}
			
			try
			{
				if(Readexcel_RowName.getValue("Text_Me_Offers(Y/N)").equalsIgnoreCase("Y"))
				{
					if(contactinfopage.isEnabled_click_TextMeOffers_Yes_Button())
					{
						obj.Ashot_Screenshot(driver, Functionality, TCName,"data_txt");
						Assert.fail("Text Me offers section is displayed");	 
					}	   
					else
					{
						Reporter.log("Text Me offers section is not displayed" );
					}
				}
				else if(Readexcel_RowName.getValue("Text_Me_Offers(Y/N)").equalsIgnoreCase("N"))
				{
					if(contactinfopage.isEnabled_click_TextMeOffers_No_Button())
					{
						Reporter.log("Text Me offers section is displayed" );
						if(contactinfopage.isSelected_click_TextMeOffers_No_Button())
						{
							Reporter.log("Text Me offers section is displayed and selected No button" );
						}
						else
						{
							obj.Ashot_Screenshot(driver, Functionality, TCName,"data_txt");
							Assert.fail("Text Me offers section is displayed and selected Yes button" );
						}
					}	   
					else
					{
						obj.Ashot_Screenshot(driver, Functionality, TCName,"data_txt");
						Assert.fail("Text Me offers section is not displayed");
						
					}
				}
			}
			catch(Exception e)
		    {
		    	Reporter.log("Text Me offer section is not displayed since marketing sms is already enrolled");
		    }
			if (!contactinfopage.getValue_txt_City_Field().equals(Readexcel_RowName.getValue("City")))
			{
				//driver.close();
				obj.Ashot_Screenshot(driver, Functionality, TCName,"data_city");
				Assert.fail("City is not pre populating");
			}
			if (!contactinfopage.getValue_ddl_State_Field().equals(Readexcel_RowName.getValue("State_Code")))
			{
				//driver.close();
				obj.Ashot_Screenshot(driver, Functionality, TCName,"data_State");
				Assert.fail("State is not pre populating");
			}
			if (!contactinfopage.getValue_txt_Zipcode_Field().equals(Readexcel_RowName.getValue("Zip")))
			{
				//driver.close();
				obj.Ashot_Screenshot(driver, Functionality, TCName,"data_zip");
				Assert.fail("Zip is not pre populating");
			}
			if(!myaccountpage.getValue_txt_Set_Password1_Field().equalsIgnoreCase(""))
			{
				obj.Ashot_Screenshot(driver, Functionality, TCName,"data_pwd");
				Assert.fail("Password1 is displaying some values");
			}
			if(!myaccountpage.getValue_txt_Set_Password2_Field().equalsIgnoreCase(""))
			{
				obj.Ashot_Screenshot(driver, Functionality, TCName,"data_pwdr");
				Assert.fail("Password2 is displaying some values");
			}
			if(!myaccountpage.getValue_txt_Set_Pin1_Field().equalsIgnoreCase(""))
			{
				obj.Ashot_Screenshot(driver, Functionality, TCName,"data_pin");
				Assert.fail("Pin1 is displaying some values");
			}
			if(!myaccountpage.getValue_txt_Set_Pin2_Field().equalsIgnoreCase(""))
			{
				obj.Ashot_Screenshot(driver, Functionality, TCName,"data_pinr");
				Assert.fail("Pin2 is displaying some values");
			}
			Reporter.log("My account details are verified");
			obj.scrollingToElementofAPage(driver, homepage.click_Logout_button);
			homepage.click_click_Logout_button();
	    }
	    catch(Exception e6)
	    {
	    	//driver.close();
	    	System.out.println(e6);
	    	obj.Ashot_Screenshot(driver, Functionality, TCName,"err_edt");
	    	Assert.fail("Error in Edit Account Details page after enrollment");
			
		}	
		return driver;
	}
}
