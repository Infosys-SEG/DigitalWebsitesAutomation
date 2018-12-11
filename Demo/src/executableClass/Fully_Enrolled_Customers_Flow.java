package executableClass;
import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import computedClass.Computed_FullyEnrollment_Flow;
public class Fully_Enrolled_Customers_Flow 
{
	WebDriver driver = null;
	String functionality = "Fully_Enrolled_Customers_Flow";
	Browserbanner browserbanner=new Browserbanner();
	Computed_FullyEnrollment_Flow FullyEnrollment_Flow= new Computed_FullyEnrollment_Flow();
	
	@Test(priority=1)
	public void TC003_EnrollNewProgram_Phonenumber_VerifybyPII () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as TCName
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String Functionality=functionality;
		driver=browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver= FullyEnrollment_Flow.SignUpPage(driver);
		driver= FullyEnrollment_Flow.AccountLookupPage(driver, Functionality, TCName);
		driver=FullyEnrollment_Flow.Verificationpage(driver, Functionality, TCName);
		driver= FullyEnrollment_Flow.VerifyByPIIPage(driver, Functionality,TCName);
		driver=FullyEnrollment_Flow.ContactInfoPage(driver,Functionality, TCName);
		driver=FullyEnrollment_Flow.AccountSecurityPage(driver,Functionality, TCName);
	}
	
	@Test(priority=2)
	public void TC006_EnrollinNewProgram_old_SEG_CRC_number_VerifybyPII () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		
		//For getting current method name and passing as TCName
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String Functionality=functionality;	
		driver=browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver= FullyEnrollment_Flow.SignUpPage(driver);
		driver= FullyEnrollment_Flow.AccountLookupPage(driver, Functionality, TCName);
		driver=FullyEnrollment_Flow.Verificationpage(driver, Functionality, TCName);
		driver= FullyEnrollment_Flow.VerifyByPIIPage(driver, Functionality,TCName);
		driver=FullyEnrollment_Flow.ContactInfoPage(driver,Functionality, TCName);
		driver=FullyEnrollment_Flow.AccountSecurityPage(driver,Functionality, TCName);
	}
	
	@Test(priority=3)
	public void TC009_EnrollinNewProgram_PlentiCardNumber_VerifybyPII () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as TCName
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String Functionality=functionality;
		driver=browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver= FullyEnrollment_Flow.SignUpPage(driver);
		driver= FullyEnrollment_Flow.AccountLookupPage(driver, Functionality, TCName);
		driver=FullyEnrollment_Flow.Verificationpage(driver, Functionality, TCName);
		driver= FullyEnrollment_Flow.VerifyByPIIPage(driver, Functionality,TCName);
		driver=FullyEnrollment_Flow.ContactInfoPage(driver,Functionality, TCName);
		driver=FullyEnrollment_Flow.AccountSecurityPage(driver,Functionality, TCName);
	}
	
	@Test(priority=4)
	public void TC012_EnrollinNewProgram_G_AND_G_cardNumber_VerifybyPII () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		
		//For getting current method name and passing as TCName
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String Functionality=functionality;	
		
		driver=browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver= FullyEnrollment_Flow.SignUpPage(driver);
		
		driver= FullyEnrollment_Flow.AccountLookupPage(driver, Functionality, TCName);
		driver=FullyEnrollment_Flow.Verificationpage(driver, Functionality, TCName);
		driver= FullyEnrollment_Flow.VerifyByPIIPage(driver, Functionality,TCName);
		driver=FullyEnrollment_Flow.ContactInfoPage(driver,Functionality, TCName);
		driver=FullyEnrollment_Flow.AccountSecurityPage(driver,Functionality, TCName);
	}
}
