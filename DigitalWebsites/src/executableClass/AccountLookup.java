package executableClass;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import computedClass.Computed_AccountLookup_ErrorValidation;

public class AccountLookup {
	
	WebDriver driver;
	String functionality = "Account_Lookup";
	Browserbanner browserbanner = new Browserbanner();
	Computed_AccountLookup_ErrorValidation accountLookup = new Computed_AccountLookup_ErrorValidation();
	
	@Test(priority=1)
	public void TC009_phoneNumberCentralOfficeCode_Validation() throws InterruptedException, IOException, AWTException
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String Functionality = functionality;
		
		//Testing for sample data- I
		driver = browserbanner.BrowserBanner(driver, Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver = accountLookup.AccountLookup_EnterPhoneNumber(driver, Functionality, TCName, "ValidInputNumber_1");
		driver = accountLookup.validate_phoneNumber_CentralOfficeCodeNumber(driver, Functionality, TCName, "Already_Registered_PhoneNumber_ErrMsg");
		driver.close();
		
		//Testing for sample data-II
		browserbanner = new Browserbanner();
		driver = browserbanner.BrowserBanner(driver,Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver = accountLookup.AccountLookup_EnterPhoneNumber(driver, Functionality, TCName, "ValidInputNumber_2");
		driver = accountLookup.validate_phoneNumber_CentralOfficeCodeNumber(driver, Functionality, TCName, "Already_Registered_PhoneNumber_ErrMsg");
		driver.close();
		
		//Testing for sample data-III
		browserbanner = new Browserbanner();
		driver = browserbanner.BrowserBanner(driver,Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver = accountLookup.AccountLookup_EnterPhoneNumber(driver, Functionality, TCName, "ValidInputNumber_3");
		driver = accountLookup.validate_phoneNumber_CentralOfficeCodeNumber(driver, Functionality, TCName, "Already_Registered_PhoneNumber_ErrMsg");		
		driver.close();
	}
	
	@Test(priority=4)
	public void TC012_Verify_the_error_message_if_Central_Office_Code_number_range_format_is_invalid() throws InterruptedException, IOException, AWTException
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String Functionality = functionality;
		
		//Testing for sample data- I
		driver = browserbanner.BrowserBanner(driver,Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver = accountLookup.AccountLookup_EnterPhoneNumber(driver, Functionality, TCName, "InvalidInputNumber_1");
		driver = accountLookup.validate_phoneNumber_CentralOfficeCodeNumber(driver, Functionality, TCName, "Invalid_10_Digits_phoneNumber_ErrMsg");
		driver.close();
		
		//Testing for sample data-II
		browserbanner = new Browserbanner();
		driver = browserbanner.BrowserBanner(driver,Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver = accountLookup.AccountLookup_EnterPhoneNumber(driver, Functionality, TCName, "InvalidInputNumber_2");
		driver = accountLookup.validate_phoneNumber_CentralOfficeCodeNumber(driver, Functionality, TCName, "Invalid_10_Digits_phoneNumber_ErrMsg");	
		driver.close();		
	}
	
	@Test(priority=5)
	public void TC011_Verify_the_error_message_if_NPA_number_range_format_is_invalid() throws InterruptedException, IOException, AWTException
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String Functionality = functionality;
		
		//Testing for sample data- I
		driver = browserbanner.BrowserBanner(driver,Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver = accountLookup.AccountLookup_EnterPhoneNumber(driver, Functionality, TCName, "InvalidInputNumber_1");
		driver = accountLookup.validate_phoneNumber_CentralOfficeCodeNumber(driver, Functionality, TCName, "Invalid_10_Digits_phoneNumber_ErrMsg");
		driver.close();
		
		//Testing for sample data-II
		browserbanner = new Browserbanner();
		driver = browserbanner.BrowserBanner(driver,Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver = accountLookup.AccountLookup_EnterPhoneNumber(driver, Functionality, TCName, "InvalidInputNumber_2");
		driver = accountLookup.validate_phoneNumber_CentralOfficeCodeNumber(driver, Functionality, TCName, "Invalid_10_Digits_phoneNumber_ErrMsg");
		driver.close();
	}
	
	
	@Test(priority=6)
	public void TC004_Validate_the_error_message_for_invalid_phone_number() throws InterruptedException, IOException, AWTException
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String Functionality = functionality;
		
		//Testing for sample data- I
		driver = browserbanner.BrowserBanner(driver,Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver = accountLookup.AccountLookup_EnterPhoneNumber(driver, Functionality, TCName, "InvalidInputNumber_1");
		driver = accountLookup.Error_Invalid_PhoneNumber_Msg(driver, Functionality, TCName, "Invalid_10_Digits_phoneNumber_ErrMsg");	
		driver = accountLookup.AccountLookup_EnterPhoneNumber(driver, Functionality, TCName, "InvalidInputNumber_2");
		driver = accountLookup.Error_Invalid_PhoneNumber_Lessthan10Digits_Msg(driver, Functionality, TCName, "LessThan_10_digits_Or_specialCharacters_PhoneNumber_ErrMsg");
		driver = accountLookup.AccountLookup_EnterPhoneNumberCardNumberWithChars(driver, Functionality, TCName, "PhoneNumberwithChars");
		driver = accountLookup.AccountLookup_EnterPhoneNumberCardNumberWithChars(driver, Functionality, TCName, "PhoneNumberwithSplChars");
		driver.close();
	}
	
	
	@Test(priority=7)
	public void TC005_Validate_the_error_message_for_invalid_card_number() throws InterruptedException, IOException, AWTException
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String Functionality = functionality;
		
		//Testing for sample data- I
		driver = browserbanner.BrowserBanner(driver,Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		
		//Card number already registered
		driver = accountLookup.AccountLookup_EnterCardNumber(driver, Functionality, TCName, "AlreadyRegistered_CardNumber");
		driver = accountLookup.Error_CardNumber_AlreadyRegistered_Msg(driver, Functionality, TCName, "Already_Registered_CardNumber_ErrMsg");
		
		//Invalid card  number, invalid format
		driver = accountLookup.AccountLookup_EnterCardNumber(driver, Functionality, TCName, "InvalidFormat_CardNumber");
		driver = accountLookup.Error_Invalid_CardNumber_Msg(driver, Functionality, TCName, "Invalid_16_digits_Card_Format_ErrMsg");
		
		//Invalid card  number, invalid format
		driver = accountLookup.AccountLookup_EnterPhoneNumberCardNumberWithChars(driver, Functionality, TCName, "WithChars_CardNumber");
		driver.close();		
	}
	
	@Test(priority=2)
	public void TC008_phoneNumberNPACode_Validation() throws InterruptedException, IOException, AWTException
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String Functionality = functionality;
		
		//Testing for sample data- I
		driver = browserbanner.BrowserBanner(driver,Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver = accountLookup.AccountLookup_EnterPhoneNumber(driver, Functionality, TCName, "ValidInputNumber_1");
		driver = accountLookup.validate_phoneNumber_NPACodeNumber(driver, Functionality, TCName, "Already_Registered_CardNumber_ErrMsg");
		driver.close();
		
		//Testing for sample data-II
		browserbanner = new Browserbanner();
		driver = browserbanner.BrowserBanner(driver,Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver = accountLookup.AccountLookup_EnterPhoneNumber(driver, Functionality, TCName, "ValidInputNumber_2");
		driver = accountLookup.validate_phoneNumber_NPACodeNumber(driver, Functionality, TCName, "Already_Registered_CardNumber_ErrMsg");
		driver.close();
		
		//Testing for sample data-III
		browserbanner = new Browserbanner();
		driver = browserbanner.BrowserBanner(driver,Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver = accountLookup.AccountLookup_EnterPhoneNumber(driver, Functionality, TCName, "ValidInputNumber_3");
		driver = accountLookup.validate_phoneNumber_NPACodeNumber(driver, Functionality, TCName, "Already_Registered_CardNumber_ErrMsg");	
		driver.close();
	}
	
	@Test(priority=3)
	public void TC010_phoneNumber_validation_for_Subscriber_number() throws InterruptedException, IOException, AWTException
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String Functionality = functionality;
		
		//Testing for sample data- I
		driver = browserbanner.BrowserBanner(driver,Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver = accountLookup.AccountLookup_EnterPhoneNumber(driver, Functionality, TCName, "ValidInputNumber_1");
		driver = accountLookup.validate_phoneNumber_SubscriberNumber(driver, Functionality, TCName, "Already_Registered_CardNumber_ErrMsg");
		driver.close();
		
		//Testing for sample data-II
		browserbanner = new Browserbanner();
		driver = browserbanner.BrowserBanner(driver,Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver = accountLookup.AccountLookup_EnterPhoneNumber(driver, Functionality, TCName, "ValidInputNumber_2");
		driver = accountLookup.validate_phoneNumber_SubscriberNumber(driver, Functionality, TCName, "Already_Registered_CardNumber_ErrMsg");
		driver.close();
		
		//Testing for sample data-III
		browserbanner = new Browserbanner();
		driver = browserbanner.BrowserBanner(driver,Functionality);
		driver = browserbanner.Clearcookie(driver, Functionality);
		driver = accountLookup.AccountLookup_EnterPhoneNumber(driver, Functionality, TCName, "ValidInputNumber_3");
		driver = accountLookup.validate_phoneNumber_SubscriberNumber(driver, Functionality, TCName, "Already_Registered_CardNumber_ErrMsg");
		driver.close();
	}
}
