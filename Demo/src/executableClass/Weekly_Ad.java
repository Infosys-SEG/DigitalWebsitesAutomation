package executableClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import computedClass.Computed_HardLogin;
import computedClass.Computed_Shopping_List;
import computedClass.Computed_WeeklyAd;

public class Weekly_Ad 
{
	WebDriver driver;
	String functionality="Weekly_Ad";
	
	Browserbanner browserbanner=new Browserbanner();
	Computed_HardLogin hardlogin = new Computed_HardLogin();
	Computed_WeeklyAd weeklyad=new Computed_WeeklyAd();
	Computed_Shopping_List shoppinglist = new Computed_Shopping_List();
	
	@Test (priority=1)
	public void TC01_Add_items_to_list_ADD_TO_LIST_button_item_added () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String prod="";
		String prodvalu="";
		int count=0;
		String Functionality = functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver=hardlogin.Global_HardLogin(driver, Functionality, TCName);
		driver=weeklyad.WeeklyAdPage(driver, Functionality, TCName);
		driver=weeklyad.AddProduct(driver, prod, count, prodvalu);
		prod=weeklyad.getprod();
		count=weeklyad.getcount();
		prodvalu=weeklyad.getprodvalu();
		driver = shoppinglist.WeeklyAd_Deals_ShoppingList(driver, prodvalu, count, "Added");	
		//driver.close();
	}
	
	@Test (priority=3)
	public void TC03_Add_items_to_list_VIEW_DETAILS_button_add_item_again () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String prod="";
		String prodvalu="";
		int count=0;
		String Functionality = functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver=hardlogin.Global_HardLogin(driver, Functionality, TCName);
		driver=weeklyad.WeeklyAdPage(driver, Functionality, TCName);
		driver=weeklyad.AddProduct(driver, prod, count, prodvalu);
		prod=weeklyad.getprod();
		count=weeklyad.getcount();
		prodvalu=weeklyad.getprodvalu();
		driver = weeklyad.AddAgain(driver, prod, count, prodvalu);	
		//driver.close();
	}
}
