package executableClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.BrowserHelper.BrowserFactory;

public class chk 
{
	WebDriver driver;
	
	@Test
	public void BrowserBanner() throws InterruptedException, IOException 
	{
		
		BrowserFactory browserFactory = new BrowserFactory();
		driver=browserFactory.startbrowser("IE");
	}
}
