//******************************
package  generatedClass;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_WeeklyAdPage { 
	WebDriver driver;
	public POM_Generated_WeeklyAdPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : Select_Store_Field
	@FindBy(id = "location")
	public WebElement txt_Select_Store_Field;
	
	// Associated Label : Store_Search_Button
	@FindBy(xpath = "//button[text()='Search']")
	public WebElement click_Store_Search_Button;
	
	// Associated Label : Locate_A_store_Near_You_Button
	@FindBy(xpath = "//span[text()='locate a store near you']")
	public WebElement click_Locate_A_store_Near_You_Button;
	
	// Associated Label : Please_Select_A_Store_Text
	@FindBy(xpath = "//h1[contains(text(),  'Please select a store to view this week' ) ]")
	public WebElement txt_Please_Select_A_Store_Text;
	
	// Associated Label : Weekly_Ads_Button
	@FindBy(xpath = "//a[@aria-current='page']//span[text()='Weekly Ads']")
	public WebElement click_Weekly_Ads_Button;
	
	// Associated Label : Selected_weeklyad_Store_Details_Text
	@FindBy(xpath = "//div[@class='row store-info-pod'][1]//div[@class='col-sm-3 address']/p")
	public WebElement txt_Selected_weeklyad_Store_Details_Text;
	
	// Associated Label : Store_View_weeklyAds_Button
	@FindBy(xpath = "//a[text()='view weekly ads'][1]")
	public WebElement click_Store_View_weeklyAds_Button;
	
	// Associated Label : Verify_store_Address_Text
	@FindBy(id = "//span[@class='store-address']")
	public WebElement click_Verify_store_Address_Text;
	
	// Associated Label : Your_WeeklyAd_Text
	@FindBy(xpath = "//h2[@class='posterTitle']")
	public WebElement txt_Your_WeeklyAd_Text;
	
	// Associated Label : View_weeklyAd_Link
	@FindBy(xpath = "//button[text()='VIEW WEEKLY AD']")
	public WebElement click_View_weeklyAd_Link;
	
	// Associated Label : Product_Webelement_Text
	@FindBy(xpath = "//div[@id='cspree-container']//product[@role='button' or @class='wantsFocus']")
	public WebElement click_Product_Webelement_Text;
	
	// Associated Label : Product_List_Text
	@FindBy(xpath = "//div[@id='cspree-container']//product[@role='button' or @class='wantsFocus']")
	public List<WebElement> click_Product_List_Text;
	
	// Associated Label : Product_view_Deals_Button
	@FindBy(xpath = "//button[text()='View Details']")
	public WebElement click_Product_view_Deals_Button;
	
	// Associated Label : Product_AddToList_Button
	@FindBy(xpath = "//button[text()='Add to List']")
	public WebElement click_Product_AddToList_Button;
	
	// Associated Label : Product_RemoveFromList_Button
	@FindBy(xpath = "//button[text()='Remove from List']")
	public WebElement click_Product_RemoveFromList_Button;
	
	// Associated Label : Product_AddToList_Overlay_Button
	@FindBy(xpath = "//div[@class='body']//button[text()='Add to List']")
	public WebElement click_Product_AddToList_Overlay_Button;
	
	// Associated Label : Product_RemoveFromList_Overlay_Button
	@FindBy(xpath = "//div[@class='body']//button[text()='Remove from List']")
	public WebElement click_Product_RemoveFromList_Overlay_Button;
	
	// Associated Label : Product_Summary_Text
	@FindBy(id = "ProductOverlayTitle")
	public WebElement txt_Product_Summary_Text;
	
	// Associated Label : Product_Price_Text
	@FindBy(xpath = "//div[@class='price showFancyPrice']")
	public WebElement txt_Product_Price_Text;
	
	// Associated Label : Product_Description_Text
	@FindBy(xpath = "//div[@class='text']//div[@class='description']")
	public WebElement txt_Product_Description_Text;
	
	// Associated Label : Product_Overlay_Close_Button
	@FindBy(xpath = "//button[@aria-label='Close Product Overlay']")
	public WebElement click_Product_Overlay_Close_Button;
	

//*******************************************************************************


	// Element Actions


	// Type:  Select_Store_Field
	public void type_txt_Select_Store_Field(String value) {
		txt_Select_Store_Field.clear();
		txt_Select_Store_Field.sendKeys(value);
	}

	//click:  Select_Store_Field
	public void click_txt_Select_Store_Field(){
		txt_Select_Store_Field.click();
	}

	// Hover:  Select_Store_Field
	public void hover_txt_Select_Store_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Select_Store_Field).build().perform();
	}

	// visible or Not :  Select_Store_Field
	public boolean isDisplayed_txt_Select_Store_Field(){
		if(txt_Select_Store_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Select_Store_Field
	public boolean isEnabled_txt_Select_Store_Field(){
		if(txt_Select_Store_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Select_Store_Field
	public String getCssValue_txt_Select_Store_Field(String attribute) {
		return txt_Select_Store_Field.getCssValue(attribute);
	}

	//Get the text :  Select_Store_Field
	public String getText_txt_Select_Store_Field(){
		return txt_Select_Store_Field.getText();
	}

	//Get the value :  Select_Store_Field
	public String getValue_txt_Select_Store_Field(){
		return txt_Select_Store_Field.getAttribute("value");
	}
	// selected or Not :  Select_Store_Field
	public boolean isSelected_txt_Select_Store_Field(){
		if(txt_Select_Store_Field.isSelected()) { return true; } else { return false;} 
	}

	//click:  Store_Search_Button
	public void click_click_Store_Search_Button(){
		click_Store_Search_Button.click();
	}

	// Hover:  Store_Search_Button
	public void hover_click_Store_Search_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Store_Search_Button).build().perform();
	}

	// visible or Not :  Store_Search_Button
	public boolean isDisplayed_click_Store_Search_Button(){
		if(click_Store_Search_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Store_Search_Button
	public boolean isEnabled_click_Store_Search_Button(){
		if(click_Store_Search_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Store_Search_Button
	public String getCssValue_click_Store_Search_Button(String attribute) {
		return click_Store_Search_Button.getCssValue(attribute);
	}

	//Get the text :  Store_Search_Button
	public String getText_click_Store_Search_Button(){
		return click_Store_Search_Button.getText();
	}

	//Get the value :  Store_Search_Button
	public String getValue_click_Store_Search_Button(){
		return click_Store_Search_Button.getAttribute("value");
	}
	// selected or Not :  Store_Search_Button
	public boolean isSelected_click_Store_Search_Button(){
		if(click_Store_Search_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Locate_A_store_Near_You_Button
	public void click_click_Locate_A_store_Near_You_Button(){
		click_Locate_A_store_Near_You_Button.click();
	}

	// Hover:  Locate_A_store_Near_You_Button
	public void hover_click_Locate_A_store_Near_You_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Locate_A_store_Near_You_Button).build().perform();
	}

	// visible or Not :  Locate_A_store_Near_You_Button
	public boolean isDisplayed_click_Locate_A_store_Near_You_Button(){
		if(click_Locate_A_store_Near_You_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Locate_A_store_Near_You_Button
	public boolean isEnabled_click_Locate_A_store_Near_You_Button(){
		if(click_Locate_A_store_Near_You_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Locate_A_store_Near_You_Button
	public String getCssValue_click_Locate_A_store_Near_You_Button(String attribute) {
		return click_Locate_A_store_Near_You_Button.getCssValue(attribute);
	}

	//Get the text :  Locate_A_store_Near_You_Button
	public String getText_click_Locate_A_store_Near_You_Button(){
		return click_Locate_A_store_Near_You_Button.getText();
	}

	//Get the value :  Locate_A_store_Near_You_Button
	public String getValue_click_Locate_A_store_Near_You_Button(){
		return click_Locate_A_store_Near_You_Button.getAttribute("value");
	}
	// selected or Not :  Locate_A_store_Near_You_Button
	public boolean isSelected_click_Locate_A_store_Near_You_Button(){
		if(click_Locate_A_store_Near_You_Button.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Please_Select_A_Store_Text
	public void type_txt_Please_Select_A_Store_Text(String value) {
		txt_Please_Select_A_Store_Text.clear();
		txt_Please_Select_A_Store_Text.sendKeys(value);
	}

	//click:  Please_Select_A_Store_Text
	public void click_txt_Please_Select_A_Store_Text(){
		txt_Please_Select_A_Store_Text.click();
	}

	// Hover:  Please_Select_A_Store_Text
	public void hover_txt_Please_Select_A_Store_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Please_Select_A_Store_Text).build().perform();
	}

	// visible or Not :  Please_Select_A_Store_Text
	public boolean isDisplayed_txt_Please_Select_A_Store_Text(){
		if(txt_Please_Select_A_Store_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Please_Select_A_Store_Text
	public boolean isEnabled_txt_Please_Select_A_Store_Text(){
		if(txt_Please_Select_A_Store_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Please_Select_A_Store_Text
	public String getCssValue_txt_Please_Select_A_Store_Text(String attribute) {
		return txt_Please_Select_A_Store_Text.getCssValue(attribute);
	}

	//Get the text :  Please_Select_A_Store_Text
	public String getText_txt_Please_Select_A_Store_Text(){
		return txt_Please_Select_A_Store_Text.getText();
	}

	//Get the value :  Please_Select_A_Store_Text
	public String getValue_txt_Please_Select_A_Store_Text(){
		return txt_Please_Select_A_Store_Text.getAttribute("value");
	}
	// selected or Not :  Please_Select_A_Store_Text
	public boolean isSelected_txt_Please_Select_A_Store_Text(){
		if(txt_Please_Select_A_Store_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  Weekly_Ads_Button
	public void click_click_Weekly_Ads_Button(){
		click_Weekly_Ads_Button.click();
	}

	// Hover:  Weekly_Ads_Button
	public void hover_click_Weekly_Ads_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Weekly_Ads_Button).build().perform();
	}

	// visible or Not :  Weekly_Ads_Button
	public boolean isDisplayed_click_Weekly_Ads_Button(){
		if(click_Weekly_Ads_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Weekly_Ads_Button
	public boolean isEnabled_click_Weekly_Ads_Button(){
		if(click_Weekly_Ads_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Weekly_Ads_Button
	public String getCssValue_click_Weekly_Ads_Button(String attribute) {
		return click_Weekly_Ads_Button.getCssValue(attribute);
	}

	//Get the text :  Weekly_Ads_Button
	public String getText_click_Weekly_Ads_Button(){
		return click_Weekly_Ads_Button.getText();
	}

	//Get the value :  Weekly_Ads_Button
	public String getValue_click_Weekly_Ads_Button(){
		return click_Weekly_Ads_Button.getAttribute("value");
	}
	// selected or Not :  Weekly_Ads_Button
	public boolean isSelected_click_Weekly_Ads_Button(){
		if(click_Weekly_Ads_Button.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Selected_weeklyad_Store_Details_Text
	public void type_txt_Selected_weeklyad_Store_Details_Text(String value) {
		txt_Selected_weeklyad_Store_Details_Text.clear();
		txt_Selected_weeklyad_Store_Details_Text.sendKeys(value);
	}

	//click:  Selected_weeklyad_Store_Details_Text
	public void click_txt_Selected_weeklyad_Store_Details_Text(){
		txt_Selected_weeklyad_Store_Details_Text.click();
	}

	// Hover:  Selected_weeklyad_Store_Details_Text
	public void hover_txt_Selected_weeklyad_Store_Details_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Selected_weeklyad_Store_Details_Text).build().perform();
	}

	// visible or Not :  Selected_weeklyad_Store_Details_Text
	public boolean isDisplayed_txt_Selected_weeklyad_Store_Details_Text(){
		if(txt_Selected_weeklyad_Store_Details_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Selected_weeklyad_Store_Details_Text
	public boolean isEnabled_txt_Selected_weeklyad_Store_Details_Text(){
		if(txt_Selected_weeklyad_Store_Details_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Selected_weeklyad_Store_Details_Text
	public String getCssValue_txt_Selected_weeklyad_Store_Details_Text(String attribute) {
		return txt_Selected_weeklyad_Store_Details_Text.getCssValue(attribute);
	}

	//Get the text :  Selected_weeklyad_Store_Details_Text
	public String getText_txt_Selected_weeklyad_Store_Details_Text(){
		return txt_Selected_weeklyad_Store_Details_Text.getText();
	}

	//Get the value :  Selected_weeklyad_Store_Details_Text
	public String getValue_txt_Selected_weeklyad_Store_Details_Text(){
		return txt_Selected_weeklyad_Store_Details_Text.getAttribute("value");
	}
	// selected or Not :  Selected_weeklyad_Store_Details_Text
	public boolean isSelected_txt_Selected_weeklyad_Store_Details_Text(){
		if(txt_Selected_weeklyad_Store_Details_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  Store_View_weeklyAds_Button
	public void click_click_Store_View_weeklyAds_Button(){
		click_Store_View_weeklyAds_Button.click();
	}

	// Hover:  Store_View_weeklyAds_Button
	public void hover_click_Store_View_weeklyAds_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Store_View_weeklyAds_Button).build().perform();
	}

	// visible or Not :  Store_View_weeklyAds_Button
	public boolean isDisplayed_click_Store_View_weeklyAds_Button(){
		if(click_Store_View_weeklyAds_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Store_View_weeklyAds_Button
	public boolean isEnabled_click_Store_View_weeklyAds_Button(){
		if(click_Store_View_weeklyAds_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Store_View_weeklyAds_Button
	public String getCssValue_click_Store_View_weeklyAds_Button(String attribute) {
		return click_Store_View_weeklyAds_Button.getCssValue(attribute);
	}

	//Get the text :  Store_View_weeklyAds_Button
	public String getText_click_Store_View_weeklyAds_Button(){
		return click_Store_View_weeklyAds_Button.getText();
	}

	//Get the value :  Store_View_weeklyAds_Button
	public String getValue_click_Store_View_weeklyAds_Button(){
		return click_Store_View_weeklyAds_Button.getAttribute("value");
	}
	// selected or Not :  Store_View_weeklyAds_Button
	public boolean isSelected_click_Store_View_weeklyAds_Button(){
		if(click_Store_View_weeklyAds_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Verify_store_Address_Text
	public void click_click_Verify_store_Address_Text(){
		click_Verify_store_Address_Text.click();
	}

	// Hover:  Verify_store_Address_Text
	public void hover_click_Verify_store_Address_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Verify_store_Address_Text).build().perform();
	}

	// visible or Not :  Verify_store_Address_Text
	public boolean isDisplayed_click_Verify_store_Address_Text(){
		if(click_Verify_store_Address_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Verify_store_Address_Text
	public boolean isEnabled_click_Verify_store_Address_Text(){
		if(click_Verify_store_Address_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Verify_store_Address_Text
	public String getCssValue_click_Verify_store_Address_Text(String attribute) {
		return click_Verify_store_Address_Text.getCssValue(attribute);
	}

	//Get the text :  Verify_store_Address_Text
	public String getText_click_Verify_store_Address_Text(){
		return click_Verify_store_Address_Text.getText();
	}

	//Get the value :  Verify_store_Address_Text
	public String getValue_click_Verify_store_Address_Text(){
		return click_Verify_store_Address_Text.getAttribute("value");
	}
	// selected or Not :  Verify_store_Address_Text
	public boolean isSelected_click_Verify_store_Address_Text(){
		if(click_Verify_store_Address_Text.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Your_WeeklyAd_Text
	public void type_txt_Your_WeeklyAd_Text(String value) {
		txt_Your_WeeklyAd_Text.clear();
		txt_Your_WeeklyAd_Text.sendKeys(value);
	}

	//click:  Your_WeeklyAd_Text
	public void click_txt_Your_WeeklyAd_Text(){
		txt_Your_WeeklyAd_Text.click();
	}

	// Hover:  Your_WeeklyAd_Text
	public void hover_txt_Your_WeeklyAd_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Your_WeeklyAd_Text).build().perform();
	}

	// visible or Not :  Your_WeeklyAd_Text
	public boolean isDisplayed_txt_Your_WeeklyAd_Text(){
		if(txt_Your_WeeklyAd_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Your_WeeklyAd_Text
	public boolean isEnabled_txt_Your_WeeklyAd_Text(){
		if(txt_Your_WeeklyAd_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Your_WeeklyAd_Text
	public String getCssValue_txt_Your_WeeklyAd_Text(String attribute) {
		return txt_Your_WeeklyAd_Text.getCssValue(attribute);
	}

	//Get the text :  Your_WeeklyAd_Text
	public String getText_txt_Your_WeeklyAd_Text(){
		return txt_Your_WeeklyAd_Text.getText();
	}

	//Get the value :  Your_WeeklyAd_Text
	public String getValue_txt_Your_WeeklyAd_Text(){
		return txt_Your_WeeklyAd_Text.getAttribute("value");
	}
	// selected or Not :  Your_WeeklyAd_Text
	public boolean isSelected_txt_Your_WeeklyAd_Text(){
		if(txt_Your_WeeklyAd_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  View_weeklyAd_Link
	public void click_click_View_weeklyAd_Link(){
		click_View_weeklyAd_Link.click();
	}

	// Hover:  View_weeklyAd_Link
	public void hover_click_View_weeklyAd_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_View_weeklyAd_Link).build().perform();
	}

	// visible or Not :  View_weeklyAd_Link
	public boolean isDisplayed_click_View_weeklyAd_Link(){
		if(click_View_weeklyAd_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  View_weeklyAd_Link
	public boolean isEnabled_click_View_weeklyAd_Link(){
		if(click_View_weeklyAd_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  View_weeklyAd_Link
	public String getCssValue_click_View_weeklyAd_Link(String attribute) {
		return click_View_weeklyAd_Link.getCssValue(attribute);
	}

	//Get the text :  View_weeklyAd_Link
	public String getText_click_View_weeklyAd_Link(){
		return click_View_weeklyAd_Link.getText();
	}

	//Get the value :  View_weeklyAd_Link
	public String getValue_click_View_weeklyAd_Link(){
		return click_View_weeklyAd_Link.getAttribute("value");
	}
	// selected or Not :  View_weeklyAd_Link
	public boolean isSelected_click_View_weeklyAd_Link(){
		if(click_View_weeklyAd_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Product_Webelement_Text
	public void click_click_Product_Webelement_Text(){
		click_Product_Webelement_Text.click();
	}

	// Hover:  Product_Webelement_Text
	public void hover_click_Product_Webelement_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Product_Webelement_Text).build().perform();
	}

	// visible or Not :  Product_Webelement_Text
	public boolean isDisplayed_click_Product_Webelement_Text(){
		if(click_Product_Webelement_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Product_Webelement_Text
	public boolean isEnabled_click_Product_Webelement_Text(){
		if(click_Product_Webelement_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Product_Webelement_Text
	public String getCssValue_click_Product_Webelement_Text(String attribute) {
		return click_Product_Webelement_Text.getCssValue(attribute);
	}

	//Get the text :  Product_Webelement_Text
	public String getText_click_Product_Webelement_Text(){
		return click_Product_Webelement_Text.getText();
	}

	//Get the value :  Product_Webelement_Text
	public String getValue_click_Product_Webelement_Text(){
		return click_Product_Webelement_Text.getAttribute("value");
	}
	// selected or Not :  Product_Webelement_Text
	public boolean isSelected_click_Product_Webelement_Text(){
		if(click_Product_Webelement_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  Product_List_Text
	public void click_click_Product_List_Text(){
		((WebElement) click_Product_List_Text).click();
	}

	// Hover:  Product_List_Text
	public void hover_click_Product_List_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement((WebElement) click_Product_List_Text).build().perform();
	}

	// visible or Not :  Product_List_Text
	public boolean isDisplayed_click_Product_List_Text(){
		if(((WebElement) click_Product_List_Text).isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Product_List_Text
	public boolean isEnabled_click_Product_List_Text(){
		if(((WebElement) click_Product_List_Text).isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Product_List_Text
	public String getCssValue_click_Product_List_Text(String attribute) {
		return ((WebElement) click_Product_List_Text).getCssValue(attribute);
	}

	//Get the text :  Product_List_Text
	public String getText_click_Product_List_Text(){
		return ((WebElement) click_Product_List_Text).getText();
	}

	//Get the value :  Product_List_Text
	public String getValue_click_Product_List_Text(){
		return ((WebElement) click_Product_List_Text).getAttribute("value");
	}
	// selected or Not :  Product_List_Text
	public boolean isSelected_click_Product_List_Text(){
		if(((WebElement) click_Product_List_Text).isSelected()) { return true; } else { return false;} 
	}

	//click:  Product_view_Deals_Button
	public void click_click_Product_view_Deals_Button(){
		click_Product_view_Deals_Button.click();
	}

	// Hover:  Product_view_Deals_Button
	public void hover_click_Product_view_Deals_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Product_view_Deals_Button).build().perform();
	}

	// visible or Not :  Product_view_Deals_Button
	public boolean isDisplayed_click_Product_view_Deals_Button(){
		if(click_Product_view_Deals_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Product_view_Deals_Button
	public boolean isEnabled_click_Product_view_Deals_Button(){
		if(click_Product_view_Deals_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Product_view_Deals_Button
	public String getCssValue_click_Product_view_Deals_Button(String attribute) {
		return click_Product_view_Deals_Button.getCssValue(attribute);
	}

	//Get the text :  Product_view_Deals_Button
	public String getText_click_Product_view_Deals_Button(){
		return click_Product_view_Deals_Button.getText();
	}

	//Get the value :  Product_view_Deals_Button
	public String getValue_click_Product_view_Deals_Button(){
		return click_Product_view_Deals_Button.getAttribute("value");
	}
	// selected or Not :  Product_view_Deals_Button
	public boolean isSelected_click_Product_view_Deals_Button(){
		if(click_Product_view_Deals_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Product_AddToList_Button
	public void click_click_Product_AddToList_Button(){
		click_Product_AddToList_Button.click();
	}

	// Hover:  Product_AddToList_Button
	public void hover_click_Product_AddToList_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Product_AddToList_Button).build().perform();
	}

	// visible or Not :  Product_AddToList_Button
	public boolean isDisplayed_click_Product_AddToList_Button(){
		if(click_Product_AddToList_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Product_AddToList_Button
	public boolean isEnabled_click_Product_AddToList_Button(){
		if(click_Product_AddToList_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Product_AddToList_Button
	public String getCssValue_click_Product_AddToList_Button(String attribute) {
		return click_Product_AddToList_Button.getCssValue(attribute);
	}

	//Get the text :  Product_AddToList_Button
	public String getText_click_Product_AddToList_Button(){
		return click_Product_AddToList_Button.getText();
	}

	//Get the value :  Product_AddToList_Button
	public String getValue_click_Product_AddToList_Button(){
		return click_Product_AddToList_Button.getAttribute("value");
	}
	// selected or Not :  Product_AddToList_Button
	public boolean isSelected_click_Product_AddToList_Button(){
		if(click_Product_AddToList_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Product_RemoveFromList_Button
	public void click_click_Product_RemoveFromList_Button(){
		click_Product_RemoveFromList_Button.click();
	}

	// Hover:  Product_RemoveFromList_Button
	public void hover_click_Product_RemoveFromList_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Product_RemoveFromList_Button).build().perform();
	}

	// visible or Not :  Product_RemoveFromList_Button
	public boolean isDisplayed_click_Product_RemoveFromList_Button(){
		if(click_Product_RemoveFromList_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Product_RemoveFromList_Button
	public boolean isEnabled_click_Product_RemoveFromList_Button(){
		if(click_Product_RemoveFromList_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Product_RemoveFromList_Button
	public String getCssValue_click_Product_RemoveFromList_Button(String attribute) {
		return click_Product_RemoveFromList_Button.getCssValue(attribute);
	}

	//Get the text :  Product_RemoveFromList_Button
	public String getText_click_Product_RemoveFromList_Button(){
		return click_Product_RemoveFromList_Button.getText();
	}

	//Get the value :  Product_RemoveFromList_Button
	public String getValue_click_Product_RemoveFromList_Button(){
		return click_Product_RemoveFromList_Button.getAttribute("value");
	}
	// selected or Not :  Product_RemoveFromList_Button
	public boolean isSelected_click_Product_RemoveFromList_Button(){
		if(click_Product_RemoveFromList_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Product_AddToList_Overlay_Button
	public void click_click_Product_AddToList_Overlay_Button(){
		click_Product_AddToList_Overlay_Button.click();
	}

	// Hover:  Product_AddToList_Overlay_Button
	public void hover_click_Product_AddToList_Overlay_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Product_AddToList_Overlay_Button).build().perform();
	}

	// visible or Not :  Product_AddToList_Overlay_Button
	public boolean isDisplayed_click_Product_AddToList_Overlay_Button(){
		if(click_Product_AddToList_Overlay_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Product_AddToList_Overlay_Button
	public boolean isEnabled_click_Product_AddToList_Overlay_Button(){
		if(click_Product_AddToList_Overlay_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Product_AddToList_Overlay_Button
	public String getCssValue_click_Product_AddToList_Overlay_Button(String attribute) {
		return click_Product_AddToList_Overlay_Button.getCssValue(attribute);
	}

	//Get the text :  Product_AddToList_Overlay_Button
	public String getText_click_Product_AddToList_Overlay_Button(){
		return click_Product_AddToList_Overlay_Button.getText();
	}

	//Get the value :  Product_AddToList_Overlay_Button
	public String getValue_click_Product_AddToList_Overlay_Button(){
		return click_Product_AddToList_Overlay_Button.getAttribute("value");
	}
	// selected or Not :  Product_AddToList_Overlay_Button
	public boolean isSelected_click_Product_AddToList_Overlay_Button(){
		if(click_Product_AddToList_Overlay_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Product_RemoveFromList_Overlay_Button
	public void click_click_Product_RemoveFromList_Overlay_Button(){
		click_Product_RemoveFromList_Overlay_Button.click();
	}

	// Hover:  Product_RemoveFromList_Overlay_Button
	public void hover_click_Product_RemoveFromList_Overlay_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Product_RemoveFromList_Overlay_Button).build().perform();
	}

	// visible or Not :  Product_RemoveFromList_Overlay_Button
	public boolean isDisplayed_click_Product_RemoveFromList_Overlay_Button(){
		if(click_Product_RemoveFromList_Overlay_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Product_RemoveFromList_Overlay_Button
	public boolean isEnabled_click_Product_RemoveFromList_Overlay_Button(){
		if(click_Product_RemoveFromList_Overlay_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Product_RemoveFromList_Overlay_Button
	public String getCssValue_click_Product_RemoveFromList_Overlay_Button(String attribute) {
		return click_Product_RemoveFromList_Overlay_Button.getCssValue(attribute);
	}

	//Get the text :  Product_RemoveFromList_Overlay_Button
	public String getText_click_Product_RemoveFromList_Overlay_Button(){
		return click_Product_RemoveFromList_Overlay_Button.getText();
	}

	//Get the value :  Product_RemoveFromList_Overlay_Button
	public String getValue_click_Product_RemoveFromList_Overlay_Button(){
		return click_Product_RemoveFromList_Overlay_Button.getAttribute("value");
	}
	// selected or Not :  Product_RemoveFromList_Overlay_Button
	public boolean isSelected_click_Product_RemoveFromList_Overlay_Button(){
		if(click_Product_RemoveFromList_Overlay_Button.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Product_Summary_Text
	public void type_txt_Product_Summary_Text(String value) {
		txt_Product_Summary_Text.clear();
		txt_Product_Summary_Text.sendKeys(value);
	}

	//click:  Product_Summary_Text
	public void click_txt_Product_Summary_Text(){
		txt_Product_Summary_Text.click();
	}

	// Hover:  Product_Summary_Text
	public void hover_txt_Product_Summary_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Product_Summary_Text).build().perform();
	}

	// visible or Not :  Product_Summary_Text
	public boolean isDisplayed_txt_Product_Summary_Text(){
		if(txt_Product_Summary_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Product_Summary_Text
	public boolean isEnabled_txt_Product_Summary_Text(){
		if(txt_Product_Summary_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Product_Summary_Text
	public String getCssValue_txt_Product_Summary_Text(String attribute) {
		return txt_Product_Summary_Text.getCssValue(attribute);
	}

	//Get the text :  Product_Summary_Text
	public String getText_txt_Product_Summary_Text(){
		return txt_Product_Summary_Text.getText();
	}

	//Get the value :  Product_Summary_Text
	public String getValue_txt_Product_Summary_Text(){
		return txt_Product_Summary_Text.getAttribute("value");
	}
	// selected or Not :  Product_Summary_Text
	public boolean isSelected_txt_Product_Summary_Text(){
		if(txt_Product_Summary_Text.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Product_Price_Text
	public void type_txt_Product_Price_Text(String value) {
		txt_Product_Price_Text.clear();
		txt_Product_Price_Text.sendKeys(value);
	}

	//click:  Product_Price_Text
	public void click_txt_Product_Price_Text(){
		txt_Product_Price_Text.click();
	}

	// Hover:  Product_Price_Text
	public void hover_txt_Product_Price_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Product_Price_Text).build().perform();
	}

	// visible or Not :  Product_Price_Text
	public boolean isDisplayed_txt_Product_Price_Text(){
		if(txt_Product_Price_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Product_Price_Text
	public boolean isEnabled_txt_Product_Price_Text(){
		if(txt_Product_Price_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Product_Price_Text
	public String getCssValue_txt_Product_Price_Text(String attribute) {
		return txt_Product_Price_Text.getCssValue(attribute);
	}

	//Get the text :  Product_Price_Text
	public String getText_txt_Product_Price_Text(){
		return txt_Product_Price_Text.getText();
	}

	//Get the value :  Product_Price_Text
	public String getValue_txt_Product_Price_Text(){
		return txt_Product_Price_Text.getAttribute("value");
	}
	// selected or Not :  Product_Price_Text
	public boolean isSelected_txt_Product_Price_Text(){
		if(txt_Product_Price_Text.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Product_Description_Text
	public void type_txt_Product_Description_Text(String value) {
		txt_Product_Description_Text.clear();
		txt_Product_Description_Text.sendKeys(value);
	}

	//click:  Product_Description_Text
	public void click_txt_Product_Description_Text(){
		txt_Product_Description_Text.click();
	}

	// Hover:  Product_Description_Text
	public void hover_txt_Product_Description_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Product_Description_Text).build().perform();
	}

	// visible or Not :  Product_Description_Text
	public boolean isDisplayed_txt_Product_Description_Text(){
		if(txt_Product_Description_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Product_Description_Text
	public boolean isEnabled_txt_Product_Description_Text(){
		if(txt_Product_Description_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Product_Description_Text
	public String getCssValue_txt_Product_Description_Text(String attribute) {
		return txt_Product_Description_Text.getCssValue(attribute);
	}

	//Get the text :  Product_Description_Text
	public String getText_txt_Product_Description_Text(){
		return txt_Product_Description_Text.getText();
	}

	//Get the value :  Product_Description_Text
	public String getValue_txt_Product_Description_Text(){
		return txt_Product_Description_Text.getAttribute("value");
	}
	// selected or Not :  Product_Description_Text
	public boolean isSelected_txt_Product_Description_Text(){
		if(txt_Product_Description_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  Product_Overlay_Close_Button
	public void click_click_Product_Overlay_Close_Button(){
		click_Product_Overlay_Close_Button.click();
	}

	// Hover:  Product_Overlay_Close_Button
	public void hover_click_Product_Overlay_Close_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Product_Overlay_Close_Button).build().perform();
	}

	// visible or Not :  Product_Overlay_Close_Button
	public boolean isDisplayed_click_Product_Overlay_Close_Button(){
		if(click_Product_Overlay_Close_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Product_Overlay_Close_Button
	public boolean isEnabled_click_Product_Overlay_Close_Button(){
		if(click_Product_Overlay_Close_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Product_Overlay_Close_Button
	public String getCssValue_click_Product_Overlay_Close_Button(String attribute) {
		return click_Product_Overlay_Close_Button.getCssValue(attribute);
	}

	//Get the text :  Product_Overlay_Close_Button
	public String getText_click_Product_Overlay_Close_Button(){
		return click_Product_Overlay_Close_Button.getText();
	}

	//Get the value :  Product_Overlay_Close_Button
	public String getValue_click_Product_Overlay_Close_Button(){
		return click_Product_Overlay_Close_Button.getAttribute("value");
	}
	// selected or Not :  Product_Overlay_Close_Button
	public boolean isSelected_click_Product_Overlay_Close_Button(){
		if(click_Product_Overlay_Close_Button.isSelected()) { return true; } else { return false;} 
	}

}
