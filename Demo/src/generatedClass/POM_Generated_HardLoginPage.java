//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_HardLoginPage { 
	WebDriver driver;
	public POM_Generated_HardLoginPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : Email_Id_Field
	@FindBy(id = "loginEmail")
	public WebElement txt_Email_Id_Field;
	
	// Associated Label : Password_Field
	@FindBy(id = "loginPassword")
	public WebElement txt_Password_Field;
	
	// Associated Label : Login_Button
	@FindBy(id = "HardLogin_btnlogin")
	public WebElement click_Login_Button;
	
	// Associated Label : Popup_Close_Button
	@FindBy(id = "closehardloginmodal")
	public WebElement click_Popup_Close_Button;
	
	// Associated Label : Forget_Password_Link
	@FindBy(xpath = "//a[@href='/forgotpasswordlink']")
	public WebElement click_Forget_Password_Link;
	
	// Associated Label : NotAMember_SignUpNow_Link
	@FindBy(xpath = "//a[@href='/segrewards/account-lookup'][@class='registerLoginLink']")
	public WebElement click_NotAMember_SignUpNow_Link;
	
	// Associated Label : Error_Email_NotExist_Msg
	@FindBy(id = "HardLogin_errEmailNotExist")
	public WebElement txt_Error_Email_NotExist_Msg;
	
	// Associated Label : Error_Incorrect_Password_Msg
	@FindBy(id  = "HardLogin_errPwdNotExist")
	public WebElement txt_Error_Incorrect_Password_Msg;
	
	// Associated Label : Error_Invalid_Password_Msg
	@FindBy(id = "HardLogin_errPwd")
	public WebElement txt_Error_Invalid_Password_Msg;
	
	//Associated Label : Error_Invalid_Email_Msg
	@FindBy(id = "HardLogin_errEmail")
	public WebElement txt_Error_Invalid_Email_Msg;
	
	// Associated Label : FAQ_link
	@FindBy(xpath = "//a[@href='http://www.segrewards.com/faqs']")
	public WebElement click_FAQ_link;
	
	// Associated Label : reCapcha_Label
	@FindBy(xpath = "//label[contains(text(),'not a robot')]")
	public WebElement txt_reCapcha_Label;
	

