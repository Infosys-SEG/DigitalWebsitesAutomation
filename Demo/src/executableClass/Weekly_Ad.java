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
		String proddetails="";
		String prodvalu="";
		int count=0;
		String Functionality = functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver=hardlogin.Global_HardLogin(driver, Functionality, TCName);
		driver=weeklyad.WeeklyAdPage(driver, Functionality, TCName);
		driver=weeklyad.AddProduct(driver, proddetails, count, prodvalu,"circularpage");
		proddetails=weeklyad.getproddetails();
		count=weeklyad.getcount();
		driver = shoppinglist.WeeklyAd_Deals_ShoppingList(driver, proddetails, count, "Added");	
		driver.close();
	}
	
	@Test (priority=2)
	public void TC03_Add_items_to_list_VIEW_DETAILS_button_add_item_again () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String proddetails="";
		String prodvalu="";
		int count=0;
		String Functionality = functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver=hardlogin.Global_HardLogin(driver, Functionality, TCName);
		driver=weeklyad.WeeklyAdPage(driver, Functionality, TCName);
		driver=weeklyad.AddProduct(driver, proddetails, count, prodvalu,"overlay");
		proddetails=weeklyad.getproddetails();
		prodvalu=weeklyad.getprodvalu();
		driver = weeklyad.AddAgain(driver,prodvalu);	
		//driver.close();
	}
	
	@Test (priority=3)
	public void TC01_Remove_items_from_the_list_Weekly_Circular () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String proddetails="";
		String prodvalu="";
		int count=0;
		String Functionality = functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver=hardlogin.Global_HardLogin(driver, Functionality, TCName);
		driver=weeklyad.WeeklyAdPage(driver, Functionality, TCName);
		driver=weeklyad.AddProduct(driver, proddetails, count, prodvalu,"circularpage");
		driver=weeklyad.Removeproduct(driver, Functionality, prodvalu, count,"circularpage");
		proddetails=weeklyad.getproddetails();
		count=weeklyad.getcount();
		prodvalu=weeklyad.getprodvalu();
		driver = shoppinglist.WeeklyAd_Deals_ShoppingList(driver, prodvalu, count, "Removed");
		//driver.close();
	}
	
	@Test (priority=4)
	public void TC02_Remove_items_from_the_list_View_Details_screen () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String proddetails="";
		String prodvalu="";
		int count=0;
		String Functionality = functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver=hardlogin.Global_HardLogin(driver, Functionality, TCName);
		driver=weeklyad.WeeklyAdPage(driver, Functionality, TCName);
		driver=weeklyad.AddProduct(driver, proddetails, count, prodvalu,"overlay");
		driver=weeklyad.Removeproduct(driver, Functionality, prodvalu, count,"overlay");
		proddetails=weeklyad.getproddetails();
		count=weeklyad.getcount();
		prodvalu=weeklyad.getprodvalu();
		driver = shoppinglist.WeeklyAd_Deals_ShoppingList(driver, prodvalu, count, "Removed");
		//driver.close();
	}
	
	@Test (priority=5)
	public void TC03_Remove_items_from_the_list_My_Shopping_List () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String proddetails="";
		String prodvalu="";
		int count=0;
		String Functionality = functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver=hardlogin.Global_HardLogin(driver, Functionality, TCName);
		driver=weeklyad.WeeklyAdPage(driver, Functionality, TCName);
		driver=weeklyad.AddProduct(driver, proddetails, count, prodvalu,"circularpage");
		proddetails=weeklyad.getproddetails();
		count=weeklyad.getcount();
		prodvalu=weeklyad.getprodvalu();
		driver = shoppinglist.WeeklyAd_Deals_ShoppingList(driver, proddetails, count, "DeleteIcon_Removedfromshoppinglist");
		driver = weeklyad.RemoveAgain(driver, prodvalu);
		driver=weeklyad.AddProduct(driver, proddetails, count, prodvalu,"circularpage");
		proddetails=weeklyad.getproddetails();
		count=weeklyad.getcount();
		prodvalu=weeklyad.getprodvalu();
		driver = shoppinglist.WeeklyAd_Deals_ShoppingList(driver, proddetails, count, "DeleteAllButton_Removedfromshoppinglist");
		driver = weeklyad.RemoveAgain(driver, prodvalu);
		//driver.close();
	}
	
	
}
