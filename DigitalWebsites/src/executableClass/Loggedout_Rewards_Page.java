package executableClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import computedClass.Computed_MyRewards;


public class Loggedout_Rewards_Page 

{
	WebDriver driver = null;
	String functionality="Loggedout_Rewards_Page";
	
	@Test(priority=1)
	public void TC001_Rewards_Page_for_Logged_Out_users () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner browserbanner=new Browserbanner();
	
		Computed_MyRewards loggedout = new Computed_MyRewards();
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver=browserbanner.Clearcookie(driver, functionality);
		
		driver=loggedout.loggedout_Myreward(driver, functionality, tcname);
		driver.close();
	}
}

