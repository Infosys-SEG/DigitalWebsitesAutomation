package executableClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import computedClass.Computed_Digital_Coupons;
import computedClass.Computed_MyRewards;
import computedClass.Computed_Personalisedoffers;
import computedClass.Computed_SoftLogin;
import computedClass.Computed_Static_Info_bar;
import computedClass.Computed_WeeklyAd;

public class SoftLogin 
{
	WebDriver driver;
	String functionality="SoftLogin";
	
	Browserbanner browserbanner = new Browserbanner();
	Computed_SoftLogin softlogin = new Computed_SoftLogin();
	Computed_Digital_Coupons coupons = new Computed_Digital_Coupons();	
	Computed_Personalisedoffers deals = new Computed_Personalisedoffers();
	Computed_WeeklyAd weeklyad = new Computed_WeeklyAd();
	Computed_Static_Info_bar staticinfobar = new Computed_Static_Info_bar();
	Computed_MyRewards rewards = new Computed_MyRewards();
	
	@Test (priority=1)
	public void TC001_SoftLogin_Phone_And_Zip_login () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String prod="";
		String prodvalu="";
		int count=0;
		String Functionality = functionality;
		
		driver = browserbanner.BrowserBanner(driver, Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver = softlogin.SoftLogin_Rewards(driver, Functionality,TCName);
		driver = coupons.Loggedin_Coupons_Homepage(driver, Functionality,TCName, prod, count);
		driver = deals.Loggedin_Personalisedoffers(driver, Functionality,TCName);
		driver = weeklyad.WeeklyAdPage(driver, Functionality, TCName);
		driver = weeklyad.AddProduct(functionality,TCName,driver, prod, count, prodvalu,"circularpage");
		driver=staticinfobar.LoginStaticinfobar_Rewards(driver, Functionality,TCName);
		driver=staticinfobar.LoginStaticinfobar_MyAccount(driver, Functionality, Functionality,TCName); 
		driver.close();
	}
	
	@Test(priority=2)
	public void TC002_SoftLogin_unable_to_view_account () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String Functionality = functionality;
		
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver=softlogin.SoftLogin_Rewards(driver, Functionality,tcname);
		driver=staticinfobar.LoginStaticinfobar_MyAccount(driver, Functionality, Functionality,tcname);
		driver.close();
	}
	
	@Test(priority=3)
	public void TC003_SoftLogin_loggedout_user () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String Functionality = functionality;	
		
		String prod="";
		String prodvalu="";
		int count=0;
		
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver=coupons.Loggedout_Coupons_Homepage(driver, Functionality,TCName);
		driver=deals.Loggedout_Personalisedoffers(driver, Functionality,TCName);
		driver=weeklyad.WeeklyAdPage(driver, Functionality, TCName);
		driver = weeklyad.AddProduct(functionality,TCName,driver, prod, count, prodvalu,"circularpage");
		driver=rewards.Myrewards_general(driver, Functionality);
		driver=rewards.loggedout_Myreward(driver, Functionality, TCName);
		driver.close();
	}
}
