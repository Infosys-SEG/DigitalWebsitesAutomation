package executableClass;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BrowserHelper.BrowserFactory;

import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_Homepage;


public class Browserbanner 
{
	
	public WebDriver BrowserBanner(WebDriver driver, String Functionality) throws InterruptedException, IOException 
	{
		
		BrowserFactory browserFactory = new BrowserFactory();
		
		
		String Winndixie="https://scqa.winndixie.com";
		String Bilo="https://scqa.bi-lo.com";
		String Harveys="https://scqa.harveyssupermarkets.com";
		String url = null;
		String browser = null;
		String func=Functionality;
		
	 
	   new Readexcel_RowName().excelRead("Global_TestData_Sheet", "Global", func);
	
		
		
		if(Readexcel_RowName.getValue("Chrome(Y/N)").equalsIgnoreCase("Y"))
		{
			browser="Chrome";
		}
			
		else if(Readexcel_RowName.getValue("IE(Y/N)").equalsIgnoreCase("Y"))
		{
			browser="IE";
		}
		if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
		{
			url=Winndixie;
			
		}
		else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
		{
			url=Bilo;
			
		}
		else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
		{
			url=Harveys;
			
		}
			
		
		driver=browserFactory.startbrowser(browser, url);
		
		return driver ;
	}
	
	
	public WebDriver Clearcookie(WebDriver driver, String Functionality) throws InterruptedException, IOException 
	{
		
		
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		Data obj = new Data();
		WebElement logo = null;
	 
	   new Readexcel_RowName().excelRead("Global_TestData_Sheet", "Global", Functionality);
	
		
		if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
		{
			
			logo=homepage.click_Winndixie_logo;
		}
		else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
		{
			
			logo = homepage.click_Bilo_logo;
		}
		else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
		{
			
			logo = homepage.click_Harveys_logo;
		}
			
		
		obj.waitForElementClickable(driver, logo);
		homepage.click_click_Close_cookies_Button();
		obj.waitForElementClickable(driver, logo);
		logo.click();
		
		return driver ;
	}
}

