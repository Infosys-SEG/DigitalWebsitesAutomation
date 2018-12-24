//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_CongratulationsPage { 
	WebDriver driver;
	public POM_Generated_CongratulationsPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : CloseModal_Button
	@FindBy(xpath = "//button[@onclick='cancelmodal()']")
	public WebElement click_CloseModal_Button;
	
	// Associated Label : ActivateCoupon_Button
	@FindBy(xpath = "//a[text()='Activate Coupon ']")
	public WebElement click_ActivateCoupon_Button;
	
	// Associated Label : ThankYou_Message_Text
	@FindBy(xpath = "//h1[text()='Thank you for signing up! ']")
	public WebElement txt_ThankYou_Message_Text;
	
	// Associated Label : Pick_Up_Text
	@FindBy(xpath = "//*[contains(text(),'Pick up your SE Grocers rewards card in store')]")
	public WebElement txt_Pick_Up_Text;
	
	// Associated Label : Digital_coupons_button
	@FindBy(xpath = "//a[text()='Digital Coupons']")
	public WebElement click_Digital_coupons_button;
	
	// Associated Label : Fuel_Rewards_Page_Button
	@FindBy(xpath = "//a[@id='logo']")
	public WebElement txt_Fuel_Rewards_Page_Button;
	
	// Associated Label : Fuel_Rewards_Link
	@FindBy(xpath = "//a[@href='http://www.fuelrewards.com/' or text()='Fuel Rewards']")
	public WebElement click_Fuel_Rewards_Link;
	
	// Associated Label : My_Rewards_Link
	@FindBy(xpath = "//a[text()='My Rewards']")
	public WebElement click_My_Rewards_Link;
	

