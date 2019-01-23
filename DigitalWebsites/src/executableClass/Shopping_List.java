package executableClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utility.Writeexcel_RowName;
import computedClass.Computed_Digital_Coupons;
import computedClass.Computed_HardLogin;
import computedClass.Computed_Logout;
import computedClass.Computed_Shopping_List;
import computedClass.Computed_WeeklyAd;

public class Shopping_List 
{
	WebDriver driver;
	String functionality="Shopping_List";	
	Browserbanner browserbanner=new Browserbanner();
	Computed_HardLogin hardlogin = new Computed_HardLogin();
	Computed_WeeklyAd weeklyad=new Computed_WeeklyAd();
	Computed_Digital_Coupons coupons = new Computed_Digital_Coupons();
	Computed_Shopping_List shoppinglist = new Computed_Shopping_List();
	Computed_Logout logout=new Computed_Logout();
	
	@Test (priority=1)
	public void TC_02_Shopping_List_Add_My_Items () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String Functionality = functionality;
		int count=0;
		
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver=hardlogin.Global_HardLogin(driver, Functionality, TCName);
		driver = shoppinglist.ShoppingList_Navigation(driver, Functionality, TCName);
		driver = shoppinglist.Add_Remove_MyItems_ShoppingList(driver, Functionality, TCName, count, "Add");
		count=shoppinglist.getcount();
		driver=shoppinglist.Check_MyItems_ShoppingList(driver, Functionality, TCName, count, "Added");		
		driver.close();
	}
	
	@Test (priority=2)
	public void TC_05_Shopping_List_Filter_By () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		int count=0;
		String proddetails="";
		String prodvalu="";
		String prod="";
		String Functionality = functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver=hardlogin.Global_HardLogin(driver, Functionality, TCName);
		//weeklyad filter
		driver=weeklyad.WeeklyAdPage(driver, Functionality, TCName);
		driver=weeklyad.AddProduct(functionality,TCName,driver, proddetails, count, prodvalu,"circularpage");
		proddetails=weeklyad.getproddetails();
		count=weeklyad.getcount();
		driver = shoppinglist.WeeklyAd_Deals_ShoppingList(driver, Functionality,TCName, proddetails, count, "Added");	
		
		//coupons filter
		driver = coupons.Loggedin_Coupons_Link(driver, Functionality,TCName, prod, count);
		prod=coupons.getprod();
		count=coupons.getcount();
		System.out.println(count);
		driver = shoppinglist.Coupons_ShoppingList(driver, prod, count, "Digital_Coupon",Functionality, TCName);
		
		//myitems filter
		
		driver = shoppinglist.Add_Remove_MyItems_ShoppingList(driver, Functionality, TCName, count, "Add");
		count=shoppinglist.getcount();
		driver=shoppinglist.Check_MyItems_ShoppingList(driver, Functionality, TCName, count, "Added");	
		driver = shoppinglist.Add_Remove_MyItems_ShoppingList(driver, Functionality, TCName, count, "Remove");
		count=shoppinglist.getcount();
		driver=shoppinglist.Check_MyItems_ShoppingList(driver, Functionality, TCName, count, "Removed");	
		driver.close();
	}
	@Test (priority=4)
	public void TC_06_Shopping_List_Remove_item_MyItems () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		int count=0;
		String Functionality = functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver=hardlogin.Global_HardLogin(driver, Functionality, TCName);
		driver = shoppinglist.ShoppingList_Navigation(driver, Functionality,TCName);
		driver = shoppinglist.Add_Remove_MyItems_ShoppingList(driver, Functionality, TCName, count, "Add");
		count=shoppinglist.getcount();
		driver=shoppinglist.Check_MyItems_ShoppingList(driver, Functionality, TCName, count, "Added");	
		driver = shoppinglist.Add_Remove_MyItems_ShoppingList(driver, Functionality, TCName, count, "Remove");
		count=shoppinglist.getcount();
		driver=shoppinglist.Check_MyItems_ShoppingList(driver, Functionality, TCName, count, "Removed");	
		driver.close();
	}
	
	@Test (priority=5)
	public void TC_09_ShoppingList_Delete_Circular_Items () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String proddetails="";
		String prodvalu="";
		int count=0;
		String Functionality = functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver=hardlogin.Global_HardLogin(driver, Functionality, TCName);
		driver=weeklyad.WeeklyAdPage(driver, Functionality, TCName);
		driver=weeklyad.AddProduct(functionality,TCName,driver, proddetails, count, prodvalu,"circularpage");
		proddetails=weeklyad.getproddetails();
		count=weeklyad.getcount();
		prodvalu=weeklyad.getprodvalu();
		driver = shoppinglist.WeeklyAd_Deals_ShoppingList(driver,  Functionality,TCName, proddetails, count, "DeleteIcon_Removedfromshoppinglist");
		driver = logout.Logout(driver, Functionality,TCName);
		driver=hardlogin.Global_HardLogin(driver, Functionality, TCName);
		driver = shoppinglist.ShoppingList_Navigation(driver, Functionality, TCName);
		driver = shoppinglist.WeeklyAd_Deals_ShoppingList(driver,  Functionality,TCName, proddetails, count, "Removed");
		
	}
	
	@Test (priority=6)
	public void TC_11_Shopping_List_Edit_weekly_circular_quantity_number_Valid_Value () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String proddetails="";
		String prodvalu="";
		int count=0;
		String Functionality = functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver=hardlogin.Global_HardLogin(driver, Functionality, TCName);
		driver=weeklyad.WeeklyAdPage(driver, Functionality, TCName);
		driver=weeklyad.AddProduct(functionality,TCName,driver, proddetails, count, prodvalu,"circularpage");
		proddetails=weeklyad.getproddetails();
		count=weeklyad.getcount();
		prodvalu=weeklyad.getprodvalu();
		driver=shoppinglist.Edit_ShoppingList(driver, Functionality, TCName, proddetails,"weeklyad", "editqty");
		driver = shoppinglist.WeeklyAd_Deals_ShoppingList(driver,  Functionality,TCName, proddetails, count, "editqty");
		driver.close();
		
		
	}
	@Test (priority=7)
	public void TC_14_EditMyItemName () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		int count=0;
		String proddetails="";
		String Functionality = functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver=hardlogin.Global_HardLogin(driver, Functionality, TCName);
		driver = shoppinglist.ShoppingList_Navigation(driver, Functionality,TCName);
		driver = shoppinglist.Add_Remove_MyItems_ShoppingList(driver, Functionality, TCName, count, "Add");
		proddetails=weeklyad.getproddetails();
		count=shoppinglist.getcount();
		driver=shoppinglist.Check_MyItems_ShoppingList(driver, Functionality, TCName, count, "Added");	
		driver = shoppinglist.Edit_ShoppingList(driver, Functionality, TCName, proddetails,"myitems", "edititem");
		driver=shoppinglist.Check_MyItems_ShoppingList(driver, Functionality, TCName, count, "myitemname_Edited");
			
		driver.close();
	}
	
	@Test (priority=8)
	public void TC_16_Edit_Item_Quantity () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		int count=0;
		String proddetails="";
		String Functionality = functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
		driver=hardlogin.Global_HardLogin(driver, Functionality, TCName);
		driver = shoppinglist.ShoppingList_Navigation(driver, Functionality,TCName);
		driver = shoppinglist.Add_Remove_MyItems_ShoppingList(driver, Functionality, TCName, count, "Add");
		proddetails=weeklyad.getproddetails();
		count=shoppinglist.getcount();
		driver=shoppinglist.Check_MyItems_ShoppingList(driver, Functionality, TCName, count, "Added");	
		driver = shoppinglist.Edit_ShoppingList(driver, Functionality, TCName,proddetails, "myitems", "editqty");
		driver=shoppinglist.Check_MyItems_ShoppingList(driver, Functionality, TCName, count, "myitemqty_Edited");	
		driver.close();
	}
	
	@Test (priority=9)
	public void TC_21_RemoveMultipleItems_CircularItems () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		Writeexcel_RowName write = new Writeexcel_RowName();
		
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String proddetails="";
		String prodvalu="";
		int count=0;
		String Functionality = functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver=browserbanner.Clearcookie(driver, Functionality);
	//	driver=hardlogin.Global_HardLogin(driver, Functionality, TCName);
		driver=weeklyad.WeeklyAdPage(driver, Functionality, TCName);
		driver=weeklyad.AddProduct(functionality,TCName,driver, proddetails, count, prodvalu,"circularpage");
		proddetails=weeklyad.getproddetails();
		count=weeklyad.getcount();
		write.excelwrite(Functionality, TCName, "product1", proddetails);
		driver=weeklyad.AddProduct(functionality,TCName,driver, proddetails, count, prodvalu,"circularpage");
		proddetails=weeklyad.getproddetails();
		count=weeklyad.getcount();
		write.excelwrite(Functionality, TCName, "product2", proddetails);
		driver = shoppinglist.WeeklyAd_Deals_ShoppingList(driver,  Functionality,TCName, "2", count, "Delete_Multipleitems");	
	//	driver.close();
	}
	
}
