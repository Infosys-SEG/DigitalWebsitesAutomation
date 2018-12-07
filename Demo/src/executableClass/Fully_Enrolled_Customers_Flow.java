package executableClass;
import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import computedClass.Computed_FullyEnrollment_Flow;
public class Fully_Enrolled_Customers_Flow 
{
	WebDriver driver = null;
	String functionality = "Fully_Enrolled_Customers_Flow";
	
	@Test
	public void TC003_EnrollNewProgram_Phonenumber_VerifybyPII () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		Browserbanner br=new Browserbanner();
		Computed_FullyEnrollment_Flow cf= new Computed_FullyEnrollment_Flow();
		driver=br.BrowserBanner(driver, functionality);
		driver= cf.fullsignup(driver);
		driver= cf.fullcardnumber(driver, functionality, tcname);
		driver= cf.fullverifybypii(driver, functionality,tcname);
		driver=cf.fullcontactinfo(driver,functionality, tcname);
		driver=cf.fullaccountinfo(driver,functionality, tcname);
	}
	
	@Test
	public void TC006_EnrollinNewProgram_old_SEG_CRC_number_VerifybyPII () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		Browserbanner br=new Browserbanner();
		Computed_FullyEnrollment_Flow cf= new Computed_FullyEnrollment_Flow();
		driver=br.BrowserBanner(driver, functionality);
		driver= cf.fullsignup(driver);
		driver= cf.fullcardnumber(driver, functionality,tcname);
		driver= cf.fullverifybypii(driver,functionality, tcname);
		driver=cf.fullcontactinfo(driver, functionality,tcname);
		driver=cf.fullaccountinfo(driver, functionality,tcname);
	}
	
	@Test
	public void TC009_EnrollinNewProgram_PlentiCardNumber_VerifybyPII () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		Browserbanner br=new Browserbanner();
		Computed_FullyEnrollment_Flow cf= new Computed_FullyEnrollment_Flow();
		driver=br.BrowserBanner(driver, functionality);
		driver= cf.fullsignup(driver);
		driver= cf.fullcardnumber(driver, functionality,tcname);
		driver= cf.fullverifybypii(driver, functionality,tcname);
		driver=cf.fullcontactinfo(driver, functionality, tcname);
		driver=cf.fullaccountinfo(driver, functionality,tcname);
	}
	
	@Test
	public void TC012_EnrollinNewProgram_G_AND_G_cardNumber_VerifybyPII () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		
		//For getting current method name and passing as tcname
		String tcname = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		Browserbanner br=new Browserbanner();
		Computed_FullyEnrollment_Flow cf= new Computed_FullyEnrollment_Flow();
		driver=br.BrowserBanner(driver, functionality);
		driver= cf.fullsignup(driver);
		driver= cf.fullcardnumber(driver,functionality, tcname);
		driver= cf.fullverifybypii(driver, functionality,tcname);
		driver=cf.fullcontactinfo(driver, functionality,tcname);
		driver=cf.fullaccountinfo(driver, functionality,tcname);
	}
}
