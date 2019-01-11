//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POM_Generated_ContactInfoPage { 
	WebDriver driver;
	public POM_Generated_ContactInfoPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : HeaderName_Text
	@FindBy(xpath = "//h1[contains(text(),'Hello')]")
	public WebElement txt_HeaderName_Text;
	
	// Associated Label : Salutation_Field
	@FindBy(id = "saltn")
	public WebElement ddl_Salutation_Field;
	
	// Associated Label : Fname_Field
	@FindBy(id = "fName")
	public WebElement txt_Fname_Field;
	
	// Associated Label : Lname_Field
	@FindBy(id = "lName")
	public WebElement txt_Lname_Field;
	
	// Associated Label : Month_Field
	@FindBy(id = "month")
	public WebElement txt_Month_Field;
	
	// Associated Label : Date_Field
	@FindBy(id = "date")
	public WebElement txt_Date_Field;
	
	// Associated Label : Year_Field
	@FindBy(id = "year")
	public WebElement txt_Year_Field;
	
	// Associated Label : Primary_Phone_Number_Field
	@FindBy(id = "phone")
	public WebElement txt_Primary_Phone_Number_Field;
	
	// Associated Label : TextMeOffers_Yes_Button
	@FindBy(id = "yes")
	public WebElement click_TextMeOffers_Yes_Button;
	
	// Associated Label : TextMeOffers_No_Button
	@FindBy(id = "no")
	public WebElement click_TextMeOffers_No_Button;
	
	// Associated Label : Address_Field
	@FindBy(id = "address")
	public WebElement txt_Address_Field;
	
	// Associated Label : Additional_Address_Field
	@FindBy(id = "addAddress")
	public WebElement txt_Additional_Address_Field;
	
	// Associated Label : City_Field
	@FindBy(id = "city")
	public WebElement txt_City_Field;
	
	// Associated Label : State_Field
	@FindBy(id = "state")
	public WebElement ddl_State_Field;
	
	// Associated Label : Zipcode_Field
	@FindBy(id = "zip")
	public WebElement txt_Zipcode_Field;
	
	// Associated Label : Submit_Form_Button
	@FindBy(id = "submit_form")
	public WebElement click_Submit_Form_Button;
	
	// Associated Label : Error_FirstName_Blank
	@FindBy(xpath = "//span[@id='errorfName'][@style='display: block;']")
	public WebElement txt_Error_FirstName_Blank;
	
	// Associated Label : Error_LastName_Blank
	@FindBy(xpath = "//span[@id='errorlName'][@style='display: block;']")
	public WebElement txt_Error_LastName_Blank;
	
	// Associated Label : Error_Birthday_Blank
	@FindBy(xpath = "//span[@id='DOBError'][@style='display: block;']")
	public WebElement txt_Error_Birthday_Blank;
	
	// Associated Label : Error_PhoneNumber_Blank
	@FindBy(xpath = "//span[@id='errorphone'][@style='display: block;']")
	public WebElement txt_Error_PhoneNumber_Blank;
	
	// Associated Label : Error_AlreadyRegistered_PhoneNo
	@FindBy(xpath = "//span[contains(text(),'phone number is already registered')]")
	public WebElement txt_Error_AlreadyRegistered_PhoneNo;
	
	// Associated Label : Error_Invalid_PhoneNumber
	@FindBy(xpath = "//span[@id='error-invalidphone'][@style='display: block;'] ")
	public WebElement txt_Error_Invalid_PhoneNumber;
	
	// Associated Label : Error_Invalid_PhoneType
	@FindBy(xpath = "//span[@id='error-phoneTypephone'][@style='display: block;']")
	public WebElement txt_Error_Invalid_PhoneType;
	
	// Associated Label : Error_Address_Blank
	@FindBy(xpath = "//span[@id='erroraddress'][@style='display: block;']")
	public WebElement txt_Error_Address_Blank;
	
	// Associated Label : Error_City_Blank
	@FindBy(xpath = "//span[@id='errorcity'][@style='display: block;']")
	public WebElement txt_Error_City_Blank;
	
	// Associated Label : Error_State_Blank
	@FindBy(xpath = "//span[@id='errorstate'][@style='display: block;']")
	public WebElement txt_Error_State_Blank;
	
	// Associated Label : Error_ZipCode_Blank
	@FindBy(xpath = "//span[@id='errorzip'][@style='display: block;']")
	public WebElement txt_Error_ZipCode_Blank;
	
	// Associated Label : ContactUs_Stepcounter
	@FindBy(xpath = "//img[@class='img-responsive c-statuschecker--steps__img c-statuschecker--steps__img--active']")
	public WebElement txt_ContactUs_Stepcounter;
	
	// Associated Label : Error_Nooffer_selection
	@FindBy(xpath = "//span[@class='radioEmptyErr'][@style='display: block;']")
	public WebElement txt_Error_Nooffer_selection;
	
	// Associated Label : Text_me_offers
	@FindBy(xpath = "//label[@class='innerHead'][contains(text(),'Text me offers!')]")
	public WebElement txt_Text_me_offers;
	
	// Associated Label : img_stepcounter_verification_done
	@FindBy(xpath = "//img[@src='/-/media/statuscheckerstep/verification-visited.png?la=en&mw=1382']")
	public WebElement txt_img_stepcounter_verification_done;
	
	// Associated Label : img_stepcounter_contactinfo_active
	@FindBy(xpath = "//img[@src='/-/media/statuscheckerstep/contactinfo-active.png?la=en&mw=1382']")
	public WebElement txt_img_stepcounter_contactinfo_active;
	
	// Associated Label : img_stepCounter_SecurityInfo_InActive
	@FindBy(xpath = "//img[@src='/-/media/statuscheckerstep/security.png?la=en&mw=1382']")
	public WebElement txt_img_stepCounter_SecurityInfo_InActive;
	

