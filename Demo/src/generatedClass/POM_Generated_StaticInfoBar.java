//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_StaticInfoBar { 
	WebDriver driver;
	public POM_Generated_StaticInfoBar (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : Static_info_Set_Store_Link
	@FindBy(xpath = "//a[text()='Set Your Store ']")
	public WebElement click_Static_info_Set_Store_Link;
	
	// Associated Label : Static_info_Set_Store_Text
	@FindBy(xpath = "//div[text()='Please set your store']")
	public WebElement click_Static_info_Set_Store_Text;
	
	// Associated Label : Static_info_MyStore_Nearest_store_link
	@FindBy(id = "mYstore")
	public WebElement click_Static_info_MyStore_Nearest_store_link;
	
	// Associated Label : Static_info_MyStore_Link
	@FindBy(id = "mYstore_Desk")
	public WebElement click_Static_info_MyStore_Link;
	
	// Associated Label : Static_info_MyStore_Change_Link
	@FindBy(xpath = "//div[@id='dvHasStore_Desk']//a[@href='/Locator']")
	public WebElement click_Static_info_MyStore_Change_Link;
	
	// Associated Label : Static_info_MyStore_Address_Text
	@FindBy(id = "dvStreetAddress_Desk")
	public WebElement click_Static_info_MyStore_Address_Text;
	
	// Associated Label : Static_info_WeeklyAds_link
	@FindBy(xpath = "//a[contains(text(),'Weekly Ads')]")
	public WebElement click_Static_info_WeeklyAds_link;
	
	// Associated Label : Static_info_WeeklyAds_Text
	@FindBy(id = "dvWeeklyAd_Desk")
	public WebElement click_Static_info_WeeklyAds_Text;
	
	// Associated Label : Static_info_My_Rewards_Link
	@FindBy(xpath = "//a[text()='My Rewards ']")
	public WebElement click_Static_info_My_Rewards_Link;
	
	// Associated Label : Static_info_My_Rewards_Text
	@FindBy(id = "dvMyRewardsPoint")
	public WebElement click_Static_info_My_Rewards_Text;
	
	// Associated Label : Static_info_My_Account_Link
	@FindBy(xpath = "//a[text()='My Account ']")
	public WebElement click_Static_info_My_Account_Link;
	
	// Associated Label : Static_info_My_Account_Text
	@FindBy(id = "dvAvailablePoints_Desk")
	public WebElement click_Static_info_My_Account_Text;
	
	// Associated Label : Home_Link
	@FindBy(xpath = "//a[text()='Home ']")
	public WebElement click_Home_Link;
	

//*******************************************************************************


	// Element Actions


	//click:  Static_info_Set_Store_Link
	public void click_click_Static_info_Set_Store_Link(){
		click_Static_info_Set_Store_Link.click();
	}

	// Hover:  Static_info_Set_Store_Link
	public void hover_click_Static_info_Set_Store_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Static_info_Set_Store_Link).build().perform();
	}

	// visible or Not :  Static_info_Set_Store_Link
	public boolean isDisplayed_click_Static_info_Set_Store_Link(){
		if(click_Static_info_Set_Store_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Static_info_Set_Store_Link
	public boolean isEnabled_click_Static_info_Set_Store_Link(){
		if(click_Static_info_Set_Store_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Static_info_Set_Store_Link
	public String getCssValue_click_Static_info_Set_Store_Link(String attribute) {
		return click_Static_info_Set_Store_Link.getCssValue(attribute);
	}

	//Get the text :  Static_info_Set_Store_Link
	public String getText_click_Static_info_Set_Store_Link(){
		return click_Static_info_Set_Store_Link.getText();
	}

	//Get the value :  Static_info_Set_Store_Link
	public String getValue_click_Static_info_Set_Store_Link(){
		return click_Static_info_Set_Store_Link.getAttribute("value");
	}
	// selected or Not :  Static_info_Set_Store_Link
	public boolean isSelected_click_Static_info_Set_Store_Link(){
		if(click_Static_info_Set_Store_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Static_info_Set_Store_Text
	public void click_click_Static_info_Set_Store_Text(){
		click_Static_info_Set_Store_Text.click();
	}

	// Hover:  Static_info_Set_Store_Text
	public void hover_click_Static_info_Set_Store_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Static_info_Set_Store_Text).build().perform();
	}

	// visible or Not :  Static_info_Set_Store_Text
	public boolean isDisplayed_click_Static_info_Set_Store_Text(){
		if(click_Static_info_Set_Store_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Static_info_Set_Store_Text
	public boolean isEnabled_click_Static_info_Set_Store_Text(){
		if(click_Static_info_Set_Store_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Static_info_Set_Store_Text
	public String getCssValue_click_Static_info_Set_Store_Text(String attribute) {
		return click_Static_info_Set_Store_Text.getCssValue(attribute);
	}

	//Get the text :  Static_info_Set_Store_Text
	public String getText_click_Static_info_Set_Store_Text(){
		return click_Static_info_Set_Store_Text.getText();
	}

	//Get the value :  Static_info_Set_Store_Text
	public String getValue_click_Static_info_Set_Store_Text(){
		return click_Static_info_Set_Store_Text.getAttribute("value");
	}
	// selected or Not :  Static_info_Set_Store_Text
	public boolean isSelected_click_Static_info_Set_Store_Text(){
		if(click_Static_info_Set_Store_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  Static_info_MyStore_Nearest_store_link
	public void click_click_Static_info_MyStore_Nearest_store_link(){
		click_Static_info_MyStore_Nearest_store_link.click();
	}

	// Hover:  Static_info_MyStore_Nearest_store_link
	public void hover_click_Static_info_MyStore_Nearest_store_link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Static_info_MyStore_Nearest_store_link).build().perform();
	}

	// visible or Not :  Static_info_MyStore_Nearest_store_link
	public boolean isDisplayed_click_Static_info_MyStore_Nearest_store_link(){
		if(click_Static_info_MyStore_Nearest_store_link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Static_info_MyStore_Nearest_store_link
	public boolean isEnabled_click_Static_info_MyStore_Nearest_store_link(){
		if(click_Static_info_MyStore_Nearest_store_link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Static_info_MyStore_Nearest_store_link
	public String getCssValue_click_Static_info_MyStore_Nearest_store_link(String attribute) {
		return click_Static_info_MyStore_Nearest_store_link.getCssValue(attribute);
	}

	//Get the text :  Static_info_MyStore_Nearest_store_link
	public String getText_click_Static_info_MyStore_Nearest_store_link(){
		return click_Static_info_MyStore_Nearest_store_link.getText();
	}

	//Get the value :  Static_info_MyStore_Nearest_store_link
	public String getValue_click_Static_info_MyStore_Nearest_store_link(){
		return click_Static_info_MyStore_Nearest_store_link.getAttribute("value");
	}
	// selected or Not :  Static_info_MyStore_Nearest_store_link
	public boolean isSelected_click_Static_info_MyStore_Nearest_store_link(){
		if(click_Static_info_MyStore_Nearest_store_link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Static_info_MyStore_Link
	public void click_click_Static_info_MyStore_Link(){
		click_Static_info_MyStore_Link.click();
	}

	// Hover:  Static_info_MyStore_Link
	public void hover_click_Static_info_MyStore_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Static_info_MyStore_Link).build().perform();
	}

	// visible or Not :  Static_info_MyStore_Link
	public boolean isDisplayed_click_Static_info_MyStore_Link(){
		if(click_Static_info_MyStore_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Static_info_MyStore_Link
	public boolean isEnabled_click_Static_info_MyStore_Link(){
		if(click_Static_info_MyStore_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Static_info_MyStore_Link
	public String getCssValue_click_Static_info_MyStore_Link(String attribute) {
		return click_Static_info_MyStore_Link.getCssValue(attribute);
	}

	//Get the text :  Static_info_MyStore_Link
	public String getText_click_Static_info_MyStore_Link(){
		return click_Static_info_MyStore_Link.getText();
	}

	//Get the value :  Static_info_MyStore_Link
	public String getValue_click_Static_info_MyStore_Link(){
		return click_Static_info_MyStore_Link.getAttribute("value");
	}
	// selected or Not :  Static_info_MyStore_Link
	public boolean isSelected_click_Static_info_MyStore_Link(){
		if(click_Static_info_MyStore_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Static_info_MyStore_Change_Link
	public void click_click_Static_info_MyStore_Change_Link(){
		click_Static_info_MyStore_Change_Link.click();
	}

	// Hover:  Static_info_MyStore_Change_Link
	public void hover_click_Static_info_MyStore_Change_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Static_info_MyStore_Change_Link).build().perform();
	}

	// visible or Not :  Static_info_MyStore_Change_Link
	public boolean isDisplayed_click_Static_info_MyStore_Change_Link(){
		if(click_Static_info_MyStore_Change_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Static_info_MyStore_Change_Link
	public boolean isEnabled_click_Static_info_MyStore_Change_Link(){
		if(click_Static_info_MyStore_Change_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Static_info_MyStore_Change_Link
	public String getCssValue_click_Static_info_MyStore_Change_Link(String attribute) {
		return click_Static_info_MyStore_Change_Link.getCssValue(attribute);
	}

	//Get the text :  Static_info_MyStore_Change_Link
	public String getText_click_Static_info_MyStore_Change_Link(){
		return click_Static_info_MyStore_Change_Link.getText();
	}

	//Get the value :  Static_info_MyStore_Change_Link
	public String getValue_click_Static_info_MyStore_Change_Link(){
		return click_Static_info_MyStore_Change_Link.getAttribute("value");
	}
	// selected or Not :  Static_info_MyStore_Change_Link
	public boolean isSelected_click_Static_info_MyStore_Change_Link(){
		if(click_Static_info_MyStore_Change_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Static_info_MyStore_Address_Text
	public void click_click_Static_info_MyStore_Address_Text(){
		click_Static_info_MyStore_Address_Text.click();
	}

	// Hover:  Static_info_MyStore_Address_Text
	public void hover_click_Static_info_MyStore_Address_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Static_info_MyStore_Address_Text).build().perform();
	}

	// visible or Not :  Static_info_MyStore_Address_Text
	public boolean isDisplayed_click_Static_info_MyStore_Address_Text(){
		if(click_Static_info_MyStore_Address_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Static_info_MyStore_Address_Text
	public boolean isEnabled_click_Static_info_MyStore_Address_Text(){
		if(click_Static_info_MyStore_Address_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Static_info_MyStore_Address_Text
	public String getCssValue_click_Static_info_MyStore_Address_Text(String attribute) {
		return click_Static_info_MyStore_Address_Text.getCssValue(attribute);
	}

	//Get the text :  Static_info_MyStore_Address_Text
	public String getText_click_Static_info_MyStore_Address_Text(){
		return click_Static_info_MyStore_Address_Text.getText();
	}

	//Get the value :  Static_info_MyStore_Address_Text
	public String getValue_click_Static_info_MyStore_Address_Text(){
		return click_Static_info_MyStore_Address_Text.getAttribute("value");
	}
	// selected or Not :  Static_info_MyStore_Address_Text
	public boolean isSelected_click_Static_info_MyStore_Address_Text(){
		if(click_Static_info_MyStore_Address_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  Static_info_WeeklyAds_link
	public void click_click_Static_info_WeeklyAds_link(){
		click_Static_info_WeeklyAds_link.click();
	}

	// Hover:  Static_info_WeeklyAds_link
	public void hover_click_Static_info_WeeklyAds_link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Static_info_WeeklyAds_link).build().perform();
	}

	// visible or Not :  Static_info_WeeklyAds_link
	public boolean isDisplayed_click_Static_info_WeeklyAds_link(){
		if(click_Static_info_WeeklyAds_link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Static_info_WeeklyAds_link
	public boolean isEnabled_click_Static_info_WeeklyAds_link(){
		if(click_Static_info_WeeklyAds_link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Static_info_WeeklyAds_link
	public String getCssValue_click_Static_info_WeeklyAds_link(String attribute) {
		return click_Static_info_WeeklyAds_link.getCssValue(attribute);
	}

	//Get the text :  Static_info_WeeklyAds_link
	public String getText_click_Static_info_WeeklyAds_link(){
		return click_Static_info_WeeklyAds_link.getText();
	}

	//Get the value :  Static_info_WeeklyAds_link
	public String getValue_click_Static_info_WeeklyAds_link(){
		return click_Static_info_WeeklyAds_link.getAttribute("value");
	}
	// selected or Not :  Static_info_WeeklyAds_link
	public boolean isSelected_click_Static_info_WeeklyAds_link(){
		if(click_Static_info_WeeklyAds_link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Static_info_WeeklyAds_Text
	public void click_click_Static_info_WeeklyAds_Text(){
		click_Static_info_WeeklyAds_Text.click();
	}

	// Hover:  Static_info_WeeklyAds_Text
	public void hover_click_Static_info_WeeklyAds_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Static_info_WeeklyAds_Text).build().perform();
	}

	// visible or Not :  Static_info_WeeklyAds_Text
	public boolean isDisplayed_click_Static_info_WeeklyAds_Text(){
		if(click_Static_info_WeeklyAds_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Static_info_WeeklyAds_Text
	public boolean isEnabled_click_Static_info_WeeklyAds_Text(){
		if(click_Static_info_WeeklyAds_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Static_info_WeeklyAds_Text
	public String getCssValue_click_Static_info_WeeklyAds_Text(String attribute) {
		return click_Static_info_WeeklyAds_Text.getCssValue(attribute);
	}

	//Get the text :  Static_info_WeeklyAds_Text
	public String getText_click_Static_info_WeeklyAds_Text(){
		return click_Static_info_WeeklyAds_Text.getText();
	}

	//Get the value :  Static_info_WeeklyAds_Text
	public String getValue_click_Static_info_WeeklyAds_Text(){
		return click_Static_info_WeeklyAds_Text.getAttribute("value");
	}
	// selected or Not :  Static_info_WeeklyAds_Text
	public boolean isSelected_click_Static_info_WeeklyAds_Text(){
		if(click_Static_info_WeeklyAds_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  Static_info_My_Rewards_Link
	public void click_click_Static_info_My_Rewards_Link(){
		click_Static_info_My_Rewards_Link.click();
	}

	// Hover:  Static_info_My_Rewards_Link
	public void hover_click_Static_info_My_Rewards_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Static_info_My_Rewards_Link).build().perform();
	}

	// visible or Not :  Static_info_My_Rewards_Link
	public boolean isDisplayed_click_Static_info_My_Rewards_Link(){
		if(click_Static_info_My_Rewards_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Static_info_My_Rewards_Link
	public boolean isEnabled_click_Static_info_My_Rewards_Link(){
		if(click_Static_info_My_Rewards_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Static_info_My_Rewards_Link
	public String getCssValue_click_Static_info_My_Rewards_Link(String attribute) {
		return click_Static_info_My_Rewards_Link.getCssValue(attribute);
	}

	//Get the text :  Static_info_My_Rewards_Link
	public String getText_click_Static_info_My_Rewards_Link(){
		return click_Static_info_My_Rewards_Link.getText();
	}

	//Get the value :  Static_info_My_Rewards_Link
	public String getValue_click_Static_info_My_Rewards_Link(){
		return click_Static_info_My_Rewards_Link.getAttribute("value");
	}
	// selected or Not :  Static_info_My_Rewards_Link
	public boolean isSelected_click_Static_info_My_Rewards_Link(){
		if(click_Static_info_My_Rewards_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Static_info_My_Rewards_Text
	public void click_click_Static_info_My_Rewards_Text(){
		click_Static_info_My_Rewards_Text.click();
	}

	// Hover:  Static_info_My_Rewards_Text
	public void hover_click_Static_info_My_Rewards_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Static_info_My_Rewards_Text).build().perform();
	}

	// visible or Not :  Static_info_My_Rewards_Text
	public boolean isDisplayed_click_Static_info_My_Rewards_Text(){
		if(click_Static_info_My_Rewards_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Static_info_My_Rewards_Text
	public boolean isEnabled_click_Static_info_My_Rewards_Text(){
		if(click_Static_info_My_Rewards_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Static_info_My_Rewards_Text
	public String getCssValue_click_Static_info_My_Rewards_Text(String attribute) {
		return click_Static_info_My_Rewards_Text.getCssValue(attribute);
	}

	//Get the text :  Static_info_My_Rewards_Text
	public String getText_click_Static_info_My_Rewards_Text(){
		return click_Static_info_My_Rewards_Text.getText();
	}

	//Get the value :  Static_info_My_Rewards_Text
	public String getValue_click_Static_info_My_Rewards_Text(){
		return click_Static_info_My_Rewards_Text.getAttribute("value");
	}
	// selected or Not :  Static_info_My_Rewards_Text
	public boolean isSelected_click_Static_info_My_Rewards_Text(){
		if(click_Static_info_My_Rewards_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  Static_info_My_Account_Link
	public void click_click_Static_info_My_Account_Link(){
		click_Static_info_My_Account_Link.click();
	}

	// Hover:  Static_info_My_Account_Link
	public void hover_click_Static_info_My_Account_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Static_info_My_Account_Link).build().perform();
	}

	// visible or Not :  Static_info_My_Account_Link
	public boolean isDisplayed_click_Static_info_My_Account_Link(){
		if(click_Static_info_My_Account_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Static_info_My_Account_Link
	public boolean isEnabled_click_Static_info_My_Account_Link(){
		if(click_Static_info_My_Account_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Static_info_My_Account_Link
	public String getCssValue_click_Static_info_My_Account_Link(String attribute) {
		return click_Static_info_My_Account_Link.getCssValue(attribute);
	}

	//Get the text :  Static_info_My_Account_Link
	public String getText_click_Static_info_My_Account_Link(){
		return click_Static_info_My_Account_Link.getText();
	}

	//Get the value :  Static_info_My_Account_Link
	public String getValue_click_Static_info_My_Account_Link(){
		return click_Static_info_My_Account_Link.getAttribute("value");
	}
	// selected or Not :  Static_info_My_Account_Link
	public boolean isSelected_click_Static_info_My_Account_Link(){
		if(click_Static_info_My_Account_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Static_info_My_Account_Text
	public void click_click_Static_info_My_Account_Text(){
		click_Static_info_My_Account_Text.click();
	}

	// Hover:  Static_info_My_Account_Text
	public void hover_click_Static_info_My_Account_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Static_info_My_Account_Text).build().perform();
	}

	// visible or Not :  Static_info_My_Account_Text
	public boolean isDisplayed_click_Static_info_My_Account_Text(){
		if(click_Static_info_My_Account_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Static_info_My_Account_Text
	public boolean isEnabled_click_Static_info_My_Account_Text(){
		if(click_Static_info_My_Account_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Static_info_My_Account_Text
	public String getCssValue_click_Static_info_My_Account_Text(String attribute) {
		return click_Static_info_My_Account_Text.getCssValue(attribute);
	}

	//Get the text :  Static_info_My_Account_Text
	public String getText_click_Static_info_My_Account_Text(){
		return click_Static_info_My_Account_Text.getText();
	}

	//Get the value :  Static_info_My_Account_Text
	public String getValue_click_Static_info_My_Account_Text(){
		return click_Static_info_My_Account_Text.getAttribute("value");
	}
	// selected or Not :  Static_info_My_Account_Text
	public boolean isSelected_click_Static_info_My_Account_Text(){
		if(click_Static_info_My_Account_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  Home_Link
	public void click_click_Home_Link(){
		click_Home_Link.click();
	}

	// Hover:  Home_Link
	public void hover_click_Home_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Home_Link).build().perform();
	}

	// visible or Not :  Home_Link
	public boolean isDisplayed_click_Home_Link(){
		if(click_Home_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Home_Link
	public boolean isEnabled_click_Home_Link(){
		if(click_Home_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Home_Link
	public String getCssValue_click_Home_Link(String attribute) {
		return click_Home_Link.getCssValue(attribute);
	}

	//Get the text :  Home_Link
	public String getText_click_Home_Link(){
		return click_Home_Link.getText();
	}

	//Get the value :  Home_Link
	public String getValue_click_Home_Link(){
		return click_Home_Link.getAttribute("value");
	}
	// selected or Not :  Home_Link
	public boolean isSelected_click_Home_Link(){
		if(click_Home_Link.isSelected()) { return true; } else { return false;} 
	}

}