//*******************************************************************************


	// Element Actions


	//click:  CloseModal_Button
	public void click_click_CloseModal_Button(){
		click_CloseModal_Button.click();
	}

	// Hover:  CloseModal_Button
	public void hover_click_CloseModal_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_CloseModal_Button).build().perform();
	}

	// visible or Not :  CloseModal_Button
	public boolean isDisplayed_click_CloseModal_Button(){
		if(click_CloseModal_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  CloseModal_Button
	public boolean isEnabled_click_CloseModal_Button(){
		if(click_CloseModal_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  CloseModal_Button
	public String getCssValue_click_CloseModal_Button(String attribute) {
		return click_CloseModal_Button.getCssValue(attribute);
	}

	//Get the text :  CloseModal_Button
	public String getText_click_CloseModal_Button(){
		return click_CloseModal_Button.getText();
	}

	//Get the value :  CloseModal_Button
	public String getValue_click_CloseModal_Button(){
		return click_CloseModal_Button.getAttribute("value");
	}
	// selected or Not :  CloseModal_Button
	public boolean isSelected_click_CloseModal_Button(){
		if(click_CloseModal_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  ActivateCoupon_Button
	public void click_click_ActivateCoupon_Button(){
		click_ActivateCoupon_Button.click();
	}

	// Hover:  ActivateCoupon_Button
	public void hover_click_ActivateCoupon_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_ActivateCoupon_Button).build().perform();
	}

	// visible or Not :  ActivateCoupon_Button
	public boolean isDisplayed_click_ActivateCoupon_Button(){
		if(click_ActivateCoupon_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  ActivateCoupon_Button
	public boolean isEnabled_click_ActivateCoupon_Button(){
		if(click_ActivateCoupon_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  ActivateCoupon_Button
	public String getCssValue_click_ActivateCoupon_Button(String attribute) {
		return click_ActivateCoupon_Button.getCssValue(attribute);
	}

	//Get the text :  ActivateCoupon_Button
	public String getText_click_ActivateCoupon_Button(){
		return click_ActivateCoupon_Button.getText();
	}

	//Get the value :  ActivateCoupon_Button
	public String getValue_click_ActivateCoupon_Button(){
		return click_ActivateCoupon_Button.getAttribute("value");
	}
	// selected or Not :  ActivateCoupon_Button
	public boolean isSelected_click_ActivateCoupon_Button(){
		if(click_ActivateCoupon_Button.isSelected()) { return true; } else { return false;} 
	}

	// Type:  ThankYou_Message_Text
	public void type_txt_ThankYou_Message_Text(String value) {
		txt_ThankYou_Message_Text.clear();
		txt_ThankYou_Message_Text.sendKeys(value);
	}

	//click:  ThankYou_Message_Text
	public void click_txt_ThankYou_Message_Text(){
		txt_ThankYou_Message_Text.click();
	}

	// Hover:  ThankYou_Message_Text
	public void hover_txt_ThankYou_Message_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_ThankYou_Message_Text).build().perform();
	}

	// visible or Not :  ThankYou_Message_Text
	public boolean isDisplayed_txt_ThankYou_Message_Text(){
		if(txt_ThankYou_Message_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  ThankYou_Message_Text
	public boolean isEnabled_txt_ThankYou_Message_Text(){
		if(txt_ThankYou_Message_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  ThankYou_Message_Text
	public String getCssValue_txt_ThankYou_Message_Text(String attribute) {
		return txt_ThankYou_Message_Text.getCssValue(attribute);
	}

	//Get the text :  ThankYou_Message_Text
	public String getText_txt_ThankYou_Message_Text(){
		return txt_ThankYou_Message_Text.getText();
	}

	//Get the value :  ThankYou_Message_Text
	public String getValue_txt_ThankYou_Message_Text(){
		return txt_ThankYou_Message_Text.getAttribute("value");
	}
	// selected or Not :  ThankYou_Message_Text
	public boolean isSelected_txt_ThankYou_Message_Text(){
		if(txt_ThankYou_Message_Text.isSelected()) { return true; } else { return false;} 
	}

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

	//click:  Digital_coupons_button
	public void click_click_Digital_coupons_button(){
		click_Digital_coupons_button.click();
	}

	// Hover:  Digital_coupons_button
	public void hover_click_Digital_coupons_button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Digital_coupons_button).build().perform();
	}

	// visible or Not :  Digital_coupons_button
	public boolean isDisplayed_click_Digital_coupons_button(){
		if(click_Digital_coupons_button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Digital_coupons_button
	public boolean isEnabled_click_Digital_coupons_button(){
		if(click_Digital_coupons_button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Digital_coupons_button
	public String getCssValue_click_Digital_coupons_button(String attribute) {
		return click_Digital_coupons_button.getCssValue(attribute);
	}

	//Get the text :  Digital_coupons_button
	public String getText_click_Digital_coupons_button(){
		return click_Digital_coupons_button.getText();
	}

	//Get the value :  Digital_coupons_button
	public String getValue_click_Digital_coupons_button(){
		return click_Digital_coupons_button.getAttribute("value");
	}
	// selected or Not :  Digital_coupons_button
	public boolean isSelected_click_Digital_coupons_button(){
		if(click_Digital_coupons_button.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Fuel_Rewards_Page_Button
	public void type_txt_Fuel_Rewards_Page_Button(String value) {
		txt_Fuel_Rewards_Page_Button.clear();
		txt_Fuel_Rewards_Page_Button.sendKeys(value);
	}

	//click:  Fuel_Rewards_Page_Button
	public void click_txt_Fuel_Rewards_Page_Button(){
		txt_Fuel_Rewards_Page_Button.click();
	}

	// Hover:  Fuel_Rewards_Page_Button
	public void hover_txt_Fuel_Rewards_Page_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Fuel_Rewards_Page_Button).build().perform();
	}

	// visible or Not :  Fuel_Rewards_Page_Button
	public boolean isDisplayed_txt_Fuel_Rewards_Page_Button(){
		if(txt_Fuel_Rewards_Page_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Fuel_Rewards_Page_Button
	public boolean isEnabled_txt_Fuel_Rewards_Page_Button(){
		if(txt_Fuel_Rewards_Page_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Fuel_Rewards_Page_Button
	public String getCssValue_txt_Fuel_Rewards_Page_Button(String attribute) {
		return txt_Fuel_Rewards_Page_Button.getCssValue(attribute);
	}

	//Get the text :  Fuel_Rewards_Page_Button
	public String getText_txt_Fuel_Rewards_Page_Button(){
		return txt_Fuel_Rewards_Page_Button.getText();
	}

	//Get the value :  Fuel_Rewards_Page_Button
	public String getValue_txt_Fuel_Rewards_Page_Button(){
		return txt_Fuel_Rewards_Page_Button.getAttribute("value");
	}
	// selected or Not :  Fuel_Rewards_Page_Button
	public boolean isSelected_txt_Fuel_Rewards_Page_Button(){
		if(txt_Fuel_Rewards_Page_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Fuel_Rewards_Link
	public void click_click_Fuel_Rewards_Link(){
		click_Fuel_Rewards_Link.click();
	}

	// Hover:  Fuel_Rewards_Link
	public void hover_click_Fuel_Rewards_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Fuel_Rewards_Link).build().perform();
	}

	// visible or Not :  Fuel_Rewards_Link
	public boolean isDisplayed_click_Fuel_Rewards_Link(){
		if(click_Fuel_Rewards_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Fuel_Rewards_Link
	public boolean isEnabled_click_Fuel_Rewards_Link(){
		if(click_Fuel_Rewards_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Fuel_Rewards_Link
	public String getCssValue_click_Fuel_Rewards_Link(String attribute) {
		return click_Fuel_Rewards_Link.getCssValue(attribute);
	}

	//Get the text :  Fuel_Rewards_Link
	public String getText_click_Fuel_Rewards_Link(){
		return click_Fuel_Rewards_Link.getText();
	}

	//Get the value :  Fuel_Rewards_Link
	public String getValue_click_Fuel_Rewards_Link(){
		return click_Fuel_Rewards_Link.getAttribute("value");
	}
	// selected or Not :  Fuel_Rewards_Link
	public boolean isSelected_click_Fuel_Rewards_Link(){
		if(click_Fuel_Rewards_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  My_Rewards_Link
	public void click_click_My_Rewards_Link(){
		click_My_Rewards_Link.click();
	}

	// Hover:  My_Rewards_Link
	public void hover_click_My_Rewards_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_My_Rewards_Link).build().perform();
	}

	// visible or Not :  My_Rewards_Link
	public boolean isDisplayed_click_My_Rewards_Link(){
		if(click_My_Rewards_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  My_Rewards_Link
	public boolean isEnabled_click_My_Rewards_Link(){
		if(click_My_Rewards_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  My_Rewards_Link
	public String getCssValue_click_My_Rewards_Link(String attribute) {
		return click_My_Rewards_Link.getCssValue(attribute);
	}

	//Get the text :  My_Rewards_Link
	public String getText_click_My_Rewards_Link(){
		return click_My_Rewards_Link.getText();
	}

	//Get the value :  My_Rewards_Link
	public String getValue_click_My_Rewards_Link(){
		return click_My_Rewards_Link.getAttribute("value");
	}
	// selected or Not :  My_Rewards_Link
	public boolean isSelected_click_My_Rewards_Link(){
		if(click_My_Rewards_Link.isSelected()) { return true; } else { return false;} 
	}

}
