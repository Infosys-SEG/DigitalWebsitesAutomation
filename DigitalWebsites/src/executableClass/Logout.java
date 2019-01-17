package executableClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import computedClass.Computed_Logout;
import computedClass.Computed_SoftLogin;


public class Logout 
{
	WebDriver driver = null;
	String functionality = "Logout";
	Browserbanner browserbanner=new Browserbanner();
	Computed_SoftLogin softlogin = new Computed_SoftLogin();
	Computed_Logout logout = new Computed_Logout();
	
	@Test (priority=1)
	public void TC001_Logout () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String Functionality = functionality;
		
		driver = browserbanner.BrowserBanner(driver, Functionality);
		System.out.println("1");
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver = softlogin.SoftLogin_Rewards(driver, Functionality,TCName);
		driver = logout.Logout(driver, Functionality, TCName);
	}
}
