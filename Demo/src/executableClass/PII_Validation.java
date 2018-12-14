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
	Browserbanner browserbanner=new Browserbanner();
	Computed_FullyEnrollment_Flow FullyEnrollment_Flow = new Computed_FullyEnrollment_Flow();
	
	@Test (priority=1)
	public void TC001_Select_PII_Verification_method_to_verify_customer_identity_using_Plenti_Card_number () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as TCName
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String Functionality=functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver= browserbanner.Clearcookie(driver, Functionality);
		driver=FullyEnrollment_Flow.SignUpPage(driver);
		driver=FullyEnrollment_Flow.AccountLookupPage(driver, Functionality, TCName);
		driver=FullyEnrollment_Flow.Verificationpage(driver, Functionality, TCName);
		driver=FullyEnrollment_Flow.VerifyByPIIPage(driver, Functionality, TCName);
		driver.close();
	}
	
	@Test (priority=2)
	public void TC013_Verify_that_if_customer_is_already_authenticated_with_cell_number () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String Functionality=functionality;	
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver= browserbanner.Clearcookie(driver, Functionality);
		driver=FullyEnrollment_Flow.SignUpPage(driver);
		driver=FullyEnrollment_Flow.AccountLookupPage(driver, Functionality, TCName);
		driver=FullyEnrollment_Flow.Verificationpage(driver, Functionality, TCName);
		driver=FullyEnrollment_Flow.VerifyByPIIPage(driver, Functionality, TCName);
		driver.close();
	}
	
	
	@Test (priority=3)
	public void TC019_Select_PII_Verification_method_to_verify_customer_identity_using_Registered_Phone_number () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String Functionality=functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver= browserbanner.Clearcookie(driver, Functionality);
		driver=FullyEnrollment_Flow.SignUpPage(driver);
		driver=FullyEnrollment_Flow.AccountLookupPage(driver, Functionality, TCName);
		driver=FullyEnrollment_Flow.Verificationpage(driver, Functionality, TCName);
		driver=FullyEnrollment_Flow.VerifyByPIIPage(driver, Functionality, TCName);
		driver.close();
	}
}
