//******************************
package  generatedClass;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_Homepage { 
	WebDriver driver;
	public POM_Generated_Homepage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : Harveys_logo
	@FindBy(xpath = "//img[@alt='Harveys Logo']")
	public WebElement click_Harveys_logo;
	
	// Associated Label : Winndixie_logo
	@FindBy(xpath = "//img[@alt='Winn-Dixie logo'][1]")
	public WebElement click_Winndixie_logo;
	
	// Associated Label : Bilo_logo
	@FindBy(xpath = "//img[@alt='BI-LO Logo']")
	public WebElement click_Bilo_logo;
	
	// Associated Label : Login_Or_Signup_Button
	@FindBy(xpath = "//button[text()='Log in / Register']")
	public WebElement click_Login_Or_Signup_Button;
	
	// Associated Label : Close_Button
	@FindBy(xpath = "//button[text()='Close']")
	public WebElement click_Close_Button;
	
	// Associated Label : Logout_button
	@FindBy(id = "btnLogout1")
	public WebElement click_Logout_button;
	
	// Associated Label : Register_Button
	@FindBy(id = "check-my-status")
	public WebElement click_Register_Button;
	
	// Associated Label : HardLogin_button
	@FindBy(id = "softloginlink")
	public WebElement click_HardLogin_button;
	
	// Associated Label : Close_cookies_Button
	@FindBy(xpath = "//a[@id='CookieClsBtn']")
	public WebElement click_Close_cookies_Button;
	
	// Associated Label : Rewards_link_Hover
	@FindBy(id = "rewards")
	public WebElement click_Rewards_link_Hover;
	
	// Associated Label : Rewards_RegisterNow_Button
	@FindBy(xpath = "//li[@id='rewards']//ul[@role='menu']//a[@href='/register-now']")
	public WebElement click_Rewards_RegisterNow_Button;
	
	// Associated Label : Rewards_Rewards_Button
	@FindBy(xpath = "//li[@id='rewards']//ul[@role='menu']//a[@href='/rewards-logged-in']")
	public WebElement click_Rewards_Rewards_Button;
	
	// Associated Label : Savings_link_Hover
	@FindBy(id = "savings")
	public WebElement click_Savings_link_Hover;
	
	// Associated Label : Savings_WeeklyAd_Button
	@FindBy(xpath = "//li[@id='savings']//a[text()='Weekly Ad ']")
	public WebElement click_Savings_WeeklyAd_Button;
	
	// Associated Label : Savings_Coupon_Button
	@FindBy(xpath = "//li[@id='savings']//a[text()='Digital Coupons ']")
	public WebElement click_Savings_Coupon_Button;
	
	// Associated Label : Savings_NeverMissADeal_Button
	@FindBy(xpath = "//li[@id='savings']//a[text()='Never miss a deal! ']")
	public WebElement click_Savings_NeverMissADeal_Button;
	
	// Associated Label : Global_StoreLocator_Button
	@FindBy(xpath = "//ul[@id='menu']//span[text()='Store Locator']")
	public WebElement click_Global_StoreLocator_Button;
	
	// Associated Label : Online_Grocery_Logo
	@FindBy(xpath = "//p[text()='Online Grocery']")
	public WebElement click_Online_Grocery_Logo;
	
	// Associated Label : WeeklyAd_Logo
	@FindBy(xpath = "//p[text()='Weekly Ad']")
	public WebElement click_WeeklyAd_Logo;
	
	// Associated Label : Digitial_Coupons_Logo
	@FindBy(xpath = "//img[@src='/-/media/media/savings/digitalcoupons-2018/digitalcoupon-light3.png?la=en&mw=1382' and @alt = 'Digital coupon logo']")
	public WebElement click_Digitial_Coupons_Logo;
	
	// Associated Label : PersonalizedAd_Logo
	@FindBy(xpath = "//p[text()='Personalized Ad']")
	public WebElement click_PersonalizedAd_Logo;
	
	// Associated Label : Save_Coupon_Button
	@FindBy(xpath = "//input[@value='Save coupon']")
	public List<WebElement> click_Save_Coupon_Button;
	
	// Associated Label : NeverMissADeal_text
	@FindBy(xpath = "//h1[text()='Never miss out on a deal ']")
	public WebElement txt_NeverMissADeal_text;
	
	// Associated Label : Homebanner_carousel
	@FindBy(xpath = "//div[@id='HomeCarousel']")
	public WebElement txt_Homebanner_carousel;
	

//*******************************************************************************


	// Element Actions


	//click:  Harveys_logo
	public void click_click_Harveys_logo(){
		click_Harveys_logo.click();
	}

	// Hover:  Harveys_logo
	public void hover_click_Harveys_logo(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Harveys_logo).build().perform();
	}

	// visible or Not :  Harveys_logo
	public boolean isDisplayed_click_Harveys_logo(){
		if(click_Harveys_logo.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Harveys_logo
	public boolean isEnabled_click_Harveys_logo(){
		if(click_Harveys_logo.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Harveys_logo
	public String getCssValue_click_Harveys_logo(String attribute) {
		return click_Harveys_logo.getCssValue(attribute);
	}

	//Get the text :  Harveys_logo
	public String getText_click_Harveys_logo(){
		return click_Harveys_logo.getText();
	}

	//Get the value :  Harveys_logo
	public String getValue_click_Harveys_logo(){
		return click_Harveys_logo.getAttribute("value");
	}
	// selected or Not :  Harveys_logo
	public boolean isSelected_click_Harveys_logo(){
		if(click_Harveys_logo.isSelected()) { return true; } else { return false;} 
	}

	//click:  Winndixie_logo
	public void click_click_Winndixie_logo(){
		click_Winndixie_logo.click();
	}

	// Hover:  Winndixie_logo
	public void hover_click_Winndixie_logo(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Winndixie_logo).build().perform();
	}

	// visible or Not :  Winndixie_logo
	public boolean isDisplayed_click_Winndixie_logo(){
		if(click_Winndixie_logo.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Winndixie_logo
	public boolean isEnabled_click_Winndixie_logo(){
		if(click_Winndixie_logo.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Winndixie_logo
	public String getCssValue_click_Winndixie_logo(String attribute) {
		return click_Winndixie_logo.getCssValue(attribute);
	}

	//Get the text :  Winndixie_logo
	public String getText_click_Winndixie_logo(){
		return click_Winndixie_logo.getText();
	}

	//Get the value :  Winndixie_logo
	public String getValue_click_Winndixie_logo(){
		return click_Winndixie_logo.getAttribute("value");
	}
	// selected or Not :  Winndixie_logo
	public boolean isSelected_click_Winndixie_logo(){
		if(click_Winndixie_logo.isSelected()) { return true; } else { return false;} 
	}

	//click:  Bilo_logo
	public void click_click_Bilo_logo(){
		click_Bilo_logo.click();
	}

	// Hover:  Bilo_logo
	public void hover_click_Bilo_logo(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Bilo_logo).build().perform();
	}

	// visible or Not :  Bilo_logo
	public boolean isDisplayed_click_Bilo_logo(){
		if(click_Bilo_logo.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Bilo_logo
	public boolean isEnabled_click_Bilo_logo(){
		if(click_Bilo_logo.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Bilo_logo
	public String getCssValue_click_Bilo_logo(String attribute) {
		return click_Bilo_logo.getCssValue(attribute);
	}

	//Get the text :  Bilo_logo
	public String getText_click_Bilo_logo(){
		return click_Bilo_logo.getText();
	}

	//Get the value :  Bilo_logo
	public String getValue_click_Bilo_logo(){
		return click_Bilo_logo.getAttribute("value");
	}
	// selected or Not :  Bilo_logo
	public boolean isSelected_click_Bilo_logo(){
		if(click_Bilo_logo.isSelected()) { return true; } else { return false;} 
	}

	//click:  Login_Or_Signup_Button
	public void click_click_Login_Or_Signup_Button(){
		click_Login_Or_Signup_Button.click();
	}

	// Hover:  Login_Or_Signup_Button
	public void hover_click_Login_Or_Signup_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Login_Or_Signup_Button).build().perform();
	}

	// visible or Not :  Login_Or_Signup_Button
	public boolean isDisplayed_click_Login_Or_Signup_Button(){
		if(click_Login_Or_Signup_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Login_Or_Signup_Button
	public boolean isEnabled_click_Login_Or_Signup_Button(){
		if(click_Login_Or_Signup_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Login_Or_Signup_Button
	public String getCssValue_click_Login_Or_Signup_Button(String attribute) {
		return click_Login_Or_Signup_Button.getCssValue(attribute);
	}

	//Get the text :  Login_Or_Signup_Button
	public String getText_click_Login_Or_Signup_Button(){
		return click_Login_Or_Signup_Button.getText();
	}

	//Get the value :  Login_Or_Signup_Button
	public String getValue_click_Login_Or_Signup_Button(){
		return click_Login_Or_Signup_Button.getAttribute("value");
	}
	// selected or Not :  Login_Or_Signup_Button
	public boolean isSelected_click_Login_Or_Signup_Button(){
		if(click_Login_Or_Signup_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Close_Button
	public void click_click_Close_Button(){
		click_Close_Button.click();
	}

	// Hover:  Close_Button
	public void hover_click_Close_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Close_Button).build().perform();
	}

	// visible or Not :  Close_Button
	public boolean isDisplayed_click_Close_Button(){
		if(click_Close_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Close_Button
	public boolean isEnabled_click_Close_Button(){
		if(click_Close_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Close_Button
	public String getCssValue_click_Close_Button(String attribute) {
		return click_Close_Button.getCssValue(attribute);
	}

	//Get the text :  Close_Button
	public String getText_click_Close_Button(){
		return click_Close_Button.getText();
	}

	//Get the value :  Close_Button
	public String getValue_click_Close_Button(){
		return click_Close_Button.getAttribute("value");
	}
	// selected or Not :  Close_Button
	public boolean isSelected_click_Close_Button(){
		if(click_Close_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Logout_button
	public void click_click_Logout_button(){
		click_Logout_button.click();
	}

	// Hover:  Logout_button
	public void hover_click_Logout_button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Logout_button).build().perform();
	}

	// visible or Not :  Logout_button
	public boolean isDisplayed_click_Logout_button(){
		if(click_Logout_button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Logout_button
	public boolean isEnabled_click_Logout_button(){
		if(click_Logout_button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Logout_button
	public String getCssValue_click_Logout_button(String attribute) {
		return click_Logout_button.getCssValue(attribute);
	}

	//Get the text :  Logout_button
	public String getText_click_Logout_button(){
		return click_Logout_button.getText();
	}

	//Get the value :  Logout_button
	public String getValue_click_Logout_button(){
		return click_Logout_button.getAttribute("value");
	}
	// selected or Not :  Logout_button
	public boolean isSelected_click_Logout_button(){
		if(click_Logout_button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Register_Button
	public void click_click_Register_Button(){
		click_Register_Button.click();
	}

	// Hover:  Register_Button
	public void hover_click_Register_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Register_Button).build().perform();
	}

	// visible or Not :  Register_Button
	public boolean isDisplayed_click_Register_Button(){
		if(click_Register_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Button
	public boolean isEnabled_click_Register_Button(){
		if(click_Register_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Button
	public String getCssValue_click_Register_Button(String attribute) {
		return click_Register_Button.getCssValue(attribute);
	}

	//Get the text :  Register_Button
	public String getText_click_Register_Button(){
		return click_Register_Button.getText();
	}

	//Get the value :  Register_Button
	public String getValue_click_Register_Button(){
		return click_Register_Button.getAttribute("value");
	}
	// selected or Not :  Register_Button
	public boolean isSelected_click_Register_Button(){
		if(click_Register_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  HardLogin_button
	public void click_click_HardLogin_button(){
		click_HardLogin_button.click();
	}

	// Hover:  HardLogin_button
	public void hover_click_HardLogin_button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_HardLogin_button).build().perform();
	}

	// visible or Not :  HardLogin_button
	public boolean isDisplayed_click_HardLogin_button(){
		if(click_HardLogin_button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  HardLogin_button
	public boolean isEnabled_click_HardLogin_button(){
		if(click_HardLogin_button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  HardLogin_button
	public String getCssValue_click_HardLogin_button(String attribute) {
		return click_HardLogin_button.getCssValue(attribute);
	}

	//Get the text :  HardLogin_button
	public String getText_click_HardLogin_button(){
		return click_HardLogin_button.getText();
	}

	//Get the value :  HardLogin_button
	public String getValue_click_HardLogin_button(){
		return click_HardLogin_button.getAttribute("value");
	}
	// selected or Not :  HardLogin_button
	public boolean isSelected_click_HardLogin_button(){
		if(click_HardLogin_button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Close_cookies_Button
	public void click_click_Close_cookies_Button(){
		click_Close_cookies_Button.click();
	}

	// Hover:  Close_cookies_Button
	public void hover_click_Close_cookies_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Close_cookies_Button).build().perform();
	}

	// visible or Not :  Close_cookies_Button
	public boolean isDisplayed_click_Close_cookies_Button(){
		if(click_Close_cookies_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Close_cookies_Button
	public boolean isEnabled_click_Close_cookies_Button(){
		if(click_Close_cookies_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Close_cookies_Button
	public String getCssValue_click_Close_cookies_Button(String attribute) {
		return click_Close_cookies_Button.getCssValue(attribute);
	}

	//Get the text :  Close_cookies_Button
	public String getText_click_Close_cookies_Button(){
		return click_Close_cookies_Button.getText();
	}

	//Get the value :  Close_cookies_Button
	public String getValue_click_Close_cookies_Button(){
		return click_Close_cookies_Button.getAttribute("value");
	}
	// selected or Not :  Close_cookies_Button
	public boolean isSelected_click_Close_cookies_Button(){
		if(click_Close_cookies_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Rewards_link_Hover
	public void click_click_Rewards_link_Hover(){
		click_Rewards_link_Hover.click();
	}

	// Hover:  Rewards_link_Hover
	public void hover_click_Rewards_link_Hover(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Rewards_link_Hover).build().perform();
	}

	// visible or Not :  Rewards_link_Hover
	public boolean isDisplayed_click_Rewards_link_Hover(){
		if(click_Rewards_link_Hover.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Rewards_link_Hover
	public boolean isEnabled_click_Rewards_link_Hover(){
		if(click_Rewards_link_Hover.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Rewards_link_Hover
	public String getCssValue_click_Rewards_link_Hover(String attribute) {
		return click_Rewards_link_Hover.getCssValue(attribute);
	}

	//Get the text :  Rewards_link_Hover
	public String getText_click_Rewards_link_Hover(){
		return click_Rewards_link_Hover.getText();
	}

	//Get the value :  Rewards_link_Hover
	public String getValue_click_Rewards_link_Hover(){
		return click_Rewards_link_Hover.getAttribute("value");
	}
	// selected or Not :  Rewards_link_Hover
	public boolean isSelected_click_Rewards_link_Hover(){
		if(click_Rewards_link_Hover.isSelected()) { return true; } else { return false;} 
	}

	//click:  Rewards_RegisterNow_Button
	public void click_click_Rewards_RegisterNow_Button(){
		click_Rewards_RegisterNow_Button.click();
	}

	// Hover:  Rewards_RegisterNow_Button
	public void hover_click_Rewards_RegisterNow_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Rewards_RegisterNow_Button).build().perform();
	}

	// visible or Not :  Rewards_RegisterNow_Button
	public boolean isDisplayed_click_Rewards_RegisterNow_Button(){
		if(click_Rewards_RegisterNow_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Rewards_RegisterNow_Button
	public boolean isEnabled_click_Rewards_RegisterNow_Button(){
		if(click_Rewards_RegisterNow_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Rewards_RegisterNow_Button
	public String getCssValue_click_Rewards_RegisterNow_Button(String attribute) {
		return click_Rewards_RegisterNow_Button.getCssValue(attribute);
	}

	//Get the text :  Rewards_RegisterNow_Button
	public String getText_click_Rewards_RegisterNow_Button(){
		return click_Rewards_RegisterNow_Button.getText();
	}

	//Get the value :  Rewards_RegisterNow_Button
	public String getValue_click_Rewards_RegisterNow_Button(){
		return click_Rewards_RegisterNow_Button.getAttribute("value");
	}
	// selected or Not :  Rewards_RegisterNow_Button
	public boolean isSelected_click_Rewards_RegisterNow_Button(){
		if(click_Rewards_RegisterNow_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Rewards_Rewards_Button
	public void click_click_Rewards_Rewards_Button(){
		click_Rewards_Rewards_Button.click();
	}

	// Hover:  Rewards_Rewards_Button
	public void hover_click_Rewards_Rewards_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Rewards_Rewards_Button).build().perform();
	}

	// visible or Not :  Rewards_Rewards_Button
	public boolean isDisplayed_click_Rewards_Rewards_Button(){
		if(click_Rewards_Rewards_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Rewards_Rewards_Button
	public boolean isEnabled_click_Rewards_Rewards_Button(){
		if(click_Rewards_Rewards_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Rewards_Rewards_Button
	public String getCssValue_click_Rewards_Rewards_Button(String attribute) {
		return click_Rewards_Rewards_Button.getCssValue(attribute);
	}

	//Get the text :  Rewards_Rewards_Button
	public String getText_click_Rewards_Rewards_Button(){
		return click_Rewards_Rewards_Button.getText();
	}

	//Get the value :  Rewards_Rewards_Button
	public String getValue_click_Rewards_Rewards_Button(){
		return click_Rewards_Rewards_Button.getAttribute("value");
	}
	// selected or Not :  Rewards_Rewards_Button
	public boolean isSelected_click_Rewards_Rewards_Button(){
		if(click_Rewards_Rewards_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Savings_link_Hover
	public void click_click_Savings_link_Hover(){
		click_Savings_link_Hover.click();
	}

	// Hover:  Savings_link_Hover
	public void hover_click_Savings_link_Hover(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Savings_link_Hover).build().perform();
	}

	// visible or Not :  Savings_link_Hover
	public boolean isDisplayed_click_Savings_link_Hover(){
		if(click_Savings_link_Hover.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Savings_link_Hover
	public boolean isEnabled_click_Savings_link_Hover(){
		if(click_Savings_link_Hover.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Savings_link_Hover
	public String getCssValue_click_Savings_link_Hover(String attribute) {
		return click_Savings_link_Hover.getCssValue(attribute);
	}

	//Get the text :  Savings_link_Hover
	public String getText_click_Savings_link_Hover(){
		return click_Savings_link_Hover.getText();
	}

	//Get the value :  Savings_link_Hover
	public String getValue_click_Savings_link_Hover(){
		return click_Savings_link_Hover.getAttribute("value");
	}
	// selected or Not :  Savings_link_Hover
	public boolean isSelected_click_Savings_link_Hover(){
		if(click_Savings_link_Hover.isSelected()) { return true; } else { return false;} 
	}

	//click:  Savings_WeeklyAd_Button
	public void click_click_Savings_WeeklyAd_Button(){
		click_Savings_WeeklyAd_Button.click();
	}

	// Hover:  Savings_WeeklyAd_Button
	public void hover_click_Savings_WeeklyAd_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Savings_WeeklyAd_Button).build().perform();
	}

	// visible or Not :  Savings_WeeklyAd_Button
	public boolean isDisplayed_click_Savings_WeeklyAd_Button(){
		if(click_Savings_WeeklyAd_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Savings_WeeklyAd_Button
	public boolean isEnabled_click_Savings_WeeklyAd_Button(){
		if(click_Savings_WeeklyAd_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Savings_WeeklyAd_Button
	public String getCssValue_click_Savings_WeeklyAd_Button(String attribute) {
		return click_Savings_WeeklyAd_Button.getCssValue(attribute);
	}

	//Get the text :  Savings_WeeklyAd_Button
	public String getText_click_Savings_WeeklyAd_Button(){
		return click_Savings_WeeklyAd_Button.getText();
	}

	//Get the value :  Savings_WeeklyAd_Button
	public String getValue_click_Savings_WeeklyAd_Button(){
		return click_Savings_WeeklyAd_Button.getAttribute("value");
	}
	// selected or Not :  Savings_WeeklyAd_Button
	public boolean isSelected_click_Savings_WeeklyAd_Button(){
		if(click_Savings_WeeklyAd_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Savings_Coupon_Button
	public void click_click_Savings_Coupon_Button(){
		click_Savings_Coupon_Button.click();
	}

	// Hover:  Savings_Coupon_Button
	public void hover_click_Savings_Coupon_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Savings_Coupon_Button).build().perform();
	}

	// visible or Not :  Savings_Coupon_Button
	public boolean isDisplayed_click_Savings_Coupon_Button(){
		if(click_Savings_Coupon_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Savings_Coupon_Button
	public boolean isEnabled_click_Savings_Coupon_Button(){
		if(click_Savings_Coupon_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Savings_Coupon_Button
	public String getCssValue_click_Savings_Coupon_Button(String attribute) {
		return click_Savings_Coupon_Button.getCssValue(attribute);
	}

	//Get the text :  Savings_Coupon_Button
	public String getText_click_Savings_Coupon_Button(){
		return click_Savings_Coupon_Button.getText();
	}

	//Get the value :  Savings_Coupon_Button
	public String getValue_click_Savings_Coupon_Button(){
		return click_Savings_Coupon_Button.getAttribute("value");
	}
	// selected or Not :  Savings_Coupon_Button
	public boolean isSelected_click_Savings_Coupon_Button(){
		if(click_Savings_Coupon_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Savings_NeverMissADeal_Button
	public void click_click_Savings_NeverMissADeal_Button(){
		click_Savings_NeverMissADeal_Button.click();
	}

	// Hover:  Savings_NeverMissADeal_Button
	public void hover_click_Savings_NeverMissADeal_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Savings_NeverMissADeal_Button).build().perform();
	}

	// visible or Not :  Savings_NeverMissADeal_Button
	public boolean isDisplayed_click_Savings_NeverMissADeal_Button(){
		if(click_Savings_NeverMissADeal_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Savings_NeverMissADeal_Button
	public boolean isEnabled_click_Savings_NeverMissADeal_Button(){
		if(click_Savings_NeverMissADeal_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Savings_NeverMissADeal_Button
	public String getCssValue_click_Savings_NeverMissADeal_Button(String attribute) {
		return click_Savings_NeverMissADeal_Button.getCssValue(attribute);
	}

	//Get the text :  Savings_NeverMissADeal_Button
	public String getText_click_Savings_NeverMissADeal_Button(){
		return click_Savings_NeverMissADeal_Button.getText();
	}

	//Get the value :  Savings_NeverMissADeal_Button
	public String getValue_click_Savings_NeverMissADeal_Button(){
		return click_Savings_NeverMissADeal_Button.getAttribute("value");
	}
	// selected or Not :  Savings_NeverMissADeal_Button
	public boolean isSelected_click_Savings_NeverMissADeal_Button(){
		if(click_Savings_NeverMissADeal_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Global_StoreLocator_Button
	public void click_click_Global_StoreLocator_Button(){
		click_Global_StoreLocator_Button.click();
	}

	// Hover:  Global_StoreLocator_Button
	public void hover_click_Global_StoreLocator_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Global_StoreLocator_Button).build().perform();
	}

	// visible or Not :  Global_StoreLocator_Button
	public boolean isDisplayed_click_Global_StoreLocator_Button(){
		if(click_Global_StoreLocator_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Global_StoreLocator_Button
	public boolean isEnabled_click_Global_StoreLocator_Button(){
		if(click_Global_StoreLocator_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Global_StoreLocator_Button
	public String getCssValue_click_Global_StoreLocator_Button(String attribute) {
		return click_Global_StoreLocator_Button.getCssValue(attribute);
	}

	//Get the text :  Global_StoreLocator_Button
	public String getText_click_Global_StoreLocator_Button(){
		return click_Global_StoreLocator_Button.getText();
	}

	//Get the value :  Global_StoreLocator_Button
	public String getValue_click_Global_StoreLocator_Button(){
		return click_Global_StoreLocator_Button.getAttribute("value");
	}
	// selected or Not :  Global_StoreLocator_Button
	public boolean isSelected_click_Global_StoreLocator_Button(){
		if(click_Global_StoreLocator_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Online_Grocery_Logo
	public void click_click_Online_Grocery_Logo(){
		click_Online_Grocery_Logo.click();
	}

	// Hover:  Online_Grocery_Logo
	public void hover_click_Online_Grocery_Logo(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Online_Grocery_Logo).build().perform();
	}

	// visible or Not :  Online_Grocery_Logo
	public boolean isDisplayed_click_Online_Grocery_Logo(){
		if(click_Online_Grocery_Logo.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Online_Grocery_Logo
	public boolean isEnabled_click_Online_Grocery_Logo(){
		if(click_Online_Grocery_Logo.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Online_Grocery_Logo
	public String getCssValue_click_Online_Grocery_Logo(String attribute) {
		return click_Online_Grocery_Logo.getCssValue(attribute);
	}

	//Get the text :  Online_Grocery_Logo
	public String getText_click_Online_Grocery_Logo(){
		return click_Online_Grocery_Logo.getText();
	}

	//Get the value :  Online_Grocery_Logo
	public String getValue_click_Online_Grocery_Logo(){
		return click_Online_Grocery_Logo.getAttribute("value");
	}
	// selected or Not :  Online_Grocery_Logo
	public boolean isSelected_click_Online_Grocery_Logo(){
		if(click_Online_Grocery_Logo.isSelected()) { return true; } else { return false;} 
	}

	//click:  WeeklyAd_Logo
	public void click_click_WeeklyAd_Logo(){
		click_WeeklyAd_Logo.click();
	}

	// Hover:  WeeklyAd_Logo
	public void hover_click_WeeklyAd_Logo(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_WeeklyAd_Logo).build().perform();
	}

	// visible or Not :  WeeklyAd_Logo
	public boolean isDisplayed_click_WeeklyAd_Logo(){
		if(click_WeeklyAd_Logo.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  WeeklyAd_Logo
	public boolean isEnabled_click_WeeklyAd_Logo(){
		if(click_WeeklyAd_Logo.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  WeeklyAd_Logo
	public String getCssValue_click_WeeklyAd_Logo(String attribute) {
		return click_WeeklyAd_Logo.getCssValue(attribute);
	}

	//Get the text :  WeeklyAd_Logo
	public String getText_click_WeeklyAd_Logo(){
		return click_WeeklyAd_Logo.getText();
	}

	//Get the value :  WeeklyAd_Logo
	public String getValue_click_WeeklyAd_Logo(){
		return click_WeeklyAd_Logo.getAttribute("value");
	}
	// selected or Not :  WeeklyAd_Logo
	public boolean isSelected_click_WeeklyAd_Logo(){
		if(click_WeeklyAd_Logo.isSelected()) { return true; } else { return false;} 
	}

	//click:  Digitial_Coupons_Logo
	public void click_click_Digitial_Coupons_Logo(){
		click_Digitial_Coupons_Logo.click();
	}

	// Hover:  Digitial_Coupons_Logo
	public void hover_click_Digitial_Coupons_Logo(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Digitial_Coupons_Logo).build().perform();
	}

	// visible or Not :  Digitial_Coupons_Logo
	public boolean isDisplayed_click_Digitial_Coupons_Logo(){
		if(click_Digitial_Coupons_Logo.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Digitial_Coupons_Logo
	public boolean isEnabled_click_Digitial_Coupons_Logo(){
		if(click_Digitial_Coupons_Logo.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Digitial_Coupons_Logo
	public String getCssValue_click_Digitial_Coupons_Logo(String attribute) {
		return click_Digitial_Coupons_Logo.getCssValue(attribute);
	}

	//Get the text :  Digitial_Coupons_Logo
	public String getText_click_Digitial_Coupons_Logo(){
		return click_Digitial_Coupons_Logo.getText();
	}

	//Get the value :  Digitial_Coupons_Logo
	public String getValue_click_Digitial_Coupons_Logo(){
		return click_Digitial_Coupons_Logo.getAttribute("value");
	}
	// selected or Not :  Digitial_Coupons_Logo
	public boolean isSelected_click_Digitial_Coupons_Logo(){
		if(click_Digitial_Coupons_Logo.isSelected()) { return true; } else { return false;} 
	}

	//click:  PersonalizedAd_Logo
	public void click_click_PersonalizedAd_Logo(){
		click_PersonalizedAd_Logo.click();
	}

	// Hover:  PersonalizedAd_Logo
	public void hover_click_PersonalizedAd_Logo(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_PersonalizedAd_Logo).build().perform();
	}

	// visible or Not :  PersonalizedAd_Logo
	public boolean isDisplayed_click_PersonalizedAd_Logo(){
		if(click_PersonalizedAd_Logo.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  PersonalizedAd_Logo
	public boolean isEnabled_click_PersonalizedAd_Logo(){
		if(click_PersonalizedAd_Logo.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  PersonalizedAd_Logo
	public String getCssValue_click_PersonalizedAd_Logo(String attribute) {
		return click_PersonalizedAd_Logo.getCssValue(attribute);
	}

	//Get the text :  PersonalizedAd_Logo
	public String getText_click_PersonalizedAd_Logo(){
		return click_PersonalizedAd_Logo.getText();
	}

	//Get the value :  PersonalizedAd_Logo
	public String getValue_click_PersonalizedAd_Logo(){
		return click_PersonalizedAd_Logo.getAttribute("value");
	}
	// selected or Not :  PersonalizedAd_Logo
	public boolean isSelected_click_PersonalizedAd_Logo(){
		if(click_PersonalizedAd_Logo.isSelected()) { return true; } else { return false;} 
	}

	//click:  Save_Coupon_Button
	public void click_click_Save_Coupon_Button(){
		((WebElement) click_Save_Coupon_Button).click();
	}

	// Hover:  Save_Coupon_Button
	public void hover_click_Save_Coupon_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement((WebElement) click_Save_Coupon_Button).build().perform();
	}

	// visible or Not :  Save_Coupon_Button
	public boolean isDisplayed_click_Save_Coupon_Button(){
		if(((WebElement) click_Save_Coupon_Button).isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Save_Coupon_Button
	public boolean isEnabled_click_Save_Coupon_Button(){
		if(((WebElement) click_Save_Coupon_Button).isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Save_Coupon_Button
	public String getCssValue_click_Save_Coupon_Button(String attribute) {
		return ((WebElement) click_Save_Coupon_Button).getCssValue(attribute);
	}

	//Get the text :  Save_Coupon_Button
	public String getText_click_Save_Coupon_Button(){
		return ((WebElement) click_Save_Coupon_Button).getText();
	}

	//Get the value :  Save_Coupon_Button
	public String getValue_click_Save_Coupon_Button(){
		return ((WebElement) click_Save_Coupon_Button).getAttribute("value");
	}
	// selected or Not :  Save_Coupon_Button
	public boolean isSelected_click_Save_Coupon_Button(){
		if(((WebElement) click_Save_Coupon_Button).isSelected()) { return true; } else { return false;} 
	}

	// Type:  NeverMissADeal_text
	public void type_txt_NeverMissADeal_text(String value) {
		txt_NeverMissADeal_text.clear();
		txt_NeverMissADeal_text.sendKeys(value);
	}

	//click:  NeverMissADeal_text
	public void click_txt_NeverMissADeal_text(){
		txt_NeverMissADeal_text.click();
	}

	// Hover:  NeverMissADeal_text
	public void hover_txt_NeverMissADeal_text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_NeverMissADeal_text).build().perform();
	}

	// visible or Not :  NeverMissADeal_text
	public boolean isDisplayed_txt_NeverMissADeal_text(){
		if(txt_NeverMissADeal_text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  NeverMissADeal_text
	public boolean isEnabled_txt_NeverMissADeal_text(){
		if(txt_NeverMissADeal_text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  NeverMissADeal_text
	public String getCssValue_txt_NeverMissADeal_text(String attribute) {
		return txt_NeverMissADeal_text.getCssValue(attribute);
	}

	//Get the text :  NeverMissADeal_text
	public String getText_txt_NeverMissADeal_text(){
		return txt_NeverMissADeal_text.getText();
	}

	//Get the value :  NeverMissADeal_text
	public String getValue_txt_NeverMissADeal_text(){
		return txt_NeverMissADeal_text.getAttribute("value");
	}
	// selected or Not :  NeverMissADeal_text
	public boolean isSelected_txt_NeverMissADeal_text(){
		if(txt_NeverMissADeal_text.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Homebanner_carousel
	public void type_txt_Homebanner_carousel(String value) {
		txt_Homebanner_carousel.clear();
		txt_Homebanner_carousel.sendKeys(value);
	}

	//click:  Homebanner_carousel
	public void click_txt_Homebanner_carousel(){
		txt_Homebanner_carousel.click();
	}

	// Hover:  Homebanner_carousel
	public void hover_txt_Homebanner_carousel(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Homebanner_carousel).build().perform();
	}

	// visible or Not :  Homebanner_carousel
	public boolean isDisplayed_txt_Homebanner_carousel(){
		if(txt_Homebanner_carousel.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Homebanner_carousel
	public boolean isEnabled_txt_Homebanner_carousel(){
		if(txt_Homebanner_carousel.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Homebanner_carousel
	public String getCssValue_txt_Homebanner_carousel(String attribute) {
		return txt_Homebanner_carousel.getCssValue(attribute);
	}

	//Get the text :  Homebanner_carousel
	public String getText_txt_Homebanner_carousel(){
		return txt_Homebanner_carousel.getText();
	}

	//Get the value :  Homebanner_carousel
	public String getValue_txt_Homebanner_carousel(){
		return txt_Homebanner_carousel.getAttribute("value");
	}
	// selected or Not :  Homebanner_carousel
	public boolean isSelected_txt_Homebanner_carousel(){
		if(txt_Homebanner_carousel.isSelected()) { return true; } else { return false;} 
	}

}
