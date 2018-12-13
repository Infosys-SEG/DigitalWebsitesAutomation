//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_MyAccountPage { 
	WebDriver driver;
	public POM_Generated_MyAccountPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : Pick_Up_Text
	@FindBy(xpath = "//label[contains(text(),'Be sure to pick up your new card next time you shop! ')]")
	public WebElement txt_Pick_Up_Text;
	
	// Associated Label : Rewards_Card_Number_Text
	@FindBy(xpath = "//label[contains(text(),'Rewards #:')]")
	public WebElement txt_Rewards_Card_Number_Text;
	
	// Associated Label : Email_Address_Field
	@FindBy(xpath = "//input[@id='email']")
	public WebElement txt_Email_Address_Field;
	
	// Associated Label : Set_Password1_Field
	@FindBy(id = "pwd")
	public WebElement txt_Set_Password1_Field;
	
	// Associated Label : Set_Password2_Field
	@FindBy(id = "confirmpwd")
	public WebElement txt_Set_Password2_Field;
	
	// Associated Label : Set_Pin1_Field
	@FindBy(id = "setPin")
	public WebElement txt_Set_Pin1_Field;
	
	// Associated Label : Set_Pin2_Field
	@FindBy(id = "confirmPin")
	public WebElement txt_Set_Pin2_Field;
	
	// Associated Label : Save_Button
	@FindBy(id = "btnSave")
	public WebElement click_Save_Button;
	
	// Associated Label : Cancel_Button
	@FindBy(id = "btnCancel")
	public WebElement click_Cancel_Button;
	
	// Associated Label : Saved_Message_Text
	@FindBy(id = "lblSaveMessage")
	public WebElement txt_Saved_Message_Text;
	
	// Associated Label : Cancel_Message_Text
	@FindBy(id = "lblCancelMessage")
	public WebElement txt_Cancel_Message_Text;
	
	// Associated Label : Error_SetPwd_Msg
	@FindBy(xpath = "//span[@class='pwdErr']")
	public WebElement txt_Error_SetPwd_Msg;
	
	// Associated Label : Error_NotMatchingPwds_Msg
	@FindBy(xpath = "//span[contains(text(),'passwords do not match')]")
	public WebElement txt_Error_NotMatchingPwds_Msg;
	
	// Associated Label : Error_SetPin_Msg
	@FindBy(id = "errorsetPin")
	public WebElement txt_Error_SetPin_Msg;
	
	// Associated Label : Error_NotMatchingPIns_Msg
	@FindBy(id = "errorconfirmPin")
	public WebElement txt_Error_NotMatchingPIns_Msg;
	
	//Associated Label : click_Info_Icon
	@FindBy(id="setInfo")
	public WebElement click_Info_Icon;
	
	// Associated Label : Error_Pin_Modal_Msg
	//@FindBy(xpath = "//div[@class='modalshow']//*[contains(text(),'Must not be four repeating')]")
	@FindBy(xpath = "//strong[contains(text(),'Must not be four repeating')][1]")
	//@FindBy(css=".pin-tooltip")
	public WebElement txt_Error_Pin_Modal_Msg;
	
	// Associated Label : Error_InvalidPins_3Times_Msg
	@FindBy(xpath = "//span[@id='error-invalidconfirmPin'][contains(text(),'Please call Customer')]")
	public WebElement txt_Error_InvalidPins_3Times_Msg;
	

