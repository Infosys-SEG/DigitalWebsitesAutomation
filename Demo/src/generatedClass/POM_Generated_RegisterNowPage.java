//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class POM_Generated_RegisterNowPage { 
	WebDriver driver;
	public POM_Generated_RegisterNowPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : Rewards_Link_hover
	@FindBy(xpath = "//*[@id='rewards']/a")
	public WebElement click_Rewards_Link_hover;
	
	// Associated Label : Register_button
	@FindBy(xpath = "//*[@id='rewards']/ul/li[1]/a")
	public WebElement click_Register_button;
	
	// Associated Label : NeverMiss_Section1
	@FindBy(xpath = "//*[@id='tblBody']/div[2]/div/div/div[1]/div[1]/div/div[2]/div/div[1]")
	public WebElement txt_NeverMiss_Section1;
	
	// Associated Label : SEG_Card_Image
	@FindBy(xpath = "//img[@alt='SEG Rewards Card']")
	public WebElement txt_SEG_Card_Image;
	
	// Associated Label : RegisterNowButton_Section1
	@FindBy(xpath = "//a[text()='Register Now'][1]")
	public WebElement click_RegisterNowButton_Section1;
	
	// Associated Label : Benefits_Section2
	@FindBy(xpath = "//h2[text()='Benefits of becoming a member ']")
	public WebElement txt_Benefits_Section2;
	
	// Associated Label : GoldStatus_Section3
	@FindBy(xpath = "//*[@id='tblBody']/div[2]/div/div/div[1]/div[3]/div[1]/img")
	public WebElement txt_GoldStatus_Section3;
	
	// Associated Label : NeverMiss_Section4
	@FindBy(xpath = "//div[@class='enrollment-enroll_tl'][contains(text(),'Never Miss a Deal with SE Grocers rewards')]")
	public WebElement txt_NeverMiss_Section4;
	
	// Associated Label : RegisterNow_Section4
	@FindBy(xpath = "//*[@id='tblBody']/div[2]/div/div/div[1]/div[5]/p/a")
	public WebElement txt_RegisterNow_Section4;
	
	// Associated Label : Needhelp_txt
	@FindBy(xpath = "//*[@id='tblBody']/div[2]/div/div/div[2]/div/h3")
	public WebElement txt_Needhelp_txt;
	
	// Associated Label : RewardFAQs_link
	@FindBy(xpath = "//a[text()='rewards FAQs']")
	public WebElement Click_RewardFAQs_link;
	
	// Associated Label : Hearder_Text_In_FAQPage
	@FindBy(xpath = "//h1[text()='FAQs']")
	public WebElement txt_Hearder_Text_In_FAQPage;
	

