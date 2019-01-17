package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_Homepage;
import generatedClass.POM_Generated_StaticInfoBar;
import generatedClass.POM_Generated_StoreLocatorPage;

public class Computed_MyStore 
{
	public WebDriver SetStore(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
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
			obj.waitForElement(driver, logo);
			logo.click();
			obj.waitForElement(driver, staticInfoBar.click_Static_info_My_Account_Link);
			if(staticInfoBar.isDisplayed_click_Static_info_MyStore_Link())
			{	
				if(staticInfoBar.isDisplayed_click_Static_info_MyStore_Address_Text())
				{	
					Reporter.log("Mystore address text is displaying");
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
					Reporter.log("Please Set store text is displaying");
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
			driver.close();
			Assert.fail("Store links are not displayed");
			
		}
		
		return driver;
	}
	
	public WebDriver StoreLocatorValidation(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException
	{
		POM_Generated_StoreLocatorPage storelocatorpage = new POM_Generated_StoreLocatorPage(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		Data obj=new Data();
		try
		{	
			obj.waitForElement(driver, homepage.click_Global_StoreLocator_Button);
			homepage.click_click_Global_StoreLocator_Button();
			obj.scrollingToElementofAPage(driver, storelocatorpage.txt_Enter_Zip_Or_City_Field);
			obj.waitForElement(driver, storelocatorpage.txt_Enter_Zip_Or_City_Field);
			
			if( storelocatorpage.isDisplayed_txt_Enter_Zip_Or_City_Field())
			{
				Reporter.log("Textbox is displayed");
				String s= storelocatorpage.txt_Enter_Zip_Or_City_Field.getAttribute("title");
				if(s.equals("City, state or ZIP"))
			    {
			    	Reporter.log("Title text is displayed as "+s);
			    }
			    else
			    {
			    	Assert.fail("Title text is displayed as "+s);
			    } 
				
				if(storelocatorpage.isDisplayed_click_Search_Button())
				{
					Reporter.log("Search button is present");
					
				}
				else
				{
					Assert.fail("Search button is not present");
				}
			}
			else
			{
				Assert.fail("Textbox is not displayed");
			}
				
		}
		catch(NoSuchElementException e)
		{
			Assert.fail("Error in navigation to store locator page");
		}
		return driver;
		
	}
	public WebDriver StoreLocator_Zipcode(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException
	{
		POM_Generated_StoreLocatorPage storelocatorpage = new POM_Generated_StoreLocatorPage(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		Data obj=new Data();
		String value="";
		String zip="";
	
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
	    String sl="https://"+value+".pdn.retaileriq.com";
		String ie="Windows Security";
		String bro="";
		if(Readexcel_RowName.getValue("Chrome(Y/N)").equalsIgnoreCase("Y"))
		{
			bro= sl;
		}	
		else if(Readexcel_RowName.getValue("IE(Y/N)").equalsIgnoreCase("Y"))
		{
			bro=ie;
		}
		String Val = obj.popuppath()+" "+bro;
		
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
			obj.waitForElement(driver, storelocatorpage.txt_Enter_Zip_Or_City_Field);
			obj.waitForElement(driver, storelocatorpage.click_Storelocation_Button);
			storelocatorpage.click_click_Storelocation_Button();
				
			storelocatorpage.click_txt_Enter_Zip_Or_City_Field();
			storelocatorpage.type_txt_Enter_Zip_Or_City_Field(zip);
			storelocatorpage.click_click_Search_Button();
			try
			{
				obj.waitForElement(driver, storelocatorpage.click_Weekly_Ad_Link);
				storelocatorpage.click_click_Weekly_Ad_Link();
				Runtime.getRuntime().exec(Val);	
			}
			catch(Exception e)
			{
				if(storelocatorpage.isDisplayed_txt_Invalid_store_text())
				{
					driver.close();
					Assert.fail("Invalid zipcode");
					storelocatorpage.click_click_Home_Button();	
				}
				else if( storelocatorpage.isDisplayed_txt_Invalid_zipcode_txt())
				{
					driver.close();
					Assert.fail("No stores found for the given zip code");
					storelocatorpage.click_click_Home_Button();
				}
			}
		}
		catch(Exception e)
		{
			Assert.fail("error in locating stores");
		}
		
		return driver;
		
	}
	
	public WebDriver StoreLocator_CityState(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException
	{
		POM_Generated_StoreLocatorPage storelocatorpage = new POM_Generated_StoreLocatorPage(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		Data obj=new Data();
		String value="";
		String city="";
	
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
	    String sl="https://"+value+".pdn.retaileriq.com";
		String ie="Windows Security";
		String bro="";
		if(Readexcel_RowName.getValue("Chrome(Y/N)").equalsIgnoreCase("Y"))
		{
			bro= sl;
		}	
		else if(Readexcel_RowName.getValue("IE(Y/N)").equalsIgnoreCase("Y"))
		{
			bro=ie;
		}
		String Val = obj.popuppath()+" "+bro;
		
		if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
	    {
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
	    	city=Readexcel_RowName.getValue("WD_CITY");
	    	System.out.println(city);
	    	 		
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
			obj.waitForElement(driver, storelocatorpage.click_Storelocation_Button);
			storelocatorpage.click_click_Storelocation_Button();
			storelocatorpage.click_txt_Enter_Zip_Or_City_Field();
			storelocatorpage.type_txt_Enter_Zip_Or_City_Field(city);
			storelocatorpage.click_click_Search_Button();
			try
			{
				obj.waitForElement(driver, storelocatorpage.click_Weekly_Ad_Link);
				storelocatorpage.click_click_Weekly_Ad_Link();
					
					
				Runtime.getRuntime().exec(Val);	
			}
			catch(Exception e)
			{
				if(storelocatorpage.isDisplayed_txt_Invalid_store_text())
				{
					driver.close();
					Assert.fail("Invalid City");
					storelocatorpage.click_click_Home_Button();	
				}
				else if( storelocatorpage.isDisplayed_txt_Invalid_zipcode_txt())
				{
						driver.close();
						Assert.fail("No stores found for entered city ");
						storelocatorpage.click_click_Home_Button();
				}
			}

		}
		catch(Exception e)
		{
			Assert.fail("error in locating stores");
		}
		
		return driver;
		
	}
	
	public WebDriver SetStore_ChangeLocation(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_StoreLocatorPage storelocatorpage = new POM_Generated_StoreLocatorPage(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		//POM_Generated_StaticInfoBar staticinfobar= new POM_Generated_StaticInfoBar(driver);
		Data obj=new Data();
		
		try
		{
			obj.waitForElement(driver, homepage.click_Global_StoreLocator_Button);
			homepage.click_click_Global_StoreLocator_Button();
			
			obj.scrollingToElementofAPage(driver, storelocatorpage.txt_Enter_Zip_Or_City_Field);
			obj.waitForElement(driver, storelocatorpage.txt_Enter_Zip_Or_City_Field);
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
			if(Readexcel_RowName.getValue("Change_Zipcode")!=null)
			{
				storelocatorpage.click_click_Storelocation_Button();
				obj.waitForElement(driver, storelocatorpage.click_Storelocation_Button);
				obj.scrollingToElementofAPage(driver, storelocatorpage.ddl_Radius_Dropdown);
				String rad=storelocatorpage.getValue_ddl_Radius_Dropdown();
				if(!rad.equals("10 miles"))
				{
					driver.close();
					Assert.fail("Default radius is not 10");
				}
				storelocatorpage.type_txt_Enter_Zip_Or_City_Field(Readexcel_RowName.getValue("Change_Zipcode"));
				storelocatorpage.click_click_Search_Button();
				obj.waitForElement(driver, storelocatorpage.click_Storelocation_Button);
				obj.scrollingToElementofAPage(driver, storelocatorpage.click_Make_My_store_Button);
				try 
				{
					storelocatorpage.click_click_Make_My_store_Button();
					obj.waitForElement(driver, storelocatorpage.click_Storelocation_Button);
					obj.scrollingToElementofAPage(driver, storelocatorpage.click_View_Store_Details_Button);
					storelocatorpage.click_click_View_Store_Details_Button();
					obj.waitForElement(driver, storelocatorpage.click_Home_Button);
					String sdetails=storelocatorpage.getText_txt_StreetAddr_Text();
					storelocatorpage.click_click_Home_Button();
					obj.waitForElement(driver, storelocatorpage.txt_StreetAddr_Text);
					String addr=storelocatorpage.getText_txt_StreetAddr_Text();
					if(!sdetails.equals(addr))
					{
						driver.close();
						Assert.fail("Store address not changed");
					}
				}
				catch(NoSuchElementException e) 
				{
					try
					{
						if(	storelocatorpage.isDisplayed_click_Invalid_Store_Error_Text())
						{
							driver.close();
							Assert.fail("No stores found");
							storelocatorpage.click_click_Home_Button();
						}
						else	
						{
							driver.close();
							Assert.fail("No stores found error message is not displaying");
							storelocatorpage.click_click_Home_Button();
						}
					}
					catch (NoSuchElementException e1)
					{
						driver.close();
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
			driver.close();
			Assert.fail("Error in my store page");
		}
		
		
		return driver;
	}
	public WebDriver SetStore_InvalidZip(WebDriver driver,String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException
	{
		POM_Generated_StoreLocatorPage storelocatorpage = new POM_Generated_StoreLocatorPage(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		String invalid_zip="";
	//	WebElement logo = null;
		Data obj=new Data();
		
		new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global",Functionality);
    	
    	
    	if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
	    {
    		new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
    		invalid_zip=Readexcel_RowName.getValue("WD_INVALID_ZIP");
	    	System.out.println(invalid_zip);
	    	 		
	    }
	    else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
	    {
	    	new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
	    	invalid_zip=Readexcel_RowName.getValue("BL_INVALID_ZIP");
	    	
	    }
	    else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
	    {
	    	new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
	    	invalid_zip=Readexcel_RowName.getValue("HV_INVALID_ZIP");
	    	
	    } 

		obj.waitForElement(driver, homepage.click_Global_StoreLocator_Button);
		homepage.click_click_Global_StoreLocator_Button();
		obj.scrollingToElementofAPage(driver, storelocatorpage.txt_Enter_Zip_Or_City_Field);
		obj.waitForElement(driver, storelocatorpage.txt_Enter_Zip_Or_City_Field);
		try
		{
			String Error_Msg;
			
			new Readexcel_RowName().excelRead("ErrorMessageSheet",Functionality,"Invalid_Zip_error_msg");
			Error_Msg= Readexcel_RowName.getValue("Error_Message");

			obj.waitForElement(driver, storelocatorpage.click_Storelocation_Button);
			storelocatorpage.click_click_Storelocation_Button();
			storelocatorpage.click_txt_Enter_Zip_Or_City_Field();
			storelocatorpage.type_txt_Enter_Zip_Or_City_Field(invalid_zip);
			storelocatorpage.click_click_Search_Button();
			if(storelocatorpage.isDisplayed_txt_Invalid_zipcode_txt())
			{
				if(Error_Msg.equals(storelocatorpage.getText_txt_Invalid_zipcode_txt()))
				{
					Reporter.log("Error message is displayed:" +storelocatorpage.getText_txt_Invalid_zipcode_txt());
				}
				else
				{
					Assert.fail("Displayed error message is not as expected:" +storelocatorpage.getText_txt_Invalid_zipcode_txt());
				}
				}
			else
			{
				Assert.fail("Error message is not displayed");
			}
				
		}
		catch(Exception e)
		{
			Assert.fail("Error in store locating page");
		}
		
		return driver;
	
	}
				
}