//*******************************************************************************


	// Element Actions


	// Type:  Email_Id_Field
	public void type_txt_Email_Id_Field(String value) {
		txt_Email_Id_Field.clear();
		txt_Email_Id_Field.sendKeys(value);
	}

	//click:  Email_Id_Field
	public void click_txt_Email_Id_Field(){
		txt_Email_Id_Field.click();
	}

	// Hover:  Email_Id_Field
	public void hover_txt_Email_Id_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Email_Id_Field).build().perform();
	}

	// visible or Not :  Email_Id_Field
	public boolean isDisplayed_txt_Email_Id_Field(){
		if(txt_Email_Id_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Email_Id_Field
	public boolean isEnabled_txt_Email_Id_Field(){
		if(txt_Email_Id_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Email_Id_Field
	public String getCssValue_txt_Email_Id_Field(String attribute) {
		return txt_Email_Id_Field.getCssValue(attribute);
	}

	//Get the text :  Email_Id_Field
	public String getText_txt_Email_Id_Field(){
		return txt_Email_Id_Field.getText();
	}

	//Get the value :  Email_Id_Field
	public String getValue_txt_Email_Id_Field(){
		return txt_Email_Id_Field.getAttribute("value");
	}
	// selected or Not :  Email_Id_Field
	public boolean isSelected_txt_Email_Id_Field(){
		if(txt_Email_Id_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Password_Field
	public void type_txt_Password_Field(String value) {
		txt_Password_Field.clear();
		txt_Password_Field.sendKeys(value);
	}

	//click:  Password_Field
	public void click_txt_Password_Field(){
		txt_Password_Field.click();
	}

	// Hover:  Password_Field
	public void hover_txt_Password_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Password_Field).build().perform();
	}

	// visible or Not :  Password_Field
	public boolean isDisplayed_txt_Password_Field(){
		if(txt_Password_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Password_Field
	public boolean isEnabled_txt_Password_Field(){
		if(txt_Password_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Password_Field
	public String getCssValue_txt_Password_Field(String attribute) {
		return txt_Password_Field.getCssValue(attribute);
	}

	//Get the text :  Password_Field
	public String getText_txt_Password_Field(){
		return txt_Password_Field.getText();
	}

	//Get the value :  Password_Field
	public String getValue_txt_Password_Field(){
		return txt_Password_Field.getAttribute("value");
	}
	// selected or Not :  Password_Field
	public boolean isSelected_txt_Password_Field(){
		if(txt_Password_Field.isSelected()) { return true; } else { return false;} 
	}

	//click:  Login_Button
	public void click_click_Login_Button(){
		click_Login_Button.click();
	}

	// Hover:  Login_Button
	public void hover_click_Login_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Login_Button).build().perform();
	}

	// visible or Not :  Login_Button
	public boolean isDisplayed_click_Login_Button(){
		if(click_Login_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Login_Button
	public boolean isEnabled_click_Login_Button(){
		if(click_Login_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Login_Button
	public String getCssValue_click_Login_Button(String attribute) {
		return click_Login_Button.getCssValue(attribute);
	}

	//Get the text :  Login_Button
	public String getText_click_Login_Button(){
		return click_Login_Button.getText();
	}

	//Get the value :  Login_Button
	public String getValue_click_Login_Button(){
		return click_Login_Button.getAttribute("value");
	}
	// selected or Not :  Login_Button
	public boolean isSelected_click_Login_Button(){
		if(click_Login_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Popup_Close_Button
	public void click_click_Popup_Close_Button(){
		click_Popup_Close_Button.click();
	}

	// Hover:  Popup_Close_Button
	public void hover_click_Popup_Close_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Popup_Close_Button).build().perform();
	}

	// visible or Not :  Popup_Close_Button
	public boolean isDisplayed_click_Popup_Close_Button(){
		if(click_Popup_Close_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Popup_Close_Button
	public boolean isEnabled_click_Popup_Close_Button(){
		if(click_Popup_Close_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Popup_Close_Button
	public String getCssValue_click_Popup_Close_Button(String attribute) {
		return click_Popup_Close_Button.getCssValue(attribute);
	}

	//Get the text :  Popup_Close_Button
	public String getText_click_Popup_Close_Button(){
		return click_Popup_Close_Button.getText();
	}

	//Get the value :  Popup_Close_Button
	public String getValue_click_Popup_Close_Button(){
		return click_Popup_Close_Button.getAttribute("value");
	}
	// selected or Not :  Popup_Close_Button
	public boolean isSelected_click_Popup_Close_Button(){
		if(click_Popup_Close_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Forget_Password_Link
	public void click_click_Forget_Password_Link(){
		click_Forget_Password_Link.click();
	}

	// Hover:  Forget_Password_Link
	public void hover_click_Forget_Password_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Forget_Password_Link).build().perform();
	}

	// visible or Not :  Forget_Password_Link
	public boolean isDisplayed_click_Forget_Password_Link(){
		if(click_Forget_Password_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Forget_Password_Link
	public boolean isEnabled_click_Forget_Password_Link(){
		if(click_Forget_Password_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Forget_Password_Link
	public String getCssValue_click_Forget_Password_Link(String attribute) {
		return click_Forget_Password_Link.getCssValue(attribute);
	}

	//Get the text :  Forget_Password_Link
	public String getText_click_Forget_Password_Link(){
		return click_Forget_Password_Link.getText();
	}

	//Get the value :  Forget_Password_Link
	public String getValue_click_Forget_Password_Link(){
		return click_Forget_Password_Link.getAttribute("value");
	}
	// selected or Not :  Forget_Password_Link
	public boolean isSelected_click_Forget_Password_Link(){
		if(click_Forget_Password_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  NotAMember_SignUpNow_Link
	public void click_click_NotAMember_SignUpNow_Link(){
		click_NotAMember_SignUpNow_Link.click();
	}

	// Hover:  NotAMember_SignUpNow_Link
	public void hover_click_NotAMember_SignUpNow_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_NotAMember_SignUpNow_Link).build().perform();
	}

	// visible or Not :  NotAMember_SignUpNow_Link
	public boolean isDisplayed_click_NotAMember_SignUpNow_Link(){
		if(click_NotAMember_SignUpNow_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  NotAMember_SignUpNow_Link
	public boolean isEnabled_click_NotAMember_SignUpNow_Link(){
		if(click_NotAMember_SignUpNow_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  NotAMember_SignUpNow_Link
	public String getCssValue_click_NotAMember_SignUpNow_Link(String attribute) {
		return click_NotAMember_SignUpNow_Link.getCssValue(attribute);
	}

	//Get the text :  NotAMember_SignUpNow_Link
	public String getText_click_NotAMember_SignUpNow_Link(){
		return click_NotAMember_SignUpNow_Link.getText();
	}

	//Get the value :  NotAMember_SignUpNow_Link
	public String getValue_click_NotAMember_SignUpNow_Link(){
		return click_NotAMember_SignUpNow_Link.getAttribute("value");
	}
	// selected or Not :  NotAMember_SignUpNow_Link
	public boolean isSelected_click_NotAMember_SignUpNow_Link(){
		if(click_NotAMember_SignUpNow_Link.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_Email_NotExist_Msg
	public void type_txt_Error_Email_NotExist_Msg(String value) {
		txt_Error_Email_NotExist_Msg.clear();
		txt_Error_Email_NotExist_Msg.sendKeys(value);
	}

	//click:  Error_Email_NotExist_Msg
	public void click_txt_Error_Email_NotExist_Msg(){
		txt_Error_Email_NotExist_Msg.click();
	}

	// Hover:  Error_Email_NotExist_Msg
	public void hover_txt_Error_Email_NotExist_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_Email_NotExist_Msg).build().perform();
	}

	// visible or Not :  Error_Email_NotExist_Msg
	public boolean isDisplayed_txt_Error_Email_NotExist_Msg(){
		if(txt_Error_Email_NotExist_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_Email_NotExist_Msg
	public boolean isEnabled_txt_Error_Email_NotExist_Msg(){
		if(txt_Error_Email_NotExist_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_Email_NotExist_Msg
	public String getCssValue_txt_Error_Email_NotExist_Msg(String attribute) {
		return txt_Error_Email_NotExist_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_Email_NotExist_Msg
	public String getText_txt_Error_Email_NotExist_Msg(){
		return txt_Error_Email_NotExist_Msg.getText();
	}

	//Get the value :  Error_Email_NotExist_Msg
	public String getValue_txt_Error_Email_NotExist_Msg(){
		return txt_Error_Email_NotExist_Msg.getAttribute("value");
	}
	// selected or Not :  Error_Email_NotExist_Msg
	public boolean isSelected_txt_Error_Email_NotExist_Msg(){
		if(txt_Error_Email_NotExist_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_Incorrect_Password_Msg
	public void type_txt_Error_Incorrect_Password_Msg(String value) {
		txt_Error_Incorrect_Password_Msg.clear();
		txt_Error_Incorrect_Password_Msg.sendKeys(value);
	}

	//click:  Error_Incorrect_Password_Msg
	public void click_txt_Error_Incorrect_Password_Msg(){
		txt_Error_Incorrect_Password_Msg.click();
	}

	// Hover:  Error_Incorrect_Password_Msg
	public void hover_txt_Error_Incorrect_Password_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_Incorrect_Password_Msg).build().perform();
	}

	// visible or Not :  Error_Incorrect_Password_Msg
	public boolean isDisplayed_txt_Error_Incorrect_Password_Msg(){
		if(txt_Error_Incorrect_Password_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_Incorrect_Password_Msg
	public boolean isEnabled_txt_Error_Incorrect_Password_Msg(){
		if(txt_Error_Incorrect_Password_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_Incorrect_Password_Msg
	public String getCssValue_txt_Error_Incorrect_Password_Msg(String attribute) {
		return txt_Error_Incorrect_Password_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_Incorrect_Password_Msg
	public String getText_txt_Error_Incorrect_Password_Msg(){
		return txt_Error_Incorrect_Password_Msg.getText();
	}

	//Get the value :  Error_Incorrect_Password_Msg
	public String getValue_txt_Error_Incorrect_Password_Msg(){
		return txt_Error_Incorrect_Password_Msg.getAttribute("value");
	}
	// selected or Not :  Error_Incorrect_Password_Msg
	public boolean isSelected_txt_Error_Incorrect_Password_Msg(){
		if(txt_Error_Incorrect_Password_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_Invalid_Password_Msg
	public void type_txt_Error_Invalid_Password_Msg(String value) {
		txt_Error_Invalid_Password_Msg.clear();
		txt_Error_Invalid_Password_Msg.sendKeys(value);
	}

	//click:  Error_Invalid_Password_Msg
	public void click_txt_Error_Invalid_Password_Msg(){
		txt_Error_Invalid_Password_Msg.click();
	}

	// Hover:  Error_Invalid_Password_Msg
	public void hover_txt_Error_Invalid_Password_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_Invalid_Password_Msg).build().perform();
	}

	// visible or Not :  Error_Invalid_Password_Msg
	public boolean isDisplayed_txt_Error_Invalid_Password_Msg(){
		if(txt_Error_Invalid_Password_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_Invalid_Password_Msg
	public boolean isEnabled_txt_Error_Invalid_Password_Msg(){
		if(txt_Error_Invalid_Password_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_Invalid_Password_Msg
	public String getCssValue_txt_Error_Invalid_Password_Msg(String attribute) {
		return txt_Error_Invalid_Password_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_Invalid_Password_Msg
	public String getText_txt_Error_Invalid_Password_Msg(){
		return txt_Error_Invalid_Password_Msg.getText();
	}

	//Get the value :  Error_Invalid_Password_Msg
	public String getValue_txt_Error_Invalid_Password_Msg(){
		return txt_Error_Invalid_Password_Msg.getAttribute("value");
	}
	// selected or Not :  Error_Invalid_Password_Msg
	public boolean isSelected_txt_Error_Invalid_Password_Msg(){
		if(txt_Error_Invalid_Password_Msg.isSelected()) { return true; } else { return false;} 
	}
	
	//Get the text :  Error_Invalid_Email_Msg
		public String getText_txt_Error_Invalid_Email_Msg(){
			return txt_Error_Invalid_Email_Msg.getText();
		}

	//click:  FAQ_link
	public void click_click_FAQ_link(){
		click_FAQ_link.click();
	}

	// Hover:  FAQ_link
	public void hover_click_FAQ_link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_FAQ_link).build().perform();
	}

	// visible or Not :  FAQ_link
	public boolean isDisplayed_click_FAQ_link(){
		if(click_FAQ_link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  FAQ_link
	public boolean isEnabled_click_FAQ_link(){
		if(click_FAQ_link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  FAQ_link
	public String getCssValue_click_FAQ_link(String attribute) {
		return click_FAQ_link.getCssValue(attribute);
	}

	//Get the text :  FAQ_link
	public String getText_click_FAQ_link(){
		return click_FAQ_link.getText();
	}

	//Get the value :  FAQ_link
	public String getValue_click_FAQ_link(){
		return click_FAQ_link.getAttribute("value");
	}
	// selected or Not :  FAQ_link
	public boolean isSelected_click_FAQ_link(){
		if(click_FAQ_link.isSelected()) { return true; } else { return false;} 
	}

	// Type:  reCapcha_Label
	public void type_txt_reCapcha_Label(String value) {
		txt_reCapcha_Label.clear();
		txt_reCapcha_Label.sendKeys(value);
	}

	//click:  reCapcha_Label
	public void click_txt_reCapcha_Label(){
		txt_reCapcha_Label.click();
	}

	// Hover:  reCapcha_Label
	public void hover_txt_reCapcha_Label(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_reCapcha_Label).build().perform();
	}

	// visible or Not :  reCapcha_Label
	public boolean isDisplayed_txt_reCapcha_Label(){
		if(txt_reCapcha_Label.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  reCapcha_Label
	public boolean isEnabled_txt_reCapcha_Label(){
		if(txt_reCapcha_Label.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  reCapcha_Label
	public String getCssValue_txt_reCapcha_Label(String attribute) {
		return txt_reCapcha_Label.getCssValue(attribute);
	}

	//Get the text :  reCapcha_Label
	public String getText_txt_reCapcha_Label(){
		return txt_reCapcha_Label.getText();
	}

	//Get the value :  reCapcha_Label
	public String getValue_txt_reCapcha_Label(){
		return txt_reCapcha_Label.getAttribute("value");
	}
	// selected or Not :  reCapcha_Label
	public boolean isSelected_txt_reCapcha_Label(){
		if(txt_reCapcha_Label.isSelected()) { return true; } else { return false;} 
	}

}
