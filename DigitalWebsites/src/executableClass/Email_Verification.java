package executableClass;
import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import computedClass.Computed_Email_Verification ;
import computedClass.Computed_FullyEnrollment_Flow;

public class Email_Verification {
	
	WebDriver driver = null;
	String functionality="Email_Verification";
	Browserbanner browserbanner=new Browserbanner();
	Computed_Email_Verification email = new Computed_Email_Verification();
	Computed_FullyEnrollment_Flow FE= new Computed_FullyEnrollment_Flow();
	
	@Test (priority=1)
	public void TC005_NEXT_button_should_be_grayed_out_till_customer_enter_6_digits() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as TCName
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String Functionality=functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver= browserbanner.Clearcookie(driver, Functionality);
		driver= FE.SignUpPage(driver);
		driver= FE.AccountLookupPage(driver, Functionality, TCName);
		driver=FE.Verificationpage(driver, Functionality, TCName);
        driver=email.email_validatingNext(driver, Functionality, TCName);

	    driver.close();
	}
	
	@Test (priority=2)
	public void TC009_Validate_the_error_message_if_customer_enter_invalid_EMAIL_verification_code_for_first_time () throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as TCName
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String Functionality=functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver= browserbanner.Clearcookie(driver, Functionality);
		driver= FE.SignUpPage(driver);
		driver= FE.AccountLookupPage(driver, Functionality, TCName);
		driver=FE.Verificationpage(driver, Functionality, TCName);
		driver=email.Invalid_code_email(driver, Functionality, TCName,"Invalid_code_email");
		driver=email.Invalid_code_email_thirdtym(driver, Functionality, TCName,"Invalid_code_email_thirdtym");
		//driver.close();
	}
	@Test (priority=3)
	public void TC012_Verify_that_customer_is_not_able_to_enter_characters_or_special_characters_in_SMS_verification_label_text_box()throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		//For getting current method name and passing as TCName
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		String Functionality=functionality;
		driver= browserbanner.BrowserBanner(driver, Functionality);
		driver= browserbanner.Clearcookie(driver, Functionality);
		driver= FE.SignUpPage(driver);
		driver= FE.AccountLookupPage(driver, Functionality, TCName);
		driver=FE.Verificationpage(driver, Functionality, TCName);
		driver=email.email_NextSpl(driver, Functionality, TCName);
		driver.close();
	}
}
