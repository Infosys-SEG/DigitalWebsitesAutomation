//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_VerificationPage { 
	WebDriver driver;
	public POM_Generated_VerificationPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : VerificationPage_HeaderName_Text
	@FindBy(xpath = "//div[@class='plenti-header-info']/h1")
	public WebElement txt_VerificationPage_HeaderName_Text;
	
	// Associated Label : SMS_Verification_Button
	@FindBy(name = "SMS")
	public WebElement click_SMS_Verification_Button;
	
	// Associated Label : Email_Verification_Button
	@FindBy(name = "Email")
	public WebElement click_Email_Verification_Button;
	
	// Associated Label : PII_Verification_Button
	@FindBy(name = "PII")
	public WebElement click_PII_Verification_Button;
	
	// Associated Label : PII_Verification_Month_Field
	@FindBy(id = "PIItxtMonth")
	public WebElement txt_PII_Verification_Month_Field;
	
	// Associated Label : PII_Verification_Date_Field
	@FindBy(id = "PIItxtDay")
	public WebElement txt_PII_Verification_Date_Field;
	
	// Associated Label : PII_Verification_Year_Field
	@FindBy(id = "PIItxtYear")
	public WebElement txt_PII_Verification_Year_Field;
	
	// Associated Label : PII_Verification_Zipcode_Field
	@FindBy(id = "PIItxtZip")
	public WebElement txt_PII_Verification_Zipcode_Field;
	
	// Associated Label : PII_Verification_Phone_Number_Field
	@FindBy(id = "PIItxtPhone")
	public WebElement txt_PII_Verification_Phone_Number_Field;
	
	// Associated Label : PII_Verification_Last_Name_Field
	@FindBy(id = "PIItxtName")
	public WebElement txt_PII_Verification_Last_Name_Field;
	
	// Associated Label : PII_Verification_Next_Button
	@FindBy(id = "PIIverifyUser")
	public WebElement click_PII_Verification_Next_Button;
	
	// Associated Label : Try_Another_Method_Button
	@FindBy(id = "verifyAnother")
	public WebElement click_Try_Another_Method_Button;
	
	// Associated Label : Resend_Link
	@FindBy(name = "resend")
	public WebElement click_Resend_Link;
	
	// Associated Label : Enter_Verification_Code_Field
	@FindBy(id  = "verification-txt-final")
	public WebElement txt_Enter_Verification_Code_Field;
	
	// Associated Label : Error_Text_InvalidCode_Msg
	@FindBy(xpath = "//label[@class='verifyNum-invalid'][contains(text(),'Please click below to resend the messag')]")
	public WebElement txt_Error_Text_InvalidCode_Msg;
	
	// Associated Label : Error_Email_InvalidCode_Msg
	@FindBy(xpath = "//label[@class='verifyNum-invalid'][contains(text(),'Click below to resend email')]")
	public WebElement txt_Error_Email_InvalidCode_Msg;
	
	// Associated Label : Error_InvalidCode_After3Attempts_Msg
	@FindBy(xpath = "//label[@class='verifyNum-invalid'][contains(text(),'call customer service at')]")
	public WebElement txt_Error_InvalidCode_After3Attempts_Msg;
	
	// Associated Label : Error_PII_IncorrectAnsweres_Msg
	@FindBy(xpath = "//label[@class='verifyNum-invalid'][contains(text(),'answers you entered seems to be incorrect')]")
	public WebElement txt_Error_PII_IncorrectAnsweres_Msg;
	
	// Associated Label : Error_PII_InvalidMonth_Msg
	@FindBy(xpath = "//span[@id='MonthError'][@style='display: block;']")
	public WebElement txt_Error_PII_InvalidMonth_Msg;
	
	// Associated Label : Error_PII_InvalidDate_Msg
	@FindBy(xpath = "//span[@id='DateError'][@style='display: block;']")
	public WebElement txt_Error_PII_InvalidDate_Msg;
	
	// Associated Label : Error_PII_InvalidYear_Msg
	@FindBy(xpath = "//span[@id='YearError'][@style='display: block;']")
	public WebElement txt_Error_PII_InvalidYear_Msg;
	
	// Associated Label : Error_PII_Zip_Lessthan5digit_Msg
	@FindBy(xpath = "//span[@class='PIIZipError'][@style='display: block;']")
	public WebElement txt_Error_PII_Zip_Lessthan5digit_Msg;
	
	// Associated Label : Error_PII_PhoneNumber
	@FindBy(xpath = "//span[@class='PIIPhoneError'][@style='display: block;']")
	public WebElement txt_Error_PII_PhoneNumber;
	

