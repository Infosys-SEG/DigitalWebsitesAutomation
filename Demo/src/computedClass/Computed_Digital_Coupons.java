package computedClass;
import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_DigitalCouponsPage;
import generatedClass.POM_Generated_HardLoginPage;
import generatedClass.POM_Generated_Homepage;
import generatedClass.POM_Generated_ShoppingListPage;


public class Computed_Digital_Coupons 
{
	private String prod;
	private int count;

	public WebDriver Loggedout_Coupons_Link(WebDriver driver, String Functionality,String prod,int count) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage=new POM_Generated_Homepage(driver);
		POM_Generated_DigitalCouponsPage couponspage= new POM_Generated_DigitalCouponsPage(driver);
		POM_Generated_HardLoginPage hardloginpage = new POM_Generated_HardLoginPage(driver);
		Data obj=new Data();
		
		WebElement logo = null;		
		boolean aa=true; 	
		String value="";
		
	    new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global",Functionality);
    	if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
    	{
    		value="winndixie";
    		logo=homepage.click_Winndixie_logo; 		
    	}
    	else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
    	{
    		value="bi-lo";
    		logo=homepage.click_Bilo_logo;
    	}
    	else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
    	{
    		value="harveyssupermarkets";
    		logo=homepage.click_Harveys_logo;
    	}
    	String coup="https://"+value+".pdn.retaileriq.com";
	    String ie="Windows Security";
	    String bro="";
		if(Readexcel_RowName.getValue("Chrome(Y/N)").equalsIgnoreCase("Y"))
		{
			bro= coup;
		}	
		else if(Readexcel_RowName.getValue("IE(Y/N)").equalsIgnoreCase("Y"))
		{
			bro=ie;
		}
		String Val = obj.popuppath()+" "+bro;
		try
		{
			
	        obj.waitForElementClickable(driver, logo);
			logo.click();

			obj.waitForElementClickable(driver, homepage.click_Savings_link_Hover);
			Runtime.getRuntime().exec(Val);
			homepage.hover_click_Savings_link_Hover();
			
			homepage.click_click_Savings_Coupon_Button();
			
					
			obj.waitForElementClickable(driver, couponspage.click_Digital_Coupon_page_Link);
			couponspage.click_click_Digital_Coupon_page_Link();
			obj.waitForElementClickable(driver, couponspage.click_Digital_Coupon_page_Link);
			Thread.sleep(1000);
		
			List<WebElement> buttons= couponspage.click_Digital_Coupon_Add_Button;
			int sizee=buttons.size();
			for(int n=1;n<sizee;n++)
			{
				if(aa==true)
				{
					if(buttons.get(n).isDisplayed())
					{	
						obj.scrollingToElementofAPage(driver, buttons.get(n));
						buttons.get(n).click();	
						aa=false;		
					}
				}	
			}
			
			obj.movetoElementofAPage(driver, homepage.click_HardLogin_button);
			obj.waitForElementClickable(driver, homepage.click_HardLogin_button);
			homepage.click_click_HardLogin_button();
			obj.waitForElementClickable(driver, hardloginpage.click_Popup_Close_Button);
			hardloginpage.click_click_Popup_Close_Button();	
			
			
		}
		catch(Exception e)
		{
			Assert.fail("Error in Digital coupons page");
			
		}	
		return driver;	
			
	}
	
	public WebDriver Loggedout_Coupons_Homepage(WebDriver driver, String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage=new POM_Generated_Homepage(driver);
		POM_Generated_DigitalCouponsPage couponspage= new POM_Generated_DigitalCouponsPage(driver);
		POM_Generated_HardLoginPage hardloginpage = new POM_Generated_HardLoginPage(driver);
		
		Data obj=new Data();
		WebElement logo = null;		
		boolean aa=true; 	
		String value="";
		
	    new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global",Functionality);
    	if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
    	{
    		value="winndixie";
    		logo=homepage.click_Winndixie_logo;   		
    	}
    	else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
    	{
    		value="bi-lo";
    		logo=homepage.click_Bilo_logo;
    	}
    	else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
    	{
    		value="harveyssupermarkets";
    		logo=homepage.click_Harveys_logo;
    	}
    	String coup="https://"+value+".pdn.retaileriq.com";
	    String ie="Windows Security";
	    String bro="";
		if(Readexcel_RowName.getValue("Chrome(Y/N)").equalsIgnoreCase("Y"))
		{
			bro= coup;
		}	
		else if(Readexcel_RowName.getValue("IE(Y/N)").equalsIgnoreCase("Y"))
		{
			bro=ie;
		}
		String Val = obj.popuppath()+" "+bro;
		try
		{
			obj.waitForElementClickable(driver, logo);
			
			logo.click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec(Val);
			homepage.click_click_Digitial_Coupons_Logo();
			obj.waitForElementClickable(driver, couponspage.click_Digital_Coupon_page_Link);
			couponspage.click_click_Digital_Coupon_page_Link();
			obj.waitForElementClickable(driver, couponspage.click_Digital_Coupon_page_Link);
			Thread.sleep(1000);
		
			List<WebElement> buttons= couponspage.click_Digital_Coupon_Add_Button;
			int sizee=buttons.size();
			for(int n=1;n<sizee;n++)
			{
				if(aa==true)
				{
					obj.movetoElementofAPage(driver, buttons.get(n));
					if(buttons.get(n).isDisplayed())
					{	
						obj.movetoElementofAPage(driver, buttons.get(n));
						//obj.scrollingToElementofAPage(driver, buttons.get(n));
						buttons.get(n).click();	
						aa=false;		
					}
				}	
			}
			
			
			obj.movetoElementofAPage(driver, homepage.click_HardLogin_button);
			obj.waitForElementClickable(driver, homepage.click_HardLogin_button);
			homepage.click_click_HardLogin_button();
			obj.waitForElementClickable(driver, hardloginpage.click_Popup_Close_Button);
			hardloginpage.click_click_Popup_Close_Button();	
		}
		catch(Exception e)
		{
		System.out.println(e);	
			Assert.fail("Error in Digital coupons page");
			
		}	
		return driver;	
			
	}
	
	public WebDriver Loggedin_Coupons_Link(WebDriver driver, String Functionality,String prod,int count) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage=new POM_Generated_Homepage(driver);
		POM_Generated_DigitalCouponsPage couponspage= new POM_Generated_DigitalCouponsPage(driver);
		POM_Generated_ShoppingListPage shoppinglistpage = new POM_Generated_ShoppingListPage(driver);
		Data obj=new Data();
		String cont = null;
		WebElement logo = null;		
		boolean aa=true; 	
		String value="";
		

	    new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global",Functionality);
    	if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
    	{
    		value="winndixie";
    		logo=homepage.click_Winndixie_logo;   		
    	}
    	else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
    	{
    		value="bi-lo";
    		logo=homepage.click_Bilo_logo;
    	}
    	else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
    	{
    		value="harveyssupermarkets";
    		logo=homepage.click_Harveys_logo;
    	}
    	String coup="https://"+value+".pdn.retaileriq.com - Google Chrome";
	    String ie="Windows Security";
	    String bro="";
		if(Readexcel_RowName.getValue("Chrome(Y/N)").equalsIgnoreCase("Y"))
		{
			bro= coup;
		}	
		else if(Readexcel_RowName.getValue("IE(Y/N)").equalsIgnoreCase("Y"))
		{
			bro=ie;
		}
		String Val = obj.popuppath()+" "+bro;
		try
		{
			obj.waitForElementClickable(driver, logo);	
		
			logo.click();
		
			obj.waitForElementClickable(driver, homepage.click_Savings_Coupon_Button);	
						
			//To handle window pop up Authentication				
			Runtime.getRuntime().exec(Val);
					
			homepage.hover_click_Savings_link_Hover();
			homepage.click_click_Savings_Coupon_Button();
		
			obj.waitForElementClickable(driver, couponspage.click_Digital_Coupon_page_Link);
			couponspage.click_click_Digital_Coupon_page_Link();
			obj.waitForElementClickable(driver, couponspage.click_Digital_Coupon_page_Link);
			
			
			List<WebElement> buttons= couponspage.click_Digital_Coupon_Add_Button;
			List<WebElement> prodsummary=couponspage.txt_Digital_Coupon_Prod_summary_Text;
			List<WebElement> proddesc=couponspage.txt_Digital_Coupon_Prod_Desc_Text;
			int sizee=buttons.size();
				
			for(int n=1;n<sizee;n++)
			{
				if(aa==true)
				{
					if(buttons.get(n).isDisplayed())
					{	
						
						cont=shoppinglistpage.getText_txt_List_Count_Text();
						count = Integer.parseInt(cont);
						this.count=count;
						prod=prodsummary.get(n).getText()+" "+proddesc.get(n).getText();
		  					
						this.prod=prod;
		  					
						obj.scrollingToElementofAPage(driver, buttons.get(n));
						buttons.get(n).click();
		  					
						try
						{
							if(couponspage.isDisplayed_click_Digital_Coupon_Paypal_Popup_Close_Button())
							{
								couponspage.click_click_Digital_Coupon_Paypal_Popup_Close_Button();
							}
							else
							{
								aa=false;
							}
						}
						catch(NoSuchElementException e1)
						{
							aa=false;
						}
					}
				}
			}
			obj.waitForElementClickable(driver, shoppinglistpage.txt_List_Count_Text);
		}
		catch(Exception e)
		{
			Assert.fail("Error in Digital coupons page");
			
		}	
		return driver;			
	}
	
	public WebDriver Loggedin_Coupons_Homepage(WebDriver driver, String Functionality,String prod,int count) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage=new POM_Generated_Homepage(driver);
		POM_Generated_DigitalCouponsPage couponspage= new POM_Generated_DigitalCouponsPage(driver);
		POM_Generated_ShoppingListPage shoppinglistpage = new POM_Generated_ShoppingListPage(driver);
		
		Data obj=new Data();
		String cont = null;
		WebElement logo = null;		
		boolean aa=true; 	
		String value="";
		
	    
	    new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global",Functionality);
    	if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
    	{
    		value="winndixie";
    		logo=homepage.click_Winndixie_logo;   		
    	}
    	else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
    	{
    		value="bi-lo";
    		logo=homepage.click_Bilo_logo;
    	}
    	else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
    	{
    		value="harveyssupermarkets";
    		logo=homepage.click_Harveys_logo;
    	}
    	String coup="https://"+value+".pdn.retaileriq.com";
	    String ie="Windows Security";
	    String bro="";
		if(Readexcel_RowName.getValue("Chrome(Y/N)").equalsIgnoreCase("Y"))
		{
			bro= coup;
		}	
		else if(Readexcel_RowName.getValue("IE(Y/N)").equalsIgnoreCase("Y"))
		{
			bro=ie;
		}
		String Val = obj.popuppath()+" "+bro;
		try
		{
			obj.waitForElementClickable(driver, logo);	
			
			logo.click();
			
			Reporter.log("waiting for element");
			Thread.sleep(2000);
			
			
			//To handle window pop up Authentication				
			Runtime.getRuntime().exec(Val);
					
			homepage.click_click_Digitial_Coupons_Logo();
			obj.waitForElementClickable(driver, couponspage.click_Digital_Coupon_page_Link);
			couponspage.click_click_Digital_Coupon_page_Link();
			obj.waitForElementClickable(driver, couponspage.click_Digital_Coupon_page_Link);
			Thread.sleep(1000);
		
			List<WebElement> buttons= couponspage.click_Digital_Coupon_Add_Button;
			List<WebElement> prodsummary=couponspage.txt_Digital_Coupon_Prod_summary_Text;
			List<WebElement> proddesc=couponspage.txt_Digital_Coupon_Prod_Desc_Text;
			int sizee=buttons.size();
				
			for(int n=1;n<sizee;n++)
			{
				if(aa==true)
				{
					if(buttons.get(n).isDisplayed())
					{	
		  					
						cont=shoppinglistpage.getText_txt_List_Count_Text();
						count = Integer.parseInt(cont);
						this.count=count;
						prod=prodsummary.get(n).getText()+" "+proddesc.get(n).getText();
		  					
						this.prod=prod;
						
						obj.scrollingToElementofAPage(driver, buttons.get(n));
						buttons.get(n).click();
						try
						{
							if(couponspage.isDisplayed_click_Digital_Coupon_Paypal_Popup_Close_Button())
							{
								couponspage.click_click_Digital_Coupon_Paypal_Popup_Close_Button();
							}
							else
							{
								aa=false;
							}
						}
						catch(NoSuchElementException e1)
						{
							aa=false;
						}
		  			}
		  		}
		  	}
			obj.waitForElementClickable(driver, shoppinglistpage.txt_List_Count_Text);
		}
		catch(Exception e)
		{
			Assert.fail("Error in Digital coupons page");
			
		}	
		return driver;	
			
	}
	public int getcount() 
	{
		return count;
	}
	public String getprod() 
	{	
		return prod;
	}
}
