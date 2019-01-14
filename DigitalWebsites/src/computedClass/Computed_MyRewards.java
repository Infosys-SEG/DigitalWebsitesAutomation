package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_HardLoginPage;
import generatedClass.POM_Generated_Homepage;
import generatedClass.POM_Generated_LoggedIn_RewardsPage;
import generatedClass.POM_Generated_LoggedOut_RewardsPage;
import generatedClass.POM_Generated_SoftLoginPage;
import generatedClass.POM_Generated_StaticInfoBar;


public class Computed_MyRewards 
{
	Data obj1 =new Data();
	String global="Global";
	String value="";
	WebElement logo = null;
	
	public WebDriver Myrewards_general(WebDriver driver,String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
	  POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
	  new Readexcel_RowName().excelRead("Global_TestData_Sheet",global,Functionality);
 	  if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
 	  {  	
 		value="winndixie";
 		logo=homepage.click_Winndixie_logo;
      }
 	  if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
 	  {
 		 value="bi-lo";
 		logo = homepage.click_Bilo_logo;
 	  }
 	  if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
 	  {
 		value="harveyssupermarkets";
 		logo = homepage.click_Harveys_logo;
 	   }
 	   return driver;
 	   
     }		
	
	public WebDriver Loggedin_Myrewardpage(WebDriver driver,String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_LoggedIn_RewardsPage loginrewardspage = new POM_Generated_LoggedIn_RewardsPage(driver);
		POM_Generated_StaticInfoBar staticInfoBar = new POM_Generated_StaticInfoBar(driver);
		new Readexcel_RowName().excelRead("Global_TestData_Sheet",global,Functionality);
		try
		{
			  obj1.waitForElement(driver, logo);
			  logo.click();
		      obj1.waitForElement(driver, staticInfoBar.click_Static_info_My_Rewards_Text);
			
			//points in Static info bar
		      String points1=staticInfoBar.getText_click_Static_info_My_Rewards_Text();
		      String[] pointsplit1 = points1.split(" ");
		      String Rewardpoints1=pointsplit1[0];
		      Reporter.log("Points displayed in the static info bar:" +Rewardpoints1);
			
			  staticInfoBar.click_click_Static_info_My_Rewards_Link();
			
			//points in Rewards page
			  obj1.waitForElement(driver, loginrewardspage.txt_Title_Text);
			  String header = loginrewardspage.getText_txt_Title_Text();
			  Reporter.log("User is in logged in rewards page with header:" +header);
			
			  String points=loginrewardspage.getText_txt_Points_Text();
			  String[] pointsplit = points.split(" ");
		      String Rewardpoints=pointsplit[0];
		      int rewpoint = Integer.parseInt(pointsplit[0].replaceAll(",", ""));
		      Float b= ((float)rewpoint/100);
		      Reporter.log("Points displayed in the Rewards page: " +Rewardpoints);
		      if(Rewardpoints1.equals(Rewardpoints))
		      {
		    	  Reporter.log("Same points are displayed for the user in Static info bar & in Rewards page");
		      }
			
			 String s3=loginrewardspage.getText_click_Time_Text();
			 Reporter.log("Points updated at date & time info: " +s3); 
			 String[] s3split = s3.split(" ");
			 String date1 = s3split[2];
			// Reporter.log(date1);
			 
			 SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			 Date date = new Date();
			 String dat=formatter.format(date);
			 //Reporter.log(dat);
			 if(date1.equals(dat))
			 {
				 Reporter.log("Points info is as per todays date");
			 }
			
			String s4=loginrewardspage.getText_click_Available_savings_1_Text();
			Reporter.log("SEG Savings header:" +s4);
			String s5=loginrewardspage.getText_click_Off_Total_2_Text();
			Reporter.log("SEG Savings total:" +s5);
			//Float b= ((float)rewpoint/100);
			
			String s6=loginrewardspage.getText_click_All_SE_Grocers_3_Text();
			Reporter.log("SEG points expiry info:" +s6);
			String s7=loginrewardspage.getText_click_Available_Savings_Pump_4_Text();
			Reporter.log("FRN Savings header:" +s7);
			String s8=loginrewardspage.getText_click_Off_Per_Gallon_5_Text();
			Reporter.log("FRN savings:" +s8);
			//Float c=(float)(b/20);
			//Reporter.log("$"+c+"off per gallon");
			String s9=loginrewardspage.getText_click_FRN_Rewards_6_Text();
			Reporter.log(s9);
			
	        if(loginrewardspage.isDisplayed_txt_MyRewards_GoldStatus())
	        {
	        	Reporter.log("Gold status is displayed for the user");
	        	String s10=loginrewardspage.getText_click_Gold_Status_7_Text();
				Reporter.log("Gold Status text:" +s10);
	        }
	        else
	        {
	        Assert.fail("Gold status is not displayed for the user");
	        }
	        
			if(loginrewardspage.isDisplayed_click_Recent_Transactions_8_Text())
			{
			String s11=loginrewardspage.getText_click_Recent_Transactions_8_Text();
			Reporter.log("User's recent transactions are listed under:" +s11);
			}
		    
			if(loginrewardspage.isDisplayed_txt_MyRewards_UsefulLinks())
			{
				Reporter.log("Useful links section is displayed in Rewards page");	
			}
			else
			{
				Assert.fail("Useful links section is not displayed in Rewards page");
			}
		
		}
		catch(Exception e)
		{
			Assert.fail("Error in logged in rewards screen");
		}
		return driver;
	}
	
