//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POM_Generated_StoreLocatorPage { 
	WebDriver driver;
	public POM_Generated_StoreLocatorPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : Storelocation_Button
	@FindBy(xpath = "//span[text()='Store locations']")
	public WebElement click_Storelocation_Button;
	
	// Associated Label : Fuellocation_Button
	@FindBy(xpath = "//span[text()='Fuel locations']")
	public WebElement click_Fuellocation_Button;
	
	// Associated Label : Enter_Zip_Or_City_Field
	@FindBy(id = "txtStoreQuery")
	public WebElement txt_Enter_Zip_Or_City_Field;
	
	// Associated Label : Search_Button
	@FindBy(id = "btnSearchStore")
	public WebElement click_Search_Button;
	
	// Associated Label : Radius_Dropdown
	@FindBy(id = "ddlRadious")
	public WebElement ddl_Radius_Dropdown;
	
	// Associated Label : View_Store_Details_Button
	@FindBy(xpath = "//a[text()='View store details'][1]")
	public WebElement click_View_Store_Details_Button;
	
	// Associated Label : Make_My_store_Button
	@FindBy(xpath = "//button[@id='btnMyStore'][1]")
	public WebElement click_Make_My_store_Button;
	
	// Associated Label : StreetAddr_Text
	@FindBy(xpath = "//span[@itemprop='streetAddress']")
	public WebElement txt_StreetAddr_Text;
	
	// Associated Label : Home_Button
	@FindBy(xpath = "//a[text()='Home ']")
	public WebElement click_Home_Button;
	
	// Associated Label : Invalid_Store_Error_Text
	@FindBy(xpath = "//div[@class='errorParagraph']")
	public WebElement click_Invalid_Store_Error_Text;
	

