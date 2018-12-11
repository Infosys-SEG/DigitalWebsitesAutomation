package executableClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import computedClass.Computed_PreEnrollment_Flow;

public class Pre_Enrolled_Customers_Flow 
{
	WebDriver driver = null;
	String functionality = "Pre_Enrolled_Customers_Flow";
	Browserbanner browserbanner=new Browserbanner();
	Computed_PreEnrollment_Flow preenrollmentflow= new Computed_PreEnrollment_Flow();
	
	@Test
	public void TC001_EnrollNewProgram_Phonenumber () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String Functionality=functionality;
		driver=browserbanner.BrowserBanner(driver, Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver=preenrollmentflow.SignUpPage(driver);
		driver=preenrollmentflow.AccountLookupPage(driver, Functionality, TCName);
		driver=preenrollmentflow.ContactInfoPage(driver, Functionality, TCName);
		driver=preenrollmentflow.AccountSecurityPage(driver, Functionality, TCName);
		driver.close();
	}
	
	@Test
	public void TC002_EnrollinNewProgram_old_SEG_CRC_number () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String Functionality=functionality;
		driver=browserbanner.BrowserBanner(driver, Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver=preenrollmentflow.SignUpPage(driver);
		driver=preenrollmentflow.AccountLookupPage(driver, Functionality, TCName);
		driver=preenrollmentflow.ContactInfoPage(driver, Functionality, TCName);
		driver=preenrollmentflow.AccountSecurityPage(driver, Functionality, TCName);
		driver.close();
		
	}
	
	@Test
	public void TC003_EnrollinNewProgram_PlentiCardNumber () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String Functionality=functionality;
		driver=browserbanner.BrowserBanner(driver, Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver=preenrollmentflow.SignUpPage(driver);
		driver=preenrollmentflow.AccountLookupPage(driver, Functionality, TCName);
		driver=preenrollmentflow.ContactInfoPage(driver, Functionality, TCName);
		driver=preenrollmentflow.AccountSecurityPage(driver, Functionality, TCName);
		driver.close();
		
	}
	
	@Test
	public void TC004_EnrollinNewProgram_G_AND_G_card_number () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String Functionality=functionality;
		driver=browserbanner.BrowserBanner(driver, Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver=preenrollmentflow.SignUpPage(driver);
		driver=preenrollmentflow.AccountLookupPage(driver, Functionality, TCName);
		driver=preenrollmentflow.ContactInfoPage(driver, Functionality, TCName);
		driver=preenrollmentflow.AccountSecurityPage(driver, Functionality, TCName);
		driver.close();
		
	}
}
