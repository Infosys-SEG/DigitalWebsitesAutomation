package computedClass;


import java.awt.AWTException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_AccountSecurityPage;
import generatedClass.POM_Generated_ContactInfoPage;
import generatedClass.POM_Generated_Homepage;
import generatedClass.POM_Generated_MyAccountPage;
import generatedClass.POM_Generated_StaticInfoBar;

public class Computed_MyAccount 
{
	public WebDriver Loggedin_MyAccountpage(WebDriver driver,String Functionality,String TCName,String opt) throws IOException, InterruptedException, AWTException 
	{
		POM_Generated_MyAccountPage myaccountpage = new POM_Generated_MyAccountPage(driver);
		POM_Generated_ContactInfoPage  contactinfopage = new POM_Generated_ContactInfoPage(driver);
		POM_Generated_AccountSecurityPage accountsecuritypage = new POM_Generated_AccountSecurityPage(driver);
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		POM_Generated_StaticInfoBar staticinfobar = new POM_Generated_StaticInfoBar(driver);
		Data obj=new Data();
		
	    try
	    {
			String savedmsg="Your changes have been saved.";
			String cancelmsg="Your changes have not been saved.";
			
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
			
			obj.waitForElement(driver, contactinfopage.txt_Fname_Field);
			String Salutation1=contactinfopage.getValue_ddl_Salutation_Field();
			String FirstName1=contactinfopage.getValue_txt_Fname_Field();
			String LastName1=contactinfopage.getValue_txt_Lname_Field();
			String Month1=contactinfopage.getValue_txt_Month_Field();
			String Date1=contactinfopage.getValue_txt_Date_Field();
			String Year1=contactinfopage.getValue_txt_Year_Field();
			String EmailAddress1=accountsecuritypage.getValue_txt_Email_Address_Field();
			String Address11=contactinfopage.getValue_txt_Address_Field();
			String Address12=contactinfopage.getValue_txt_Additional_Address_Field();
			String Primary_Phone_Number=contactinfopage.getValue_txt_Primary_Phone_Number_Field();
			String City1=contactinfopage.getValue_txt_City_Field();
			String State1=contactinfopage.getValue_ddl_State_Field();
			String Zip1=contactinfopage.getValue_txt_Zipcode_Field();
			if (Readexcel_RowName.getValue("Salutation")!=null)
			{
				contactinfopage.select_ddl_Salutation_Field(Readexcel_RowName.getValue("Salutation"));
			}
			if (Readexcel_RowName.getValue("FirstName")!=null)
			{
				contactinfopage.type_txt_Fname_Field(Readexcel_RowName.getValue("FirstName"));
			}
			if (Readexcel_RowName.getValue("LastName")!=null)
			{
				contactinfopage.type_txt_Lname_Field(Readexcel_RowName.getValue("LastName"));
			}
			obj.scrollingToElementofAPage(driver, contactinfopage.txt_Month_Field);
			if (Readexcel_RowName.getValue("Month")!=null)
			{
				contactinfopage.type_txt_Month_Field(Readexcel_RowName.getValue("Month"));
			}
			if (Readexcel_RowName.getValue("Date")!=null)
			{
				contactinfopage.type_txt_Date_Field(Readexcel_RowName.getValue("Date"));
			}
			if (Readexcel_RowName.getValue("Year")!=null)
			{
				contactinfopage.type_txt_Year_Field(Readexcel_RowName.getValue("Year"));
			}
			
			if (Readexcel_RowName.getValue("EmailAddress")!=null)
			{
				accountsecuritypage.type_txt_Email_Address_Field(Readexcel_RowName.getValue("EmailAddress"));
			}
			if (Readexcel_RowName.getValue("Address1")!=null)
			{
				contactinfopage.type_txt_Address_Field(Readexcel_RowName.getValue("Address1"));
			}
			if (Readexcel_RowName.getValue("Address2")!=null)
			{
				contactinfopage.type_txt_Additional_Address_Field(Readexcel_RowName.getValue("Address2"));
			}
			
			if (Readexcel_RowName.getValue("Primary_Phone")!=null)
			{
				contactinfopage.type_txt_Primary_Phone_Number_Field(Readexcel_RowName.getValue("Primary_Phone"));
			}
			if (Readexcel_RowName.getValue("City")!=null)
			{
				contactinfopage.type_txt_City_Field(Readexcel_RowName.getValue("City"));
			}
			if (Readexcel_RowName.getValue("State")!=null)
			{
				contactinfopage.select_ddl_State_Field(Readexcel_RowName.getValue("State"));
			}
			if (Readexcel_RowName.getValue("Zip")!=null)
			{
				contactinfopage.type_txt_Zipcode_Field(Readexcel_RowName.getValue("Zip"));
			}
			if (Readexcel_RowName.getValue("save_coupons_ContactInfo(Y/N)")!=null)
			{
				if(Readexcel_RowName.getValue("save_coupons_ContactInfo(Y/N)").equalsIgnoreCase("Y"))
				{
					contactinfopage.click_click_TextMeOffers_Yes_Button();
				}
				else if (Readexcel_RowName.getValue("save_coupons_ContactInfo(Y/N)").equalsIgnoreCase("N"))
				{
					contactinfopage.click_click_TextMeOffers_No_Button();
				}	
			}
			
			
			if(Readexcel_RowName.getValue("Password")!=null)
			{
				accountsecuritypage.type_txt_Set_Password1_Field(Readexcel_RowName.getValue("Password"));
			}
			if(Readexcel_RowName.getValue("Confirm_Password")!=null)
			{
				accountsecuritypage.type_txt_Set_Password2_Field(Readexcel_RowName.getValue("Confirm_Password"));
			}
			if(Readexcel_RowName.getValue("Pin")!=null)
			{
				accountsecuritypage.type_txt_Set_Pin1_Field(Readexcel_RowName.getValue("Pin"));
			}	
			if(Readexcel_RowName.getValue("Confirm_Pin")!=null)
			{
				accountsecuritypage.type_txt_Set_Pin2_Field(Readexcel_RowName.getValue("Confirm_Pin"));
			}
			if(Readexcel_RowName.getValue(opt).equalsIgnoreCase("Save"))
			{
				myaccountpage.click_click_Save_Button();
				obj.waitForElement(driver, myaccountpage.txt_Saved_Message_Text);
				if(savedmsg.equals(myaccountpage.getText_txt_Saved_Message_Text()))
				{
					new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global",Functionality);
					if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
					{
						homepage.click_click_Winndixie_logo();
					}
					if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
					{
						homepage.click_click_Bilo_logo();
					}
					if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
					{
						homepage.click_click_Harveys_logo();
					}
					obj.waitForElementClickable(driver, staticinfobar.click_Static_info_My_Account_Link);
					staticinfobar.click_click_Static_info_My_Account_Link();
					obj.waitForElementClickable(driver, contactinfopage.txt_Fname_Field);
					new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
					if(Readexcel_RowName.getValue("Salutation")!=null)
					{
						if(!Readexcel_RowName.getValue("Salutation").equals(contactinfopage.getValue_ddl_Salutation_Field()))
						{
							Assert.fail("Salutation has not changed after save");
						}
					}
					if(Readexcel_RowName.getValue("FirstName")!=null)
					{
						if(!Readexcel_RowName.getValue("FirstName").equals(contactinfopage.getValue_txt_Fname_Field()))
						{
							Assert.fail("FirstName has not changed after save");
						}
					}
					if(Readexcel_RowName.getValue("LastName")!=null)
					{
						if(!Readexcel_RowName.getValue("LastName").equals(contactinfopage.getValue_txt_Lname_Field()))
						{
							Assert.fail("LastName has not changed after save");
						}
					}
					if(Readexcel_RowName.getValue("Month")!=null)
					{
						if(!Readexcel_RowName.getValue("Month").equals(contactinfopage.getValue_txt_Month_Field()))
						{
							Assert.fail("Month has not changed after save");
						}
					}
					if(Readexcel_RowName.getValue("Date")!=null)
					{
						if(!Readexcel_RowName.getValue("Date").equals(contactinfopage.getValue_txt_Date_Field()))
						{
							Assert.fail("Date has not changed after save");
						}
					}
					if(Readexcel_RowName.getValue("Year")!=null)
					{
						if(!Readexcel_RowName.getValue("Year").equals(contactinfopage.getValue_txt_Year_Field()))
						{
							Assert.fail("Year has not changed after save");
						}
					}
					if(Readexcel_RowName.getValue("EmailAddress")!=null)
					{
						if(!Readexcel_RowName.getValue("EmailAddress").equals(accountsecuritypage.getValue_txt_Email_Address_Field()))
						{
							Assert.fail("EmailAddress has not changed after save");
						}
					}
					if(Readexcel_RowName.getValue("Address1")!=null)
					{
						if(!Readexcel_RowName.getValue("Address1").equals(contactinfopage.getValue_txt_Address_Field()))
						{
							Assert.fail("Address1 has not changed after save");
						}
					}
					if(Readexcel_RowName.getValue("Address2")!=null)
					{
						if(!Readexcel_RowName.getValue("Address2").equals(contactinfopage.getValue_txt_Additional_Address_Field()))
						{
							Assert.fail("Address2 has not changed after save");
						}
					}
					if (Readexcel_RowName.getValue("Primary_Phone")!=null)
					{
						if(!Readexcel_RowName.getValue("Primary_Phone").equals(contactinfopage.getValue_txt_Primary_Phone_Number_Field()))
						{
							Assert.fail("Primary_Phone has not changed after save");
						}
					}
					if(Readexcel_RowName.getValue("City")!=null)
					{
						if(!Readexcel_RowName.getValue("City").equals(contactinfopage.getValue_txt_City_Field()))
						{
							Assert.fail("City has not changed after save");
						}
					}
					if(Readexcel_RowName.getValue("State")!=null)
					{
						if(!Readexcel_RowName.getValue("State").equals(contactinfopage.getValue_ddl_State_Field()))
						{
							Assert.fail("State has not changed after save");
						}
					}
					if(Readexcel_RowName.getValue("Zip")!=null)
					{
						if(!Readexcel_RowName.getValue("Zip").equals(contactinfopage.getValue_txt_Zipcode_Field()))
						{
							Assert.fail("Zip has not changed after save");
						}
					}
					if(!myaccountpage.getValue_txt_Set_Password1_Field().equalsIgnoreCase(""))
					{
						Assert.fail("Password1 is displaying some values after saved");
					}
					if(!myaccountpage.getValue_txt_Set_Password2_Field().equalsIgnoreCase(""))
					{
						Assert.fail("Password2 is displaying some values after saved");
					}
					if(!myaccountpage.getValue_txt_Set_Pin1_Field().equalsIgnoreCase(""))
					{
						Assert.fail("Pin1 is displaying some values after saved");
					}
					if(!myaccountpage.getValue_txt_Set_Pin2_Field().equalsIgnoreCase(""))
					{
						Assert.fail("Pin2 is displaying some values after saved");
					}
				}
				else
				{
					Assert.fail("Your changes have been saved. message is not displaying");
				}	
			}
			else if(Readexcel_RowName.getValue(opt).equalsIgnoreCase("Cancel"))
			{
				myaccountpage.click_click_Cancel_Button();
				obj.waitForElement(driver, myaccountpage.txt_Cancel_Message_Text);
				if(cancelmsg.equals(myaccountpage.getText_txt_Cancel_Message_Text()))
				{
					if(!Salutation1.equals(contactinfopage.getValue_ddl_Salutation_Field()))
					{
						Assert.fail("salutation has changed for cancel");
					}
					if(!FirstName1.equals(contactinfopage.getValue_txt_Fname_Field()))
					{
						Assert.fail("FirstName has changed for cancel");
					}
					if(!LastName1.equals(contactinfopage.getValue_txt_Lname_Field()))
					{
						Assert.fail("LastName has changed for cancel");
					}
					if(!Month1.equals(contactinfopage.getValue_txt_Month_Field()))
					{
						Assert.fail("Month has changed for cancel");
					}
					if(!Date1.equals(contactinfopage.getValue_txt_Date_Field()))
					{
						Assert.fail("Date has changed for cancel");
					}
					if(!Year1.equals(contactinfopage.getValue_txt_Year_Field()))
					{
						Assert.fail("Year has changed for cancel");
					}
					if(!EmailAddress1.equals(accountsecuritypage.getValue_txt_Email_Address_Field()))
					{
						Assert.fail("EmailAddress has changed for cancel");
					}
					if(!Address11.equals(contactinfopage.getValue_txt_Address_Field()))
					{
						Assert.fail("Address1 has changed for cancel");
					}
					if(!Address12.equals(contactinfopage.getValue_txt_Additional_Address_Field()))
					{
						Assert.fail("Address2 has changed for cancel");
					}
					if(!Primary_Phone_Number.equals(contactinfopage.getValue_txt_Primary_Phone_Number_Field()))
					{
						Assert.fail("Primary_Phone_Number has changed for cancel");
					}
					if(!City1.equals(contactinfopage.getValue_txt_City_Field()))
					{
						Assert.fail("City has changed for cancel");
					}
					if(!State1.equals(contactinfopage.getValue_ddl_State_Field()))
					{
						Assert.fail("State has changed for cancel");
					}
					if(!Zip1.equals(contactinfopage.getValue_txt_Zipcode_Field()))
					{
						Assert.fail("Zip has changed for cancel");
					}
					if(!myaccountpage.getValue_txt_Set_Password1_Field().equalsIgnoreCase(""))
					{
						Assert.fail("Password1 is displaying some values after cancel");
					}
					if(!myaccountpage.getValue_txt_Set_Password2_Field().equalsIgnoreCase(""))
					{
						Assert.fail("Password2 is displaying some values after cancel");
					}
					if(!myaccountpage.getValue_txt_Set_Pin1_Field().equalsIgnoreCase(""))
					{
						Assert.fail("Pin1 is displaying some values after cancel");
					}
					if(!myaccountpage.getValue_txt_Set_Pin2_Field().equalsIgnoreCase(""))
					{
						Assert.fail("Pin2 is displaying some values after cancel");
					}
				}
				else
				{
					Assert.fail("Your changes have been not saved. message is not displaying");
				}	
			}
	    }
	    catch(Exception e)
	    {
	    	Assert.fail("Error in Edit Account Details page");
	    }
		return driver;
	}
}
