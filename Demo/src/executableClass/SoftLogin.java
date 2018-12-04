package executableClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utility.Data;
import computedClass.Computed_Digital_Coupons;
import computedClass.Computed_MyRewards;
import computedClass.Computed_Personalisedoffers;
import computedClass.Computed_SoftLogin;
import computedClass.Computed_Static_Info_bar;
import computedClass.Computed_WeeklyAd;
import generatedClass.POM_Generated_Homepage;

public class SoftLogin 
{
	WebDriver driver = null;
	String functionality="SoftLogin";
	
	@Test (priority=1)
	public void TC001_SoftLogin_Phone_And_Zip_login () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner br=new Browserbanner();
		Computed_SoftLogin softlogin = new Computed_SoftLogin();
		Computed_Digital_Coupons dc=new Computed_Digital_Coupons();	
		Computed_Personalisedoffers po=new Computed_Personalisedoffers();
		Computed_WeeklyAd wa=new Computed_WeeklyAd();
		Computed_Static_Info_bar sib = new Computed_Static_Info_bar();
		String prod="";
		String prodvalu="";
		int count=0;
		driver= br.BrowserBanner(driver, functionality);
		driver=softlogin.SoftLogin_Rewards(driver, functionality,tcname);
		driver=dc.Loggedin_Coupons_Homepage(driver, functionality, prod, count);
		driver=po.Loggedin_Personalisedoffers(driver, functionality);
		driver=wa.AddProduct(driver, prod, count, prodvalu);
		driver=sib.LoginStaticinfobar_Rewards(driver, functionality);
		driver=sib.LoginStaticinfobar_MyAccount(driver, functionality, functionality);
	}
	
	@Test(priority=2)
	public void TC002_SoftLogin_unable_to_view_account () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner br=new Browserbanner();
		Computed_SoftLogin softlogin= new Computed_SoftLogin();
		Computed_Static_Info_bar sib = new Computed_Static_Info_bar();
		driver= br.BrowserBanner(driver, functionality);
		driver=softlogin.SoftLogin_Rewards(driver, functionality,tcname);
		driver=sib.LoginStaticinfobar_MyAccount(driver, functionality, functionality);
	}
	
	@Test(priority=3)
	public void TC003_SoftLogin_loggedout_user () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
	//	String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner br=new Browserbanner();
		Computed_Digital_Coupons dc=new Computed_Digital_Coupons();	
		Computed_Personalisedoffers po=new Computed_Personalisedoffers();
		Computed_WeeklyAd wa=new Computed_WeeklyAd();
		Computed_MyRewards mr= new Computed_MyRewards();
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		Data obj = new Data();
		String prod="";
		String prodvalu="";
		int count=0;
		driver= br.BrowserBanner(driver, functionality);
		/*Thread.sleep(2000);
		obj.scrollingToElementofAPage(driver, homepage.click_Close_cookies_Button);
		homepage.click_Close_cookies_Button.submit();*/
		
		driver=dc.Loggedout_Coupons_Homepage(driver, functionality);
		driver=po.Loggedout_Personalisedoffers(driver, functionality);
		driver=wa.WeeklyAdPage(driver, functionality);
		driver=wa.AddProduct(driver, prod, count, prodvalu);
		driver=mr.loggedout_Myreward(driver, functionality);
	}
}
