//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_ForgotPasswordPage { 
	WebDriver driver;
	public POM_Generated_ForgotPasswordPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : Forget_Password_Link
	@FindBy(xpath = "//a[@href='/forgotpasswordlink']")
	public WebElement click_Forget_Password_Link;
	
	// Associated Label : Email_Address_Field
	@FindBy(id = "forgot-email")
	public WebElement txt_Email_Address_Field;
	
	// Associated Label : Send_Reset_Link_Button
	@FindBy(id = "btnResetLink")
	public WebElement click_Send_Reset_Link_Button;
	
	// Associated Label : Error_Invalid_Email_Msg
	@FindBy(id = "invalid-Error")
	public WebElement txt_Error_Invalid_Email_Msg;
	
	// Associated Label : Text_AfterEnteringEmail
	@FindBy(xpath = "//h1[contains(text(),'Check your email')]")
	public WebElement txt_Text_AfterEnteringEmail;
	
	// Associated Label : Code_Info_text
	@FindBy(xpath = "//p[contains(text(),'6 digit authorization')]")
	public WebElement txt_Code_Info_text;
	
	// Associated Label : Page_header_text
	@FindBy(xpath = "//h1[contains(text(),'Forgot Password')]")
	public WebElement txt_Page_header_text;
	
	// Associated Label : Error_Email_NotExist
	@FindBy(xpath = "//span[@id='invalid-usernotexisst'][@style='display: block;']")
	public WebElement txt_Error_Email_NotExist;
	
	// Associated Label : Home_Button
	@FindBy(xpath = "//a[@alt='Home']")
	public WebElement click_Home_Button;
	

