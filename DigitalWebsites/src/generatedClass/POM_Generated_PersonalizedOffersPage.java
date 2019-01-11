//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_PersonalizedOffersPage { 
	WebDriver driver;
	public POM_Generated_PersonalizedOffersPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : View_Deals_Link
	@FindBy(xpath = "//button[text()='VIEW DEALS']")
	public WebElement click_View_Deals_Link;
	
	// Associated Label : Alloffers_Radio_Button
	@FindBy(xpath = "//input[@value='all']")
	public WebElement click_Alloffers_Radio_Button;
	
	// Associated Label : Hover_Product_Webelement
	@FindBy(xpath = "//*[@type='offer']")
	public WebElement click_Hover_Product_Webelement;
	
	// Associated Label : Hover_Product_List
	@FindBy(xpath = "//*[@type='offer']")
	public WebElement click_Hover_Product_List;
	
	// Associated Label : Product_Add_Button
	@FindBy(xpath = "//img[@alt='Add to List']")
	public WebElement click_Product_Add_Button;
	
	// Associated Label : Product_View_Details_Button
	@FindBy(xpath = "//button[text()='View Details']")
	public WebElement click_Product_View_Details_Button;
	
	// Associated Label : Product_Remove_Button
	@FindBy(xpath = "//img[@alt='Remove from List']")
	public WebElement click_Product_Remove_Button;
	
	// Associated Label : Product_Overlay_AddToList_Button
	@FindBy(xpath = "//button[text()='Add to List']")
	public WebElement click_Product_Overlay_AddToList_Button;
	
	// Associated Label : Product_Overlay_RemoveFromList_Button
	@FindBy(xpath = "//button[text()='Remove from List']")
	public WebElement click_Product_Overlay_RemoveFromList_Button;
	
	// Associated Label : Product_Overlay_Title_Text
	@FindBy(xpath = "//h3[@id='ProductOverlayTitle']")
	public WebElement click_Product_Overlay_Title_Text;
	
	// Associated Label : Product_Overlay_Price_Text
	@FindBy(xpath = "price showFancyPrice")
	public WebElement click_Product_Overlay_Price_Text;
	
	// Associated Label : Product_Overlay_Close_Button
	@FindBy(xpath = "//img[@alt='Close the product overlay']")
	public WebElement click_Product_Overlay_Close_Button;
	
	// Associated Label : Login_Button
	@FindBy(xpath = "//button[text()='Log In' and @action='logInUser']")
	public WebElement click_Login_Button;
	

