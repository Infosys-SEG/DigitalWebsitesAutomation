package executableClass;



import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import computedClass.Computed_HomePage;
import computedClass.Computed_SoftLogin;
import computedClass.Computed_HardLogin;


public class Updated_Homepage
{
	WebDriver driver = null;
	String functionality="Updated_HomePage";
	
	@Test (priority=1)
	public void TC001_Home_page_for_Logged_out_user () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner browserbanner=new Browserbanner();
	
		Computed_HomePage homepage = new Computed_HomePage();
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver=browserbanner.Clearcookie(driver, functionality);
		
		driver=homepage.Home_general(driver, functionality);
		driver=homepage.Home_topbanner(driver, functionality);
		driver=homepage.Home_logosguest(driver, functionality);
		driver=homepage.Home_CouponRotator(driver, functionality);
		driver=homepage.Home_bottomblock(driver, functionality);
		driver.close();
	}
	
	@Test (priority=2)
	public void TC002_Home_page_for_Soft_Login () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner browserbanner=new Browserbanner();
		Computed_SoftLogin softlogin = new Computed_SoftLogin();
		Computed_HomePage homepage = new Computed_HomePage();
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver=browserbanner.Clearcookie(driver, functionality);
		driver=softlogin.SoftLogin_Rewards(driver, functionality,tcname);
		driver=homepage.Home_general(driver, functionality);
		driver=homepage.Home_topbanner(driver, functionality);
		driver=homepage.Home_logos(driver, functionality);
		driver=homepage.Home_CouponRotator(driver, functionality);
		driver=homepage.Home_bottomblock(driver, functionality);
		driver.close();
	}
	@Test (priority=3)
	public void TC003_Home_page_for_Hard_Login () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner browserbanner=new Browserbanner();
		Computed_HardLogin hardlogin = new Computed_HardLogin();
		Computed_HomePage homepage = new Computed_HomePage();
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver=browserbanner.Clearcookie(driver, functionality);
		driver=hardlogin.Global_HardLogin(driver, functionality,tcname);
		driver=homepage.Home_general(driver, functionality);
		driver=homepage.Home_topbanner(driver, functionality);
		driver=homepage.Home_logos(driver, functionality);
		driver=homepage.Home_CouponRotator(driver, functionality);
		driver=homepage.Home_bottomblock(driver, functionality);
		driver.close();
	}
	
}