//*******************************************************************************


	// Element Actions


	// Type:  HeaderName_Text
	public void type_txt_HeaderName_Text(String value) {
		txt_HeaderName_Text.clear();
		txt_HeaderName_Text.sendKeys(value);
	}

	//click:  HeaderName_Text
	public void click_txt_HeaderName_Text(){
		txt_HeaderName_Text.click();
	}

	// Hover:  HeaderName_Text
	public void hover_txt_HeaderName_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_HeaderName_Text).build().perform();
	}

	// visible or Not :  HeaderName_Text
	public boolean isDisplayed_txt_HeaderName_Text(){
		if(txt_HeaderName_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  HeaderName_Text
	public boolean isEnabled_txt_HeaderName_Text(){
		if(txt_HeaderName_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  HeaderName_Text
	public String getCssValue_txt_HeaderName_Text(String attribute) {
		return txt_HeaderName_Text.getCssValue(attribute);
	}

	//Get the text :  HeaderName_Text
	public String getText_txt_HeaderName_Text(){
		return txt_HeaderName_Text.getText();
	}

	//Get the value :  HeaderName_Text
	public String getValue_txt_HeaderName_Text(){
		return txt_HeaderName_Text.getAttribute("value");
	}
	// selected or Not :  HeaderName_Text
	public boolean isSelected_txt_HeaderName_Text(){
		if(txt_HeaderName_Text.isSelected()) { return true; } else { return false;} 
	}

// Method to select a value from dropDown :Salutation_Field
	public void select_ddl_Salutation_Field(String value){
		Select Select=new Select(ddl_Salutation_Field);
	Select.selectByVisibleText(value);
	}

	 // Method to retrieve selected value from drop Down :Salutation_Field
	public String get_first_Selected_value_ddl_Salutation_Field(){
		Select Select=new Select(ddl_Salutation_Field);
		return Select.getFirstSelectedOption().getText();
	}

	//click:  Salutation_Field
	public void click_ddl_Salutation_Field(){
		ddl_Salutation_Field.click();
	}

	// Hover:  Salutation_Field
	public void hover_ddl_Salutation_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(ddl_Salutation_Field).build().perform();
	}

	// visible or Not :  Salutation_Field
	public boolean isDisplayed_ddl_Salutation_Field(){
		if(ddl_Salutation_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Salutation_Field
	public boolean isEnabled_ddl_Salutation_Field(){
		if(ddl_Salutation_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Salutation_Field
	public String getCssValue_ddl_Salutation_Field(String attribute) {
		return ddl_Salutation_Field.getCssValue(attribute);
	}

	//Get the text :  Salutation_Field
	public String getText_ddl_Salutation_Field(){
		return ddl_Salutation_Field.getText();
	}

	//Get the value :  Salutation_Field
	public String getValue_ddl_Salutation_Field(){
		return ddl_Salutation_Field.getAttribute("value");
	}
	// selected or Not :  Salutation_Field
	public boolean isSelected_ddl_Salutation_Field(){
		if(ddl_Salutation_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Fname_Field
	public void type_txt_Fname_Field(String value) {
		txt_Fname_Field.clear();
		txt_Fname_Field.sendKeys(value);
	}

	//click:  Fname_Field
	public void click_txt_Fname_Field(){
		txt_Fname_Field.click();
	}

	// Hover:  Fname_Field
	public void hover_txt_Fname_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Fname_Field).build().perform();
	}

	// visible or Not :  Fname_Field
	public boolean isDisplayed_txt_Fname_Field(){
		if(txt_Fname_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Fname_Field
	public boolean isEnabled_txt_Fname_Field(){
		if(txt_Fname_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Fname_Field
	public String getCssValue_txt_Fname_Field(String attribute) {
		return txt_Fname_Field.getCssValue(attribute);
	}

	//Get the text :  Fname_Field
	public String getText_txt_Fname_Field(){
		return txt_Fname_Field.getText();
	}

	//Get the value :  Fname_Field
	public String getValue_txt_Fname_Field(){
		return txt_Fname_Field.getAttribute("value");
	}
	// selected or Not :  Fname_Field
	public boolean isSelected_txt_Fname_Field(){
		if(txt_Fname_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Lname_Field
	public void type_txt_Lname_Field(String value) {
		txt_Lname_Field.clear();
		txt_Lname_Field.sendKeys(value);
	}

	//click:  Lname_Field
	public void click_txt_Lname_Field(){
		txt_Lname_Field.click();
	}

	// Hover:  Lname_Field
	public void hover_txt_Lname_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Lname_Field).build().perform();
	}

	// visible or Not :  Lname_Field
	public boolean isDisplayed_txt_Lname_Field(){
		if(txt_Lname_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Lname_Field
	public boolean isEnabled_txt_Lname_Field(){
		if(txt_Lname_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Lname_Field
	public String getCssValue_txt_Lname_Field(String attribute) {
		return txt_Lname_Field.getCssValue(attribute);
	}

	//Get the text :  Lname_Field
	public String getText_txt_Lname_Field(){
		return txt_Lname_Field.getText();
	}

	//Get the value :  Lname_Field
	public String getValue_txt_Lname_Field(){
		return txt_Lname_Field.getAttribute("value");
	}
	// selected or Not :  Lname_Field
	public boolean isSelected_txt_Lname_Field(){
		if(txt_Lname_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Month_Field
	public void type_txt_Month_Field(String value) {
		txt_Month_Field.clear();
		txt_Month_Field.sendKeys(value);
	}

	//click:  Month_Field
	public void click_txt_Month_Field(){
		txt_Month_Field.click();
	}

	// Hover:  Month_Field
	public void hover_txt_Month_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Month_Field).build().perform();
	}

	// visible or Not :  Month_Field
	public boolean isDisplayed_txt_Month_Field(){
		if(txt_Month_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Month_Field
	public boolean isEnabled_txt_Month_Field(){
		if(txt_Month_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Month_Field
	public String getCssValue_txt_Month_Field(String attribute) {
		return txt_Month_Field.getCssValue(attribute);
	}

	//Get the text :  Month_Field
	public String getText_txt_Month_Field(){
		return txt_Month_Field.getText();
	}

	//Get the value :  Month_Field
	public String getValue_txt_Month_Field(){
		return txt_Month_Field.getAttribute("value");
	}
	// selected or Not :  Month_Field
	public boolean isSelected_txt_Month_Field(){
		if(txt_Month_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Date_Field
	public void type_txt_Date_Field(String value) {
		txt_Date_Field.clear();
		txt_Date_Field.sendKeys(value);
	}

	//click:  Date_Field
	public void click_txt_Date_Field(){
		txt_Date_Field.click();
	}

	// Hover:  Date_Field
	public void hover_txt_Date_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Date_Field).build().perform();
	}

	// visible or Not :  Date_Field
	public boolean isDisplayed_txt_Date_Field(){
		if(txt_Date_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Date_Field
	public boolean isEnabled_txt_Date_Field(){
		if(txt_Date_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Date_Field
	public String getCssValue_txt_Date_Field(String attribute) {
		return txt_Date_Field.getCssValue(attribute);
	}

	//Get the text :  Date_Field
	public String getText_txt_Date_Field(){
		return txt_Date_Field.getText();
	}

	//Get the value :  Date_Field
	public String getValue_txt_Date_Field(){
		return txt_Date_Field.getAttribute("value");
	}
	// selected or Not :  Date_Field
	public boolean isSelected_txt_Date_Field(){
		if(txt_Date_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Year_Field
	public void type_txt_Year_Field(String value) {
		txt_Year_Field.clear();
		txt_Year_Field.sendKeys(value);
	}

	//click:  Year_Field
	public void click_txt_Year_Field(){
		txt_Year_Field.click();
	}

	// Hover:  Year_Field
	public void hover_txt_Year_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Year_Field).build().perform();
	}

	// visible or Not :  Year_Field
	public boolean isDisplayed_txt_Year_Field(){
		if(txt_Year_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Year_Field
	public boolean isEnabled_txt_Year_Field(){
		if(txt_Year_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Year_Field
	public String getCssValue_txt_Year_Field(String attribute) {
		return txt_Year_Field.getCssValue(attribute);
	}

	//Get the text :  Year_Field
	public String getText_txt_Year_Field(){
		return txt_Year_Field.getText();
	}

	//Get the value :  Year_Field
	public String getValue_txt_Year_Field(){
		return txt_Year_Field.getAttribute("value");
	}
	// selected or Not :  Year_Field
	public boolean isSelected_txt_Year_Field(){
		if(txt_Year_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Primary_Phone_Number_Field
	public void type_txt_Primary_Phone_Number_Field(String value) {
		txt_Primary_Phone_Number_Field.clear();
		txt_Primary_Phone_Number_Field.sendKeys(value);
	}

	//click:  Primary_Phone_Number_Field
	public void click_txt_Primary_Phone_Number_Field(){
		txt_Primary_Phone_Number_Field.click();
	}

	// Hover:  Primary_Phone_Number_Field
	public void hover_txt_Primary_Phone_Number_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Primary_Phone_Number_Field).build().perform();
	}

	// visible or Not :  Primary_Phone_Number_Field
	public boolean isDisplayed_txt_Primary_Phone_Number_Field(){
		if(txt_Primary_Phone_Number_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Primary_Phone_Number_Field
	public boolean isEnabled_txt_Primary_Phone_Number_Field(){
		if(txt_Primary_Phone_Number_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Primary_Phone_Number_Field
	public String getCssValue_txt_Primary_Phone_Number_Field(String attribute) {
		return txt_Primary_Phone_Number_Field.getCssValue(attribute);
	}

	//Get the text :  Primary_Phone_Number_Field
	public String getText_txt_Primary_Phone_Number_Field(){
		return txt_Primary_Phone_Number_Field.getText();
	}

	//Get the value :  Primary_Phone_Number_Field
	public String getValue_txt_Primary_Phone_Number_Field(){
		return txt_Primary_Phone_Number_Field.getAttribute("value");
	}
	// selected or Not :  Primary_Phone_Number_Field
	public boolean isSelected_txt_Primary_Phone_Number_Field(){
		if(txt_Primary_Phone_Number_Field.isSelected()) { return true; } else { return false;} 
	}

	//click:  TextMeOffers_Yes_Button
	public void click_click_TextMeOffers_Yes_Button(){
		click_TextMeOffers_Yes_Button.click();
	}

	// Hover:  TextMeOffers_Yes_Button
	public void hover_click_TextMeOffers_Yes_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_TextMeOffers_Yes_Button).build().perform();
	}

	// visible or Not :  TextMeOffers_Yes_Button
	public boolean isDisplayed_click_TextMeOffers_Yes_Button(){
		if(click_TextMeOffers_Yes_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  TextMeOffers_Yes_Button
	public boolean isEnabled_click_TextMeOffers_Yes_Button(){
		if(click_TextMeOffers_Yes_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  TextMeOffers_Yes_Button
	public String getCssValue_click_TextMeOffers_Yes_Button(String attribute) {
		return click_TextMeOffers_Yes_Button.getCssValue(attribute);
	}

	//Get the text :  TextMeOffers_Yes_Button
	public String getText_click_TextMeOffers_Yes_Button(){
		return click_TextMeOffers_Yes_Button.getText();
	}

	//Get the value :  TextMeOffers_Yes_Button
	public String getValue_click_TextMeOffers_Yes_Button(){
		return click_TextMeOffers_Yes_Button.getAttribute("value");
	}
	// selected or Not :  TextMeOffers_Yes_Button
	public boolean isSelected_click_TextMeOffers_Yes_Button(){
		if(click_TextMeOffers_Yes_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  TextMeOffers_No_Button
	public void click_click_TextMeOffers_No_Button(){
		click_TextMeOffers_No_Button.click();
	}

	// Hover:  TextMeOffers_No_Button
	public void hover_click_TextMeOffers_No_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_TextMeOffers_No_Button).build().perform();
	}

	// visible or Not :  TextMeOffers_No_Button
	public boolean isDisplayed_click_TextMeOffers_No_Button(){
		if(click_TextMeOffers_No_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  TextMeOffers_No_Button
	public boolean isEnabled_click_TextMeOffers_No_Button(){
		if(click_TextMeOffers_No_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  TextMeOffers_No_Button
	public String getCssValue_click_TextMeOffers_No_Button(String attribute) {
		return click_TextMeOffers_No_Button.getCssValue(attribute);
	}

	//Get the text :  TextMeOffers_No_Button
	public String getText_click_TextMeOffers_No_Button(){
		return click_TextMeOffers_No_Button.getText();
	}

	//Get the value :  TextMeOffers_No_Button
	public String getValue_click_TextMeOffers_No_Button(){
		return click_TextMeOffers_No_Button.getAttribute("value");
	}
	// selected or Not :  TextMeOffers_No_Button
	public boolean isSelected_click_TextMeOffers_No_Button(){
		if(click_TextMeOffers_No_Button.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Address_Field
	public void type_txt_Address_Field(String value) {
		txt_Address_Field.clear();
		txt_Address_Field.sendKeys(value);
	}

	//click:  Address_Field
	public void click_txt_Address_Field(){
		txt_Address_Field.click();
	}

	// Hover:  Address_Field
	public void hover_txt_Address_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Address_Field).build().perform();
	}

	// visible or Not :  Address_Field
	public boolean isDisplayed_txt_Address_Field(){
		if(txt_Address_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Address_Field
	public boolean isEnabled_txt_Address_Field(){
		if(txt_Address_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Address_Field
	public String getCssValue_txt_Address_Field(String attribute) {
		return txt_Address_Field.getCssValue(attribute);
	}

	//Get the text :  Address_Field
	public String getText_txt_Address_Field(){
		return txt_Address_Field.getText();
	}

	//Get the value :  Address_Field
	public String getValue_txt_Address_Field(){
		return txt_Address_Field.getAttribute("value");
	}
	// selected or Not :  Address_Field
	public boolean isSelected_txt_Address_Field(){
		if(txt_Address_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Additional_Address_Field
	public void type_txt_Additional_Address_Field(String value) {
		txt_Additional_Address_Field.clear();
		txt_Additional_Address_Field.sendKeys(value);
	}

	//click:  Additional_Address_Field
	public void click_txt_Additional_Address_Field(){
		txt_Additional_Address_Field.click();
	}

	// Hover:  Additional_Address_Field
	public void hover_txt_Additional_Address_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Additional_Address_Field).build().perform();
	}

	// visible or Not :  Additional_Address_Field
	public boolean isDisplayed_txt_Additional_Address_Field(){
		if(txt_Additional_Address_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Additional_Address_Field
	public boolean isEnabled_txt_Additional_Address_Field(){
		if(txt_Additional_Address_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Additional_Address_Field
	public String getCssValue_txt_Additional_Address_Field(String attribute) {
		return txt_Additional_Address_Field.getCssValue(attribute);
	}

	//Get the text :  Additional_Address_Field
	public String getText_txt_Additional_Address_Field(){
		return txt_Additional_Address_Field.getText();
	}

	//Get the value :  Additional_Address_Field
	public String getValue_txt_Additional_Address_Field(){
		return txt_Additional_Address_Field.getAttribute("value");
	}
	// selected or Not :  Additional_Address_Field
	public boolean isSelected_txt_Additional_Address_Field(){
		if(txt_Additional_Address_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  City_Field
	public void type_txt_City_Field(String value) {
		txt_City_Field.clear();
		txt_City_Field.sendKeys(value);
	}

	//click:  City_Field
	public void click_txt_City_Field(){
		txt_City_Field.click();
	}

	// Hover:  City_Field
	public void hover_txt_City_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_City_Field).build().perform();
	}

	// visible or Not :  City_Field
	public boolean isDisplayed_txt_City_Field(){
		if(txt_City_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  City_Field
	public boolean isEnabled_txt_City_Field(){
		if(txt_City_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  City_Field
	public String getCssValue_txt_City_Field(String attribute) {
		return txt_City_Field.getCssValue(attribute);
	}

	//Get the text :  City_Field
	public String getText_txt_City_Field(){
		return txt_City_Field.getText();
	}

	//Get the value :  City_Field
	public String getValue_txt_City_Field(){
		return txt_City_Field.getAttribute("value");
	}
	// selected or Not :  City_Field
	public boolean isSelected_txt_City_Field(){
		if(txt_City_Field.isSelected()) { return true; } else { return false;} 
	}

// Method to select a value from dropDown :State_Field
	public void select_ddl_State_Field(String value){
		Select Select=new Select(ddl_State_Field);
	Select.selectByVisibleText(value);
	}

	 // Method to retrieve selected value from drop Down :State_Field
	public String get_first_Selected_value_ddl_State_Field(){
		Select Select=new Select(ddl_State_Field);
		return Select.getFirstSelectedOption().getText();
	}

	//click:  State_Field
	public void click_ddl_State_Field(){
		ddl_State_Field.click();
	}

	// Hover:  State_Field
	public void hover_ddl_State_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(ddl_State_Field).build().perform();
	}

	// visible or Not :  State_Field
	public boolean isDisplayed_ddl_State_Field(){
		if(ddl_State_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  State_Field
	public boolean isEnabled_ddl_State_Field(){
		if(ddl_State_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  State_Field
	public String getCssValue_ddl_State_Field(String attribute) {
		return ddl_State_Field.getCssValue(attribute);
	}

	//Get the text :  State_Field
	public String getText_ddl_State_Field(){
		return ddl_State_Field.getText();
	}

	//Get the value :  State_Field
	public String getValue_ddl_State_Field(){
		return ddl_State_Field.getAttribute("value");
	}
	// selected or Not :  State_Field
	public boolean isSelected_ddl_State_Field(){
		if(ddl_State_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Zipcode_Field
	public void type_txt_Zipcode_Field(String value) {
		txt_Zipcode_Field.clear();
		txt_Zipcode_Field.sendKeys(value);
	}

	//click:  Zipcode_Field
	public void click_txt_Zipcode_Field(){
		txt_Zipcode_Field.click();
	}

	// Hover:  Zipcode_Field
	public void hover_txt_Zipcode_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Zipcode_Field).build().perform();
	}

	// visible or Not :  Zipcode_Field
	public boolean isDisplayed_txt_Zipcode_Field(){
		if(txt_Zipcode_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Zipcode_Field
	public boolean isEnabled_txt_Zipcode_Field(){
		if(txt_Zipcode_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Zipcode_Field
	public String getCssValue_txt_Zipcode_Field(String attribute) {
		return txt_Zipcode_Field.getCssValue(attribute);
	}

	//Get the text :  Zipcode_Field
	public String getText_txt_Zipcode_Field(){
		return txt_Zipcode_Field.getText();
	}

	//Get the value :  Zipcode_Field
	public String getValue_txt_Zipcode_Field(){
		return txt_Zipcode_Field.getAttribute("value");
	}
	// selected or Not :  Zipcode_Field
	public boolean isSelected_txt_Zipcode_Field(){
		if(txt_Zipcode_Field.isSelected()) { return true; } else { return false;} 
	}

	//click:  Submit_Form_Button
	public void click_click_Submit_Form_Button(){
		click_Submit_Form_Button.click();
	}

	// Hover:  Submit_Form_Button
	public void hover_click_Submit_Form_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Submit_Form_Button).build().perform();
	}

	// visible or Not :  Submit_Form_Button
	public boolean isDisplayed_click_Submit_Form_Button(){
		if(click_Submit_Form_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Submit_Form_Button
	public boolean isEnabled_click_Submit_Form_Button(){
		if(click_Submit_Form_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Submit_Form_Button
	public String getCssValue_click_Submit_Form_Button(String attribute) {
		return click_Submit_Form_Button.getCssValue(attribute);
	}

	//Get the text :  Submit_Form_Button
	public String getText_click_Submit_Form_Button(){
		return click_Submit_Form_Button.getText();
	}

	//Get the value :  Submit_Form_Button
	public String getValue_click_Submit_Form_Button(){
		return click_Submit_Form_Button.getAttribute("value");
	}
	// selected or Not :  Submit_Form_Button
	public boolean isSelected_click_Submit_Form_Button(){
		if(click_Submit_Form_Button.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_FirstName_Blank
	public void type_txt_Error_FirstName_Blank(String value) {
		txt_Error_FirstName_Blank.clear();
		txt_Error_FirstName_Blank.sendKeys(value);
	}

	//click:  Error_FirstName_Blank
	public void click_txt_Error_FirstName_Blank(){
		txt_Error_FirstName_Blank.click();
	}

	// Hover:  Error_FirstName_Blank
	public void hover_txt_Error_FirstName_Blank(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_FirstName_Blank).build().perform();
	}

	// visible or Not :  Error_FirstName_Blank
	public boolean isDisplayed_txt_Error_FirstName_Blank(){
		if(txt_Error_FirstName_Blank.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_FirstName_Blank
	public boolean isEnabled_txt_Error_FirstName_Blank(){
		if(txt_Error_FirstName_Blank.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_FirstName_Blank
	public String getCssValue_txt_Error_FirstName_Blank(String attribute) {
		return txt_Error_FirstName_Blank.getCssValue(attribute);
	}

	//Get the text :  Error_FirstName_Blank
	public String getText_txt_Error_FirstName_Blank(){
		return txt_Error_FirstName_Blank.getText();
	}

	//Get the value :  Error_FirstName_Blank
	public String getValue_txt_Error_FirstName_Blank(){
		return txt_Error_FirstName_Blank.getAttribute("value");
	}
	// selected or Not :  Error_FirstName_Blank
	public boolean isSelected_txt_Error_FirstName_Blank(){
		if(txt_Error_FirstName_Blank.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_LastName_Blank
	public void type_txt_Error_LastName_Blank(String value) {
		txt_Error_LastName_Blank.clear();
		txt_Error_LastName_Blank.sendKeys(value);
	}

	//click:  Error_LastName_Blank
	public void click_txt_Error_LastName_Blank(){
		txt_Error_LastName_Blank.click();
	}

	// Hover:  Error_LastName_Blank
	public void hover_txt_Error_LastName_Blank(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_LastName_Blank).build().perform();
	}

	// visible or Not :  Error_LastName_Blank
	public boolean isDisplayed_txt_Error_LastName_Blank(){
		if(txt_Error_LastName_Blank.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_LastName_Blank
	public boolean isEnabled_txt_Error_LastName_Blank(){
		if(txt_Error_LastName_Blank.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_LastName_Blank
	public String getCssValue_txt_Error_LastName_Blank(String attribute) {
		return txt_Error_LastName_Blank.getCssValue(attribute);
	}

	//Get the text :  Error_LastName_Blank
	public String getText_txt_Error_LastName_Blank(){
		return txt_Error_LastName_Blank.getText();
	}

	//Get the value :  Error_LastName_Blank
	public String getValue_txt_Error_LastName_Blank(){
		return txt_Error_LastName_Blank.getAttribute("value");
	}
	// selected or Not :  Error_LastName_Blank
	public boolean isSelected_txt_Error_LastName_Blank(){
		if(txt_Error_LastName_Blank.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_Birthday_Blank
	public void type_txt_Error_Birthday_Blank(String value) {
		txt_Error_Birthday_Blank.clear();
		txt_Error_Birthday_Blank.sendKeys(value);
	}

	//click:  Error_Birthday_Blank
	public void click_txt_Error_Birthday_Blank(){
		txt_Error_Birthday_Blank.click();
	}

	// Hover:  Error_Birthday_Blank
	public void hover_txt_Error_Birthday_Blank(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_Birthday_Blank).build().perform();
	}

	// visible or Not :  Error_Birthday_Blank
	public boolean isDisplayed_txt_Error_Birthday_Blank(){
		if(txt_Error_Birthday_Blank.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_Birthday_Blank
	public boolean isEnabled_txt_Error_Birthday_Blank(){
		if(txt_Error_Birthday_Blank.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_Birthday_Blank
	public String getCssValue_txt_Error_Birthday_Blank(String attribute) {
		return txt_Error_Birthday_Blank.getCssValue(attribute);
	}

	//Get the text :  Error_Birthday_Blank
	public String getText_txt_Error_Birthday_Blank(){
		return txt_Error_Birthday_Blank.getText();
	}

	//Get the value :  Error_Birthday_Blank
	public String getValue_txt_Error_Birthday_Blank(){
		return txt_Error_Birthday_Blank.getAttribute("value");
	}
	// selected or Not :  Error_Birthday_Blank
	public boolean isSelected_txt_Error_Birthday_Blank(){
		if(txt_Error_Birthday_Blank.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_PhoneNumber_Blank
	public void type_txt_Error_PhoneNumber_Blank(String value) {
		txt_Error_PhoneNumber_Blank.clear();
		txt_Error_PhoneNumber_Blank.sendKeys(value);
	}

	//click:  Error_PhoneNumber_Blank
	public void click_txt_Error_PhoneNumber_Blank(){
		txt_Error_PhoneNumber_Blank.click();
	}

	// Hover:  Error_PhoneNumber_Blank
	public void hover_txt_Error_PhoneNumber_Blank(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_PhoneNumber_Blank).build().perform();
	}

	// visible or Not :  Error_PhoneNumber_Blank
	public boolean isDisplayed_txt_Error_PhoneNumber_Blank(){
		if(txt_Error_PhoneNumber_Blank.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_PhoneNumber_Blank
	public boolean isEnabled_txt_Error_PhoneNumber_Blank(){
		if(txt_Error_PhoneNumber_Blank.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_PhoneNumber_Blank
	public String getCssValue_txt_Error_PhoneNumber_Blank(String attribute) {
		return txt_Error_PhoneNumber_Blank.getCssValue(attribute);
	}

	//Get the text :  Error_PhoneNumber_Blank
	public String getText_txt_Error_PhoneNumber_Blank(){
		return txt_Error_PhoneNumber_Blank.getText();
	}

	//Get the value :  Error_PhoneNumber_Blank
	public String getValue_txt_Error_PhoneNumber_Blank(){
		return txt_Error_PhoneNumber_Blank.getAttribute("value");
	}
	// selected or Not :  Error_PhoneNumber_Blank
	public boolean isSelected_txt_Error_PhoneNumber_Blank(){
		if(txt_Error_PhoneNumber_Blank.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_AlreadyRegistered_PhoneNo
	public void type_txt_Error_AlreadyRegistered_PhoneNo(String value) {
		txt_Error_AlreadyRegistered_PhoneNo.clear();
		txt_Error_AlreadyRegistered_PhoneNo.sendKeys(value);
	}

	//click:  Error_AlreadyRegistered_PhoneNo
	public void click_txt_Error_AlreadyRegistered_PhoneNo(){
		txt_Error_AlreadyRegistered_PhoneNo.click();
	}

	// Hover:  Error_AlreadyRegistered_PhoneNo
	public void hover_txt_Error_AlreadyRegistered_PhoneNo(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_AlreadyRegistered_PhoneNo).build().perform();
	}

	// visible or Not :  Error_AlreadyRegistered_PhoneNo
	public boolean isDisplayed_txt_Error_AlreadyRegistered_PhoneNo(){
		if(txt_Error_AlreadyRegistered_PhoneNo.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_AlreadyRegistered_PhoneNo
	public boolean isEnabled_txt_Error_AlreadyRegistered_PhoneNo(){
		if(txt_Error_AlreadyRegistered_PhoneNo.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_AlreadyRegistered_PhoneNo
	public String getCssValue_txt_Error_AlreadyRegistered_PhoneNo(String attribute) {
		return txt_Error_AlreadyRegistered_PhoneNo.getCssValue(attribute);
	}

	//Get the text :  Error_AlreadyRegistered_PhoneNo
	public String getText_txt_Error_AlreadyRegistered_PhoneNo(){
		return txt_Error_AlreadyRegistered_PhoneNo.getText();
	}

	//Get the value :  Error_AlreadyRegistered_PhoneNo
	public String getValue_txt_Error_AlreadyRegistered_PhoneNo(){
		return txt_Error_AlreadyRegistered_PhoneNo.getAttribute("value");
	}
	// selected or Not :  Error_AlreadyRegistered_PhoneNo
	public boolean isSelected_txt_Error_AlreadyRegistered_PhoneNo(){
		if(txt_Error_AlreadyRegistered_PhoneNo.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_Invalid_PhoneNumber
	public void type_txt_Error_Invalid_PhoneNumber(String value) {
		txt_Error_Invalid_PhoneNumber.clear();
		txt_Error_Invalid_PhoneNumber.sendKeys(value);
	}

	//click:  Error_Invalid_PhoneNumber
	public void click_txt_Error_Invalid_PhoneNumber(){
		txt_Error_Invalid_PhoneNumber.click();
	}

	// Hover:  Error_Invalid_PhoneNumber
	public void hover_txt_Error_Invalid_PhoneNumber(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_Invalid_PhoneNumber).build().perform();
	}

	// visible or Not :  Error_Invalid_PhoneNumber
	public boolean isDisplayed_txt_Error_Invalid_PhoneNumber(){
		if(txt_Error_Invalid_PhoneNumber.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_Invalid_PhoneNumber
	public boolean isEnabled_txt_Error_Invalid_PhoneNumber(){
		if(txt_Error_Invalid_PhoneNumber.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_Invalid_PhoneNumber
	public String getCssValue_txt_Error_Invalid_PhoneNumber(String attribute) {
		return txt_Error_Invalid_PhoneNumber.getCssValue(attribute);
	}

	//Get the text :  Error_Invalid_PhoneNumber
	public String getText_txt_Error_Invalid_PhoneNumber(){
		return txt_Error_Invalid_PhoneNumber.getText();
	}

	//Get the value :  Error_Invalid_PhoneNumber
	public String getValue_txt_Error_Invalid_PhoneNumber(){
		return txt_Error_Invalid_PhoneNumber.getAttribute("value");
	}
	// selected or Not :  Error_Invalid_PhoneNumber
	public boolean isSelected_txt_Error_Invalid_PhoneNumber(){
		if(txt_Error_Invalid_PhoneNumber.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_Invalid_PhoneType
	public void type_txt_Error_Invalid_PhoneType(String value) {
		txt_Error_Invalid_PhoneType.clear();
		txt_Error_Invalid_PhoneType.sendKeys(value);
	}

	//click:  Error_Invalid_PhoneType
	public void click_txt_Error_Invalid_PhoneType(){
		txt_Error_Invalid_PhoneType.click();
	}

	// Hover:  Error_Invalid_PhoneType
	public void hover_txt_Error_Invalid_PhoneType(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_Invalid_PhoneType).build().perform();
	}

	// visible or Not :  Error_Invalid_PhoneType
	public boolean isDisplayed_txt_Error_Invalid_PhoneType(){
		if(txt_Error_Invalid_PhoneType.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_Invalid_PhoneType
	public boolean isEnabled_txt_Error_Invalid_PhoneType(){
		if(txt_Error_Invalid_PhoneType.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_Invalid_PhoneType
	public String getCssValue_txt_Error_Invalid_PhoneType(String attribute) {
		return txt_Error_Invalid_PhoneType.getCssValue(attribute);
	}

	//Get the text :  Error_Invalid_PhoneType
	public String getText_txt_Error_Invalid_PhoneType(){
		return txt_Error_Invalid_PhoneType.getText();
	}

	//Get the value :  Error_Invalid_PhoneType
	public String getValue_txt_Error_Invalid_PhoneType(){
		return txt_Error_Invalid_PhoneType.getAttribute("value");
	}
	// selected or Not :  Error_Invalid_PhoneType
	public boolean isSelected_txt_Error_Invalid_PhoneType(){
		if(txt_Error_Invalid_PhoneType.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_Address_Blank
	public void type_txt_Error_Address_Blank(String value) {
		txt_Error_Address_Blank.clear();
		txt_Error_Address_Blank.sendKeys(value);
	}

	//click:  Error_Address_Blank
	public void click_txt_Error_Address_Blank(){
		txt_Error_Address_Blank.click();
	}

	// Hover:  Error_Address_Blank
	public void hover_txt_Error_Address_Blank(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_Address_Blank).build().perform();
	}

	// visible or Not :  Error_Address_Blank
	public boolean isDisplayed_txt_Error_Address_Blank(){
		if(txt_Error_Address_Blank.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_Address_Blank
	public boolean isEnabled_txt_Error_Address_Blank(){
		if(txt_Error_Address_Blank.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_Address_Blank
	public String getCssValue_txt_Error_Address_Blank(String attribute) {
		return txt_Error_Address_Blank.getCssValue(attribute);
	}

	//Get the text :  Error_Address_Blank
	public String getText_txt_Error_Address_Blank(){
		return txt_Error_Address_Blank.getText();
	}

	//Get the value :  Error_Address_Blank
	public String getValue_txt_Error_Address_Blank(){
		return txt_Error_Address_Blank.getAttribute("value");
	}
	// selected or Not :  Error_Address_Blank
	public boolean isSelected_txt_Error_Address_Blank(){
		if(txt_Error_Address_Blank.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_City_Blank
	public void type_txt_Error_City_Blank(String value) {
		txt_Error_City_Blank.clear();
		txt_Error_City_Blank.sendKeys(value);
	}

	//click:  Error_City_Blank
	public void click_txt_Error_City_Blank(){
		txt_Error_City_Blank.click();
	}

	// Hover:  Error_City_Blank
	public void hover_txt_Error_City_Blank(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_City_Blank).build().perform();
	}

	// visible or Not :  Error_City_Blank
	public boolean isDisplayed_txt_Error_City_Blank(){
		if(txt_Error_City_Blank.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_City_Blank
	public boolean isEnabled_txt_Error_City_Blank(){
		if(txt_Error_City_Blank.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_City_Blank
	public String getCssValue_txt_Error_City_Blank(String attribute) {
		return txt_Error_City_Blank.getCssValue(attribute);
	}

	//Get the text :  Error_City_Blank
	public String getText_txt_Error_City_Blank(){
		return txt_Error_City_Blank.getText();
	}

	//Get the value :  Error_City_Blank
	public String getValue_txt_Error_City_Blank(){
		return txt_Error_City_Blank.getAttribute("value");
	}
	// selected or Not :  Error_City_Blank
	public boolean isSelected_txt_Error_City_Blank(){
		if(txt_Error_City_Blank.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_State_Blank
	public void type_txt_Error_State_Blank(String value) {
		txt_Error_State_Blank.clear();
		txt_Error_State_Blank.sendKeys(value);
	}

	//click:  Error_State_Blank
	public void click_txt_Error_State_Blank(){
		txt_Error_State_Blank.click();
	}

	// Hover:  Error_State_Blank
	public void hover_txt_Error_State_Blank(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_State_Blank).build().perform();
	}

	// visible or Not :  Error_State_Blank
	public boolean isDisplayed_txt_Error_State_Blank(){
		if(txt_Error_State_Blank.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_State_Blank
	public boolean isEnabled_txt_Error_State_Blank(){
		if(txt_Error_State_Blank.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_State_Blank
	public String getCssValue_txt_Error_State_Blank(String attribute) {
		return txt_Error_State_Blank.getCssValue(attribute);
	}

	//Get the text :  Error_State_Blank
	public String getText_txt_Error_State_Blank(){
		return txt_Error_State_Blank.getText();
	}

	//Get the value :  Error_State_Blank
	public String getValue_txt_Error_State_Blank(){
		return txt_Error_State_Blank.getAttribute("value");
	}
	// selected or Not :  Error_State_Blank
	public boolean isSelected_txt_Error_State_Blank(){
		if(txt_Error_State_Blank.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_ZipCode_Blank
	public void type_txt_Error_ZipCode_Blank(String value) {
		txt_Error_ZipCode_Blank.clear();
		txt_Error_ZipCode_Blank.sendKeys(value);
	}

	//click:  Error_ZipCode_Blank
	public void click_txt_Error_ZipCode_Blank(){
		txt_Error_ZipCode_Blank.click();
	}

	// Hover:  Error_ZipCode_Blank
	public void hover_txt_Error_ZipCode_Blank(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_ZipCode_Blank).build().perform();
	}

	// visible or Not :  Error_ZipCode_Blank
	public boolean isDisplayed_txt_Error_ZipCode_Blank(){
		if(txt_Error_ZipCode_Blank.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_ZipCode_Blank
	public boolean isEnabled_txt_Error_ZipCode_Blank(){
		if(txt_Error_ZipCode_Blank.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_ZipCode_Blank
	public String getCssValue_txt_Error_ZipCode_Blank(String attribute) {
		return txt_Error_ZipCode_Blank.getCssValue(attribute);
	}

	//Get the text :  Error_ZipCode_Blank
	public String getText_txt_Error_ZipCode_Blank(){
		return txt_Error_ZipCode_Blank.getText();
	}

	//Get the value :  Error_ZipCode_Blank
	public String getValue_txt_Error_ZipCode_Blank(){
		return txt_Error_ZipCode_Blank.getAttribute("value");
	}
	// selected or Not :  Error_ZipCode_Blank
	public boolean isSelected_txt_Error_ZipCode_Blank(){
		if(txt_Error_ZipCode_Blank.isSelected()) { return true; } else { return false;} 
	}

	// Type:  ContactUs_Stepcounter
	public void type_txt_ContactUs_Stepcounter(String value) {
		txt_ContactUs_Stepcounter.clear();
		txt_ContactUs_Stepcounter.sendKeys(value);
	}

	//click:  ContactUs_Stepcounter
	public void click_txt_ContactUs_Stepcounter(){
		txt_ContactUs_Stepcounter.click();
	}

	// Hover:  ContactUs_Stepcounter
	public void hover_txt_ContactUs_Stepcounter(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_ContactUs_Stepcounter).build().perform();
	}

	// visible or Not :  ContactUs_Stepcounter
	public boolean isDisplayed_txt_ContactUs_Stepcounter(){
		if(txt_ContactUs_Stepcounter.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  ContactUs_Stepcounter
	public boolean isEnabled_txt_ContactUs_Stepcounter(){
		if(txt_ContactUs_Stepcounter.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  ContactUs_Stepcounter
	public String getCssValue_txt_ContactUs_Stepcounter(String attribute) {
		return txt_ContactUs_Stepcounter.getCssValue(attribute);
	}

	//Get the text :  ContactUs_Stepcounter
	public String getText_txt_ContactUs_Stepcounter(){
		return txt_ContactUs_Stepcounter.getText();
	}

	//Get the value :  ContactUs_Stepcounter
	public String getValue_txt_ContactUs_Stepcounter(){
		return txt_ContactUs_Stepcounter.getAttribute("value");
	}
	// selected or Not :  ContactUs_Stepcounter
	public boolean isSelected_txt_ContactUs_Stepcounter(){
		if(txt_ContactUs_Stepcounter.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Error_Nooffer_selection
	public void type_txt_Error_Nooffer_selection(String value) {
		txt_Error_Nooffer_selection.clear();
		txt_Error_Nooffer_selection.sendKeys(value);
	}

	//click:  Error_Nooffer_selection
	public void click_txt_Error_Nooffer_selection(){
		txt_Error_Nooffer_selection.click();
	}

	// Hover:  Error_Nooffer_selection
	public void hover_txt_Error_Nooffer_selection(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Error_Nooffer_selection).build().perform();
	}

	// visible or Not :  Error_Nooffer_selection
	public boolean isDisplayed_txt_Error_Nooffer_selection(){
		if(txt_Error_Nooffer_selection.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Error_Nooffer_selection
	public boolean isEnabled_txt_Error_Nooffer_selection(){
		if(txt_Error_Nooffer_selection.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Error_Nooffer_selection
	public String getCssValue_txt_Error_Nooffer_selection(String attribute) {
		return txt_Error_Nooffer_selection.getCssValue(attribute);
	}

	//Get the text :  Error_Nooffer_selection
	public String getText_txt_Error_Nooffer_selection(){
		return txt_Error_Nooffer_selection.getText();
	}

	//Get the value :  Error_Nooffer_selection
	public String getValue_txt_Error_Nooffer_selection(){
		return txt_Error_Nooffer_selection.getAttribute("value");
	}
	// selected or Not :  Error_Nooffer_selection
	public boolean isSelected_txt_Error_Nooffer_selection(){
		if(txt_Error_Nooffer_selection.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Text_me_offers
	public void type_txt_Text_me_offers(String value) {
		txt_Text_me_offers.clear();
		txt_Text_me_offers.sendKeys(value);
	}

	//click:  Text_me_offers
	public void click_txt_Text_me_offers(){
		txt_Text_me_offers.click();
	}

	// Hover:  Text_me_offers
	public void hover_txt_Text_me_offers(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Text_me_offers).build().perform();
	}

	// visible or Not :  Text_me_offers
	public boolean isDisplayed_txt_Text_me_offers(){
		if(txt_Text_me_offers.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Text_me_offers
	public boolean isEnabled_txt_Text_me_offers(){
		if(txt_Text_me_offers.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Text_me_offers
	public String getCssValue_txt_Text_me_offers(String attribute) {
		return txt_Text_me_offers.getCssValue(attribute);
	}

	//Get the text :  Text_me_offers
	public String getText_txt_Text_me_offers(){
		return txt_Text_me_offers.getText();
	}

	//Get the value :  Text_me_offers
	public String getValue_txt_Text_me_offers(){
		return txt_Text_me_offers.getAttribute("value");
	}
	// selected or Not :  Text_me_offers
	public boolean isSelected_txt_Text_me_offers(){
		if(txt_Text_me_offers.isSelected()) { return true; } else { return false;} 
	}

	// Type:  img_stepcounter_verification_done
	public void type_txt_img_stepcounter_verification_done(String value) {
		txt_img_stepcounter_verification_done.clear();
		txt_img_stepcounter_verification_done.sendKeys(value);
	}

	//click:  img_stepcounter_verification_done
	public void click_txt_img_stepcounter_verification_done(){
		txt_img_stepcounter_verification_done.click();
	}

	// Hover:  img_stepcounter_verification_done
	public void hover_txt_img_stepcounter_verification_done(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_img_stepcounter_verification_done).build().perform();
	}

	// visible or Not :  img_stepcounter_verification_done
	public boolean isDisplayed_txt_img_stepcounter_verification_done(){
		if(txt_img_stepcounter_verification_done.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  img_stepcounter_verification_done
	public boolean isEnabled_txt_img_stepcounter_verification_done(){
		if(txt_img_stepcounter_verification_done.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  img_stepcounter_verification_done
	public String getCssValue_txt_img_stepcounter_verification_done(String attribute) {
		return txt_img_stepcounter_verification_done.getCssValue(attribute);
	}

	//Get the text :  img_stepcounter_verification_done
	public String getText_txt_img_stepcounter_verification_done(){
		return txt_img_stepcounter_verification_done.getText();
	}

	//Get the value :  img_stepcounter_verification_done
	public String getValue_txt_img_stepcounter_verification_done(){
		return txt_img_stepcounter_verification_done.getAttribute("value");
	}
	// selected or Not :  img_stepcounter_verification_done
	public boolean isSelected_txt_img_stepcounter_verification_done(){
		if(txt_img_stepcounter_verification_done.isSelected()) { return true; } else { return false;} 
	}

	// Type:  img_stepcounter_contactinfo_active
	public void type_txt_img_stepcounter_contactinfo_active(String value) {
		txt_img_stepcounter_contactinfo_active.clear();
		txt_img_stepcounter_contactinfo_active.sendKeys(value);
	}

	//click:  img_stepcounter_contactinfo_active
	public void click_txt_img_stepcounter_contactinfo_active(){
		txt_img_stepcounter_contactinfo_active.click();
	}

	// Hover:  img_stepcounter_contactinfo_active
	public void hover_txt_img_stepcounter_contactinfo_active(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_img_stepcounter_contactinfo_active).build().perform();
	}

	// visible or Not :  img_stepcounter_contactinfo_active
	public boolean isDisplayed_txt_img_stepcounter_contactinfo_active(){
		if(txt_img_stepcounter_contactinfo_active.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  img_stepcounter_contactinfo_active
	public boolean isEnabled_txt_img_stepcounter_contactinfo_active(){
		if(txt_img_stepcounter_contactinfo_active.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  img_stepcounter_contactinfo_active
	public String getCssValue_txt_img_stepcounter_contactinfo_active(String attribute) {
		return txt_img_stepcounter_contactinfo_active.getCssValue(attribute);
	}

	//Get the text :  img_stepcounter_contactinfo_active
	public String getText_txt_img_stepcounter_contactinfo_active(){
		return txt_img_stepcounter_contactinfo_active.getText();
	}

	//Get the value :  img_stepcounter_contactinfo_active
	public String getValue_txt_img_stepcounter_contactinfo_active(){
		return txt_img_stepcounter_contactinfo_active.getAttribute("value");
	}
	// selected or Not :  img_stepcounter_contactinfo_active
	public boolean isSelected_txt_img_stepcounter_contactinfo_active(){
		if(txt_img_stepcounter_contactinfo_active.isSelected()) { return true; } else { return false;} 
	}

	// Type:  img_stepCounter_SecurityInfo_InActive
	public void type_txt_img_stepCounter_SecurityInfo_InActive(String value) {
		txt_img_stepCounter_SecurityInfo_InActive.clear();
		txt_img_stepCounter_SecurityInfo_InActive.sendKeys(value);
	}

	//click:  img_stepCounter_SecurityInfo_InActive
	public void click_txt_img_stepCounter_SecurityInfo_InActive(){
		txt_img_stepCounter_SecurityInfo_InActive.click();
	}

	// Hover:  img_stepCounter_SecurityInfo_InActive
	public void hover_txt_img_stepCounter_SecurityInfo_InActive(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_img_stepCounter_SecurityInfo_InActive).build().perform();
	}

	// visible or Not :  img_stepCounter_SecurityInfo_InActive
	public boolean isDisplayed_txt_img_stepCounter_SecurityInfo_InActive(){
		if(txt_img_stepCounter_SecurityInfo_InActive.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  img_stepCounter_SecurityInfo_InActive
	public boolean isEnabled_txt_img_stepCounter_SecurityInfo_InActive(){
		if(txt_img_stepCounter_SecurityInfo_InActive.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  img_stepCounter_SecurityInfo_InActive
	public String getCssValue_txt_img_stepCounter_SecurityInfo_InActive(String attribute) {
		return txt_img_stepCounter_SecurityInfo_InActive.getCssValue(attribute);
	}

	//Get the text :  img_stepCounter_SecurityInfo_InActive
	public String getText_txt_img_stepCounter_SecurityInfo_InActive(){
		return txt_img_stepCounter_SecurityInfo_InActive.getText();
	}

	//Get the value :  img_stepCounter_SecurityInfo_InActive
	public String getValue_txt_img_stepCounter_SecurityInfo_InActive(){
		return txt_img_stepCounter_SecurityInfo_InActive.getAttribute("value");
	}
	// selected or Not :  img_stepCounter_SecurityInfo_InActive
	public boolean isSelected_txt_img_stepCounter_SecurityInfo_InActive(){
		if(txt_img_stepCounter_SecurityInfo_InActive.isSelected()) { return true; } else { return false;} 
	}

}
