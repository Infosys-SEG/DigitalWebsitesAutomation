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
			obj.waitForElementClickable(driver, logo);
			logo.click();
			obj.waitForElementClickable(driver, staticInfoBar.click_Static_info_My_Account_Link);
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
			obj.waitForElementClickable(driver, homepage.click_Global_StoreLocator_Button);
			homepage.click_click_Global_StoreLocator_Button();
			obj.scrollingToElementofAPage(driver, storelocatorpage.txt_Enter_Zip_Or_City_Field);
			obj.waitForElementClickable(driver, storelocatorpage.txt_Enter_Zip_Or_City_Field);
			
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
		String wd_zip="";
		String bl_zip="";
		String hv_zip="";
	
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
		
		try
		{
			
			obj.waitForElementClickable(driver, homepage.click_Global_StoreLocator_Button);
			homepage.click_click_Global_StoreLocator_Button();
			obj.scrollingToElementofAPage(driver, storelocatorpage.txt_Enter_Zip_Or_City_Field);
			obj.waitForElementClickable(driver, storelocatorpage.txt_Enter_Zip_Or_City_Field);
			
			
			new Readexcel_RowName().excelRead("Global_TestData_Sheet", "Global", Functionality);
			if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
			{
				obj.waitForElementClickable(driver, storelocatorpage.click_Storelocation_Button);
				storelocatorpage.click_click_Storelocation_Button();
				new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
				wd_zip=Readexcel_RowName.getValue("WD_ZIP");
				
				storelocatorpage.click_txt_Enter_Zip_Or_City_Field();
				storelocatorpage.type_txt_Enter_Zip_Or_City_Field(wd_zip);
				storelocatorpage.click_click_Search_Button();
				try
				{
					obj.waitForElementClickable(driver, storelocatorpage.click_Weekly_Ad_Link);
					storelocatorpage.click_click_Weekly_Ad_Link();
					Runtime.getRuntime().exec(Val);	
				}
				catch(Exception e)
				{
					if(storelocatorpage.isDisplayed_txt_Invalid_store_text())
					{
						driver.close();
						Assert.fail("No stores found");
						storelocatorpage.click_click_Home_Button();	
					}
					else if( storelocatorpage.isDisplayed_txt_Invalid_zipcode_txt())
					{
						driver.close();
						Assert.fail("Invalid zip code");
						storelocatorpage.click_click_Home_Button();
					}
				}
					
				
			}
			else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
			{
				obj.waitForElementClickable(driver, storelocatorpage.click_Storelocation_Button);
				storelocatorpage.click_click_Storelocation_Button();
				new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
				bl_zip=Readexcel_RowName.getValue("BL_ZIP");
				storelocatorpage.click_txt_Enter_Zip_Or_City_Field();
				storelocatorpage.type_txt_Enter_Zip_Or_City_Field(bl_zip);
				storelocatorpage.click_click_Search_Button();
				try
				{
					obj.waitForElementClickable(driver, storelocatorpage.click_Weekly_Ad_Link);
					storelocatorpage.click_click_Weekly_Ad_Link();
					Runtime.getRuntime().exec(Val);	
				}
				catch(Exception e)
				{
					if(storelocatorpage.isDisplayed_txt_Invalid_store_text())
					{
						driver.close();
						Assert.fail("No stores found");
						storelocatorpage.click_click_Home_Button();	
					}
					else if( storelocatorpage.isDisplayed_txt_Invalid_zipcode_txt())
					{
						driver.close();
						Assert.fail("Invalid zip code");
						storelocatorpage.click_click_Home_Button();
					}
				}
				
				
			}
			else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
			{
				obj.waitForElementClickable(driver, storelocatorpage.click_Storelocation_Button);
				storelocatorpage.click_click_Storelocation_Button();
				new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
				hv_zip=Readexcel_RowName.getValue("HV_ZIP");
				
				storelocatorpage.click_txt_Enter_Zip_Or_City_Field();
				storelocatorpage.type_txt_Enter_Zip_Or_City_Field(hv_zip);
				storelocatorpage.click_click_Search_Button();
				try
				{
					obj.waitForElementClickable(driver, storelocatorpage.click_Weekly_Ad_Link);
					storelocatorpage.click_click_Weekly_Ad_Link();
					Runtime.getRuntime().exec(Val);	
				}
				catch(Exception e)
				{
					if(storelocatorpage.isDisplayed_txt_Invalid_store_text())
					{
						driver.close();
						Assert.fail("No stores found");
						storelocatorpage.click_click_Home_Button();	
					}
					else if( storelocatorpage.isDisplayed_txt_Invalid_zipcode_txt())
					{
						driver.close();
						Assert.fail("Invalid zip code");
						storelocatorpage.click_click_Home_Button();
					}
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
		String wd_city="";
		String bl_city="";
		String hv_city="";
	
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
		
		try
		{
			
			obj.waitForElementClickable(driver, homepage.click_Global_StoreLocator_Button);
			homepage.click_click_Global_StoreLocator_Button();
			obj.scrollingToElementofAPage(driver, storelocatorpage.txt_Enter_Zip_Or_City_Field);
			obj.waitForElementClickable(driver, storelocatorpage.txt_Enter_Zip_Or_City_Field);
			
			
			new Readexcel_RowName().excelRead("Global_TestData_Sheet", "Global", Functionality);
			if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
			{
				obj.waitForElementClickable(driver, storelocatorpage.click_Storelocation_Button);
				storelocatorpage.click_click_Storelocation_Button();
				
				new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
				wd_city=Readexcel_RowName.getValue("WD_CITY");
				System.out.println(wd_city);
				storelocatorpage.click_txt_Enter_Zip_Or_City_Field();
				storelocatorpage.type_txt_Enter_Zip_Or_City_Field(wd_city);
				storelocatorpage.click_click_Search_Button();
				try
				{
					obj.waitForElementClickable(driver, storelocatorpage.click_Weekly_Ad_Link);
					storelocatorpage.click_click_Weekly_Ad_Link();
					
					//Thread.sleep(2000);
					Runtime.getRuntime().exec(Val);	
				}
				catch(Exception e)
				{
					driver.close();
					Assert.fail("No stores found");
					storelocatorpage.click_click_Home_Button();	
					
				}
			}
			else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
			{
				obj.waitForElementClickable(driver, storelocatorpage.click_Storelocation_Button);
				storelocatorpage.click_click_Storelocation_Button();
				new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
				bl_city=Readexcel_RowName.getValue("BL_CITY");
				storelocatorpage.click_txt_Enter_Zip_Or_City_Field();
				storelocatorpage.type_txt_Enter_Zip_Or_City_Field(bl_city);
				storelocatorpage.click_click_Search_Button();
				try
				{
					obj.waitForElementClickable(driver, storelocatorpage.click_Weekly_Ad_Link);
					storelocatorpage.click_click_Weekly_Ad_Link();
					
					
					Runtime.getRuntime().exec(Val);	
				}
				catch(Exception e)
				{
					driver.close();
					Assert.fail("No stores found");
					storelocatorpage.click_click_Home_Button();	
					
				}
				
				
			}
			else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
			{
				obj.waitForElementClickable(driver, storelocatorpage.click_Storelocation_Button);
				storelocatorpage.click_click_Storelocation_Button();
				new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
				hv_city=Readexcel_RowName.getValue("HV_CITY");
				
				storelocatorpage.click_txt_Enter_Zip_Or_City_Field();
				storelocatorpage.type_txt_Enter_Zip_Or_City_Field(hv_city);
				storelocatorpage.click_click_Search_Button();
				try
				{
					obj.waitForElementClickable(driver, storelocatorpage.click_Weekly_Ad_Link);
					storelocatorpage.click_click_Weekly_Ad_Link();
					
					Runtime.getRuntime().exec(Val);	
				}
				catch(Exception e)
				{
					driver.close();
					Assert.fail("No stores found");
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
		POM_Generated_StaticInfoBar staticInfoBar = new POM_Generated_StaticInfoBar(driver);
		Data obj=new Data();
		String zip_wd="";
		String zip_bl="";
		String zip_hv="";
		try
		{
			obj.waitForElementClickable(driver, staticInfoBar.click_Static_info_My_Account_Link);
			staticInfoBar.click_click_Static_info_MyStore_Link();
			String sdetails=storelocatorpage.getText_txt_StreetAddr_Text();
			System.out.println(sdetails);
			obj.waitForElementClickable(driver, homepage.click_Global_StoreLocator_Button);
			homepage.click_click_Global_StoreLocator_Button();
			obj.scrollingToElementofAPage(driver, storelocatorpage.txt_Enter_Zip_Or_City_Field);
			obj.waitForElementClickable(driver, storelocatorpage.txt_Enter_Zip_Or_City_Field);
			
			new Readexcel_RowName().excelRead("Global_TestData_Sheet", "Global", Functionality);
			if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
			{
				new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);	
				if(Readexcel_RowName.getValue("Change_Zipcode_WD")!=null)
				{
					storelocatorpage.click_click_Storelocation_Button();
					obj.waitForElementClickable(driver, storelocatorpage.click_Storelocation_Button);
					
					zip_wd=Readexcel_RowName.getValue("Change_Zipcode_WD");
					storelocatorpage.click_txt_Enter_Zip_Or_City_Field();
					storelocatorpage.type_txt_Enter_Zip_Or_City_Field(zip_wd);
					storelocatorpage.click_click_Search_Button();
					try
					{
						obj.waitForElementClickable(driver, storelocatorpage.click_View_Store_Details_Button);
						storelocatorpage.click_click_View_Store_Details_Button();
						
						if(storelocatorpage.isDisplayed_click_Make_My_store_Button())
						{
						obj.waitForElementClickable(driver, storelocatorpage.click_Make_My_store_Button);
						storelocatorpage.click_click_Make_My_store_Button();
						storelocatorpage.click_click_Home_Button();
						}
						else
						{
							Assert.fail("Same store is selected");
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
			
			else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
			{
				new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);	
				if(Readexcel_RowName.getValue("Change_Zipcode_BL")!=null)
				{
					storelocatorpage.click_click_Storelocation_Button();
					obj.waitForElementClickable(driver, storelocatorpage.click_Storelocation_Button);
					zip_bl=Readexcel_RowName.getValue("Change_Zipcode_BL");
					storelocatorpage.click_txt_Enter_Zip_Or_City_Field();
					storelocatorpage.type_txt_Enter_Zip_Or_City_Field(zip_bl);
					storelocatorpage.click_click_Search_Button();
					try
					{
						obj.waitForElementClickable(driver, storelocatorpage.click_View_Store_Details_Button);
						storelocatorpage.click_click_View_Store_Details_Button();
						
						if(storelocatorpage.isDisplayed_click_Make_My_store_Button())
						{
						obj.waitForElementClickable(driver, storelocatorpage.click_Make_My_store_Button);
						storelocatorpage.click_click_Make_My_store_Button();
						storelocatorpage.click_click_Home_Button();
						}
						else
						{
							Assert.fail("Same store is selected");
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
			else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
			{
				new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);	
				if(Readexcel_RowName.getValue("Change_Zipcode_HV")!=null)
				{
					storelocatorpage.click_click_Storelocation_Button();
					obj.waitForElementClickable(driver, storelocatorpage.click_Storelocation_Button);
					zip_hv=Readexcel_RowName.getValue("Change_Zipcode_HV");
					storelocatorpage.click_txt_Enter_Zip_Or_City_Field();
					storelocatorpage.type_txt_Enter_Zip_Or_City_Field(zip_hv);
					storelocatorpage.click_click_Search_Button();
					try
					{
						obj.waitForElementClickable(driver, storelocatorpage.click_View_Store_Details_Button);
						storelocatorpage.click_click_View_Store_Details_Button();
						
						if(storelocatorpage.isDisplayed_click_Make_My_store_Button())
						{
						obj.waitForElementClickable(driver, storelocatorpage.click_Make_My_store_Button);
						storelocatorpage.click_click_Make_My_store_Button();
						storelocatorpage.click_click_Home_Button();
						}
						else
						{
							Assert.fail("Same store is selected");
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
		}
		
		
		
			catch(Exception e)
			{
				driver.close();
				Assert.fail("Error in my store page");
			}
			
			
			return driver;
		}
				
}
