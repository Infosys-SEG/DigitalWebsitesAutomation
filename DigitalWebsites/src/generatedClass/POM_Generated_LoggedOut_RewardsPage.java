//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_LoggedOut_RewardsPage { 
	WebDriver driver;
	public POM_Generated_LoggedOut_RewardsPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : Rewards_Title_Text
	@FindBy(xpath = "//div[text()='SE Grocers rewards ']")
	public WebElement txt_Rewards_Title_Text;
	
	// Associated Label : Rewards_Login_Button
	@FindBy(xpath = "//a[text()='Log In']")
	public WebElement click_Rewards_Login_Button;
	
	// Associated Label : Call_Us_At_Text
	@FindBy(xpath = "//div[text()='Need help? Call us at ']")
	public WebElement txt_Call_Us_At_Text;
	
	// Associated Label : Call_Us_At_MobileNum_Text
	@FindBy(xpath = "//div[text()='Need help? Call us at ']//a[text()='(844) 745-0463']")
	public WebElement txt_Call_Us_At_MobileNum_Text;
	
	// Associated Label : RegisterNow_Button_1
	@FindBy(xpath = "//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 p-0']//a[text()='Register Now']")
	public WebElement click_RegisterNow_Button_1;
	
	// Associated Label : RegisterNow_Button_2
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-sm-12 col-xs-12 p-0']//a[text()='Register Now']")
	public WebElement click_RegisterNow_Button_2;
	

