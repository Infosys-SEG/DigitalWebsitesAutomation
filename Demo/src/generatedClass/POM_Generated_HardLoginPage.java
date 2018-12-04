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
	@FindBy(xpath = "//a[@href='/segrewards/account-lookup']")
	public WebElement click_NotAMember_SignUpNow_Link;
	

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

}
