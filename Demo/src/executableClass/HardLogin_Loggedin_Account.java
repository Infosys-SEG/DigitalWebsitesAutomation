package executableClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import computedClass.Computed_Digital_Coupons;
import computedClass.Computed_HardLogin;
import computedClass.Computed_MyAccount;
import computedClass.Computed_Personalisedoffers;
import computedClass.Computed_SoftLogin;
import computedClass.Computed_Static_Info_bar;
import computedClass.Computed_WeeklyAd;

public class HardLogin_Loggedin_Account 
{
	WebDriver driver;
	String functionality="HardLogin_Loggedin_Account";
	
	@Test (priority=1)
	public void TC001_HardLogin_Access_features () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner br=new Browserbanner();
		Computed_HardLogin hardlogin = new Computed_HardLogin();
		Computed_Digital_Coupons dc=new Computed_Digital_Coupons();	
		Computed_Personalisedoffers po=new Computed_Personalisedoffers();
		Computed_WeeklyAd wa=new Computed_WeeklyAd();
		Computed_Static_Info_bar sib = new Computed_Static_Info_bar();
		
		String prod="";
		String prodvalu="";
		int count=0;
		driver= br.BrowserBanner(driver, functionality);
		driver=br.Clearcookie(driver, functionality);
		driver=hardlogin.Global_HardLogin(driver, functionality,TCName);
		driver=dc.Loggedin_Coupons_Homepage(driver, functionality, prod, count);
		driver=po.Loggedin_Personalisedoffers(driver, functionality,TCName);
		driver=wa.WeeklyAdPage(driver, functionality, TCName);
		driver=wa.AddProduct(driver, prod, count, prodvalu, "circularpage");
		driver=sib.LoginStaticinfobar_Rewards(driver, functionality);
		driver=sib.LoginStaticinfobar_MyAccount(driver, functionality, functionality);
		driver.close();
	}
	
	
	@Test(priority=2)

    public void TC002_HardLogin_Edit_PII_and_save () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException

    {
		//For getting current method name and passing as tcname

        String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();    
        Browserbanner br=new Browserbanner();
        Computed_HardLogin hardlogin = new Computed_HardLogin();
        Computed_SoftLogin softlogin =  new Computed_SoftLogin();
        Computed_MyAccount myAcct = new Computed_MyAccount();
        driver= br.BrowserBanner(driver, functionality);
        driver=br.Clearcookie(driver, functionality);
        driver=softlogin.SoftLogin_SaveCoupon(driver, functionality,TCName);
        driver=hardlogin.Account_HardLogin(driver, functionality,TCName);    
        driver=myAcct.Loggedin_MyAccountpage(driver, functionality, TCName,"Save");
        driver.close();
    }
	
	@Test(priority=3)
	public void TC004_HardLogin_stateExpiry () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
	    String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner br=new Browserbanner();
		Computed_HardLogin hardlogin = new Computed_HardLogin();
		driver= br.BrowserBanner(driver, functionality);
		driver=br.Clearcookie(driver, functionality);
		driver=hardlogin.Global_HardLogin(driver, functionality,TCName);
	    driver=hardlogin.HardLogin_CheckExpiration(driver, functionality, TCName);
		driver.close();
	}
	
	@Test(priority=4)
	public void  TC006_HardLogin_CCCNumber_and_Forgotpasswordlink() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		
		Browserbanner br=new Browserbanner();
		Computed_HardLogin hardlogin = new Computed_HardLogin();
		
		driver= br.BrowserBanner(driver, functionality);
		driver=br.Clearcookie(driver, functionality);
		driver=hardlogin.Validate_HardLogin_Modal_Links(driver, functionality);
		driver.close();
	}
	
	@Test(priority=5)
	public void TC012_Validate_HardLoginModal () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
	    String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner br=new Browserbanner();
		Computed_HardLogin hardlogin = new Computed_HardLogin();
		driver= br.BrowserBanner(driver, functionality);
		driver=br.Clearcookie(driver, functionality);
	    driver=hardlogin.HardLogin_ErrorValidation(driver, functionality, TCName);
		driver.close();
	}
	
	
	@Test(priority=6)
    public void TC008_SMS_preferences_for_opt_in_and_opt_out_NOT_enrolled_for_marketing_SMS () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException

    {
		//For getting current method name and passing as tcname

        String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();    
        Browserbanner br=new Browserbanner();
        Computed_HardLogin hardlogin = new Computed_HardLogin();
        Computed_SoftLogin softlogin =  new Computed_SoftLogin();
        Computed_MyAccount myAcct = new Computed_MyAccount();
        driver= br.BrowserBanner(driver, functionality);
        driver=br.Clearcookie(driver, functionality);
        driver=softlogin.SoftLogin_Rewards(driver, functionality,TCName);
        driver=hardlogin.Account_HardLogin(driver, functionality,TCName);    
        driver=myAcct.MarketingSMS_NotEnrolled(driver, functionality, TCName);
        driver.close();
    }
	
	@Test(priority=7)
    public void TC011_SMS_preferences_for_opt_in_and_opt_out_user_previously_opted_in_for_SMS_SEG_fully_enrolled () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException

    {
		//For getting current method name and passing as tcname

        String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();    
        Browserbanner br=new Browserbanner();
        Computed_HardLogin hardlogin = new Computed_HardLogin();
        Computed_SoftLogin softlogin =  new Computed_SoftLogin();
        Computed_MyAccount myAcct = new Computed_MyAccount();
        driver= br.BrowserBanner(driver, functionality);
        driver=br.Clearcookie(driver, functionality);
        driver=softlogin.SoftLogin_Rewards(driver, functionality,TCName);
        driver=hardlogin.Account_HardLogin(driver, functionality,TCName);    
        driver=myAcct.MarketingSMS_AlreadyEnrolled(driver, functionality, TCName);
        driver.close();
    }
	

	
}
