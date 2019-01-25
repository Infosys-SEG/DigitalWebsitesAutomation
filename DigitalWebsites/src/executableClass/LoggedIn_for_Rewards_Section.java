package executableClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import computedClass.Computed_HardLogin;
import computedClass.Computed_MyRewards;
import computedClass.Computed_SoftLogin;
import computedClass.Computed_Static_Info_bar;

public class LoggedIn_for_Rewards_Section 
{
	WebDriver driver = null;
	String functionality="LoggedIn_for_Rewards_Section";
	
	@Test(priority=1)
	public void TC001_Rewards_section_for_Hard_Logged_In_user () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner browserbanner=new Browserbanner();
	
		Computed_MyRewards loggedin = new Computed_MyRewards();
		Computed_HardLogin hardlogin = new Computed_HardLogin();
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver=browserbanner.Clearcookie(driver, functionality);
		driver=hardlogin.Global_HardLogin(driver, functionality,tcname);
		driver=loggedin.Myrewards_general(driver, functionality);
		driver=loggedin.Loggedin_Myrewardpage(driver, functionality, tcname);
		driver=loggedin.Loggedin_Myrewardpage_editacc(driver, functionality,tcname,"hardlogin");
		driver.close();
	}
	
	@Test (priority=2)
	public void TC002_Rewards_section_for_Soft_Logged_In_user () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner browserbanner=new Browserbanner();
		Computed_SoftLogin softlogin = new Computed_SoftLogin();
		Computed_MyRewards loggedin = new Computed_MyRewards();
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver=browserbanner.Clearcookie(driver, functionality);
		driver=softlogin.SoftLogin_Rewards(driver, functionality,tcname);
		driver=loggedin.Myrewards_general(driver, functionality);
		driver=loggedin.Loggedin_Myrewardpage(driver, functionality,tcname);
		driver=loggedin.Loggedin_Myrewardpage_editacc(driver, functionality,tcname,"softlogin");
		driver.close();
	 }
	
	@Test (priority=3)
	public void TC003__Validate_Edit_Account_Details_for_Hard_Logged_In_user () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner browserbanner=new Browserbanner();
		Computed_MyRewards loggedin = new Computed_MyRewards();
		Computed_HardLogin hardlogin = new Computed_HardLogin();
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver=browserbanner.Clearcookie(driver, functionality);
		driver=hardlogin.Global_HardLogin(driver, functionality,tcname);
		driver=loggedin.Myrewards_general(driver, functionality);
		driver=loggedin.Loggedin_Myrewardpage_editacc(driver, functionality,tcname,"hardlogin");
		driver.close();
	}
	
	@Test (priority=4)
	public void TC004__Validate_Edit_Account_Details_for_Soft_Logged_In_user () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner browserbanner=new Browserbanner();
		Computed_SoftLogin softlogin = new Computed_SoftLogin();
		Computed_MyRewards loggedin = new Computed_MyRewards();
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver=browserbanner.Clearcookie(driver, functionality);
		driver=softlogin.SoftLogin_Rewards(driver, functionality,tcname);
		driver=loggedin.Myrewards_general(driver, functionality);
		driver=loggedin.Loggedin_Myrewardpage_editacc(driver, functionality,tcname,"softlogin");
		driver.close();
	}
	
	@Test (priority=5)
	public void TC005_Validate_the_functionality_of_Useful_Links_section_for_Hard_Login_user () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	 {
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner browserbanner=new Browserbanner();
		Computed_HardLogin hardlogin = new Computed_HardLogin();
		Computed_MyRewards loggedin = new Computed_MyRewards();
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver=browserbanner.Clearcookie(driver, functionality);
		driver=hardlogin.Global_HardLogin(driver, functionality,tcname);
		driver=loggedin.Myrewards_general(driver, functionality);
		driver=loggedin.Loggedin_Myrewardpage_usefulinks(driver, functionality,tcname);
		driver.close();
	 }
	
	@Test (priority=6)
	public void TC006_Validate_the_functionality_of_Useful_Links_section_for_Soft_Login_user () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner browserbanner=new Browserbanner();
		Computed_SoftLogin softlogin = new Computed_SoftLogin();
		Computed_MyRewards loggedin = new Computed_MyRewards();
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver=browserbanner.Clearcookie(driver, functionality);
		driver=softlogin.SoftLogin_Rewards(driver, functionality,tcname);
		driver=loggedin.Myrewards_general(driver, functionality);
		driver=loggedin.Loggedin_Myrewardpage_usefulinks(driver, functionality,tcname);
		driver.close();
	}
	@Test (priority=7)
	public void TC007_Verify_the_Recent_Transactions_page_HardLogin () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner browserbanner=new Browserbanner();
		Computed_HardLogin hardlogin = new Computed_HardLogin();
		Computed_MyRewards loggedin = new Computed_MyRewards();
		Computed_Static_Info_bar staticinfobar= new Computed_Static_Info_bar();
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver=browserbanner.Clearcookie(driver, functionality);
		driver=hardlogin.Global_HardLogin(driver, functionality,tcname);
		driver=staticinfobar.LoginStaticinfobar_Rewards(driver, functionality, tcname);
		driver=loggedin.Myreward_RecentTransactions(driver, functionality, tcname);
		driver.close();
	}
	@Test (priority=8)
	public void TC008_Verify_the_Recent_Transactions_page_SoftLogin () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner browserbanner=new Browserbanner();
		Computed_SoftLogin softlogin = new Computed_SoftLogin();
		Computed_MyRewards loggedin = new Computed_MyRewards();
		
		driver= browserbanner.BrowserBanner(driver, functionality);
		driver=browserbanner.Clearcookie(driver, functionality);
		driver=softlogin.SoftLogin_Rewards(driver, functionality,tcname);
		driver=loggedin.Myreward_RecentTransactions(driver, functionality, tcname);
		driver.close();
	}
}
