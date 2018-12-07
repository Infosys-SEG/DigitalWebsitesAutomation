package executableClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import computedClass.Computed_FullyEnrollment_Flow;

public class PII_Validation 
{
	WebDriver driver = null;
	String functionality="PII_Validation";
	
	@Test (priority=1)
	public void TC001_Select_PII_Verification_method_to_verify_customer_identity_using_Plenti_Card_number () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner browserbanner=new Browserbanner();
		Computed_FullyEnrollment_Flow FullyEnrollment_Flow = new Computed_FullyEnrollment_Flow();
	
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver= browserbanner.Clearcookie(driver, functionality);
		driver=FullyEnrollment_Flow.fullsignup(driver);
		driver=FullyEnrollment_Flow.fullcardnumber(driver,functionality, tcname);
		driver=FullyEnrollment_Flow.Verificationpage(driver,functionality, tcname);
		driver=FullyEnrollment_Flow.fullverifybypii(driver, functionality, tcname);
		driver.close();
	}
}
