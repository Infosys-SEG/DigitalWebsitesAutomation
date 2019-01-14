package computedClass;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_ContactUsPage;
import generatedClass.POM_Generated_Homepage;



public class Computed_ContactUs
{
	public WebDriver ContactUs(WebDriver driver,String Functionality,String TCName) throws IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_ContactUsPage contactus = new POM_Generated_ContactUsPage(driver);
		Data obj=new Data();
		String firstname="";
		String lastname="";
		String email="";
		String retypeemail="";
		String segno;
		String comment="";
		
			
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
			firstname=Readexcel_RowName.getValue("FirstName");
			lastname=Readexcel_RowName.getValue("LastName");
			email=Readexcel_RowName.getValue("Email");
			retypeemail=Readexcel_RowName.getValue("Email");
			segno=Readexcel_RowName.getValue("SEGNumber");
			comment=Readexcel_RowName.getValue("Comment");
			WebElement logo = null;
			 
			
			   new Readexcel_RowName().excelRead("Global_TestData_Sheet", "Global", Functionality);
			
				
				if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
				{
					
					logo=homepage.click_Winndixie_logo;
				}
				else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
				{
					
					logo = homepage.click_Bilo_logo;
				}
				else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
				{
					
					logo = homepage.click_Harveys_logo;
				}
					
				
			obj.waitForElement(driver, logo);
			obj.scrollingToElementofAPage(driver, contactus.Click_Contact_Link);
			obj.waitForElement(driver, contactus.Click_Contact_Link);
			if(contactus.isDisplayed_Click_Contact_Link())
			{
				Reporter.log("Contact Link is Present");
				contactus.click_Click_Contact_Link();
				if(contactus.isDisplayed_txt_customercareNumber())
				{
					Reporter.log("Customer service number is displayed");
				}
				else
				{
					Assert.fail("Customer service number is not displayed");
				}
				contactus.type_txt_FirstName(firstname);
				contactus.type_txt_LastName(lastname);
				contactus.click_Click_PreferredMethodofContact_Email();
				contactus.type_txt_Email(email);
				contactus.type_txt_Retype_Email(retypeemail);
				contactus.click_Click_SubjectofEnquiry_SE_Grocers_reward();
				contactus.type_txt_CustomerRewardCardNumber_Field(segno);
				contactus.type_txt_Comment_Field(comment);
				contactus.click_Click_Submit_Button();
				
				if(contactus.isDisplayed_txt_CommentsandCustomerservice())
				{
					
					Reporter.log("Form is submitted successfully");
				
				}
				else
				{
					Assert.fail("Unable to log comment");
				}
			}
			else
			{
				Assert.fail("Link is not present");
			}
			System.out.println("completed");
			
				
			return driver;
		
		
	}

	
							
}
