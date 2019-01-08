//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class POM_Generated_AccountSecurityPage { 
	WebDriver driver;
	public POM_Generated_AccountSecurityPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : Account_Security_Verify_Text
	@FindBy(xpath = "//*[text()='Account Security']")
	public WebElement txt_Account_Security_Verify_Text;
	
	// Associated Label : Email_Address_Field
	@FindBy(xpath = "//input[@id='email-textbox']")
	public WebElement txt_Email_Address_Field;
	
	// Associated Label : Email_Address_Message_Verify
	@FindBy(xpath = "//span[@class='messageDisplay']")
	public WebElement click_Email_Address_Message_Verify;
	
	// Associated Label : Set_Password1_Field
	@FindBy(id = "txt-pwd")
	public WebElement txt_Set_Password1_Field;
	
	// Associated Label : Set_Password2_Field
	@FindBy(id = "confirm-pwd")
	public WebElement txt_Set_Password2_Field;
	
	// Associated Label : Set_Pin1_Field
	@FindBy(id = "set")
	public WebElement txt_Set_Pin1_Field;
	
	// Associated Label : Set_Pin2_Field
	@FindBy(id = "confirm")
	public WebElement txt_Set_Pin2_Field;
	
	// Associated Label : Terms_And_Condition_Checkbox
	@FindBy(id = "privacyCheckbox")
	public WebElement click_Terms_And_Condition_Checkbox;
	
	// Associated Label : Security_Next_Button
	@FindBy(id = "btn-submit")
	public WebElement click_Security_Next_Button;
	
	// Associated Label : NeverMissADeal_Yes_Button
	@FindBy(id = "yesEmail")
	public WebElement txt_NeverMissADeal_Yes_Button;
	
	// Associated Label : NeverMissADeal_No_Button
	@FindBy(id = "noEmail")
	public WebElement txt_NeverMissADeal_No_Button;
	
	// Associated Label : Error_AlreadyRegistered_Email
	@FindBy(xpath = "//span[@id='ExsistingEmail']")
	public WebElement txt_Error_AlreadyRegistered_Email;
	
	// Associated Label : Error_InvalidEmail
	@FindBy(xpath = "//span[@id='error-email'][@style='display: block;']")
	public WebElement txt_Error_InvalidEmail;
	
	// Associated Label : Error_EmailField_Blank
	@FindBy(xpath = "//span[@id='required-email'][@style='display: block;']")
	public WebElement txt_Error_EmailField_Blank;
	
	// Associated Label : Error_SetPassword_Info_Msg
	@FindBy(xpath = "//span[@id='Pwdinfo-1']")
	public WebElement txt_Error_SetPassword_Info_Msg;
	
	// Associated Label : Error_ConfirmPassword_Info_Msg
	@FindBy(xpath = "//span[@id='Pwdinfo-2']")
	public WebElement txt_Error_ConfirmPassword_Info_Msg;
	
	// Associated Label : Error_NotSamePwds_Msg
	@FindBy(xpath = "//span[@id='pwderror-msg'][@style='display: block;'][contains(text(),'do not match')]")
	public WebElement txt_Error_NotSamePwds_Msg;
	
	// Associated Label : Error_SetPIN_Info_Msg
	@FindBy(xpath = "//span[@id='require-setpin'][@style='display: block;']")
	public WebElement txt_Error_SetPIN_Info_Msg;
	
	// Associated Label : Error_ConfirmPIN_Info_Msg
	@FindBy(xpath = "//span[@id='require-conpin'][@style='display: block;']")
	public WebElement txt_Error_ConfirmPIN_Info_Msg;
	
	// Associated Label : Error_NotSamePINs_Msg
	@FindBy(xpath = "//span[@id='error-confirmpin'][@style='display: block;']")
	public WebElement txt_Error_NotSamePINs_Msg;
	
	// Associated Label : Error_InvalidPins_3Times_Msg
	@FindBy(xpath = "//span[@id='blockpin'][@style='display: block;']")
	public WebElement txt_Error_InvalidPins_3Times_Msg;
	
	// Associated Label : PIN_Requirement_Popup
	@FindBy(xpath = "//div[@class='Rectangle-pin1 hidden-sm hidden-xs']")
	public WebElement txt_PIN_Requirement_Popup;
	
	// Associated Label : Error_TC_Uncheck_Msg
	@FindBy(xpath = "//span[@id='privacyError'][@style='display: block;']")
	public WebElement txt_Error_TC_Uncheck_Msg;
	
	// Associated Label : Info_Icon_SetPIN
	@FindBy(id = "infopin")
	public WebElement click_Info_Icon_SetPIN;
	
	// Associated Label : Info_Icon_ConfirmPIN
	@FindBy(id = "infoconpin")
	public WebElement click_Info_Icon_ConfirmPIN;
	
	// Associated Label : Eye_Icon_SetPIN
	@FindBy(id = "setpinimg")
	public WebElement click_Eye_Icon_SetPIN;
	
	// Associated Label : EYE_Icon_ConfirmPIN
	@FindBy(id = "confirmimg")
	public WebElement click_EYE_Icon_ConfirmPIN;
	
	// Associated Label : img_stepcounter_contactinfo_done
	@FindBy(xpath = "//img[@src='/-/media/statuscheckerstep/contactinfo-visited.png?la=en&mw=1382']")
	public WebElement txt_img_stepcounter_contactinfo_done;
	
	// Associated Label : img_stepcounter_acctsecurity_active
	@FindBy(xpath = "//img[@src='/-/media/statuscheckerstep/security-active.png?la=en&mw=1382']")
	public WebElement txt_img_stepcounter_acctsecurity_active;
	
	// Associated Label : img_stepcounter_verification_done
	@FindBy(xpath = "//img[@src='/-/media/statuscheckerstep/verification-visited.png?la=en&mw=1382']")
	public WebElement txt_img_stepcounter_verification_done;
	