//*******************************************************************************


	// Element Actions


	//click:  Rewards_Link_hover
	public void click_click_Rewards_Link_hover(){
		click_Rewards_Link_hover.click();
	}

	// Hover:  Rewards_Link_hover
	public void hover_click_Rewards_Link_hover(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Rewards_Link_hover).build().perform();
	}

	// visible or Not :  Rewards_Link_hover
	public boolean isDisplayed_click_Rewards_Link_hover(){
		if(click_Rewards_Link_hover.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Rewards_Link_hover
	public boolean isEnabled_click_Rewards_Link_hover(){
		if(click_Rewards_Link_hover.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Rewards_Link_hover
	public String getCssValue_click_Rewards_Link_hover(String attribute) {
		return click_Rewards_Link_hover.getCssValue(attribute);
	}

	//Get the text :  Rewards_Link_hover
	public String getText_click_Rewards_Link_hover(){
		return click_Rewards_Link_hover.getText();
	}

	//Get the value :  Rewards_Link_hover
	public String getValue_click_Rewards_Link_hover(){
		return click_Rewards_Link_hover.getAttribute("value");
	}
	// selected or Not :  Rewards_Link_hover
	public boolean isSelected_click_Rewards_Link_hover(){
		if(click_Rewards_Link_hover.isSelected()) { return true; } else { return false;} 
	}

	//click:  Register_button
	public void click_click_Register_button(){
		click_Register_button.click();
	}

	// Hover:  Register_button
	public void hover_click_Register_button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Register_button).build().perform();
	}

	// visible or Not :  Register_button
	public boolean isDisplayed_click_Register_button(){
		if(click_Register_button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_button
	public boolean isEnabled_click_Register_button(){
		if(click_Register_button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_button
	public String getCssValue_click_Register_button(String attribute) {
		return click_Register_button.getCssValue(attribute);
	}

	//Get the text :  Register_button
	public String getText_click_Register_button(){
		return click_Register_button.getText();
	}

	//Get the value :  Register_button
	public String getValue_click_Register_button(){
		return click_Register_button.getAttribute("value");
	}
	// selected or Not :  Register_button
	public boolean isSelected_click_Register_button(){
		if(click_Register_button.isSelected()) { return true; } else { return false;} 
	}

	// Type:  NeverMiss_Section1
	public void type_txt_NeverMiss_Section1(String value) {
		txt_NeverMiss_Section1.clear();
		txt_NeverMiss_Section1.sendKeys(value);
	}

	//click:  NeverMiss_Section1
	public void click_txt_NeverMiss_Section1(){
		txt_NeverMiss_Section1.click();
	}

	// Hover:  NeverMiss_Section1
	public void hover_txt_NeverMiss_Section1(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_NeverMiss_Section1).build().perform();
	}

	// visible or Not :  NeverMiss_Section1
	public boolean isDisplayed_txt_NeverMiss_Section1(){
		if(txt_NeverMiss_Section1.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  NeverMiss_Section1
	public boolean isEnabled_txt_NeverMiss_Section1(){
		if(txt_NeverMiss_Section1.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  NeverMiss_Section1
	public String getCssValue_txt_NeverMiss_Section1(String attribute) {
		return txt_NeverMiss_Section1.getCssValue(attribute);
	}

	//Get the text :  NeverMiss_Section1
	public String getText_txt_NeverMiss_Section1(){
		return txt_NeverMiss_Section1.getText();
	}

	//Get the value :  NeverMiss_Section1
	public String getValue_txt_NeverMiss_Section1(){
		return txt_NeverMiss_Section1.getAttribute("value");
	}
	// selected or Not :  NeverMiss_Section1
	public boolean isSelected_txt_NeverMiss_Section1(){
		if(txt_NeverMiss_Section1.isSelected()) { return true; } else { return false;} 
	}

	// Type:  SEG_Card_Image
	public void type_txt_SEG_Card_Image(String value) {
		txt_SEG_Card_Image.clear();
		txt_SEG_Card_Image.sendKeys(value);
	}

	//click:  SEG_Card_Image
	public void click_txt_SEG_Card_Image(){
		txt_SEG_Card_Image.click();
	}

	// Hover:  SEG_Card_Image
	public void hover_txt_SEG_Card_Image(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_SEG_Card_Image).build().perform();
	}

	// visible or Not :  SEG_Card_Image
	public boolean isDisplayed_txt_SEG_Card_Image(){
		if(txt_SEG_Card_Image.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  SEG_Card_Image
	public boolean isEnabled_txt_SEG_Card_Image(){
		if(txt_SEG_Card_Image.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  SEG_Card_Image
	public String getCssValue_txt_SEG_Card_Image(String attribute) {
		return txt_SEG_Card_Image.getCssValue(attribute);
	}

	//Get the text :  SEG_Card_Image
	public String getText_txt_SEG_Card_Image(){
		return txt_SEG_Card_Image.getText();
	}

	//Get the value :  SEG_Card_Image
	public String getValue_txt_SEG_Card_Image(){
		return txt_SEG_Card_Image.getAttribute("value");
	}
	// selected or Not :  SEG_Card_Image
	public boolean isSelected_txt_SEG_Card_Image(){
		if(txt_SEG_Card_Image.isSelected()) { return true; } else { return false;} 
	}

	//click:  RegisterNowButton_Section1
	public void click_click_RegisterNowButton_Section1(){
		click_RegisterNowButton_Section1.click();
	}

	// Hover:  RegisterNowButton_Section1
	public void hover_click_RegisterNowButton_Section1(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_RegisterNowButton_Section1).build().perform();
	}

	// visible or Not :  RegisterNowButton_Section1
	public boolean isDisplayed_click_RegisterNowButton_Section1(){
		if(click_RegisterNowButton_Section1.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  RegisterNowButton_Section1
	public boolean isEnabled_click_RegisterNowButton_Section1(){
		if(click_RegisterNowButton_Section1.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  RegisterNowButton_Section1
	public String getCssValue_click_RegisterNowButton_Section1(String attribute) {
		return click_RegisterNowButton_Section1.getCssValue(attribute);
	}

	//Get the text :  RegisterNowButton_Section1
	public String getText_click_RegisterNowButton_Section1(){
		return click_RegisterNowButton_Section1.getText();
	}

	//Get the value :  RegisterNowButton_Section1
	public String getValue_click_RegisterNowButton_Section1(){
		return click_RegisterNowButton_Section1.getAttribute("value");
	}
	// selected or Not :  RegisterNowButton_Section1
	public boolean isSelected_click_RegisterNowButton_Section1(){
		if(click_RegisterNowButton_Section1.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Benefits_Section2
	public void type_txt_Benefits_Section2(String value) {
		txt_Benefits_Section2.clear();
		txt_Benefits_Section2.sendKeys(value);
	}

	//click:  Benefits_Section2
	public void click_txt_Benefits_Section2(){
		txt_Benefits_Section2.click();
	}

	// Hover:  Benefits_Section2
	public void hover_txt_Benefits_Section2(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Benefits_Section2).build().perform();
	}

	// visible or Not :  Benefits_Section2
	public boolean isDisplayed_txt_Benefits_Section2(){
		if(txt_Benefits_Section2.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Benefits_Section2
	public boolean isEnabled_txt_Benefits_Section2(){
		if(txt_Benefits_Section2.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Benefits_Section2
	public String getCssValue_txt_Benefits_Section2(String attribute) {
		return txt_Benefits_Section2.getCssValue(attribute);
	}

	//Get the text :  Benefits_Section2
	public String getText_txt_Benefits_Section2(){
		return txt_Benefits_Section2.getText();
	}

	//Get the value :  Benefits_Section2
	public String getValue_txt_Benefits_Section2(){
		return txt_Benefits_Section2.getAttribute("value");
	}
	// selected or Not :  Benefits_Section2
	public boolean isSelected_txt_Benefits_Section2(){
		if(txt_Benefits_Section2.isSelected()) { return true; } else { return false;} 
	}

	// Type:  GoldStatus_Section3
	public void type_txt_GoldStatus_Section3(String value) {
		txt_GoldStatus_Section3.clear();
		txt_GoldStatus_Section3.sendKeys(value);
	}

	//click:  GoldStatus_Section3
	public void click_txt_GoldStatus_Section3(){
		txt_GoldStatus_Section3.click();
	}

	// Hover:  GoldStatus_Section3
	public void hover_txt_GoldStatus_Section3(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_GoldStatus_Section3).build().perform();
	}

	// visible or Not :  GoldStatus_Section3
	public boolean isDisplayed_txt_GoldStatus_Section3(){
		if(txt_GoldStatus_Section3.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  GoldStatus_Section3
	public boolean isEnabled_txt_GoldStatus_Section3(){
		if(txt_GoldStatus_Section3.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  GoldStatus_Section3
	public String getCssValue_txt_GoldStatus_Section3(String attribute) {
		return txt_GoldStatus_Section3.getCssValue(attribute);
	}

	//Get the text :  GoldStatus_Section3
	public String getText_txt_GoldStatus_Section3(){
		return txt_GoldStatus_Section3.getText();
	}

	//Get the value :  GoldStatus_Section3
	public String getValue_txt_GoldStatus_Section3(){
		return txt_GoldStatus_Section3.getAttribute("value");
	}
	// selected or Not :  GoldStatus_Section3
	public boolean isSelected_txt_GoldStatus_Section3(){
		if(txt_GoldStatus_Section3.isSelected()) { return true; } else { return false;} 
	}

	// Type:  NeverMiss_Section4
	public void type_txt_NeverMiss_Section4(String value) {
		txt_NeverMiss_Section4.clear();
		txt_NeverMiss_Section4.sendKeys(value);
	}

	//click:  NeverMiss_Section4
	public void click_txt_NeverMiss_Section4(){
		txt_NeverMiss_Section4.click();
	}

	// Hover:  NeverMiss_Section4
	public void hover_txt_NeverMiss_Section4(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_NeverMiss_Section4).build().perform();
	}

	// visible or Not :  NeverMiss_Section4
	public boolean isDisplayed_txt_NeverMiss_Section4(){
		if(txt_NeverMiss_Section4.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  NeverMiss_Section4
	public boolean isEnabled_txt_NeverMiss_Section4(){
		if(txt_NeverMiss_Section4.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  NeverMiss_Section4
	public String getCssValue_txt_NeverMiss_Section4(String attribute) {
		return txt_NeverMiss_Section4.getCssValue(attribute);
	}

	//Get the text :  NeverMiss_Section4
	public String getText_txt_NeverMiss_Section4(){
		return txt_NeverMiss_Section4.getText();
	}

	//Get the value :  NeverMiss_Section4
	public String getValue_txt_NeverMiss_Section4(){
		return txt_NeverMiss_Section4.getAttribute("value");
	}
	// selected or Not :  NeverMiss_Section4
	public boolean isSelected_txt_NeverMiss_Section4(){
		if(txt_NeverMiss_Section4.isSelected()) { return true; } else { return false;} 
	}

	// Type:  RegisterNow_Section4
	public void type_txt_RegisterNow_Section4(String value) {
		txt_RegisterNow_Section4.clear();
		txt_RegisterNow_Section4.sendKeys(value);
	}

	//click:  RegisterNow_Section4
	public void click_txt_RegisterNow_Section4(){
		txt_RegisterNow_Section4.click();
	}

	// Hover:  RegisterNow_Section4
	public void hover_txt_RegisterNow_Section4(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_RegisterNow_Section4).build().perform();
	}

	// visible or Not :  RegisterNow_Section4
	public boolean isDisplayed_txt_RegisterNow_Section4(){
		if(txt_RegisterNow_Section4.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  RegisterNow_Section4
	public boolean isEnabled_txt_RegisterNow_Section4(){
		if(txt_RegisterNow_Section4.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  RegisterNow_Section4
	public String getCssValue_txt_RegisterNow_Section4(String attribute) {
		return txt_RegisterNow_Section4.getCssValue(attribute);
	}

	//Get the text :  RegisterNow_Section4
	public String getText_txt_RegisterNow_Section4(){
		return txt_RegisterNow_Section4.getText();
	}

	//Get the value :  RegisterNow_Section4
	public String getValue_txt_RegisterNow_Section4(){
		return txt_RegisterNow_Section4.getAttribute("value");
	}
	// selected or Not :  RegisterNow_Section4
	public boolean isSelected_txt_RegisterNow_Section4(){
		if(txt_RegisterNow_Section4.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Needhelp_txt
	public void type_txt_Needhelp_txt(String value) {
		txt_Needhelp_txt.clear();
		txt_Needhelp_txt.sendKeys(value);
	}

	//click:  Needhelp_txt
	public void click_txt_Needhelp_txt(){
		txt_Needhelp_txt.click();
	}

	// Hover:  Needhelp_txt
	public void hover_txt_Needhelp_txt(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Needhelp_txt).build().perform();
	}

	// visible or Not :  Needhelp_txt
	public boolean isDisplayed_txt_Needhelp_txt(){
		if(txt_Needhelp_txt.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Needhelp_txt
	public boolean isEnabled_txt_Needhelp_txt(){
		if(txt_Needhelp_txt.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Needhelp_txt
	public String getCssValue_txt_Needhelp_txt(String attribute) {
		return txt_Needhelp_txt.getCssValue(attribute);
	}

	//Get the text :  Needhelp_txt
	public String getText_txt_Needhelp_txt(){
		return txt_Needhelp_txt.getText();
	}

	//Get the value :  Needhelp_txt
	public String getValue_txt_Needhelp_txt(){
		return txt_Needhelp_txt.getAttribute("value");
	}
	// selected or Not :  Needhelp_txt
	public boolean isSelected_txt_Needhelp_txt(){
		if(txt_Needhelp_txt.isSelected()) { return true; } else { return false;} 
	}

	//click:  RewardFAQs_link
	public void click_Click_RewardFAQs_link(){
		Click_RewardFAQs_link.click();
	}

	// Hover:  RewardFAQs_link
	public void hover_Click_RewardFAQs_link(){
		Actions action=new Actions(driver); 
		action.moveToElement(Click_RewardFAQs_link).build().perform();
	}

	// visible or Not :  RewardFAQs_link
	public boolean isDisplayed_Click_RewardFAQs_link(){
		if(Click_RewardFAQs_link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  RewardFAQs_link
	public boolean isEnabled_Click_RewardFAQs_link(){
		if(Click_RewardFAQs_link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  RewardFAQs_link
	public String getCssValue_Click_RewardFAQs_link(String attribute) {
		return Click_RewardFAQs_link.getCssValue(attribute);
	}

	//Get the text :  RewardFAQs_link
	public String getText_Click_RewardFAQs_link(){
		return Click_RewardFAQs_link.getText();
	}

	//Get the value :  RewardFAQs_link
	public String getValue_Click_RewardFAQs_link(){
		return Click_RewardFAQs_link.getAttribute("value");
	}
	// selected or Not :  RewardFAQs_link
	public boolean isSelected_Click_RewardFAQs_link(){
		if(Click_RewardFAQs_link.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Hearder_Text_In_FAQPage
	public void type_txt_Hearder_Text_In_FAQPage(String value) {
		txt_Hearder_Text_In_FAQPage.clear();
		txt_Hearder_Text_In_FAQPage.sendKeys(value);
	}

	//click:  Hearder_Text_In_FAQPage
	public void click_txt_Hearder_Text_In_FAQPage(){
		txt_Hearder_Text_In_FAQPage.click();
	}

	// Hover:  Hearder_Text_In_FAQPage
	public void hover_txt_Hearder_Text_In_FAQPage(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Hearder_Text_In_FAQPage).build().perform();
	}

	// visible or Not :  Hearder_Text_In_FAQPage
	public boolean isDisplayed_txt_Hearder_Text_In_FAQPage(){
		if(txt_Hearder_Text_In_FAQPage.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Hearder_Text_In_FAQPage
	public boolean isEnabled_txt_Hearder_Text_In_FAQPage(){
		if(txt_Hearder_Text_In_FAQPage.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Hearder_Text_In_FAQPage
	public String getCssValue_txt_Hearder_Text_In_FAQPage(String attribute) {
		return txt_Hearder_Text_In_FAQPage.getCssValue(attribute);
	}

	//Get the text :  Hearder_Text_In_FAQPage
	public String getText_txt_Hearder_Text_In_FAQPage(){
		return txt_Hearder_Text_In_FAQPage.getText();
	}

	//Get the value :  Hearder_Text_In_FAQPage
	public String getValue_txt_Hearder_Text_In_FAQPage(){
		return txt_Hearder_Text_In_FAQPage.getAttribute("value");
	}
	// selected or Not :  Hearder_Text_In_FAQPage
	public boolean isSelected_txt_Hearder_Text_In_FAQPage(){
		if(txt_Hearder_Text_In_FAQPage.isSelected()) { return true; } else { return false;} 
	}

}
