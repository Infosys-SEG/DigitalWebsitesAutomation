package executableClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import computedClass.Computed_HomePage;

public class Update_Footer 
{
	WebDriver driver = null;
	String functionality="Update_Footer";
	String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();
	@Test (priority=1)
	public void TC001_Rewards_Terms_and_conditions () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		Browserbanner browserbanner=new Browserbanner();
		
		Computed_HomePage homepage = new Computed_HomePage();
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver=browserbanner.Clearcookie(driver, functionality);
		driver=homepage.Home_general(driver, functionality);
		driver=homepage.Myrewardfooterlink(driver, functionality,tcname);
		driver.close();
	}

}
