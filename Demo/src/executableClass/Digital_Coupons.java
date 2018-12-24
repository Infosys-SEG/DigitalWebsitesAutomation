package executableClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import computedClass.Computed_Digital_Coupons;
import computedClass.Computed_Shopping_List;
import computedClass.Computed_SoftLogin;

public class Digital_Coupons 
{
	WebDriver driver = null;
	String functionality = "Digital_Coupons";
	Browserbanner browserbanner=new Browserbanner();
	Computed_SoftLogin softlogin = new Computed_SoftLogin();
	Computed_Digital_Coupons coupons = new Computed_Digital_Coupons();
	Computed_Shopping_List shoppinglist = new Computed_Shopping_List();
	
	@Test(priority=1)
	public void TC_01_Shopping_List_Add_Coupons () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as TCName
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String Functionality=functionality;
		String prod="";
		int count = 0;
		driver = browserbanner.BrowserBanner(driver, Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver = softlogin.SoftLogin_Rewards(driver, Functionality, TCName);
		driver = coupons.Loggedin_Coupons_Link(driver, Functionality, prod, count);
		prod=coupons.getprod();
		count=coupons.getcount();
		driver = shoppinglist.Coupons_ShoppingList(driver, prod, count, "Digital_Coupon");
		driver.close();	
	}
	
	@Test(priority=2)
	public void TC_01_Add_Coupons_Guest_user () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		String Functionality=functionality;
		
		driver = browserbanner.BrowserBanner(driver, Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver = coupons.Loggedout_Coupons_Link(driver, Functionality);
		driver.close();
	}
}
