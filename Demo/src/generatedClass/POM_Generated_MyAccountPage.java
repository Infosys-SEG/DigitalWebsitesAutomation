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
	

//*******************************************************************************


	// Element Actions


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

}
