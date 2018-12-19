package executableClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import computedClass.Computed_HardLogin;
import computedClass.Computed_Logout;
import computedClass.Computed_MyAccount;
import computedClass.Computed_SoftLogin;

public class Reset_Password {
	
	WebDriver driver;
	String functionality="Reset_Password";
	
	@Test(priority=1)
	public void TC001_Reset_Password_Account_settings_page () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
	    String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner br=new Browserbanner();
		Computed_HardLogin hardlogin = new Computed_HardLogin();
		Computed_SoftLogin softlogin =  new Computed_SoftLogin();
		Computed_MyAccount myAcct = new Computed_MyAccount();
		Computed_Logout logout = new Computed_Logout();
		driver= br.BrowserBanner(driver, functionality);
		driver=br.Clearcookie(driver, functionality);
		driver=softlogin.SoftLogin_Rewards(driver, functionality,tcname);
		driver=hardlogin.Account_HardLogin(driver, functionality,tcname);
	    driver=myAcct.MyAccount_ResetPassword(driver, functionality, tcname,"save");
	    driver=logout.Logout(driver);
	    driver=softlogin.SoftLogin_Rewards(driver, functionality,tcname);
	    //Hard Login with new password
	    driver=hardlogin.Account_HardLogin(driver, functionality,tcname);
	    driver=myAcct.MyAccount_ResetPassword_ToOldPassword(driver, functionality, tcname,"save");
		driver.close();
	}
	
	@Test(priority=2)
	public void TC005_Validate_the_functionality_of_Cancel_button_in_Reset_Password_section () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
	    String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner br=new Browserbanner();
		Computed_HardLogin hardlogin = new Computed_HardLogin();
		Computed_SoftLogin softlogin =  new Computed_SoftLogin();
		Computed_MyAccount myAcct = new Computed_MyAccount();
		driver= br.BrowserBanner(driver, functionality);
		driver=br.Clearcookie(driver, functionality);
		driver=softlogin.SoftLogin_Rewards(driver, functionality,tcname);
		driver=hardlogin.Account_HardLogin(driver, functionality,tcname);
	    driver=myAcct.MyAccount_ResetPassword(driver, functionality, tcname,"Cancel");
		driver.close();
	}
	
	@Test(priority=3)
	public void TC003_Reset_Password_Error_Message_Validation () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
	    String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner br=new Browserbanner();
		Computed_HardLogin hardlogin = new Computed_HardLogin();
		Computed_SoftLogin softlogin =  new Computed_SoftLogin();
		Computed_MyAccount myAcct = new Computed_MyAccount();
		driver= br.BrowserBanner(driver, functionality);
		driver=br.Clearcookie(driver, functionality);
		driver=softlogin.SoftLogin_Rewards(driver, functionality,tcname);
		driver=hardlogin.Account_HardLogin(driver, functionality,tcname);
	    driver=myAcct.ResetPassword_ErrorMsgValidation(driver, functionality, tcname);
		driver.close();
	}
}
	
