package computedClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_Homepage;
import generatedClass.POM_Generated_ShoppingListPage;

public class Computed_Shopping_List 
{
	List<WebElement> totalprod= null;
    List<WebElement> prodsummary=null;
    List<WebElement> proddesc= null;
    List<WebElement> price=null;
    List<WebElement> Delete=null;
    List<WebElement> checkbox=null;
    private String prod;
	private int count;
    public WebDriver ShoppingList_Navigation(WebDriver driver,String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
    	POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		
		POM_Generated_ShoppingListPage shoppinglistpage = new POM_Generated_ShoppingListPage(driver);
		Data obj=new Data();
		String value="";
		WebElement logo = null;
	    try
    	{
	    	new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global",Functionality);
	    	if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
	    	{  			
	    		value="winndixie";		
	    		logo= homepage.click_Winndixie_logo;
	    	}
	    	else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
	    	{
	    		
	    		value="bi-lo";	    		
	    		logo = homepage.click_Bilo_logo;
	    	}
	    	else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
	    	{	
	    		value="harveyssupermarkets";	    		
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
    	}
	    catch(Exception e)
	    {
	    	Assert.fail("Error in shopping list navigation");
	    }
		return driver;
	  }
    
    
	public WebDriver WeeklyAd_Deals_ShoppingList(WebDriver driver,String prod,int count,String actionverify) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_ShoppingListPage shoppinglistpage = new POM_Generated_ShoppingListPage(driver);
		Data obj=new Data();
		Robot rb = new Robot();
	    try
	    { 
		   
		    obj.waitForElement(driver, shoppinglistpage.txt_List_Count_Text);
			String sc=shoppinglistpage.getText_txt_List_Count_Text();
			int scl=Integer.parseInt(sc);
			if(scl!=count)
			{
				driver.close();
				Assert.fail("count not updated");
			}
			obj.waitForElementClickable(driver, shoppinglistpage.click_List_icon_Button);
			shoppinglistpage.click_click_List_icon_Button();
	        obj.waitForElement(driver,shoppinglistpage.click_Close_Button);
	        
	        boolean prodchk=true;
	        rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			obj.scrollingToTop(driver);
	        
			if(!shoppinglistpage.isSelected_click_Weekly_Ad_Items_Checkbox())
			{
				shoppinglistpage.click_click_Weekly_Ad_Items_Checkbox();
				obj.waitForElementselected(driver, shoppinglistpage.click_Weekly_Ad_Items_Checkbox);
			}
			if(shoppinglistpage.isSelected_click_Coupons_Checkbox())
			{
				shoppinglistpage.click_click_Coupons_Checkbox();
	        }
			if(shoppinglistpage.isSelected_click_My_Items_Checkbox())
			{
				shoppinglistpage.click_click_My_Items_Checkbox();
	        }
			Thread.sleep(2000);
			totalprod= shoppinglistpage.txt_Total_Products_Text;
			if(totalprod.size()!=0)
			{
				prodsummary=shoppinglistpage.txt_Product_Summary_Text;
				proddesc= shoppinglistpage.txt_Product_Description_Text;
				price= shoppinglistpage.txt_Product_Price_Text;
				Delete=shoppinglistpage.click_Weekly_Ad_Items_check_Delete_Icon;
				checkbox=shoppinglistpage.click_Select_Items_CheckBox;
			}
			else
			{
				prodchk=false;
				Assert.fail("Error in total products");
			}
	        
	        
	        int size=totalprod.size();
			String item="";
			String summary="";
		    String desc="";
		    String pric="";
		    boolean chk=false;
		    boolean finished = false;
		    if(prodchk==true) 
		    {
		    	outerloop:
		    	for(int k=0;k<size;k++)
		    	{		
		    		for(int j=0;j<size && finished==false;j++)
		    		{    	
		    			item= totalprod.get(k).getText();
		    			if(item.isEmpty())
		    			{
		    				rb.keyPress(KeyEvent.VK_DOWN);
		    				rb.keyRelease(KeyEvent.VK_DOWN);
				    	}
		    			else
		    			{   			
		    				summary= prodsummary.get(k).getText();
		    				summary = summary.replace(".","");		    			
		    				summary = summary.replace("/", "");
		    				desc=proddesc.get(k).getText();
		    				desc = desc.replace(".", "");
		    				desc = desc.replace("/", "");
		    				prod =  prod.replace(".", "");
							prod = prod.replace("/", "");		
		    				pric=price.get(k).getText();
				    		pric = pric.replace(".", "");
				    		pric = pric.replace("/", "");
				    		
				    		if(actionverify.equalsIgnoreCase("Added"))
				    		{
				    			System.out.println(prod);
				    			System.out.println(summary+" "+pric+" "+desc);
				    			if(prod.equalsIgnoreCase(summary+" "+pric+" "+desc))
				    			{
				    				chk=true;
				    				finished=true;
				    				break outerloop;
				    			}
				    		}
				    		else if(actionverify.equalsIgnoreCase("Removed"))
				    		{			    						
				    			if(prod.equalsIgnoreCase(summary+" "+pric+" "+desc))
				    			{
				    				chk=true;
				    				finished=true;
				    				break outerloop;
				    			}
				    		}
				    		else if(actionverify.equalsIgnoreCase("DeleteIcon_Removedfromshoppinglist"))
				    		{
				    					
				    			if(prod.equalsIgnoreCase(summary+" "+pric+" "+desc))
				    			{
				    				
				    				chk=true;
				    				finished=true;
				    				this.prod=prod;
				    				Delete.get(k).click();
				    				Thread.sleep(3000);
				    				break outerloop;		    						
				    			}
				    				
				    		}
				    		else if(actionverify.equalsIgnoreCase("DeleteAllButton_Removedfromshoppinglist"))
				    		{
				    					
				    			if(prod.equalsIgnoreCase(summary+" "+pric+" "+desc))
				    			{
				    				
				    				chk=true;
				    				finished=true;
				    				this.prod=prod;
				    				checkbox.get(k).click();
				    				obj.movetoElementofAPage_Click(driver, shoppinglistpage.click_Remove_All_Checked_Items_Button);
				    				Thread.sleep(3000);
				    				break outerloop;		    						
				    			}
				    				
				    		}
				    		
		    			}
		    		}
				}
		  	}
		    if(actionverify.equalsIgnoreCase("Added"))
		    {
		    	if(chk==false)
		    	{
		    		//driver.close();
		    		Assert.fail("Products are not displaying in shoppinglist when items added from circular page");
		    		
		    	}
		    	else
		    	{
		    		Reporter.log("Products added in shopping list when items added from circular page");
		    	}
		    }
		    else if(actionverify.equalsIgnoreCase("Removed"))
		    {
		    	if(chk==true)
		    	{
		    		driver.close();
		    		Assert.fail("Products are displaying in shoppinglist when items removed from circular page");
		    		
		    	}
		    	else
		    	{
		    		Reporter.log("Products removed in shopping list when items removed from circular page");
		    	}
		    }
		    else if(actionverify.equalsIgnoreCase("DeleteIcon_Removedfromshoppinglist")||actionverify.equalsIgnoreCase("DeleteAllButton_Removedfromshoppinglist"))
		    {
		    	if(chk==false)
		    	{
		    		driver.close();
		    		Assert.fail("Products are not removed from shoppinglist by clicking delete icon");
		    		
		    	}
		    	else
		    	{
		    		Reporter.log("Products removed from shopping list");
		    	}
		    }
		    else
		    {
		    	Assert.fail("error in action verify in shoppinglist");
		    }
		    obj.waitForElementClickable(driver, shoppinglistpage.click_Close_Button);
		    shoppinglistpage.click_click_Close_Button();
		    	
	    }
	    catch(Exception e)
	    {
	    	driver.close();
	    	Assert.fail("Error in shopping list");
	    	obj.waitForElementClickable(driver, shoppinglistpage.click_Close_Button);
	    	shoppinglistpage.click_click_Close_Button();
	    }
	
	    return driver;  	  
	}
	