//*******************************************************************************


	// Element Actions


	// Type:  Pick_Up_Text
	public void type_txt_Pick_Up_Text(String value) {
		txt_Pick_Up_Text.clear();
		txt_Pick_Up_Text.sendKeys(value);
	}

	//click:  Pick_Up_Text
	public void click_txt_Pick_Up_Text(){
		txt_Pick_Up_Text.click();
	}

	// Hover:  Pick_Up_Text
	public void hover_txt_Pick_Up_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Pick_Up_Text).build().perform();
	}

	// visible or Not :  Pick_Up_Text
	public boolean isDisplayed_txt_Pick_Up_Text(){
		if(txt_Pick_Up_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Pick_Up_Text
	public boolean isEnabled_txt_Pick_Up_Text(){
		if(txt_Pick_Up_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Pick_Up_Text
	public String getCssValue_txt_Pick_Up_Text(String attribute) {
		return txt_Pick_Up_Text.getCssValue(attribute);
	}

	//Get the text :  Pick_Up_Text
	public String getText_txt_Pick_Up_Text(){
		return txt_Pick_Up_Text.getText();
	}

	//Get the value :  Pick_Up_Text
	public String getValue_txt_Pick_Up_Text(){
		return txt_Pick_Up_Text.getAttribute("value");
	}
	// selected or Not :  Pick_Up_Text
	public boolean isSelected_txt_Pick_Up_Text(){
		if(txt_Pick_Up_Text.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Rewards_Card_Number_Text
	public void type_txt_Rewards_Card_Number_Text(String value) {
		txt_Rewards_Card_Number_Text.clear();
		txt_Rewards_Card_Number_Text.sendKeys(value);
	}

	//click:  Rewards_Card_Number_Text
	public void click_txt_Rewards_Card_Number_Text(){
		txt_Rewards_Card_Number_Text.click();
	}

	// Hover:  Rewards_Card_Number_Text
	public void hover_txt_Rewards_Card_Number_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Rewards_Card_Number_Text).build().perform();
	}

	// visible or Not :  Rewards_Card_Number_Text
	public boolean isDisplayed_txt_Rewards_Card_Number_Text(){
		if(txt_Rewards_Card_Number_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Rewards_Card_Number_Text
	public boolean isEnabled_txt_Rewards_Card_Number_Text(){
		if(txt_Rewards_Card_Number_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Rewards_Card_Number_Text
	public String getCssValue_txt_Rewards_Card_Number_Text(String attribute) {
		return txt_Rewards_Card_Number_Text.getCssValue(attribute);
	}

	//Get the text :  Rewards_Card_Number_Text
	public String getText_txt_Rewards_Card_Number_Text(){
		return txt_Rewards_Card_Number_Text.getText();
	}

	//Get the value :  Rewards_Card_Number_Text
	public String getValue_txt_Rewards_Card_Number_Text(){
		return txt_Rewards_Card_Number_Text.getAttribute("value");
	}
	// selected or Not :  Rewards_Card_Number_Text
	public boolean isSelected_txt_Rewards_Card_Number_Text(){
		if(txt_Rewards_Card_Number_Text.isSelected()) { return true; } else { return false;} 
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

	//click:  Save_Button
	public void click_click_Save_Button(){
		click_Save_Button.click();
	}

	// Hover:  Save_Button
	public void hover_click_Save_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Save_Button).build().perform();
	}

	// visible or Not :  Save_Button
	public boolean isDisplayed_click_Save_Button(){
		if(click_Save_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Save_Button
	public boolean isEnabled_click_Save_Button(){
		if(click_Save_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Save_Button
	public String getCssValue_click_Save_Button(String attribute) {
		return click_Save_Button.getCssValue(attribute);
	}

	//Get the text :  Save_Button
	public String getText_click_Save_Button(){
		return click_Save_Button.getText();
	}

	//Get the value :  Save_Button
	public String getValue_click_Save_Button(){
		return click_Save_Button.getAttribute("value");
	}
	// selected or Not :  Save_Button
	public boolean isSelected_click_Save_Button(){
		if(click_Save_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Cancel_Button
	public void click_click_Cancel_Button(){
		click_Cancel_Button.click();
	}

	// Hover:  Cancel_Button
	public void hover_click_Cancel_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Cancel_Button).build().perform();
	}

	// visible or Not :  Cancel_Button
	public boolean isDisplayed_click_Cancel_Button(){
		if(click_Cancel_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Cancel_Button
	public boolean isEnabled_click_Cancel_Button(){
		if(click_Cancel_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Cancel_Button
	public String getCssValue_click_Cancel_Button(String attribute) {
		return click_Cancel_Button.getCssValue(attribute);
	}

	//Get the text :  Cancel_Button
	public String getText_click_Cancel_Button(){
		return click_Cancel_Button.getText();
	}

	//Get the value :  Cancel_Button
	public String getValue_click_Cancel_Button(){
		return click_Cancel_Button.getAttribute("value");
	}
	// selected or Not :  Cancel_Button
	public boolean isSelected_click_Cancel_Button(){
		if(click_Cancel_Button.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Saved_Message_Text
	public void type_txt_Saved_Message_Text(String value) {
		txt_Saved_Message_Text.clear();
		txt_Saved_Message_Text.sendKeys(value);
	}

	//click:  Saved_Message_Text
	public void click_txt_Saved_Message_Text(){
		txt_Saved_Message_Text.click();
	}

	// Hover:  Saved_Message_Text
	public void hover_txt_Saved_Message_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Saved_Message_Text).build().perform();
	}

	// visible or Not :  Saved_Message_Text
	public boolean isDisplayed_txt_Saved_Message_Text(){
		if(txt_Saved_Message_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Saved_Message_Text
	public boolean isEnabled_txt_Saved_Message_Text(){
		if(txt_Saved_Message_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Saved_Message_Text
	public String getCssValue_txt_Saved_Message_Text(String attribute) {
		return txt_Saved_Message_Text.getCssValue(attribute);
	}

	//Get the text :  Saved_Message_Text
	public String getText_txt_Saved_Message_Text(){
		return txt_Saved_Message_Text.getText();
	}

	//Get the value :  Saved_Message_Text
	public String getValue_txt_Saved_Message_Text(){
		return txt_Saved_Message_Text.getAttribute("value");
	}
	// selected or Not :  Saved_Message_Text
	public boolean isSelected_txt_Saved_Message_Text(){
		if(txt_Saved_Message_Text.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Cancel_Message_Text
	public void type_txt_Cancel_Message_Text(String value) {
		txt_Cancel_Message_Text.clear();
		txt_Cancel_Message_Text.sendKeys(value);
	}

	//click:  Cancel_Message_Text
	public void click_txt_Cancel_Message_Text(){
		txt_Cancel_Message_Text.click();
	}

	// Hover:  Cancel_Message_Text
	public void hover_txt_Cancel_Message_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Cancel_Message_Text).build().perform();
	}

	// visible or Not :  Cancel_Message_Text
	public boolean isDisplayed_txt_Cancel_Message_Text(){
		if(txt_Cancel_Message_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Cancel_Message_Text
	public boolean isEnabled_txt_Cancel_Message_Text(){
		if(txt_Cancel_Message_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Cancel_Message_Text
	public String getCssValue_txt_Cancel_Message_Text(String attribute) {
		return txt_Cancel_Message_Text.getCssValue(attribute);
	}

	//Get the text :  Cancel_Message_Text
	public String getText_txt_Cancel_Message_Text(){
		return txt_Cancel_Message_Text.getText();
	}

	//Get the value :  Cancel_Message_Text
	public String getValue_txt_Cancel_Message_Text(){
		return txt_Cancel_Message_Text.getAttribute("value");
	}
	// selected or Not :  Cancel_Message_Text
	public boolean isSelected_txt_Cancel_Message_Text(){
		if(txt_Cancel_Message_Text.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_SetPwd_Msg
	public void type_txt_Error_SetPwd_Msg(String value) {
		txt_Error_SetPwd_Msg.clear();
		txt_Error_SetPwd_Msg.sendKeys(value);
	}

	//click:  Error_SetPwd_Msg
	public void click_txt_Error_SetPwd_Msg(){
		txt_Error_SetPwd_Msg.click();
	}

	// Hover:  Error_SetPwd_Msg
	public void hover_txt_Error_SetPwd_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_SetPwd_Msg).build().perform();
	}

	// visible or Not :  Error_SetPwd_Msg
	public boolean isDisplayed_txt_Error_SetPwd_Msg(){
		if(txt_Error_SetPwd_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_SetPwd_Msg
	public boolean isEnabled_txt_Error_SetPwd_Msg(){
		if(txt_Error_SetPwd_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_SetPwd_Msg
	public String getCssValue_txt_Error_SetPwd_Msg(String attribute) {
		return txt_Error_SetPwd_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_SetPwd_Msg
	public String getText_txt_Error_SetPwd_Msg(){
		return txt_Error_SetPwd_Msg.getText();
	}

	//Get the value :  Error_SetPwd_Msg
	public String getValue_txt_Error_SetPwd_Msg(){
		return txt_Error_SetPwd_Msg.getAttribute("value");
	}
	// selected or Not :  Error_SetPwd_Msg
	public boolean isSelected_txt_Error_SetPwd_Msg(){
		if(txt_Error_SetPwd_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_NotMatchingPwds_Msg
	public void type_txt_Error_NotMatchingPwds_Msg(String value) {
		txt_Error_NotMatchingPwds_Msg.clear();
		txt_Error_NotMatchingPwds_Msg.sendKeys(value);
	}

	//click:  Error_NotMatchingPwds_Msg
	public void click_txt_Error_NotMatchingPwds_Msg(){
		txt_Error_NotMatchingPwds_Msg.click();
	}

	// Hover:  Error_NotMatchingPwds_Msg
	public void hover_txt_Error_NotMatchingPwds_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_NotMatchingPwds_Msg).build().perform();
	}

	// visible or Not :  Error_NotMatchingPwds_Msg
	public boolean isDisplayed_txt_Error_NotMatchingPwds_Msg(){
		if(txt_Error_NotMatchingPwds_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_NotMatchingPwds_Msg
	public boolean isEnabled_txt_Error_NotMatchingPwds_Msg(){
		if(txt_Error_NotMatchingPwds_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_NotMatchingPwds_Msg
	public String getCssValue_txt_Error_NotMatchingPwds_Msg(String attribute) {
		return txt_Error_NotMatchingPwds_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_NotMatchingPwds_Msg
	public String getText_txt_Error_NotMatchingPwds_Msg(){
		return txt_Error_NotMatchingPwds_Msg.getText();
	}

	//Get the value :  Error_NotMatchingPwds_Msg
	public String getValue_txt_Error_NotMatchingPwds_Msg(){
		return txt_Error_NotMatchingPwds_Msg.getAttribute("value");
	}
	// selected or Not :  Error_NotMatchingPwds_Msg
	public boolean isSelected_txt_Error_NotMatchingPwds_Msg(){
		if(txt_Error_NotMatchingPwds_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_SetPin_Msg
	public void type_txt_Error_SetPin_Msg(String value) {
		txt_Error_SetPin_Msg.clear();
		txt_Error_SetPin_Msg.sendKeys(value);
	}

	//click:  Error_SetPin_Msg
	public void click_txt_Error_SetPin_Msg(){
		txt_Error_SetPin_Msg.click();
	}

	// Hover:  Error_SetPin_Msg
	public void hover_txt_Error_SetPin_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_SetPin_Msg).build().perform();
	}

	// visible or Not :  Error_SetPin_Msg
	public boolean isDisplayed_txt_Error_SetPin_Msg(){
		if(txt_Error_SetPin_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_SetPin_Msg
	public boolean isEnabled_txt_Error_SetPin_Msg(){
		if(txt_Error_SetPin_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_SetPin_Msg
	public String getCssValue_txt_Error_SetPin_Msg(String attribute) {
		return txt_Error_SetPin_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_SetPin_Msg
	public String getText_txt_Error_SetPin_Msg(){
		return txt_Error_SetPin_Msg.getText();
	}

	//Get the value :  Error_SetPin_Msg
	public String getValue_txt_Error_SetPin_Msg(){
		return txt_Error_SetPin_Msg.getAttribute("value");
	}
	// selected or Not :  Error_SetPin_Msg
	public boolean isSelected_txt_Error_SetPin_Msg(){
		if(txt_Error_SetPin_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_NotMatchingPIns_Msg
	public void type_txt_Error_NotMatchingPIns_Msg(String value) {
		txt_Error_NotMatchingPIns_Msg.clear();
		txt_Error_NotMatchingPIns_Msg.sendKeys(value);
	}

	//click:  Error_NotMatchingPIns_Msg
	public void click_txt_Error_NotMatchingPIns_Msg(){
		txt_Error_NotMatchingPIns_Msg.click();
	}

	// Hover:  Error_NotMatchingPIns_Msg
	public void hover_txt_Error_NotMatchingPIns_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_NotMatchingPIns_Msg).build().perform();
	}

	// visible or Not :  Error_NotMatchingPIns_Msg
	public boolean isDisplayed_txt_Error_NotMatchingPIns_Msg(){
		if(txt_Error_NotMatchingPIns_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_NotMatchingPIns_Msg
	public boolean isEnabled_txt_Error_NotMatchingPIns_Msg(){
		if(txt_Error_NotMatchingPIns_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_NotMatchingPIns_Msg
	public String getCssValue_txt_Error_NotMatchingPIns_Msg(String attribute) {
		return txt_Error_NotMatchingPIns_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_NotMatchingPIns_Msg
	public String getText_txt_Error_NotMatchingPIns_Msg(){
		return txt_Error_NotMatchingPIns_Msg.getText();
	}

	//Get the value :  Error_NotMatchingPIns_Msg
	public String getValue_txt_Error_NotMatchingPIns_Msg(){
		return txt_Error_NotMatchingPIns_Msg.getAttribute("value");
	}
	// selected or Not :  Error_NotMatchingPIns_Msg
	public boolean isSelected_txt_Error_NotMatchingPIns_Msg(){
		if(txt_Error_NotMatchingPIns_Msg.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_Pin_Modal_Msg
	public void type_txt_Error_Pin_Modal_Msg(String value) {
		txt_Error_Pin_Modal_Msg.clear();
		txt_Error_Pin_Modal_Msg.sendKeys(value);
	}

	//click:  Error_Pin_Modal_Msg
	public void click_txt_Error_Pin_Modal_Msg(){
		txt_Error_Pin_Modal_Msg.click();
	}

	// Hover:  Error_Pin_Modal_Msg
	public void hover_txt_Error_Pin_Modal_Msg(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_Pin_Modal_Msg).build().perform();
	}

	// visible or Not :  Error_Pin_Modal_Msg
	public boolean isDisplayed_txt_Error_Pin_Modal_Msg(){
		if(txt_Error_Pin_Modal_Msg.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_Pin_Modal_Msg
	public boolean isEnabled_txt_Error_Pin_Modal_Msg(){
		if(txt_Error_Pin_Modal_Msg.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_Pin_Modal_Msg
	public String getCssValue_txt_Error_Pin_Modal_Msg(String attribute) {
		return txt_Error_Pin_Modal_Msg.getCssValue(attribute);
	}

	//Get the text :  Error_Pin_Modal_Msg
	public String getText_txt_Error_Pin_Modal_Msg(){
		return txt_Error_Pin_Modal_Msg.getText();
	}

	//Get the value :  Error_Pin_Modal_Msg
	public String getValue_txt_Error_Pin_Modal_Msg(){
		return txt_Error_Pin_Modal_Msg.getAttribute("value");
	}
	// selected or Not :  Error_Pin_Modal_Msg
	public boolean isSelected_txt_Error_Pin_Modal_Msg(){
		if(txt_Error_Pin_Modal_Msg.isSelected()) { return true; } else { return false;} 
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

}
