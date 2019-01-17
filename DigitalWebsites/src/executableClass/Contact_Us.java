package executableClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import computedClass.Computed_ContactUs;

public class Contact_Us 
{
	WebDriver driver;
	String functionality = "Contact_Us";
	Browserbanner browserbanner =new Browserbanner();
	Computed_ContactUs contactus = new Computed_ContactUs();
	
	@Test(priority=1)
	public void TC001_ContactUs() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String Functionality = functionality;
		
		driver = browserbanner.BrowserBanner(driver, Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver = contactus.ContactUs(driver, Functionality, TCName);
		driver.close();
	}
	

}
