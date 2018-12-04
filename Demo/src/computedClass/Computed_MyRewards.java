package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_Homepage;
import generatedClass.POM_Generated_LoggedIn_RewardsPage;
import generatedClass.POM_Generated_LoggedOut_RewardsPage;
import generatedClass.POM_Generated_SoftLoginPage;
import generatedClass.POM_Generated_StaticInfoBar;


public class Computed_MyRewards 
{
	
	public WebDriver Loggedin_Myrewardpage(WebDriver driver,String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_LoggedIn_RewardsPage loginrewardspage = new POM_Generated_LoggedIn_RewardsPage(driver);
		POM_Generated_StaticInfoBar staticInfoBar = new POM_Generated_StaticInfoBar(driver);
		Data obj1 =new Data();
		String global="Global";
		String value="";
		
		new Readexcel_RowName().excelRead("Global_TestData_Sheet",global,Functionality);
    	if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
    	{  	
    		value="winndixie";
        }
    	if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
    	{
    		value="bi-lo";
    	}
    	if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
    	{
    		value="harveyssupermarkets";
    	}
		
		
		obj1.waitForElement(driver, staticInfoBar.click_Static_info_My_Rewards_Text);
		String points=staticInfoBar.getText_click_Static_info_My_Rewards_Text();
		String[] pointsplit = points.split(" ");
		int rewpoint = Integer.parseInt(pointsplit[0].replaceAll(",", ""));
		
		staticInfoBar.click_click_Static_info_My_Rewards_Link();
		obj1.waitForElement(driver, loginrewardspage.txt_Title_Text);
		//String title1=driver.getTitle();
		
		//String s1=loginrewardspage.getText_txt_Title_Text();
		//String Rewardpoints=pointsplit[0]+" Points";
		
		//String s2=loginrewardspage.getText_txt_Points_Text();
		
		String s3=loginrewardspage.getText_click_Time_Text();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		String dat=formatter.format(date);
		//String[] s3split = s3.split(" ");
		System.out.println("Currently updated at" +s3); 
		System.out.println("As of "+dat+" at ");
		
		String s4=loginrewardspage.getText_click_Available_savings_1_Text();
		System.out.println("SEG Savings header:" +s4);
		String s5=loginrewardspage.getText_click_Off_Total_2_Text();
		System.out.println("SEG Savings total:" +s5);
		Float b= ((float)rewpoint/100);
		
		String s6=loginrewardspage.getText_click_All_SE_Grocers_3_Text();
		System.out.println("SEG points expiry info:" +s6);
		String s7=loginrewardspage.getText_click_Available_Savings_Pump_4_Text();
		System.out.println("FRN points expiry info:" +s7);
		String s8=loginrewardspage.getText_click_Off_Per_Gallon_5_Text();
		System.out.println("FRN savings:" +s8);
		Float c=(float)(b/20);
		System.out.println("$"+c+"off per gallon");
		System.out.println("Gold Status text:includes Shell gold status and other fuel rewards");
		
		String s9=loginrewardspage.getText_click_FRN_Rewards_6_Text();
		System.out.println(s9);
		String s10=loginrewardspage.getText_click_Gold_Status_7_Text();
		System.out.println(s10);
		String s11=loginrewardspage.getText_click_Recent_Transactions_8_Text();
		System.out.println("User's recent transactions are listed under:" +s11);
		
		
		String curl=driver.getCurrentUrl();
		obj1.scrollingToElementofAPage(driver, loginrewardspage.txt_Usefullink_FindFuel_Link);
		if(Readexcel_RowName.getValue("Functionality").equalsIgnoreCase("Hardlogin"))
		{
			//*Useful links section:
			if(loginrewardspage.isDisplayed_txt_Usefullink_EditAccount_Link())
			{
				System.out.println("Edit Account Details link is present in the Useful links section");
				loginrewardspage.click_txt_Usefullink_EditAccount_Link();
		        String accurl=driver.getCurrentUrl();
		        String accurl1 = "https://scqa."+value+".com/myaccount";
		        if(accurl.equalsIgnoreCase(accurl1))
				{
					System.out.println("User is navigated successfully to account details page");
				}
		        else
		        {
		        	System.out.println("User is not navigated to account details page");
				}
		        Thread.sleep(500);
		        driver.navigate().to(curl);
			}
			else
			{
				System.out.println("Edit Account Details link is not present in the Useful links section");
			}
		}
		else
		{
			if(loginrewardspage.isDisplayed_txt_Usefullink_EditAccount_Link())
			{
				System.out.println("Edit Account Details link is present in the Useful links section");
				loginrewardspage.click_txt_Usefullink_EditAccount_Link();
			/*	if(shl.isDisplayed_txt_Login_Screen_Title())
				{
					System.out.println("User is prompted to enter Login credentials"); 
				}
				else
				{
					System.out.println("User is not prompted to enter Login credentials");
				}*/
			}
		}
		Thread.sleep(250);
		if(loginrewardspage.isDisplayed_txt_Usefullink_ViewPersonalizedAd_Link())
		{
			System.out.println("View Personalized Ads link is present in the Useful links section");
			loginrewardspage.click_txt_Usefullink_ViewPersonalizedAd_Link();
			Thread.sleep(1000);
			String adurl=driver.getCurrentUrl();
			String adurl1="https://coupons."+value+".com/weeklyad/storelocator/";
			if(adurl.equalsIgnoreCase(adurl1))
			{
				System.out.println("User is navigated successfully to microsite pages");
			}
			else
			{
				System.out.println("User is not navigated to microsite pages");
			}
			Thread.sleep(500);
			driver.navigate().to(curl);
		}
		else
        {
            System.out.println("View Personalized Ads link is not present in the Useful links section");
        }
		Thread.sleep(250);
		if(loginrewardspage.isDisplayed_txt_Usefullink_FAQ_Link())
		{
			System.out.println("Frequently Asked questions link is present in the Useful links section");
			loginrewardspage.click_txt_Usefullink_FAQ_Link();
			Thread.sleep(1000);
			String faqurl=driver.getCurrentUrl();
			String faqurl1="http://www.segrewards.com/FAQs";
			if(faqurl.equalsIgnoreCase(faqurl1))
			{
				System.out.println("User is navigated successfully to FAQ page");
			}
	        else
	        {
	        	System.out.println("User is not navigated to FAQ page");
				
			}
			Thread.sleep(500);
	        driver.navigate().to(curl);
	     }
		else
		{
            System.out.println("Frequently Asked questions link is not present in the Useful links section");
        }
		
		if(loginrewardspage.isDisplayed_txt_Usefullink_FuelRewards_Link())
		{
			System.out.println("Fuel Rewards link is present in the Useful links section");
			loginrewardspage.click_txt_Usefullink_FuelRewards_Link();
			Thread.sleep(1000);
			String frurl=driver.getCurrentUrl();
			String frurl1="https://www.fuelrewards.com/";
			if(frurl.equalsIgnoreCase(frurl1))
			{
				System.out.println("User is navigated successfully to Fuel Rewards page");
			}
			else
			{
				System.out.println("User is not navigated to Fuel Rewards page");
			}
			Thread.sleep(500);
	        driver.navigate().to(curl);
	     }
		else
        {
            System.out.println("Fuel Rewards link is not present in the Useful links section");
        }
		
		if(loginrewardspage.isDisplayed_txt_Usefullink_FindFuel_Link())
		{
			System.out.println("Find Fuel near you link is present in the Useful links section");
			loginrewardspage.click_txt_Usefullink_FindFuel_Link();
			Thread.sleep(1000);
			String locurl=driver.getCurrentUrl();
			String locurl1="https://scqa."+value+".com/locator";	
			if(locurl.equalsIgnoreCase(locurl1))
			{
				System.out.println("User is navigated successfully to Fuel locator page");
			}
	        else
	        {
	        	System.out.println("User is not navigated to Fuel locator page");
			}
			Thread.sleep(500);
	        driver.navigate().to(curl);
		}
		else
        {
            System.out.println("Find Fuel near you link is not present in the Useful links section");
        }
		
		return driver;
	}
	@Test
	public WebDriver loggedout_Myreward(WebDriver driver,String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_LoggedOut_RewardsPage logoutrewardspage = new POM_Generated_LoggedOut_RewardsPage(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_SoftLoginPage softloginpage = new POM_Generated_SoftLoginPage(driver);
		Data obj1 =new Data();
		String global="Global";
		String value="";
		
		new Readexcel_RowName().excelRead("Global_TestData_Sheet",global,Functionality);
    	if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
    	{  	
    		value="winndixie";
    		
        }
    	if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
    	{
    		value="bi-lo";
    	}
    	if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
    	{
    		value="harveyssupermarkets";
    	}
    	String hom= driver.getCurrentUrl();
    	obj1.waitForElement(driver, homepage.click_Rewards_link_Hover);
    	homepage.hover_click_Rewards_link_Hover();
    	homepage.click_click_Rewards_Rewards_Button();
    	logoutrewardspage.click_click_RegisterNow_Button_1();
    	String reg=driver.getCurrentUrl();
    	String reg1="https://scqa."+value+".com/register-now";
    	if(reg1.equalsIgnoreCase(reg))
    	{
    		System.out.println("User is navigated to register now page");
    	}
    	Thread.sleep(100);
    	driver.navigate().to(hom);
    	obj1.waitForElement(driver, homepage.click_Rewards_link_Hover);
    	homepage.hover_click_Rewards_link_Hover();
    	homepage.click_click_Rewards_Rewards_Button();
        Thread.sleep(200);
        
    	//logged out rewards page title
    	String title2=driver.getTitle();
		System.out.println("Logged out rewards page title:"+title2);
		
		//validating logged out rewards page URL
    	String lorurl=driver.getCurrentUrl();
		String lorurl1="https://scqa."+value+".com/rewards-logged-out";
		if(lorurl.equalsIgnoreCase(lorurl1))
		{
			System.out.println("User is navigated to logged out rewards page");
		}
		else
		{
			System.out.println("User is not navigated to logged out rewards page");
		}
		
		//Logged out rewards page header
		String a1=logoutrewardspage.getText_txt_Rewards_Title_Text();
		System.out.println("Logged out rewards page header:" +a1);
		
		//Functionality of Login button in logged out rewards page
		logoutrewardspage.click_click_Rewards_Login_Button();
		if(softloginpage.isDisplayed_click_Pop_Up_Close_Button())
		{
			System.out.println("On clicking Login button,Soft login modal is displayed");
		}
		else
		{
			System.out.println("On clicking Login button,Soft login modal is not displayed");
		}
		Thread.sleep(150);
		softloginpage.click_click_Pop_Up_Close_Button();
		
		//functionality of Register now button
		
		obj1.scrollingToElementofAPage(driver, logoutrewardspage.click_RegisterNow_Button_2);
		logoutrewardspage.click_click_RegisterNow_Button_2();
		String r1="https://scqa."+value+".com/segrewards/account-lookup";
		String r2 = driver.getCurrentUrl();
	    if(r1.equalsIgnoreCase(r2))
	      {
		  System.out.println("On clicking Register Now button, account look up page is displayed");
	      }
	    else
	    {
	    	System.out.println("On clicking Register Now button, account look up page is not displayed");	
	    }
		driver.navigate().to(lorurl);
		Thread.sleep(200);
		String r3=logoutrewardspage.getText_txt_Call_Us_At_Text();
		String r4=logoutrewardspage.getText_txt_Call_Us_At_MobileNum_Text();
		System.out.println("Helpline text:" +r3  +r4);
		
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
