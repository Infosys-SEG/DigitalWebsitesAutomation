package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_HardLoginPage;
import generatedClass.POM_Generated_Homepage;
import generatedClass.POM_Generated_PersonalizedOffersPage;
import generatedClass.POM_Generated_ShoppingListPage;
import generatedClass.POM_Generated_WeeklyAdPage;

public class Computed_Personalisedoffers 
{
	public WebDriver Loggedin_Personalisedoffers(WebDriver driver, String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_WeeklyAdPage weeklyadpage = new POM_Generated_WeeklyAdPage(driver);
		POM_Generated_ShoppingListPage shoppingListPage = new POM_Generated_ShoppingListPage(driver);
		POM_Generated_PersonalizedOffersPage personalizedofferspage = new POM_Generated_PersonalizedOffersPage(driver);
		Data obj=new Data();
		WebElement logo = null;
		String url="";
		String storezip="";
		String value="";
	    try
	    {
	    	new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global",Functionality);
	    	
	    	if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
	    	{  	
	    		storezip="32254";
		    	value="winndixie";
		    	url="https://winndixie.pdn.retaileriq.com/weeklyad/storelocator/";
	    		logo=homepage.click_Winndixie_logo;
	    	}
	    	if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
	    	{
	    		storezip="32256";
		    	value="bi-lo";
		    	url="https://bi-lo.pdn.retaileriq.com/weeklyad/storelocator/";
	    		logo=homepage.click_Bilo_logo;
	    	}
	    	if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
	    	{
	    		storezip="32256";
				value="harveyssupermarkets";
				url="https://harveyssupermarkets.pdn.retaileriq.com/weeklyad/storelocator/";
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
			Thread.sleep(2000);

			Actions actions = new Actions(driver);
			actions.moveToElement(logo).click().perform();
			logo.click();
			
			obj.waitForElementClickable(driver, logo);	    	
			Runtime.getRuntime().exec(Val);
			obj.scrollingToElementofAPage(driver, homepage.click_PersonalizedAd_Logo);
			homepage.click_click_PersonalizedAd_Logo();
			obj.waitForElement(driver, shoppingListPage.txt_List_Count_Text);
			if(driver.getCurrentUrl().equalsIgnoreCase(url))
			{
				obj.waitForElementClickable(driver, weeklyadpage.txt_Select_Store_Field);
				weeklyadpage.type_txt_Select_Store_Field(storezip);
				weeklyadpage.click_click_Store_Search_Button();
				obj.waitForElementClickable(driver, weeklyadpage.click_Store_View_weeklyAds_Button);
				weeklyadpage.click_click_Store_View_weeklyAds_Button();
				obj.waitForElement(driver, weeklyadpage.txt_Your_WeeklyAd_Text);
			}	
			obj.waitForElement(driver, weeklyadpage.txt_Your_WeeklyAd_Text);
			if(weeklyadpage.isDisplayed_txt_Your_WeeklyAd_Text())
			{
				
				obj.movetoElementofAPage(driver, personalizedofferspage.click_View_Deals_Link);
				personalizedofferspage.click_click_View_Deals_Link();
			}
			else
			{
				Assert.fail("Error in Your WeeklyAd text");
			
			}
		}
	    catch(Exception e)
	    {
	    	Assert.fail("Error in personalised offers page");
		}	
	    return driver; 	
	}
	
	
	public WebDriver Loggedout_Personalisedoffers(WebDriver driver, String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_WeeklyAdPage weeklyadpage = new POM_Generated_WeeklyAdPage(driver);
		POM_Generated_ShoppingListPage shoppinglistpage = new POM_Generated_ShoppingListPage(driver);
		POM_Generated_PersonalizedOffersPage personalizedOffersPage = new POM_Generated_PersonalizedOffersPage(driver);
		POM_Generated_HardLoginPage hardloginpage = new POM_Generated_HardLoginPage(driver);
		Data obj=new Data();
		WebElement logo = null;
		String url="";
		String storezip="";
		String value="";
		
	    try
	    {
	    	new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global",Functionality);
	    	
	    	if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
	    	{  	
	    		storezip="32254";
		    	value="winndixie";
		    	url="https://winndixie.pdn.retaileriq.com/weeklyad/storelocator/";
	    		logo=homepage.click_Winndixie_logo;
	    	}
	    	if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
	    	{
	    		storezip="32256";
		    	value="bi-lo";
		    	url="https://bi-lo.pdn.retaileriq.com/weeklyad/storelocator/";
	    		logo=homepage.click_Bilo_logo;
	    	}
	    	if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
	    	{
	    		storezip="32256";
				value="harveyssupermarkets";
				url="https://harveyssupermarkets.pdn.retaileriq.com/weeklyad/storelocator/";
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
			Thread.sleep(1000);

			Actions actions = new Actions(driver);
			actions.moveToElement(logo).click().perform();
			logo.click();
			
			obj.waitForElementClickable(driver, logo);	    	
			Runtime.getRuntime().exec(Val);
			obj.scrollingToElementofAPage(driver, homepage.click_PersonalizedAd_Logo);
			homepage.click_click_PersonalizedAd_Logo();
			obj.waitForElement(driver, shoppinglistpage.txt_List_Count_Text);
			if(driver.getCurrentUrl().equalsIgnoreCase(url))
			{
				obj.waitForElementClickable(driver, weeklyadpage.txt_Select_Store_Field);
				weeklyadpage.type_txt_Select_Store_Field(storezip);
				weeklyadpage.click_click_Store_Search_Button();
				obj.waitForElementClickable(driver, weeklyadpage.click_Store_View_weeklyAds_Button);
				weeklyadpage.click_click_Store_View_weeklyAds_Button();
				obj.waitForElement(driver, weeklyadpage.txt_Your_WeeklyAd_Text);
			}	
			obj.waitForElement(driver, weeklyadpage.txt_Your_WeeklyAd_Text);
			if(weeklyadpage.isDisplayed_txt_Your_WeeklyAd_Text())
			{
				obj.scrollingToElementofAPage(driver, personalizedOffersPage.click_Login_Button);
				personalizedOffersPage.click_click_Login_Button();
				obj.scrollingToElementofAPage(driver, logo);
				homepage.click_click_HardLogin_button();
				obj.waitForElementClickable(driver, hardloginpage.txt_Email_Id_Field);
				hardloginpage.click_click_Popup_Close_Button();
			}
			else
			{
				Assert.fail("Error in Your WeeklyAd text");
			
			}
		}
	    catch(Exception e)
	    {
	    	Assert.fail("Error in Weekly Ad page");
		}	
	    return driver; 	
	}
}