	public WebDriver Loggedin_Myrewardpage_editacc(WebDriver driver,String Functionality,String TCName,String login) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_LoggedIn_RewardsPage loginrewardspage = new POM_Generated_LoggedIn_RewardsPage(driver);
		POM_Generated_StaticInfoBar staticInfoBar = new POM_Generated_StaticInfoBar(driver);
		new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
		String curl=driver.getCurrentUrl();
		try 
		{
		if(login.equalsIgnoreCase("hardlogin")) 
		{
		    staticInfoBar.click_click_Static_info_My_Rewards_Link();
			String namev= loginrewardspage.getText_txt_MyRewards_Name_Verify();
		    if(!namev.equals("Hello "+Readexcel_RowName.getValue("FirstName")+"!"))
		    {
		    	
		    	Assert.fail("Incorrect rewards page");
		    } 
		    else 
		    {
		    	Reporter.log("Appropriate user name is displayed in Rewards page as"  + namev);
		    }
			if(loginrewardspage.isDisplayed_click_MyRewards_Edit_Acc_Det_Link())
			{
				Reporter.log("Edit account link is displayed in Rewards page");
				loginrewardspage.click_click_MyRewards_Edit_Acc_Det_Link();
				String accurl=driver.getCurrentUrl();
			    String accurl1 = "https://scqa."+value+".com/myaccount";
		                         
		        if(accurl.equalsIgnoreCase(accurl1))
				{
		        	Reporter.log("User is navigated successfully to account details page on clicking Edit account link");
				}
		        else
		        {
		        	Assert.fail("User is not navigated to account details page");
				}
		       
		        driver.navigate().to(curl);
			}
			else
			{
				Assert.fail("Edit Account Details link is not present in the Useful links section");
			}
		}
		else
		{
		    String namev= loginrewardspage.getText_txt_MyRewards_Name_Verify();
		    if(!namev.equals("Hello "+Readexcel_RowName.getValue("FirstName")+"!"))
		    {
		    	
		    	Assert.fail("Incorrect rewards page");
		    } 
			if(loginrewardspage.isDisplayed_txt_Usefullink_EditAccount_Link())
			{
				Reporter.log("Edit Account Details link is present in the Useful links section");
				loginrewardspage.click_txt_Usefullink_EditAccount_Link();
			    if(loginrewardspage.isDisplayed_txt_SoftLogin_overlay())
				{
			    	Reporter.log("User is prompted to enter Login credentials on clicking edit account link"); 
				}
				else
				{
					Reporter.log("User is not prompted to enter Login credentials");
				}
			
			}
		}
		}
		catch(Exception e)
			{
				Assert.fail("Error in edit account section in Rewards page");
			}
		
