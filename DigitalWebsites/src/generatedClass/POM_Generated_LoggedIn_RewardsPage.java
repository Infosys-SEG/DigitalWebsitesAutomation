//******************************
package  generatedClass;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_LoggedIn_RewardsPage { 
	WebDriver driver;
	public POM_Generated_LoggedIn_RewardsPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : Title_Text
	@FindBy(xpath = "//h1[text()='My Rewards ']")
	public WebElement txt_Title_Text;
	
	// Associated Label : Points_Text
	@FindBy(xpath = "//div[@class='total-points col-md-12 col-sm-12 col-xs-12 p-0 text-center']")
	public WebElement txt_Points_Text;
	
	// Associated Label : Time_Text
	@FindBy(xpath = "//div[contains(text(),'As of ')]")
	public WebElement click_Time_Text;
	
	// Associated Label : Available_savings_1_Text
	@FindBy(xpath = "//div[contains(text(),'Available savings at checkout ')]")
	public WebElement click_Available_savings_1_Text;
	
	// Associated Label : Off_Total_2_Text
	@FindBy(xpath = "//div[contains(text(),'off your total ')]")
	public WebElement click_Off_Total_2_Text;
	
	// Associated Label : All_SE_Grocers_3_Text
	@FindBy(xpath = "//div[contains(text(),'All SE Grocers rewards points earned in')]")
	public WebElement click_All_SE_Grocers_3_Text;
	
	// Associated Label : Available_Savings_Pump_4_Text
	@FindBy(xpath = "//div[contains(text(),'Available savings at the pump ')]")
	public WebElement click_Available_Savings_Pump_4_Text;
	
	// Associated Label : Off_Per_Gallon_5_Text
	@FindBy(xpath = "//div[contains(text(),'off per gallon ')]")
	public WebElement click_Off_Per_Gallon_5_Text;
	
	// Associated Label : FRN_Rewards_6_Text
	@FindBy(xpath = "//div[contains(text(),'FRN Rewards expiring on ')]")
	public WebElement click_FRN_Rewards_6_Text;
	
	// Associated Label : Gold_Status_7_Text
	@FindBy(xpath = "//div[@class='status-con']")
	public WebElement click_Gold_Status_7_Text;
	
	// Associated Label : Recent_Transactions_8_Text
	@FindBy(xpath = "//div[text()='Recent transactions ']")
	public WebElement click_Recent_Transactions_8_Text;
	
	// Associated Label : Usefullink_EditAccount_Link
	@FindBy(xpath = "//a[text()='Edit account details ']")
	public WebElement txt_Usefullink_EditAccount_Link;
	
	// Associated Label : Usefullink_ViewPersonalizedAd_Link
	@FindBy(xpath = "//a[text()='View personalized ads ']")
	public WebElement txt_Usefullink_ViewPersonalizedAd_Link;
	
	// Associated Label : Usefullink_FAQ_Link
	@FindBy(xpath = "//a[text()='Frequently asked questions']")
	public WebElement txt_Usefullink_FAQ_Link;
	
	// Associated Label : Usefullink_FuelRewards_Link
	@FindBy(xpath = "//a[text()='Fuel Rewards']")
	public WebElement txt_Usefullink_FuelRewards_Link;
	
	// Associated Label : Usefullink_FindFuel_Link
	@FindBy(xpath = "//a[text()='Find fuel near you ']")
	public WebElement txt_Usefullink_FindFuel_Link;
	
	// Associated Label : MyRewards_Name_Verify
	@FindBy(xpath = "//div[@class='col-md-4 col-sm-4 col-xs-12 rew-right']//div[contains(text(),'Hello ')]")
	public WebElement txt_MyRewards_Name_Verify;
	
	// Associated Label : MyRewards_Edit_Acc_Det_Link
	@FindBy(xpath = "//div[@class='col-md-4 col-sm-4 col-xs-12 rew-right']//a[text()='Edit Account Details ']")
	public WebElement click_MyRewards_Edit_Acc_Det_Link;
	
	// Associated Label : EditAccountDetails_Page_Text
	@FindBy(xpath = "//label[text()='Edit Account Details ']")
	public WebElement click_EditAccountDetails_Page_Text;
	
	// Associated Label : SoftLogin_overlay
	@FindBy(xpath = "//h2[text()='Login']")
	public WebElement txt_SoftLogin_overlay;
	
	// Associated Label : MyRewards_GoldStatus
	@FindBy(xpath = "//img[@alt='Golden Batch']")
	public WebElement txt_MyRewards_GoldStatus;
	
	// Associated Label : MyRewards_UsefulLinks
	@FindBy(xpath = "//div[text()='Useful links ']")
	public WebElement txt_MyRewards_UsefulLinks;
	
	// Associated Label : Usefullink_FuelRewards_Link_bl
	@FindBy(xpath = "//a[text()='Fuel Rewards program']")
	public WebElement txt_Usefullink_FuelRewards_Link_bl;
	
	// Associated Label : Recent_Transactions_date_time
	@FindBy(xpath = "//div[text()='Recent transactions ']//span[@class='recent-tran-sub hidden-xs']")
	public WebElement txt_Recent_Transactions_date_time;
	
	// Associated Label : Recent_Transactions_Detailed_List
	@FindBy(xpath = "//div[@class='col-md-4 col-sm-4 col-xs-12 p-0 text-center r-cells']")
	public List<WebElement> txt_Recent_Transactions_Detailed_List;
	

//*******************************************************************************


	// Element Actions


	// Type:  Title_Text
	public void type_txt_Title_Text(String value) {
		txt_Title_Text.clear();
		txt_Title_Text.sendKeys(value);
	}

	//click:  Title_Text
	public void click_txt_Title_Text(){
		txt_Title_Text.click();
	}

	// Hover:  Title_Text
	public void hover_txt_Title_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Title_Text).build().perform();
	}

	// visible or Not :  Title_Text
	public boolean isDisplayed_txt_Title_Text(){
		if(txt_Title_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Title_Text
	public boolean isEnabled_txt_Title_Text(){
		if(txt_Title_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Title_Text
	public String getCssValue_txt_Title_Text(String attribute) {
		return txt_Title_Text.getCssValue(attribute);
	}

	//Get the text :  Title_Text
	public String getText_txt_Title_Text(){
		return txt_Title_Text.getText();
	}

	//Get the value :  Title_Text
	public String getValue_txt_Title_Text(){
		return txt_Title_Text.getAttribute("value");
	}
	// selected or Not :  Title_Text
	public boolean isSelected_txt_Title_Text(){
		if(txt_Title_Text.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Points_Text
	public void type_txt_Points_Text(String value) {
		txt_Points_Text.clear();
		txt_Points_Text.sendKeys(value);
	}

	//click:  Points_Text
	public void click_txt_Points_Text(){
		txt_Points_Text.click();
	}

	// Hover:  Points_Text
	public void hover_txt_Points_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Points_Text).build().perform();
	}

	// visible or Not :  Points_Text
	public boolean isDisplayed_txt_Points_Text(){
		if(txt_Points_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Points_Text
	public boolean isEnabled_txt_Points_Text(){
		if(txt_Points_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Points_Text
	public String getCssValue_txt_Points_Text(String attribute) {
		return txt_Points_Text.getCssValue(attribute);
	}

	//Get the text :  Points_Text
	public String getText_txt_Points_Text(){
		return txt_Points_Text.getText();
	}

	//Get the value :  Points_Text
	public String getValue_txt_Points_Text(){
		return txt_Points_Text.getAttribute("value");
	}
	// selected or Not :  Points_Text
	public boolean isSelected_txt_Points_Text(){
		if(txt_Points_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  Time_Text
	public void click_click_Time_Text(){
		click_Time_Text.click();
	}

	// Hover:  Time_Text
	public void hover_click_Time_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Time_Text).build().perform();
	}

	// visible or Not :  Time_Text
	public boolean isDisplayed_click_Time_Text(){
		if(click_Time_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Time_Text
	public boolean isEnabled_click_Time_Text(){
		if(click_Time_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Time_Text
	public String getCssValue_click_Time_Text(String attribute) {
		return click_Time_Text.getCssValue(attribute);
	}

	//Get the text :  Time_Text
	public String getText_click_Time_Text(){
		return click_Time_Text.getText();
	}

	//Get the value :  Time_Text
	public String getValue_click_Time_Text(){
		return click_Time_Text.getAttribute("value");
	}
	// selected or Not :  Time_Text
	public boolean isSelected_click_Time_Text(){
		if(click_Time_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  Available_savings_1_Text
	public void click_click_Available_savings_1_Text(){
		click_Available_savings_1_Text.click();
	}

	// Hover:  Available_savings_1_Text
	public void hover_click_Available_savings_1_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Available_savings_1_Text).build().perform();
	}

	// visible or Not :  Available_savings_1_Text
	public boolean isDisplayed_click_Available_savings_1_Text(){
		if(click_Available_savings_1_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Available_savings_1_Text
	public boolean isEnabled_click_Available_savings_1_Text(){
		if(click_Available_savings_1_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Available_savings_1_Text
	public String getCssValue_click_Available_savings_1_Text(String attribute) {
		return click_Available_savings_1_Text.getCssValue(attribute);
	}

	//Get the text :  Available_savings_1_Text
	public String getText_click_Available_savings_1_Text(){
		return click_Available_savings_1_Text.getText();
	}

	//Get the value :  Available_savings_1_Text
	public String getValue_click_Available_savings_1_Text(){
		return click_Available_savings_1_Text.getAttribute("value");
	}
	// selected or Not :  Available_savings_1_Text
	public boolean isSelected_click_Available_savings_1_Text(){
		if(click_Available_savings_1_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  Off_Total_2_Text
	public void click_click_Off_Total_2_Text(){
		click_Off_Total_2_Text.click();
	}

	// Hover:  Off_Total_2_Text
	public void hover_click_Off_Total_2_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Off_Total_2_Text).build().perform();
	}

	// visible or Not :  Off_Total_2_Text
	public boolean isDisplayed_click_Off_Total_2_Text(){
		if(click_Off_Total_2_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Off_Total_2_Text
	public boolean isEnabled_click_Off_Total_2_Text(){
		if(click_Off_Total_2_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Off_Total_2_Text
	public String getCssValue_click_Off_Total_2_Text(String attribute) {
		return click_Off_Total_2_Text.getCssValue(attribute);
	}

	//Get the text :  Off_Total_2_Text
	public String getText_click_Off_Total_2_Text(){
		return click_Off_Total_2_Text.getText();
	}

	//Get the value :  Off_Total_2_Text
	public String getValue_click_Off_Total_2_Text(){
		return click_Off_Total_2_Text.getAttribute("value");
	}
	// selected or Not :  Off_Total_2_Text
	public boolean isSelected_click_Off_Total_2_Text(){
		if(click_Off_Total_2_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  All_SE_Grocers_3_Text
	public void click_click_All_SE_Grocers_3_Text(){
		click_All_SE_Grocers_3_Text.click();
	}

	// Hover:  All_SE_Grocers_3_Text
	public void hover_click_All_SE_Grocers_3_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_All_SE_Grocers_3_Text).build().perform();
	}

	// visible or Not :  All_SE_Grocers_3_Text
	public boolean isDisplayed_click_All_SE_Grocers_3_Text(){
		if(click_All_SE_Grocers_3_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  All_SE_Grocers_3_Text
	public boolean isEnabled_click_All_SE_Grocers_3_Text(){
		if(click_All_SE_Grocers_3_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  All_SE_Grocers_3_Text
	public String getCssValue_click_All_SE_Grocers_3_Text(String attribute) {
		return click_All_SE_Grocers_3_Text.getCssValue(attribute);
	}

	//Get the text :  All_SE_Grocers_3_Text
	public String getText_click_All_SE_Grocers_3_Text(){
		return click_All_SE_Grocers_3_Text.getText();
	}

	//Get the value :  All_SE_Grocers_3_Text
	public String getValue_click_All_SE_Grocers_3_Text(){
		return click_All_SE_Grocers_3_Text.getAttribute("value");
	}
	// selected or Not :  All_SE_Grocers_3_Text
	public boolean isSelected_click_All_SE_Grocers_3_Text(){
		if(click_All_SE_Grocers_3_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  Available_Savings_Pump_4_Text
	public void click_click_Available_Savings_Pump_4_Text(){
		click_Available_Savings_Pump_4_Text.click();
	}

	// Hover:  Available_Savings_Pump_4_Text
	public void hover_click_Available_Savings_Pump_4_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Available_Savings_Pump_4_Text).build().perform();
	}

	// visible or Not :  Available_Savings_Pump_4_Text
	public boolean isDisplayed_click_Available_Savings_Pump_4_Text(){
		if(click_Available_Savings_Pump_4_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Available_Savings_Pump_4_Text
	public boolean isEnabled_click_Available_Savings_Pump_4_Text(){
		if(click_Available_Savings_Pump_4_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Available_Savings_Pump_4_Text
	public String getCssValue_click_Available_Savings_Pump_4_Text(String attribute) {
		return click_Available_Savings_Pump_4_Text.getCssValue(attribute);
	}

	//Get the text :  Available_Savings_Pump_4_Text
	public String getText_click_Available_Savings_Pump_4_Text(){
		return click_Available_Savings_Pump_4_Text.getText();
	}

	//Get the value :  Available_Savings_Pump_4_Text
	public String getValue_click_Available_Savings_Pump_4_Text(){
		return click_Available_Savings_Pump_4_Text.getAttribute("value");
	}
	// selected or Not :  Available_Savings_Pump_4_Text
	public boolean isSelected_click_Available_Savings_Pump_4_Text(){
		if(click_Available_Savings_Pump_4_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  Off_Per_Gallon_5_Text
	public void click_click_Off_Per_Gallon_5_Text(){
		click_Off_Per_Gallon_5_Text.click();
	}

	// Hover:  Off_Per_Gallon_5_Text
	public void hover_click_Off_Per_Gallon_5_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Off_Per_Gallon_5_Text).build().perform();
	}

	// visible or Not :  Off_Per_Gallon_5_Text
	public boolean isDisplayed_click_Off_Per_Gallon_5_Text(){
		if(click_Off_Per_Gallon_5_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Off_Per_Gallon_5_Text
	public boolean isEnabled_click_Off_Per_Gallon_5_Text(){
		if(click_Off_Per_Gallon_5_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Off_Per_Gallon_5_Text
	public String getCssValue_click_Off_Per_Gallon_5_Text(String attribute) {
		return click_Off_Per_Gallon_5_Text.getCssValue(attribute);
	}

	//Get the text :  Off_Per_Gallon_5_Text
	public String getText_click_Off_Per_Gallon_5_Text(){
		return click_Off_Per_Gallon_5_Text.getText();
	}

	//Get the value :  Off_Per_Gallon_5_Text
	public String getValue_click_Off_Per_Gallon_5_Text(){
		return click_Off_Per_Gallon_5_Text.getAttribute("value");
	}
	// selected or Not :  Off_Per_Gallon_5_Text
	public boolean isSelected_click_Off_Per_Gallon_5_Text(){
		if(click_Off_Per_Gallon_5_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  FRN_Rewards_6_Text
	public void click_click_FRN_Rewards_6_Text(){
		click_FRN_Rewards_6_Text.click();
	}

	// Hover:  FRN_Rewards_6_Text
	public void hover_click_FRN_Rewards_6_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_FRN_Rewards_6_Text).build().perform();
	}

	// visible or Not :  FRN_Rewards_6_Text
	public boolean isDisplayed_click_FRN_Rewards_6_Text(){
		if(click_FRN_Rewards_6_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  FRN_Rewards_6_Text
	public boolean isEnabled_click_FRN_Rewards_6_Text(){
		if(click_FRN_Rewards_6_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  FRN_Rewards_6_Text
	public String getCssValue_click_FRN_Rewards_6_Text(String attribute) {
		return click_FRN_Rewards_6_Text.getCssValue(attribute);
	}

	//Get the text :  FRN_Rewards_6_Text
	public String getText_click_FRN_Rewards_6_Text(){
		return click_FRN_Rewards_6_Text.getText();
	}

	//Get the value :  FRN_Rewards_6_Text
	public String getValue_click_FRN_Rewards_6_Text(){
		return click_FRN_Rewards_6_Text.getAttribute("value");
	}
	// selected or Not :  FRN_Rewards_6_Text
	public boolean isSelected_click_FRN_Rewards_6_Text(){
		if(click_FRN_Rewards_6_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  Gold_Status_7_Text
	public void click_click_Gold_Status_7_Text(){
		click_Gold_Status_7_Text.click();
	}

	// Hover:  Gold_Status_7_Text
	public void hover_click_Gold_Status_7_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Gold_Status_7_Text).build().perform();
	}

	// visible or Not :  Gold_Status_7_Text
	public boolean isDisplayed_click_Gold_Status_7_Text(){
		if(click_Gold_Status_7_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Gold_Status_7_Text
	public boolean isEnabled_click_Gold_Status_7_Text(){
		if(click_Gold_Status_7_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Gold_Status_7_Text
	public String getCssValue_click_Gold_Status_7_Text(String attribute) {
		return click_Gold_Status_7_Text.getCssValue(attribute);
	}

	//Get the text :  Gold_Status_7_Text
	public String getText_click_Gold_Status_7_Text(){
		return click_Gold_Status_7_Text.getText();
	}

	//Get the value :  Gold_Status_7_Text
	public String getValue_click_Gold_Status_7_Text(){
		return click_Gold_Status_7_Text.getAttribute("value");
	}
	// selected or Not :  Gold_Status_7_Text
	public boolean isSelected_click_Gold_Status_7_Text(){
		if(click_Gold_Status_7_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  Recent_Transactions_8_Text
	public void click_click_Recent_Transactions_8_Text(){
		click_Recent_Transactions_8_Text.click();
	}

	// Hover:  Recent_Transactions_8_Text
	public void hover_click_Recent_Transactions_8_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Recent_Transactions_8_Text).build().perform();
	}

	// visible or Not :  Recent_Transactions_8_Text
	public boolean isDisplayed_click_Recent_Transactions_8_Text(){
		if(click_Recent_Transactions_8_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Recent_Transactions_8_Text
	public boolean isEnabled_click_Recent_Transactions_8_Text(){
		if(click_Recent_Transactions_8_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Recent_Transactions_8_Text
	public String getCssValue_click_Recent_Transactions_8_Text(String attribute) {
		return click_Recent_Transactions_8_Text.getCssValue(attribute);
	}

	//Get the text :  Recent_Transactions_8_Text
	public String getText_click_Recent_Transactions_8_Text(){
		return click_Recent_Transactions_8_Text.getText();
	}

	//Get the value :  Recent_Transactions_8_Text
	public String getValue_click_Recent_Transactions_8_Text(){
		return click_Recent_Transactions_8_Text.getAttribute("value");
	}
	// selected or Not :  Recent_Transactions_8_Text
	public boolean isSelected_click_Recent_Transactions_8_Text(){
		if(click_Recent_Transactions_8_Text.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Usefullink_EditAccount_Link
	public void type_txt_Usefullink_EditAccount_Link(String value) {
		txt_Usefullink_EditAccount_Link.clear();
		txt_Usefullink_EditAccount_Link.sendKeys(value);
	}

	//click:  Usefullink_EditAccount_Link
	public void click_txt_Usefullink_EditAccount_Link(){
		txt_Usefullink_EditAccount_Link.click();
	}

	// Hover:  Usefullink_EditAccount_Link
	public void hover_txt_Usefullink_EditAccount_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Usefullink_EditAccount_Link).build().perform();
	}

	// visible or Not :  Usefullink_EditAccount_Link
	public boolean isDisplayed_txt_Usefullink_EditAccount_Link(){
		if(txt_Usefullink_EditAccount_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Usefullink_EditAccount_Link
	public boolean isEnabled_txt_Usefullink_EditAccount_Link(){
		if(txt_Usefullink_EditAccount_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Usefullink_EditAccount_Link
	public String getCssValue_txt_Usefullink_EditAccount_Link(String attribute) {
		return txt_Usefullink_EditAccount_Link.getCssValue(attribute);
	}

	//Get the text :  Usefullink_EditAccount_Link
	public String getText_txt_Usefullink_EditAccount_Link(){
		return txt_Usefullink_EditAccount_Link.getText();
	}

	//Get the value :  Usefullink_EditAccount_Link
	public String getValue_txt_Usefullink_EditAccount_Link(){
		return txt_Usefullink_EditAccount_Link.getAttribute("value");
	}
	// selected or Not :  Usefullink_EditAccount_Link
	public boolean isSelected_txt_Usefullink_EditAccount_Link(){
		if(txt_Usefullink_EditAccount_Link.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Usefullink_ViewPersonalizedAd_Link
	public void type_txt_Usefullink_ViewPersonalizedAd_Link(String value) {
		txt_Usefullink_ViewPersonalizedAd_Link.clear();
		txt_Usefullink_ViewPersonalizedAd_Link.sendKeys(value);
	}

	//click:  Usefullink_ViewPersonalizedAd_Link
	public void click_txt_Usefullink_ViewPersonalizedAd_Link(){
		txt_Usefullink_ViewPersonalizedAd_Link.click();
	}

	// Hover:  Usefullink_ViewPersonalizedAd_Link
	public void hover_txt_Usefullink_ViewPersonalizedAd_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Usefullink_ViewPersonalizedAd_Link).build().perform();
	}

	// visible or Not :  Usefullink_ViewPersonalizedAd_Link
	public boolean isDisplayed_txt_Usefullink_ViewPersonalizedAd_Link(){
		if(txt_Usefullink_ViewPersonalizedAd_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Usefullink_ViewPersonalizedAd_Link
	public boolean isEnabled_txt_Usefullink_ViewPersonalizedAd_Link(){
		if(txt_Usefullink_ViewPersonalizedAd_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Usefullink_ViewPersonalizedAd_Link
	public String getCssValue_txt_Usefullink_ViewPersonalizedAd_Link(String attribute) {
		return txt_Usefullink_ViewPersonalizedAd_Link.getCssValue(attribute);
	}

	//Get the text :  Usefullink_ViewPersonalizedAd_Link
	public String getText_txt_Usefullink_ViewPersonalizedAd_Link(){
		return txt_Usefullink_ViewPersonalizedAd_Link.getText();
	}

	//Get the value :  Usefullink_ViewPersonalizedAd_Link
	public String getValue_txt_Usefullink_ViewPersonalizedAd_Link(){
		return txt_Usefullink_ViewPersonalizedAd_Link.getAttribute("value");
	}
	// selected or Not :  Usefullink_ViewPersonalizedAd_Link
	public boolean isSelected_txt_Usefullink_ViewPersonalizedAd_Link(){
		if(txt_Usefullink_ViewPersonalizedAd_Link.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Usefullink_FAQ_Link
	public void type_txt_Usefullink_FAQ_Link(String value) {
		txt_Usefullink_FAQ_Link.clear();
		txt_Usefullink_FAQ_Link.sendKeys(value);
	}

	//click:  Usefullink_FAQ_Link
	public void click_txt_Usefullink_FAQ_Link(){
		txt_Usefullink_FAQ_Link.click();
	}

	// Hover:  Usefullink_FAQ_Link
	public void hover_txt_Usefullink_FAQ_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Usefullink_FAQ_Link).build().perform();
	}

	// visible or Not :  Usefullink_FAQ_Link
	public boolean isDisplayed_txt_Usefullink_FAQ_Link(){
		if(txt_Usefullink_FAQ_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Usefullink_FAQ_Link
	public boolean isEnabled_txt_Usefullink_FAQ_Link(){
		if(txt_Usefullink_FAQ_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Usefullink_FAQ_Link
	public String getCssValue_txt_Usefullink_FAQ_Link(String attribute) {
		return txt_Usefullink_FAQ_Link.getCssValue(attribute);
	}

	//Get the text :  Usefullink_FAQ_Link
	public String getText_txt_Usefullink_FAQ_Link(){
		return txt_Usefullink_FAQ_Link.getText();
	}

	//Get the value :  Usefullink_FAQ_Link
	public String getValue_txt_Usefullink_FAQ_Link(){
		return txt_Usefullink_FAQ_Link.getAttribute("value");
	}
	// selected or Not :  Usefullink_FAQ_Link
	public boolean isSelected_txt_Usefullink_FAQ_Link(){
		if(txt_Usefullink_FAQ_Link.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Usefullink_FuelRewards_Link
	public void type_txt_Usefullink_FuelRewards_Link(String value) {
		txt_Usefullink_FuelRewards_Link.clear();
		txt_Usefullink_FuelRewards_Link.sendKeys(value);
	}

	//click:  Usefullink_FuelRewards_Link
	public void click_txt_Usefullink_FuelRewards_Link(){
		txt_Usefullink_FuelRewards_Link.click();
	}

	// Hover:  Usefullink_FuelRewards_Link
	public void hover_txt_Usefullink_FuelRewards_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Usefullink_FuelRewards_Link).build().perform();
	}

	// visible or Not :  Usefullink_FuelRewards_Link
	public boolean isDisplayed_txt_Usefullink_FuelRewards_Link(){
		if(txt_Usefullink_FuelRewards_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Usefullink_FuelRewards_Link
	public boolean isEnabled_txt_Usefullink_FuelRewards_Link(){
		if(txt_Usefullink_FuelRewards_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Usefullink_FuelRewards_Link
	public String getCssValue_txt_Usefullink_FuelRewards_Link(String attribute) {
		return txt_Usefullink_FuelRewards_Link.getCssValue(attribute);
	}

	//Get the text :  Usefullink_FuelRewards_Link
	public String getText_txt_Usefullink_FuelRewards_Link(){
		return txt_Usefullink_FuelRewards_Link.getText();
	}

	//Get the value :  Usefullink_FuelRewards_Link
	public String getValue_txt_Usefullink_FuelRewards_Link(){
		return txt_Usefullink_FuelRewards_Link.getAttribute("value");
	}
	// selected or Not :  Usefullink_FuelRewards_Link
	public boolean isSelected_txt_Usefullink_FuelRewards_Link(){
		if(txt_Usefullink_FuelRewards_Link.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Usefullink_FindFuel_Link
	public void type_txt_Usefullink_FindFuel_Link(String value) {
		txt_Usefullink_FindFuel_Link.clear();
		txt_Usefullink_FindFuel_Link.sendKeys(value);
	}

	//click:  Usefullink_FindFuel_Link
	public void click_txt_Usefullink_FindFuel_Link(){
		txt_Usefullink_FindFuel_Link.click();
	}

	// Hover:  Usefullink_FindFuel_Link
	public void hover_txt_Usefullink_FindFuel_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Usefullink_FindFuel_Link).build().perform();
	}

	// visible or Not :  Usefullink_FindFuel_Link
	public boolean isDisplayed_txt_Usefullink_FindFuel_Link(){
		if(txt_Usefullink_FindFuel_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Usefullink_FindFuel_Link
	public boolean isEnabled_txt_Usefullink_FindFuel_Link(){
		if(txt_Usefullink_FindFuel_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Usefullink_FindFuel_Link
	public String getCssValue_txt_Usefullink_FindFuel_Link(String attribute) {
		return txt_Usefullink_FindFuel_Link.getCssValue(attribute);
	}

	//Get the text :  Usefullink_FindFuel_Link
	public String getText_txt_Usefullink_FindFuel_Link(){
		return txt_Usefullink_FindFuel_Link.getText();
	}

	//Get the value :  Usefullink_FindFuel_Link
	public String getValue_txt_Usefullink_FindFuel_Link(){
		return txt_Usefullink_FindFuel_Link.getAttribute("value");
	}
	// selected or Not :  Usefullink_FindFuel_Link
	public boolean isSelected_txt_Usefullink_FindFuel_Link(){
		if(txt_Usefullink_FindFuel_Link.isSelected()) { return true; } else { return false;} 
	}

	// Type:  MyRewards_Name_Verify
	public void type_txt_MyRewards_Name_Verify(String value) {
		txt_MyRewards_Name_Verify.clear();
		txt_MyRewards_Name_Verify.sendKeys(value);
	}

	//click:  MyRewards_Name_Verify
	public void click_txt_MyRewards_Name_Verify(){
		txt_MyRewards_Name_Verify.click();
	}

	// Hover:  MyRewards_Name_Verify
	public void hover_txt_MyRewards_Name_Verify(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_MyRewards_Name_Verify).build().perform();
	}

	// visible or Not :  MyRewards_Name_Verify
	public boolean isDisplayed_txt_MyRewards_Name_Verify(){
		if(txt_MyRewards_Name_Verify.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  MyRewards_Name_Verify
	public boolean isEnabled_txt_MyRewards_Name_Verify(){
		if(txt_MyRewards_Name_Verify.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  MyRewards_Name_Verify
	public String getCssValue_txt_MyRewards_Name_Verify(String attribute) {
		return txt_MyRewards_Name_Verify.getCssValue(attribute);
	}

	//Get the text :  MyRewards_Name_Verify
	public String getText_txt_MyRewards_Name_Verify(){
		return txt_MyRewards_Name_Verify.getText();
	}

	//Get the value :  MyRewards_Name_Verify
	public String getValue_txt_MyRewards_Name_Verify(){
		return txt_MyRewards_Name_Verify.getAttribute("value");
	}
	// selected or Not :  MyRewards_Name_Verify
	public boolean isSelected_txt_MyRewards_Name_Verify(){
		if(txt_MyRewards_Name_Verify.isSelected()) { return true; } else { return false;} 
	}

	//click:  MyRewards_Edit_Acc_Det_Link
	public void click_click_MyRewards_Edit_Acc_Det_Link(){
		click_MyRewards_Edit_Acc_Det_Link.click();
	}

	// Hover:  MyRewards_Edit_Acc_Det_Link
	public void hover_click_MyRewards_Edit_Acc_Det_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_MyRewards_Edit_Acc_Det_Link).build().perform();
	}

	// visible or Not :  MyRewards_Edit_Acc_Det_Link
	public boolean isDisplayed_click_MyRewards_Edit_Acc_Det_Link(){
		if(click_MyRewards_Edit_Acc_Det_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  MyRewards_Edit_Acc_Det_Link
	public boolean isEnabled_click_MyRewards_Edit_Acc_Det_Link(){
		if(click_MyRewards_Edit_Acc_Det_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  MyRewards_Edit_Acc_Det_Link
	public String getCssValue_click_MyRewards_Edit_Acc_Det_Link(String attribute) {
		return click_MyRewards_Edit_Acc_Det_Link.getCssValue(attribute);
	}

	//Get the text :  MyRewards_Edit_Acc_Det_Link
	public String getText_click_MyRewards_Edit_Acc_Det_Link(){
		return click_MyRewards_Edit_Acc_Det_Link.getText();
	}

	//Get the value :  MyRewards_Edit_Acc_Det_Link
	public String getValue_click_MyRewards_Edit_Acc_Det_Link(){
		return click_MyRewards_Edit_Acc_Det_Link.getAttribute("value");
	}
	// selected or Not :  MyRewards_Edit_Acc_Det_Link
	public boolean isSelected_click_MyRewards_Edit_Acc_Det_Link(){
		if(click_MyRewards_Edit_Acc_Det_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  EditAccountDetails_Page_Text
	public void click_click_EditAccountDetails_Page_Text(){
		click_EditAccountDetails_Page_Text.click();
	}

	// Hover:  EditAccountDetails_Page_Text
	public void hover_click_EditAccountDetails_Page_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_EditAccountDetails_Page_Text).build().perform();
	}

	// visible or Not :  EditAccountDetails_Page_Text
	public boolean isDisplayed_click_EditAccountDetails_Page_Text(){
		if(click_EditAccountDetails_Page_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  EditAccountDetails_Page_Text
	public boolean isEnabled_click_EditAccountDetails_Page_Text(){
		if(click_EditAccountDetails_Page_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  EditAccountDetails_Page_Text
	public String getCssValue_click_EditAccountDetails_Page_Text(String attribute) {
		return click_EditAccountDetails_Page_Text.getCssValue(attribute);
	}

	//Get the text :  EditAccountDetails_Page_Text
	public String getText_click_EditAccountDetails_Page_Text(){
		return click_EditAccountDetails_Page_Text.getText();
	}

	//Get the value :  EditAccountDetails_Page_Text
	public String getValue_click_EditAccountDetails_Page_Text(){
		return click_EditAccountDetails_Page_Text.getAttribute("value");
	}
	// selected or Not :  EditAccountDetails_Page_Text
	public boolean isSelected_click_EditAccountDetails_Page_Text(){
		if(click_EditAccountDetails_Page_Text.isSelected()) { return true; } else { return false;} 
	}

	// Type:  SoftLogin_overlay
	public void type_txt_SoftLogin_overlay(String value) {
		txt_SoftLogin_overlay.clear();
		txt_SoftLogin_overlay.sendKeys(value);
	}

	//click:  SoftLogin_overlay
	public void click_txt_SoftLogin_overlay(){
		txt_SoftLogin_overlay.click();
	}

	// Hover:  SoftLogin_overlay
	public void hover_txt_SoftLogin_overlay(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_SoftLogin_overlay).build().perform();
	}

	// visible or Not :  SoftLogin_overlay
	public boolean isDisplayed_txt_SoftLogin_overlay(){
		if(txt_SoftLogin_overlay.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  SoftLogin_overlay
	public boolean isEnabled_txt_SoftLogin_overlay(){
		if(txt_SoftLogin_overlay.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  SoftLogin_overlay
	public String getCssValue_txt_SoftLogin_overlay(String attribute) {
		return txt_SoftLogin_overlay.getCssValue(attribute);
	}

	//Get the text :  SoftLogin_overlay
	public String getText_txt_SoftLogin_overlay(){
		return txt_SoftLogin_overlay.getText();
	}

	//Get the value :  SoftLogin_overlay
	public String getValue_txt_SoftLogin_overlay(){
		return txt_SoftLogin_overlay.getAttribute("value");
	}
	// selected or Not :  SoftLogin_overlay
	public boolean isSelected_txt_SoftLogin_overlay(){
		if(txt_SoftLogin_overlay.isSelected()) { return true; } else { return false;} 
	}

	// Type:  MyRewards_GoldStatus
	public void type_txt_MyRewards_GoldStatus(String value) {
		txt_MyRewards_GoldStatus.clear();
		txt_MyRewards_GoldStatus.sendKeys(value);
	}

	//click:  MyRewards_GoldStatus
	public void click_txt_MyRewards_GoldStatus(){
		txt_MyRewards_GoldStatus.click();
	}

	// Hover:  MyRewards_GoldStatus
	public void hover_txt_MyRewards_GoldStatus(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_MyRewards_GoldStatus).build().perform();
	}

	// visible or Not :  MyRewards_GoldStatus
	public boolean isDisplayed_txt_MyRewards_GoldStatus(){
		if(txt_MyRewards_GoldStatus.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  MyRewards_GoldStatus
	public boolean isEnabled_txt_MyRewards_GoldStatus(){
		if(txt_MyRewards_GoldStatus.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  MyRewards_GoldStatus
	public String getCssValue_txt_MyRewards_GoldStatus(String attribute) {
		return txt_MyRewards_GoldStatus.getCssValue(attribute);
	}

	//Get the text :  MyRewards_GoldStatus
	public String getText_txt_MyRewards_GoldStatus(){
		return txt_MyRewards_GoldStatus.getText();
	}

	//Get the value :  MyRewards_GoldStatus
	public String getValue_txt_MyRewards_GoldStatus(){
		return txt_MyRewards_GoldStatus.getAttribute("value");
	}
	// selected or Not :  MyRewards_GoldStatus
	public boolean isSelected_txt_MyRewards_GoldStatus(){
		if(txt_MyRewards_GoldStatus.isSelected()) { return true; } else { return false;} 
	}

	// Type:  MyRewards_UsefulLinks
	public void type_txt_MyRewards_UsefulLinks(String value) {
		txt_MyRewards_UsefulLinks.clear();
		txt_MyRewards_UsefulLinks.sendKeys(value);
	}

	//click:  MyRewards_UsefulLinks
	public void click_txt_MyRewards_UsefulLinks(){
		txt_MyRewards_UsefulLinks.click();
	}

	// Hover:  MyRewards_UsefulLinks
	public void hover_txt_MyRewards_UsefulLinks(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_MyRewards_UsefulLinks).build().perform();
	}

	// visible or Not :  MyRewards_UsefulLinks
	public boolean isDisplayed_txt_MyRewards_UsefulLinks(){
		if(txt_MyRewards_UsefulLinks.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  MyRewards_UsefulLinks
	public boolean isEnabled_txt_MyRewards_UsefulLinks(){
		if(txt_MyRewards_UsefulLinks.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  MyRewards_UsefulLinks
	public String getCssValue_txt_MyRewards_UsefulLinks(String attribute) {
		return txt_MyRewards_UsefulLinks.getCssValue(attribute);
	}

	//Get the text :  MyRewards_UsefulLinks
	public String getText_txt_MyRewards_UsefulLinks(){
		return txt_MyRewards_UsefulLinks.getText();
	}

	//Get the value :  MyRewards_UsefulLinks
	public String getValue_txt_MyRewards_UsefulLinks(){
		return txt_MyRewards_UsefulLinks.getAttribute("value");
	}
	// selected or Not :  MyRewards_UsefulLinks
	public boolean isSelected_txt_MyRewards_UsefulLinks(){
		if(txt_MyRewards_UsefulLinks.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Usefullink_FuelRewards_Link_bl
	public void type_txt_Usefullink_FuelRewards_Link_bl(String value) {
		txt_Usefullink_FuelRewards_Link_bl.clear();
		txt_Usefullink_FuelRewards_Link_bl.sendKeys(value);
	}

	//click:  Usefullink_FuelRewards_Link_bl
	public void click_txt_Usefullink_FuelRewards_Link_bl(){
		txt_Usefullink_FuelRewards_Link_bl.click();
	}

	// Hover:  Usefullink_FuelRewards_Link_bl
	public void hover_txt_Usefullink_FuelRewards_Link_bl(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Usefullink_FuelRewards_Link_bl).build().perform();
	}

	// visible or Not :  Usefullink_FuelRewards_Link_bl
	public boolean isDisplayed_txt_Usefullink_FuelRewards_Link_bl(){
		if(txt_Usefullink_FuelRewards_Link_bl.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Usefullink_FuelRewards_Link_bl
	public boolean isEnabled_txt_Usefullink_FuelRewards_Link_bl(){
		if(txt_Usefullink_FuelRewards_Link_bl.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Usefullink_FuelRewards_Link_bl
	public String getCssValue_txt_Usefullink_FuelRewards_Link_bl(String attribute) {
		return txt_Usefullink_FuelRewards_Link_bl.getCssValue(attribute);
	}

	//Get the text :  Usefullink_FuelRewards_Link_bl
	public String getText_txt_Usefullink_FuelRewards_Link_bl(){
		return txt_Usefullink_FuelRewards_Link_bl.getText();
	}

	//Get the value :  Usefullink_FuelRewards_Link_bl
	public String getValue_txt_Usefullink_FuelRewards_Link_bl(){
		return txt_Usefullink_FuelRewards_Link_bl.getAttribute("value");
	}
	// selected or Not :  Usefullink_FuelRewards_Link_bl
	public boolean isSelected_txt_Usefullink_FuelRewards_Link_bl(){
		if(txt_Usefullink_FuelRewards_Link_bl.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Recent_Transactions_date_time
	public void type_txt_Recent_Transactions_date_time(String value) {
		txt_Recent_Transactions_date_time.clear();
		txt_Recent_Transactions_date_time.sendKeys(value);
	}

	//click:  Recent_Transactions_date_time
	public void click_txt_Recent_Transactions_date_time(){
		txt_Recent_Transactions_date_time.click();
	}

	// Hover:  Recent_Transactions_date_time
	public void hover_txt_Recent_Transactions_date_time(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Recent_Transactions_date_time).build().perform();
	}

	// visible or Not :  Recent_Transactions_date_time
	public boolean isDisplayed_txt_Recent_Transactions_date_time(){
		if(txt_Recent_Transactions_date_time.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Recent_Transactions_date_time
	public boolean isEnabled_txt_Recent_Transactions_date_time(){
		if(txt_Recent_Transactions_date_time.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Recent_Transactions_date_time
	public String getCssValue_txt_Recent_Transactions_date_time(String attribute) {
		return txt_Recent_Transactions_date_time.getCssValue(attribute);
	}

	//Get the text :  Recent_Transactions_date_time
	public String getText_txt_Recent_Transactions_date_time(){
		return txt_Recent_Transactions_date_time.getText();
	}

	//Get the value :  Recent_Transactions_date_time
	public String getValue_txt_Recent_Transactions_date_time(){
		return txt_Recent_Transactions_date_time.getAttribute("value");
	}
	// selected or Not :  Recent_Transactions_date_time
	public boolean isSelected_txt_Recent_Transactions_date_time(){
		if(txt_Recent_Transactions_date_time.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Recent_Transactions_Detailed_List
	public void type_txt_Recent_Transactions_Detailed_List(String value) {
		txt_Recent_Transactions_Detailed_List.clear();
		((WebElement) txt_Recent_Transactions_Detailed_List).sendKeys(value);
	}

	//click:  Recent_Transactions_Detailed_List
	public void click_txt_Recent_Transactions_Detailed_List(){
		((WebElement) txt_Recent_Transactions_Detailed_List).click();
	}

	// Hover:  Recent_Transactions_Detailed_List
	public void hover_txt_Recent_Transactions_Detailed_List(){
		Actions action=new Actions(driver); 
		action.moveToElement((WebElement) txt_Recent_Transactions_Detailed_List).build().perform();
	}

	// visible or Not :  Recent_Transactions_Detailed_List
	public boolean isDisplayed_txt_Recent_Transactions_Detailed_List(){
		if(((WebElement) txt_Recent_Transactions_Detailed_List).isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Recent_Transactions_Detailed_List
	public boolean isEnabled_txt_Recent_Transactions_Detailed_List(){
		if(((WebElement) txt_Recent_Transactions_Detailed_List).isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Recent_Transactions_Detailed_List
	public String getCssValue_txt_Recent_Transactions_Detailed_List(String attribute) {
		return ((WebElement) txt_Recent_Transactions_Detailed_List).getCssValue(attribute);
	}

	//Get the text :  Recent_Transactions_Detailed_List
	public String getText_txt_Recent_Transactions_Detailed_List(){
		return ((WebElement) txt_Recent_Transactions_Detailed_List).getText();
	}

	//Get the value :  Recent_Transactions_Detailed_List
	public String getValue_txt_Recent_Transactions_Detailed_List(){
		return ((WebElement) txt_Recent_Transactions_Detailed_List).getAttribute("value");
	}
	// selected or Not :  Recent_Transactions_Detailed_List
	public boolean isSelected_txt_Recent_Transactions_Detailed_List(){
		if(((WebElement) txt_Recent_Transactions_Detailed_List).isSelected()) { return true; } else { return false;} 
	}

}
