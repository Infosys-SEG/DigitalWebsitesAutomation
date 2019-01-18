package executableClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import computedClass.Computed_HomePage;

public class Global_Nav_Update
{
	WebDriver driver = null;
	String functionality="Global_Nav_Update";
	String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();
	@Test (priority=1)
	public void TC001_Rewards_link_in_Global_nav () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		Browserbanner browserbanner=new Browserbanner();
		
		Computed_HomePage homepage = new Computed_HomePage();
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver=browserbanner.Clearcookie(driver, functionality);
		driver=homepage.Home_general(driver, functionality);
		driver=homepage.Globalnavupdate(driver, functionality,TCName);
	    driver.close();
	}
	
}
