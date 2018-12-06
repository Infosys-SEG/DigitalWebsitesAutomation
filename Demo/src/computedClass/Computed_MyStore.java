package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_Homepage;
import generatedClass.POM_Generated_StaticInfoBar;
import generatedClass.POM_Generated_StoreLocatorPage;

public class Computed_MyStore 
{
	public WebDriver SetStore(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_StoreLocatorPage storelocatorpage = new POM_Generated_StoreLocatorPage(driver);
		POM_Generated_StaticInfoBar staticInfoBar = new POM_Generated_StaticInfoBar(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		Data obj=new Data();
		String Global="Global";
		WebElement logo =null;
		
	    new Readexcel_RowName().excelRead("Global_TestData_Sheet",Global,Functionality);
	    
	    if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
		{
			logo=homepage.click_Winndixie_logo;
		}
		if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
		{
			logo=homepage.click_Bilo_logo;
		}
		if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
		{
			logo=homepage.click_Harveys_logo;
		}		
		
		try
		{	
			obj.waitForElementClickable(driver, logo);
			logo.click();
			obj.waitForElementClickable(driver, staticInfoBar.click_Static_info_My_Account_Link);
			if(staticInfoBar.isDisplayed_click_Static_info_MyStore_Link())
			{	
				if(staticInfoBar.isDisplayed_click_Static_info_MyStore_Address_Text())
				{	
					
				}
				else
				{
					Assert.fail("Mystore address text is not displaying");
				}
				staticInfoBar.click_click_Static_info_MyStore_Change_Link();
			}
			else if(staticInfoBar.isDisplayed_click_Static_info_Set_Store_Link())
			{	
				if(staticInfoBar.isDisplayed_click_Static_info_Set_Store_Text())
				{	
				}
				else
				{
					Assert.fail("Please set the store text is not displaying");
				}
				staticInfoBar.click_click_Static_info_Set_Store_Link();
			}
			else if(staticInfoBar.isDisplayed_click_Static_info_MyStore_Nearest_store_link())
			{	
				staticInfoBar.click_click_Static_info_MyStore_Nearest_store_link();
			}
		}
		
		catch (NoSuchElementException e1)
		{
			Assert.fail("Store links are not displayed");
			
		}
		try
		{
			obj.waitForElementClickable(driver, storelocatorpage.click_Home_Button);
			
			
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
			obj.waitForElementClickable(driver, storelocatorpage.click_Storelocation_Button);	
			if(Readexcel_RowName.getValue("Change_Zipcode")!=null)
			{
				storelocatorpage.click_click_Storelocation_Button();
				obj.waitForElementClickable(driver, storelocatorpage.click_Storelocation_Button);
				obj.scrollingToElementofAPage(driver, storelocatorpage.ddl_Radius_Dropdown);
				String rad=storelocatorpage.getValue_ddl_Radius_Dropdown();
				if(!rad.equals("10 miles"))
				{
					Assert.fail("Default radius is not 10");
				}
				storelocatorpage.type_txt_Enter_Zip_Or_City_Field(Readexcel_RowName.getValue("Change_Zipcode"));
				storelocatorpage.click_click_Search_Button();
				obj.waitForElementClickable(driver, storelocatorpage.click_Storelocation_Button);
				obj.scrollingToElementofAPage(driver, storelocatorpage.click_Make_My_store_Button);
				try 
				{
					storelocatorpage.click_click_Make_My_store_Button();
					obj.waitForElementClickable(driver, storelocatorpage.click_Storelocation_Button);
					obj.scrollingToElementofAPage(driver, storelocatorpage.click_View_Store_Details_Button);
					storelocatorpage.click_click_View_Store_Details_Button();
					obj.waitForElementClickable(driver, storelocatorpage.click_Home_Button);
					String sdetails=storelocatorpage.getText_txt_StreetAddr_Text();
					storelocatorpage.click_click_Home_Button();
					obj.waitForElement(driver, storelocatorpage.txt_StreetAddr_Text);
					String addr=storelocatorpage.getText_txt_StreetAddr_Text();
					if(!sdetails.equals(addr))
					{
						Assert.fail("Store address not changed");
					}
				}
				catch(NoSuchElementException e) 
				{
					try
					{
						if(	storelocatorpage.isDisplayed_click_Invalid_Store_Error_Text())
						{
							Assert.fail("No stores found");
							storelocatorpage.click_click_Home_Button();
						}
						else	
						{
							Assert.fail("No stores found error message is not displaying");
							storelocatorpage.click_click_Home_Button();
						}
					}
					catch (NoSuchElementException e1)
					{
						Assert.fail("No stores found error message is not displaying");
						storelocatorpage.click_click_Home_Button();
					}
				}		
			}
			else
			{
				storelocatorpage.click_click_Home_Button();
			}
		}
		catch(Exception e)
		{
			Assert.fail("Error in my store page");
		}
		
		
		return driver;
	}
}
