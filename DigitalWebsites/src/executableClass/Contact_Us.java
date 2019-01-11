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
	WebDriver driver = null;
	String functionality="Contact_Us";
	
	@Test
	public void TC001_ContactUs() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();
		Browserbanner br=new Browserbanner();
		Computed_ContactUs contactus=new Computed_ContactUs();
		driver= br.BrowserBanner(driver, functionality);
		
		driver= br.Clearcookie(driver, functionality);
		driver=contactus.ContactUs(driver, functionality, tcname);
		driver.close();
		
		
	}
	

}