//*******************************************************************************


	// Element Actions


	//click:  Storelocation_Button
	public void click_click_Storelocation_Button(){
		click_Storelocation_Button.click();
	}

	// Hover:  Storelocation_Button
	public void hover_click_Storelocation_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Storelocation_Button).build().perform();
	}

	// visible or Not :  Storelocation_Button
	public boolean isDisplayed_click_Storelocation_Button(){
		if(click_Storelocation_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Storelocation_Button
	public boolean isEnabled_click_Storelocation_Button(){
		if(click_Storelocation_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Storelocation_Button
	public String getCssValue_click_Storelocation_Button(String attribute) {
		return click_Storelocation_Button.getCssValue(attribute);
	}

	//Get the text :  Storelocation_Button
	public String getText_click_Storelocation_Button(){
		return click_Storelocation_Button.getText();
	}

	//Get the value :  Storelocation_Button
	public String getValue_click_Storelocation_Button(){
		return click_Storelocation_Button.getAttribute("value");
	}
	// selected or Not :  Storelocation_Button
	public boolean isSelected_click_Storelocation_Button(){
		if(click_Storelocation_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Fuellocation_Button
	public void click_click_Fuellocation_Button(){
		click_Fuellocation_Button.click();
	}

	// Hover:  Fuellocation_Button
	public void hover_click_Fuellocation_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Fuellocation_Button).build().perform();
	}

	// visible or Not :  Fuellocation_Button
	public boolean isDisplayed_click_Fuellocation_Button(){
		if(click_Fuellocation_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Fuellocation_Button
	public boolean isEnabled_click_Fuellocation_Button(){
		if(click_Fuellocation_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Fuellocation_Button
	public String getCssValue_click_Fuellocation_Button(String attribute) {
		return click_Fuellocation_Button.getCssValue(attribute);
	}

	//Get the text :  Fuellocation_Button
	public String getText_click_Fuellocation_Button(){
		return click_Fuellocation_Button.getText();
	}

	//Get the value :  Fuellocation_Button
	public String getValue_click_Fuellocation_Button(){
		return click_Fuellocation_Button.getAttribute("value");
	}
	// selected or Not :  Fuellocation_Button
	public boolean isSelected_click_Fuellocation_Button(){
		if(click_Fuellocation_Button.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Enter_Zip_Or_City_Field
	public void type_txt_Enter_Zip_Or_City_Field(String value) {
		txt_Enter_Zip_Or_City_Field.clear();
		txt_Enter_Zip_Or_City_Field.sendKeys(value);
	}

	//click:  Enter_Zip_Or_City_Field
	public void click_txt_Enter_Zip_Or_City_Field(){
		txt_Enter_Zip_Or_City_Field.click();
	}

	// Hover:  Enter_Zip_Or_City_Field
	public void hover_txt_Enter_Zip_Or_City_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Enter_Zip_Or_City_Field).build().perform();
	}

	// visible or Not :  Enter_Zip_Or_City_Field
	public boolean isDisplayed_txt_Enter_Zip_Or_City_Field(){
		if(txt_Enter_Zip_Or_City_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Enter_Zip_Or_City_Field
	public boolean isEnabled_txt_Enter_Zip_Or_City_Field(){
		if(txt_Enter_Zip_Or_City_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Enter_Zip_Or_City_Field
	public String getCssValue_txt_Enter_Zip_Or_City_Field(String attribute) {
		return txt_Enter_Zip_Or_City_Field.getCssValue(attribute);
	}

	//Get the text :  Enter_Zip_Or_City_Field
	public String getText_txt_Enter_Zip_Or_City_Field(){
		return txt_Enter_Zip_Or_City_Field.getText();
	}

	//Get the value :  Enter_Zip_Or_City_Field
	public String getValue_txt_Enter_Zip_Or_City_Field(){
		return txt_Enter_Zip_Or_City_Field.getAttribute("value");
	}
	// selected or Not :  Enter_Zip_Or_City_Field
	public boolean isSelected_txt_Enter_Zip_Or_City_Field(){
		if(txt_Enter_Zip_Or_City_Field.isSelected()) { return true; } else { return false;} 
	}

	//click:  Search_Button
	public void click_click_Search_Button(){
		click_Search_Button.click();
	}

	// Hover:  Search_Button
	public void hover_click_Search_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Search_Button).build().perform();
	}

	// visible or Not :  Search_Button
	public boolean isDisplayed_click_Search_Button(){
		if(click_Search_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Search_Button
	public boolean isEnabled_click_Search_Button(){
		if(click_Search_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Search_Button
	public String getCssValue_click_Search_Button(String attribute) {
		return click_Search_Button.getCssValue(attribute);
	}

	//Get the text :  Search_Button
	public String getText_click_Search_Button(){
		return click_Search_Button.getText();
	}

	//Get the value :  Search_Button
	public String getValue_click_Search_Button(){
		return click_Search_Button.getAttribute("value");
	}
	// selected or Not :  Search_Button
	public boolean isSelected_click_Search_Button(){
		if(click_Search_Button.isSelected()) { return true; } else { return false;} 
	}

// Method to select a value from dropDown :Radius_Dropdown
	public void select_ddl_Radius_Dropdown(String value){
		Select Select=new Select(ddl_Radius_Dropdown);
	Select.selectByVisibleText(value);
	}

	 // Method to retrieve selected value from drop Down :Radius_Dropdown
	public String get_first_Selected_value_ddl_Radius_Dropdown(){
		Select Select=new Select(ddl_Radius_Dropdown);
		return Select.getFirstSelectedOption().getText();
	}

	//click:  Radius_Dropdown
	public void click_ddl_Radius_Dropdown(){
		ddl_Radius_Dropdown.click();
	}

	// Hover:  Radius_Dropdown
	public void hover_ddl_Radius_Dropdown(){
		Actions action=new Actions(driver); 
		action.moveToElement(ddl_Radius_Dropdown).build().perform();
	}

	// visible or Not :  Radius_Dropdown
	public boolean isDisplayed_ddl_Radius_Dropdown(){
		if(ddl_Radius_Dropdown.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Radius_Dropdown
	public boolean isEnabled_ddl_Radius_Dropdown(){
		if(ddl_Radius_Dropdown.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Radius_Dropdown
	public String getCssValue_ddl_Radius_Dropdown(String attribute) {
		return ddl_Radius_Dropdown.getCssValue(attribute);
	}

	//Get the text :  Radius_Dropdown
	public String getText_ddl_Radius_Dropdown(){
		return ddl_Radius_Dropdown.getText();
	}

	//Get the value :  Radius_Dropdown
	public String getValue_ddl_Radius_Dropdown(){
		return ddl_Radius_Dropdown.getAttribute("value");
	}
	// selected or Not :  Radius_Dropdown
	public boolean isSelected_ddl_Radius_Dropdown(){
		if(ddl_Radius_Dropdown.isSelected()) { return true; } else { return false;} 
	}

	//click:  View_Store_Details_Button
	public void click_click_View_Store_Details_Button(){
		click_View_Store_Details_Button.click();
	}

	// Hover:  View_Store_Details_Button
	public void hover_click_View_Store_Details_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_View_Store_Details_Button).build().perform();
	}

	// visible or Not :  View_Store_Details_Button
	public boolean isDisplayed_click_View_Store_Details_Button(){
		if(click_View_Store_Details_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  View_Store_Details_Button
	public boolean isEnabled_click_View_Store_Details_Button(){
		if(click_View_Store_Details_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  View_Store_Details_Button
	public String getCssValue_click_View_Store_Details_Button(String attribute) {
		return click_View_Store_Details_Button.getCssValue(attribute);
	}

	//Get the text :  View_Store_Details_Button
	public String getText_click_View_Store_Details_Button(){
		return click_View_Store_Details_Button.getText();
	}

	//Get the value :  View_Store_Details_Button
	public String getValue_click_View_Store_Details_Button(){
		return click_View_Store_Details_Button.getAttribute("value");
	}
	// selected or Not :  View_Store_Details_Button
	public boolean isSelected_click_View_Store_Details_Button(){
		if(click_View_Store_Details_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Make_My_store_Button
	public void click_click_Make_My_store_Button(){
		click_Make_My_store_Button.click();
	}

	// Hover:  Make_My_store_Button
	public void hover_click_Make_My_store_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Make_My_store_Button).build().perform();
	}

	// visible or Not :  Make_My_store_Button
	public boolean isDisplayed_click_Make_My_store_Button(){
		if(click_Make_My_store_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Make_My_store_Button
	public boolean isEnabled_click_Make_My_store_Button(){
		if(click_Make_My_store_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Make_My_store_Button
	public String getCssValue_click_Make_My_store_Button(String attribute) {
		return click_Make_My_store_Button.getCssValue(attribute);
	}

	//Get the text :  Make_My_store_Button
	public String getText_click_Make_My_store_Button(){
		return click_Make_My_store_Button.getText();
	}

	//Get the value :  Make_My_store_Button
	public String getValue_click_Make_My_store_Button(){
		return click_Make_My_store_Button.getAttribute("value");
	}
	// selected or Not :  Make_My_store_Button
	public boolean isSelected_click_Make_My_store_Button(){
		if(click_Make_My_store_Button.isSelected()) { return true; } else { return false;} 
	}

	// Type:  StreetAddr_Text
	public void type_txt_StreetAddr_Text(String value) {
		txt_StreetAddr_Text.clear();
		txt_StreetAddr_Text.sendKeys(value);
	}

	//click:  StreetAddr_Text
	public void click_txt_StreetAddr_Text(){
		txt_StreetAddr_Text.click();
	}

	// Hover:  StreetAddr_Text
	public void hover_txt_StreetAddr_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_StreetAddr_Text).build().perform();
	}

	// visible or Not :  StreetAddr_Text
	public boolean isDisplayed_txt_StreetAddr_Text(){
		if(txt_StreetAddr_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  StreetAddr_Text
	public boolean isEnabled_txt_StreetAddr_Text(){
		if(txt_StreetAddr_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  StreetAddr_Text
	public String getCssValue_txt_StreetAddr_Text(String attribute) {
		return txt_StreetAddr_Text.getCssValue(attribute);
	}

	//Get the text :  StreetAddr_Text
	public String getText_txt_StreetAddr_Text(){
		return txt_StreetAddr_Text.getText();
	}

	//Get the value :  StreetAddr_Text
	public String getValue_txt_StreetAddr_Text(){
		return txt_StreetAddr_Text.getAttribute("value");
	}
	// selected or Not :  StreetAddr_Text
	public boolean isSelected_txt_StreetAddr_Text(){
		if(txt_StreetAddr_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  Home_Button
	public void click_click_Home_Button(){
		click_Home_Button.click();
	}

	// Hover:  Home_Button
	public void hover_click_Home_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Home_Button).build().perform();
	}

	// visible or Not :  Home_Button
	public boolean isDisplayed_click_Home_Button(){
		if(click_Home_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Home_Button
	public boolean isEnabled_click_Home_Button(){
		if(click_Home_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Home_Button
	public String getCssValue_click_Home_Button(String attribute) {
		return click_Home_Button.getCssValue(attribute);
	}

	//Get the text :  Home_Button
	public String getText_click_Home_Button(){
		return click_Home_Button.getText();
	}

	//Get the value :  Home_Button
	public String getValue_click_Home_Button(){
		return click_Home_Button.getAttribute("value");
	}
	// selected or Not :  Home_Button
	public boolean isSelected_click_Home_Button(){
		if(click_Home_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Invalid_Store_Error_Text
	public void click_click_Invalid_Store_Error_Text(){
		click_Invalid_Store_Error_Text.click();
	}

	// Hover:  Invalid_Store_Error_Text
	public void hover_click_Invalid_Store_Error_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Invalid_Store_Error_Text).build().perform();
	}

	// visible or Not :  Invalid_Store_Error_Text
	public boolean isDisplayed_click_Invalid_Store_Error_Text(){
		if(click_Invalid_Store_Error_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Invalid_Store_Error_Text
	public boolean isEnabled_click_Invalid_Store_Error_Text(){
		if(click_Invalid_Store_Error_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Invalid_Store_Error_Text
	public String getCssValue_click_Invalid_Store_Error_Text(String attribute) {
		return click_Invalid_Store_Error_Text.getCssValue(attribute);
	}

	//Get the text :  Invalid_Store_Error_Text
	public String getText_click_Invalid_Store_Error_Text(){
		return click_Invalid_Store_Error_Text.getText();
	}

	//Get the value :  Invalid_Store_Error_Text
	public String getValue_click_Invalid_Store_Error_Text(){
		return click_Invalid_Store_Error_Text.getAttribute("value");
	}
	// selected or Not :  Invalid_Store_Error_Text
	public boolean isSelected_click_Invalid_Store_Error_Text(){
		if(click_Invalid_Store_Error_Text.isSelected()) { return true; } else { return false;} 
	}

}
