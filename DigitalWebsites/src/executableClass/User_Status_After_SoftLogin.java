package executableClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import computedClass.Computed_SoftLogin;

public class User_Status_After_SoftLogin 
{
	WebDriver driver = null;
	String functionality="User_Status_After_SoftLogin";
	
	@Test (priority=1)
	public void TC001_Soft_login_fully_enrolled_user () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner browserbanner=new Browserbanner();
		Computed_SoftLogin softlogin = new Computed_SoftLogin();
		
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver= browserbanner.Clearcookie(driver, functionality);
		driver=softlogin.SoftLogin_Rewards(driver, functionality,tcname);	
		driver.close();
	}
	
	@Test (priority=2)
	public void TC002_Soft_login_Pre_enrolled_user () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner browserbanner=new Browserbanner();
		Computed_SoftLogin softlogin = new Computed_SoftLogin();
		
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver= browserbanner.Clearcookie(driver, functionality);
		driver=softlogin.SoftLogin_PreEnrolledUser(driver, functionality,tcname);	
		driver.close();
	}
}
