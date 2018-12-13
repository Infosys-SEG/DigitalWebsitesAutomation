//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_RegisterNowPage { 
	WebDriver driver;
	public POM_Generated_RegisterNowPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : Register_Now_Button_1
	@FindBy(xpath = "//div[@class='enrollment-welcome_lg enrollment-welcome_sm']//a[text()='Register Now']")
	public WebElement click_Register_Now_Button_1;
	
	// Associated Label : Register_Now_Button_2
	@FindBy(xpath = "//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 enrlbtm-margin enrollment-container text-center']//a[text()='Register Now']")
	public WebElement click_Register_Now_Button_2;
	
	// Associated Label : Rewards_FAQs_Button
	@FindBy(xpath = "//a[text()='rewards FAQs']")
	public WebElement click_Rewards_FAQs_Button;
	

//*******************************************************************************


	// Element Actions


	//click:  Register_Now_Button_1
	public void click_click_Register_Now_Button_1(){
		click_Register_Now_Button_1.click();
	}

	// Hover:  Register_Now_Button_1
	public void hover_click_Register_Now_Button_1(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Register_Now_Button_1).build().perform();
	}

	// visible or Not :  Register_Now_Button_1
	public boolean isDisplayed_click_Register_Now_Button_1(){
		if(click_Register_Now_Button_1.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Now_Button_1
	public boolean isEnabled_click_Register_Now_Button_1(){
		if(click_Register_Now_Button_1.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Now_Button_1
	public String getCssValue_click_Register_Now_Button_1(String attribute) {
		return click_Register_Now_Button_1.getCssValue(attribute);
	}

	//Get the text :  Register_Now_Button_1
	public String getText_click_Register_Now_Button_1(){
		return click_Register_Now_Button_1.getText();
	}

	//Get the value :  Register_Now_Button_1
	public String getValue_click_Register_Now_Button_1(){
		return click_Register_Now_Button_1.getAttribute("value");
	}
	// selected or Not :  Register_Now_Button_1
	public boolean isSelected_click_Register_Now_Button_1(){
		if(click_Register_Now_Button_1.isSelected()) { return true; } else { return false;} 
	}

	//click:  Register_Now_Button_2
	public void click_click_Register_Now_Button_2(){
		click_Register_Now_Button_2.click();
	}

	// Hover:  Register_Now_Button_2
	public void hover_click_Register_Now_Button_2(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Register_Now_Button_2).build().perform();
	}

	// visible or Not :  Register_Now_Button_2
	public boolean isDisplayed_click_Register_Now_Button_2(){
		if(click_Register_Now_Button_2.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Now_Button_2
	public boolean isEnabled_click_Register_Now_Button_2(){
		if(click_Register_Now_Button_2.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Now_Button_2
	public String getCssValue_click_Register_Now_Button_2(String attribute) {
		return click_Register_Now_Button_2.getCssValue(attribute);
	}

	//Get the text :  Register_Now_Button_2
	public String getText_click_Register_Now_Button_2(){
		return click_Register_Now_Button_2.getText();
	}

	//Get the value :  Register_Now_Button_2
	public String getValue_click_Register_Now_Button_2(){
		return click_Register_Now_Button_2.getAttribute("value");
	}
	// selected or Not :  Register_Now_Button_2
	public boolean isSelected_click_Register_Now_Button_2(){
		if(click_Register_Now_Button_2.isSelected()) { return true; } else { return false;} 
	}

	//click:  Rewards_FAQs_Button
	public void click_click_Rewards_FAQs_Button(){
		click_Rewards_FAQs_Button.click();
	}

	// Hover:  Rewards_FAQs_Button
	public void hover_click_Rewards_FAQs_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Rewards_FAQs_Button).build().perform();
	}

	// visible or Not :  Rewards_FAQs_Button
	public boolean isDisplayed_click_Rewards_FAQs_Button(){
		if(click_Rewards_FAQs_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Rewards_FAQs_Button
	public boolean isEnabled_click_Rewards_FAQs_Button(){
		if(click_Rewards_FAQs_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Rewards_FAQs_Button
	public String getCssValue_click_Rewards_FAQs_Button(String attribute) {
		return click_Rewards_FAQs_Button.getCssValue(attribute);
	}

	//Get the text :  Rewards_FAQs_Button
	public String getText_click_Rewards_FAQs_Button(){
		return click_Rewards_FAQs_Button.getText();
	}

	//Get the value :  Rewards_FAQs_Button
	public String getValue_click_Rewards_FAQs_Button(){
		return click_Rewards_FAQs_Button.getAttribute("value");
	}
	// selected or Not :  Rewards_FAQs_Button
	public boolean isSelected_click_Rewards_FAQs_Button(){
		if(click_Rewards_FAQs_Button.isSelected()) { return true; } else { return false;} 
	}

}
