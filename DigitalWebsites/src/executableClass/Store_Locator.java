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
import computedClass.Computed_WeeklyAd;

public class Store_Locator
{
	WebDriver driver;
	String Functionality="Store_Locator";
	
	@Test
	public void TC_01_Store_Locator_Page() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner br=new Browserbanner();
		Computed_MyStore mystore= new Computed_MyStore();
		
		driver= br.BrowserBanner(driver, Functionality);
		driver=br.Clearcookie(driver, Functionality);
	
		driver=mystore.StoreLocatorValidation(driver, Functionality, TCName);
		driver.close();
	}
	
	@Test
	public void TC02_Store_Locator_Zipcode() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String prod="";
		String prodvalu="";
		int count=0;
		Browserbanner br=new Browserbanner();
		
		Computed_MyStore mystore= new Computed_MyStore();
		Computed_WeeklyAd weeklyad= new Computed_WeeklyAd();
		
		driver= br.BrowserBanner(driver, Functionality);
		driver=br.Clearcookie(driver, Functionality);
		
		
		driver=mystore.StoreLocator_Zipcode(driver, Functionality, TCName);
		driver=weeklyad.WeeklyAdPage(driver, Functionality, TCName);
		driver=weeklyad.AddProduct(driver, prod, count, prodvalu, "circularpage");
		prod=weeklyad.getprodvalu();
		count=weeklyad.getcount();
		prodvalu=weeklyad.getprodvalu();
		
		driver.close();
	}
	
	@Test
	public void TC_04_Store_Locator_City_And_State() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String prod="";
		String prodvalu="";
		int count=0;
		Browserbanner br=new Browserbanner();
		
		Computed_MyStore mystore= new Computed_MyStore();
		Computed_WeeklyAd weeklyad= new Computed_WeeklyAd();
		
		driver= br.BrowserBanner(driver, Functionality);
		driver=br.Clearcookie(driver, Functionality);
		
		
		driver=mystore.StoreLocator_CityState(driver, Functionality, TCName);
		driver=weeklyad.WeeklyAdPage(driver, Functionality, TCName);
		driver=weeklyad.AddProduct(driver, prod, count, prodvalu, "circularpage");
		prod=weeklyad.getprodvalu();
		count=weeklyad.getcount();
		prodvalu=weeklyad.getprodvalu();
		
		driver.close();
	}
	@Test
	public void TC_03_Store_Locator_ChangeLocation() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner br=new Browserbanner();
		Computed_HardLogin hardlogin =new Computed_HardLogin();
		Computed_MyStore mystore= new Computed_MyStore();
		
		driver= br.BrowserBanner(driver, Functionality);
		driver=br.Clearcookie(driver, Functionality);
		
		driver= hardlogin.Global_HardLogin(driver, Functionality, TCName);
		driver=mystore.SetStore_ChangeLocation(driver, Functionality, TCName);
		
		driver.close();
	}
	@Test
	public void TC_08_Store_Locator_Page_logged_in() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner br=new Browserbanner();
		Computed_HardLogin hardlogin =new Computed_HardLogin();
		
		Computed_MyStore mystore= new Computed_MyStore();
		driver= br.BrowserBanner(driver, Functionality);
		driver=br.Clearcookie(driver, Functionality);
		
		driver= hardlogin.Global_HardLogin(driver, Functionality, TCName);
		driver=mystore.SetStore(driver, Functionality, TCName);
		driver=mystore.StoreLocatorValidation(driver, Functionality, TCName);
		
		driver.close();
	}
	
	@Test
	public void TC_06_Search__invalid_Zip_code_More_than_5_digits() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner br=new Browserbanner();
		//Computed_HardLogin hardlogin =new Computed_HardLogin();
		
		Computed_MyStore mystore= new Computed_MyStore();
		driver= br.BrowserBanner(driver, Functionality);
		driver=br.Clearcookie(driver, Functionality);
		driver= mystore.SetStore_InvalidZip(driver, Functionality, TCName);
		driver.close();
	}	


}
