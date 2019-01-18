//******************************
package  generatedClass;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_DigitalCouponsPage { 
	WebDriver driver;
	public POM_Generated_DigitalCouponsPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : Digital_Coupon_page_Link
	@FindBy(xpath = "//ul[@class='navTabMenu']//span[text()='Digital Coupons']")
	public WebElement click_Digital_Coupon_page_Link;
	
	// Associated Label : Digital_Coupon_Add_Button
	@FindBy(xpath = "//span[@class='add-text']")
	public List<WebElement> click_Digital_Coupon_Add_Button;
	
	// Associated Label : Digital_Coupon_Prod_summary_Text
	@FindBy(xpath = "//div[@role='group']//p[@class='pod_summary']")
	public List<WebElement> txt_Digital_Coupon_Prod_summary_Text;
	
	// Associated Label : Digital_Coupon_Prod_Desc_Text
	@FindBy(xpath = "//div[@role='group']//p[@class='pod_description']")
	public List<WebElement> txt_Digital_Coupon_Prod_Desc_Text;
	
	// Associated Label : Digital_Coupon_Paypal_Popup_Close_Button
	@FindBy(id = "pre-verification-circle-close")
	public WebElement click_Digital_Coupon_Paypal_Popup_Close_Button;
	
	// Associated Label : Digital_Coupon_Activated_Coupon_Icon
	@FindBy(xpath = "//span[@aria-label='activated coupon']")
	public WebElement click_Digital_Coupon_Activated_Coupon_Icon;
	

//*******************************************************************************


	// Element Actions


	//click:  Digital_Coupon_page_Link
	public void click_click_Digital_Coupon_page_Link(){
		click_Digital_Coupon_page_Link.click();
	}

	// Hover:  Digital_Coupon_page_Link
	public void hover_click_Digital_Coupon_page_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Digital_Coupon_page_Link).build().perform();
	}

	// visible or Not :  Digital_Coupon_page_Link
	public boolean isDisplayed_click_Digital_Coupon_page_Link(){
		if(click_Digital_Coupon_page_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Digital_Coupon_page_Link
	public boolean isEnabled_click_Digital_Coupon_page_Link(){
		if(click_Digital_Coupon_page_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Digital_Coupon_page_Link
	public String getCssValue_click_Digital_Coupon_page_Link(String attribute) {
		return click_Digital_Coupon_page_Link.getCssValue(attribute);
	}

	//Get the text :  Digital_Coupon_page_Link
	public String getText_click_Digital_Coupon_page_Link(){
		return click_Digital_Coupon_page_Link.getText();
	}

	//Get the value :  Digital_Coupon_page_Link
	public String getValue_click_Digital_Coupon_page_Link(){
		return click_Digital_Coupon_page_Link.getAttribute("value");
	}
	// selected or Not :  Digital_Coupon_page_Link
	public boolean isSelected_click_Digital_Coupon_page_Link(){
		if(click_Digital_Coupon_page_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Digital_Coupon_Add_Button
	public void click_click_Digital_Coupon_Add_Button(){
		((WebElement) click_Digital_Coupon_Add_Button).click();
	}

	// Hover:  Digital_Coupon_Add_Button
	public void hover_click_Digital_Coupon_Add_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement((WebElement) click_Digital_Coupon_Add_Button).build().perform();
	}

	// visible or Not :  Digital_Coupon_Add_Button
	public boolean isDisplayed_click_Digital_Coupon_Add_Button(){
		if(((WebElement) click_Digital_Coupon_Add_Button).isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Digital_Coupon_Add_Button
	public boolean isEnabled_click_Digital_Coupon_Add_Button(){
		if(((WebElement) click_Digital_Coupon_Add_Button).isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Digital_Coupon_Add_Button
	public String getCssValue_click_Digital_Coupon_Add_Button(String attribute) {
		return ((WebElement) click_Digital_Coupon_Add_Button).getCssValue(attribute);
	}

	//Get the text :  Digital_Coupon_Add_Button
	public String getText_click_Digital_Coupon_Add_Button(){
		return ((WebElement) click_Digital_Coupon_Add_Button).getText();
	}

	//Get the value :  Digital_Coupon_Add_Button
	public String getValue_click_Digital_Coupon_Add_Button(){
		return ((WebElement) click_Digital_Coupon_Add_Button).getAttribute("value");
	}
	// selected or Not :  Digital_Coupon_Add_Button
	public boolean isSelected_click_Digital_Coupon_Add_Button(){
		if(((WebElement) click_Digital_Coupon_Add_Button).isSelected()) { return true; } else { return false;} 
	}

	// Type:  Digital_Coupon_Prod_summary_Text
	public void type_txt_Digital_Coupon_Prod_summary_Text(String value) {
		txt_Digital_Coupon_Prod_summary_Text.clear();
		((WebElement) txt_Digital_Coupon_Prod_summary_Text).sendKeys(value);
	}

	//click:  Digital_Coupon_Prod_summary_Text
	public void click_txt_Digital_Coupon_Prod_summary_Text(){
		((WebElement) txt_Digital_Coupon_Prod_summary_Text).click();
	}

	// Hover:  Digital_Coupon_Prod_summary_Text
	public void hover_txt_Digital_Coupon_Prod_summary_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement((WebElement) txt_Digital_Coupon_Prod_summary_Text).build().perform();
	}

	// visible or Not :  Digital_Coupon_Prod_summary_Text
	public boolean isDisplayed_txt_Digital_Coupon_Prod_summary_Text(){
		if(((WebElement) txt_Digital_Coupon_Prod_summary_Text).isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Digital_Coupon_Prod_summary_Text
	public boolean isEnabled_txt_Digital_Coupon_Prod_summary_Text(){
		if(((WebElement) txt_Digital_Coupon_Prod_summary_Text).isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Digital_Coupon_Prod_summary_Text
	public String getCssValue_txt_Digital_Coupon_Prod_summary_Text(String attribute) {
		return ((WebElement) txt_Digital_Coupon_Prod_summary_Text).getCssValue(attribute);
	}

	//Get the text :  Digital_Coupon_Prod_summary_Text
	public String getText_txt_Digital_Coupon_Prod_summary_Text(){
		return ((WebElement) txt_Digital_Coupon_Prod_summary_Text).getText();
	}

	//Get the value :  Digital_Coupon_Prod_summary_Text
	public String getValue_txt_Digital_Coupon_Prod_summary_Text(){
		return ((WebElement) txt_Digital_Coupon_Prod_summary_Text).getAttribute("value");
	}
	// selected or Not :  Digital_Coupon_Prod_summary_Text
	public boolean isSelected_txt_Digital_Coupon_Prod_summary_Text(){
		if(((WebElement) txt_Digital_Coupon_Prod_summary_Text).isSelected()) { return true; } else { return false;} 
	}

	// Type:  Digital_Coupon_Prod_Desc_Text
	public void type_txt_Digital_Coupon_Prod_Desc_Text(String value) {
		txt_Digital_Coupon_Prod_Desc_Text.clear();
		((WebElement) txt_Digital_Coupon_Prod_Desc_Text).sendKeys(value);
	}

	//click:  Digital_Coupon_Prod_Desc_Text
	public void click_txt_Digital_Coupon_Prod_Desc_Text(){
		((WebElement) txt_Digital_Coupon_Prod_Desc_Text).click();
	}

	// Hover:  Digital_Coupon_Prod_Desc_Text
	public void hover_txt_Digital_Coupon_Prod_Desc_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement((WebElement) txt_Digital_Coupon_Prod_Desc_Text).build().perform();
	}

	// visible or Not :  Digital_Coupon_Prod_Desc_Text
	public boolean isDisplayed_txt_Digital_Coupon_Prod_Desc_Text(){
		if(((WebElement) txt_Digital_Coupon_Prod_Desc_Text).isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Digital_Coupon_Prod_Desc_Text
	public boolean isEnabled_txt_Digital_Coupon_Prod_Desc_Text(){
		if(((WebElement) txt_Digital_Coupon_Prod_Desc_Text).isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Digital_Coupon_Prod_Desc_Text
	public String getCssValue_txt_Digital_Coupon_Prod_Desc_Text(String attribute) {
		return ((WebElement) txt_Digital_Coupon_Prod_Desc_Text).getCssValue(attribute);
	}

	//Get the text :  Digital_Coupon_Prod_Desc_Text
	public String getText_txt_Digital_Coupon_Prod_Desc_Text(){
		return ((WebElement) txt_Digital_Coupon_Prod_Desc_Text).getText();
	}

	//Get the value :  Digital_Coupon_Prod_Desc_Text
	public String getValue_txt_Digital_Coupon_Prod_Desc_Text(){
		return ((WebElement) txt_Digital_Coupon_Prod_Desc_Text).getAttribute("value");
	}
	// selected or Not :  Digital_Coupon_Prod_Desc_Text
	public boolean isSelected_txt_Digital_Coupon_Prod_Desc_Text(){
		if(((WebElement) txt_Digital_Coupon_Prod_Desc_Text).isSelected()) { return true; } else { return false;} 
	}

	//click:  Digital_Coupon_Paypal_Popup_Close_Button
	public void click_click_Digital_Coupon_Paypal_Popup_Close_Button(){
		click_Digital_Coupon_Paypal_Popup_Close_Button.click();
	}

	// Hover:  Digital_Coupon_Paypal_Popup_Close_Button
	public void hover_click_Digital_Coupon_Paypal_Popup_Close_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Digital_Coupon_Paypal_Popup_Close_Button).build().perform();
	}

	// visible or Not :  Digital_Coupon_Paypal_Popup_Close_Button
	public boolean isDisplayed_click_Digital_Coupon_Paypal_Popup_Close_Button(){
		if(click_Digital_Coupon_Paypal_Popup_Close_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Digital_Coupon_Paypal_Popup_Close_Button
	public boolean isEnabled_click_Digital_Coupon_Paypal_Popup_Close_Button(){
		if(click_Digital_Coupon_Paypal_Popup_Close_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Digital_Coupon_Paypal_Popup_Close_Button
	public String getCssValue_click_Digital_Coupon_Paypal_Popup_Close_Button(String attribute) {
		return click_Digital_Coupon_Paypal_Popup_Close_Button.getCssValue(attribute);
	}

	//Get the text :  Digital_Coupon_Paypal_Popup_Close_Button
	public String getText_click_Digital_Coupon_Paypal_Popup_Close_Button(){
		return click_Digital_Coupon_Paypal_Popup_Close_Button.getText();
	}

	//Get the value :  Digital_Coupon_Paypal_Popup_Close_Button
	public String getValue_click_Digital_Coupon_Paypal_Popup_Close_Button(){
		return click_Digital_Coupon_Paypal_Popup_Close_Button.getAttribute("value");
	}
	// selected or Not :  Digital_Coupon_Paypal_Popup_Close_Button
	public boolean isSelected_click_Digital_Coupon_Paypal_Popup_Close_Button(){
		if(click_Digital_Coupon_Paypal_Popup_Close_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Digital_Coupon_Activated_Coupon_Icon
	public void click_click_Digital_Coupon_Activated_Coupon_Icon(){
		click_Digital_Coupon_Activated_Coupon_Icon.click();
	}

	// Hover:  Digital_Coupon_Activated_Coupon_Icon
	public void hover_click_Digital_Coupon_Activated_Coupon_Icon(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Digital_Coupon_Activated_Coupon_Icon).build().perform();
	}

	// visible or Not :  Digital_Coupon_Activated_Coupon_Icon
	public boolean isDisplayed_click_Digital_Coupon_Activated_Coupon_Icon(){
		if(click_Digital_Coupon_Activated_Coupon_Icon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Digital_Coupon_Activated_Coupon_Icon
	public boolean isEnabled_click_Digital_Coupon_Activated_Coupon_Icon(){
		if(click_Digital_Coupon_Activated_Coupon_Icon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Digital_Coupon_Activated_Coupon_Icon
	public String getCssValue_click_Digital_Coupon_Activated_Coupon_Icon(String attribute) {
		return click_Digital_Coupon_Activated_Coupon_Icon.getCssValue(attribute);
	}

	//Get the text :  Digital_Coupon_Activated_Coupon_Icon
	public String getText_click_Digital_Coupon_Activated_Coupon_Icon(){
		return click_Digital_Coupon_Activated_Coupon_Icon.getText();
	}

	//Get the value :  Digital_Coupon_Activated_Coupon_Icon
	public String getValue_click_Digital_Coupon_Activated_Coupon_Icon(){
		return click_Digital_Coupon_Activated_Coupon_Icon.getAttribute("value");
	}
	// selected or Not :  Digital_Coupon_Activated_Coupon_Icon
	public boolean isSelected_click_Digital_Coupon_Activated_Coupon_Icon(){
		if(click_Digital_Coupon_Activated_Coupon_Icon.isSelected()) { return true; } else { return false;} 
	}

}