//*******************************************************************************


	// Element Actions


	// Type:  VerificationPage_HeaderName_Text
	public void type_txt_VerificationPage_HeaderName_Text(String value) {
		txt_VerificationPage_HeaderName_Text.clear();
		txt_VerificationPage_HeaderName_Text.sendKeys(value);
	}

	//click:  VerificationPage_HeaderName_Text
	public void click_txt_VerificationPage_HeaderName_Text(){
		txt_VerificationPage_HeaderName_Text.click();
	}

	// Hover:  VerificationPage_HeaderName_Text
	public void hover_txt_VerificationPage_HeaderName_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_VerificationPage_HeaderName_Text).build().perform();
	}

	// visible or Not :  VerificationPage_HeaderName_Text
	public boolean isDisplayed_txt_VerificationPage_HeaderName_Text(){
		if(txt_VerificationPage_HeaderName_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  VerificationPage_HeaderName_Text
	public boolean isEnabled_txt_VerificationPage_HeaderName_Text(){
		if(txt_VerificationPage_HeaderName_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  VerificationPage_HeaderName_Text
	public String getCssValue_txt_VerificationPage_HeaderName_Text(String attribute) {
		return txt_VerificationPage_HeaderName_Text.getCssValue(attribute);
	}

	//Get the text :  VerificationPage_HeaderName_Text
	public String getText_txt_VerificationPage_HeaderName_Text(){
		return txt_VerificationPage_HeaderName_Text.getText();
	}

	//Get the value :  VerificationPage_HeaderName_Text
	public String getValue_txt_VerificationPage_HeaderName_Text(){
		return txt_VerificationPage_HeaderName_Text.getAttribute("value");
	}
	// selected or Not :  VerificationPage_HeaderName_Text
	public boolean isSelected_txt_VerificationPage_HeaderName_Text(){
		if(txt_VerificationPage_HeaderName_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  SMS_Verification_Button
	public void click_click_SMS_Verification_Button(){
		click_SMS_Verification_Button.click();
	}

	// Hover:  SMS_Verification_Button
	public void hover_click_SMS_Verification_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_SMS_Verification_Button).build().perform();
	}

	// visible or Not :  SMS_Verification_Button
	public boolean isDisplayed_click_SMS_Verification_Button(){
		if(click_SMS_Verification_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  SMS_Verification_Button
	public boolean isEnabled_click_SMS_Verification_Button(){
		if(click_SMS_Verification_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  SMS_Verification_Button
	public String getCssValue_click_SMS_Verification_Button(String attribute) {
		return click_SMS_Verification_Button.getCssValue(attribute);
	}

	//Get the text :  SMS_Verification_Button
	public String getText_click_SMS_Verification_Button(){
		return click_SMS_Verification_Button.getText();
	}

	//Get the value :  SMS_Verification_Button
	public String getValue_click_SMS_Verification_Button(){
		return click_SMS_Verification_Button.getAttribute("value");
	}
	// selected or Not :  SMS_Verification_Button
	public boolean isSelected_click_SMS_Verification_Button(){
		if(click_SMS_Verification_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Email_Verification_Button
	public void click_click_Email_Verification_Button(){
		click_Email_Verification_Button.click();
	}

	// Hover:  Email_Verification_Button
	public void hover_click_Email_Verification_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Email_Verification_Button).build().perform();
	}

	// visible or Not :  Email_Verification_Button
	public boolean isDisplayed_click_Email_Verification_Button(){
		if(click_Email_Verification_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Email_Verification_Button
	public boolean isEnabled_click_Email_Verification_Button(){
		if(click_Email_Verification_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Email_Verification_Button
	public String getCssValue_click_Email_Verification_Button(String attribute) {
		return click_Email_Verification_Button.getCssValue(attribute);
	}

	//Get the text :  Email_Verification_Button
	public String getText_click_Email_Verification_Button(){
		return click_Email_Verification_Button.getText();
	}

	//Get the value :  Email_Verification_Button
	public String getValue_click_Email_Verification_Button(){
		return click_Email_Verification_Button.getAttribute("value");
	}
	// selected or Not :  Email_Verification_Button
	public boolean isSelected_click_Email_Verification_Button(){
		if(click_Email_Verification_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  PII_Verification_Button
	public void click_click_PII_Verification_Button(){
		click_PII_Verification_Button.click();
	}

	// Hover:  PII_Verification_Button
	public void hover_click_PII_Verification_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_PII_Verification_Button).build().perform();
	}

	// visible or Not :  PII_Verification_Button
	public boolean isDisplayed_click_PII_Verification_Button(){
		if(click_PII_Verification_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  PII_Verification_Button
	public boolean isEnabled_click_PII_Verification_Button(){
		if(click_PII_Verification_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  PII_Verification_Button
	public String getCssValue_click_PII_Verification_Button(String attribute) {
		return click_PII_Verification_Button.getCssValue(attribute);
	}

	//Get the text :  PII_Verification_Button
	public String getText_click_PII_Verification_Button(){
		return click_PII_Verification_Button.getText();
	}

	//Get the value :  PII_Verification_Button
	public String getValue_click_PII_Verification_Button(){
		return click_PII_Verification_Button.getAttribute("value");
	}
	// selected or Not :  PII_Verification_Button
	public boolean isSelected_click_PII_Verification_Button(){
		if(click_PII_Verification_Button.isSelected()) { return true; } else { return false;} 
	}

	// Type:  PII_Verification_Month_Field
	public void type_txt_PII_Verification_Month_Field(String value) {
		txt_PII_Verification_Month_Field.clear();
		txt_PII_Verification_Month_Field.sendKeys(value);
	}

	//click:  PII_Verification_Month_Field
	public void click_txt_PII_Verification_Month_Field(){
		txt_PII_Verification_Month_Field.click();
	}

	// Hover:  PII_Verification_Month_Field
	public void hover_txt_PII_Verification_Month_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_PII_Verification_Month_Field).build().perform();
	}

	// visible or Not :  PII_Verification_Month_Field
	public boolean isDisplayed_txt_PII_Verification_Month_Field(){
		if(txt_PII_Verification_Month_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  PII_Verification_Month_Field
	public boolean isEnabled_txt_PII_Verification_Month_Field(){
		if(txt_PII_Verification_Month_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  PII_Verification_Month_Field
	public String getCssValue_txt_PII_Verification_Month_Field(String attribute) {
		return txt_PII_Verification_Month_Field.getCssValue(attribute);
	}

	//Get the text :  PII_Verification_Month_Field
	public String getText_txt_PII_Verification_Month_Field(){
		return txt_PII_Verification_Month_Field.getText();
	}

	//Get the value :  PII_Verification_Month_Field
	public String getValue_txt_PII_Verification_Month_Field(){
		return txt_PII_Verification_Month_Field.getAttribute("value");
	}
	// selected or Not :  PII_Verification_Month_Field
	public boolean isSelected_txt_PII_Verification_Month_Field(){
		if(txt_PII_Verification_Month_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  PII_Verification_Date_Field
	public void type_txt_PII_Verification_Date_Field(String value) {
		txt_PII_Verification_Date_Field.clear();
		txt_PII_Verification_Date_Field.sendKeys(value);
	}

	//click:  PII_Verification_Date_Field
	public void click_txt_PII_Verification_Date_Field(){
		txt_PII_Verification_Date_Field.click();
	}

	// Hover:  PII_Verification_Date_Field
	public void hover_txt_PII_Verification_Date_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_PII_Verification_Date_Field).build().perform();
	}

	// visible or Not :  PII_Verification_Date_Field
	public boolean isDisplayed_txt_PII_Verification_Date_Field(){
		if(txt_PII_Verification_Date_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  PII_Verification_Date_Field
	public boolean isEnabled_txt_PII_Verification_Date_Field(){
		if(txt_PII_Verification_Date_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  PII_Verification_Date_Field
	public String getCssValue_txt_PII_Verification_Date_Field(String attribute) {
		return txt_PII_Verification_Date_Field.getCssValue(attribute);
	}

	//Get the text :  PII_Verification_Date_Field
	public String getText_txt_PII_Verification_Date_Field(){
		return txt_PII_Verification_Date_Field.getText();
	}

	//Get the value :  PII_Verification_Date_Field
	public String getValue_txt_PII_Verification_Date_Field(){
		return txt_PII_Verification_Date_Field.getAttribute("value");
	}
	// selected or Not :  PII_Verification_Date_Field
	public boolean isSelected_txt_PII_Verification_Date_Field(){
		if(txt_PII_Verification_Date_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  PII_Verification_Year_Field
	public void type_txt_PII_Verification_Year_Field(String value) {
		txt_PII_Verification_Year_Field.clear();
		txt_PII_Verification_Year_Field.sendKeys(value);
	}

	//click:  PII_Verification_Year_Field
	public void click_txt_PII_Verification_Year_Field(){
		txt_PII_Verification_Year_Field.click();
	}

	// Hover:  PII_Verification_Year_Field
	public void hover_txt_PII_Verification_Year_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_PII_Verification_Year_Field).build().perform();
	}

	// visible or Not :  PII_Verification_Year_Field
	public boolean isDisplayed_txt_PII_Verification_Year_Field(){
		if(txt_PII_Verification_Year_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  PII_Verification_Year_Field
	public boolean isEnabled_txt_PII_Verification_Year_Field(){
		if(txt_PII_Verification_Year_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  PII_Verification_Year_Field
	public String getCssValue_txt_PII_Verification_Year_Field(String attribute) {
		return txt_PII_Verification_Year_Field.getCssValue(attribute);
	}

	//Get the text :  PII_Verification_Year_Field
	public String getText_txt_PII_Verification_Year_Field(){
		return txt_PII_Verification_Year_Field.getText();
	}

	//Get the value :  PII_Verification_Year_Field
	public String getValue_txt_PII_Verification_Year_Field(){
		return txt_PII_Verification_Year_Field.getAttribute("value");
	}
	// selected or Not :  PII_Verification_Year_Field
	public boolean isSelected_txt_PII_Verification_Year_Field(){
		if(txt_PII_Verification_Year_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  PII_Verification_Zipcode_Field
	public void type_txt_PII_Verification_Zipcode_Field(String value) {
		txt_PII_Verification_Zipcode_Field.clear();
		txt_PII_Verification_Zipcode_Field.sendKeys(value);
	}

	//click:  PII_Verification_Zipcode_Field
	public void click_txt_PII_Verification_Zipcode_Field(){
		txt_PII_Verification_Zipcode_Field.click();
	}

	// Hover:  PII_Verification_Zipcode_Field
	public void hover_txt_PII_Verification_Zipcode_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_PII_Verification_Zipcode_Field).build().perform();
	}

	// visible or Not :  PII_Verification_Zipcode_Field
	public boolean isDisplayed_txt_PII_Verification_Zipcode_Field(){
		if(txt_PII_Verification_Zipcode_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  PII_Verification_Zipcode_Field
	public boolean isEnabled_txt_PII_Verification_Zipcode_Field(){
		if(txt_PII_Verification_Zipcode_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  PII_Verification_Zipcode_Field
	public String getCssValue_txt_PII_Verification_Zipcode_Field(String attribute) {
		return txt_PII_Verification_Zipcode_Field.getCssValue(attribute);
	}

	//Get the text :  PII_Verification_Zipcode_Field
	public String getText_txt_PII_Verification_Zipcode_Field(){
		return txt_PII_Verification_Zipcode_Field.getText();
	}

	//Get the value :  PII_Verification_Zipcode_Field
	public String getValue_txt_PII_Verification_Zipcode_Field(){
		return txt_PII_Verification_Zipcode_Field.getAttribute("value");
	}
	// selected or Not :  PII_Verification_Zipcode_Field
	public boolean isSelected_txt_PII_Verification_Zipcode_Field(){
		if(txt_PII_Verification_Zipcode_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  PII_Verification_Phone_Number_Field
	public void type_txt_PII_Verification_Phone_Number_Field(String value) {
		txt_PII_Verification_Phone_Number_Field.clear();
		txt_PII_Verification_Phone_Number_Field.sendKeys(value);
	}

	//click:  PII_Verification_Phone_Number_Field
	public void click_txt_PII_Verification_Phone_Number_Field(){
		txt_PII_Verification_Phone_Number_Field.click();
	}

	// Hover:  PII_Verification_Phone_Number_Field
	public void hover_txt_PII_Verification_Phone_Number_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_PII_Verification_Phone_Number_Field).build().perform();
	}

	// visible or Not :  PII_Verification_Phone_Number_Field
	public boolean isDisplayed_txt_PII_Verification_Phone_Number_Field(){
		if(txt_PII_Verification_Phone_Number_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  PII_Verification_Phone_Number_Field
	public boolean isEnabled_txt_PII_Verification_Phone_Number_Field(){
		if(txt_PII_Verification_Phone_Number_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  PII_Verification_Phone_Number_Field
	public String getCssValue_txt_PII_Verification_Phone_Number_Field(String attribute) {
		return txt_PII_Verification_Phone_Number_Field.getCssValue(attribute);
	}

	//Get the text :  PII_Verification_Phone_Number_Field
	public String getText_txt_PII_Verification_Phone_Number_Field(){
		return txt_PII_Verification_Phone_Number_Field.getText();
	}

	//Get the value :  PII_Verification_Phone_Number_Field
	public String getValue_txt_PII_Verification_Phone_Number_Field(){
		return txt_PII_Verification_Phone_Number_Field.getAttribute("value");
	}
	// selected or Not :  PII_Verification_Phone_Number_Field
	public boolean isSelected_txt_PII_Verification_Phone_Number_Field(){
		if(txt_PII_Verification_Phone_Number_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  PII_Verification_Last_Name_Field
	public void type_txt_PII_Verification_Last_Name_Field(String value) {
		txt_PII_Verification_Last_Name_Field.clear();
		txt_PII_Verification_Last_Name_Field.sendKeys(value);
	}

	//click:  PII_Verification_Last_Name_Field
	public void click_txt_PII_Verification_Last_Name_Field(){
		txt_PII_Verification_Last_Name_Field.click();
	}

	// Hover:  PII_Verification_Last_Name_Field
	public void hover_txt_PII_Verification_Last_Name_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_PII_Verification_Last_Name_Field).build().perform();
	}

	// visible or Not :  PII_Verification_Last_Name_Field
	public boolean isDisplayed_txt_PII_Verification_Last_Name_Field(){
		if(txt_PII_Verification_Last_Name_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  PII_Verification_Last_Name_Field
	public boolean isEnabled_txt_PII_Verification_Last_Name_Field(){
		if(txt_PII_Verification_Last_Name_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  PII_Verification_Last_Name_Field
	public String getCssValue_txt_PII_Verification_Last_Name_Field(String attribute) {
		return txt_PII_Verification_Last_Name_Field.getCssValue(attribute);
	}

	//Get the text :  PII_Verification_Last_Name_Field
	public String getText_txt_PII_Verification_Last_Name_Field(){
		return txt_PII_Verification_Last_Name_Field.getText();
	}

	//Get the value :  PII_Verification_Last_Name_Field
	public String getValue_txt_PII_Verification_Last_Name_Field(){
		return txt_PII_Verification_Last_Name_Field.getAttribute("value");
	}
	// selected or Not :  PII_Verification_Last_Name_Field
	public boolean isSelected_txt_PII_Verification_Last_Name_Field(){
		if(txt_PII_Verification_Last_Name_Field.isSelected()) { return true; } else { return false;} 
	}

	//click:  PII_Verification_Next_Button
	public void click_click_PII_Verification_Next_Button(){
		click_PII_Verification_Next_Button.click();
	}

	// Hover:  PII_Verification_Next_Button
	public void hover_click_PII_Verification_Next_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_PII_Verification_Next_Button).build().perform();
	}

	// visible or Not :  PII_Verification_Next_Button
	public boolean isDisplayed_click_PII_Verification_Next_Button(){
		if(click_PII_Verification_Next_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  PII_Verification_Next_Button
	public boolean isEnabled_click_PII_Verification_Next_Button(){
		if(click_PII_Verification_Next_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  PII_Verification_Next_Button
	public String getCssValue_click_PII_Verification_Next_Button(String attribute) {
		return click_PII_Verification_Next_Button.getCssValue(attribute);
	}

	//Get the text :  PII_Verification_Next_Button
	public String getText_click_PII_Verification_Next_Button(){
		return click_PII_Verification_Next_Button.getText();
	}

	//Get the value :  PII_Verification_Next_Button
	public String getValue_click_PII_Verification_Next_Button(){
		return click_PII_Verification_Next_Button.getAttribute("value");
	}
	// selected or Not :  PII_Verification_Next_Button
	public boolean isSelected_click_PII_Verification_Next_Button(){
		if(click_PII_Verification_Next_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Try_Another_Method_Button
	public void click_click_Try_Another_Method_Button(){
		click_Try_Another_Method_Button.click();
	}

	// Hover:  Try_Another_Method_Button
	public void hover_click_Try_Another_Method_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Try_Another_Method_Button).build().perform();
	}

	// visible or Not :  Try_Another_Method_Button
	public boolean isDisplayed_click_Try_Another_Method_Button(){
		if(click_Try_Another_Method_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Try_Another_Method_Button
	public boolean isEnabled_click_Try_Another_Method_Button(){
		if(click_Try_Another_Method_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Try_Another_Method_Button
	public String getCssValue_click_Try_Another_Method_Button(String attribute) {
		return click_Try_Another_Method_Button.getCssValue(attribute);
	}

	//Get the text :  Try_Another_Method_Button
	public String getText_click_Try_Another_Method_Button(){
		return click_Try_Another_Method_Button.getText();
	}

	//Get the value :  Try_Another_Method_Button
	public String getValue_click_Try_Another_Method_Button(){
		return click_Try_Another_Method_Button.getAttribute("value");
	}
	// selected or Not :  Try_Another_Method_Button
	public boolean isSelected_click_Try_Another_Method_Button(){
		if(click_Try_Another_Method_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Resend_Link
	public void click_click_Resend_Link(){
		click_Resend_Link.click();
	}

	// Hover:  Resend_Link
	public void hover_click_Resend_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Resend_Link).build().perform();
	}

	// visible or Not :  Resend_Link
	public boolean isDisplayed_click_Resend_Link(){
		if(click_Resend_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Resend_Link
	public boolean isEnabled_click_Resend_Link(){
		if(click_Resend_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Resend_Link
	public String getCssValue_click_Resend_Link(String attribute) {
		return click_Resend_Link.getCssValue(attribute);
	}

	//Get the text :  Resend_Link
	public String getText_click_Resend_Link(){
		return click_Resend_Link.getText();
	}

	//Get the value :  Resend_Link
	public String getValue_click_Resend_Link(){
		return click_Resend_Link.getAttribute("value");
	}
	// selected or Not :  Resend_Link
	public boolean isSelected_click_Resend_Link(){
		if(click_Resend_Link.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Enter_Verification_Code_Field
	public void type_txt_Enter_Verification_Code_Field(String value) {
		txt_Enter_Verification_Code_Field.clear();
		txt_Enter_Verification_Code_Field.sendKeys(value);
	}

	//click:  Enter_Verification_Code_Field
	public void click_txt_Enter_Verification_Code_Field(){
		txt_Enter_Verification_Code_Field.click();
	}

	// Hover:  Enter_Verification_Code_Field
	public void hover_txt_Enter_Verification_Code_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Enter_Verification_Code_Field).build().perform();
	}

	// visible or Not :  Enter_Verification_Code_Field
	public boolean isDisplayed_txt_Enter_Verification_Code_Field(){
		if(txt_Enter_Verification_Code_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Enter_Verification_Code_Field
	public boolean isEnabled_txt_Enter_Verification_Code_Field(){
		if(txt_Enter_Verification_Code_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Enter_Verification_Code_Field
	public String getCssValue_txt_Enter_Verification_Code_Field(String attribute) {
		return txt_Enter_Verification_Code_Field.getCssValue(attribute);
	}

	//Get the text :  Enter_Verification_Code_Field
	public String getText_txt_Enter_Verification_Code_Field(){
		return txt_Enter_Verification_Code_Field.getText();
	}

	//Get the value :  Enter_Verification_Code_Field
	public String getValue_txt_Enter_Verification_Code_Field(){
		return txt_Enter_Verification_Code_Field.getAttribute("value");
	}
	// selected or Not :  Enter_Verification_Code_Field
	public boolean isSelected_txt_Enter_Verification_Code_Field(){
		if(txt_Enter_Verification_Code_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_Text_InvalidCode_Msg
	public void type_txt_Error_Text_InvalidCode_Msg(String value) {
		txt_Error_Text_InvalidCode_Msg.clear();
		txt_Error_Text_InvalidCode_Msg.sendKeys(value);
	}

	//click:  Error_Text_InvalidCode_Msg
	public void click_txt_Error_Text_InvalidCode_Msg(){
		txt_Error_Text_InvalidCode_Msg.click();
	}

	// Hover:  Error_Text_InvalidCode_Msg
	public void hover_txt_Error_Text_InvalidCode_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_Text_InvalidCode_Msg).build().perform();
	}

	// visible or Not :  Error_Text_InvalidCode_Msg
	public boolean isDisplayed_txt_Error_Text_InvalidCode_Msg(){
		if(txt_Error_Text_InvalidCode_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_Text_InvalidCode_Msg
	public boolean isEnabled_txt_Error_Text_InvalidCode_Msg(){
		if(txt_Error_Text_InvalidCode_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_Text_InvalidCode_Msg
	public String getCssValue_txt_Error_Text_InvalidCode_Msg(String attribute) {
		return txt_Error_Text_InvalidCode_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_Text_InvalidCode_Msg
	public String getText_txt_Error_Text_InvalidCode_Msg(){
		return txt_Error_Text_InvalidCode_Msg.getText();
	}

	//Get the value :  Error_Text_InvalidCode_Msg
	public String getValue_txt_Error_Text_InvalidCode_Msg(){
		return txt_Error_Text_InvalidCode_Msg.getAttribute("value");
	}
	// selected or Not :  Error_Text_InvalidCode_Msg
	public boolean isSelected_txt_Error_Text_InvalidCode_Msg(){
		if(txt_Error_Text_InvalidCode_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_Email_InvalidCode_Msg
	public void type_txt_Error_Email_InvalidCode_Msg(String value) {
		txt_Error_Email_InvalidCode_Msg.clear();
		txt_Error_Email_InvalidCode_Msg.sendKeys(value);
	}

	//click:  Error_Email_InvalidCode_Msg
	public void click_txt_Error_Email_InvalidCode_Msg(){
		txt_Error_Email_InvalidCode_Msg.click();
	}

	// Hover:  Error_Email_InvalidCode_Msg
	public void hover_txt_Error_Email_InvalidCode_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_Email_InvalidCode_Msg).build().perform();
	}

	// visible or Not :  Error_Email_InvalidCode_Msg
	public boolean isDisplayed_txt_Error_Email_InvalidCode_Msg(){
		if(txt_Error_Email_InvalidCode_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_Email_InvalidCode_Msg
	public boolean isEnabled_txt_Error_Email_InvalidCode_Msg(){
		if(txt_Error_Email_InvalidCode_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_Email_InvalidCode_Msg
	public String getCssValue_txt_Error_Email_InvalidCode_Msg(String attribute) {
		return txt_Error_Email_InvalidCode_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_Email_InvalidCode_Msg
	public String getText_txt_Error_Email_InvalidCode_Msg(){
		return txt_Error_Email_InvalidCode_Msg.getText();
	}

	//Get the value :  Error_Email_InvalidCode_Msg
	public String getValue_txt_Error_Email_InvalidCode_Msg(){
		return txt_Error_Email_InvalidCode_Msg.getAttribute("value");
	}
	// selected or Not :  Error_Email_InvalidCode_Msg
	public boolean isSelected_txt_Error_Email_InvalidCode_Msg(){
		if(txt_Error_Email_InvalidCode_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_InvalidCode_After3Attempts_Msg
	public void type_txt_Error_InvalidCode_After3Attempts_Msg(String value) {
		txt_Error_InvalidCode_After3Attempts_Msg.clear();
		txt_Error_InvalidCode_After3Attempts_Msg.sendKeys(value);
	}

	//click:  Error_InvalidCode_After3Attempts_Msg
	public void click_txt_Error_InvalidCode_After3Attempts_Msg(){
		txt_Error_InvalidCode_After3Attempts_Msg.click();
	}

	// Hover:  Error_InvalidCode_After3Attempts_Msg
	public void hover_txt_Error_InvalidCode_After3Attempts_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_InvalidCode_After3Attempts_Msg).build().perform();
	}

	// visible or Not :  Error_InvalidCode_After3Attempts_Msg
	public boolean isDisplayed_txt_Error_InvalidCode_After3Attempts_Msg(){
		if(txt_Error_InvalidCode_After3Attempts_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_InvalidCode_After3Attempts_Msg
	public boolean isEnabled_txt_Error_InvalidCode_After3Attempts_Msg(){
		if(txt_Error_InvalidCode_After3Attempts_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_InvalidCode_After3Attempts_Msg
	public String getCssValue_txt_Error_InvalidCode_After3Attempts_Msg(String attribute) {
		return txt_Error_InvalidCode_After3Attempts_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_InvalidCode_After3Attempts_Msg
	public String getText_txt_Error_InvalidCode_After3Attempts_Msg(){
		return txt_Error_InvalidCode_After3Attempts_Msg.getText();
	}

	//Get the value :  Error_InvalidCode_After3Attempts_Msg
	public String getValue_txt_Error_InvalidCode_After3Attempts_Msg(){
		return txt_Error_InvalidCode_After3Attempts_Msg.getAttribute("value");
	}
	// selected or Not :  Error_InvalidCode_After3Attempts_Msg
	public boolean isSelected_txt_Error_InvalidCode_After3Attempts_Msg(){
		if(txt_Error_InvalidCode_After3Attempts_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_PII_IncorrectAnsweres_Msg
	public void type_txt_Error_PII_IncorrectAnsweres_Msg(String value) {
		txt_Error_PII_IncorrectAnsweres_Msg.clear();
		txt_Error_PII_IncorrectAnsweres_Msg.sendKeys(value);
	}

	//click:  Error_PII_IncorrectAnsweres_Msg
	public void click_txt_Error_PII_IncorrectAnsweres_Msg(){
		txt_Error_PII_IncorrectAnsweres_Msg.click();
	}

	// Hover:  Error_PII_IncorrectAnsweres_Msg
	public void hover_txt_Error_PII_IncorrectAnsweres_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_PII_IncorrectAnsweres_Msg).build().perform();
	}

	// visible or Not :  Error_PII_IncorrectAnsweres_Msg
	public boolean isDisplayed_txt_Error_PII_IncorrectAnsweres_Msg(){
		if(txt_Error_PII_IncorrectAnsweres_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_PII_IncorrectAnsweres_Msg
	public boolean isEnabled_txt_Error_PII_IncorrectAnsweres_Msg(){
		if(txt_Error_PII_IncorrectAnsweres_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_PII_IncorrectAnsweres_Msg
	public String getCssValue_txt_Error_PII_IncorrectAnsweres_Msg(String attribute) {
		return txt_Error_PII_IncorrectAnsweres_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_PII_IncorrectAnsweres_Msg
	public String getText_txt_Error_PII_IncorrectAnsweres_Msg(){
		return txt_Error_PII_IncorrectAnsweres_Msg.getText();
	}

	//Get the value :  Error_PII_IncorrectAnsweres_Msg
	public String getValue_txt_Error_PII_IncorrectAnsweres_Msg(){
		return txt_Error_PII_IncorrectAnsweres_Msg.getAttribute("value");
	}
	// selected or Not :  Error_PII_IncorrectAnsweres_Msg
	public boolean isSelected_txt_Error_PII_IncorrectAnsweres_Msg(){
		if(txt_Error_PII_IncorrectAnsweres_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_PII_InvalidMonth_Msg
	public void type_txt_Error_PII_InvalidMonth_Msg(String value) {
		txt_Error_PII_InvalidMonth_Msg.clear();
		txt_Error_PII_InvalidMonth_Msg.sendKeys(value);
	}

	//click:  Error_PII_InvalidMonth_Msg
	public void click_txt_Error_PII_InvalidMonth_Msg(){
		txt_Error_PII_InvalidMonth_Msg.click();
	}

	// Hover:  Error_PII_InvalidMonth_Msg
	public void hover_txt_Error_PII_InvalidMonth_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_PII_InvalidMonth_Msg).build().perform();
	}

	// visible or Not :  Error_PII_InvalidMonth_Msg
	public boolean isDisplayed_txt_Error_PII_InvalidMonth_Msg(){
		if(txt_Error_PII_InvalidMonth_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_PII_InvalidMonth_Msg
	public boolean isEnabled_txt_Error_PII_InvalidMonth_Msg(){
		if(txt_Error_PII_InvalidMonth_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_PII_InvalidMonth_Msg
	public String getCssValue_txt_Error_PII_InvalidMonth_Msg(String attribute) {
		return txt_Error_PII_InvalidMonth_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_PII_InvalidMonth_Msg
	public String getText_txt_Error_PII_InvalidMonth_Msg(){
		return txt_Error_PII_InvalidMonth_Msg.getText();
	}

	//Get the value :  Error_PII_InvalidMonth_Msg
	public String getValue_txt_Error_PII_InvalidMonth_Msg(){
		return txt_Error_PII_InvalidMonth_Msg.getAttribute("value");
	}
	// selected or Not :  Error_PII_InvalidMonth_Msg
	public boolean isSelected_txt_Error_PII_InvalidMonth_Msg(){
		if(txt_Error_PII_InvalidMonth_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_PII_InvalidDate_Msg
	public void type_txt_Error_PII_InvalidDate_Msg(String value) {
		txt_Error_PII_InvalidDate_Msg.clear();
		txt_Error_PII_InvalidDate_Msg.sendKeys(value);
	}

	//click:  Error_PII_InvalidDate_Msg
	public void click_txt_Error_PII_InvalidDate_Msg(){
		txt_Error_PII_InvalidDate_Msg.click();
	}

	// Hover:  Error_PII_InvalidDate_Msg
	public void hover_txt_Error_PII_InvalidDate_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_PII_InvalidDate_Msg).build().perform();
	}

	// visible or Not :  Error_PII_InvalidDate_Msg
	public boolean isDisplayed_txt_Error_PII_InvalidDate_Msg(){
		if(txt_Error_PII_InvalidDate_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_PII_InvalidDate_Msg
	public boolean isEnabled_txt_Error_PII_InvalidDate_Msg(){
		if(txt_Error_PII_InvalidDate_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_PII_InvalidDate_Msg
	public String getCssValue_txt_Error_PII_InvalidDate_Msg(String attribute) {
		return txt_Error_PII_InvalidDate_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_PII_InvalidDate_Msg
	public String getText_txt_Error_PII_InvalidDate_Msg(){
		return txt_Error_PII_InvalidDate_Msg.getText();
	}

	//Get the value :  Error_PII_InvalidDate_Msg
	public String getValue_txt_Error_PII_InvalidDate_Msg(){
		return txt_Error_PII_InvalidDate_Msg.getAttribute("value");
	}
	// selected or Not :  Error_PII_InvalidDate_Msg
	public boolean isSelected_txt_Error_PII_InvalidDate_Msg(){
		if(txt_Error_PII_InvalidDate_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_PII_InvalidYear_Msg
	public void type_txt_Error_PII_InvalidYear_Msg(String value) {
		txt_Error_PII_InvalidYear_Msg.clear();
		txt_Error_PII_InvalidYear_Msg.sendKeys(value);
	}

	//click:  Error_PII_InvalidYear_Msg
	public void click_txt_Error_PII_InvalidYear_Msg(){
		txt_Error_PII_InvalidYear_Msg.click();
	}

	// Hover:  Error_PII_InvalidYear_Msg
	public void hover_txt_Error_PII_InvalidYear_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_PII_InvalidYear_Msg).build().perform();
	}

	// visible or Not :  Error_PII_InvalidYear_Msg
	public boolean isDisplayed_txt_Error_PII_InvalidYear_Msg(){
		if(txt_Error_PII_InvalidYear_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_PII_InvalidYear_Msg
	public boolean isEnabled_txt_Error_PII_InvalidYear_Msg(){
		if(txt_Error_PII_InvalidYear_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_PII_InvalidYear_Msg
	public String getCssValue_txt_Error_PII_InvalidYear_Msg(String attribute) {
		return txt_Error_PII_InvalidYear_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_PII_InvalidYear_Msg
	public String getText_txt_Error_PII_InvalidYear_Msg(){
		return txt_Error_PII_InvalidYear_Msg.getText();
	}

	//Get the value :  Error_PII_InvalidYear_Msg
	public String getValue_txt_Error_PII_InvalidYear_Msg(){
		return txt_Error_PII_InvalidYear_Msg.getAttribute("value");
	}
	// selected or Not :  Error_PII_InvalidYear_Msg
	public boolean isSelected_txt_Error_PII_InvalidYear_Msg(){
		if(txt_Error_PII_InvalidYear_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_PII_Zip_Lessthan5digit_Msg
	public void type_txt_Error_PII_Zip_Lessthan5digit_Msg(String value) {
		txt_Error_PII_Zip_Lessthan5digit_Msg.clear();
		txt_Error_PII_Zip_Lessthan5digit_Msg.sendKeys(value);
	}

	//click:  Error_PII_Zip_Lessthan5digit_Msg
	public void click_txt_Error_PII_Zip_Lessthan5digit_Msg(){
		txt_Error_PII_Zip_Lessthan5digit_Msg.click();
	}

	// Hover:  Error_PII_Zip_Lessthan5digit_Msg
	public void hover_txt_Error_PII_Zip_Lessthan5digit_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_PII_Zip_Lessthan5digit_Msg).build().perform();
	}

	// visible or Not :  Error_PII_Zip_Lessthan5digit_Msg
	public boolean isDisplayed_txt_Error_PII_Zip_Lessthan5digit_Msg(){
		if(txt_Error_PII_Zip_Lessthan5digit_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_PII_Zip_Lessthan5digit_Msg
	public boolean isEnabled_txt_Error_PII_Zip_Lessthan5digit_Msg(){
		if(txt_Error_PII_Zip_Lessthan5digit_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_PII_Zip_Lessthan5digit_Msg
	public String getCssValue_txt_Error_PII_Zip_Lessthan5digit_Msg(String attribute) {
		return txt_Error_PII_Zip_Lessthan5digit_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_PII_Zip_Lessthan5digit_Msg
	public String getText_txt_Error_PII_Zip_Lessthan5digit_Msg(){
		return txt_Error_PII_Zip_Lessthan5digit_Msg.getText();
	}

	//Get the value :  Error_PII_Zip_Lessthan5digit_Msg
	public String getValue_txt_Error_PII_Zip_Lessthan5digit_Msg(){
		return txt_Error_PII_Zip_Lessthan5digit_Msg.getAttribute("value");
	}
	// selected or Not :  Error_PII_Zip_Lessthan5digit_Msg
	public boolean isSelected_txt_Error_PII_Zip_Lessthan5digit_Msg(){
		if(txt_Error_PII_Zip_Lessthan5digit_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_PII_PhoneNumber
	public void type_txt_Error_PII_PhoneNumber(String value) {
		txt_Error_PII_PhoneNumber.clear();
		txt_Error_PII_PhoneNumber.sendKeys(value);
	}

	//click:  Error_PII_PhoneNumber
	public void click_txt_Error_PII_PhoneNumber(){
		txt_Error_PII_PhoneNumber.click();
	}

	// Hover:  Error_PII_PhoneNumber
	public void hover_txt_Error_PII_PhoneNumber(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_PII_PhoneNumber).build().perform();
	}

	// visible or Not :  Error_PII_PhoneNumber
	public boolean isDisplayed_txt_Error_PII_PhoneNumber(){
		if(txt_Error_PII_PhoneNumber.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_PII_PhoneNumber
	public boolean isEnabled_txt_Error_PII_PhoneNumber(){
		if(txt_Error_PII_PhoneNumber.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_PII_PhoneNumber
	public String getCssValue_txt_Error_PII_PhoneNumber(String attribute) {
		return txt_Error_PII_PhoneNumber.getCssValue(attribute);
	}

	//Get the text :  Error_PII_PhoneNumber
	public String getText_txt_Error_PII_PhoneNumber(){
		return txt_Error_PII_PhoneNumber.getText();
	}

	//Get the value :  Error_PII_PhoneNumber
	public String getValue_txt_Error_PII_PhoneNumber(){
		return txt_Error_PII_PhoneNumber.getAttribute("value");
	}
	// selected or Not :  Error_PII_PhoneNumber
	public boolean isSelected_txt_Error_PII_PhoneNumber(){
		if(txt_Error_PII_PhoneNumber.isSelected()) { return true; } else { return false;} 
	}

}