//*******************************************************************************


	// Element Actions


	//click:  View_Deals_Link
	public void click_click_View_Deals_Link(){
		click_View_Deals_Link.click();
	}

	// Hover:  View_Deals_Link
	public void hover_click_View_Deals_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_View_Deals_Link).build().perform();
	}

	// visible or Not :  View_Deals_Link
	public boolean isDisplayed_click_View_Deals_Link(){
		if(click_View_Deals_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  View_Deals_Link
	public boolean isEnabled_click_View_Deals_Link(){
		if(click_View_Deals_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  View_Deals_Link
	public String getCssValue_click_View_Deals_Link(String attribute) {
		return click_View_Deals_Link.getCssValue(attribute);
	}

	//Get the text :  View_Deals_Link
	public String getText_click_View_Deals_Link(){
		return click_View_Deals_Link.getText();
	}

	//Get the value :  View_Deals_Link
	public String getValue_click_View_Deals_Link(){
		return click_View_Deals_Link.getAttribute("value");
	}
	// selected or Not :  View_Deals_Link
	public boolean isSelected_click_View_Deals_Link(){
		if(click_View_Deals_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Alloffers_Radio_Button
	public void click_click_Alloffers_Radio_Button(){
		click_Alloffers_Radio_Button.click();
	}

	// Hover:  Alloffers_Radio_Button
	public void hover_click_Alloffers_Radio_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Alloffers_Radio_Button).build().perform();
	}

	// visible or Not :  Alloffers_Radio_Button
	public boolean isDisplayed_click_Alloffers_Radio_Button(){
		if(click_Alloffers_Radio_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Alloffers_Radio_Button
	public boolean isEnabled_click_Alloffers_Radio_Button(){
		if(click_Alloffers_Radio_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Alloffers_Radio_Button
	public String getCssValue_click_Alloffers_Radio_Button(String attribute) {
		return click_Alloffers_Radio_Button.getCssValue(attribute);
	}

	//Get the text :  Alloffers_Radio_Button
	public String getText_click_Alloffers_Radio_Button(){
		return click_Alloffers_Radio_Button.getText();
	}

	//Get the value :  Alloffers_Radio_Button
	public String getValue_click_Alloffers_Radio_Button(){
		return click_Alloffers_Radio_Button.getAttribute("value");
	}
	// selected or Not :  Alloffers_Radio_Button
	public boolean isSelected_click_Alloffers_Radio_Button(){
		if(click_Alloffers_Radio_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Hover_Product_Webelement
	public void click_click_Hover_Product_Webelement(){
		click_Hover_Product_Webelement.click();
	}

	// Hover:  Hover_Product_Webelement
	public void hover_click_Hover_Product_Webelement(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Hover_Product_Webelement).build().perform();
	}

	// visible or Not :  Hover_Product_Webelement
	public boolean isDisplayed_click_Hover_Product_Webelement(){
		if(click_Hover_Product_Webelement.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Hover_Product_Webelement
	public boolean isEnabled_click_Hover_Product_Webelement(){
		if(click_Hover_Product_Webelement.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Hover_Product_Webelement
	public String getCssValue_click_Hover_Product_Webelement(String attribute) {
		return click_Hover_Product_Webelement.getCssValue(attribute);
	}

	//Get the text :  Hover_Product_Webelement
	public String getText_click_Hover_Product_Webelement(){
		return click_Hover_Product_Webelement.getText();
	}

	//Get the value :  Hover_Product_Webelement
	public String getValue_click_Hover_Product_Webelement(){
		return click_Hover_Product_Webelement.getAttribute("value");
	}
	// selected or Not :  Hover_Product_Webelement
	public boolean isSelected_click_Hover_Product_Webelement(){
		if(click_Hover_Product_Webelement.isSelected()) { return true; } else { return false;} 
	}

	//click:  Hover_Product_List
	public void click_click_Hover_Product_List(){
		click_Hover_Product_List.click();
	}

	// Hover:  Hover_Product_List
	public void hover_click_Hover_Product_List(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Hover_Product_List).build().perform();
	}

	// visible or Not :  Hover_Product_List
	public boolean isDisplayed_click_Hover_Product_List(){
		if(click_Hover_Product_List.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Hover_Product_List
	public boolean isEnabled_click_Hover_Product_List(){
		if(click_Hover_Product_List.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Hover_Product_List
	public String getCssValue_click_Hover_Product_List(String attribute) {
		return click_Hover_Product_List.getCssValue(attribute);
	}

	//Get the text :  Hover_Product_List
	public String getText_click_Hover_Product_List(){
		return click_Hover_Product_List.getText();
	}

	//Get the value :  Hover_Product_List
	public String getValue_click_Hover_Product_List(){
		return click_Hover_Product_List.getAttribute("value");
	}
	// selected or Not :  Hover_Product_List
	public boolean isSelected_click_Hover_Product_List(){
		if(click_Hover_Product_List.isSelected()) { return true; } else { return false;} 
	}

	//click:  Product_Add_Button
	public void click_click_Product_Add_Button(){
		click_Product_Add_Button.click();
	}

	// Hover:  Product_Add_Button
	public void hover_click_Product_Add_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Product_Add_Button).build().perform();
	}

	// visible or Not :  Product_Add_Button
	public boolean isDisplayed_click_Product_Add_Button(){
		if(click_Product_Add_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Product_Add_Button
	public boolean isEnabled_click_Product_Add_Button(){
		if(click_Product_Add_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Product_Add_Button
	public String getCssValue_click_Product_Add_Button(String attribute) {
		return click_Product_Add_Button.getCssValue(attribute);
	}

	//Get the text :  Product_Add_Button
	public String getText_click_Product_Add_Button(){
		return click_Product_Add_Button.getText();
	}

	//Get the value :  Product_Add_Button
	public String getValue_click_Product_Add_Button(){
		return click_Product_Add_Button.getAttribute("value");
	}
	// selected or Not :  Product_Add_Button
	public boolean isSelected_click_Product_Add_Button(){
		if(click_Product_Add_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Product_View_Details_Button
	public void click_click_Product_View_Details_Button(){
		click_Product_View_Details_Button.click();
	}

	// Hover:  Product_View_Details_Button
	public void hover_click_Product_View_Details_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Product_View_Details_Button).build().perform();
	}

	// visible or Not :  Product_View_Details_Button
	public boolean isDisplayed_click_Product_View_Details_Button(){
		if(click_Product_View_Details_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Product_View_Details_Button
	public boolean isEnabled_click_Product_View_Details_Button(){
		if(click_Product_View_Details_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Product_View_Details_Button
	public String getCssValue_click_Product_View_Details_Button(String attribute) {
		return click_Product_View_Details_Button.getCssValue(attribute);
	}

	//Get the text :  Product_View_Details_Button
	public String getText_click_Product_View_Details_Button(){
		return click_Product_View_Details_Button.getText();
	}

	//Get the value :  Product_View_Details_Button
	public String getValue_click_Product_View_Details_Button(){
		return click_Product_View_Details_Button.getAttribute("value");
	}
	// selected or Not :  Product_View_Details_Button
	public boolean isSelected_click_Product_View_Details_Button(){
		if(click_Product_View_Details_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Product_Remove_Button
	public void click_click_Product_Remove_Button(){
		click_Product_Remove_Button.click();
	}

	// Hover:  Product_Remove_Button
	public void hover_click_Product_Remove_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Product_Remove_Button).build().perform();
	}

	// visible or Not :  Product_Remove_Button
	public boolean isDisplayed_click_Product_Remove_Button(){
		if(click_Product_Remove_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Product_Remove_Button
	public boolean isEnabled_click_Product_Remove_Button(){
		if(click_Product_Remove_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Product_Remove_Button
	public String getCssValue_click_Product_Remove_Button(String attribute) {
		return click_Product_Remove_Button.getCssValue(attribute);
	}

	//Get the text :  Product_Remove_Button
	public String getText_click_Product_Remove_Button(){
		return click_Product_Remove_Button.getText();
	}

	//Get the value :  Product_Remove_Button
	public String getValue_click_Product_Remove_Button(){
		return click_Product_Remove_Button.getAttribute("value");
	}
	// selected or Not :  Product_Remove_Button
	public boolean isSelected_click_Product_Remove_Button(){
		if(click_Product_Remove_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Product_Overlay_AddToList_Button
	public void click_click_Product_Overlay_AddToList_Button(){
		click_Product_Overlay_AddToList_Button.click();
	}

	// Hover:  Product_Overlay_AddToList_Button
	public void hover_click_Product_Overlay_AddToList_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Product_Overlay_AddToList_Button).build().perform();
	}

	// visible or Not :  Product_Overlay_AddToList_Button
	public boolean isDisplayed_click_Product_Overlay_AddToList_Button(){
		if(click_Product_Overlay_AddToList_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Product_Overlay_AddToList_Button
	public boolean isEnabled_click_Product_Overlay_AddToList_Button(){
		if(click_Product_Overlay_AddToList_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Product_Overlay_AddToList_Button
	public String getCssValue_click_Product_Overlay_AddToList_Button(String attribute) {
		return click_Product_Overlay_AddToList_Button.getCssValue(attribute);
	}

	//Get the text :  Product_Overlay_AddToList_Button
	public String getText_click_Product_Overlay_AddToList_Button(){
		return click_Product_Overlay_AddToList_Button.getText();
	}

	//Get the value :  Product_Overlay_AddToList_Button
	public String getValue_click_Product_Overlay_AddToList_Button(){
		return click_Product_Overlay_AddToList_Button.getAttribute("value");
	}
	// selected or Not :  Product_Overlay_AddToList_Button
	public boolean isSelected_click_Product_Overlay_AddToList_Button(){
		if(click_Product_Overlay_AddToList_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Product_Overlay_RemoveFromList_Button
	public void click_click_Product_Overlay_RemoveFromList_Button(){
		click_Product_Overlay_RemoveFromList_Button.click();
	}

	// Hover:  Product_Overlay_RemoveFromList_Button
	public void hover_click_Product_Overlay_RemoveFromList_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Product_Overlay_RemoveFromList_Button).build().perform();
	}

	// visible or Not :  Product_Overlay_RemoveFromList_Button
	public boolean isDisplayed_click_Product_Overlay_RemoveFromList_Button(){
		if(click_Product_Overlay_RemoveFromList_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Product_Overlay_RemoveFromList_Button
	public boolean isEnabled_click_Product_Overlay_RemoveFromList_Button(){
		if(click_Product_Overlay_RemoveFromList_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Product_Overlay_RemoveFromList_Button
	public String getCssValue_click_Product_Overlay_RemoveFromList_Button(String attribute) {
		return click_Product_Overlay_RemoveFromList_Button.getCssValue(attribute);
	}

	//Get the text :  Product_Overlay_RemoveFromList_Button
	public String getText_click_Product_Overlay_RemoveFromList_Button(){
		return click_Product_Overlay_RemoveFromList_Button.getText();
	}

	//Get the value :  Product_Overlay_RemoveFromList_Button
	public String getValue_click_Product_Overlay_RemoveFromList_Button(){
		return click_Product_Overlay_RemoveFromList_Button.getAttribute("value");
	}
	// selected or Not :  Product_Overlay_RemoveFromList_Button
	public boolean isSelected_click_Product_Overlay_RemoveFromList_Button(){
		if(click_Product_Overlay_RemoveFromList_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Product_Overlay_Title_Text
	public void click_click_Product_Overlay_Title_Text(){
		click_Product_Overlay_Title_Text.click();
	}

	// Hover:  Product_Overlay_Title_Text
	public void hover_click_Product_Overlay_Title_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Product_Overlay_Title_Text).build().perform();
	}

	// visible or Not :  Product_Overlay_Title_Text
	public boolean isDisplayed_click_Product_Overlay_Title_Text(){
		if(click_Product_Overlay_Title_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Product_Overlay_Title_Text
	public boolean isEnabled_click_Product_Overlay_Title_Text(){
		if(click_Product_Overlay_Title_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Product_Overlay_Title_Text
	public String getCssValue_click_Product_Overlay_Title_Text(String attribute) {
		return click_Product_Overlay_Title_Text.getCssValue(attribute);
	}

	//Get the text :  Product_Overlay_Title_Text
	public String getText_click_Product_Overlay_Title_Text(){
		return click_Product_Overlay_Title_Text.getText();
	}

	//Get the value :  Product_Overlay_Title_Text
	public String getValue_click_Product_Overlay_Title_Text(){
		return click_Product_Overlay_Title_Text.getAttribute("value");
	}
	// selected or Not :  Product_Overlay_Title_Text
	public boolean isSelected_click_Product_Overlay_Title_Text(){
		if(click_Product_Overlay_Title_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  Product_Overlay_Price_Text
	public void click_click_Product_Overlay_Price_Text(){
		click_Product_Overlay_Price_Text.click();
	}

	// Hover:  Product_Overlay_Price_Text
	public void hover_click_Product_Overlay_Price_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Product_Overlay_Price_Text).build().perform();
	}

	// visible or Not :  Product_Overlay_Price_Text
	public boolean isDisplayed_click_Product_Overlay_Price_Text(){
		if(click_Product_Overlay_Price_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Product_Overlay_Price_Text
	public boolean isEnabled_click_Product_Overlay_Price_Text(){
		if(click_Product_Overlay_Price_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Product_Overlay_Price_Text
	public String getCssValue_click_Product_Overlay_Price_Text(String attribute) {
		return click_Product_Overlay_Price_Text.getCssValue(attribute);
	}

	//Get the text :  Product_Overlay_Price_Text
	public String getText_click_Product_Overlay_Price_Text(){
		return click_Product_Overlay_Price_Text.getText();
	}

	//Get the value :  Product_Overlay_Price_Text
	public String getValue_click_Product_Overlay_Price_Text(){
		return click_Product_Overlay_Price_Text.getAttribute("value");
	}
	// selected or Not :  Product_Overlay_Price_Text
	public boolean isSelected_click_Product_Overlay_Price_Text(){
		if(click_Product_Overlay_Price_Text.isSelected()) { return true; } else { return false;} 
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

	//click:  Login_Button
	public void click_click_Login_Button(){
		click_Login_Button.click();
	}

	// Hover:  Login_Button
	public void hover_click_Login_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Login_Button).build().perform();
	}

	// visible or Not :  Login_Button
	public boolean isDisplayed_click_Login_Button(){
		if(click_Login_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Login_Button
	public boolean isEnabled_click_Login_Button(){
		if(click_Login_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Login_Button
	public String getCssValue_click_Login_Button(String attribute) {
		return click_Login_Button.getCssValue(attribute);
	}

	//Get the text :  Login_Button
	public String getText_click_Login_Button(){
		return click_Login_Button.getText();
	}

	//Get the value :  Login_Button
	public String getValue_click_Login_Button(){
		return click_Login_Button.getAttribute("value");
	}
	// selected or Not :  Login_Button
	public boolean isSelected_click_Login_Button(){
		if(click_Login_Button.isSelected()) { return true; } else { return false;} 
	}

}