	public WebDriver Coupons_ShoppingList(WebDriver driver,String prod,int count,String pageverify) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_ShoppingListPage shoppinglistpage = new POM_Generated_ShoppingListPage(driver);
		Data obj=new Data();
		Robot rb = new Robot(); 
	    try
	    { 
		    
		    obj.waitForElement(driver, shoppinglistpage.txt_List_Count_Text);
			String sc=shoppinglistpage.getText_txt_List_Count_Text();
			int scl=Integer.parseInt(sc);
			
			if(scl!=count)
			{
				driver.close();
				
				Assert.fail("count not updated");
			}
			obj.waitForElementClickable(driver, shoppinglistpage.click_List_icon_Button);
			shoppinglistpage.click_click_List_icon_Button();
	        obj.waitForElement(driver,shoppinglistpage.click_Close_Button);
	        
	        boolean prodchk=true;
	        rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			obj.scrollingToTop(driver);
	        
	       
			if(shoppinglistpage.isSelected_click_Weekly_Ad_Items_Checkbox())
			{
				shoppinglistpage.click_click_Weekly_Ad_Items_Checkbox();
			}
			if(!shoppinglistpage.isSelected_click_Coupons_Checkbox())
			{
				shoppinglistpage.click_click_Coupons_Checkbox();
				obj.waitForElementselected(driver, shoppinglistpage.click_Coupons_Checkbox);
			}
			if(shoppinglistpage.isSelected_click_My_Items_Checkbox())
			{
				shoppinglistpage.click_click_My_Items_Checkbox();
			}
	        	
			totalprod= shoppinglistpage.txt_Total_Products_Text;
			if(totalprod.size()!=0)
			{
				prodsummary=shoppinglistpage.txt_Product_Summary_Text;
				proddesc= shoppinglistpage.txt_Product_Description_Text;
			}
			else
			{
	        		prodchk=false;
			}
			int size=totalprod.size();
			String item="";
			String summary="";
			String desc="";
			
			boolean chk=false;
			boolean finished = false;
			if(prodchk==true) 
			{
				outerloop:
				for(int k=0;k<size;k++)
				{		
					for(int j=0;j<size && finished==false;j++)
					{    	
						item= totalprod.get(k).getText();
						if(item.isEmpty())
						{
							rb.keyPress(KeyEvent.VK_DOWN);
							rb.keyRelease(KeyEvent.VK_DOWN);
					   	}
						else
						{   			
							summary= prodsummary.get(k).getText();
							summary = summary.replace(".","");		    			
							summary = summary.replace("/", "");
							desc=proddesc.get(k).getText();
							desc = desc.replace(".", "");
							desc = desc.replace("/", "");
							prod =  prod.replace(".", "");
							prod = prod.replace("/", "");
							if(pageverify.equalsIgnoreCase("Save_Coupon"))
							{
								if(prod.equalsIgnoreCase("Save coupon- "+summary+" "+desc))
								{
									Reporter.log("Save Coupons displayed in shopping list");
									chk=true;
									finished=true;
									break outerloop;
								}
							} 
							else if(pageverify.equalsIgnoreCase("Digital_Coupon"))
							{
								
								if(prod.equalsIgnoreCase(summary+" "+desc))
								{
									Reporter.log("Digital Coupons displayed in shopping list");
									chk=true;
									finished=true;
									break outerloop;
								}
							}
			    		}
			    		
					}
			  	}
			   
				if(chk==false)
				{
					driver.close();
					Assert.fail("Coupons are not added in shoppinglist");
			    		
				}
			}
			obj.waitForElementClickable(driver, shoppinglistpage.click_Close_Button);
			shoppinglistpage.click_click_Close_Button();	  
	    }
	    catch(Exception e)
	    {
	    	driver.close();
	    	Assert.fail("Error in shopping list");
	    	obj.waitForElementClickable(driver, shoppinglistpage.click_Close_Button);
	    	shoppinglistpage.click_click_Close_Button();
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
}
