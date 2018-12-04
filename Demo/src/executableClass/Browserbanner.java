package executableClass;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.BrowserHelper.BrowserFactory;
import Utility.Readexcel_RowName;


public class Browserbanner 
{
	
	public WebDriver BrowserBanner(WebDriver driver, String Functionality) throws InterruptedException, IOException 
	{
		
		BrowserFactory browserFactory = new BrowserFactory();
		
		String Winndixie="http://scqa.winndixie.com";
		String Bilo="http://scqa.bi-lo.com";
		String Harveys="http://scqa.harveyssupermarkets.com";
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
}

