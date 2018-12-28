package executableClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import computedClass.Computed_ContactInfo_ErrorValidation ;

public class Account_Setup_page 
{
	WebDriver driver = null;
	String functionality="Account_Setup_page";
	Browserbanner browserbanner=new Browserbanner();
	Computed_ContactInfo_ErrorValidation contactinfo = new Computed_ContactInfo_ErrorValidation ();
	
	@Test (priority=1)
	public void TC005_Error_message_validation_FirstName() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as TCName
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String Functionality=functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver= browserbanner.Clearcookie(driver, Functionality);
		driver= contactinfo.Contactinfo_nav(driver, Functionality);
		driver=contactinfo.Invalid_Or_Empty_FirstName_ErrMsg(driver, "Invalid_Or_Empty_FirstName_ErrMsg");
		driver=contactinfo.Invalid_Or_Empty_LastName_ErrMsg(driver, "Invalid_Or_Empty_LastName_ErrMsg");
		driver=contactinfo.Empty_DOB_ErrMsg(driver,"Empty_DOB_ErrMsg");
		driver=contactinfo.Empty_PhoneNumber_ErrMsg(driver,"Empty_PhoneNumber_ErrMsg");
		driver=contactinfo.Empty_Address_ErrMsg(driver, "Empty_Address_ErrMsg");
		driver=contactinfo.Empty_City_ErrMsg(driver,"Empty_City_ErrMsg");
		driver=contactinfo.Empty_State_ErrMsg(driver,"Empty_State_ErrMsg");
		driver=contactinfo.Empty_Zipcode_ErrMsg(driver, "Empty_Zipcode_ErrMsg");
	    driver.close();
	}
	
	@Test (priority=2)
	public void TC004_Error_message_validation_Salutation () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String Functionality=functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver= browserbanner.Clearcookie(driver, Functionality);
		driver= contactinfo.Contactinfo_nav(driver, Functionality);
		driver= contactinfo.ContactInfoPage_Nosalutation(driver, Functionality,TCName,"Error_landline_primaryphone");
		driver.close();
		
	}
	@Test (priority=3)
	public void TC023_ErrorMessage_validation_cellphone_and_Landline () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String Functionality=functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver= browserbanner.Clearcookie(driver, Functionality);
		driver= contactinfo.Contactinfo_nav(driver, Functionality);
		driver= contactinfo.Empty_Offers_selection(driver, Functionality,TCName,"Empty_Offers_selection");
		driver.close();
	}

	@Test (priority=4)
	public void TC010_Error_message_validation_character_and_special_characters_in_Phone_Number () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String Functionality=functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver= browserbanner.Clearcookie(driver, Functionality);
		driver= contactinfo.Contactinfo_nav(driver, Functionality);
		driver= contactinfo.ContactInfoPage_phone(driver,Functionality,TCName);
		driver.close();
	
	}
	


}
