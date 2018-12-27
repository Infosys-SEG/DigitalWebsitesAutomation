package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.Reporter;

import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_Homepage;
import generatedClass.POM_Generated_ShoppingListPage;
import generatedClass.POM_Generated_WeeklyAdPage;

public class Computed_WeeklyAd 
{
	private String prod;
	private String prodvalu;
	private int count;
	String value="";
	

	public WebDriver WeeklyAdPage(WebDriver driver, String Functionality,String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_WeeklyAdPage weeklyadpage = new POM_Generated_WeeklyAdPage(driver);
		POM_Generated_ShoppingListPage shoppinglistpage = new POM_Generated_ShoppingListPage(driver);
		Data obj=new Data();
		String url="";
		
		WebElement logo = null;
	    try
    	{
	    	new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global",Functionality);
	    	if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
	    	{  	
	    		
	    		value="winndixie";
	    		url="https://winndixie.pdn.retaileriq.com/weeklyad/storelocator/";
	    		logo= homepage.click_Winndixie_logo;
	    	}
	    	else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
	    	{
	    		
	    		value="bi-lo";
	    		url="https://bi-lo.pdn.retaileriq.com/weeklyad/storelocator/";
	    		logo = homepage.click_Bilo_logo;
	    	}
	    	else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
	    	{
	    		
	    		value="harveyssupermarkets";
	    		url="https://harveyssupermarkets.pdn.retaileriq.com/weeklyad/storelocator/";	
	    		logo = homepage.click_Harveys_logo;
	    	}
	    	String wa_orP="https://"+value+".pdn.retaileriq.com/weeklyad/";
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
    	
	    	obj.waitForElementClickable(driver, logo);
	    	logo.click();
    		obj.waitForElementClickable(driver, homepage.click_Savings_link_Hover);
    		Runtime.getRuntime().exec(Val);
    		
    		homepage.click_click_Savings_link_Hover();	
    		
    		obj.waitForElementClickable(driver, homepage.click_Savings_WeeklyAd_Button);
    		
    		homepage.click_click_Savings_WeeklyAd_Button();
    		
    		obj.waitForElement(driver, shoppinglistpage.txt_List_Count_Text);
    		
    		if(driver.getCurrentUrl().equalsIgnoreCase(url))
    		{
    			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
    			String Store_Zip = Readexcel_RowName.getValue("Store_Zip");
    			obj.waitForElementClickable(driver, weeklyadpage.txt_Select_Store_Field);
    			if(weeklyadpage.isDisplayed_click_Locate_A_store_Near_You_Button())
    			{
    				Reporter.log("Locate a store near you button is displayed");
    			}
    			else
    			{
    				Assert.fail("Locate a store near you button is not displayed");
    			}
    			if(weeklyadpage.isDisplayed_txt_Please_Select_A_Store_Text())
    			{
    				Reporter.log("Please select a store near to view weekly ads text is displayed");
    			}
    			else
    			{
    				Assert.fail("Please select a store near to view weekly ads text is not displayed");
    			}	
    			weeklyadpage.type_txt_Select_Store_Field(Store_Zip);
    			weeklyadpage.click_click_Store_Search_Button();
    			obj.waitForElementClickable(driver, weeklyadpage.click_Store_View_weeklyAds_Button);
    			weeklyadpage.click_click_Store_View_weeklyAds_Button();
    			obj.waitForElement(driver, weeklyadpage.txt_Your_WeeklyAd_Text);
    		}	
    		obj.waitForElement(driver, weeklyadpage.txt_Your_WeeklyAd_Text);
    		if(weeklyadpage.isDisplayed_txt_Your_WeeklyAd_Text())
			{
				obj.scrollingToElementofAPage(driver, weeklyadpage.click_View_weeklyAd_Link);
				
				weeklyadpage.click_click_View_weeklyAd_Link();
			}
    		else
    		{
    			driver.close();
    			Assert.fail("Error in Your WeeklyAd text");
    		}
    	}
    	catch(Exception e)
		{
    		//driver.close();
    		System.out.println(e);
    		Assert.fail("Error in Weekly Ad page");
		}		    
	    return driver; 
	}
	
	
	public WebDriver AddProduct(WebDriver driver, String prod,int count,String prodvalu) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_WeeklyAdPage weeklyadpage = new POM_Generated_WeeklyAdPage(driver);
		POM_Generated_ShoppingListPage shoppinglistpage = new POM_Generated_ShoppingListPage(driver);
		Data obj=new Data();
		String summary="";
		String price="";
		String desc="";	
		List<WebElement> products=null;	
		try
		{
			obj.waitForElementClickable(driver, weeklyadpage.click_Product_Webelement_Text);		
			products=  weeklyadpage.click_Product_List_Text;
			int totprdcnt=products.size();
			
			String cont=shoppinglistpage.getText_txt_List_Count_Text();
			count=Integer.parseInt(cont);
			
			outerloop:
			for (int l=0;l<totprdcnt;l++)
			{			
				try
				{	
					Actions action1=new Actions(driver); 
					action1.moveToElement(products.get(l)).build().perform();
					Thread.sleep(1000);
					boolean b=weeklyadpage.isDisplayed_click_Product_AddToList_Button();
					if(b==true)
					{	
						//obj.waitForElementClickable(driver, wa.click_WeeklyAd_Hover_Product_view_Deals_link);		
						Thread.sleep(1000);
						weeklyadpage.click_click_Product_view_Deals_Button();
						obj.waitForElementClickable(driver, weeklyadpage.click_Product_Overlay_Close_Button);
						summary=weeklyadpage.getText_txt_Product_Summary_Text();
						price=weeklyadpage.getText_txt_Product_Price_Text();
						desc=weeklyadpage.getText_txt_Product_Description_Text();
						prod=summary+" "+price+" "+desc;
						prod=prod.replace(".", "");
						prod=prod.replace("/", "");
						weeklyadpage.click_click_Product_AddToList_Overlay_Button();
						prodvalu=weeklyadpage.click_Product_AddToList_Overlay_Button.getAttribute("productkey");
						obj.waitForElementClickable(driver, weeklyadpage.click_Product_RemoveFromList_Overlay_Button);
						weeklyadpage.click_click_Product_Overlay_Close_Button();	
						Thread.sleep(1000);
						String color = products.get(l).getCssValue("border-color");
						String hex = Color.fromString(color).asHex();
						if(hex.equalsIgnoreCase("#ff0000"))
						{
							Reporter.log("Added products are highlighted in Red color");
						}
						else
						{
							Assert.fail("Added products are not highlighted in Red color");
						}
						count=count+1;
						Reporter.log("Product added from circular page");
						this.count=count;
						this.prod=prod;
						this.prodvalu=prodvalu;
						break outerloop;
					}	
				}
				catch(NoSuchElementException e)
				{
						
				}
			}	
		}		
		catch(Exception e)
		{	
			//driver.close();
			Assert.fail("Error in weekly ad circular page");
		}	
		return driver;
	}
	
	public WebDriver AddAgain(WebDriver driver, String prod,int count,String prodvalu) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_WeeklyAdPage weeklyadpage = new POM_Generated_WeeklyAdPage(driver);
		POM_Generated_ShoppingListPage shoppinglistpage = new POM_Generated_ShoppingListPage(driver);
		Data obj=new Data();
			
		try
		{
			obj.waitForElementClickable(driver, weeklyadpage.click_Product_Webelement_Text);		
			
			String cont=shoppinglistpage.getText_txt_List_Count_Text();
			count=Integer.parseInt(cont);
			WebElement wel=driver.findElement(By.xpath("//product[@key='"+prodvalu+"']"));
			obj.scrollingToElementofAPage(driver, wel);
			Actions action1=new Actions(driver); 
			action1.moveToElement(wel).build().perform();
			Thread.sleep(1000);
			try
			{
				if(weeklyadpage.isDisplayed_click_Product_view_Deals_Button())
				{
					//driver.close();	
					Reporter.log("View Deals Button is displayed");	
					weeklyadpage.click_click_Product_view_Deals_Button();
					try
					{
						obj.waitForElementClickable(driver, weeklyadpage.click_Product_Overlay_Close_Button);
						if(weeklyadpage.isDisplayed_click_Product_RemoveFromList_Overlay_Button())
						{
							
							Reporter.log("Items added once cannot add the same item again in overlay as expected");
						}
						
						weeklyadpage.click_click_Product_Overlay_Close_Button();
					}
					catch(Exception e2)
					{
						weeklyadpage.click_click_Product_Overlay_Close_Button();
						Assert.fail("Items added is still displaying as Add to list instead Remove from list in overlay");
					}
				}
				else
				{
					weeklyadpage.click_click_Product_Overlay_Close_Button();
					Assert.fail("View Deals Button is displayed");	
					
				}	
				action1.moveToElement(wel).build().perform();
				Thread.sleep(1000);
				if(weeklyadpage.isDisplayed_click_Product_RemoveFromList_Button())
				{		
					Reporter.log("Items added once cannot add the same item again as expected");	
				}
				else
				{
					Assert.fail("Items added is still displaying as Add to list instead Remove from list");				
				}
			}
			catch(NoSuchElementException e1)
			{
				Assert.fail("Items added is still displaying as Add to list instead Remove from list");	
			}
		}
		
		catch(Exception e)
		{
			driver.close();
			Assert.fail("Un Expected Error in Add again product");
		}
		return driver;
	}
			
			
	public WebDriver Removeproduct(WebDriver driver,String Functionality,String prod,int count) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_WeeklyAdPage weeklyadpage = new POM_Generated_WeeklyAdPage(driver);
		POM_Generated_ShoppingListPage shoppinglist = new POM_Generated_ShoppingListPage(driver);
		Data obj=new Data();
		String summary="";
		String price="";
		String desc="";
		List<WebElement> products=null;
		try
		{
			obj.waitForElementClickable(driver,weeklyadpage.click_Product_Webelement_Text);
			products= weeklyadpage.click_Product_List_Text;
			int totprdcnt=products.size();
			String cont=shoppinglist.getText_txt_List_Count_Text();
			count=Integer.parseInt(cont);
			
			outerloop:
			for (int l=0;l<totprdcnt;l++)
			{
				Actions action1=new Actions(driver); 
				action1.moveToElement(products.get(l)).build().perform();
				//obj.waitForElementClickable(driver, wa.click_WeeklyAd_Hover_Product_view_Deals_link);
				Thread.sleep(1000);
				try
				{
					/*boolean a=wa.isDisplayed_click_WeeklyAd_Hover_Product_view_Deals_link();
					System.out.println(a);*/
					boolean b=weeklyadpage.isDisplayed_click_Product_RemoveFromList_Button();
					//System.out.println(b);
					if(b==true)
					{
						//obj.waitForElementClickable(driver, wa.click_WeeklyAd_Hover_Product_view_Deals_link);
						Thread.sleep(1000);
						String color = products.get(l).getCssValue("border-color");
						String hex = Color.fromString(color).asHex();
						if(hex.equalsIgnoreCase("#ff0000"))
						{
							Reporter.log("Added products are highlighted in Red color");
						}
						else
						{
							Assert.fail("Added products are not highlighted in Red color");
						}
						weeklyadpage.click_click_Product_view_Deals_Button();
						summary=weeklyadpage.getText_txt_Product_Summary_Text();
						price=weeklyadpage.getText_txt_Product_Price_Text();
						desc=weeklyadpage.getText_txt_Product_Description_Text();
						prod=summary+" "+price+" "+desc;
						prod=prod.replace(".", "");
						prod=prod.replace("/", "");
						weeklyadpage.click_click_Product_RemoveFromList_Overlay_Button();
						obj.waitForElementClickable(driver, weeklyadpage.click_Product_AddToList_Overlay_Button);
						weeklyadpage.click_click_Product_Overlay_Close_Button();
						count=count-1;
						this.count=count;
						this.prod=prod;
						break outerloop;
					}
				}
				catch(NoSuchElementException e)
				{
					
				}
			}
		}
		catch(Exception e)
	    {
			driver.close();
			Assert.fail("Error in Weekly Ad page or remove from list");
	    }		
		return driver;		
	}
	
	public WebDriver RemoveAgain(WebDriver driver, String prod,int count,String prodvalu) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_WeeklyAdPage weeklyadpage = new POM_Generated_WeeklyAdPage(driver);
		POM_Generated_ShoppingListPage shoppinglistpage = new POM_Generated_ShoppingListPage(driver);
		Data obj=new Data();
			
		try
		{
			obj.waitForElementClickable(driver, weeklyadpage.click_Product_Webelement_Text);		
			
			String cont=shoppinglistpage.getText_txt_List_Count_Text();
			count=Integer.parseInt(cont);
			WebElement wel=driver.findElement(By.xpath("//product[@key='"+prodvalu+"']"));
			obj.scrollingToElementofAPage(driver, wel);
			Actions action1=new Actions(driver); 
			action1.moveToElement(wel).build().perform();
			Thread.sleep(1000);
			try
			{
				if(weeklyadpage.isDisplayed_click_Product_view_Deals_Button())
				{
					//driver.close();	
					Reporter.log("View Deals Button is displayed");	
					weeklyadpage.click_click_Product_view_Deals_Button();
					try
					{
						obj.waitForElementClickable(driver, weeklyadpage.click_Product_Overlay_Close_Button);
						if(weeklyadpage.isDisplayed_click_Product_AddToList_Overlay_Button())
						{
							Reporter.log("Items removed once cannot remove the same item again in overlay as expected");
						}
						weeklyadpage.click_click_Product_Overlay_Close_Button();
					}
					catch(Exception e2)
					{
						Assert.fail("Items Removed is still displaying as Remove from list instead Add to list in overlay");
					}
				}
				else
				{
					Assert.fail("View Deals Button is not displayed");		
					
				}	
				action1.moveToElement(wel).build().perform();
				Thread.sleep(1000);
				if(weeklyadpage.isDisplayed_click_Product_AddToList_Button())
				{		
					Reporter.log("Items Removed once cannot remove the same item again as expected");	
				}
				else
				{
					Assert.fail("Items Removed is still displaying as Remove from list instead Add to list");					
				}
			}
			catch(NoSuchElementException e1)
			{
				Assert.fail("Items Removed is still displaying as Remove from list instead Add to list");	
			}
		}
		
		catch(Exception e)
		{
			driver.close();
			Assert.fail("Un Expected Error in Remove again product");
		}
		return driver;
	}
	
	public String getprod() 
	{
		return prod;
	}
	public int getcount() 
	{
		return count;
	}
	
	public String getprodvalu() 
	{
		return prodvalu;
	}

}
