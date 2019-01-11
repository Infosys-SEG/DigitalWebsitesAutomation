package executableClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import computedClass.Computed_HardLogin;

public class Login_Or_Signup_Global_Nav {
	
	WebDriver driver = null;
	String functionality="Login_Or_Signup_Global_Nav";
	Computed_HardLogin hardlogin = new Computed_HardLogin();
	
	
	@Test(priority=1) 
	public void TC002_LogInSign_FullyEnrolled_Linked_to_SEG_rewards () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner br=new Browserbanner();
		driver=br.BrowserBanner(driver, functionality);
		driver=br.Clearcookie(driver, functionality);
		driver=hardlogin.Global_HardLogin(driver, functionality, tcname);
		driver.close();
		
	}
	
	@Test(priority=2)
	public void TC003_LogInSign_FullyEnrolled_NOT_Linked_to_SEG_rewards () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner br=new Browserbanner();
		driver=br.BrowserBanner(driver, functionality);
		driver=br.Clearcookie(driver, functionality);
		driver=hardlogin.HardLogin_FullyEnrolledUser(driver, functionality, tcname);
		driver.close();
		
	}
	
	
	@Test(priority=3)
	public void TC004_LogInSign_Pre_Enrolled_User () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner br=new Browserbanner();
		driver=br.BrowserBanner(driver, functionality);
		driver=br.Clearcookie(driver, functionality);
		driver=hardlogin.HardLogin_PreEnrolledUser(driver, functionality, tcname);
		driver.close();
		
	}

}