//*******************************************************************************


	// Element Actions


	// Type:  Account_Security_Verify_Text
	public void type_txt_Account_Security_Verify_Text(String value) {
		txt_Account_Security_Verify_Text.clear();
		txt_Account_Security_Verify_Text.sendKeys(value);
	}

	//click:  Account_Security_Verify_Text
	public void click_txt_Account_Security_Verify_Text(){
		txt_Account_Security_Verify_Text.click();
	}

	// Hover:  Account_Security_Verify_Text
	public void hover_txt_Account_Security_Verify_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Account_Security_Verify_Text).build().perform();
	}

	// visible or Not :  Account_Security_Verify_Text
	public boolean isDisplayed_txt_Account_Security_Verify_Text(){
		if(txt_Account_Security_Verify_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Account_Security_Verify_Text
	public boolean isEnabled_txt_Account_Security_Verify_Text(){
		if(txt_Account_Security_Verify_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Account_Security_Verify_Text
	public String getCssValue_txt_Account_Security_Verify_Text(String attribute) {
		return txt_Account_Security_Verify_Text.getCssValue(attribute);
	}

	//Get the text :  Account_Security_Verify_Text
	public String getText_txt_Account_Security_Verify_Text(){
		return txt_Account_Security_Verify_Text.getText();
	}

	//Get the value :  Account_Security_Verify_Text
	public String getValue_txt_Account_Security_Verify_Text(){
		return txt_Account_Security_Verify_Text.getAttribute("value");
	}
	// selected or Not :  Account_Security_Verify_Text
	public boolean isSelected_txt_Account_Security_Verify_Text(){
		if(txt_Account_Security_Verify_Text.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Email_Address_Field
	public void type_txt_Email_Address_Field(String value) {
		txt_Email_Address_Field.clear();
		txt_Email_Address_Field.sendKeys(value);
	}

	//click:  Email_Address_Field
	public void click_txt_Email_Address_Field(){
		txt_Email_Address_Field.click();
	}

	// Hover:  Email_Address_Field
	public void hover_txt_Email_Address_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Email_Address_Field).build().perform();
	}

	// visible or Not :  Email_Address_Field
	public boolean isDisplayed_txt_Email_Address_Field(){
		if(txt_Email_Address_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Email_Address_Field
	public boolean isEnabled_txt_Email_Address_Field(){
		if(txt_Email_Address_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Email_Address_Field
	public String getCssValue_txt_Email_Address_Field(String attribute) {
		return txt_Email_Address_Field.getCssValue(attribute);
	}

	//Get the text :  Email_Address_Field
	public String getText_txt_Email_Address_Field(){
		return txt_Email_Address_Field.getText();
	}

	//Get the value :  Email_Address_Field
	public String getValue_txt_Email_Address_Field(){
		return txt_Email_Address_Field.getAttribute("value");
	}
	// selected or Not :  Email_Address_Field
	public boolean isSelected_txt_Email_Address_Field(){
		if(txt_Email_Address_Field.isSelected()) { return true; } else { return false;} 
	}

	//click:  Email_Address_Message_Verify
	public void click_click_Email_Address_Message_Verify(){
		click_Email_Address_Message_Verify.click();
	}

	// Hover:  Email_Address_Message_Verify
	public void hover_click_Email_Address_Message_Verify(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Email_Address_Message_Verify).build().perform();
	}

	// visible or Not :  Email_Address_Message_Verify
	public boolean isDisplayed_click_Email_Address_Message_Verify(){
		if(click_Email_Address_Message_Verify.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Email_Address_Message_Verify
	public boolean isEnabled_click_Email_Address_Message_Verify(){
		if(click_Email_Address_Message_Verify.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Email_Address_Message_Verify
	public String getCssValue_click_Email_Address_Message_Verify(String attribute) {
		return click_Email_Address_Message_Verify.getCssValue(attribute);
	}

	//Get the text :  Email_Address_Message_Verify
	public String getText_click_Email_Address_Message_Verify(){
		return click_Email_Address_Message_Verify.getText();
	}

	//Get the value :  Email_Address_Message_Verify
	public String getValue_click_Email_Address_Message_Verify(){
		return click_Email_Address_Message_Verify.getAttribute("value");
	}
	// selected or Not :  Email_Address_Message_Verify
	public boolean isSelected_click_Email_Address_Message_Verify(){
		if(click_Email_Address_Message_Verify.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Set_Password1_Field
	public void type_txt_Set_Password1_Field(String value) {
		txt_Set_Password1_Field.clear();
		txt_Set_Password1_Field.sendKeys(value);
	}

	//click:  Set_Password1_Field
	public void click_txt_Set_Password1_Field(){
		txt_Set_Password1_Field.click();
	}

	// Hover:  Set_Password1_Field
	public void hover_txt_Set_Password1_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Set_Password1_Field).build().perform();
	}

	// visible or Not :  Set_Password1_Field
	public boolean isDisplayed_txt_Set_Password1_Field(){
		if(txt_Set_Password1_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Set_Password1_Field
	public boolean isEnabled_txt_Set_Password1_Field(){
		if(txt_Set_Password1_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Set_Password1_Field
	public String getCssValue_txt_Set_Password1_Field(String attribute) {
		return txt_Set_Password1_Field.getCssValue(attribute);
	}

	//Get the text :  Set_Password1_Field
	public String getText_txt_Set_Password1_Field(){
		return txt_Set_Password1_Field.getText();
	}

	//Get the value :  Set_Password1_Field
	public String getValue_txt_Set_Password1_Field(){
		return txt_Set_Password1_Field.getAttribute("value");
	}
	// selected or Not :  Set_Password1_Field
	public boolean isSelected_txt_Set_Password1_Field(){
		if(txt_Set_Password1_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Set_Password2_Field
	public void type_txt_Set_Password2_Field(String value) {
		txt_Set_Password2_Field.clear();
		txt_Set_Password2_Field.sendKeys(value);
	}

	//click:  Set_Password2_Field
	public void click_txt_Set_Password2_Field(){
		txt_Set_Password2_Field.click();
	}

	// Hover:  Set_Password2_Field
	public void hover_txt_Set_Password2_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Set_Password2_Field).build().perform();
	}

	// visible or Not :  Set_Password2_Field
	public boolean isDisplayed_txt_Set_Password2_Field(){
		if(txt_Set_Password2_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Set_Password2_Field
	public boolean isEnabled_txt_Set_Password2_Field(){
		if(txt_Set_Password2_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Set_Password2_Field
	public String getCssValue_txt_Set_Password2_Field(String attribute) {
		return txt_Set_Password2_Field.getCssValue(attribute);
	}

	//Get the text :  Set_Password2_Field
	public String getText_txt_Set_Password2_Field(){
		return txt_Set_Password2_Field.getText();
	}

	//Get the value :  Set_Password2_Field
	public String getValue_txt_Set_Password2_Field(){
		return txt_Set_Password2_Field.getAttribute("value");
	}
	// selected or Not :  Set_Password2_Field
	public boolean isSelected_txt_Set_Password2_Field(){
		if(txt_Set_Password2_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Set_Pin1_Field
	public void type_txt_Set_Pin1_Field(String value) {
		txt_Set_Pin1_Field.clear();
		txt_Set_Pin1_Field.sendKeys(value);
	}

	//click:  Set_Pin1_Field
	public void click_txt_Set_Pin1_Field(){
		txt_Set_Pin1_Field.click();
	}

	// Hover:  Set_Pin1_Field
	public void hover_txt_Set_Pin1_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Set_Pin1_Field).build().perform();
	}

	// visible or Not :  Set_Pin1_Field
	public boolean isDisplayed_txt_Set_Pin1_Field(){
		if(txt_Set_Pin1_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Set_Pin1_Field
	public boolean isEnabled_txt_Set_Pin1_Field(){
		if(txt_Set_Pin1_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Set_Pin1_Field
	public String getCssValue_txt_Set_Pin1_Field(String attribute) {
		return txt_Set_Pin1_Field.getCssValue(attribute);
	}

	//Get the text :  Set_Pin1_Field
	public String getText_txt_Set_Pin1_Field(){
		return txt_Set_Pin1_Field.getText();
	}

	//Get the value :  Set_Pin1_Field
	public String getValue_txt_Set_Pin1_Field(){
		return txt_Set_Pin1_Field.getAttribute("value");
	}
	// selected or Not :  Set_Pin1_Field
	public boolean isSelected_txt_Set_Pin1_Field(){
		if(txt_Set_Pin1_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Set_Pin2_Field
	public void type_txt_Set_Pin2_Field(String value) {
		txt_Set_Pin2_Field.clear();
		txt_Set_Pin2_Field.sendKeys(value);
	}

	//click:  Set_Pin2_Field
	public void click_txt_Set_Pin2_Field(){
		txt_Set_Pin2_Field.click();
	}

	// Hover:  Set_Pin2_Field
	public void hover_txt_Set_Pin2_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Set_Pin2_Field).build().perform();
	}

	// visible or Not :  Set_Pin2_Field
	public boolean isDisplayed_txt_Set_Pin2_Field(){
		if(txt_Set_Pin2_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Set_Pin2_Field
	public boolean isEnabled_txt_Set_Pin2_Field(){
		if(txt_Set_Pin2_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Set_Pin2_Field
	public String getCssValue_txt_Set_Pin2_Field(String attribute) {
		return txt_Set_Pin2_Field.getCssValue(attribute);
	}

	//Get the text :  Set_Pin2_Field
	public String getText_txt_Set_Pin2_Field(){
		return txt_Set_Pin2_Field.getText();
	}

	//Get the value :  Set_Pin2_Field
	public String getValue_txt_Set_Pin2_Field(){
		return txt_Set_Pin2_Field.getAttribute("value");
	}
	// selected or Not :  Set_Pin2_Field
	public boolean isSelected_txt_Set_Pin2_Field(){
		if(txt_Set_Pin2_Field.isSelected()) { return true; } else { return false;} 
	}

	//click:  Terms_And_Condition_Checkbox
	public void click_click_Terms_And_Condition_Checkbox(){
		click_Terms_And_Condition_Checkbox.click();
	}

	// Hover:  Terms_And_Condition_Checkbox
	public void hover_click_Terms_And_Condition_Checkbox(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Terms_And_Condition_Checkbox).build().perform();
	}

	// visible or Not :  Terms_And_Condition_Checkbox
	public boolean isDisplayed_click_Terms_And_Condition_Checkbox(){
		if(click_Terms_And_Condition_Checkbox.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Terms_And_Condition_Checkbox
	public boolean isEnabled_click_Terms_And_Condition_Checkbox(){
		if(click_Terms_And_Condition_Checkbox.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Terms_And_Condition_Checkbox
	public String getCssValue_click_Terms_And_Condition_Checkbox(String attribute) {
		return click_Terms_And_Condition_Checkbox.getCssValue(attribute);
	}

	//Get the text :  Terms_And_Condition_Checkbox
	public String getText_click_Terms_And_Condition_Checkbox(){
		return click_Terms_And_Condition_Checkbox.getText();
	}

	//Get the value :  Terms_And_Condition_Checkbox
	public String getValue_click_Terms_And_Condition_Checkbox(){
		return click_Terms_And_Condition_Checkbox.getAttribute("value");
	}
	// selected or Not :  Terms_And_Condition_Checkbox
	public boolean isSelected_click_Terms_And_Condition_Checkbox(){
		if(click_Terms_And_Condition_Checkbox.isSelected()) { return true; } else { return false;} 
	}

	//click:  Security_Next_Button
	public void click_click_Security_Next_Button(){
		click_Security_Next_Button.click();
	}

	// Hover:  Security_Next_Button
	public void hover_click_Security_Next_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Security_Next_Button).build().perform();
	}

	// visible or Not :  Security_Next_Button
	public boolean isDisplayed_click_Security_Next_Button(){
		if(click_Security_Next_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Security_Next_Button
	public boolean isEnabled_click_Security_Next_Button(){
		if(click_Security_Next_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Security_Next_Button
	public String getCssValue_click_Security_Next_Button(String attribute) {
		return click_Security_Next_Button.getCssValue(attribute);
	}

	//Get the text :  Security_Next_Button
	public String getText_click_Security_Next_Button(){
		return click_Security_Next_Button.getText();
	}

	//Get the value :  Security_Next_Button
	public String getValue_click_Security_Next_Button(){
		return click_Security_Next_Button.getAttribute("value");
	}
	// selected or Not :  Security_Next_Button
	public boolean isSelected_click_Security_Next_Button(){
		if(click_Security_Next_Button.isSelected()) { return true; } else { return false;} 
	}

	// Type:  NeverMissADeal_Yes_Button
	public void type_txt_NeverMissADeal_Yes_Button(String value) {
		txt_NeverMissADeal_Yes_Button.clear();
		txt_NeverMissADeal_Yes_Button.sendKeys(value);
	}

	//click:  NeverMissADeal_Yes_Button
	public void click_txt_NeverMissADeal_Yes_Button(){
		txt_NeverMissADeal_Yes_Button.click();
	}

	// Hover:  NeverMissADeal_Yes_Button
	public void hover_txt_NeverMissADeal_Yes_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_NeverMissADeal_Yes_Button).build().perform();
	}

	// visible or Not :  NeverMissADeal_Yes_Button
	public boolean isDisplayed_txt_NeverMissADeal_Yes_Button(){
		if(txt_NeverMissADeal_Yes_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  NeverMissADeal_Yes_Button
	public boolean isEnabled_txt_NeverMissADeal_Yes_Button(){
		if(txt_NeverMissADeal_Yes_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  NeverMissADeal_Yes_Button
	public String getCssValue_txt_NeverMissADeal_Yes_Button(String attribute) {
		return txt_NeverMissADeal_Yes_Button.getCssValue(attribute);
	}

	//Get the text :  NeverMissADeal_Yes_Button
	public String getText_txt_NeverMissADeal_Yes_Button(){
		return txt_NeverMissADeal_Yes_Button.getText();
	}

	//Get the value :  NeverMissADeal_Yes_Button
	public String getValue_txt_NeverMissADeal_Yes_Button(){
		return txt_NeverMissADeal_Yes_Button.getAttribute("value");
	}
	// selected or Not :  NeverMissADeal_Yes_Button
	public boolean isSelected_txt_NeverMissADeal_Yes_Button(){
		if(txt_NeverMissADeal_Yes_Button.isSelected()) { return true; } else { return false;} 
	}

	// Type:  NeverMissADeal_No_Button
	public void type_txt_NeverMissADeal_No_Button(String value) {
		txt_NeverMissADeal_No_Button.clear();
		txt_NeverMissADeal_No_Button.sendKeys(value);
	}

	//click:  NeverMissADeal_No_Button
	public void click_txt_NeverMissADeal_No_Button(){
		txt_NeverMissADeal_No_Button.click();
	}

	// Hover:  NeverMissADeal_No_Button
	public void hover_txt_NeverMissADeal_No_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_NeverMissADeal_No_Button).build().perform();
	}

	// visible or Not :  NeverMissADeal_No_Button
	public boolean isDisplayed_txt_NeverMissADeal_No_Button(){
		if(txt_NeverMissADeal_No_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  NeverMissADeal_No_Button
	public boolean isEnabled_txt_NeverMissADeal_No_Button(){
		if(txt_NeverMissADeal_No_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  NeverMissADeal_No_Button
	public String getCssValue_txt_NeverMissADeal_No_Button(String attribute) {
		return txt_NeverMissADeal_No_Button.getCssValue(attribute);
	}

	//Get the text :  NeverMissADeal_No_Button
	public String getText_txt_NeverMissADeal_No_Button(){
		return txt_NeverMissADeal_No_Button.getText();
	}

	//Get the value :  NeverMissADeal_No_Button
	public String getValue_txt_NeverMissADeal_No_Button(){
		return txt_NeverMissADeal_No_Button.getAttribute("value");
	}
	// selected or Not :  NeverMissADeal_No_Button
	public boolean isSelected_txt_NeverMissADeal_No_Button(){
		if(txt_NeverMissADeal_No_Button.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_AlreadyRegistered_Email
	public void type_txt_Error_AlreadyRegistered_Email(String value) {
		txt_Error_AlreadyRegistered_Email.clear();
		txt_Error_AlreadyRegistered_Email.sendKeys(value);
	}

	//click:  Error_AlreadyRegistered_Email
	public void click_txt_Error_AlreadyRegistered_Email(){
		txt_Error_AlreadyRegistered_Email.click();
	}

	// Hover:  Error_AlreadyRegistered_Email
	public void hover_txt_Error_AlreadyRegistered_Email(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_AlreadyRegistered_Email).build().perform();
	}

	// visible or Not :  Error_AlreadyRegistered_Email
	public boolean isDisplayed_txt_Error_AlreadyRegistered_Email(){
		if(txt_Error_AlreadyRegistered_Email.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_AlreadyRegistered_Email
	public boolean isEnabled_txt_Error_AlreadyRegistered_Email(){
		if(txt_Error_AlreadyRegistered_Email.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_AlreadyRegistered_Email
	public String getCssValue_txt_Error_AlreadyRegistered_Email(String attribute) {
		return txt_Error_AlreadyRegistered_Email.getCssValue(attribute);
	}

	//Get the text :  Error_AlreadyRegistered_Email
	public String getText_txt_Error_AlreadyRegistered_Email(){
		return txt_Error_AlreadyRegistered_Email.getText();
	}

	//Get the value :  Error_AlreadyRegistered_Email
	public String getValue_txt_Error_AlreadyRegistered_Email(){
		return txt_Error_AlreadyRegistered_Email.getAttribute("value");
	}
	// selected or Not :  Error_AlreadyRegistered_Email
	public boolean isSelected_txt_Error_AlreadyRegistered_Email(){
		if(txt_Error_AlreadyRegistered_Email.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_InvalidEmail
	public void type_txt_Error_InvalidEmail(String value) {
		txt_Error_InvalidEmail.clear();
		txt_Error_InvalidEmail.sendKeys(value);
	}

	//click:  Error_InvalidEmail
	public void click_txt_Error_InvalidEmail(){
		txt_Error_InvalidEmail.click();
	}

	// Hover:  Error_InvalidEmail
	public void hover_txt_Error_InvalidEmail(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_InvalidEmail).build().perform();
	}

	// visible or Not :  Error_InvalidEmail
	public boolean isDisplayed_txt_Error_InvalidEmail(){
		if(txt_Error_InvalidEmail.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_InvalidEmail
	public boolean isEnabled_txt_Error_InvalidEmail(){
		if(txt_Error_InvalidEmail.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_InvalidEmail
	public String getCssValue_txt_Error_InvalidEmail(String attribute) {
		return txt_Error_InvalidEmail.getCssValue(attribute);
	}

	//Get the text :  Error_InvalidEmail
	public String getText_txt_Error_InvalidEmail(){
		return txt_Error_InvalidEmail.getText();
	}

	//Get the value :  Error_InvalidEmail
	public String getValue_txt_Error_InvalidEmail(){
		return txt_Error_InvalidEmail.getAttribute("value");
	}
	// selected or Not :  Error_InvalidEmail
	public boolean isSelected_txt_Error_InvalidEmail(){
		if(txt_Error_InvalidEmail.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_EmailField_Blank
	public void type_txt_Error_EmailField_Blank(String value) {
		txt_Error_EmailField_Blank.clear();
		txt_Error_EmailField_Blank.sendKeys(value);
	}

	//click:  Error_EmailField_Blank
	public void click_txt_Error_EmailField_Blank(){
		txt_Error_EmailField_Blank.click();
	}

	// Hover:  Error_EmailField_Blank
	public void hover_txt_Error_EmailField_Blank(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_EmailField_Blank).build().perform();
	}

	// visible or Not :  Error_EmailField_Blank
	public boolean isDisplayed_txt_Error_EmailField_Blank(){
		if(txt_Error_EmailField_Blank.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_EmailField_Blank
	public boolean isEnabled_txt_Error_EmailField_Blank(){
		if(txt_Error_EmailField_Blank.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_EmailField_Blank
	public String getCssValue_txt_Error_EmailField_Blank(String attribute) {
		return txt_Error_EmailField_Blank.getCssValue(attribute);
	}

	//Get the text :  Error_EmailField_Blank
	public String getText_txt_Error_EmailField_Blank(){
		return txt_Error_EmailField_Blank.getText();
	}

	//Get the value :  Error_EmailField_Blank
	public String getValue_txt_Error_EmailField_Blank(){
		return txt_Error_EmailField_Blank.getAttribute("value");
	}
	// selected or Not :  Error_EmailField_Blank
	public boolean isSelected_txt_Error_EmailField_Blank(){
		if(txt_Error_EmailField_Blank.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_SetPassword_Info_Msg
	public void type_txt_Error_SetPassword_Info_Msg(String value) {
		txt_Error_SetPassword_Info_Msg.clear();
		txt_Error_SetPassword_Info_Msg.sendKeys(value);
	}

	//click:  Error_SetPassword_Info_Msg
	public void click_txt_Error_SetPassword_Info_Msg(){
		txt_Error_SetPassword_Info_Msg.click();
	}

	// Hover:  Error_SetPassword_Info_Msg
	public void hover_txt_Error_SetPassword_Info_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_SetPassword_Info_Msg).build().perform();
	}

	// visible or Not :  Error_SetPassword_Info_Msg
	public boolean isDisplayed_txt_Error_SetPassword_Info_Msg(){
		if(txt_Error_SetPassword_Info_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_SetPassword_Info_Msg
	public boolean isEnabled_txt_Error_SetPassword_Info_Msg(){
		if(txt_Error_SetPassword_Info_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_SetPassword_Info_Msg
	public String getCssValue_txt_Error_SetPassword_Info_Msg(String attribute) {
		return txt_Error_SetPassword_Info_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_SetPassword_Info_Msg
	public String getText_txt_Error_SetPassword_Info_Msg(){
		return txt_Error_SetPassword_Info_Msg.getText();
	}

	//Get the value :  Error_SetPassword_Info_Msg
	public String getValue_txt_Error_SetPassword_Info_Msg(){
		return txt_Error_SetPassword_Info_Msg.getAttribute("value");
	}
	// selected or Not :  Error_SetPassword_Info_Msg
	public boolean isSelected_txt_Error_SetPassword_Info_Msg(){
		if(txt_Error_SetPassword_Info_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_ConfirmPassword_Info_Msg
	public void type_txt_Error_ConfirmPassword_Info_Msg(String value) {
		txt_Error_ConfirmPassword_Info_Msg.clear();
		txt_Error_ConfirmPassword_Info_Msg.sendKeys(value);
	}

	//click:  Error_ConfirmPassword_Info_Msg
	public void click_txt_Error_ConfirmPassword_Info_Msg(){
		txt_Error_ConfirmPassword_Info_Msg.click();
	}

	// Hover:  Error_ConfirmPassword_Info_Msg
	public void hover_txt_Error_ConfirmPassword_Info_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_ConfirmPassword_Info_Msg).build().perform();
	}

	// visible or Not :  Error_ConfirmPassword_Info_Msg
	public boolean isDisplayed_txt_Error_ConfirmPassword_Info_Msg(){
		if(txt_Error_ConfirmPassword_Info_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_ConfirmPassword_Info_Msg
	public boolean isEnabled_txt_Error_ConfirmPassword_Info_Msg(){
		if(txt_Error_ConfirmPassword_Info_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_ConfirmPassword_Info_Msg
	public String getCssValue_txt_Error_ConfirmPassword_Info_Msg(String attribute) {
		return txt_Error_ConfirmPassword_Info_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_ConfirmPassword_Info_Msg
	public String getText_txt_Error_ConfirmPassword_Info_Msg(){
		return txt_Error_ConfirmPassword_Info_Msg.getText();
	}

	//Get the value :  Error_ConfirmPassword_Info_Msg
	public String getValue_txt_Error_ConfirmPassword_Info_Msg(){
		return txt_Error_ConfirmPassword_Info_Msg.getAttribute("value");
	}
	// selected or Not :  Error_ConfirmPassword_Info_Msg
	public boolean isSelected_txt_Error_ConfirmPassword_Info_Msg(){
		if(txt_Error_ConfirmPassword_Info_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_NotSamePwds_Msg
	public void type_txt_Error_NotSamePwds_Msg(String value) {
		txt_Error_NotSamePwds_Msg.clear();
		txt_Error_NotSamePwds_Msg.sendKeys(value);
	}

	//click:  Error_NotSamePwds_Msg
	public void click_txt_Error_NotSamePwds_Msg(){
		txt_Error_NotSamePwds_Msg.click();
	}

	// Hover:  Error_NotSamePwds_Msg
	public void hover_txt_Error_NotSamePwds_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_NotSamePwds_Msg).build().perform();
	}

	// visible or Not :  Error_NotSamePwds_Msg
	public boolean isDisplayed_txt_Error_NotSamePwds_Msg(){
		if(txt_Error_NotSamePwds_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_NotSamePwds_Msg
	public boolean isEnabled_txt_Error_NotSamePwds_Msg(){
		if(txt_Error_NotSamePwds_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_NotSamePwds_Msg
	public String getCssValue_txt_Error_NotSamePwds_Msg(String attribute) {
		return txt_Error_NotSamePwds_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_NotSamePwds_Msg
	public String getText_txt_Error_NotSamePwds_Msg(){
		return txt_Error_NotSamePwds_Msg.getText();
	}

	//Get the value :  Error_NotSamePwds_Msg
	public String getValue_txt_Error_NotSamePwds_Msg(){
		return txt_Error_NotSamePwds_Msg.getAttribute("value");
	}
	// selected or Not :  Error_NotSamePwds_Msg
	public boolean isSelected_txt_Error_NotSamePwds_Msg(){
		if(txt_Error_NotSamePwds_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_SetPIN_Info_Msg
	public void type_txt_Error_SetPIN_Info_Msg(String value) {
		txt_Error_SetPIN_Info_Msg.clear();
		txt_Error_SetPIN_Info_Msg.sendKeys(value);
	}

	//click:  Error_SetPIN_Info_Msg
	public void click_txt_Error_SetPIN_Info_Msg(){
		txt_Error_SetPIN_Info_Msg.click();
	}

	// Hover:  Error_SetPIN_Info_Msg
	public void hover_txt_Error_SetPIN_Info_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_SetPIN_Info_Msg).build().perform();
	}

	// visible or Not :  Error_SetPIN_Info_Msg
	public boolean isDisplayed_txt_Error_SetPIN_Info_Msg(){
		if(txt_Error_SetPIN_Info_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_SetPIN_Info_Msg
	public boolean isEnabled_txt_Error_SetPIN_Info_Msg(){
		if(txt_Error_SetPIN_Info_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_SetPIN_Info_Msg
	public String getCssValue_txt_Error_SetPIN_Info_Msg(String attribute) {
		return txt_Error_SetPIN_Info_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_SetPIN_Info_Msg
	public String getText_txt_Error_SetPIN_Info_Msg(){
		return txt_Error_SetPIN_Info_Msg.getText();
	}

	//Get the value :  Error_SetPIN_Info_Msg
	public String getValue_txt_Error_SetPIN_Info_Msg(){
		return txt_Error_SetPIN_Info_Msg.getAttribute("value");
	}
	// selected or Not :  Error_SetPIN_Info_Msg
	public boolean isSelected_txt_Error_SetPIN_Info_Msg(){
		if(txt_Error_SetPIN_Info_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_ConfirmPIN_Info_Msg
	public void type_txt_Error_ConfirmPIN_Info_Msg(String value) {
		txt_Error_ConfirmPIN_Info_Msg.clear();
		txt_Error_ConfirmPIN_Info_Msg.sendKeys(value);
	}

	//click:  Error_ConfirmPIN_Info_Msg
	public void click_txt_Error_ConfirmPIN_Info_Msg(){
		txt_Error_ConfirmPIN_Info_Msg.click();
	}

	// Hover:  Error_ConfirmPIN_Info_Msg
	public void hover_txt_Error_ConfirmPIN_Info_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_ConfirmPIN_Info_Msg).build().perform();
	}

	// visible or Not :  Error_ConfirmPIN_Info_Msg
	public boolean isDisplayed_txt_Error_ConfirmPIN_Info_Msg(){
		if(txt_Error_ConfirmPIN_Info_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_ConfirmPIN_Info_Msg
	public boolean isEnabled_txt_Error_ConfirmPIN_Info_Msg(){
		if(txt_Error_ConfirmPIN_Info_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_ConfirmPIN_Info_Msg
	public String getCssValue_txt_Error_ConfirmPIN_Info_Msg(String attribute) {
		return txt_Error_ConfirmPIN_Info_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_ConfirmPIN_Info_Msg
	public String getText_txt_Error_ConfirmPIN_Info_Msg(){
		return txt_Error_ConfirmPIN_Info_Msg.getText();
	}

	//Get the value :  Error_ConfirmPIN_Info_Msg
	public String getValue_txt_Error_ConfirmPIN_Info_Msg(){
		return txt_Error_ConfirmPIN_Info_Msg.getAttribute("value");
	}
	// selected or Not :  Error_ConfirmPIN_Info_Msg
	public boolean isSelected_txt_Error_ConfirmPIN_Info_Msg(){
		if(txt_Error_ConfirmPIN_Info_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_NotSamePINs_Msg
	public void type_txt_Error_NotSamePINs_Msg(String value) {
		txt_Error_NotSamePINs_Msg.clear();
		txt_Error_NotSamePINs_Msg.sendKeys(value);
	}

	//click:  Error_NotSamePINs_Msg
	public void click_txt_Error_NotSamePINs_Msg(){
		txt_Error_NotSamePINs_Msg.click();
	}

	// Hover:  Error_NotSamePINs_Msg
	public void hover_txt_Error_NotSamePINs_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_NotSamePINs_Msg).build().perform();
	}

	// visible or Not :  Error_NotSamePINs_Msg
	public boolean isDisplayed_txt_Error_NotSamePINs_Msg(){
		if(txt_Error_NotSamePINs_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_NotSamePINs_Msg
	public boolean isEnabled_txt_Error_NotSamePINs_Msg(){
		if(txt_Error_NotSamePINs_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_NotSamePINs_Msg
	public String getCssValue_txt_Error_NotSamePINs_Msg(String attribute) {
		return txt_Error_NotSamePINs_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_NotSamePINs_Msg
	public String getText_txt_Error_NotSamePINs_Msg(){
		return txt_Error_NotSamePINs_Msg.getText();
	}

	//Get the value :  Error_NotSamePINs_Msg
	public String getValue_txt_Error_NotSamePINs_Msg(){
		return txt_Error_NotSamePINs_Msg.getAttribute("value");
	}
	// selected or Not :  Error_NotSamePINs_Msg
	public boolean isSelected_txt_Error_NotSamePINs_Msg(){
		if(txt_Error_NotSamePINs_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_InvalidPins_3Times_Msg
	public void type_txt_Error_InvalidPins_3Times_Msg(String value) {
		txt_Error_InvalidPins_3Times_Msg.clear();
		txt_Error_InvalidPins_3Times_Msg.sendKeys(value);
	}

	//click:  Error_InvalidPins_3Times_Msg
	public void click_txt_Error_InvalidPins_3Times_Msg(){
		txt_Error_InvalidPins_3Times_Msg.click();
	}

	// Hover:  Error_InvalidPins_3Times_Msg
	public void hover_txt_Error_InvalidPins_3Times_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_InvalidPins_3Times_Msg).build().perform();
	}

	// visible or Not :  Error_InvalidPins_3Times_Msg
	public boolean isDisplayed_txt_Error_InvalidPins_3Times_Msg(){
		if(txt_Error_InvalidPins_3Times_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_InvalidPins_3Times_Msg
	public boolean isEnabled_txt_Error_InvalidPins_3Times_Msg(){
		if(txt_Error_InvalidPins_3Times_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_InvalidPins_3Times_Msg
	public String getCssValue_txt_Error_InvalidPins_3Times_Msg(String attribute) {
		return txt_Error_InvalidPins_3Times_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_InvalidPins_3Times_Msg
	public String getText_txt_Error_InvalidPins_3Times_Msg(){
		return txt_Error_InvalidPins_3Times_Msg.getText();
	}

	//Get the value :  Error_InvalidPins_3Times_Msg
	public String getValue_txt_Error_InvalidPins_3Times_Msg(){
		return txt_Error_InvalidPins_3Times_Msg.getAttribute("value");
	}
	// selected or Not :  Error_InvalidPins_3Times_Msg
	public boolean isSelected_txt_Error_InvalidPins_3Times_Msg(){
		if(txt_Error_InvalidPins_3Times_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  PIN_Requirement_Popup
	public void type_txt_PIN_Requirement_Popup(String value) {
		txt_PIN_Requirement_Popup.clear();
		txt_PIN_Requirement_Popup.sendKeys(value);
	}

	//click:  PIN_Requirement_Popup
	public void click_txt_PIN_Requirement_Popup(){
		txt_PIN_Requirement_Popup.click();
	}

	// Hover:  PIN_Requirement_Popup
	public void hover_txt_PIN_Requirement_Popup(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_PIN_Requirement_Popup).build().perform();
	}

	// visible or Not :  PIN_Requirement_Popup
	public boolean isDisplayed_txt_PIN_Requirement_Popup(){
		if(txt_PIN_Requirement_Popup.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  PIN_Requirement_Popup
	public boolean isEnabled_txt_PIN_Requirement_Popup(){
		if(txt_PIN_Requirement_Popup.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  PIN_Requirement_Popup
	public String getCssValue_txt_PIN_Requirement_Popup(String attribute) {
		return txt_PIN_Requirement_Popup.getCssValue(attribute);
	}

	//Get the text :  PIN_Requirement_Popup
	public String getText_txt_PIN_Requirement_Popup(){
		return txt_PIN_Requirement_Popup.getText();
	}

	//Get the value :  PIN_Requirement_Popup
	public String getValue_txt_PIN_Requirement_Popup(){
		return txt_PIN_Requirement_Popup.getAttribute("value");
	}
	// selected or Not :  PIN_Requirement_Popup
	public boolean isSelected_txt_PIN_Requirement_Popup(){
		if(txt_PIN_Requirement_Popup.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_TC_Uncheck_Msg
	public void type_txt_Error_TC_Uncheck_Msg(String value) {
		txt_Error_TC_Uncheck_Msg.clear();
		txt_Error_TC_Uncheck_Msg.sendKeys(value);
	}

	//click:  Error_TC_Uncheck_Msg
	public void click_txt_Error_TC_Uncheck_Msg(){
		txt_Error_TC_Uncheck_Msg.click();
	}

	// Hover:  Error_TC_Uncheck_Msg
	public void hover_txt_Error_TC_Uncheck_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_TC_Uncheck_Msg).build().perform();
	}

	// visible or Not :  Error_TC_Uncheck_Msg
	public boolean isDisplayed_txt_Error_TC_Uncheck_Msg(){
		if(txt_Error_TC_Uncheck_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_TC_Uncheck_Msg
	public boolean isEnabled_txt_Error_TC_Uncheck_Msg(){
		if(txt_Error_TC_Uncheck_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_TC_Uncheck_Msg
	public String getCssValue_txt_Error_TC_Uncheck_Msg(String attribute) {
		return txt_Error_TC_Uncheck_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_TC_Uncheck_Msg
	public String getText_txt_Error_TC_Uncheck_Msg(){
		return txt_Error_TC_Uncheck_Msg.getText();
	}

	//Get the value :  Error_TC_Uncheck_Msg
	public String getValue_txt_Error_TC_Uncheck_Msg(){
		return txt_Error_TC_Uncheck_Msg.getAttribute("value");
	}
	// selected or Not :  Error_TC_Uncheck_Msg
	public boolean isSelected_txt_Error_TC_Uncheck_Msg(){
		if(txt_Error_TC_Uncheck_Msg.isSelected()) { return true; } else { return false;} 
	}

	//click:  Info_Icon_SetPIN
	public void click_click_Info_Icon_SetPIN(){
		click_Info_Icon_SetPIN.click();
	}

	// Hover:  Info_Icon_SetPIN
	public void hover_click_Info_Icon_SetPIN(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Info_Icon_SetPIN).build().perform();
	}

	// visible or Not :  Info_Icon_SetPIN
	public boolean isDisplayed_click_Info_Icon_SetPIN(){
		if(click_Info_Icon_SetPIN.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Info_Icon_SetPIN
	public boolean isEnabled_click_Info_Icon_SetPIN(){
		if(click_Info_Icon_SetPIN.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Info_Icon_SetPIN
	public String getCssValue_click_Info_Icon_SetPIN(String attribute) {
		return click_Info_Icon_SetPIN.getCssValue(attribute);
	}

	//Get the text :  Info_Icon_SetPIN
	public String getText_click_Info_Icon_SetPIN(){
		return click_Info_Icon_SetPIN.getText();
	}

	//Get the value :  Info_Icon_SetPIN
	public String getValue_click_Info_Icon_SetPIN(){
		return click_Info_Icon_SetPIN.getAttribute("value");
	}
	// selected or Not :  Info_Icon_SetPIN
	public boolean isSelected_click_Info_Icon_SetPIN(){
		if(click_Info_Icon_SetPIN.isSelected()) { return true; } else { return false;} 
	}

	//click:  Info_Icon_ConfirmPIN
	public void click_click_Info_Icon_ConfirmPIN(){
		click_Info_Icon_ConfirmPIN.click();
	}

	// Hover:  Info_Icon_ConfirmPIN
	public void hover_click_Info_Icon_ConfirmPIN(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Info_Icon_ConfirmPIN).build().perform();
	}

	// visible or Not :  Info_Icon_ConfirmPIN
	public boolean isDisplayed_click_Info_Icon_ConfirmPIN(){
		if(click_Info_Icon_ConfirmPIN.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Info_Icon_ConfirmPIN
	public boolean isEnabled_click_Info_Icon_ConfirmPIN(){
		if(click_Info_Icon_ConfirmPIN.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Info_Icon_ConfirmPIN
	public String getCssValue_click_Info_Icon_ConfirmPIN(String attribute) {
		return click_Info_Icon_ConfirmPIN.getCssValue(attribute);
	}

	//Get the text :  Info_Icon_ConfirmPIN
	public String getText_click_Info_Icon_ConfirmPIN(){
		return click_Info_Icon_ConfirmPIN.getText();
	}

	//Get the value :  Info_Icon_ConfirmPIN
	public String getValue_click_Info_Icon_ConfirmPIN(){
		return click_Info_Icon_ConfirmPIN.getAttribute("value");
	}
	// selected or Not :  Info_Icon_ConfirmPIN
	public boolean isSelected_click_Info_Icon_ConfirmPIN(){
		if(click_Info_Icon_ConfirmPIN.isSelected()) { return true; } else { return false;} 
	}

	//click:  Eye_Icon_SetPIN
	public void click_click_Eye_Icon_SetPIN(){
		click_Eye_Icon_SetPIN.click();
	}

	// Hover:  Eye_Icon_SetPIN
	public void hover_click_Eye_Icon_SetPIN(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Eye_Icon_SetPIN).build().perform();
	}

	// visible or Not :  Eye_Icon_SetPIN
	public boolean isDisplayed_click_Eye_Icon_SetPIN(){
		if(click_Eye_Icon_SetPIN.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Eye_Icon_SetPIN
	public boolean isEnabled_click_Eye_Icon_SetPIN(){
		if(click_Eye_Icon_SetPIN.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Eye_Icon_SetPIN
	public String getCssValue_click_Eye_Icon_SetPIN(String attribute) {
		return click_Eye_Icon_SetPIN.getCssValue(attribute);
	}

	//Get the text :  Eye_Icon_SetPIN
	public String getText_click_Eye_Icon_SetPIN(){
		return click_Eye_Icon_SetPIN.getText();
	}

	//Get the value :  Eye_Icon_SetPIN
	public String getValue_click_Eye_Icon_SetPIN(){
		return click_Eye_Icon_SetPIN.getAttribute("value");
	}
	// selected or Not :  Eye_Icon_SetPIN
	public boolean isSelected_click_Eye_Icon_SetPIN(){
		if(click_Eye_Icon_SetPIN.isSelected()) { return true; } else { return false;} 
	}

	//click:  EYE_Icon_ConfirmPIN
	public void click_click_EYE_Icon_ConfirmPIN(){
		click_EYE_Icon_ConfirmPIN.click();
	}

	// Hover:  EYE_Icon_ConfirmPIN
	public void hover_click_EYE_Icon_ConfirmPIN(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_EYE_Icon_ConfirmPIN).build().perform();
	}

	// visible or Not :  EYE_Icon_ConfirmPIN
	public boolean isDisplayed_click_EYE_Icon_ConfirmPIN(){
		if(click_EYE_Icon_ConfirmPIN.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  EYE_Icon_ConfirmPIN
	public boolean isEnabled_click_EYE_Icon_ConfirmPIN(){
		if(click_EYE_Icon_ConfirmPIN.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  EYE_Icon_ConfirmPIN
	public String getCssValue_click_EYE_Icon_ConfirmPIN(String attribute) {
		return click_EYE_Icon_ConfirmPIN.getCssValue(attribute);
	}

	//Get the text :  EYE_Icon_ConfirmPIN
	public String getText_click_EYE_Icon_ConfirmPIN(){
		return click_EYE_Icon_ConfirmPIN.getText();
	}

	//Get the value :  EYE_Icon_ConfirmPIN
	public String getValue_click_EYE_Icon_ConfirmPIN(){
		return click_EYE_Icon_ConfirmPIN.getAttribute("value");
	}
	// selected or Not :  EYE_Icon_ConfirmPIN
	public boolean isSelected_click_EYE_Icon_ConfirmPIN(){
		if(click_EYE_Icon_ConfirmPIN.isSelected()) { return true; } else { return false;} 
	}

	// Type:  img_stepcounter_contactinfo_done
	public void type_txt_img_stepcounter_contactinfo_done(String value) {
		txt_img_stepcounter_contactinfo_done.clear();
		txt_img_stepcounter_contactinfo_done.sendKeys(value);
	}

	//click:  img_stepcounter_contactinfo_done
	public void click_txt_img_stepcounter_contactinfo_done(){
		txt_img_stepcounter_contactinfo_done.click();
	}

	// Hover:  img_stepcounter_contactinfo_done
	public void hover_txt_img_stepcounter_contactinfo_done(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_img_stepcounter_contactinfo_done).build().perform();
	}

	// visible or Not :  img_stepcounter_contactinfo_done
	public boolean isDisplayed_txt_img_stepcounter_contactinfo_done(){
		if(txt_img_stepcounter_contactinfo_done.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  img_stepcounter_contactinfo_done
	public boolean isEnabled_txt_img_stepcounter_contactinfo_done(){
		if(txt_img_stepcounter_contactinfo_done.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  img_stepcounter_contactinfo_done
	public String getCssValue_txt_img_stepcounter_contactinfo_done(String attribute) {
		return txt_img_stepcounter_contactinfo_done.getCssValue(attribute);
	}

	//Get the text :  img_stepcounter_contactinfo_done
	public String getText_txt_img_stepcounter_contactinfo_done(){
		return txt_img_stepcounter_contactinfo_done.getText();
	}

	//Get the value :  img_stepcounter_contactinfo_done
	public String getValue_txt_img_stepcounter_contactinfo_done(){
		return txt_img_stepcounter_contactinfo_done.getAttribute("value");
	}
	// selected or Not :  img_stepcounter_contactinfo_done
	public boolean isSelected_txt_img_stepcounter_contactinfo_done(){
		if(txt_img_stepcounter_contactinfo_done.isSelected()) { return true; } else { return false;} 
	}

	// Type:  img_stepcounter_acctsecurity_active
	public void type_txt_img_stepcounter_acctsecurity_active(String value) {
		txt_img_stepcounter_acctsecurity_active.clear();
		txt_img_stepcounter_acctsecurity_active.sendKeys(value);
	}

	//click:  img_stepcounter_acctsecurity_active
	public void click_txt_img_stepcounter_acctsecurity_active(){
		txt_img_stepcounter_acctsecurity_active.click();
	}

	// Hover:  img_stepcounter_acctsecurity_active
	public void hover_txt_img_stepcounter_acctsecurity_active(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_img_stepcounter_acctsecurity_active).build().perform();
	}

	// visible or Not :  img_stepcounter_acctsecurity_active
	public boolean isDisplayed_txt_img_stepcounter_acctsecurity_active(){
		if(txt_img_stepcounter_acctsecurity_active.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  img_stepcounter_acctsecurity_active
	public boolean isEnabled_txt_img_stepcounter_acctsecurity_active(){
		if(txt_img_stepcounter_acctsecurity_active.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  img_stepcounter_acctsecurity_active
	public String getCssValue_txt_img_stepcounter_acctsecurity_active(String attribute) {
		return txt_img_stepcounter_acctsecurity_active.getCssValue(attribute);
	}

	//Get the text :  img_stepcounter_acctsecurity_active
	public String getText_txt_img_stepcounter_acctsecurity_active(){
		return txt_img_stepcounter_acctsecurity_active.getText();
	}

	//Get the value :  img_stepcounter_acctsecurity_active
	public String getValue_txt_img_stepcounter_acctsecurity_active(){
		return txt_img_stepcounter_acctsecurity_active.getAttribute("value");
	}
	// selected or Not :  img_stepcounter_acctsecurity_active
	public boolean isSelected_txt_img_stepcounter_acctsecurity_active(){
		if(txt_img_stepcounter_acctsecurity_active.isSelected()) { return true; } else { return false;} 
	}

	// Type:  img_stepcounter_verification_done
	public void type_txt_img_stepcounter_verification_done(String value) {
		txt_img_stepcounter_verification_done.clear();
		txt_img_stepcounter_verification_done.sendKeys(value);
	}

	//click:  img_stepcounter_verification_done
	public void click_txt_img_stepcounter_verification_done(){
		txt_img_stepcounter_verification_done.click();
	}

	// Hover:  img_stepcounter_verification_done
	public void hover_txt_img_stepcounter_verification_done(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_img_stepcounter_verification_done).build().perform();
	}

	// visible or Not :  img_stepcounter_verification_done
	public boolean isDisplayed_txt_img_stepcounter_verification_done(){
		if(txt_img_stepcounter_verification_done.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  img_stepcounter_verification_done
	public boolean isEnabled_txt_img_stepcounter_verification_done(){
		if(txt_img_stepcounter_verification_done.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  img_stepcounter_verification_done
	public String getCssValue_txt_img_stepcounter_verification_done(String attribute) {
		return txt_img_stepcounter_verification_done.getCssValue(attribute);
	}

	//Get the text :  img_stepcounter_verification_done
	public String getText_txt_img_stepcounter_verification_done(){
		return txt_img_stepcounter_verification_done.getText();
	}

	//Get the value :  img_stepcounter_verification_done
	public String getValue_txt_img_stepcounter_verification_done(){
		return txt_img_stepcounter_verification_done.getAttribute("value");
	}
	// selected or Not :  img_stepcounter_verification_done
	public boolean isSelected_txt_img_stepcounter_verification_done(){
		if(txt_img_stepcounter_verification_done.isSelected()) { return true; } else { return false;} 
	}

}
