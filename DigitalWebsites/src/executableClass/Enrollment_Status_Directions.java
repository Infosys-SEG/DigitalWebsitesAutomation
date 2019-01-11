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

public class Enrollment_Status_Directions {
	
	WebDriver driver = null;
	String functionality="Enrollment_Status_Directions";
	Computed_FullyEnrollment_Flow fullyenrolled = new Computed_FullyEnrollment_Flow();
	Computed_PreEnrollment_Flow preenrolled = new Computed_PreEnrollment_Flow();
	
	
	@Test(priority=1) 
	public void TC001_check_navigation_for_Fullyenrolled_User () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner br=new Browserbanner();
		driver=br.BrowserBanner(driver, functionality);
		driver=br.Clearcookie(driver, functionality);
		driver=fullyenrolled.SignUpPage(driver);
		driver=fullyenrolled.AccountLookupPage(driver, functionality, tcname);
		driver.close();
		
	}
	
	@Test(priority=2)
	public void TC002_check_navigation_for_PreEnrolled_User () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner br=new Browserbanner();
		driver=br.BrowserBanner(driver, functionality);
		driver=br.Clearcookie(driver, functionality);
		driver=preenrolled.SignUpPage(driver);
		driver=preenrolled.AccountLookupPage(driver, functionality, tcname);
		driver.close();
		
	}	
	
	@Test(priority=3)
	public void TC004_check_navigation_for_Fully_Enrolled_but_not_linked () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner br=new Browserbanner();
		driver=br.BrowserBanner(driver, functionality);
		driver=br.Clearcookie(driver, functionality);
		driver=fullyenrolled.SignUpPage(driver);
		driver=fullyenrolled.AccountLookupPage(driver, functionality, tcname);
		driver.close();
		
	}
	

}
