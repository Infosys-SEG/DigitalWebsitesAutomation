//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_AccountLookupPage { 
	WebDriver driver;
	public POM_Generated_AccountLookupPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : Title_Text
	@FindBy(xpath = "//h1[@class='header-title']")
	public WebElement txt_Title_Text;
	
	// Associated Label : Phone_Number_Field
	@FindBy(id = "PlentiPhNumber")
	public WebElement txt_Phone_Number_Field;
	
	// Associated Label : Card_Number_Field
	@FindBy(id = "PlentiCardNumber")
	public WebElement txt_Card_Number_Field;
	
	// Associated Label : Get_Started_With_SEG_Button
	@FindBy(id = "SendVerification")
	public WebElement click_Get_Started_With_SEG_Button;
	
	// Associated Label : Signup_As_New_Member_Button
	@FindBy(xpath = "//a[text()='Sign up as a new member']")
	public WebElement click_Signup_As_New_Member_Button;
	
	// Associated Label : Use_Different_Card_Link
	@FindBy(id = "trycardLink")
	public WebElement click_Use_Different_Card_Link;
	
	// Associated Label : Error_Invalid_CardNumber_Msg
	@FindBy(xpath = "//label[contains(text(),'appear to be a valid card format')][@aria-hidden='false']")
	public WebElement txt_Error_Invalid_CardNumber_Msg;
	
	// Associated Label : Error_Invalid_PhoneNumber_Lessthan10Digits_Msg
	@FindBy(xpath = "//label[contains(text(),'Please enter a valid 10-digit')][@aria-hidden='false']")
	public WebElement txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg;
	
	// Associated Label : Error_Invalid_PhoneNumber_Msg
	@FindBy(xpath = "//label[contains(text(),'you entered seems to be incorrect')][@aria-hidden='false']")
	public WebElement txt_Error_Invalid_PhoneNumber_Msg;
	
	// Associated Label : Error_CardNumber_AlreadyRegistered_Msg
	@FindBy(xpath = "//label[@id='plenticardExistingError']")
	public WebElement txt_Error_CardNumber_AlreadyRegistered_Msg;
	
	// Associated Label : Error_PhoneNumber_AlreadyRegistered_Msg
	@FindBy(xpath = "//label[@id='phonenumberExistingError']")
	public WebElement txt_Error_PhoneNumber_AlreadyRegistered_Msg;
	

