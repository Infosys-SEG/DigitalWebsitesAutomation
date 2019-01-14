package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_Homepage;
import generatedClass.POM_Generated_StoreLocatorPage;

public class Computed_FuelPerk 
{
	public WebDriver FuelPerk_Zipcode(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_StoreLocatorPage storelocatorpage = new POM_Generated_StoreLocatorPage(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		Data obj=new Data();
		String zip="";
		String value="";
		
		new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global",Functionality);
	    if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
	    {
	    	value="winndixie";
	    	 		
	    }
	    else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
	    {
	    	value="bi-lo";
	    	
	    }
	    else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
	    {
	    	value="harveyssupermarkets";
	    	
	    }
	    
	    if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
	    {
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
	    	zip=Readexcel_RowName.getValue("WD_ZIP");
	    	System.out.println(zip);
	    	 		
	    }
	    else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
	    {
	    	new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
	    	zip=Readexcel_RowName.getValue("BL_ZIP");
	    	
	    }
	    else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
	    {
	    	new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
	    	zip=Readexcel_RowName.getValue("HY_ZIP");
	    	
	    } 
		try
		{
			obj.waitForElement(driver, homepage.click_Global_StoreLocator_Button);
			homepage.click_click_Global_StoreLocator_Button();
			obj.scrollingToElementofAPage(driver, storelocatorpage.txt_Enter_Zip_Or_City_Field);
			obj.waitForElement(driver, storelocatorpage.click_Fuellocation_Button);
			storelocatorpage.click_click_Fuellocation_Button();
			obj.scrollingToElementofAPage(driver, storelocatorpage.ddl_Radius_Dropdown);
			String rad=storelocatorpage.getValue_ddl_Radius_Dropdown();
			if(!rad.equals("10"))
			{
				driver.close();
				Assert.fail("Default radius is not 10");
			}
				
			storelocatorpage.click_txt_Enter_Zip_Or_City_Field();
			storelocatorpage.type_txt_Enter_Zip_Or_City_Field(zip);
			storelocatorpage.click_click_Search_Button();
			if(obj.waitForElement(driver, storelocatorpage.click_Foooter_Logo_Button) != null)
			{
				obj.scrollingToElementofAPage(driver, storelocatorpage.click_Foooter_Logo_Button);
				storelocatorpage.click_click_Foooter_Logo_Button();
			}
		
		}
		catch(Exception e)
		{
			if(storelocatorpage.isDisplayed_txt_Invalid_store_text())
			{
				driver.close();
				Assert.fail("Invalid zip code");
				storelocatorpage.click_click_Home_Button();	
			}
			else if( storelocatorpage.isDisplayed_txt_Invalid_zipcode_txt())
			{
				driver.close();
				Assert.fail("No stores found for the given zip code");
				storelocatorpage.click_click_Home_Button();
			}
		}
		return driver;
	}
	public WebDriver FuelPerk_CityState(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_StoreLocatorPage storelocatorpage = new POM_Generated_StoreLocatorPage(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		Data obj=new Data();
		String city="";
		String value="";
		
		new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global",Functionality);
	    if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
	    {
	    	value="winndixie";
	    	 		
	    }
	    else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
	    {
	    	value="bi-lo";
	    	
	    }
	    else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
	    {
	    	value="harveyssupermarkets";
	    	
	    }
	    
	    if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
	    {
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
	    	city=Readexcel_RowName.getValue("WD_CITY");
	    	 		
	    }
	    else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
	    {
	    	new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
	    	city=Readexcel_RowName.getValue("BL_CITY");
	    	
	    }
	    else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
	    {
	    	new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
	    	city=Readexcel_RowName.getValue("HY_CITY");
	    	
	    } 
		try
		{
			obj.waitForElement(driver, homepage.click_Global_StoreLocator_Button);
			homepage.click_click_Global_StoreLocator_Button();
			obj.scrollingToElementofAPage(driver, storelocatorpage.txt_Enter_Zip_Or_City_Field);
			obj.waitForElement(driver, storelocatorpage.click_Fuellocation_Button);
			storelocatorpage.click_click_Fuellocation_Button();
			obj.scrollingToElementofAPage(driver, storelocatorpage.ddl_Radius_Dropdown);
			String rad=storelocatorpage.getValue_ddl_Radius_Dropdown();
			if(!rad.equals("10"))
			{
				driver.close();
				Assert.fail("Default radius is not 10");
			}
				
			storelocatorpage.click_txt_Enter_Zip_Or_City_Field();
			storelocatorpage.type_txt_Enter_Zip_Or_City_Field(city);
			storelocatorpage.click_click_Search_Button();
			if(obj.waitForElement(driver, storelocatorpage.click_Foooter_Logo_Button) != null)
			{
				obj.scrollingToElementofAPage(driver, storelocatorpage.click_Foooter_Logo_Button);
				storelocatorpage.click_click_Foooter_Logo_Button();
			}
		
		}
		catch(Exception e)
		{
			if(storelocatorpage.isDisplayed_txt_Invalid_store_text())
			{
				driver.close();
				Assert.fail("Invalid city");
				storelocatorpage.click_click_Home_Button();	
			}
			else if( storelocatorpage.isDisplayed_txt_Invalid_zipcode_txt())
			{
				driver.close();
				Assert.fail("No stores found for the given city");
				storelocatorpage.click_click_Home_Button();
			}
		}
		
		return driver;
	}
}	
		
		
		
