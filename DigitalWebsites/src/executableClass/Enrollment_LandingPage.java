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
		
		WebDriver driver = null;
		String functionality="Enrollment_LandingPage";
		Browserbanner browserbanner=new Browserbanner();
		Computed_Register register = new Computed_Register();
		
		@Test (priority=1)
		public void TC001_Enrollment_landing_page() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
		{
			//For getting current method name and passing as TCName
				
			String Functionality=functionality;
			Browserbanner br=new Browserbanner();
			driver=br.BrowserBanner(driver, functionality);
			driver=br.Clearcookie(driver, functionality);
			driver=register.Enrollment_Landing_Page(driver, Functionality);
			driver.close();
		}
}
