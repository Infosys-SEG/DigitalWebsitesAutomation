package executableClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import computedClass.Computed_HardLogin;
import computedClass.Computed_MyStore;
import computedClass.Computed_SoftLogin;
import computedClass.Computed_Static_Info_bar;

public class Static_Infobar_loggedin_Users 
{
	WebDriver driver;
	String functionality="Static_Infobar_loggedin_Users";
	
	@Test (priority=1)
	public void TC001_Staticbar_links_Hardlogin () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner browserbanner=new Browserbanner();
		Computed_MyStore mystore = new Computed_MyStore();
		Computed_Static_Info_bar staticinfobar = new Computed_Static_Info_bar();
		Computed_HardLogin hardlogin = new Computed_HardLogin();
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver=browserbanner.Clearcookie(driver, functionality);
		driver = hardlogin.Global_HardLogin(driver, functionality,tcname);
		driver = mystore.SetStore(driver, functionality, tcname);
		driver = staticinfobar.LoginStaticinfobar_WeeklyAd(driver, functionality,tcname);
		driver = staticinfobar.LoginStaticinfobar_Rewards(driver, functionality,tcname);
		driver = staticinfobar.LoginStaticinfobar_MyAccount(driver, functionality, "Hardlogin",tcname);
		driver.close();
	}
	
	@Test (priority=2)
	public void TC002_Staticbar_Hardlogin_links_navigation_Homepage () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner browserbanner=new Browserbanner();
		Computed_MyStore mystore = new Computed_MyStore();
		Computed_Static_Info_bar staticinfobar = new Computed_Static_Info_bar();
		Computed_HardLogin hardlogin = new Computed_HardLogin();
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver=browserbanner.Clearcookie(driver, functionality);
		driver = hardlogin.Global_HardLogin(driver, functionality,tcname);
		driver = mystore.SetStore(driver, functionality, tcname);
		driver = staticinfobar.LoginStaticinfobar_WeeklyAd(driver, functionality,tcname);
		driver = staticinfobar.LoginStaticinfobar_Rewards(driver, functionality,tcname);
		driver = staticinfobar.LoginStaticinfobar_MyAccount(driver, functionality, "Hardlogin",tcname);
		driver.close();
	}
	
	@Test (priority=3)
	public void TC003_Staticbar_Hard_login_links_navigation_Account_setting_page () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner browserbanner=new Browserbanner();
		Computed_MyStore mystore = new Computed_MyStore();
		Computed_Static_Info_bar staticinfobar = new Computed_Static_Info_bar();
		Computed_HardLogin hardlogin = new Computed_HardLogin();
		Computed_SoftLogin softlogin = new Computed_SoftLogin();
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver=browserbanner.Clearcookie(driver, functionality);
		driver = softlogin.SoftLogin_Rewards(driver, functionality, tcname);
		driver = hardlogin.Account_HardLogin(driver, functionality,tcname );
		driver = mystore.SetStore(driver, functionality, tcname);
		driver = staticinfobar.LoginStaticinfobar_WeeklyAd(driver, functionality,tcname);
		driver = staticinfobar.LoginStaticinfobar_Rewards(driver, functionality,tcname);
		driver = staticinfobar.LoginStaticinfobar_MyAccount(driver, functionality, "Hardlogin",tcname);
		driver.close();
	}
	
	@Test (priority=4)
	public void TC004_Staticbar_links_Softlogin () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner browserbanner=new Browserbanner();
		Computed_MyStore mystore = new Computed_MyStore();
		Computed_Static_Info_bar staticinfobar = new Computed_Static_Info_bar();
	
		Computed_SoftLogin softlogin = new Computed_SoftLogin();
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver=browserbanner.Clearcookie(driver, functionality);
		driver = softlogin.SoftLogin_Rewards(driver, functionality, tcname);
		
		driver = mystore.SetStore(driver, functionality, tcname);
		driver = staticinfobar.LoginStaticinfobar_WeeklyAd(driver, functionality,tcname);
		driver = staticinfobar.LoginStaticinfobar_Rewards(driver, functionality,tcname);
		driver = staticinfobar.LoginStaticinfobar_MyAccount(driver, functionality, "Softlogin",tcname);
		driver.close();
	}
	
	@Test (priority=5)
	public void TC005_Staticbar_Softlogin_links_navigation_Homepage () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner browserbanner=new Browserbanner();
		Computed_MyStore mystore = new Computed_MyStore();
		Computed_Static_Info_bar staticinfobar = new Computed_Static_Info_bar();
	
		Computed_SoftLogin softlogin = new Computed_SoftLogin();
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver=browserbanner.Clearcookie(driver, functionality);
		driver = softlogin.SoftLogin_Rewards(driver, functionality, tcname);
		
		driver = mystore.SetStore(driver, functionality, tcname);
		driver = staticinfobar.LoginStaticinfobar_WeeklyAd(driver, functionality,tcname);
		driver = staticinfobar.LoginStaticinfobar_Rewards(driver, functionality,tcname);
		driver = staticinfobar.LoginStaticinfobar_MyAccount(driver, functionality, "Softlogin",tcname);
		driver.close();
	}
}