		return driver;
	}
		
	public WebDriver Loggedin_Myrewardpage_usefulinks(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
		POM_Generated_LoggedIn_RewardsPage loginrewards = new POM_Generated_LoggedIn_RewardsPage(driver);
		POM_Generated_StaticInfoBar staticInfoBar = new POM_Generated_StaticInfoBar(driver);
		POM_Generated_HardLoginPage hardlogin = new POM_Generated_HardLoginPage(driver);
		try
		{
			
			if(TCName.equalsIgnoreCase("TC005_Validate_the_functionality_of_Useful_Links_section_for_Hard_Login_user"))
			{    
				staticInfoBar.click_click_Static_info_My_Rewards_Link();
				obj1.waitForElement(driver, loginrewards.txt_Title_Text);
				String curl=driver.getCurrentUrl();
			    obj1.scrollingToElementofAPage(driver, loginrewards.txt_Usefullink_FindFuel_Link);
				//*Useful links section:
				if(loginrewards.isDisplayed_txt_Usefullink_EditAccount_Link())
				{
					Reporter.log("Edit Account Details link is present in the Useful links section");
					loginrewards.click_txt_Usefullink_EditAccount_Link();
			        String accurl=driver.getCurrentUrl();
			      
			        String accurl1 = "https://scqa."+value+".com/myaccount";
			                         
			        if(accurl.equalsIgnoreCase(accurl1))
					{
			        	Reporter.log("User is navigated successfully to account details page on clicking Edit account link");
					}
			        else
			        {
			        	Assert.fail("User is not navigated to account details page");
					}
			       
			        driver.navigate().to(curl);
				}
				else
				{
					Assert.fail("Edit Account Details link is not present in the Useful links section");
				}
			}
			else
			{
				//String curl=driver.getCurrentUrl();
			    obj1.scrollingToElementofAPage(driver, loginrewards.txt_Usefullink_FindFuel_Link);
				if(loginrewards.isDisplayed_txt_Usefullink_EditAccount_Link())
				{
					Reporter.log("Edit Account Details link is present in the Useful links section");
					loginrewards.click_txt_Usefullink_EditAccount_Link();
				    if(loginrewards.isDisplayed_txt_SoftLogin_overlay())
					{
				    	Reporter.log("User is prompted to enter Hard Login credentials"); 
					}
					else
					{
						Reporter.log("User is not prompted to enter Hard Login credentials");
					}
				    hardlogin.click_click_Popup_Close_Button();
				}
			}
			
			if(loginrewards.isDisplayed_txt_Usefullink_ViewPersonalizedAd_Link())
			{  
				String curl=driver.getCurrentUrl();
				Reporter.log("View Personalized Ads link is present in the Useful links section");
				loginrewards.click_txt_Usefullink_ViewPersonalizedAd_Link();
			
				String adurl=driver.getCurrentUrl();
				String adurl1="https://coupons."+value+".com/weeklyad/storelocator/";
				if(adurl.equalsIgnoreCase(adurl1))
				{
					Reporter.log("User is navigated successfully to microsite pages on clicking View Personalized ad link");
				}
				else
				{
					Assert.fail("User is not navigated to microsite pages");
				}
			
				driver.navigate().to(curl);
			}
			else
	        {
				Assert.fail("View Personalized Ads link is not present in the Useful links section");
	        }
			Thread.sleep(250);
			if(loginrewards.isDisplayed_txt_Usefullink_FAQ_Link())
			{
				String curl=driver.getCurrentUrl();
				Reporter.log("Frequently Asked questions link is present in the Useful links section");
				loginrewards.click_txt_Usefullink_FAQ_Link();
			
				String faqurl=driver.getCurrentUrl();
				String faqurl1="http://www.segrewards.com/FAQs";
				if(faqurl.equalsIgnoreCase(faqurl1))
				{
					Reporter.log("User is navigated successfully to FAQ page on clicking FAQ link");
				}
		        else
		        {
		        	Assert.fail("User is not navigated to FAQ page");
					
				}
			
		        driver.navigate().to(curl);
		     }
			else
			{
				Assert.fail("Frequently Asked questions link is not present in the Useful links section");
	        }
			String curl=driver.getCurrentUrl();
			if(!(value.equals("winndixie")))
			{
				
				if(loginrewards.isDisplayed_txt_Usefullink_FuelRewards_Link_bl())
				{
					Reporter.log("Fuel Rewards link is present in the Useful links section");
					loginrewards.click_txt_Usefullink_FuelRewards_Link_bl();
				}
				else
				{
					Assert.fail("Fuel Rewards link is not present in useful links section");
				}
			}
			else
			
			  {  
				
			    if(loginrewards.isDisplayed_txt_Usefullink_FuelRewards_Link())
				{   
			    	
					Reporter.log("Fuel Rewards link is present in the Useful links section");
					loginrewards.click_txt_Usefullink_FuelRewards_Link();
				}
			    else
				{
					Assert.fail("Fuel Rewards link is not present in useful links section");
				}
			  }
			
				String frurl=driver.getCurrentUrl();
				String frurl1="https://www.fuelrewards.com/";
				if(frurl.equalsIgnoreCase(frurl1))
				{
					Reporter.log("User is navigated successfully to Fuel Rewards page on clicking Fuel Rewards link");
				}
				else
				{
					Assert.fail("User is not navigated to Fuel Rewards page");
				}
				
		        driver.navigate().to(curl);
		     
			
			
			if(loginrewards.isDisplayed_txt_Usefullink_FindFuel_Link())
			{
				Reporter.log("Find Fuel near you link is present in the Useful links section");
				loginrewards.click_txt_Usefullink_FindFuel_Link();
				
				String locurl=driver.getCurrentUrl();
				String locurl1="https://scqa."+value+".com/locator";	
				if(locurl.equalsIgnoreCase(locurl1))
				{
					Reporter.log("User is navigated successfully to Fuel locator page on clicking Find Fuel near you link");
				}
		        else
		        {
		        	Assert.fail("User is not navigated to Fuel locator page");
				}
				
		        driver.navigate().to(curl);
			}
			else
	        {
				Assert.fail("Find Fuel near you link is not present in the Useful links section");
	        }
		}
		catch(Exception e)
		{
			Assert.fail("Error in useful links section");
		}
			return driver;
	}
		
		
	
	public WebDriver loggedout_Myreward(WebDriver driver,String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_LoggedOut_RewardsPage logoutrewardspage = new POM_Generated_LoggedOut_RewardsPage(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_SoftLoginPage softloginpage = new POM_Generated_SoftLoginPage(driver);
		
		
    	try
    	{
    	obj1.scrollingToElementofAPage(driver, logo);
    	logo.click();
    	obj1.waitForElement(driver, homepage.click_Rewards_link_Hover);
    	homepage.hover_click_Rewards_link_Hover();
    	homepage.click_click_Rewards_Rewards_Button();
        obj1.waitForElement(driver, logoutrewardspage.click_Rewards_Login_Button);
        String lorurl = driver.getCurrentUrl();
        String title= logoutrewardspage.getText_txt_Rewards_Title_Text();
		Reporter.log("Logged out rewards page header: "+title);
		
		//Functionality of Login button in logged out rewards page
		logoutrewardspage.click_click_Rewards_Login_Button();
		if(softloginpage.isDisplayed_click_Pop_Up_Close_Button())
		{
			Reporter.log("On clicking Login button,Soft login modal is displayed");
		}
		else
		{
			Assert.fail("On clicking Login button,Soft login modal is not displayed");
		}
		
		softloginpage.click_click_Pop_Up_Close_Button();
		if(logoutrewardspage.isDisplayed_click_RegisterNow_Button_1())
		{
			Reporter.log("Register now button is displayed at the top of the logged out rewards page");
		}
		
		//functionality of Register now button
		//homepage.click_click_Close_cookies_Button();
		obj1.scrollingToElementofAPage(driver, logoutrewardspage.click_RegisterNow_Button_2);
		Reporter.log("Register now button is displayed at the bottom of the logged out rewards page");
		logoutrewardspage.click_click_RegisterNow_Button_2();
		String r1="https://scqa."+value+".com/segrewards/account-lookup";
		String r2 = driver.getCurrentUrl();
	    if(r1.equalsIgnoreCase(r2))
	      {
		  Reporter.log("On clicking Register Now button, account look up page is displayed");
	      }
	    else
	    {
	    	Assert.fail("On clicking Register Now button, account look up page is not displayed");	
	    }
		driver.navigate().to(lorurl);
	 
		String help1 = logoutrewardspage.getText_txt_Call_Us_At_Text();
		String help2=logoutrewardspage.getText_txt_Call_Us_At_MobileNum_Text();
		Reporter.log("Helpline text:"+ help1 + help2);
	
	  }
	catch(Exception e)
	{
		Assert.fail("error in logged out rewards page");
	}
	
	return driver;	
 }
	
	
	/*public WebDriver Myrewardfooterlink(WebDriver driver,String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_MyRewards mrf=new POM_Generated_MyRewards(driver);
		Data obj1 =new Data();
		String trm1="http://www.segrewards.com/terms";
		
    	String hom= driver.getCurrentUrl();
    	obj1.waitForElement(driver, mrf.click_Home_screen_menu_Rewards);
    	obj1.scrollingToElementofAPage(driver, mrf.click_Home_screen_footer_Rewards_TC);
    	mrf.click_click_Home_screen_footer_Rewards_TC();
    	String trm=driver.getCurrentUrl();
    	
    	if(trm.equalsIgnoreCase(trm1))
    	{
    		Assert.fail("user is navigated to terms and conditions page");
    	}
    	driver.navigate().to(hom);
		return driver;
	}*/
}
