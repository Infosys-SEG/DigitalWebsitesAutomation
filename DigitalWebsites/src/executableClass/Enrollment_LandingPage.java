package executableClass;
import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import computedClass.Computed_Register;


public class Enrollment_LandingPage {
		
		WebDriver driver;
		String functionality = "Enrollment_LandingPage";
		Browserbanner browserbanner = new Browserbanner();
		Computed_Register register = new Computed_Register();
		
		@Test (priority=1)
		public void TC001_Enrollment_landing_page() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
		{	
			String Functionality=functionality;
			String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();
			driver = browserbanner.BrowserBanner(driver, Functionality);
			driver = browserbanner.Clearcookie(driver, Functionality);
			driver = register.Enrollment_Landing_Page(driver, Functionality,TCName);
			driver.close();
		}
}
