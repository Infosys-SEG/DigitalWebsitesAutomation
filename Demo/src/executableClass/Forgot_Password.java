package executableClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import computedClass.Computed_Forgot_Password;
import computedClass.Computed_HardLogin;

public class Forgot_Password {
	
	WebDriver driver;
	String functionality="Forgot_Password";

	@Test(priority=1)
	public void  TC001_ForgotPassword() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();
		Browserbanner br=new Browserbanner();
		Computed_Forgot_Password forgotpassword= new Computed_Forgot_Password();
		
		driver=br.BrowserBanner(driver, functionality);
		driver=br.Clearcookie(driver, functionality);
		driver=forgotpassword.Validate_ForgotPassword(driver, functionality, tcname);
		driver.close();
	}
}
