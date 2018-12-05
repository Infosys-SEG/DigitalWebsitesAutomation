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
import generatedClass.POM_Generated_HardLoginPage;
import generatedClass.POM_Generated_Homepage;
import generatedClass.POM_Generated_LoggedIn_RewardsPage;
import generatedClass.POM_Generated_StaticInfoBar;

public class Computed_Static_Info_bar 
{	
	public WebDriver LoginStaticinfobar_WeeklyAd(WebDriver driver,String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_StaticInfoBar staticinfobar = new POM_Generated_StaticInfoBar(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		Data obj=new Data();
		String Global="Global";
		
		String urlwd="https://winndixie.pdn.retaileriq.com/weeklyad/storelocator/";
		String urlhy="https://harveyssupermarkets.pdn.retaileriq.com/weeklyad/storelocator/?location=greasemonkey";
		String urlbi="https://bi-lo.pdn.retaileriq.com/weeklyad/storelocator/";
		String weeklyadurl="";
		String value="";
		WebElement logo=null;
		new Readexcel_RowName().excelRead("Global_TestData_Sheet",Global,Functionality);
		
		if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
		{
			weeklyadurl=urlwd;
			value="winndixie";
			logo=homepage.click_Winndixie_logo;
		}
		else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
		{
			weeklyadurl=urlbi;
			value="bi-lo";
			logo=homepage.click_Bilo_logo;
		}
		else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
		{
			weeklyadurl=urlhy;
			value="harveyssupermarkets";
			logo=homepage.click_Harveys_logo;
		}
		String wa_orP="https://"+value+".pdn.retaileriq.com/weeklyad/ - Google Chrome";
	    String ie="Windows Security";
	    String bro="";
		if(Readexcel_RowName.getValue("Chrome(Y/N)").equalsIgnoreCase("Y"))
		{
			bro= wa_orP;
		}	
		else if(Readexcel_RowName.getValue("IE(Y/N)").equalsIgnoreCase("Y"))
		{
			bro=ie;
		}
		String Val = obj.popuppath()+" "+bro;
		try
		{
			obj.waitForElementClickable(driver,staticinfobar.click_Static_info_WeeklyAds_link);
			if(staticinfobar.isDisplayed_click_Static_info_WeeklyAds_link())
			{
				if(staticinfobar.isDisplayed_click_Static_info_WeeklyAds_Text())
				{  	
					Runtime.getRuntime().exec(Val);
					
					staticinfobar.click_click_Static_info_WeeklyAds_link();					
				}
				else
				{
					Assert.fail("Weekly ad text is not displaying");
				}
				obj.waitForElementClickable(driver, staticinfobar.click_Home_Link);
				
				if(weeklyadurl.equals(driver.getCurrentUrl()))
				{
					logo.click();
				}
				else
				{
					Assert.fail("WeeklyAd page url is wrong");
				}	
			}
			else
			{
				Assert.fail("Weekly ad link is not displaying");
			}
		}
		catch(Exception e)
		{
			Assert.fail("Error in weekly ad link");
		}
		return driver;
	}	
	
	public WebDriver LoginStaticinfobar_Rewards(WebDriver driver,String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_StaticInfoBar staticinfobar = new POM_Generated_StaticInfoBar(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_LoggedIn_RewardsPage loginrewardspage = new POM_Generated_LoggedIn_RewardsPage(driver);
		
		Data obj=new Data();
		String Global="Global";
	
	    
		String pts="";
		WebElement logo=null;
		String[] pointsplit;
		
		new Readexcel_RowName().excelRead("Global_TestData_Sheet",Global,Functionality);
		
		if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
		{
			logo=homepage.click_Winndixie_logo;
		}
		else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
		{
			logo=homepage.click_Bilo_logo;
		}
		else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
		{
			logo=homepage.click_Harveys_logo;
		}
	 
		try 
		{
			obj.waitForElementClickable(driver, logo);
			logo.click();
			obj.waitForElementClickable(driver, staticinfobar.click_Static_info_My_Rewards_Link);
			if(staticinfobar.isDisplayed_click_Static_info_My_Rewards_Link())
			{
				if(staticinfobar.isDisplayed_click_Static_info_My_Rewards_Text())
				{
					pts=staticinfobar.getText_click_Static_info_My_Rewards_Text();		
				}
				else
				{
					Assert.fail("My Rewards text is not displaying");
				}
				staticinfobar.click_click_Static_info_My_Rewards_Link();
				obj.waitForElement(driver, loginrewardspage.txt_Points_Text);
				pointsplit = pts.split(" ");
				String verifypts=loginrewardspage.getText_txt_Points_Text();
				String[] pointsplit2 = verifypts.split(" ");
				if(pointsplit[0].equals(pointsplit2[0]))
				{
					  Reporter.log("Reward points are equal :"+pointsplit[0]);
				}
				else
				{
					Assert.fail("Different points");
				}
				logo.click();			
			}
			else
			{
				Assert.fail("My Rewards link is not displaying");
			}	
		}
		catch(Exception e)
		{
			Assert.fail("Error in rewards link");
		}
	return driver;
	}
	
	
	public WebDriver LoginStaticinfobar_MyAccount(WebDriver driver,String Functionality,String MyAccfunc) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_StaticInfoBar staticinfobar= new POM_Generated_StaticInfoBar(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_HardLoginPage hardloginpage = new POM_Generated_HardLoginPage(driver);
		Data obj=new Data();
		String Global="Global";
		
	    
		WebElement logo=null;
		
		new Readexcel_RowName().excelRead("Global_TestData_Sheet",Global,Functionality);
		
		if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
		{
			logo=homepage.click_Winndixie_logo;
		}
		else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
		{
			logo=homepage.click_Bilo_logo;
		}
		else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
		{
			logo=homepage.click_Harveys_logo;
		}
		try
		{
			obj.waitForElementClickable(driver, logo);
			logo.click();
			obj.waitForElementClickable(driver, staticinfobar.click_Static_info_My_Account_Link);
			if(staticinfobar.isDisplayed_click_Static_info_My_Account_Link())
			{
				if(!staticinfobar.isDisplayed_click_Static_info_My_Account_Text())
				{
					Assert.fail("My Account text is not displaying");
				}
				staticinfobar.click_click_Static_info_My_Account_Link();
				obj.waitForElement(driver, hardloginpage.click_Popup_Close_Button);
				if(MyAccfunc.equalsIgnoreCase("SoftLogin"))
				{
					if(hardloginpage.isDisplayed_click_Popup_Close_Button())
					{
						hardloginpage.click_click_Popup_Close_Button();
						Reporter.log("Hard login window is displayed by clicking on My Account");
					}
					else
					{
						Assert.fail("Hard Login popup is not displaying");
					}
				}
			}
			else
			{
				Assert.fail("My Account link is not displaying");
			}	
		}
		catch(Exception e)
		{
			Assert.fail("Error in MyAccount link");
		}
		
		return driver;
	}
}