//*******************************************************************************


	// Element Actions


	// Type:  Title_Text
	public void type_txt_Title_Text(String value) {
		txt_Title_Text.clear();
		txt_Title_Text.sendKeys(value);
	}

	//click:  Title_Text
	public void click_txt_Title_Text(){
		txt_Title_Text.click();
	}

	// Hover:  Title_Text
	public void hover_txt_Title_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Title_Text).build().perform();
	}

	// visible or Not :  Title_Text
	public boolean isDisplayed_txt_Title_Text(){
		if(txt_Title_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Title_Text
	public boolean isEnabled_txt_Title_Text(){
		if(txt_Title_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Title_Text
	public String getCssValue_txt_Title_Text(String attribute) {
		return txt_Title_Text.getCssValue(attribute);
	}

	//Get the text :  Title_Text
	public String getText_txt_Title_Text(){
		return txt_Title_Text.getText();
	}

	//Get the value :  Title_Text
	public String getValue_txt_Title_Text(){
		return txt_Title_Text.getAttribute("value");
	}
	// selected or Not :  Title_Text
	public boolean isSelected_txt_Title_Text(){
		if(txt_Title_Text.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Phone_Number_Field
	public void type_txt_Phone_Number_Field(String value) {
		txt_Phone_Number_Field.clear();
		txt_Phone_Number_Field.sendKeys(value);
	}

	//click:  Phone_Number_Field
	public void click_txt_Phone_Number_Field(){
		txt_Phone_Number_Field.click();
	}

	// Hover:  Phone_Number_Field
	public void hover_txt_Phone_Number_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Phone_Number_Field).build().perform();
	}

	// visible or Not :  Phone_Number_Field
	public boolean isDisplayed_txt_Phone_Number_Field(){
		if(txt_Phone_Number_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Phone_Number_Field
	public boolean isEnabled_txt_Phone_Number_Field(){
		if(txt_Phone_Number_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Phone_Number_Field
	public String getCssValue_txt_Phone_Number_Field(String attribute) {
		return txt_Phone_Number_Field.getCssValue(attribute);
	}

	//Get the text :  Phone_Number_Field
	public String getText_txt_Phone_Number_Field(){
		return txt_Phone_Number_Field.getText();
	}

	//Get the value :  Phone_Number_Field
	public String getValue_txt_Phone_Number_Field(){
		return txt_Phone_Number_Field.getAttribute("value");
	}
	// selected or Not :  Phone_Number_Field
	public boolean isSelected_txt_Phone_Number_Field(){
		if(txt_Phone_Number_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Card_Number_Field
	public void type_txt_Card_Number_Field(String value) {
		txt_Card_Number_Field.clear();
		txt_Card_Number_Field.sendKeys(value);
	}

	//click:  Card_Number_Field
	public void click_txt_Card_Number_Field(){
		txt_Card_Number_Field.click();
	}

	// Hover:  Card_Number_Field
	public void hover_txt_Card_Number_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Card_Number_Field).build().perform();
	}

	// visible or Not :  Card_Number_Field
	public boolean isDisplayed_txt_Card_Number_Field(){
		if(txt_Card_Number_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Card_Number_Field
	public boolean isEnabled_txt_Card_Number_Field(){
		if(txt_Card_Number_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Card_Number_Field
	public String getCssValue_txt_Card_Number_Field(String attribute) {
		return txt_Card_Number_Field.getCssValue(attribute);
	}

	//Get the text :  Card_Number_Field
	public String getText_txt_Card_Number_Field(){
		return txt_Card_Number_Field.getText();
	}

	//Get the value :  Card_Number_Field
	public String getValue_txt_Card_Number_Field(){
		return txt_Card_Number_Field.getAttribute("value");
	}
	// selected or Not :  Card_Number_Field
	public boolean isSelected_txt_Card_Number_Field(){
		if(txt_Card_Number_Field.isSelected()) { return true; } else { return false;} 
	}

	//click:  Get_Started_With_SEG_Button
	public void click_click_Get_Started_With_SEG_Button(){
		click_Get_Started_With_SEG_Button.click();
	}

	// Hover:  Get_Started_With_SEG_Button
	public void hover_click_Get_Started_With_SEG_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Get_Started_With_SEG_Button).build().perform();
	}

	// visible or Not :  Get_Started_With_SEG_Button
	public boolean isDisplayed_click_Get_Started_With_SEG_Button(){
		if(click_Get_Started_With_SEG_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Get_Started_With_SEG_Button
	public boolean isEnabled_click_Get_Started_With_SEG_Button(){
		if(click_Get_Started_With_SEG_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Get_Started_With_SEG_Button
	public String getCssValue_click_Get_Started_With_SEG_Button(String attribute) {
		return click_Get_Started_With_SEG_Button.getCssValue(attribute);
	}

	//Get the text :  Get_Started_With_SEG_Button
	public String getText_click_Get_Started_With_SEG_Button(){
		return click_Get_Started_With_SEG_Button.getText();
	}

	//Get the value :  Get_Started_With_SEG_Button
	public String getValue_click_Get_Started_With_SEG_Button(){
		return click_Get_Started_With_SEG_Button.getAttribute("value");
	}
	// selected or Not :  Get_Started_With_SEG_Button
	public boolean isSelected_click_Get_Started_With_SEG_Button(){
		if(click_Get_Started_With_SEG_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Signup_As_New_Member_Button
	public void click_click_Signup_As_New_Member_Button(){
		click_Signup_As_New_Member_Button.click();
	}

	// Hover:  Signup_As_New_Member_Button
	public void hover_click_Signup_As_New_Member_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Signup_As_New_Member_Button).build().perform();
	}

	// visible or Not :  Signup_As_New_Member_Button
	public boolean isDisplayed_click_Signup_As_New_Member_Button(){
		if(click_Signup_As_New_Member_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Signup_As_New_Member_Button
	public boolean isEnabled_click_Signup_As_New_Member_Button(){
		if(click_Signup_As_New_Member_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Signup_As_New_Member_Button
	public String getCssValue_click_Signup_As_New_Member_Button(String attribute) {
		return click_Signup_As_New_Member_Button.getCssValue(attribute);
	}

	//Get the text :  Signup_As_New_Member_Button
	public String getText_click_Signup_As_New_Member_Button(){
		return click_Signup_As_New_Member_Button.getText();
	}

	//Get the value :  Signup_As_New_Member_Button
	public String getValue_click_Signup_As_New_Member_Button(){
		return click_Signup_As_New_Member_Button.getAttribute("value");
	}
	// selected or Not :  Signup_As_New_Member_Button
	public boolean isSelected_click_Signup_As_New_Member_Button(){
		if(click_Signup_As_New_Member_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Use_Different_Card_Link
	public void click_click_Use_Different_Card_Link(){
		click_Use_Different_Card_Link.click();
	}

	// Hover:  Use_Different_Card_Link
	public void hover_click_Use_Different_Card_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Use_Different_Card_Link).build().perform();
	}

	// visible or Not :  Use_Different_Card_Link
	public boolean isDisplayed_click_Use_Different_Card_Link(){
		if(click_Use_Different_Card_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Use_Different_Card_Link
	public boolean isEnabled_click_Use_Different_Card_Link(){
		if(click_Use_Different_Card_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Use_Different_Card_Link
	public String getCssValue_click_Use_Different_Card_Link(String attribute) {
		return click_Use_Different_Card_Link.getCssValue(attribute);
	}

	//Get the text :  Use_Different_Card_Link
	public String getText_click_Use_Different_Card_Link(){
		return click_Use_Different_Card_Link.getText();
	}

	//Get the value :  Use_Different_Card_Link
	public String getValue_click_Use_Different_Card_Link(){
		return click_Use_Different_Card_Link.getAttribute("value");
	}
	// selected or Not :  Use_Different_Card_Link
	public boolean isSelected_click_Use_Different_Card_Link(){
		if(click_Use_Different_Card_Link.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_Invalid_CardNumber_Msg
	public void type_txt_Error_Invalid_CardNumber_Msg(String value) {
		txt_Error_Invalid_CardNumber_Msg.clear();
		txt_Error_Invalid_CardNumber_Msg.sendKeys(value);
	}

	//click:  Error_Invalid_CardNumber_Msg
	public void click_txt_Error_Invalid_CardNumber_Msg(){
		txt_Error_Invalid_CardNumber_Msg.click();
	}

	// Hover:  Error_Invalid_CardNumber_Msg
	public void hover_txt_Error_Invalid_CardNumber_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_Invalid_CardNumber_Msg).build().perform();
	}

	// visible or Not :  Error_Invalid_CardNumber_Msg
	public boolean isDisplayed_txt_Error_Invalid_CardNumber_Msg(){
		if(txt_Error_Invalid_CardNumber_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_Invalid_CardNumber_Msg
	public boolean isEnabled_txt_Error_Invalid_CardNumber_Msg(){
		if(txt_Error_Invalid_CardNumber_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_Invalid_CardNumber_Msg
	public String getCssValue_txt_Error_Invalid_CardNumber_Msg(String attribute) {
		return txt_Error_Invalid_CardNumber_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_Invalid_CardNumber_Msg
	public String getText_txt_Error_Invalid_CardNumber_Msg(){
		return txt_Error_Invalid_CardNumber_Msg.getText();
	}

	//Get the value :  Error_Invalid_CardNumber_Msg
	public String getValue_txt_Error_Invalid_CardNumber_Msg(){
		return txt_Error_Invalid_CardNumber_Msg.getAttribute("value");
	}
	// selected or Not :  Error_Invalid_CardNumber_Msg
	public boolean isSelected_txt_Error_Invalid_CardNumber_Msg(){
		if(txt_Error_Invalid_CardNumber_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_Invalid_PhoneNumber_Lessthan10Digits_Msg
	public void type_txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg(String value) {
		txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg.clear();
		txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg.sendKeys(value);
	}

	//click:  Error_Invalid_PhoneNumber_Lessthan10Digits_Msg
	public void click_txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg(){
		txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg.click();
	}

	// Hover:  Error_Invalid_PhoneNumber_Lessthan10Digits_Msg
	public void hover_txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg).build().perform();
	}

	// visible or Not :  Error_Invalid_PhoneNumber_Lessthan10Digits_Msg
	public boolean isDisplayed_txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg(){
		if(txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_Invalid_PhoneNumber_Lessthan10Digits_Msg
	public boolean isEnabled_txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg(){
		if(txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_Invalid_PhoneNumber_Lessthan10Digits_Msg
	public String getCssValue_txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg(String attribute) {
		return txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_Invalid_PhoneNumber_Lessthan10Digits_Msg
	public String getText_txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg(){
		return txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg.getText();
	}

	//Get the value :  Error_Invalid_PhoneNumber_Lessthan10Digits_Msg
	public String getValue_txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg(){
		return txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg.getAttribute("value");
	}
	// selected or Not :  Error_Invalid_PhoneNumber_Lessthan10Digits_Msg
	public boolean isSelected_txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg(){
		if(txt_Error_Invalid_PhoneNumber_Lessthan10Digits_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_Invalid_PhoneNumber_Msg
	public void type_txt_Error_Invalid_PhoneNumber_Msg(String value) {
		txt_Error_Invalid_PhoneNumber_Msg.clear();
		txt_Error_Invalid_PhoneNumber_Msg.sendKeys(value);
	}

	//click:  Error_Invalid_PhoneNumber_Msg
	public void click_txt_Error_Invalid_PhoneNumber_Msg(){
		txt_Error_Invalid_PhoneNumber_Msg.click();
	}

	// Hover:  Error_Invalid_PhoneNumber_Msg
	public void hover_txt_Error_Invalid_PhoneNumber_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_Invalid_PhoneNumber_Msg).build().perform();
	}

	// visible or Not :  Error_Invalid_PhoneNumber_Msg
	public boolean isDisplayed_txt_Error_Invalid_PhoneNumber_Msg(){
		if(txt_Error_Invalid_PhoneNumber_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_Invalid_PhoneNumber_Msg
	public boolean isEnabled_txt_Error_Invalid_PhoneNumber_Msg(){
		if(txt_Error_Invalid_PhoneNumber_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_Invalid_PhoneNumber_Msg
	public String getCssValue_txt_Error_Invalid_PhoneNumber_Msg(String attribute) {
		return txt_Error_Invalid_PhoneNumber_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_Invalid_PhoneNumber_Msg
	public String getText_txt_Error_Invalid_PhoneNumber_Msg(){
		return txt_Error_Invalid_PhoneNumber_Msg.getText();
	}

	//Get the value :  Error_Invalid_PhoneNumber_Msg
	public String getValue_txt_Error_Invalid_PhoneNumber_Msg(){
		return txt_Error_Invalid_PhoneNumber_Msg.getAttribute("value");
	}
	// selected or Not :  Error_Invalid_PhoneNumber_Msg
	public boolean isSelected_txt_Error_Invalid_PhoneNumber_Msg(){
		if(txt_Error_Invalid_PhoneNumber_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_CardNumber_AlreadyRegistered_Msg
	public void type_txt_Error_CardNumber_AlreadyRegistered_Msg(String value) {
		txt_Error_CardNumber_AlreadyRegistered_Msg.clear();
		txt_Error_CardNumber_AlreadyRegistered_Msg.sendKeys(value);
	}

	//click:  Error_CardNumber_AlreadyRegistered_Msg
	public void click_txt_Error_CardNumber_AlreadyRegistered_Msg(){
		txt_Error_CardNumber_AlreadyRegistered_Msg.click();
	}

	// Hover:  Error_CardNumber_AlreadyRegistered_Msg
	public void hover_txt_Error_CardNumber_AlreadyRegistered_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_CardNumber_AlreadyRegistered_Msg).build().perform();
	}

	// visible or Not :  Error_CardNumber_AlreadyRegistered_Msg
	public boolean isDisplayed_txt_Error_CardNumber_AlreadyRegistered_Msg(){
		if(txt_Error_CardNumber_AlreadyRegistered_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_CardNumber_AlreadyRegistered_Msg
	public boolean isEnabled_txt_Error_CardNumber_AlreadyRegistered_Msg(){
		if(txt_Error_CardNumber_AlreadyRegistered_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_CardNumber_AlreadyRegistered_Msg
	public String getCssValue_txt_Error_CardNumber_AlreadyRegistered_Msg(String attribute) {
		return txt_Error_CardNumber_AlreadyRegistered_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_CardNumber_AlreadyRegistered_Msg
	public String getText_txt_Error_CardNumber_AlreadyRegistered_Msg(){
		return txt_Error_CardNumber_AlreadyRegistered_Msg.getText();
	}

	//Get the value :  Error_CardNumber_AlreadyRegistered_Msg
	public String getValue_txt_Error_CardNumber_AlreadyRegistered_Msg(){
		return txt_Error_CardNumber_AlreadyRegistered_Msg.getAttribute("value");
	}
	// selected or Not :  Error_CardNumber_AlreadyRegistered_Msg
	public boolean isSelected_txt_Error_CardNumber_AlreadyRegistered_Msg(){
		if(txt_Error_CardNumber_AlreadyRegistered_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_PhoneNumber_AlreadyRegistered_Msg
	public void type_txt_Error_PhoneNumber_AlreadyRegistered_Msg(String value) {
		txt_Error_PhoneNumber_AlreadyRegistered_Msg.clear();
		txt_Error_PhoneNumber_AlreadyRegistered_Msg.sendKeys(value);
	}

	//click:  Error_PhoneNumber_AlreadyRegistered_Msg
	public void click_txt_Error_PhoneNumber_AlreadyRegistered_Msg(){
		txt_Error_PhoneNumber_AlreadyRegistered_Msg.click();
	}

	// Hover:  Error_PhoneNumber_AlreadyRegistered_Msg
	public void hover_txt_Error_PhoneNumber_AlreadyRegistered_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_PhoneNumber_AlreadyRegistered_Msg).build().perform();
	}

	// visible or Not :  Error_PhoneNumber_AlreadyRegistered_Msg
	public boolean isDisplayed_txt_Error_PhoneNumber_AlreadyRegistered_Msg(){
		if(txt_Error_PhoneNumber_AlreadyRegistered_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_PhoneNumber_AlreadyRegistered_Msg
	public boolean isEnabled_txt_Error_PhoneNumber_AlreadyRegistered_Msg(){
		if(txt_Error_PhoneNumber_AlreadyRegistered_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_PhoneNumber_AlreadyRegistered_Msg
	public String getCssValue_txt_Error_PhoneNumber_AlreadyRegistered_Msg(String attribute) {
		return txt_Error_PhoneNumber_AlreadyRegistered_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_PhoneNumber_AlreadyRegistered_Msg
	public String getText_txt_Error_PhoneNumber_AlreadyRegistered_Msg(){
		return txt_Error_PhoneNumber_AlreadyRegistered_Msg.getText();
	}

	//Get the value :  Error_PhoneNumber_AlreadyRegistered_Msg
	public String getValue_txt_Error_PhoneNumber_AlreadyRegistered_Msg(){
		return txt_Error_PhoneNumber_AlreadyRegistered_Msg.getAttribute("value");
	}
	// selected or Not :  Error_PhoneNumber_AlreadyRegistered_Msg
	public boolean isSelected_txt_Error_PhoneNumber_AlreadyRegistered_Msg(){
		if(txt_Error_PhoneNumber_AlreadyRegistered_Msg.isSelected()) { return true; } else { return false;} 
	}

}
