package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POM_Generated_ContactUsPage { 
	WebDriver driver;
	public POM_Generated_ContactUsPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : FirstName
	@FindBy(id = "txtFirstName")
	public WebElement txt_FirstName;
	
	// Associated Label : LastName
	@FindBy(id = "txtLastName")
	public WebElement txt_LastName;
	
	// Associated Label : PreferredMethodofContact_Phone
	@FindBy(id = "rdoPhone")
	public WebElement Click_PreferredMethodofContact_Phone;
	
	// Associated Label : PreferredMethodofContact_Email
	@FindBy(id = "rdoEmail")
	public WebElement Click_PreferredMethodofContact_Email;
	
	// Associated Label : PreferredMethodofContact_Letter
	@FindBy(id = "rdoLetter")
	public WebElement Click_PreferredMethodofContact_Letter;
	
	// Associated Label : PreferredMethodofContact_PreferNoContact
	@FindBy(id = "rdoNoContact")
	public WebElement Click_PreferredMethodofContact_PreferNoContact;
	
	// Associated Label : PhoneNumber
	@FindBy(id = "txtPhoneNumber")
	public WebElement txt_PhoneNumber;
	
	// Associated Label : Email
	@FindBy(id = "txtEmailAddress")
	public WebElement txt_Email;
	
	// Associated Label : Retype Email
	@FindBy(id = "txtRetypeEmail")
	public WebElement txt_Retype_Email;
	
	// Associated Label : Address
	@FindBy(id = "txtAddress")
	public WebElement txt_Address;
	
	// Associated Label : City
	@FindBy(id = "txtCity")
	public WebElement txt_City;
	
	// Associated Label : State
	@FindBy(id = "ddlCity")
	public WebElement ddl_State;
	
	// Associated Label : Zip
	@FindBy(id = "txtZip")
	public WebElement txt_Zip;
	
	// Associated Label : BestTimetoContact
	@FindBy(id = "ddlBestTime")
	public WebElement ddl_BestTimetoContact;
	
	// Associated Label : SubjectofEnquiry_Store
	@FindBy(id = "rdoStore")
	public WebElement Click_SubjectofEnquiry_Store;
	
	// Associated Label : SubjectofEnquiry_Product
	@FindBy(id = "rdoProduct")
	public WebElement Click_SubjectofEnquiry_Product;
	
	// Associated Label : SubjectofEnquiry_SE_Grocers_reward
	@FindBy(id = "rdoPlenti")
	public WebElement Click_SubjectofEnquiry_SE_Grocers_reward;
	
	// Associated Label : SubjectofEnquiry_Other
	@FindBy(id = "rdoOther")
	public WebElement Click_SubjectofEnquiry_Other;
	
	// Associated Label : Store Number
	@FindBy(id = "txtStoreNumber")
	public WebElement txt_Store_Number;
	
	// Associated Label : Search_Button
	@FindBy(id = "btnZipSearch")
	public WebElement Click_Search_Button;
	
	// Associated Label : ProductName_Field
	@FindBy(id = "txtProductName")
	public WebElement txt_ProductName_Field;
	
	// Associated Label : UPCBarCodeNumber_Fileld
	@FindBy(id = "txtUPCBarCode")
	public WebElement txt_UPCBarCodeNumber_Fileld;
	
	// Associated Label : Size_Field
	@FindBy(id = "txtSize")
	public WebElement Click_Size_Field;
	
	// Associated Label : SellByDate
	@FindBy(id = "dtcSellDate")
	public WebElement dtc_SellByDate;
	
	// Associated Label : Calendar_Button
	@FindBy(id = "bn_date")
	public WebElement Click_Calendar_Button;
	
	// Associated Label : CustomerRewardCardNumber_Field
	@FindBy(id = "txtCRCNumber")
	public WebElement txt_CustomerRewardCardNumber_Field;
	
	// Associated Label : Comment_Field
	@FindBy(id = "txtComment")
	public WebElement txt_Comment_Field;
	
	// Associated Label : Submit_Button
	@FindBy(id = "btnvalSearch")
	public WebElement Click_Submit_Button;
	
	// Associated Label : Contact_Link
	@FindBy(xpath = "//a[text()='Contact ']")
	public WebElement Click_Contact_Link;
	
	// Associated Label : CommentsandCustomerservice
	@FindBy(xpath = "//p[text()='Thank you for taking the time to contact us.']")
	public WebElement txt_CommentsandCustomerservice;
	

//*******************************************************************************


	// Element Actions


	// Type:  FirstName
	public void type_txt_FirstName(String value) {
		
		txt_FirstName.clear();
		txt_FirstName.sendKeys(value);
	}

	//click:  FirstName
	public void click_txt_FirstName(){
		txt_FirstName.click();
	}

	// Hover:  FirstName
	public void hover_txt_FirstName(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_FirstName).build().perform();
	}

	// visible or Not :  FirstName
	public boolean isDisplayed_txt_FirstName(){
		if(txt_FirstName.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  FirstName
	public boolean isEnabled_txt_FirstName(){
		if(txt_FirstName.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  FirstName
	public String getCssValue_txt_FirstName(String attribute) {
		return txt_FirstName.getCssValue(attribute);
	}

	//Get the text :  FirstName
	public String getText_txt_FirstName(){
		return txt_FirstName.getText();
	}

	//Get the value :  FirstName
	public String getValue_txt_FirstName(){
		return txt_FirstName.getAttribute("value");
	}
	// selected or Not :  FirstName
	public boolean isSelected_txt_FirstName(){
		if(txt_FirstName.isSelected()) { return true; } else { return false;} 
	}

	// Type:  LastName
	public void type_txt_LastName(String value) {
		txt_LastName.clear();
		txt_LastName.sendKeys(value);
	}

	//click:  LastName
	public void click_txt_LastName(){
		txt_LastName.click();
	}

	// Hover:  LastName
	public void hover_txt_LastName(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_LastName).build().perform();
	}

	// visible or Not :  LastName
	public boolean isDisplayed_txt_LastName(){
		if(txt_LastName.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  LastName
	public boolean isEnabled_txt_LastName(){
		if(txt_LastName.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  LastName
	public String getCssValue_txt_LastName(String attribute) {
		return txt_LastName.getCssValue(attribute);
	}

	//Get the text :  LastName
	public String getText_txt_LastName(){
		return txt_LastName.getText();
	}

	//Get the value :  LastName
	public String getValue_txt_LastName(){
		return txt_LastName.getAttribute("value");
	}
	// selected or Not :  LastName
	public boolean isSelected_txt_LastName(){
		if(txt_LastName.isSelected()) { return true; } else { return false;} 
	}

	//click:  PreferredMethodofContact_Phone
	public void click_Click_PreferredMethodofContact_Phone(){
		Click_PreferredMethodofContact_Phone.click();
	}

	// Hover:  PreferredMethodofContact_Phone
	public void hover_Click_PreferredMethodofContact_Phone(){
		Actions action=new Actions(driver); 
		action.moveToElement(Click_PreferredMethodofContact_Phone).build().perform();
	}

	// visible or Not :  PreferredMethodofContact_Phone
	public boolean isDisplayed_Click_PreferredMethodofContact_Phone(){
		if(Click_PreferredMethodofContact_Phone.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  PreferredMethodofContact_Phone
	public boolean isEnabled_Click_PreferredMethodofContact_Phone(){
		if(Click_PreferredMethodofContact_Phone.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  PreferredMethodofContact_Phone
	public String getCssValue_Click_PreferredMethodofContact_Phone(String attribute) {
		return Click_PreferredMethodofContact_Phone.getCssValue(attribute);
	}

	//Get the text :  PreferredMethodofContact_Phone
	public String getText_Click_PreferredMethodofContact_Phone(){
		return Click_PreferredMethodofContact_Phone.getText();
	}

	//Get the value :  PreferredMethodofContact_Phone
	public String getValue_Click_PreferredMethodofContact_Phone(){
		return Click_PreferredMethodofContact_Phone.getAttribute("value");
	}
	// selected or Not :  PreferredMethodofContact_Phone
	public boolean isSelected_Click_PreferredMethodofContact_Phone(){
		if(Click_PreferredMethodofContact_Phone.isSelected()) { return true; } else { return false;} 
	}

	//click:  PreferredMethodofContact_Email
	public void click_Click_PreferredMethodofContact_Email(){
		Click_PreferredMethodofContact_Email.click();
	}

	// Hover:  PreferredMethodofContact_Email
	public void hover_Click_PreferredMethodofContact_Email(){
		Actions action=new Actions(driver); 
		action.moveToElement(Click_PreferredMethodofContact_Email).build().perform();
	}

	// visible or Not :  PreferredMethodofContact_Email
	public boolean isDisplayed_Click_PreferredMethodofContact_Email(){
		if(Click_PreferredMethodofContact_Email.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  PreferredMethodofContact_Email
	public boolean isEnabled_Click_PreferredMethodofContact_Email(){
		if(Click_PreferredMethodofContact_Email.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  PreferredMethodofContact_Email
	public String getCssValue_Click_PreferredMethodofContact_Email(String attribute) {
		return Click_PreferredMethodofContact_Email.getCssValue(attribute);
	}

	//Get the text :  PreferredMethodofContact_Email
	public String getText_Click_PreferredMethodofContact_Email(){
		return Click_PreferredMethodofContact_Email.getText();
	}

	//Get the value :  PreferredMethodofContact_Email
	public String getValue_Click_PreferredMethodofContact_Email(){
		return Click_PreferredMethodofContact_Email.getAttribute("value");
	}
	// selected or Not :  PreferredMethodofContact_Email
	public boolean isSelected_Click_PreferredMethodofContact_Email(){
		if(Click_PreferredMethodofContact_Email.isSelected()) { return true; } else { return false;} 
	}

	//click:  PreferredMethodofContact_Letter
	public void click_Click_PreferredMethodofContact_Letter(){
		Click_PreferredMethodofContact_Letter.click();
	}

	// Hover:  PreferredMethodofContact_Letter
	public void hover_Click_PreferredMethodofContact_Letter(){
		Actions action=new Actions(driver); 
		action.moveToElement(Click_PreferredMethodofContact_Letter).build().perform();
	}

	// visible or Not :  PreferredMethodofContact_Letter
	public boolean isDisplayed_Click_PreferredMethodofContact_Letter(){
		if(Click_PreferredMethodofContact_Letter.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  PreferredMethodofContact_Letter
	public boolean isEnabled_Click_PreferredMethodofContact_Letter(){
		if(Click_PreferredMethodofContact_Letter.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  PreferredMethodofContact_Letter
	public String getCssValue_Click_PreferredMethodofContact_Letter(String attribute) {
		return Click_PreferredMethodofContact_Letter.getCssValue(attribute);
	}

	//Get the text :  PreferredMethodofContact_Letter
	public String getText_Click_PreferredMethodofContact_Letter(){
		return Click_PreferredMethodofContact_Letter.getText();
	}

	//Get the value :  PreferredMethodofContact_Letter
	public String getValue_Click_PreferredMethodofContact_Letter(){
		return Click_PreferredMethodofContact_Letter.getAttribute("value");
	}
	// selected or Not :  PreferredMethodofContact_Letter
	public boolean isSelected_Click_PreferredMethodofContact_Letter(){
		if(Click_PreferredMethodofContact_Letter.isSelected()) { return true; } else { return false;} 
	}

	//click:  PreferredMethodofContact_PreferNoContact
	public void click_Click_PreferredMethodofContact_PreferNoContact(){
		Click_PreferredMethodofContact_PreferNoContact.click();
	}

	// Hover:  PreferredMethodofContact_PreferNoContact
	public void hover_Click_PreferredMethodofContact_PreferNoContact(){
		Actions action=new Actions(driver); 
		action.moveToElement(Click_PreferredMethodofContact_PreferNoContact).build().perform();
	}

	// visible or Not :  PreferredMethodofContact_PreferNoContact
	public boolean isDisplayed_Click_PreferredMethodofContact_PreferNoContact(){
		if(Click_PreferredMethodofContact_PreferNoContact.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  PreferredMethodofContact_PreferNoContact
	public boolean isEnabled_Click_PreferredMethodofContact_PreferNoContact(){
		if(Click_PreferredMethodofContact_PreferNoContact.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  PreferredMethodofContact_PreferNoContact
	public String getCssValue_Click_PreferredMethodofContact_PreferNoContact(String attribute) {
		return Click_PreferredMethodofContact_PreferNoContact.getCssValue(attribute);
	}

	//Get the text :  PreferredMethodofContact_PreferNoContact
	public String getText_Click_PreferredMethodofContact_PreferNoContact(){
		return Click_PreferredMethodofContact_PreferNoContact.getText();
	}

	//Get the value :  PreferredMethodofContact_PreferNoContact
	public String getValue_Click_PreferredMethodofContact_PreferNoContact(){
		return Click_PreferredMethodofContact_PreferNoContact.getAttribute("value");
	}
	// selected or Not :  PreferredMethodofContact_PreferNoContact
	public boolean isSelected_Click_PreferredMethodofContact_PreferNoContact(){
		if(Click_PreferredMethodofContact_PreferNoContact.isSelected()) { return true; } else { return false;} 
	}

	// Type:  PhoneNumber
	public void type_txt_PhoneNumber(String value) {
		txt_PhoneNumber.clear();
		txt_PhoneNumber.sendKeys(value);
	}

	//click:  PhoneNumber
	public void click_txt_PhoneNumber(){
		txt_PhoneNumber.click();
	}

	// Hover:  PhoneNumber
	public void hover_txt_PhoneNumber(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_PhoneNumber).build().perform();
	}

	// visible or Not :  PhoneNumber
	public boolean isDisplayed_txt_PhoneNumber(){
		if(txt_PhoneNumber.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  PhoneNumber
	public boolean isEnabled_txt_PhoneNumber(){
		if(txt_PhoneNumber.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  PhoneNumber
	public String getCssValue_txt_PhoneNumber(String attribute) {
		return txt_PhoneNumber.getCssValue(attribute);
	}

	//Get the text :  PhoneNumber
	public String getText_txt_PhoneNumber(){
		return txt_PhoneNumber.getText();
	}

	//Get the value :  PhoneNumber
	public String getValue_txt_PhoneNumber(){
		return txt_PhoneNumber.getAttribute("value");
	}
	// selected or Not :  PhoneNumber
	public boolean isSelected_txt_PhoneNumber(){
		if(txt_PhoneNumber.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Email
	public void type_txt_Email(String value) {
		txt_Email.clear();
		txt_Email.sendKeys(value);
	}

	//click:  Email
	public void click_txt_Email(){
		txt_Email.click();
	}

	// Hover:  Email
	public void hover_txt_Email(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Email).build().perform();
	}

	// visible or Not :  Email
	public boolean isDisplayed_txt_Email(){
		if(txt_Email.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Email
	public boolean isEnabled_txt_Email(){
		if(txt_Email.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Email
	public String getCssValue_txt_Email(String attribute) {
		return txt_Email.getCssValue(attribute);
	}

	//Get the text :  Email
	public String getText_txt_Email(){
		return txt_Email.getText();
	}

	//Get the value :  Email
	public String getValue_txt_Email(){
		return txt_Email.getAttribute("value");
	}
	// selected or Not :  Email
	public boolean isSelected_txt_Email(){
		if(txt_Email.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Retype Email
	public void type_txt_Retype_Email(String value) {
		txt_Retype_Email.clear();
		txt_Retype_Email.sendKeys(value);
	}

	//click:  Retype Email
	public void click_txt_Retype_Email(){
		txt_Retype_Email.click();
	}

	// Hover:  Retype Email
	public void hover_txt_Retype_Email(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Retype_Email).build().perform();
	}

	// visible or Not :  Retype Email
	public boolean isDisplayed_txt_Retype_Email(){
		if(txt_Retype_Email.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Retype Email
	public boolean isEnabled_txt_Retype_Email(){
		if(txt_Retype_Email.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Retype Email
	public String getCssValue_txt_Retype_Email(String attribute) {
		return txt_Retype_Email.getCssValue(attribute);
	}

	//Get the text :  Retype Email
	public String getText_txt_Retype_Email(){
		return txt_Retype_Email.getText();
	}

	//Get the value :  Retype Email
	public String getValue_txt_Retype_Email(){
		return txt_Retype_Email.getAttribute("value");
	}
	// selected or Not :  Retype Email
	public boolean isSelected_txt_Retype_Email(){
		if(txt_Retype_Email.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Address
	public void type_txt_Address(String value) {
		txt_Address.clear();
		txt_Address.sendKeys(value);
	}

	//click:  Address
	public void click_txt_Address(){
		txt_Address.click();
	}

	// Hover:  Address
	public void hover_txt_Address(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Address).build().perform();
	}

	// visible or Not :  Address
	public boolean isDisplayed_txt_Address(){
		if(txt_Address.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Address
	public boolean isEnabled_txt_Address(){
		if(txt_Address.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Address
	public String getCssValue_txt_Address(String attribute) {
		return txt_Address.getCssValue(attribute);
	}

	//Get the text :  Address
	public String getText_txt_Address(){
		return txt_Address.getText();
	}

	//Get the value :  Address
	public String getValue_txt_Address(){
		return txt_Address.getAttribute("value");
	}
	// selected or Not :  Address
	public boolean isSelected_txt_Address(){
		if(txt_Address.isSelected()) { return true; } else { return false;} 
	}

	// Type:  City
	public void type_txt_City(String value) {
		txt_City.clear();
		txt_City.sendKeys(value);
	}

	//click:  City
	public void click_txt_City(){
		txt_City.click();
	}

	// Hover:  City
	public void hover_txt_City(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_City).build().perform();
	}

	// visible or Not :  City
	public boolean isDisplayed_txt_City(){
		if(txt_City.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  City
	public boolean isEnabled_txt_City(){
		if(txt_City.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  City
	public String getCssValue_txt_City(String attribute) {
		return txt_City.getCssValue(attribute);
	}

	//Get the text :  City
	public String getText_txt_City(){
		return txt_City.getText();
	}

	//Get the value :  City
	public String getValue_txt_City(){
		return txt_City.getAttribute("value");
	}
	// selected or Not :  City
	public boolean isSelected_txt_City(){
		if(txt_City.isSelected()) { return true; } else { return false;} 
	}

// Method to select a value from dropDown :State
	public void select_ddl_State(String value){
		Select Select=new Select(ddl_State);
	Select.selectByVisibleText(value);
	}

	 // Method to retrieve selected value from drop Down :State
	public String get_first_Selected_value_ddl_State(){
		Select Select=new Select(ddl_State);
		return Select.getFirstSelectedOption().getText();
	}

	//click:  State
	public void click_ddl_State(){
		ddl_State.click();
	}

	// Hover:  State
	public void hover_ddl_State(){
		Actions action=new Actions(driver); 
		action.moveToElement(ddl_State).build().perform();
	}

	// visible or Not :  State
	public boolean isDisplayed_ddl_State(){
		if(ddl_State.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  State
	public boolean isEnabled_ddl_State(){
		if(ddl_State.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  State
	public String getCssValue_ddl_State(String attribute) {
		return ddl_State.getCssValue(attribute);
	}

	//Get the text :  State
	public String getText_ddl_State(){
		return ddl_State.getText();
	}

	//Get the value :  State
	public String getValue_ddl_State(){
		return ddl_State.getAttribute("value");
	}
	// selected or Not :  State
	public boolean isSelected_ddl_State(){
		if(ddl_State.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Zip
	public void type_txt_Zip(String value) {
		txt_Zip.clear();
		txt_Zip.sendKeys(value);
	}

	//click:  Zip
	public void click_txt_Zip(){
		txt_Zip.click();
	}

	// Hover:  Zip
	public void hover_txt_Zip(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Zip).build().perform();
	}

	// visible or Not :  Zip
	public boolean isDisplayed_txt_Zip(){
		if(txt_Zip.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Zip
	public boolean isEnabled_txt_Zip(){
		if(txt_Zip.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Zip
	public String getCssValue_txt_Zip(String attribute) {
		return txt_Zip.getCssValue(attribute);
	}

	//Get the text :  Zip
	public String getText_txt_Zip(){
		return txt_Zip.getText();
	}

	//Get the value :  Zip
	public String getValue_txt_Zip(){
		return txt_Zip.getAttribute("value");
	}
	// selected or Not :  Zip
	public boolean isSelected_txt_Zip(){
		if(txt_Zip.isSelected()) { return true; } else { return false;} 
	}

// Method to select a value from dropDown :BestTimetoContact
	public void select_ddl_BestTimetoContact(String value){
		Select Select=new Select(ddl_BestTimetoContact);
	Select.selectByVisibleText(value);
	}

	 // Method to retrieve selected value from drop Down :BestTimetoContact
	public String get_first_Selected_value_ddl_BestTimetoContact(){
		Select Select=new Select(ddl_BestTimetoContact);
		return Select.getFirstSelectedOption().getText();
	}

	//click:  BestTimetoContact
	public void click_ddl_BestTimetoContact(){
		ddl_BestTimetoContact.click();
	}

	// Hover:  BestTimetoContact
	public void hover_ddl_BestTimetoContact(){
		Actions action=new Actions(driver); 
		action.moveToElement(ddl_BestTimetoContact).build().perform();
	}

	// visible or Not :  BestTimetoContact
	public boolean isDisplayed_ddl_BestTimetoContact(){
		if(ddl_BestTimetoContact.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  BestTimetoContact
	public boolean isEnabled_ddl_BestTimetoContact(){
		if(ddl_BestTimetoContact.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  BestTimetoContact
	public String getCssValue_ddl_BestTimetoContact(String attribute) {
		return ddl_BestTimetoContact.getCssValue(attribute);
	}

	//Get the text :  BestTimetoContact
	public String getText_ddl_BestTimetoContact(){
		return ddl_BestTimetoContact.getText();
	}

	//Get the value :  BestTimetoContact
	public String getValue_ddl_BestTimetoContact(){
		return ddl_BestTimetoContact.getAttribute("value");
	}
	// selected or Not :  BestTimetoContact
	public boolean isSelected_ddl_BestTimetoContact(){
		if(ddl_BestTimetoContact.isSelected()) { return true; } else { return false;} 
	}

	//click:  SubjectofEnquiry_Store
	public void click_Click_SubjectofEnquiry_Store(){
		Click_SubjectofEnquiry_Store.click();
	}

	// Hover:  SubjectofEnquiry_Store
	public void hover_Click_SubjectofEnquiry_Store(){
		Actions action=new Actions(driver); 
		action.moveToElement(Click_SubjectofEnquiry_Store).build().perform();
	}

	// visible or Not :  SubjectofEnquiry_Store
	public boolean isDisplayed_Click_SubjectofEnquiry_Store(){
		if(Click_SubjectofEnquiry_Store.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  SubjectofEnquiry_Store
	public boolean isEnabled_Click_SubjectofEnquiry_Store(){
		if(Click_SubjectofEnquiry_Store.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  SubjectofEnquiry_Store
	public String getCssValue_Click_SubjectofEnquiry_Store(String attribute) {
		return Click_SubjectofEnquiry_Store.getCssValue(attribute);
	}

	//Get the text :  SubjectofEnquiry_Store
	public String getText_Click_SubjectofEnquiry_Store(){
		return Click_SubjectofEnquiry_Store.getText();
	}

	//Get the value :  SubjectofEnquiry_Store
	public String getValue_Click_SubjectofEnquiry_Store(){
		return Click_SubjectofEnquiry_Store.getAttribute("value");
	}
	// selected or Not :  SubjectofEnquiry_Store
	public boolean isSelected_Click_SubjectofEnquiry_Store(){
		if(Click_SubjectofEnquiry_Store.isSelected()) { return true; } else { return false;} 
	}

	//click:  SubjectofEnquiry_Product
	public void click_Click_SubjectofEnquiry_Product(){
		Click_SubjectofEnquiry_Product.click();
	}

	// Hover:  SubjectofEnquiry_Product
	public void hover_Click_SubjectofEnquiry_Product(){
		Actions action=new Actions(driver); 
		action.moveToElement(Click_SubjectofEnquiry_Product).build().perform();
	}

	// visible or Not :  SubjectofEnquiry_Product
	public boolean isDisplayed_Click_SubjectofEnquiry_Product(){
		if(Click_SubjectofEnquiry_Product.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  SubjectofEnquiry_Product
	public boolean isEnabled_Click_SubjectofEnquiry_Product(){
		if(Click_SubjectofEnquiry_Product.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  SubjectofEnquiry_Product
	public String getCssValue_Click_SubjectofEnquiry_Product(String attribute) {
		return Click_SubjectofEnquiry_Product.getCssValue(attribute);
	}

	//Get the text :  SubjectofEnquiry_Product
	public String getText_Click_SubjectofEnquiry_Product(){
		return Click_SubjectofEnquiry_Product.getText();
	}

	//Get the value :  SubjectofEnquiry_Product
	public String getValue_Click_SubjectofEnquiry_Product(){
		return Click_SubjectofEnquiry_Product.getAttribute("value");
	}
	// selected or Not :  SubjectofEnquiry_Product
	public boolean isSelected_Click_SubjectofEnquiry_Product(){
		if(Click_SubjectofEnquiry_Product.isSelected()) { return true; } else { return false;} 
	}

	//click:  SubjectofEnquiry_SE_Grocers_reward
	public void click_Click_SubjectofEnquiry_SE_Grocers_reward(){
		Click_SubjectofEnquiry_SE_Grocers_reward.click();
	}

	// Hover:  SubjectofEnquiry_SE_Grocers_reward
	public void hover_Click_SubjectofEnquiry_SE_Grocers_reward(){
		Actions action=new Actions(driver); 
		action.moveToElement(Click_SubjectofEnquiry_SE_Grocers_reward).build().perform();
	}

	// visible or Not :  SubjectofEnquiry_SE_Grocers_reward
	public boolean isDisplayed_Click_SubjectofEnquiry_SE_Grocers_reward(){
		if(Click_SubjectofEnquiry_SE_Grocers_reward.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  SubjectofEnquiry_SE_Grocers_reward
	public boolean isEnabled_Click_SubjectofEnquiry_SE_Grocers_reward(){
		if(Click_SubjectofEnquiry_SE_Grocers_reward.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  SubjectofEnquiry_SE_Grocers_reward
	public String getCssValue_Click_SubjectofEnquiry_SE_Grocers_reward(String attribute) {
		return Click_SubjectofEnquiry_SE_Grocers_reward.getCssValue(attribute);
	}

	//Get the text :  SubjectofEnquiry_SE_Grocers_reward
	public String getText_Click_SubjectofEnquiry_SE_Grocers_reward(){
		return Click_SubjectofEnquiry_SE_Grocers_reward.getText();
	}

	//Get the value :  SubjectofEnquiry_SE_Grocers_reward
	public String getValue_Click_SubjectofEnquiry_SE_Grocers_reward(){
		return Click_SubjectofEnquiry_SE_Grocers_reward.getAttribute("value");
	}
	// selected or Not :  SubjectofEnquiry_SE_Grocers_reward
	public boolean isSelected_Click_SubjectofEnquiry_SE_Grocers_reward(){
		if(Click_SubjectofEnquiry_SE_Grocers_reward.isSelected()) { return true; } else { return false;} 
	}

	//click:  SubjectofEnquiry_Other
	public void click_Click_SubjectofEnquiry_Other(){
		Click_SubjectofEnquiry_Other.click();
	}

	// Hover:  SubjectofEnquiry_Other
	public void hover_Click_SubjectofEnquiry_Other(){
		Actions action=new Actions(driver); 
		action.moveToElement(Click_SubjectofEnquiry_Other).build().perform();
	}

	// visible or Not :  SubjectofEnquiry_Other
	public boolean isDisplayed_Click_SubjectofEnquiry_Other(){
		if(Click_SubjectofEnquiry_Other.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  SubjectofEnquiry_Other
	public boolean isEnabled_Click_SubjectofEnquiry_Other(){
		if(Click_SubjectofEnquiry_Other.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  SubjectofEnquiry_Other
	public String getCssValue_Click_SubjectofEnquiry_Other(String attribute) {
		return Click_SubjectofEnquiry_Other.getCssValue(attribute);
	}

	//Get the text :  SubjectofEnquiry_Other
	public String getText_Click_SubjectofEnquiry_Other(){
		return Click_SubjectofEnquiry_Other.getText();
	}

	//Get the value :  SubjectofEnquiry_Other
	public String getValue_Click_SubjectofEnquiry_Other(){
		return Click_SubjectofEnquiry_Other.getAttribute("value");
	}
	// selected or Not :  SubjectofEnquiry_Other
	public boolean isSelected_Click_SubjectofEnquiry_Other(){
		if(Click_SubjectofEnquiry_Other.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Store Number
	public void type_txt_Store_Number(String value) {
		txt_Store_Number.clear();
		txt_Store_Number.sendKeys(value);
	}

	//click:  Store Number
	public void click_txt_Store_Number(){
		txt_Store_Number.click();
	}

	// Hover:  Store Number
	public void hover_txt_Store_Number(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Store_Number).build().perform();
	}

	// visible or Not :  Store Number
	public boolean isDisplayed_txt_Store_Number(){
		if(txt_Store_Number.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Store Number
	public boolean isEnabled_txt_Store_Number(){
		if(txt_Store_Number.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Store Number
	public String getCssValue_txt_Store_Number(String attribute) {
		return txt_Store_Number.getCssValue(attribute);
	}

	//Get the text :  Store Number
	public String getText_txt_Store_Number(){
		return txt_Store_Number.getText();
	}

	//Get the value :  Store Number
	public String getValue_txt_Store_Number(){
		return txt_Store_Number.getAttribute("value");
	}
	// selected or Not :  Store Number
	public boolean isSelected_txt_Store_Number(){
		if(txt_Store_Number.isSelected()) { return true; } else { return false;} 
	}

	//click:  Search_Button
	public void click_Click_Search_Button(){
		Click_Search_Button.click();
	}

	// Hover:  Search_Button
	public void hover_Click_Search_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(Click_Search_Button).build().perform();
	}

	// visible or Not :  Search_Button
	public boolean isDisplayed_Click_Search_Button(){
		if(Click_Search_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Search_Button
	public boolean isEnabled_Click_Search_Button(){
		if(Click_Search_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Search_Button
	public String getCssValue_Click_Search_Button(String attribute) {
		return Click_Search_Button.getCssValue(attribute);
	}

	//Get the text :  Search_Button
	public String getText_Click_Search_Button(){
		return Click_Search_Button.getText();
	}

	//Get the value :  Search_Button
	public String getValue_Click_Search_Button(){
		return Click_Search_Button.getAttribute("value");
	}
	// selected or Not :  Search_Button
	public boolean isSelected_Click_Search_Button(){
		if(Click_Search_Button.isSelected()) { return true; } else { return false;} 
	}

	// Type:  ProductName_Field
	public void type_txt_ProductName_Field(String value) {
		txt_ProductName_Field.clear();
		txt_ProductName_Field.sendKeys(value);
	}

	//click:  ProductName_Field
	public void click_txt_ProductName_Field(){
		txt_ProductName_Field.click();
	}

	// Hover:  ProductName_Field
	public void hover_txt_ProductName_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_ProductName_Field).build().perform();
	}

	// visible or Not :  ProductName_Field
	public boolean isDisplayed_txt_ProductName_Field(){
		if(txt_ProductName_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  ProductName_Field
	public boolean isEnabled_txt_ProductName_Field(){
		if(txt_ProductName_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  ProductName_Field
	public String getCssValue_txt_ProductName_Field(String attribute) {
		return txt_ProductName_Field.getCssValue(attribute);
	}

	//Get the text :  ProductName_Field
	public String getText_txt_ProductName_Field(){
		return txt_ProductName_Field.getText();
	}

	//Get the value :  ProductName_Field
	public String getValue_txt_ProductName_Field(){
		return txt_ProductName_Field.getAttribute("value");
	}
	// selected or Not :  ProductName_Field
	public boolean isSelected_txt_ProductName_Field(){
		if(txt_ProductName_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  UPCBarCodeNumber_Fileld
	public void type_txt_UPCBarCodeNumber_Fileld(String value) {
		txt_UPCBarCodeNumber_Fileld.clear();
		txt_UPCBarCodeNumber_Fileld.sendKeys(value);
	}

	//click:  UPCBarCodeNumber_Fileld
	public void click_txt_UPCBarCodeNumber_Fileld(){
		txt_UPCBarCodeNumber_Fileld.click();
	}

	// Hover:  UPCBarCodeNumber_Fileld
	public void hover_txt_UPCBarCodeNumber_Fileld(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_UPCBarCodeNumber_Fileld).build().perform();
	}

	// visible or Not :  UPCBarCodeNumber_Fileld
	public boolean isDisplayed_txt_UPCBarCodeNumber_Fileld(){
		if(txt_UPCBarCodeNumber_Fileld.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  UPCBarCodeNumber_Fileld
	public boolean isEnabled_txt_UPCBarCodeNumber_Fileld(){
		if(txt_UPCBarCodeNumber_Fileld.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  UPCBarCodeNumber_Fileld
	public String getCssValue_txt_UPCBarCodeNumber_Fileld(String attribute) {
		return txt_UPCBarCodeNumber_Fileld.getCssValue(attribute);
	}

	//Get the text :  UPCBarCodeNumber_Fileld
	public String getText_txt_UPCBarCodeNumber_Fileld(){
		return txt_UPCBarCodeNumber_Fileld.getText();
	}

	//Get the value :  UPCBarCodeNumber_Fileld
	public String getValue_txt_UPCBarCodeNumber_Fileld(){
		return txt_UPCBarCodeNumber_Fileld.getAttribute("value");
	}
	// selected or Not :  UPCBarCodeNumber_Fileld
	public boolean isSelected_txt_UPCBarCodeNumber_Fileld(){
		if(txt_UPCBarCodeNumber_Fileld.isSelected()) { return true; } else { return false;} 
	}

	//click:  Size_Field
	public void click_Click_Size_Field(){
		Click_Size_Field.click();
	}

	// Hover:  Size_Field
	public void hover_Click_Size_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(Click_Size_Field).build().perform();
	}

	// visible or Not :  Size_Field
	public boolean isDisplayed_Click_Size_Field(){
		if(Click_Size_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Size_Field
	public boolean isEnabled_Click_Size_Field(){
		if(Click_Size_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Size_Field
	public String getCssValue_Click_Size_Field(String attribute) {
		return Click_Size_Field.getCssValue(attribute);
	}

	//Get the text :  Size_Field
	public String getText_Click_Size_Field(){
		return Click_Size_Field.getText();
	}

	//Get the value :  Size_Field
	public String getValue_Click_Size_Field(){
		return Click_Size_Field.getAttribute("value");
	}
	// selected or Not :  Size_Field
	public boolean isSelected_Click_Size_Field(){
		if(Click_Size_Field.isSelected()) { return true; } else { return false;} 
	}

	//click:  SellByDate
	public void click_dtc_SellByDate(){
		dtc_SellByDate.click();
	}

	// Hover:  SellByDate
	public void hover_dtc_SellByDate(){
		Actions action=new Actions(driver); 
		action.moveToElement(dtc_SellByDate).build().perform();
	}

	// visible or Not :  SellByDate
	public boolean isDisplayed_dtc_SellByDate(){
		if(dtc_SellByDate.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  SellByDate
	public boolean isEnabled_dtc_SellByDate(){
		if(dtc_SellByDate.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  SellByDate
	public String getCssValue_dtc_SellByDate(String attribute) {
		return dtc_SellByDate.getCssValue(attribute);
	}

	//Get the text :  SellByDate
	public String getText_dtc_SellByDate(){
		return dtc_SellByDate.getText();
	}

	//Get the value :  SellByDate
	public String getValue_dtc_SellByDate(){
		return dtc_SellByDate.getAttribute("value");
	}
	// selected or Not :  SellByDate
	public boolean isSelected_dtc_SellByDate(){
		if(dtc_SellByDate.isSelected()) { return true; } else { return false;} 
	}

	//click:  Calendar_Button
	public void click_Click_Calendar_Button(){
		Click_Calendar_Button.click();
	}

	// Hover:  Calendar_Button
	public void hover_Click_Calendar_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(Click_Calendar_Button).build().perform();
	}

	// visible or Not :  Calendar_Button
	public boolean isDisplayed_Click_Calendar_Button(){
		if(Click_Calendar_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Calendar_Button
	public boolean isEnabled_Click_Calendar_Button(){
		if(Click_Calendar_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Calendar_Button
	public String getCssValue_Click_Calendar_Button(String attribute) {
		return Click_Calendar_Button.getCssValue(attribute);
	}

	//Get the text :  Calendar_Button
	public String getText_Click_Calendar_Button(){
		return Click_Calendar_Button.getText();
	}

	//Get the value :  Calendar_Button
	public String getValue_Click_Calendar_Button(){
		return Click_Calendar_Button.getAttribute("value");
	}
	// selected or Not :  Calendar_Button
	public boolean isSelected_Click_Calendar_Button(){
		if(Click_Calendar_Button.isSelected()) { return true; } else { return false;} 
	}

	// Type:  CustomerRewardCardNumber_Field
	public void type_txt_CustomerRewardCardNumber_Field(String value) {
		txt_CustomerRewardCardNumber_Field.clear();
		txt_CustomerRewardCardNumber_Field.sendKeys(value);
	}

	//click:  CustomerRewardCardNumber_Field
	public void click_txt_CustomerRewardCardNumber_Field(){
		txt_CustomerRewardCardNumber_Field.click();
	}

	// Hover:  CustomerRewardCardNumber_Field
	public void hover_txt_CustomerRewardCardNumber_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_CustomerRewardCardNumber_Field).build().perform();
	}

	// visible or Not :  CustomerRewardCardNumber_Field
	public boolean isDisplayed_txt_CustomerRewardCardNumber_Field(){
		if(txt_CustomerRewardCardNumber_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  CustomerRewardCardNumber_Field
	public boolean isEnabled_txt_CustomerRewardCardNumber_Field(){
		if(txt_CustomerRewardCardNumber_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  CustomerRewardCardNumber_Field
	public String getCssValue_txt_CustomerRewardCardNumber_Field(String attribute) {
		return txt_CustomerRewardCardNumber_Field.getCssValue(attribute);
	}

	//Get the text :  CustomerRewardCardNumber_Field
	public String getText_txt_CustomerRewardCardNumber_Field(){
		return txt_CustomerRewardCardNumber_Field.getText();
	}

	//Get the value :  CustomerRewardCardNumber_Field
	public String getValue_txt_CustomerRewardCardNumber_Field(){
		return txt_CustomerRewardCardNumber_Field.getAttribute("value");
	}
	// selected or Not :  CustomerRewardCardNumber_Field
	public boolean isSelected_txt_CustomerRewardCardNumber_Field(){
		if(txt_CustomerRewardCardNumber_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Comment_Field
	public void type_txt_Comment_Field(String value) {
		txt_Comment_Field.clear();
		txt_Comment_Field.sendKeys(value);
	}

	//click:  Comment_Field
	public void click_txt_Comment_Field(){
		txt_Comment_Field.click();
	}

	// Hover:  Comment_Field
	public void hover_txt_Comment_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Comment_Field).build().perform();
	}

	// visible or Not :  Comment_Field
	public boolean isDisplayed_txt_Comment_Field(){
		if(txt_Comment_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Comment_Field
	public boolean isEnabled_txt_Comment_Field(){
		if(txt_Comment_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Comment_Field
	public String getCssValue_txt_Comment_Field(String attribute) {
		return txt_Comment_Field.getCssValue(attribute);
	}

	//Get the text :  Comment_Field
	public String getText_txt_Comment_Field(){
		return txt_Comment_Field.getText();
	}

	//Get the value :  Comment_Field
	public String getValue_txt_Comment_Field(){
		return txt_Comment_Field.getAttribute("value");
	}
	// selected or Not :  Comment_Field
	public boolean isSelected_txt_Comment_Field(){
		if(txt_Comment_Field.isSelected()) { return true; } else { return false;} 
	}

	//click:  Submit_Button
	public void click_Click_Submit_Button(){
		Click_Submit_Button.click();
	}

	// Hover:  Submit_Button
	public void hover_Click_Submit_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(Click_Submit_Button).build().perform();
	}

	// visible or Not :  Submit_Button
	public boolean isDisplayed_Click_Submit_Button(){
		if(Click_Submit_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Submit_Button
	public boolean isEnabled_Click_Submit_Button(){
		if(Click_Submit_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Submit_Button
	public String getCssValue_Click_Submit_Button(String attribute) {
		return Click_Submit_Button.getCssValue(attribute);
	}

	//Get the text :  Submit_Button
	public String getText_Click_Submit_Button(){
		return Click_Submit_Button.getText();
	}

	//Get the value :  Submit_Button
	public String getValue_Click_Submit_Button(){
		return Click_Submit_Button.getAttribute("value");
	}
	// selected or Not :  Submit_Button
	public boolean isSelected_Click_Submit_Button(){
		if(Click_Submit_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Contact_Link
	public void click_Click_Contact_Link(){
		Click_Contact_Link.click();
	}

	// Hover:  Contact_Link
	public void hover_Click_Contact_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(Click_Contact_Link).build().perform();
	}

	// visible or Not :  Contact_Link
	public boolean isDisplayed_Click_Contact_Link(){
		if(Click_Contact_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Contact_Link
	public boolean isEnabled_Click_Contact_Link(){
		if(Click_Contact_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Contact_Link
	public String getCssValue_Click_Contact_Link(String attribute) {
		return Click_Contact_Link.getCssValue(attribute);
	}

	//Get the text :  Contact_Link
	public String getText_Click_Contact_Link(){
		return Click_Contact_Link.getText();
	}

	//Get the value :  Contact_Link
	public String getValue_Click_Contact_Link(){
		return Click_Contact_Link.getAttribute("value");
	}
	// selected or Not :  Contact_Link
	public boolean isSelected_Click_Contact_Link(){
		if(Click_Contact_Link.isSelected()) { return true; } else { return false;} 
	}

	// Type:  CommentsandCustomerservice
	public void type_txt_CommentsandCustomerservice(String value) {
		txt_CommentsandCustomerservice.clear();
		txt_CommentsandCustomerservice.sendKeys(value);
	}

	//click:  CommentsandCustomerservice
	public void click_txt_CommentsandCustomerservice(){
		txt_CommentsandCustomerservice.click();
	}

	// Hover:  CommentsandCustomerservice
	public void hover_txt_CommentsandCustomerservice(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_CommentsandCustomerservice).build().perform();
	}

	// visible or Not :  CommentsandCustomerservice
	public boolean isDisplayed_txt_CommentsandCustomerservice(){
		if(txt_CommentsandCustomerservice.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  CommentsandCustomerservice
	public boolean isEnabled_txt_CommentsandCustomerservice(){
		if(txt_CommentsandCustomerservice.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  CommentsandCustomerservice
	public String getCssValue_txt_CommentsandCustomerservice(String attribute) {
		return txt_CommentsandCustomerservice.getCssValue(attribute);
	}

	//Get the text :  CommentsandCustomerservice
	public String getText_txt_CommentsandCustomerservice(){
		return txt_CommentsandCustomerservice.getText();
	}

	//Get the value :  CommentsandCustomerservice
	public String getValue_txt_CommentsandCustomerservice(){
		return txt_CommentsandCustomerservice.getAttribute("value");
	}
	// selected or Not :  CommentsandCustomerservice
	public boolean isSelected_txt_CommentsandCustomerservice(){
		if(txt_CommentsandCustomerservice.isSelected()) { return true; } else { return false;} 
	}

}
