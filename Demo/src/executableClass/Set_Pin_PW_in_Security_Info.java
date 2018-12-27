package executableClass;
import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import computedClass.Computed_FullyEnrollment_Flow;
import computedClass.Computed_PreEnrollment_Flow;
import computedClass.Computed_SecurityInfo_ErrorValidation;

public class Set_Pin_PW_in_Security_Info {
	
	WebDriver driver = null;
	String functionality="Set_Pin_PW_in_Security_Info";
	Browserbanner browserbanner=new Browserbanner();
	Computed_FullyEnrollment_Flow fullyenrollmentflow = new Computed_FullyEnrollment_Flow();
	Computed_PreEnrollment_Flow preenrollmentflow= new Computed_PreEnrollment_Flow();
	Computed_SecurityInfo_ErrorValidation SecurityInfo= new Computed_SecurityInfo_ErrorValidation();
	
	@Test (priority=1)
	public void TC001_FullyEnrolled_NavigateTo_PasswordSetScreen_WithCardNumber () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();		
		String Functionality=functionality;
		driver=browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver=fullyenrollmentflow.SignUpPage(driver);
		driver=fullyenrollmentflow.AccountLookupPage(driver, Functionality, TCName);
		driver=fullyenrollmentflow.Verificationpage(driver, Functionality, TCName);
		driver=fullyenrollmentflow.VerifyByPIIPage(driver, Functionality, TCName);
		driver=fullyenrollmentflow.ContactInfoPage(driver, Functionality, TCName);
		driver=fullyenrollmentflow.AccountSecurityPage(driver, Functionality, TCName);
		driver.close();
	}
	
	@Test (priority=2)
	public void TC004_FullyEnrolled_NoPinNoPassword_WithCardNumber () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();		
		String Functionality=functionality;
		driver=browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver=fullyenrollmentflow.SignUpPage(driver);
		driver=fullyenrollmentflow.AccountLookupPage(driver, Functionality, TCName);
		driver=fullyenrollmentflow.Verificationpage(driver, Functionality, TCName);
		driver=fullyenrollmentflow.VerifyByPIIPage(driver, Functionality, TCName);
		driver=fullyenrollmentflow.ContactInfoPage(driver, Functionality, TCName);
		driver=fullyenrollmentflow.AccountSecurityPage(driver, Functionality, TCName);
		driver.close();
	}
	
	@Test (priority=3)
	public void TC011_FullyEnrolled_NavigateTo_PasswordSetScreen_WithPhoneNumber () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();		
		String Functionality=functionality;
		driver=browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver=fullyenrollmentflow.SignUpPage(driver);
		driver=fullyenrollmentflow.AccountLookupPage(driver, Functionality, TCName);
		driver=fullyenrollmentflow.Verificationpage(driver, Functionality, TCName);
		driver=fullyenrollmentflow.VerifyByPIIPage(driver, Functionality, TCName);
		driver=fullyenrollmentflow.ContactInfoPage(driver, Functionality, TCName);
		driver=fullyenrollmentflow.AccountSecurityPage(driver, Functionality, TCName);
		driver.close();
	}
	
	@Test(priority=4)
	public void TC013_PreEnrolled_NoPinNoPassword_WithCardNumber () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	
	{
		//For getting current method name and passing as tcname
				String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();		
				String Functionality=functionality;
				driver=browserbanner.BrowserBanner(driver, Functionality);
				driver=browserbanner.Clearcookie(driver, Functionality);
				driver=preenrollmentflow.SignUpPage(driver);
				driver = preenrollmentflow.AccountLookupPage(driver, Functionality, TCName);
				driver = preenrollmentflow.ContactInfoPage(driver, Functionality, TCName);
				driver = preenrollmentflow.AccountSecurityPage(driver, Functionality, TCName);
				driver.close();
		
	}
	
	@Test(priority=5)
	public void TC014_PreEnrolled_NoPinNoPassword_WithPhoneNumber () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	
	{
		//For getting current method name and passing as tcname
				String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();		
				String Functionality=functionality;
				driver=browserbanner.BrowserBanner(driver, Functionality);
				driver=browserbanner.Clearcookie(driver, Functionality);
				driver=preenrollmentflow.SignUpPage(driver);
				driver = preenrollmentflow.AccountLookupPage(driver, Functionality, TCName);
				driver = preenrollmentflow.ContactInfoPage(driver, Functionality, TCName);
				driver = preenrollmentflow.AccountSecurityPage(driver, Functionality, TCName);
				driver.close();
		
	}
	
	@Test(priority=6)
	public void TC015_FullyEnrolled_Check_T_And_C () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();		
		String Functionality=functionality;
		driver=browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver=fullyenrollmentflow.SignUpPage(driver);
		driver=fullyenrollmentflow.AccountLookupPage(driver, Functionality, TCName);
		driver=fullyenrollmentflow.Verificationpage(driver, Functionality, TCName);
		driver=fullyenrollmentflow.VerifyByPIIPage(driver, Functionality, TCName);
		driver=fullyenrollmentflow.ContactInfoPage(driver, Functionality, TCName);
		driver=fullyenrollmentflow.AccountSecurityPage(driver, Functionality, TCName);
		driver.close();
		
	}
	
	@Test(priority=7)
	public void TC016_PreEnrolled_Check_T_And_C () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();		
		String Functionality=functionality;
		driver = browserbanner.BrowserBanner(driver, Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver = preenrollmentflow.SignUpPage(driver);
		driver = preenrollmentflow.AccountLookupPage(driver, Functionality, TCName);
		driver = preenrollmentflow.ContactInfoPage(driver, Functionality, TCName);
		driver = preenrollmentflow.AccountSecurityPage(driver, Functionality, TCName);
		driver.close();
		
	}
	
	@Test(priority=8)
	public void TC006_FullyEnrolledUser_PasswordSetScreen_ErrorMessageValidation () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String Functionality=functionality;
		driver=browserbanner.BrowserBanner(driver, Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver=preenrollmentflow.SignUpPage(driver);
		driver=preenrollmentflow.AccountLookupPage(driver, Functionality, TCName);
		driver=preenrollmentflow.ContactInfoPage(driver, Functionality, TCName);
		driver=SecurityInfo.ResetPassword_ErrorMsgValidation(driver, Functionality, TCName);
		
		driver.close();
		
	}
	
	@Test(priority=9)
	public void TC008_FullyEnrolledUser_PinSetScreen_ErrorMessageValidation () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
	//For getting current method name and passing as TCName
			String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();
			String Functionality=functionality;
			driver=browserbanner.BrowserBanner(driver, Functionality);
			driver=browserbanner.Clearcookie(driver, Functionality);
			driver= fullyenrollmentflow.SignUpPage(driver);
			driver= fullyenrollmentflow.AccountLookupPage(driver, Functionality, TCName);
			driver=fullyenrollmentflow.Verificationpage(driver, Functionality, TCName);
			driver= fullyenrollmentflow.VerifyByPIIPage(driver, Functionality,TCName);
			driver=fullyenrollmentflow.ContactInfoPage(driver,Functionality, TCName);
			driver= SecurityInfo.ResetPIN_ErrorMsgValidation(driver, Functionality, TCName);
	}
	
	@Test(priority=10)
	public void TC007_Validate_ErrorMessage_If_Character_As_A_PINnumber () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String Functionality=functionality;
		driver=browserbanner.BrowserBanner(driver, Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver=preenrollmentflow.SignUpPage(driver);
		driver=preenrollmentflow.AccountLookupPage(driver, Functionality, TCName);
		driver=preenrollmentflow.ContactInfoPage(driver, Functionality, TCName);
		driver=SecurityInfo.PIN_Field_Validation(driver, Functionality, TCName);
		
	}
	
}