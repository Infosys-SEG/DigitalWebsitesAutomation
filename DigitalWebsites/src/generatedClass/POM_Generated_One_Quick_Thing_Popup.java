//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_One_Quick_Thing_Popup { 
	WebDriver driver;
	public POM_Generated_One_Quick_Thing_Popup (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : Ok_I_Will_Do_This_Now_Button
	@FindBy(id = "verifyaccount")
	public WebElement click_Ok_I_Will_Do_This_Now_Button;
	
	// Associated Label : Popup_Close_Button
	@FindBy(xpath = "//div[@id='pre-enrolled-login']//button[@aria-label='Close']")
	public WebElement click_Popup_Close_Button;
	
	// Associated Label : Need_Help_Text
	@FindBy(xpath = "//h3[@id='needhelp']")
	public WebElement txt_Need_Help_Text;
	
	// Associated Label : Contact_Number_Text
	@FindBy(xpath = "//div[@id='pre-enrolled-login']//a[@aria-describedby='needhelp']")
	public WebElement txt_Contact_Number_Text;
	

//*******************************************************************************


	// Element Actions


	//click:  Ok_I_Will_Do_This_Now_Button
	public void click_click_Ok_I_Will_Do_This_Now_Button(){
		click_Ok_I_Will_Do_This_Now_Button.click();
	}

	// Hover:  Ok_I_Will_Do_This_Now_Button
	public void hover_click_Ok_I_Will_Do_This_Now_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Ok_I_Will_Do_This_Now_Button).build().perform();
	}

	// visible or Not :  Ok_I_Will_Do_This_Now_Button
	public boolean isDisplayed_click_Ok_I_Will_Do_This_Now_Button(){
		if(click_Ok_I_Will_Do_This_Now_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Ok_I_Will_Do_This_Now_Button
	public boolean isEnabled_click_Ok_I_Will_Do_This_Now_Button(){
		if(click_Ok_I_Will_Do_This_Now_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Ok_I_Will_Do_This_Now_Button
	public String getCssValue_click_Ok_I_Will_Do_This_Now_Button(String attribute) {
		return click_Ok_I_Will_Do_This_Now_Button.getCssValue(attribute);
	}

	//Get the text :  Ok_I_Will_Do_This_Now_Button
	public String getText_click_Ok_I_Will_Do_This_Now_Button(){
		return click_Ok_I_Will_Do_This_Now_Button.getText();
	}

	//Get the value :  Ok_I_Will_Do_This_Now_Button
	public String getValue_click_Ok_I_Will_Do_This_Now_Button(){
		return click_Ok_I_Will_Do_This_Now_Button.getAttribute("value");
	}
	// selected or Not :  Ok_I_Will_Do_This_Now_Button
	public boolean isSelected_click_Ok_I_Will_Do_This_Now_Button(){
		if(click_Ok_I_Will_Do_This_Now_Button.isSelected()) { return true; } else { return false;} 
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

	// Type:  Need_Help_Text
	public void type_txt_Need_Help_Text(String value) {
		txt_Need_Help_Text.clear();
		txt_Need_Help_Text.sendKeys(value);
	}

	//click:  Need_Help_Text
	public void click_txt_Need_Help_Text(){
		txt_Need_Help_Text.click();
	}

	// Hover:  Need_Help_Text
	public void hover_txt_Need_Help_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Need_Help_Text).build().perform();
	}

	// visible or Not :  Need_Help_Text
	public boolean isDisplayed_txt_Need_Help_Text(){
		if(txt_Need_Help_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Need_Help_Text
	public boolean isEnabled_txt_Need_Help_Text(){
		if(txt_Need_Help_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Need_Help_Text
	public String getCssValue_txt_Need_Help_Text(String attribute) {
		return txt_Need_Help_Text.getCssValue(attribute);
	}

	//Get the text :  Need_Help_Text
	public String getText_txt_Need_Help_Text(){
		return txt_Need_Help_Text.getText();
	}

	//Get the value :  Need_Help_Text
	public String getValue_txt_Need_Help_Text(){
		return txt_Need_Help_Text.getAttribute("value");
	}
	// selected or Not :  Need_Help_Text
	public boolean isSelected_txt_Need_Help_Text(){
		if(txt_Need_Help_Text.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Contact_Number_Text
	public void type_txt_Contact_Number_Text(String value) {
		txt_Contact_Number_Text.clear();
		txt_Contact_Number_Text.sendKeys(value);
	}

	//click:  Contact_Number_Text
	public void click_txt_Contact_Number_Text(){
		txt_Contact_Number_Text.click();
	}

	// Hover:  Contact_Number_Text
	public void hover_txt_Contact_Number_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Contact_Number_Text).build().perform();
	}

	// visible or Not :  Contact_Number_Text
	public boolean isDisplayed_txt_Contact_Number_Text(){
		if(txt_Contact_Number_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Contact_Number_Text
	public boolean isEnabled_txt_Contact_Number_Text(){
		if(txt_Contact_Number_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Contact_Number_Text
	public String getCssValue_txt_Contact_Number_Text(String attribute) {
		return txt_Contact_Number_Text.getCssValue(attribute);
	}

	//Get the text :  Contact_Number_Text
	public String getText_txt_Contact_Number_Text(){
		return txt_Contact_Number_Text.getText();
	}

	//Get the value :  Contact_Number_Text
	public String getValue_txt_Contact_Number_Text(){
		return txt_Contact_Number_Text.getAttribute("value");
	}
	// selected or Not :  Contact_Number_Text
	public boolean isSelected_txt_Contact_Number_Text(){
		if(txt_Contact_Number_Text.isSelected()) { return true; } else { return false;} 
	}

}
