//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_SoftLoginPage { 
	WebDriver driver;
	public POM_Generated_SoftLoginPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : Phone_Number_Field
	@FindBy(id = "loginphNumber")
	public WebElement txt_Phone_Number_Field;
	
	// Associated Label : Zipcode_Field
	@FindBy(id = "loginZipCode")
	public WebElement txt_Zipcode_Field;
	
	// Associated Label : Pop_Up_Close_Button
	@FindBy(id = "closesoftloginmodal")
	public WebElement click_Pop_Up_Close_Button;
	
	// Associated Label : Submit_Button
	@FindBy(id = "SoftLogin_btnlogin")
	public WebElement click_Submit_Button;
	

//*******************************************************************************


	// Element Actions


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

	// Type:  Zipcode_Field
	public void type_txt_Zipcode_Field(String value) {
		txt_Zipcode_Field.clear();
		txt_Zipcode_Field.sendKeys(value);
	}

	//click:  Zipcode_Field
	public void click_txt_Zipcode_Field(){
		txt_Zipcode_Field.click();
	}

	// Hover:  Zipcode_Field
	public void hover_txt_Zipcode_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Zipcode_Field).build().perform();
	}

	// visible or Not :  Zipcode_Field
	public boolean isDisplayed_txt_Zipcode_Field(){
		if(txt_Zipcode_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Zipcode_Field
	public boolean isEnabled_txt_Zipcode_Field(){
		if(txt_Zipcode_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Zipcode_Field
	public String getCssValue_txt_Zipcode_Field(String attribute) {
		return txt_Zipcode_Field.getCssValue(attribute);
	}

	//Get the text :  Zipcode_Field
	public String getText_txt_Zipcode_Field(){
		return txt_Zipcode_Field.getText();
	}

	//Get the value :  Zipcode_Field
	public String getValue_txt_Zipcode_Field(){
		return txt_Zipcode_Field.getAttribute("value");
	}
	// selected or Not :  Zipcode_Field
	public boolean isSelected_txt_Zipcode_Field(){
		if(txt_Zipcode_Field.isSelected()) { return true; } else { return false;} 
	}

	//click:  Pop_Up_Close_Button
	public void click_click_Pop_Up_Close_Button(){
		click_Pop_Up_Close_Button.click();
	}

	// Hover:  Pop_Up_Close_Button
	public void hover_click_Pop_Up_Close_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Pop_Up_Close_Button).build().perform();
	}

	// visible or Not :  Pop_Up_Close_Button
	public boolean isDisplayed_click_Pop_Up_Close_Button(){
		if(click_Pop_Up_Close_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Pop_Up_Close_Button
	public boolean isEnabled_click_Pop_Up_Close_Button(){
		if(click_Pop_Up_Close_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Pop_Up_Close_Button
	public String getCssValue_click_Pop_Up_Close_Button(String attribute) {
		return click_Pop_Up_Close_Button.getCssValue(attribute);
	}

	//Get the text :  Pop_Up_Close_Button
	public String getText_click_Pop_Up_Close_Button(){
		return click_Pop_Up_Close_Button.getText();
	}

	//Get the value :  Pop_Up_Close_Button
	public String getValue_click_Pop_Up_Close_Button(){
		return click_Pop_Up_Close_Button.getAttribute("value");
	}
	// selected or Not :  Pop_Up_Close_Button
	public boolean isSelected_click_Pop_Up_Close_Button(){
		if(click_Pop_Up_Close_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Submit_Button
	public void click_click_Submit_Button(){
		click_Submit_Button.click();
	}

	// Hover:  Submit_Button
	public void hover_click_Submit_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Submit_Button).build().perform();
	}

	// visible or Not :  Submit_Button
	public boolean isDisplayed_click_Submit_Button(){
		if(click_Submit_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Submit_Button
	public boolean isEnabled_click_Submit_Button(){
		if(click_Submit_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Submit_Button
	public String getCssValue_click_Submit_Button(String attribute) {
		return click_Submit_Button.getCssValue(attribute);
	}

	//Get the text :  Submit_Button
	public String getText_click_Submit_Button(){
		return click_Submit_Button.getText();
	}

	//Get the value :  Submit_Button
	public String getValue_click_Submit_Button(){
		return click_Submit_Button.getAttribute("value");
	}
	// selected or Not :  Submit_Button
	public boolean isSelected_click_Submit_Button(){
		if(click_Submit_Button.isSelected()) { return true; } else { return false;} 
	}

}
