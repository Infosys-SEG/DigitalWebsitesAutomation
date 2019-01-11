package computedClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
    List<WebElement> qty=null;
    private String proddetails;
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
	    	Runtime.getRuntime().exec(Val);
	    	
	    	obj.waitForElementClickable(driver, logo);
	    	logo.click();
    		obj.waitForElementClickable(driver, homepage.click_Savings_link_Hover);
    		
    		
    		homepage.click_click_Savings_link_Hover();	
    		
    		//obj.waitForElementClickable(driver, homepage.click_Savings_WeeklyAd_Button);
    		
    		homepage.click_click_Savings_WeeklyAd_Button();
    		
    		obj.waitForElement(driver, shoppinglistpage.txt_List_Count_Text);
    	}
	    catch(Exception e)
	    {
	    	Assert.fail("Error in shopping list navigation");
	    }
		return driver;
	  }
    
    
	public WebDriver WeeklyAd_Deals_ShoppingList(WebDriver driver,String Functionality,String TCName,String proddetails,int count,String actionverify) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_ShoppingListPage shoppinglistpage = new POM_Generated_ShoppingListPage(driver);
		Data obj=new Data();
		Robot rb = new Robot();
	    try
	    { 	   
		    obj.waitForElement(driver, shoppinglistpage.txt_List_Count_Text);
			String sc=shoppinglistpage.getText_txt_List_Count_Text();
			int scl=Integer.parseInt(sc);
			if(!actionverify.equalsIgnoreCase("")||count!=0)
			{
				if(scl!=count)
				{
					driver.close();
					Assert.fail("count not updated");
				}
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
	        
			if(!shoppinglistpage.isSelected_click_Weekly_Ad_Filter_Checkbox())
			{
				shoppinglistpage.click_click_Weekly_Ad_Filter_Checkbox();
				obj.waitForElementselected(driver, shoppinglistpage.click_Weekly_Ad_Filter_Checkbox);
			}
			if(shoppinglistpage.isSelected_click_Coupons_Filter_Checkbox())
			{
				shoppinglistpage.click_click_Coupons_Filter_Checkbox();
	        }
			if(shoppinglistpage.isSelected_click_MyItem_Filter_Checkbox())
			{
				shoppinglistpage.click_click_MyItem_Filter_Checkbox();
	        }
			Thread.sleep(2000);
			totalprod= shoppinglistpage.txt_Total_Products_Text;
			
			try
			{
				if(shoppinglistpage.isDisplayed_click_Print_List_Button())
				{
					Reporter.log("Print list button is displayed in shopping list page");
				}
				else
				{
					Assert.fail("Print list button is not displayed in shopping list page");
				}
				if(shoppinglistpage.isDisplayed_click_Email_List_Button())
				{
					Reporter.log("Email list button is displayed in shopping list page");
				}
				else
				{
					Assert.fail("Email list button is not displayed in shopping list page");
				}
			}
			catch(Exception e)
			{
				Assert.fail("Error in Email list  or print list button in shopping list page");
			}
			obj.movetoElementofAPage(driver, shoppinglistpage.click_Weekly_Ad_Filter_Checkbox);
			if(totalprod.size()!=0)
			{
				prodsummary=shoppinglistpage.txt_Product_Summary_Text;
				price= shoppinglistpage.txt_Product_Price_Text;
				Delete=shoppinglistpage.click_Weekly_Ad_Items_Delete_Icon;
				qty = shoppinglistpage.txt_Quantity_CheckBox;
				checkbox=shoppinglistpage.click_Select_Items_CheckBox;
			}
			else
			{
				prodchk=false;
				Assert.fail("Error in total products");
			}
	        
			String editqty="";
	        int size=totalprod.size();
			String item="";
			String summary="";
		    String desc="";
		    String pric="";
		    String product1="";
		    String product2="";
		    int itemnumber=0;
		    boolean chk=false;
		    boolean finished = false;
		    new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
			
			if(actionverify.equalsIgnoreCase("editqty"))
			{	
				editqty=Readexcel_RowName.getValue("Edit_QTY");
				
			}
			else if(actionverify.equalsIgnoreCase("Delete_Multipleitems"))
			{
				product1=Readexcel_RowName.getValue("product1");
				product2=Readexcel_RowName.getValue("product2");
			}
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
		    				try
		    				{
		    					proddesc= shoppinglistpage.txt_Product_Description_Text;
		    					desc=proddesc.get(k).getText();
		    					desc = desc.replace(".", "");
		    					desc = desc.replace("/", "");
		    				}
		    				catch(Exception e)
		    				{
		    					desc="";
		    				}
		    				proddetails =  proddetails.replace(".", "");
		    				proddetails = proddetails.replace("/", "");		
		    				pric=price.get(k).getText();
				    		pric = pric.replace(".", "");
				    		pric = pric.replace("/", "");
				    		
				    		if(actionverify.equalsIgnoreCase("Added"))
				    		{
				    			
				    			if(proddetails.equalsIgnoreCase(summary+" "+pric+" "+desc))
				    			{
				    				if(editqty.equalsIgnoreCase("1"))
									{
				    					chk=true;
				    					finished=true;
				    					break outerloop;
									}
				    				else
				    				{
				    					Assert.fail("Default quantity 1 is not displaying for Products added in shoppinglist");
				    				}
				    			}
				    		}
				    		else if(actionverify.equalsIgnoreCase("Removed"))
				    		{			    						
				    			if(proddetails.equalsIgnoreCase(summary+" "+pric+" "+desc))
				    			{
				    				chk=true;
				    				finished=true;
				    				break outerloop;
				    			}
				    		}
				    		else if(actionverify.equalsIgnoreCase("DeleteIcon_Removedfromshoppinglist"))
				    		{
				    					
				    			if(proddetails.equalsIgnoreCase(summary+" "+pric+" "+desc))
				    			{
				    				
				    				chk=true;
				    				finished=true;
				    				this.proddetails=proddetails;
				    				Delete.get(k).click();
				    				Thread.sleep(3000);
				    				break outerloop;	
				    				
				    			}
				    				
				    		}
				    		else if(actionverify.equalsIgnoreCase("DeleteAllButton_Removedfromshoppinglist"))
				    		{
				    					
				    			if(proddetails.equalsIgnoreCase(summary+" "+pric+" "+desc))
				    			{
				    				
				    				chk=true;
				    				finished=true;
				    				this.proddetails=proddetails;
				    				checkbox.get(k).click();
				    				obj.movetoElementofAPage_Click(driver, shoppinglistpage.click_Remove_All_Checked_Items_Button);
				    				Thread.sleep(3000);
				    				break outerloop;		    						
				    			}
				    				
				    		}
				    		else if(actionverify.equalsIgnoreCase("Delete_Multipleitems"))
				    		{		
				    			if(product1.equalsIgnoreCase(summary+" "+pric+" "+desc))
				    			{				    			
				    				checkbox.get(k).click();				    		
				    				itemnumber+=1;
				    			}
				    			else if(product2.equalsIgnoreCase(summary+" "+pric+" "+desc))
				    			{
				    				checkbox.get(k).click();				    		
				    				itemnumber+=1;		    										    			
				    			}
				    			int val=Integer.parseInt(proddetails);
				    			if(itemnumber==val)
				    			{
				    				chk=true;
				    				finished=true;				    				
				    				obj.movetoElementofAPage_Click(driver, shoppinglistpage.click_Remove_All_Checked_Items_Button);
				    				Thread.sleep(3000);
				    				break outerloop;
				    			}
				    		}
				    		else if(actionverify.equalsIgnoreCase("editqty"))
							{
								if(proddetails.equalsIgnoreCase(summary+" "+pric+" "+desc))
								{	
									if(editqty.equalsIgnoreCase(qty.get(k).getText()))
									{
										finished=true;
										chk=true;
										Thread.sleep(3000);
								
										break outerloop;
									}
									else
									{
										Assert.fail("Quantity not changed");
									}
								}
							}
				    		else if(actionverify.equalsIgnoreCase(""))
				    		{
				    			
				    		}
				    		else
				    		{
				    			Assert.fail("Check action verify parameter forn shopping list");
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
		    
		    else if(actionverify.equalsIgnoreCase("Delete_Multipleitems"))
		    {
		    	if(chk==false)
		    	{
		    		driver.close();
		    		Assert.fail("Multiple Products are not removed from shoppinglist by selecting and clicking delete all items button");
		    		
		    	}
		    	else
		    	{
		    		Reporter.log("Multiple Products are not removed from shoppinglist by selecting and clicking delete all items button");
		    	}
		    }
		    else if(actionverify.equalsIgnoreCase(""))
		    {
		    	Reporter.log("verified shopping list only as expected");
		    }
		    if(actionverify.equalsIgnoreCase("editqty"))
		    {
		    	if(chk==false)
		    	{
		    		//driver.close();
		    		Assert.fail("Edited Quantity is not updated in shopping list");
		    		
		    	}
		    	else
		    	{
		    		Reporter.log("Edited Quantity is updated in shopping list");
		    	}
		    }
		    else
    		{
		    	System.out.println("");
    			Assert.fail("Check action verify parameter from shopping list");
    		}
		    obj.waitForElementClickable(driver, shoppinglistpage.click_Close_Button);
		    shoppinglistpage.click_click_Close_Button();
		    	
	    }
	    catch(Exception e)
	    {
	    	//driver.close();
	    	System.out.println(e);
	    	Assert.fail("Error in shopping list");
	    	
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
			System.out.println(scl);
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
	        
	       
			if(shoppinglistpage.isSelected_click_Weekly_Ad_Filter_Checkbox())
			{
				shoppinglistpage.click_click_Weekly_Ad_Filter_Checkbox();
			}
			if(!shoppinglistpage.isSelected_click_Coupons_Filter_Checkbox())
			{
				shoppinglistpage.click_click_Coupons_Filter_Checkbox();
				obj.waitForElementselected(driver, shoppinglistpage.click_Coupons_Filter_Checkbox);
			}
			if(shoppinglistpage.isSelected_click_MyItem_Filter_Checkbox())
			{
				shoppinglistpage.click_click_MyItem_Filter_Checkbox();
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
	
	
	public WebDriver Add_Remove_MyItems_ShoppingList(WebDriver driver,String Functionality,String TCName, int count,String action) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_ShoppingListPage shoppinglistpage = new POM_Generated_ShoppingListPage(driver);
		Data obj=new Data();
		Robot rb = new Robot();
		String prodname="";
	    try
	    { 	   
	    	
		    obj.waitForElement(driver, shoppinglistpage.txt_List_Count_Text);
			String sc=shoppinglistpage.getText_txt_List_Count_Text();
			count=Integer.parseInt(sc);
			
			obj.waitForElementClickable(driver, shoppinglistpage.click_List_icon_Button);
			shoppinglistpage.click_click_List_icon_Button();
	        obj.waitForElement(driver,shoppinglistpage.click_Close_Button);
	        
	        rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			obj.scrollingToTop(driver);
	        
			if(shoppinglistpage.isSelected_click_Weekly_Ad_Filter_Checkbox())
			{
				shoppinglistpage.click_click_Weekly_Ad_Filter_Checkbox();
				obj.waitForElementselected(driver, shoppinglistpage.click_Weekly_Ad_Filter_Checkbox);
			}
			if(shoppinglistpage.isSelected_click_Coupons_Filter_Checkbox())
			{
				shoppinglistpage.click_click_Coupons_Filter_Checkbox();
	        }
			if(!shoppinglistpage.isSelected_click_MyItem_Filter_Checkbox())
			{
				shoppinglistpage.click_click_MyItem_Filter_Checkbox();
				obj.waitForElementselected(driver, shoppinglistpage.click_MyItem_Filter_Checkbox);
	        }
			Thread.sleep(2000);		
			try 
			{
				obj.movetoElementofAPage(driver, shoppinglistpage.click_Remove_All_Checked_Items_Button);
				if(!shoppinglistpage.isEnabled_click_Remove_All_Checked_Items_Button())
				{
					Reporter.log("Remove all checked items button is disabled pre selection");
				}
				else
				{
					//Assert.fail("Remove all checked items button is enabled pre selection");
				}
			}
			catch(Exception e)
			{
				Assert.fail("Error in Remove all checked items button");
			}
			
			try
			{
				if(shoppinglistpage.isDisplayed_click_Print_List_Button())
				{
					Reporter.log("Print list button is displayed in shopping list page");
				}
				else
				{
					Assert.fail("Print list button is not displayed in shopping list page");
				}
				if(shoppinglistpage.isDisplayed_click_Email_List_Button())
				{
					Reporter.log("Email list button is displayed in shopping list page");
				}
				else
				{
					Assert.fail("Email list button is not displayed in shopping list page");
				}
			}
			catch(Exception e)
			{
				Assert.fail("Error in Email list or print list button in shopping list page");
			}
			
			obj.movetoElementofAPage(driver, shoppinglistpage.click_Weekly_Ad_Filter_Checkbox);
			
			obj.waitForElementClickable(driver, shoppinglistpage.txt_ADD_An_Item_Text_Field);
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
			prodname=Readexcel_RowName.getValue("Add_An_Item");
			if(action.equalsIgnoreCase("Add"))
			{				
				
				shoppinglistpage.type_txt_ADD_An_Item_Text_Field(prodname);
				shoppinglistpage.click_click_ADD_An_Item_Icon();
				Thread.sleep(1000);
				Reporter.log("Clicked add an item button in shopping list");
				this.count=count+1;
			}
			else if(action.equalsIgnoreCase("Remove"))
			{
				boolean prodchk=true;
				String item="";
				totalprod= shoppinglistpage.txt_MyItem_Product_Name;
				Delete=shoppinglistpage.click_MyItem_Delete_Icon;
				if(totalprod.size()==0)
				{
					prodchk=false;
				}
				int size=totalprod.size();	
				
				boolean finished = false;
				if(prodchk==true) 
				{
					outerloop:
					for(int k=0;k<size;k++)
					{		
						for(int j=0;j<size && finished==false;j++)
						{    	
							item= totalprod.get(k).getText();
							System.out.println("item"+item);
							if(item.isEmpty())
							{
								rb.keyPress(KeyEvent.VK_DOWN);
								rb.keyRelease(KeyEvent.VK_DOWN);
						   	}
							else if(prodname.equalsIgnoreCase(item))
							{	
				    				finished=true;
				    				Delete.get(k).click();
				    				Thread.sleep(3000);
				    				this.count=count-1;
				    				Reporter.log("Clicked delete icon in shopping list for myitems");
				    				break outerloop;		    						
				    		}				    		
						}
				  	}
				}   
				
			}
			obj.waitForElementClickable(driver, shoppinglistpage.click_Close_Button);
			shoppinglistpage.click_click_Close_Button();	  
	    }
	    catch(Exception e)
	    {
	    	//driver.close();
	    	System.out.println(e);
	    	Assert.fail("Error in shopping list");
	    	
	    }
	
	    return driver;  	  
	}
	
	
	public WebDriver Check_MyItems_ShoppingList(WebDriver driver,String Functionality,String TCName,int count,String actionverify) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_ShoppingListPage shoppinglistpage = new POM_Generated_ShoppingListPage(driver);
		Data obj=new Data();
		Robot rb = new Robot();
		String prodname="";
		String editname="";
		String editqty="";
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
	        boolean chk=false;
	        rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			obj.scrollingToTop(driver);
	        
			if(shoppinglistpage.isSelected_click_Weekly_Ad_Filter_Checkbox())
			{
				shoppinglistpage.click_click_Weekly_Ad_Filter_Checkbox();
				
			}
			if(shoppinglistpage.isSelected_click_Coupons_Filter_Checkbox())
			{
				shoppinglistpage.click_click_Coupons_Filter_Checkbox();
	        }
			if(!shoppinglistpage.isSelected_click_MyItem_Filter_Checkbox())
			{
				shoppinglistpage.click_click_MyItem_Filter_Checkbox();
				obj.waitForElementselected(driver, shoppinglistpage.click_MyItem_Filter_Checkbox);
	        }
			String item="";
			totalprod= shoppinglistpage.txt_MyItem_Product_Name;
			checkbox=shoppinglistpage.txt_Quantity_CheckBox;
			if(totalprod.size()==0)
			{
				prodchk=false;
			}
			int size=totalprod.size();	
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
			prodname=Readexcel_RowName.getValue("Add_An_Item");
			if(actionverify.equalsIgnoreCase("myitemname_Edited")||actionverify.equalsIgnoreCase("myitemqty_Edited"))
			{
				editname=Readexcel_RowName.getValue("Edit_Item_Name");
				editqty=Readexcel_RowName.getValue("Edit_QTY");
				
			}
			
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
							if(actionverify.equalsIgnoreCase("Added"))
							{
								if(prodname.equalsIgnoreCase(item))
								{	
									finished=true;
									chk=true;
									Thread.sleep(3000);
								
									break outerloop;		
								}
							}
							else if(actionverify.equalsIgnoreCase("Removed"))
							{
								if(prodname.equalsIgnoreCase(item))
								{	
									finished=true;
									chk=true;
									Thread.sleep(3000);
								
									break outerloop;		
								}
							}
							
							else if(actionverify.equalsIgnoreCase("myitemname_Edited"))
							{
							
								if(editname.equalsIgnoreCase(item))
								{	
									finished=true;
									chk=true;
									Thread.sleep(3000);								
									break outerloop;
									
								}
							}
							else if(actionverify.equalsIgnoreCase("myitemqty_Edited"))
							{
								if(prodname.equalsIgnoreCase(item)||editname.equalsIgnoreCase(item))
								{	
									if(editqty.equalsIgnoreCase(checkbox.get(k).getText()))
									{
										Reporter.log("Quantity for my items has been updated after editing");
										finished=true;
										chk=true;
										Thread.sleep(3000);							
										break outerloop;
									}
									else
									{
										Assert.fail("Quantity not changed");
									}
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
		    		Assert.fail("Products are not displaying in shoppinglist when items added from myitems");
		    		
		    	}
		    	else
		    	{
		    		Reporter.log("Products added in shopping list when items added from myitems");
		    	}
		    }
			else if(actionverify.equalsIgnoreCase("myitemname_Edited"))
		    {
		    	if(chk==false)
		    	{
		    		//driver.close();
		    		Assert.fail("Products are not displaying in shoppinglist when items Edited from myitems");
		    		
		    	}
		    	else
		    	{
		    		Reporter.log("Products Edited in shopping list when items added from myitems");
		    	}
		    }
		    else if(actionverify.equalsIgnoreCase("Removed"))
		    {
		    	if(chk==true)
		    	{
		    		driver.close();
		    		Assert.fail("Products are displaying in shoppinglist when items removed from myitems");
		    		
		    	}
		    	else
		    	{
		    		Reporter.log("Products removed in shopping list when items removed from myitems");
		    	}
		    }
			obj.waitForElementClickable(driver, shoppinglistpage.click_Close_Button);
			shoppinglistpage.click_click_Close_Button();
		}
	    catch(Exception e)
	    {
	    	//driver.close();
	    	System.out.println(e);
	    	Assert.fail("Error in myitems shopping list");
	    	
	    }
	
	    return driver;  	  
	}

	
	public WebDriver Edit_ShoppingList(WebDriver driver,String Functionality,String TCName,String proddetails,String filter, String Editaction) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_ShoppingListPage shoppinglistpage = new POM_Generated_ShoppingListPage(driver);
		
		Data obj=new Data();
		Robot rb = new Robot();
		String prodname="";
		String editname="";
		String editqty="";
	
	    try
	    { 	   
		    obj.waitForElement(driver, shoppinglistpage.txt_List_Count_Text);
			
			obj.waitForElementClickable(driver, shoppinglistpage.click_List_icon_Button);
			shoppinglistpage.click_click_List_icon_Button();
	        obj.waitForElement(driver,shoppinglistpage.click_Close_Button);      
	        boolean prodchk=true;      
	        rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			
			obj.scrollingToTop(driver);
	        if (filter.equalsIgnoreCase("Weeklyad"))
	        {
	        	if(!shoppinglistpage.isSelected_click_Weekly_Ad_Filter_Checkbox())
	        	{
	        		shoppinglistpage.click_click_Weekly_Ad_Filter_Checkbox();
	        		obj.waitForElementselected(driver, shoppinglistpage.click_Weekly_Ad_Filter_Checkbox);
				
	        	}
	        	if(shoppinglistpage.isSelected_click_Coupons_Filter_Checkbox())
				{
					shoppinglistpage.click_click_Coupons_Filter_Checkbox();
		        }
				if(shoppinglistpage.isSelected_click_MyItem_Filter_Checkbox())
				{
					shoppinglistpage.click_click_MyItem_Filter_Checkbox();					
		        }
				
				Thread.sleep(2000);
				totalprod= shoppinglistpage.txt_Total_Products_Text;
				if(totalprod.size()!=0)
				{
					
					prodsummary=shoppinglistpage.txt_Product_Summary_Text;
					price= shoppinglistpage.txt_Product_Price_Text;
					Delete=shoppinglistpage.click_Weekly_Ad_Items_Delete_Icon;
					
					qty = shoppinglistpage.txt_Quantity_CheckBox;
					
					checkbox=shoppinglistpage.click_Select_Items_CheckBox;			
				}
				else
				{
					prodchk=false;
					Assert.fail("Error in total products");
				}
				
		        int size=totalprod.size();
		       
		        new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
				editqty=Readexcel_RowName.getValue("Edit_QTY");
			
				String item="";
				String summary="";
			    String desc="";
			    String pric="";
			    boolean finished = false;
			    
			    System.out.println(proddetails);
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
			    				try
			    				{
			    					proddesc= shoppinglistpage.txt_Product_Description_Text;
			    					desc=proddesc.get(k).getText();
			    					desc = desc.replace(".", "");
			    					desc = desc.replace("/", "");
			    				}
			    				catch(Exception e)
			    				{
			    					desc="";
			    				}
			    				proddetails =  proddetails.replace(".", "");
			    				proddetails = proddetails.replace("/", "");		
			    				pric=price.get(k).getText();
					    		pric = pric.replace(".", "");
					    		pric = pric.replace("/", "");
					    				
					    		if(proddetails.equalsIgnoreCase(summary+" "+pric+" "+desc))
					    		{
					    			
					    			if(Editaction.equalsIgnoreCase("editqty"))
									{
										qty.get(k).sendKeys(Keys.ENTER+""+Keys.CONTROL + "a"+Keys.DELETE);
										driver.findElement(By.xpath("//input[@class='form-control item-quantity']")).sendKeys(editqty);
										Thread.sleep(1000); 	
					    				finished=true;
					    				break outerloop;
					    			}
					    			
					    		}
			    			}
			    		}
			    	}
			    }
	        }
	       
	        else if(filter.equalsIgnoreCase("myitems"))
	        {
	        	if(shoppinglistpage.isSelected_click_Weekly_Ad_Filter_Checkbox())
	        	{
	        		shoppinglistpage.click_click_Weekly_Ad_Filter_Checkbox();				
	        	}
	        	if(shoppinglistpage.isSelected_click_Coupons_Filter_Checkbox())
				{
					shoppinglistpage.click_click_Coupons_Filter_Checkbox();
					
		        }
				if(!shoppinglistpage.isSelected_click_MyItem_Filter_Checkbox())
				{
					shoppinglistpage.click_click_MyItem_Filter_Checkbox();
					obj.waitForElementselected(driver, shoppinglistpage.click_MyItem_Filter_Checkbox);
		        }
	        
				 boolean finished = false;
			        String item="";
					totalprod= shoppinglistpage.txt_MyItem_Product_Name;
					qty=shoppinglistpage.txt_Quantity_CheckBox;
					if(totalprod.size()==0)
					{
						prodchk=false;
					}
					int size=totalprod.size();
					new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
					prodname=Readexcel_RowName.getValue("Add_An_Item");
					editname=Readexcel_RowName.getValue("Edit_Item_Name");
					editqty=Readexcel_RowName.getValue("Edit_QTY");
					
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
									if(prodname.equalsIgnoreCase(item)||editname.equalsIgnoreCase(item))
									{	
										finished=true;
										
										Thread.sleep(3000);
										if(Editaction.equalsIgnoreCase("edititem"))
										{
											
											totalprod.get(k).sendKeys(Keys.ENTER+""+Keys.CONTROL + "a"+Keys.DELETE);
											driver.findElement(By.xpath("//input[@class='form-control item-name']")).sendKeys(editname);
											Thread.sleep(1000);
											 
										}
										else if(Editaction.equalsIgnoreCase("editqty"))
										{
											System.out.println("editqty");
											qty.get(k).sendKeys(Keys.ENTER+""+Keys.CONTROL + "a"+Keys.DELETE);
											driver.findElement(By.xpath("//input[@class='form-control item-quantity']")).sendKeys(editqty);
											Thread.sleep(1000); 
											System.out.println("done");
										}
										break outerloop;		
									}		
								}
							}
					  	}
					}   
	        }
			obj.waitForElementClickable(driver, shoppinglistpage.click_Close_Button);
			shoppinglistpage.click_click_Close_Button();
		}
	    catch(Exception e)
	    {
	    	//driver.close();
	    	System.out.println(e);
	    	Assert.fail("Error in shopping list");
	    	
	    }
	
	    return driver;  	  
	}
	
	public String getproddetails() 
	{
		return proddetails;
	}
	public int getcount() 
	{
		return count;
	}
}
