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

import Utility.Data;
import generatedClass.POM_Generated_ShoppingListPage;

public class Computed_Shopping_List 
{
	List<WebElement> totalprod= null;
    List<WebElement> prodsummary=null;
    List<WebElement> proddesc= null;
    List<WebElement> price=null;
    List<WebElement> Delete=null;
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
			totalprod= shoppinglistpage.txt_Total_Products_Text;
			if(totalprod.size()!=0)
			{
				prodsummary=shoppinglistpage.txt_Product_Summary_Text;
				proddesc= shoppinglistpage.txt_Product_Description_Text;
				price= shoppinglistpage.txt_Product_Price_Text;
				Delete=shoppinglistpage.click_Weekly_Ad_Items_check_Delete_Icon;
			}
			else
			{
				prodchk=false;
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
				    				
		    				pric=price.get(k).getText();
				    		pric = pric.replace(".", "");
				    		pric = pric.replace("/", "");
				    		
				    		if(actionverify.equalsIgnoreCase("Add"))
				    		{
				    			if(prod.equalsIgnoreCase(summary+" "+pric+" "+desc))
				    			{
				    				chk=true;
				    				finished=true;
				    				break outerloop;
				    			}
				    		}
				    		else if(actionverify.equalsIgnoreCase("Remove"))
				    		{			    						
				    			if(prod.equalsIgnoreCase(summary+" "+pric+" "+desc))
				    			{
				    				chk=true;
				    				finished=true;
				    				break outerloop;
				    			}
				    		}
				    		else if(actionverify.equalsIgnoreCase("RemoveFromShopping"))
				    		{
				    					
				    			if(prod.equalsIgnoreCase(summary+" "+pric+" "+desc))
				    			{
				    				
				    				chk=true;
				    				finished=true;
				    				Delete.get(k).click();
				    				Thread.sleep(3000);
				    				break outerloop;		    						
				    			}
				    				
				    		}
		    			}
		    		}
				}
		  	}
		    if(actionverify.equalsIgnoreCase("Add"))
		    {
		    	if(chk==false)
		    	{
		    		Assert.fail("Products are not added in shoppinglist");
		    		
		    	}
		    }
		    else if(actionverify.equalsIgnoreCase("Remove"))
		    {
		    	if(chk==false)
		    	{
		    		Assert.fail("Products are not removed in shoppinglist");
		    		
		    	}
		    }
		    else if(actionverify.equalsIgnoreCase("RemoveFromShopping"))
		    {
		    	if(chk==false)
		    	{
		    		Assert.fail("Products are not removed from shoppinglist");
		    		
		    	}
		    }
		    obj.waitForElementClickable(driver, shoppinglistpage.click_Close_Button);
		    shoppinglistpage.click_click_Close_Button();
		    	
	    }
	    catch(Exception e)
	    {
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
							if(pageverify.equalsIgnoreCase("HomePageCoupon"))
							{
								if(prod.equalsIgnoreCase("Save coupon- "+summary+" "+desc))
								{
									chk=true;
									finished=true;
									break outerloop;
								}
							} 
							else if(pageverify.equalsIgnoreCase("Digital_Coupon"))
							{
								if(prod.equalsIgnoreCase(summary+" "+desc))
								{
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
					Assert.fail("Coupons are not added in shoppinglist");
			    		
				}
			}
			obj.waitForElementClickable(driver, shoppinglistpage.click_Close_Button);
			shoppinglistpage.click_click_Close_Button();	  
	    }
	    catch(Exception e)
	    {
	    	Assert.fail("Error in shopping list");
	    	obj.waitForElementClickable(driver, shoppinglistpage.click_Close_Button);
	    	shoppinglistpage.click_click_Close_Button();
	    }
	    return driver;
	}
}