//*******************************************************************************


	// Element Actions


	// Type:  Rewards_Title_Text
	public void type_txt_Rewards_Title_Text(String value) {
		txt_Rewards_Title_Text.clear();
		txt_Rewards_Title_Text.sendKeys(value);
	}

	//click:  Rewards_Title_Text
	public void click_txt_Rewards_Title_Text(){
		txt_Rewards_Title_Text.click();
	}

	// Hover:  Rewards_Title_Text
	public void hover_txt_Rewards_Title_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Rewards_Title_Text).build().perform();
	}

	// visible or Not :  Rewards_Title_Text
	public boolean isDisplayed_txt_Rewards_Title_Text(){
		if(txt_Rewards_Title_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Rewards_Title_Text
	public boolean isEnabled_txt_Rewards_Title_Text(){
		if(txt_Rewards_Title_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Rewards_Title_Text
	public String getCssValue_txt_Rewards_Title_Text(String attribute) {
		return txt_Rewards_Title_Text.getCssValue(attribute);
	}

	//Get the text :  Rewards_Title_Text
	public String getText_txt_Rewards_Title_Text(){
		return txt_Rewards_Title_Text.getText();
	}

	//Get the value :  Rewards_Title_Text
	public String getValue_txt_Rewards_Title_Text(){
		return txt_Rewards_Title_Text.getAttribute("value");
	}
	// selected or Not :  Rewards_Title_Text
	public boolean isSelected_txt_Rewards_Title_Text(){
		if(txt_Rewards_Title_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  Rewards_Login_Button
	public void click_click_Rewards_Login_Button(){
		click_Rewards_Login_Button.click();
	}

	// Hover:  Rewards_Login_Button
	public void hover_click_Rewards_Login_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Rewards_Login_Button).build().perform();
	}

	// visible or Not :  Rewards_Login_Button
	public boolean isDisplayed_click_Rewards_Login_Button(){
		if(click_Rewards_Login_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Rewards_Login_Button
	public boolean isEnabled_click_Rewards_Login_Button(){
		if(click_Rewards_Login_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Rewards_Login_Button
	public String getCssValue_click_Rewards_Login_Button(String attribute) {
		return click_Rewards_Login_Button.getCssValue(attribute);
	}

	//Get the text :  Rewards_Login_Button
	public String getText_click_Rewards_Login_Button(){
		return click_Rewards_Login_Button.getText();
	}

	//Get the value :  Rewards_Login_Button
	public String getValue_click_Rewards_Login_Button(){
		return click_Rewards_Login_Button.getAttribute("value");
	}
	// selected or Not :  Rewards_Login_Button
	public boolean isSelected_click_Rewards_Login_Button(){
		if(click_Rewards_Login_Button.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Call_Us_At_Text
	public void type_txt_Call_Us_At_Text(String value) {
		txt_Call_Us_At_Text.clear();
		txt_Call_Us_At_Text.sendKeys(value);
	}

	//click:  Call_Us_At_Text
	public void click_txt_Call_Us_At_Text(){
		txt_Call_Us_At_Text.click();
	}

	// Hover:  Call_Us_At_Text
	public void hover_txt_Call_Us_At_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Call_Us_At_Text).build().perform();
	}

	// visible or Not :  Call_Us_At_Text
	public boolean isDisplayed_txt_Call_Us_At_Text(){
		if(txt_Call_Us_At_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Call_Us_At_Text
	public boolean isEnabled_txt_Call_Us_At_Text(){
		if(txt_Call_Us_At_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Call_Us_At_Text
	public String getCssValue_txt_Call_Us_At_Text(String attribute) {
		return txt_Call_Us_At_Text.getCssValue(attribute);
	}

	//Get the text :  Call_Us_At_Text
	public String getText_txt_Call_Us_At_Text(){
		return txt_Call_Us_At_Text.getText();
	}

	//Get the value :  Call_Us_At_Text
	public String getValue_txt_Call_Us_At_Text(){
		return txt_Call_Us_At_Text.getAttribute("value");
	}
	// selected or Not :  Call_Us_At_Text
	public boolean isSelected_txt_Call_Us_At_Text(){
		if(txt_Call_Us_At_Text.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Call_Us_At_MobileNum_Text
	public void type_txt_Call_Us_At_MobileNum_Text(String value) {
		txt_Call_Us_At_MobileNum_Text.clear();
		txt_Call_Us_At_MobileNum_Text.sendKeys(value);
	}

	//click:  Call_Us_At_MobileNum_Text
	public void click_txt_Call_Us_At_MobileNum_Text(){
		txt_Call_Us_At_MobileNum_Text.click();
	}

	// Hover:  Call_Us_At_MobileNum_Text
	public void hover_txt_Call_Us_At_MobileNum_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Call_Us_At_MobileNum_Text).build().perform();
	}

	// visible or Not :  Call_Us_At_MobileNum_Text
	public boolean isDisplayed_txt_Call_Us_At_MobileNum_Text(){
		if(txt_Call_Us_At_MobileNum_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Call_Us_At_MobileNum_Text
	public boolean isEnabled_txt_Call_Us_At_MobileNum_Text(){
		if(txt_Call_Us_At_MobileNum_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Call_Us_At_MobileNum_Text
	public String getCssValue_txt_Call_Us_At_MobileNum_Text(String attribute) {
		return txt_Call_Us_At_MobileNum_Text.getCssValue(attribute);
	}

	//Get the text :  Call_Us_At_MobileNum_Text
	public String getText_txt_Call_Us_At_MobileNum_Text(){
		return txt_Call_Us_At_MobileNum_Text.getText();
	}

	//Get the value :  Call_Us_At_MobileNum_Text
	public String getValue_txt_Call_Us_At_MobileNum_Text(){
		return txt_Call_Us_At_MobileNum_Text.getAttribute("value");
	}
	// selected or Not :  Call_Us_At_MobileNum_Text
	public boolean isSelected_txt_Call_Us_At_MobileNum_Text(){
		if(txt_Call_Us_At_MobileNum_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  RegisterNow_Button_1
	public void click_click_RegisterNow_Button_1(){
		click_RegisterNow_Button_1.click();
	}

	// Hover:  RegisterNow_Button_1
	public void hover_click_RegisterNow_Button_1(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_RegisterNow_Button_1).build().perform();
	}

	// visible or Not :  RegisterNow_Button_1
	public boolean isDisplayed_click_RegisterNow_Button_1(){
		if(click_RegisterNow_Button_1.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  RegisterNow_Button_1
	public boolean isEnabled_click_RegisterNow_Button_1(){
		if(click_RegisterNow_Button_1.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  RegisterNow_Button_1
	public String getCssValue_click_RegisterNow_Button_1(String attribute) {
		return click_RegisterNow_Button_1.getCssValue(attribute);
	}

	//Get the text :  RegisterNow_Button_1
	public String getText_click_RegisterNow_Button_1(){
		return click_RegisterNow_Button_1.getText();
	}

	//Get the value :  RegisterNow_Button_1
	public String getValue_click_RegisterNow_Button_1(){
		return click_RegisterNow_Button_1.getAttribute("value");
	}
	// selected or Not :  RegisterNow_Button_1
	public boolean isSelected_click_RegisterNow_Button_1(){
		if(click_RegisterNow_Button_1.isSelected()) { return true; } else { return false;} 
	}

	//click:  RegisterNow_Button_2
	public void click_click_RegisterNow_Button_2(){
		click_RegisterNow_Button_2.click();
	}

	// Hover:  RegisterNow_Button_2
	public void hover_click_RegisterNow_Button_2(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_RegisterNow_Button_2).build().perform();
	}

	// visible or Not :  RegisterNow_Button_2
	public boolean isDisplayed_click_RegisterNow_Button_2(){
		if(click_RegisterNow_Button_2.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  RegisterNow_Button_2
	public boolean isEnabled_click_RegisterNow_Button_2(){
		if(click_RegisterNow_Button_2.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  RegisterNow_Button_2
	public String getCssValue_click_RegisterNow_Button_2(String attribute) {
		return click_RegisterNow_Button_2.getCssValue(attribute);
	}

	//Get the text :  RegisterNow_Button_2
	public String getText_click_RegisterNow_Button_2(){
		return click_RegisterNow_Button_2.getText();
	}

	//Get the value :  RegisterNow_Button_2
	public String getValue_click_RegisterNow_Button_2(){
		return click_RegisterNow_Button_2.getAttribute("value");
	}
	// selected or Not :  RegisterNow_Button_2
	public boolean isSelected_click_RegisterNow_Button_2(){
		if(click_RegisterNow_Button_2.isSelected()) { return true; } else { return false;} 
	}

}
