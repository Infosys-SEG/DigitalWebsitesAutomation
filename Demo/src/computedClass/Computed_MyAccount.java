package computedClass;


import java.awt.AWTException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

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
			System.out.println(FirstName1);
			String LastName1=contactinfopage.getValue_txt_Lname_Field();
			String Month1=contactinfopage.getValue_txt_Month_Field();
			String Date1=contactinfopage.getValue_txt_Date_Field();
			String Year1=contactinfopage.getValue_txt_Year_Field();
			String EmailAddress1=myaccountpage.getValue_txt_Email_Address_Field();
			System.out.println(EmailAddress1);
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
				myaccountpage.type_txt_Email_Address_Field(Readexcel_RowName.getValue("EmailAddress"));
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
		try
			{
				if(contactinfopage.isDisplayed_click_TextMeOffers_Yes_Button())
				{
					if (Readexcel_RowName.getValue("Text_Me_Offers(Y/N)")!=null)
					{
					if(Readexcel_RowName.getValue("Text_Me_Offers(Y/N)").equalsIgnoreCase("Y"))
					{
						contactinfopage.click_click_TextMeOffers_Yes_Button();
					}
					else if (Readexcel_RowName.getValue("Text_Me_Offers(Y/N)").equalsIgnoreCase("N"))
					{
						contactinfopage.click_click_TextMeOffers_No_Button();
					}	
					}
				}
			}
			catch(Exception e)
			{
				Reporter.log("Text me offer section is not displayed");
			} 
		
			
			if(Readexcel_RowName.getValue("Password")!=null)
			{
				myaccountpage.type_txt_Set_Password1_Field(Readexcel_RowName.getValue("Password"));
			}
			if(Readexcel_RowName.getValue("Confirm_Password")!=null)
			{
				myaccountpage.type_txt_Set_Password2_Field(Readexcel_RowName.getValue("Confirm_Password"));
			}
			if(Readexcel_RowName.getValue("Pin")!=null)
			{
				myaccountpage.type_txt_Set_Pin1_Field(Readexcel_RowName.getValue("Pin"));
			}	
			if(Readexcel_RowName.getValue("Confirm_Pin")!=null)
			{
				myaccountpage.type_txt_Set_Pin2_Field(Readexcel_RowName.getValue("Confirm_Pin"));
			}
			
			if(opt.equalsIgnoreCase("Save"))
			{
				System.out.println("save");
				myaccountpage.click_click_Save_Button();
				obj.waitForElement(driver, myaccountpage.txt_Saved_Message_Text);
				if(savedmsg.equals(myaccountpage.getText_txt_Saved_Message_Text()))
				{
					//obj.WriteXLSXFile(Functionality, "Hardlogin_Email_Address", 3, myaccountpage.getValue_txt_Email_Address_Field());
					//obj.WriteXLSXFile(Functionality, "EmailAddress", 3, contactinfopage.getValue_txt_Primary_Phone_Number_Field());
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
						if(!Readexcel_RowName.getValue("EmailAddress").equals(myaccountpage.getValue_txt_Email_Address_Field()))
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
						if(!Readexcel_RowName.getValue("State_Code").equals(contactinfopage.getValue_ddl_State_Field()))
						{
							Assert.fail("State has not changed after save");
						}
					}
					if(Readexcel_RowName.getValue("Zip")!=null)
					{
						
						if(!(Readexcel_RowName.getValue("Zip")).contains(contactinfopage.getValue_txt_Zipcode_Field()))
						{
							Assert.fail("Zip has not changed after save");
						}
					}
					/*if(!myaccountpage.getValue_txt_Set_Password1_Field().equalsIgnoreCase(""))
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
					}*/
				}
				else
				{
					Assert.fail("save message is not displaying");
				}	
			}
			else  if(opt.equalsIgnoreCase("Cancel"))
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
					if(!EmailAddress1.equals(myaccountpage.getValue_txt_Email_Address_Field()))
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
	    	System.out.println(e);
	    	Assert.fail("Error in Edit Account Details page");
	    }
		return driver;
	}
	
	public WebDriver MyAccount_ResetPIN(WebDriver driver,String Functionality,String TCName,String opt) throws IOException, InterruptedException, AWTException 
	{
		POM_Generated_MyAccountPage myaccountpage = new POM_Generated_MyAccountPage(driver);
		
		Data obj=new Data();
		
	    try
	    {
			String savedmsg="Your changes have been saved.";
			String cancelmsg="Your changes have not been saved.";
			
			new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
			
			if(Readexcel_RowName.getValue("Pin")!=null)
			{
				System.out.println(Readexcel_RowName.getValue("Pin"));
				myaccountpage.type_txt_Set_Pin1_Field(Readexcel_RowName.getValue("Pin"));
			}	
			if(Readexcel_RowName.getValue("Confirm_Pin")!=null)
			{
				System.out.println(Readexcel_RowName.getValue("Confirm_Pin"));
				myaccountpage.type_txt_Set_Pin2_Field(Readexcel_RowName.getValue("Confirm_Pin"));
				
			}
			
			if(opt.equalsIgnoreCase("Save"))
			{
				myaccountpage.click_click_Save_Button();
				obj.waitForElement(driver, myaccountpage.txt_Saved_Message_Text);
				if(savedmsg.equals(myaccountpage.getText_txt_Saved_Message_Text()))
				{
					Reporter.log("PIN got saved successfully");
				}
				else
				{
					Assert.fail("save message is not displaying");
				}	
			}
			else if(opt.equalsIgnoreCase("Cancel"))
			{
				myaccountpage.click_click_Cancel_Button();
				obj.waitForElement(driver, myaccountpage.txt_Cancel_Message_Text);
				if(cancelmsg.equals(myaccountpage.getText_txt_Cancel_Message_Text()))
				{
					System.out.println(myaccountpage.getValue_txt_Set_Pin1_Field());
					if (myaccountpage.getValue_txt_Set_Pin1_Field()==null)
					{
					Reporter.log("PIN does not get saved after clicking Cancel button");
					}
				}
				else
				{
					Assert.fail("Reset PIN is not cancelled");
				}	
			}
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    	Assert.fail("Error in Reset PIN ");
	    }
		return driver;
	}

	public WebDriver ResetPIN_ErrorMsgValidation(WebDriver driver,String Functionality,String TCName) throws IOException, InterruptedException, AWTException 
	{
		POM_Generated_MyAccountPage myaccountpage = new POM_Generated_MyAccountPage(driver);
		POM_Generated_AccountSecurityPage accountsecuritypage = new POM_Generated_AccountSecurityPage(driver);
		Data obj=new Data();
		 try
		    {
			    new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
				String savedmsg="Your changes have been saved.";
				String cancelmsg="Your changes have not been saved.";
				String PIN_Repeat=Readexcel_RowName.getValue("PIN_Repeat");
				String PIN_Phone=Readexcel_RowName.getValue("PIN_Phone");
				String PIN_EasilyGuessable=Readexcel_RowName.getValue("PIN_EasilyGuessable");
				String PIN_House=Readexcel_RowName.getValue("PIN_House");
				String valid_pin=Readexcel_RowName.getValue("Pin");
				String Confirm_Pin = Readexcel_RowName.getValue("Confirm_Pin");
				String Error_Msg;
				String PIN_CRC = null;
				String PIN_CRC_WD =Readexcel_RowName.getValue("PIN_CRC_WD");
				String PIN_CRC_HY =Readexcel_RowName.getValue("PIN_CRC_HY");
				new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global", Functionality);
				if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
				{	
					 PIN_CRC=PIN_CRC_WD;
				}
				else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
				{	
					 PIN_CRC=PIN_CRC_HY;
				}
				else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
				{
					
					 PIN_CRC=PIN_CRC_HY;
				}
		 
	    // Not Matching PINs error validation
				myaccountpage.type_txt_Set_Pin1_Field(valid_pin);
				myaccountpage.type_txt_Set_Pin1_Field(Confirm_Pin);
				myaccountpage.click_click_Save_Button();
				new Readexcel_RowName().excelRead("ErrorMessageSheet",Functionality,"Error_ConfirmPIN_NotMachingPIN_Msg");
				Error_Msg= Readexcel_RowName.getValue("Error_Message");
				if(myaccountpage.isDisplayed_txt_Error_NotMatchingPIns_Msg())
				    {
				     if(Error_Msg.equals(myaccountpage.getText_txt_Error_NotMatchingPIns_Msg()))
				     {
				     Reporter.log("Error message is displayed when PINs are not matching : "+myaccountpage.getText_txt_Error_NotMatchingPIns_Msg());
					 }
				     else
				     {
				     Assert.fail("Displayed Error Message is not the expected : "+myaccountpage.getText_txt_Error_NotMatchingPIns_Msg()); 
				     }
				     }
					else
					{
						Assert.fail("Error message is not displayed when PINs are not matching :"+myaccountpage.getText_txt_Error_NotMatchingPIns_Msg());
					}	
					myaccountpage.click_click_Cancel_Button();
					
		//Repeating Digit PIN error validation
				obj.waitForElement(driver, myaccountpage.txt_Set_Pin1_Field);	
				myaccountpage.type_txt_Set_Pin1_Field(PIN_Repeat);
				myaccountpage.click_txt_Set_Pin2_Field();
				new Readexcel_RowName().excelRead("ErrorMessageSheet",Functionality,"Error_Pin_Error_RepeatingNumbers_Msg");
				Error_Msg= Readexcel_RowName.getValue("Error_Message");
				if(myaccountpage.isDisplayed_txt_Error_SetPin_Msg())
				    {
					System.out.println(Error_Msg);
					System.out.println(myaccountpage.getText_txt_Error_SetPin_Msg());
				     if(Error_Msg.equals(myaccountpage.getText_txt_Error_SetPin_Msg()))
				     {
				     Reporter.log("Error message is displayed when repeated digits PIN is entered : "+myaccountpage.getText_txt_Error_SetPin_Msg());
				    /* Actions builder = new Actions(driver);
				     builder.moveToElement(myaccountpage.click_Info_Icon).perform();*/
				      if(myaccountpage.click_Info_Icon.isDisplayed())
				      	{
				    	 System.out.println("Pop up");
				    	 Reporter.log("PIN requirement pop up is opened when error message is displayed :"+myaccountpage.getText_txt_Error_Pin_Modal_Msg());
				      	}
				     /* else
				      	{
				    	 Assert.fail("PIN requirement pop up is NOT opened when error message is displayed");
				        }*/
					  }
				     else
				     {
				     Assert.fail("Error message is NOT displayed when repeated digits PIN is entered : "+myaccountpage.getText_txt_Error_Pin_Modal_Msg()); 
				     }
				     }
				else
					{
						Assert.fail("Error message is NOT displayed when repeated digits PIN is entered :"+myaccountpage.getText_txt_Error_Pin_Modal_Msg());
					}	
					myaccountpage.click_click_Cancel_Button();
		//Easily guessable PIN error validation
					obj.waitForElement(driver, myaccountpage.txt_Set_Pin1_Field);	
					myaccountpage.type_txt_Set_Pin1_Field(PIN_EasilyGuessable);
					myaccountpage.click_txt_Set_Pin2_Field();
					new Readexcel_RowName().excelRead("ErrorMessageSheet",Functionality,"Error_Pin_Error_RepeatingNumbers_Msg");
					Error_Msg= Readexcel_RowName.getValue("Error_Message");
					if(myaccountpage.isDisplayed_txt_Error_SetPin_Msg())
					    {
					     if(Error_Msg.equals(myaccountpage.getText_txt_Error_SetPin_Msg()))
					     {
					     Reporter.log(" Error message is displayed when easily guessable digits PIN is entered : "+myaccountpage.getText_txt_Error_SetPin_Msg());
					     
					      if(myaccountpage.isDisplayed_txt_Error_Pin_Modal_Msg())
					      	{
					    	 Reporter.log("PIN requirement pop up is opened when error message is displayed");
					      	}
					      /*else
					      	{
					    	 Assert.fail("PIN requirement pop up is opened when error message is displayed");
					        }*/
						  }
					     else
					     {
					     Assert.fail("Error message is NOT displayed when easily guessable digits PIN is entered : "+myaccountpage.getText_txt_Error_Pin_Modal_Msg()); 
					     }
					     }
					else
						{
							Assert.fail("Error message is NOT displayed when easily guessable digits PIN is entered :"+myaccountpage.getText_txt_Error_Pin_Modal_Msg());
						}	
						myaccountpage.click_click_Cancel_Button();
		//House Number PIN Error Validation
						obj.waitForElement(driver, myaccountpage.txt_Set_Pin1_Field);	
						myaccountpage.type_txt_Set_Pin1_Field(PIN_House);
						myaccountpage.click_txt_Set_Pin2_Field();
						new Readexcel_RowName().excelRead("ErrorMessageSheet",Functionality,"Error_Pin_Error_RepeatingNumbers_Msg");
						Error_Msg= Readexcel_RowName.getValue("Error_Message");
						if(myaccountpage.isDisplayed_txt_Error_SetPin_Msg())
						    {
						     if(Error_Msg.equals(myaccountpage.getText_txt_Error_SetPin_Msg()))
						     {
						     Reporter.log("Error message is displayed when house number is entered as PIN number : "+myaccountpage.getText_txt_Error_SetPin_Msg());
						      if(myaccountpage.isDisplayed_txt_Error_Pin_Modal_Msg())
						      	{
						    	 Reporter.log("PIN requirement pop up is opened when error message is displayed");
						      	}
						      /*else
						      	{
						    	 Assert.fail("PIN requirement pop up is opened when error message is displayed");
						        }*/
							  }
						     else
						     {
						     Assert.fail("Error message is NOT displayed when house number is entered as PIN number : "+myaccountpage.getText_txt_Error_Pin_Modal_Msg()); 
						     }
						     }
						else
							{
								Assert.fail("Error message is NOT displayed when house number is entered as PIN number :"+myaccountpage.getText_txt_Error_Pin_Modal_Msg());
							}	
							myaccountpage.click_click_Cancel_Button();
		//CRC Number PIN Error Validation
							obj.waitForElement(driver, myaccountpage.txt_Set_Pin1_Field);	
							myaccountpage.type_txt_Set_Pin1_Field(PIN_CRC);
							myaccountpage.click_txt_Set_Pin2_Field();
							new Readexcel_RowName().excelRead("ErrorMessageSheet",Functionality,"Error_Pin_Error_RepeatingNumbers_Msg");
							Error_Msg= Readexcel_RowName.getValue("Error_Message");
							if(myaccountpage.isDisplayed_txt_Error_SetPin_Msg())
							    {
							     if(Error_Msg.equals(myaccountpage.getText_txt_Error_SetPin_Msg()))
							     {
							     Reporter.log("Error message is displayed when CRC number is entered as PIN number : "+myaccountpage.getText_txt_Error_SetPin_Msg());
							      if(myaccountpage.isDisplayed_txt_Error_Pin_Modal_Msg())
							      	{
							    	 Reporter.log("PIN requirement pop up is opened when error message is displayed");
							      	}
							      /*else
							      	{
							    	 Assert.fail("PIN requirement pop up is opened when error message is displayed");
							        }*/
								  }
							     else
							     {
							     Assert.fail("Error message is NOT displayed when CRC number is entered as PIN number : "+myaccountpage.getText_txt_Error_Pin_Modal_Msg()); 
							     }
							     }
							else
								{
									Assert.fail("Error message is NOT displayed when CRC number is entered as PIN number :"+myaccountpage.getText_txt_Error_Pin_Modal_Msg());
								}	
								myaccountpage.click_click_Cancel_Button();
			//Phone Number PIN Error Validation
								obj.waitForElement(driver, myaccountpage.txt_Set_Pin1_Field);	
								myaccountpage.type_txt_Set_Pin1_Field(PIN_Phone);
								myaccountpage.click_txt_Set_Pin2_Field();
								new Readexcel_RowName().excelRead("ErrorMessageSheet",Functionality,"Error_Pin_Error_RepeatingNumbers_Msg");
								Error_Msg= Readexcel_RowName.getValue("Error_Message");
								if(myaccountpage.isDisplayed_txt_Error_SetPin_Msg())
								    {
								     if(Error_Msg.equals(myaccountpage.getText_txt_Error_SetPin_Msg()))
								     {
								     Reporter.log("Error message is displayed when phone number is entered as PIN number : "+myaccountpage.getText_txt_Error_SetPin_Msg());
								      if(myaccountpage.isDisplayed_txt_Error_Pin_Modal_Msg())
								      	{
								    	 Reporter.log("PIN requirement pop up is opened when error message is displayed");
								      	}
								      /*else
								      	{
								    	 Assert.fail("PIN requirement pop up is opened when error message is displayed");
								        }*/
									  }
								     else
								     {
								     Assert.fail("Error message is NOT displayed when phone number is entered as PIN number : "+myaccountpage.getText_txt_Error_Pin_Modal_Msg()); 
								     }
								     }
								else
									{
										Assert.fail("Error message is NOT displayed when phone number is entered as PIN number :"+myaccountpage.getText_txt_Error_Pin_Modal_Msg());
									}	
									myaccountpage.click_click_Cancel_Button();
		//Entering Wrong PIN for 3 times
									obj.waitForElement(driver, myaccountpage.txt_Set_Pin1_Field);	
									myaccountpage.type_txt_Set_Pin1_Field(valid_pin);
									myaccountpage.type_txt_Set_Pin2_Field(PIN_Repeat);
									myaccountpage.click_txt_Set_Pin1_Field();
									myaccountpage.type_txt_Set_Pin2_Field(PIN_Phone);
									myaccountpage.click_txt_Set_Pin1_Field();
									myaccountpage.type_txt_Set_Pin2_Field(PIN_House);
									myaccountpage.click_txt_Set_Pin1_Field();
									new Readexcel_RowName().excelRead("ErrorMessageSheet",Functionality,"Error_PIN_Error_After3 attempts_Msg");
									Error_Msg= Readexcel_RowName.getValue("Error_Message");
									if(myaccountpage.isDisplayed_txt_Error_InvalidPins_3Times_Msg())
									    {
									     if(Error_Msg.equals(myaccountpage.getText_txt_Error_InvalidPins_3Times_Msg()))
									     {
									     Reporter.log("Error message is displayed when wrong PIN is entered 3 times : "+myaccountpage.getText_txt_Error_InvalidPins_3Times_Msg());
									      if(myaccountpage.isDisplayed_txt_Error_Pin_Modal_Msg())
									      	{
									    	 Reporter.log("PIN requirement pop up is opened when error message is displayed");
									      	}
									      /*else
									      	{
									    	 Assert.fail("PIN requirement pop up is opened when error message is displayed");
									        }*/
										  }
									     else
									     {
									     Assert.fail("Error message is NOT displayed when wrong PIN is entrered 3 times : "+myaccountpage.getText_txt_Error_Pin_Modal_Msg()); 
									     }
									     }
									else
										{
											Assert.fail("Error message is NOT displayed when phone number is entered as PIN number :"+myaccountpage.getText_txt_Error_Pin_Modal_Msg());
										}	
										myaccountpage.click_click_Cancel_Button();
				
							
		    }
		    catch(Exception e)
		    {
		    	System.out.println(e);
		    	Assert.fail("Error in Reset PIN ");
		    }
			return driver;
	}
		
}