//*******************************************************************************


	// Element Actions


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

	//click:  Send_Reset_Link_Button
	public void click_click_Send_Reset_Link_Button(){
		click_Send_Reset_Link_Button.click();
	}

	// Hover:  Send_Reset_Link_Button
	public void hover_click_Send_Reset_Link_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Send_Reset_Link_Button).build().perform();
	}

	// visible or Not :  Send_Reset_Link_Button
	public boolean isDisplayed_click_Send_Reset_Link_Button(){
		if(click_Send_Reset_Link_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Send_Reset_Link_Button
	public boolean isEnabled_click_Send_Reset_Link_Button(){
		if(click_Send_Reset_Link_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Send_Reset_Link_Button
	public String getCssValue_click_Send_Reset_Link_Button(String attribute) {
		return click_Send_Reset_Link_Button.getCssValue(attribute);
	}

	//Get the text :  Send_Reset_Link_Button
	public String getText_click_Send_Reset_Link_Button(){
		return click_Send_Reset_Link_Button.getText();
	}

	//Get the value :  Send_Reset_Link_Button
	public String getValue_click_Send_Reset_Link_Button(){
		return click_Send_Reset_Link_Button.getAttribute("value");
	}
	// selected or Not :  Send_Reset_Link_Button
	public boolean isSelected_click_Send_Reset_Link_Button(){
		if(click_Send_Reset_Link_Button.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_Invalid_Email_Msg
	public void type_txt_Error_Invalid_Email_Msg(String value) {
		txt_Error_Invalid_Email_Msg.clear();
		txt_Error_Invalid_Email_Msg.sendKeys(value);
	}

	//click:  Error_Invalid_Email_Msg
	public void click_txt_Error_Invalid_Email_Msg(){
		txt_Error_Invalid_Email_Msg.click();
	}

	// Hover:  Error_Invalid_Email_Msg
	public void hover_txt_Error_Invalid_Email_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_Invalid_Email_Msg).build().perform();
	}

	// visible or Not :  Error_Invalid_Email_Msg
	public boolean isDisplayed_txt_Error_Invalid_Email_Msg(){
		if(txt_Error_Invalid_Email_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_Invalid_Email_Msg
	public boolean isEnabled_txt_Error_Invalid_Email_Msg(){
		if(txt_Error_Invalid_Email_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_Invalid_Email_Msg
	public String getCssValue_txt_Error_Invalid_Email_Msg(String attribute) {
		return txt_Error_Invalid_Email_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_Invalid_Email_Msg
	public String getText_txt_Error_Invalid_Email_Msg(){
		return txt_Error_Invalid_Email_Msg.getText();
	}

	//Get the value :  Error_Invalid_Email_Msg
	public String getValue_txt_Error_Invalid_Email_Msg(){
		return txt_Error_Invalid_Email_Msg.getAttribute("value");
	}
	// selected or Not :  Error_Invalid_Email_Msg
	public boolean isSelected_txt_Error_Invalid_Email_Msg(){
		if(txt_Error_Invalid_Email_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Text_AfterEnteringEmail
	public void type_txt_Text_AfterEnteringEmail(String value) {
		txt_Text_AfterEnteringEmail.clear();
		txt_Text_AfterEnteringEmail.sendKeys(value);
	}

	//click:  Text_AfterEnteringEmail
	public void click_txt_Text_AfterEnteringEmail(){
		txt_Text_AfterEnteringEmail.click();
	}

	// Hover:  Text_AfterEnteringEmail
	public void hover_txt_Text_AfterEnteringEmail(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Text_AfterEnteringEmail).build().perform();
	}

	// visible or Not :  Text_AfterEnteringEmail
	public boolean isDisplayed_txt_Text_AfterEnteringEmail(){
		if(txt_Text_AfterEnteringEmail.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Text_AfterEnteringEmail
	public boolean isEnabled_txt_Text_AfterEnteringEmail(){
		if(txt_Text_AfterEnteringEmail.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Text_AfterEnteringEmail
	public String getCssValue_txt_Text_AfterEnteringEmail(String attribute) {
		return txt_Text_AfterEnteringEmail.getCssValue(attribute);
	}

	//Get the text :  Text_AfterEnteringEmail
	public String getText_txt_Text_AfterEnteringEmail(){
		return txt_Text_AfterEnteringEmail.getText();
	}

	//Get the value :  Text_AfterEnteringEmail
	public String getValue_txt_Text_AfterEnteringEmail(){
		return txt_Text_AfterEnteringEmail.getAttribute("value");
	}
	// selected or Not :  Text_AfterEnteringEmail
	public boolean isSelected_txt_Text_AfterEnteringEmail(){
		if(txt_Text_AfterEnteringEmail.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Code_Info_text
	public void type_txt_Code_Info_text(String value) {
		txt_Code_Info_text.clear();
		txt_Code_Info_text.sendKeys(value);
	}

	//click:  Code_Info_text
	public void click_txt_Code_Info_text(){
		txt_Code_Info_text.click();
	}

	// Hover:  Code_Info_text
	public void hover_txt_Code_Info_text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Code_Info_text).build().perform();
	}

	// visible or Not :  Code_Info_text
	public boolean isDisplayed_txt_Code_Info_text(){
		if(txt_Code_Info_text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Code_Info_text
	public boolean isEnabled_txt_Code_Info_text(){
		if(txt_Code_Info_text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Code_Info_text
	public String getCssValue_txt_Code_Info_text(String attribute) {
		return txt_Code_Info_text.getCssValue(attribute);
	}

	//Get the text :  Code_Info_text
	public String getText_txt_Code_Info_text(){
		return txt_Code_Info_text.getText();
	}

	//Get the value :  Code_Info_text
	public String getValue_txt_Code_Info_text(){
		return txt_Code_Info_text.getAttribute("value");
	}
	// selected or Not :  Code_Info_text
	public boolean isSelected_txt_Code_Info_text(){
		if(txt_Code_Info_text.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Page_header_text
	public void type_txt_Page_header_text(String value) {
		txt_Page_header_text.clear();
		txt_Page_header_text.sendKeys(value);
	}

	//click:  Page_header_text
	public void click_txt_Page_header_text(){
		txt_Page_header_text.click();
	}

	// Hover:  Page_header_text
	public void hover_txt_Page_header_text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Page_header_text).build().perform();
	}

	// visible or Not :  Page_header_text
	public boolean isDisplayed_txt_Page_header_text(){
		if(txt_Page_header_text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Page_header_text
	public boolean isEnabled_txt_Page_header_text(){
		if(txt_Page_header_text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Page_header_text
	public String getCssValue_txt_Page_header_text(String attribute) {
		return txt_Page_header_text.getCssValue(attribute);
	}

	//Get the text :  Page_header_text
	public String getText_txt_Page_header_text(){
		return txt_Page_header_text.getText();
	}

	//Get the value :  Page_header_text
	public String getValue_txt_Page_header_text(){
		return txt_Page_header_text.getAttribute("value");
	}
	// selected or Not :  Page_header_text
	public boolean isSelected_txt_Page_header_text(){
		if(txt_Page_header_text.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_Email_NotExist
	public void type_txt_Error_Email_NotExist(String value) {
		txt_Error_Email_NotExist.clear();
		txt_Error_Email_NotExist.sendKeys(value);
	}

	//click:  Error_Email_NotExist
	public void click_txt_Error_Email_NotExist(){
		txt_Error_Email_NotExist.click();
	}

	// Hover:  Error_Email_NotExist
	public void hover_txt_Error_Email_NotExist(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_Email_NotExist).build().perform();
	}

	// visible or Not :  Error_Email_NotExist
	public boolean isDisplayed_txt_Error_Email_NotExist(){
		if(txt_Error_Email_NotExist.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_Email_NotExist
	public boolean isEnabled_txt_Error_Email_NotExist(){
		if(txt_Error_Email_NotExist.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_Email_NotExist
	public String getCssValue_txt_Error_Email_NotExist(String attribute) {
		return txt_Error_Email_NotExist.getCssValue(attribute);
	}

	//Get the text :  Error_Email_NotExist
	public String getText_txt_Error_Email_NotExist(){
		return txt_Error_Email_NotExist.getText();
	}

	//Get the value :  Error_Email_NotExist
	public String getValue_txt_Error_Email_NotExist(){
		return txt_Error_Email_NotExist.getAttribute("value");
	}
	// selected or Not :  Error_Email_NotExist
	public boolean isSelected_txt_Error_Email_NotExist(){
		if(txt_Error_Email_NotExist.isSelected()) { return true; } else { return false;} 
	}

	//click:  Home_Button
	public void click_click_Home_Button(){
		click_Home_Button.click();
	}

	// Hover:  Home_Button
	public void hover_click_Home_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Home_Button).build().perform();
	}

	// visible or Not :  Home_Button
	public boolean isDisplayed_click_Home_Button(){
		if(click_Home_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Home_Button
	public boolean isEnabled_click_Home_Button(){
		if(click_Home_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Home_Button
	public String getCssValue_click_Home_Button(String attribute) {
		return click_Home_Button.getCssValue(attribute);
	}

	//Get the text :  Home_Button
	public String getText_click_Home_Button(){
		return click_Home_Button.getText();
	}

	//Get the value :  Home_Button
	public String getValue_click_Home_Button(){
		return click_Home_Button.getAttribute("value");
	}
	// selected or Not :  Home_Button
	public boolean isSelected_click_Home_Button(){
		if(click_Home_Button.isSelected()) { return true; } else { return false;} 
	}

}
