//******************************
package  generatedClass;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_ShoppingListPage { 
	WebDriver driver;
	public POM_Generated_ShoppingListPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : List_Count_Text
	@FindBy(xpath = "//div[@class='itemCount']")
	public WebElement txt_List_Count_Text;
	
	// Associated Label : List_icon_Button
	@FindBy(xpath = "//button[@class='mod mod-shoppinglist-sidebar-nav icon-my-shopping-list']")
	public WebElement click_List_icon_Button;
	
	// Associated Label : Total_Products_Text
	@FindBy(xpath = "//div[@class='media-body']")
	public List<WebElement> txt_Total_Products_Text;
	
	// Associated Label : Product_Summary_Text
	@FindBy(xpath = "//p[@class='pod_summary']")
	public List<WebElement> txt_Product_Summary_Text;
	
	// Associated Label : Product_Description_Text
	@FindBy(xpath = "//p[@class='pod_description']")
	public List<WebElement> txt_Product_Description_Text;
	
	// Associated Label : Product_Price_Text
	@FindBy(xpath = "//p[@class='pod_offer-price']")
	public List<WebElement> txt_Product_Price_Text;
	
	// Associated Label : Close_Button
	@FindBy(xpath = "//span[@class='close-icon']")
	public WebElement click_Close_Button;
	
	// Associated Label : Weekly_Ad_Items_Checkbox
	@FindBy(id = "store-specials")
	public WebElement click_Weekly_Ad_Items_Checkbox;
	
	// Associated Label : Coupons_Checkbox
	@FindBy(id = "coupons")
	public WebElement click_Coupons_Checkbox;
	
	// Associated Label : My_Items_Checkbox
	@FindBy(id = "my-items")
	public WebElement click_My_Items_Checkbox;
	
	// Associated Label : ADD_An_Item_Text_Field
	@FindBy(id = "addListItem")
	public WebElement txt_ADD_An_Item_Text_Field;
	
	// Associated Label : ADD_An_Item_Icon
	@FindBy(xpath = "//button[@aria-label='Add an item to the list']")
	public WebElement click_ADD_An_Item_Icon;
	
	// Associated Label : Select_Items_CheckBox
	@FindBy(xpath = "//input[@name='itemchecked']")
	public List<WebElement> click_Select_Items_CheckBox;
	
	// Associated Label : Remove_All_Checked_Items_Button
	@FindBy(id = "removeBtnSpan")
	public WebElement click_Remove_All_Checked_Items_Button;
	
	// Associated Label : Login_To_saveList_Button
	@FindBy(id = "shoppinglist-login-event")
	public WebElement click_Login_To_saveList_Button;
	
	// Associated Label : Print_List_Button
	@FindBy(xpath = "//p[text()='print list']")
	public WebElement click_Print_List_Button;
	
	// Associated Label : Email_List_Button
	@FindBy(xpath = "//p[text()='email list']")
	public WebElement click_Email_List_Button;
	
	// Associated Label : Weekly_Ad_Items_check_Delete_Icon
	@FindBy(xpath = "//div[@class='listItem offer ui-sortable-handle']//div[@aria-label='Delete this item']")
	public List<WebElement> click_Weekly_Ad_Items_check_Delete_Icon;
	

//*******************************************************************************


	// Element Actions


	// Type:  List_Count_Text
	public void type_txt_List_Count_Text(String value) {
		txt_List_Count_Text.clear();
		txt_List_Count_Text.sendKeys(value);
	}

	//click:  List_Count_Text
	public void click_txt_List_Count_Text(){
		txt_List_Count_Text.click();
	}

	// Hover:  List_Count_Text
	public void hover_txt_List_Count_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_List_Count_Text).build().perform();
	}

	// visible or Not :  List_Count_Text
	public boolean isDisplayed_txt_List_Count_Text(){
		if(txt_List_Count_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  List_Count_Text
	public boolean isEnabled_txt_List_Count_Text(){
		if(txt_List_Count_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  List_Count_Text
	public String getCssValue_txt_List_Count_Text(String attribute) {
		return txt_List_Count_Text.getCssValue(attribute);
	}

	//Get the text :  List_Count_Text
	public String getText_txt_List_Count_Text(){
		return txt_List_Count_Text.getText();
	}

	//Get the value :  List_Count_Text
	public String getValue_txt_List_Count_Text(){
		return txt_List_Count_Text.getAttribute("value");
	}
	// selected or Not :  List_Count_Text
	public boolean isSelected_txt_List_Count_Text(){
		if(txt_List_Count_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  List_icon_Button
	public void click_click_List_icon_Button(){
		click_List_icon_Button.click();
	}

	// Hover:  List_icon_Button
	public void hover_click_List_icon_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_List_icon_Button).build().perform();
	}

	// visible or Not :  List_icon_Button
	public boolean isDisplayed_click_List_icon_Button(){
		if(click_List_icon_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  List_icon_Button
	public boolean isEnabled_click_List_icon_Button(){
		if(click_List_icon_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  List_icon_Button
	public String getCssValue_click_List_icon_Button(String attribute) {
		return click_List_icon_Button.getCssValue(attribute);
	}

	//Get the text :  List_icon_Button
	public String getText_click_List_icon_Button(){
		return click_List_icon_Button.getText();
	}

	//Get the value :  List_icon_Button
	public String getValue_click_List_icon_Button(){
		return click_List_icon_Button.getAttribute("value");
	}
	// selected or Not :  List_icon_Button
	public boolean isSelected_click_List_icon_Button(){
		if(click_List_icon_Button.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Total_Products_Text
	public void type_txt_Total_Products_Text(String value) {
		txt_Total_Products_Text.clear();
		((WebElement) txt_Total_Products_Text).sendKeys(value);
	}

	//click:  Total_Products_Text
	public void click_txt_Total_Products_Text(){
		((WebElement) txt_Total_Products_Text).click();
	}

	// Hover:  Total_Products_Text
	public void hover_txt_Total_Products_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement((WebElement) txt_Total_Products_Text).build().perform();
	}

	// visible or Not :  Total_Products_Text
	public boolean isDisplayed_txt_Total_Products_Text(){
		if(((WebElement) txt_Total_Products_Text).isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Total_Products_Text
	public boolean isEnabled_txt_Total_Products_Text(){
		if(((WebElement) txt_Total_Products_Text).isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Total_Products_Text
	public String getCssValue_txt_Total_Products_Text(String attribute) {
		return ((WebElement) txt_Total_Products_Text).getCssValue(attribute);
	}

	//Get the text :  Total_Products_Text
	public String getText_txt_Total_Products_Text(){
		return ((WebElement) txt_Total_Products_Text).getText();
	}

	//Get the value :  Total_Products_Text
	public String getValue_txt_Total_Products_Text(){
		return ((WebElement) txt_Total_Products_Text).getAttribute("value");
	}
	// selected or Not :  Total_Products_Text
	public boolean isSelected_txt_Total_Products_Text(){
		if(((WebElement) txt_Total_Products_Text).isSelected()) { return true; } else { return false;} 
	}

	// Type:  Product_Summary_Text
	public void type_txt_Product_Summary_Text(String value) {
		txt_Product_Summary_Text.clear();
		((WebElement) txt_Product_Summary_Text).sendKeys(value);
	}

	//click:  Product_Summary_Text
	public void click_txt_Product_Summary_Text(){
		((WebElement) txt_Product_Summary_Text).click();
	}

	// Hover:  Product_Summary_Text
	public void hover_txt_Product_Summary_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement((WebElement) txt_Product_Summary_Text).build().perform();
	}

	// visible or Not :  Product_Summary_Text
	public boolean isDisplayed_txt_Product_Summary_Text(){
		if(((WebElement) txt_Product_Summary_Text).isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Product_Summary_Text
	public boolean isEnabled_txt_Product_Summary_Text(){
		if(((WebElement) txt_Product_Summary_Text).isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Product_Summary_Text
	public String getCssValue_txt_Product_Summary_Text(String attribute) {
		return ((WebElement) txt_Product_Summary_Text).getCssValue(attribute);
	}

	//Get the text :  Product_Summary_Text
	public String getText_txt_Product_Summary_Text(){
		return ((WebElement) txt_Product_Summary_Text).getText();
	}

	//Get the value :  Product_Summary_Text
	public String getValue_txt_Product_Summary_Text(){
		return ((WebElement) txt_Product_Summary_Text).getAttribute("value");
	}
	// selected or Not :  Product_Summary_Text
	public boolean isSelected_txt_Product_Summary_Text(){
		if(((WebElement) txt_Product_Summary_Text).isSelected()) { return true; } else { return false;} 
	}

	// Type:  Product_Description_Text
	public void type_txt_Product_Description_Text(String value) {
		txt_Product_Description_Text.clear();
		((WebElement) txt_Product_Description_Text).sendKeys(value);
	}

	//click:  Product_Description_Text
	public void click_txt_Product_Description_Text(){
		((WebElement) txt_Product_Description_Text).click();
	}

	// Hover:  Product_Description_Text
	public void hover_txt_Product_Description_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement((WebElement) txt_Product_Description_Text).build().perform();
	}

	// visible or Not :  Product_Description_Text
	public boolean isDisplayed_txt_Product_Description_Text(){
		if(((WebElement) txt_Product_Description_Text).isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Product_Description_Text
	public boolean isEnabled_txt_Product_Description_Text(){
		if(((WebElement) txt_Product_Description_Text).isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Product_Description_Text
	public String getCssValue_txt_Product_Description_Text(String attribute) {
		return ((WebElement) txt_Product_Description_Text).getCssValue(attribute);
	}

	//Get the text :  Product_Description_Text
	public String getText_txt_Product_Description_Text(){
		return ((WebElement) txt_Product_Description_Text).getText();
	}

	//Get the value :  Product_Description_Text
	public String getValue_txt_Product_Description_Text(){
		return ((WebElement) txt_Product_Description_Text).getAttribute("value");
	}
	// selected or Not :  Product_Description_Text
	public boolean isSelected_txt_Product_Description_Text(){
		if(((WebElement) txt_Product_Description_Text).isSelected()) { return true; } else { return false;} 
	}

	// Type:  Product_Price_Text
	public void type_txt_Product_Price_Text(String value) {
		txt_Product_Price_Text.clear();
		((WebElement) txt_Product_Price_Text).sendKeys(value);
	}

	//click:  Product_Price_Text
	public void click_txt_Product_Price_Text(){
		((WebElement) txt_Product_Price_Text).click();
	}

	// Hover:  Product_Price_Text
	public void hover_txt_Product_Price_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement((WebElement) txt_Product_Price_Text).build().perform();
	}

	// visible or Not :  Product_Price_Text
	public boolean isDisplayed_txt_Product_Price_Text(){
		if(((WebElement) txt_Product_Price_Text).isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Product_Price_Text
	public boolean isEnabled_txt_Product_Price_Text(){
		if(((WebElement) txt_Product_Price_Text).isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Product_Price_Text
	public String getCssValue_txt_Product_Price_Text(String attribute) {
		return ((WebElement) txt_Product_Price_Text).getCssValue(attribute);
	}

	//Get the text :  Product_Price_Text
	public String getText_txt_Product_Price_Text(){
		return ((WebElement) txt_Product_Price_Text).getText();
	}

	//Get the value :  Product_Price_Text
	public String getValue_txt_Product_Price_Text(){
		return ((WebElement) txt_Product_Price_Text).getAttribute("value");
	}
	// selected or Not :  Product_Price_Text
	public boolean isSelected_txt_Product_Price_Text(){
		if(((WebElement) txt_Product_Price_Text).isSelected()) { return true; } else { return false;} 
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

	//click:  Weekly_Ad_Items_Checkbox
	public void click_click_Weekly_Ad_Items_Checkbox(){
		click_Weekly_Ad_Items_Checkbox.click();
	}

	// Hover:  Weekly_Ad_Items_Checkbox
	public void hover_click_Weekly_Ad_Items_Checkbox(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Weekly_Ad_Items_Checkbox).build().perform();
	}

	// visible or Not :  Weekly_Ad_Items_Checkbox
	public boolean isDisplayed_click_Weekly_Ad_Items_Checkbox(){
		if(click_Weekly_Ad_Items_Checkbox.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Weekly_Ad_Items_Checkbox
	public boolean isEnabled_click_Weekly_Ad_Items_Checkbox(){
		if(click_Weekly_Ad_Items_Checkbox.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Weekly_Ad_Items_Checkbox
	public String getCssValue_click_Weekly_Ad_Items_Checkbox(String attribute) {
		return click_Weekly_Ad_Items_Checkbox.getCssValue(attribute);
	}

	//Get the text :  Weekly_Ad_Items_Checkbox
	public String getText_click_Weekly_Ad_Items_Checkbox(){
		return click_Weekly_Ad_Items_Checkbox.getText();
	}

	//Get the value :  Weekly_Ad_Items_Checkbox
	public String getValue_click_Weekly_Ad_Items_Checkbox(){
		return click_Weekly_Ad_Items_Checkbox.getAttribute("value");
	}
	// selected or Not :  Weekly_Ad_Items_Checkbox
	public boolean isSelected_click_Weekly_Ad_Items_Checkbox(){
		if(click_Weekly_Ad_Items_Checkbox.isSelected()) { return true; } else { return false;} 
	}

	//click:  Coupons_Checkbox
	public void click_click_Coupons_Checkbox(){
		click_Coupons_Checkbox.click();
	}

	// Hover:  Coupons_Checkbox
	public void hover_click_Coupons_Checkbox(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Coupons_Checkbox).build().perform();
	}

	// visible or Not :  Coupons_Checkbox
	public boolean isDisplayed_click_Coupons_Checkbox(){
		if(click_Coupons_Checkbox.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Coupons_Checkbox
	public boolean isEnabled_click_Coupons_Checkbox(){
		if(click_Coupons_Checkbox.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Coupons_Checkbox
	public String getCssValue_click_Coupons_Checkbox(String attribute) {
		return click_Coupons_Checkbox.getCssValue(attribute);
	}

	//Get the text :  Coupons_Checkbox
	public String getText_click_Coupons_Checkbox(){
		return click_Coupons_Checkbox.getText();
	}

	//Get the value :  Coupons_Checkbox
	public String getValue_click_Coupons_Checkbox(){
		return click_Coupons_Checkbox.getAttribute("value");
	}
	// selected or Not :  Coupons_Checkbox
	public boolean isSelected_click_Coupons_Checkbox(){
		if(click_Coupons_Checkbox.isSelected()) { return true; } else { return false;} 
	}

	//click:  My_Items_Checkbox
	public void click_click_My_Items_Checkbox(){
		click_My_Items_Checkbox.click();
	}

	// Hover:  My_Items_Checkbox
	public void hover_click_My_Items_Checkbox(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_My_Items_Checkbox).build().perform();
	}

	// visible or Not :  My_Items_Checkbox
	public boolean isDisplayed_click_My_Items_Checkbox(){
		if(click_My_Items_Checkbox.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  My_Items_Checkbox
	public boolean isEnabled_click_My_Items_Checkbox(){
		if(click_My_Items_Checkbox.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  My_Items_Checkbox
	public String getCssValue_click_My_Items_Checkbox(String attribute) {
		return click_My_Items_Checkbox.getCssValue(attribute);
	}

	//Get the text :  My_Items_Checkbox
	public String getText_click_My_Items_Checkbox(){
		return click_My_Items_Checkbox.getText();
	}

	//Get the value :  My_Items_Checkbox
	public String getValue_click_My_Items_Checkbox(){
		return click_My_Items_Checkbox.getAttribute("value");
	}
	// selected or Not :  My_Items_Checkbox
	public boolean isSelected_click_My_Items_Checkbox(){
		if(click_My_Items_Checkbox.isSelected()) { return true; } else { return false;} 
	}

	// Type:  ADD_An_Item_Text_Field
	public void type_txt_ADD_An_Item_Text_Field(String value) {
		txt_ADD_An_Item_Text_Field.clear();
		txt_ADD_An_Item_Text_Field.sendKeys(value);
	}

	//click:  ADD_An_Item_Text_Field
	public void click_txt_ADD_An_Item_Text_Field(){
		txt_ADD_An_Item_Text_Field.click();
	}

	// Hover:  ADD_An_Item_Text_Field
	public void hover_txt_ADD_An_Item_Text_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_ADD_An_Item_Text_Field).build().perform();
	}

	// visible or Not :  ADD_An_Item_Text_Field
	public boolean isDisplayed_txt_ADD_An_Item_Text_Field(){
		if(txt_ADD_An_Item_Text_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  ADD_An_Item_Text_Field
	public boolean isEnabled_txt_ADD_An_Item_Text_Field(){
		if(txt_ADD_An_Item_Text_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  ADD_An_Item_Text_Field
	public String getCssValue_txt_ADD_An_Item_Text_Field(String attribute) {
		return txt_ADD_An_Item_Text_Field.getCssValue(attribute);
	}

	//Get the text :  ADD_An_Item_Text_Field
	public String getText_txt_ADD_An_Item_Text_Field(){
		return txt_ADD_An_Item_Text_Field.getText();
	}

	//Get the value :  ADD_An_Item_Text_Field
	public String getValue_txt_ADD_An_Item_Text_Field(){
		return txt_ADD_An_Item_Text_Field.getAttribute("value");
	}
	// selected or Not :  ADD_An_Item_Text_Field
	public boolean isSelected_txt_ADD_An_Item_Text_Field(){
		if(txt_ADD_An_Item_Text_Field.isSelected()) { return true; } else { return false;} 
	}

	//click:  ADD_An_Item_Icon
	public void click_click_ADD_An_Item_Icon(){
		click_ADD_An_Item_Icon.click();
	}

	// Hover:  ADD_An_Item_Icon
	public void hover_click_ADD_An_Item_Icon(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_ADD_An_Item_Icon).build().perform();
	}

	// visible or Not :  ADD_An_Item_Icon
	public boolean isDisplayed_click_ADD_An_Item_Icon(){
		if(click_ADD_An_Item_Icon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  ADD_An_Item_Icon
	public boolean isEnabled_click_ADD_An_Item_Icon(){
		if(click_ADD_An_Item_Icon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  ADD_An_Item_Icon
	public String getCssValue_click_ADD_An_Item_Icon(String attribute) {
		return click_ADD_An_Item_Icon.getCssValue(attribute);
	}

	//Get the text :  ADD_An_Item_Icon
	public String getText_click_ADD_An_Item_Icon(){
		return click_ADD_An_Item_Icon.getText();
	}

	//Get the value :  ADD_An_Item_Icon
	public String getValue_click_ADD_An_Item_Icon(){
		return click_ADD_An_Item_Icon.getAttribute("value");
	}
	// selected or Not :  ADD_An_Item_Icon
	public boolean isSelected_click_ADD_An_Item_Icon(){
		if(click_ADD_An_Item_Icon.isSelected()) { return true; } else { return false;} 
	}

	//click:  Select_Items_CheckBox
	public void click_click_Select_Items_CheckBox(){
		((WebElement) click_Select_Items_CheckBox).click();
	}

	// Hover:  Select_Items_CheckBox
	public void hover_click_Select_Items_CheckBox(){
		Actions action=new Actions(driver); 
		action.moveToElement((WebElement) click_Select_Items_CheckBox).build().perform();
	}

	// visible or Not :  Select_Items_CheckBox
	public boolean isDisplayed_click_Select_Items_CheckBox(){
		if(((WebElement) click_Select_Items_CheckBox).isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Select_Items_CheckBox
	public boolean isEnabled_click_Select_Items_CheckBox(){
		if(((WebElement) click_Select_Items_CheckBox).isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Select_Items_CheckBox
	public String getCssValue_click_Select_Items_CheckBox(String attribute) {
		return ((WebElement) click_Select_Items_CheckBox).getCssValue(attribute);
	}

	//Get the text :  Select_Items_CheckBox
	public String getText_click_Select_Items_CheckBox(){
		return ((WebElement) click_Select_Items_CheckBox).getText();
	}

	//Get the value :  Select_Items_CheckBox
	public String getValue_click_Select_Items_CheckBox(){
		return ((WebElement) click_Select_Items_CheckBox).getAttribute("value");
	}
	// selected or Not :  Select_Items_CheckBox
	public boolean isSelected_click_Select_Items_CheckBox(){
		if(((WebElement) click_Select_Items_CheckBox).isSelected()) { return true; } else { return false;} 
	}

	//click:  Remove_All_Checked_Items_Button
	public void click_click_Remove_All_Checked_Items_Button(){
		click_Remove_All_Checked_Items_Button.click();
	}

	// Hover:  Remove_All_Checked_Items_Button
	public void hover_click_Remove_All_Checked_Items_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Remove_All_Checked_Items_Button).build().perform();
	}

	// visible or Not :  Remove_All_Checked_Items_Button
	public boolean isDisplayed_click_Remove_All_Checked_Items_Button(){
		if(click_Remove_All_Checked_Items_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Remove_All_Checked_Items_Button
	public boolean isEnabled_click_Remove_All_Checked_Items_Button(){
		if(click_Remove_All_Checked_Items_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Remove_All_Checked_Items_Button
	public String getCssValue_click_Remove_All_Checked_Items_Button(String attribute) {
		return click_Remove_All_Checked_Items_Button.getCssValue(attribute);
	}

	//Get the text :  Remove_All_Checked_Items_Button
	public String getText_click_Remove_All_Checked_Items_Button(){
		return click_Remove_All_Checked_Items_Button.getText();
	}

	//Get the value :  Remove_All_Checked_Items_Button
	public String getValue_click_Remove_All_Checked_Items_Button(){
		return click_Remove_All_Checked_Items_Button.getAttribute("value");
	}
	// selected or Not :  Remove_All_Checked_Items_Button
	public boolean isSelected_click_Remove_All_Checked_Items_Button(){
		if(click_Remove_All_Checked_Items_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Login_To_saveList_Button
	public void click_click_Login_To_saveList_Button(){
		click_Login_To_saveList_Button.click();
	}

	// Hover:  Login_To_saveList_Button
	public void hover_click_Login_To_saveList_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Login_To_saveList_Button).build().perform();
	}

	// visible or Not :  Login_To_saveList_Button
	public boolean isDisplayed_click_Login_To_saveList_Button(){
		if(click_Login_To_saveList_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Login_To_saveList_Button
	public boolean isEnabled_click_Login_To_saveList_Button(){
		if(click_Login_To_saveList_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Login_To_saveList_Button
	public String getCssValue_click_Login_To_saveList_Button(String attribute) {
		return click_Login_To_saveList_Button.getCssValue(attribute);
	}

	//Get the text :  Login_To_saveList_Button
	public String getText_click_Login_To_saveList_Button(){
		return click_Login_To_saveList_Button.getText();
	}

	//Get the value :  Login_To_saveList_Button
	public String getValue_click_Login_To_saveList_Button(){
		return click_Login_To_saveList_Button.getAttribute("value");
	}
	// selected or Not :  Login_To_saveList_Button
	public boolean isSelected_click_Login_To_saveList_Button(){
		if(click_Login_To_saveList_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Print_List_Button
	public void click_click_Print_List_Button(){
		click_Print_List_Button.click();
	}

	// Hover:  Print_List_Button
	public void hover_click_Print_List_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Print_List_Button).build().perform();
	}

	// visible or Not :  Print_List_Button
	public boolean isDisplayed_click_Print_List_Button(){
		if(click_Print_List_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Print_List_Button
	public boolean isEnabled_click_Print_List_Button(){
		if(click_Print_List_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Print_List_Button
	public String getCssValue_click_Print_List_Button(String attribute) {
		return click_Print_List_Button.getCssValue(attribute);
	}

	//Get the text :  Print_List_Button
	public String getText_click_Print_List_Button(){
		return click_Print_List_Button.getText();
	}

	//Get the value :  Print_List_Button
	public String getValue_click_Print_List_Button(){
		return click_Print_List_Button.getAttribute("value");
	}
	// selected or Not :  Print_List_Button
	public boolean isSelected_click_Print_List_Button(){
		if(click_Print_List_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Email_List_Button
	public void click_click_Email_List_Button(){
		click_Email_List_Button.click();
	}

	// Hover:  Email_List_Button
	public void hover_click_Email_List_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Email_List_Button).build().perform();
	}

	// visible or Not :  Email_List_Button
	public boolean isDisplayed_click_Email_List_Button(){
		if(click_Email_List_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Email_List_Button
	public boolean isEnabled_click_Email_List_Button(){
		if(click_Email_List_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Email_List_Button
	public String getCssValue_click_Email_List_Button(String attribute) {
		return click_Email_List_Button.getCssValue(attribute);
	}

	//Get the text :  Email_List_Button
	public String getText_click_Email_List_Button(){
		return click_Email_List_Button.getText();
	}

	//Get the value :  Email_List_Button
	public String getValue_click_Email_List_Button(){
		return click_Email_List_Button.getAttribute("value");
	}
	// selected or Not :  Email_List_Button
	public boolean isSelected_click_Email_List_Button(){
		if(click_Email_List_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Weekly_Ad_Items_check_Delete_Icon
	public void click_click_Weekly_Ad_Items_check_Delete_Icon(){
		((WebElement) click_Weekly_Ad_Items_check_Delete_Icon).click();
	}

	// Hover:  Weekly_Ad_Items_check_Delete_Icon
	public void hover_click_Weekly_Ad_Items_check_Delete_Icon(){
		Actions action=new Actions(driver); 
		action.moveToElement((WebElement) click_Weekly_Ad_Items_check_Delete_Icon).build().perform();
	}

	// visible or Not :  Weekly_Ad_Items_check_Delete_Icon
	public boolean isDisplayed_click_Weekly_Ad_Items_check_Delete_Icon(){
		if(((WebElement) click_Weekly_Ad_Items_check_Delete_Icon).isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Weekly_Ad_Items_check_Delete_Icon
	public boolean isEnabled_click_Weekly_Ad_Items_check_Delete_Icon(){
		if(((WebElement) click_Weekly_Ad_Items_check_Delete_Icon).isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Weekly_Ad_Items_check_Delete_Icon
	public String getCssValue_click_Weekly_Ad_Items_check_Delete_Icon(String attribute) {
		return ((WebElement) click_Weekly_Ad_Items_check_Delete_Icon).getCssValue(attribute);
	}

	//Get the text :  Weekly_Ad_Items_check_Delete_Icon
	public String getText_click_Weekly_Ad_Items_check_Delete_Icon(){
		return ((WebElement) click_Weekly_Ad_Items_check_Delete_Icon).getText();
	}

	//Get the value :  Weekly_Ad_Items_check_Delete_Icon
	public String getValue_click_Weekly_Ad_Items_check_Delete_Icon(){
		return ((WebElement) click_Weekly_Ad_Items_check_Delete_Icon).getAttribute("value");
	}
	// selected or Not :  Weekly_Ad_Items_check_Delete_Icon
	public boolean isSelected_click_Weekly_Ad_Items_check_Delete_Icon(){
		if(((WebElement) click_Weekly_Ad_Items_check_Delete_Icon).isSelected()) { return true; } else { return false;} 
	}

}
