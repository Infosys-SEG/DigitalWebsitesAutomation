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

public class Weekly_Ad 
{
	WebDriver driver;
	String functionality="Weekly_Ad";
	
	Browserbanner browserbanner=new Browserbanner();
	

	Computed_WeeklyAd weeklyad=new Computed_WeeklyAd();
	
	
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
		driver=weeklyad.WeeklyAdPage(driver, Functionality, TCName);
		driver=weeklyad.AddProduct(driver, prod, count, prodvalu);
		prod=weeklyad.getprod();
		count=weeklyad.getcount();
		prodvalu=weeklyad.getprodvalu();
		driver=weeklyad.AddAgain(driver, prod, count, prodvalu);
		driver.close();
	}
}
