package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_AccountLookupPage;
import generatedClass.POM_Generated_AccountSecurityPage;
import generatedClass.POM_Generated_Homepage;
import generatedClass.POM_Generated_MyAccountPage;

public class Computed_SecurityInfo_ErrorValidation 
{
	public WebDriver ResetPassword_ErrorMsgValidation(WebDriver driver,String Functionality,String TCName) throws IOException, InterruptedException, AWTException 
	{
		POM_Generated_AccountSecurityPage acctSecurity= new POM_Generated_AccountSecurityPage(driver);
		
		 try
		    {
			    new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
				String Pwd_Lessthan8Digits=Readexcel_RowName.getValue("Pwd_Lessthan8Digits");
				String Pwd_Greaterthan16Digits=Readexcel_RowName.getValue("Pwd_Greaterthan16Digits");
				String Pwd_NoCaps=Readexcel_RowName.getValue("Pwd_NoCaps");
				String Pwd_NoNumber=Readexcel_RowName.getValue("Pwd_NoNumber");
				String Pwd_NoLower=Readexcel_RowName.getValue("Pwd_NoLower");
				String Password = Readexcel_RowName.getValue("Password");
				String Confirm_Password = Readexcel_RowName.getValue("Confirm_Password");
				String Error_Msg;
			
	    // Not Matching Passwords error validation
				acctSecurity.type_txt_Set_Password1_Field(Password);
				acctSecurity.type_txt_Set_Password2_Field(Confirm_Password);
				acctSecurity.click_txt_Set_Password1_Field();
				new Readexcel_RowName().excelRead("ErrorMessageSheet",Functionality,"Error_NotMatching_Passwords");
				Error_Msg= Readexcel_RowName.getValue("Error_Message");
				if(acctSecurity.isDisplayed_txt_Error_NotSamePwds_Msg())
				    {
				     if(Error_Msg.equals(acctSecurity.getText_txt_Error_NotSamePwds_Msg()))
				     {
				     Reporter.log("Error message is displayed when Passwords are not matching : "+acctSecurity.getText_txt_Error_NotSamePwds_Msg());
					 }
				     else
				     {
				     Assert.fail("Displayed Error Message is not the expected : "+acctSecurity.getText_txt_Error_NotSamePwds_Msg()); 
				     }    
				    }
					else
					{
						Assert.fail("Error message is not displayed when Passwords are not matching :"+acctSecurity.getText_txt_Error_NotSamePwds_Msg());
					}	
		      	
	   // Password is less than 8 digit
				acctSecurity.type_txt_Set_Password2_Field(" ");
				acctSecurity.type_txt_Set_Password1_Field(Pwd_Lessthan8Digits);
				acctSecurity.click_txt_Set_Password2_Field();
				new Readexcel_RowName().excelRead("ErrorMessageSheet",Functionality,"Error_Password_Requirement");
				Error_Msg= Readexcel_RowName.getValue("Error_Message");
				if(acctSecurity.isDisplayed_txt_Error_SetPassword_Info_Msg())
				    {
				     if(Error_Msg.equals(acctSecurity.getText_txt_Error_SetPassword_Info_Msg()))
				     {
				     Reporter.log("Error message is displayed when Password is less than 8 digits : "+acctSecurity.getText_txt_Error_SetPassword_Info_Msg());
					 }
				     else
				     {
				     Assert.fail("Displayed Error Message is not the expected : "+acctSecurity.getText_txt_Error_SetPassword_Info_Msg()); 
				     }    
				    }
					else
					{
						Assert.fail("Error message is not displayed when Password is less than 8 digits :"+acctSecurity.getText_txt_Error_SetPassword_Info_Msg());
					}	
		      	
		 // Password is greater than 16 digits
				acctSecurity.type_txt_Set_Password1_Field(Pwd_Greaterthan16Digits);
				acctSecurity.click_txt_Set_Password2_Field();
				if(acctSecurity.isDisplayed_txt_Error_SetPassword_Info_Msg())
				    {
				     if(Error_Msg.equals(acctSecurity.getText_txt_Error_SetPassword_Info_Msg()))
				     {
				     Reporter.log("Error message is displayed when Password is more than 16 digits : "+acctSecurity.getText_txt_Error_SetPassword_Info_Msg());
					 }
				     else
				     {
				     Assert.fail("Displayed Error Message is not the expected : "+acctSecurity.getText_txt_Error_SetPassword_Info_Msg()); 
				     }    
				    }
					else
					{
						Assert.fail("Error message is not displayed when Password is more than 16 digits :"+acctSecurity.getText_txt_Error_SetPassword_Info_Msg());
					}	
		      	
	    // Password does not have capital letter
				acctSecurity.type_txt_Set_Password1_Field(Pwd_NoCaps);
				acctSecurity.click_txt_Set_Password2_Field();
				if(acctSecurity.isDisplayed_txt_Error_SetPassword_Info_Msg())
				    {
				     if(Error_Msg.equals(acctSecurity.getText_txt_Error_SetPassword_Info_Msg()))
				     {
				     Reporter.log("Error message is displayed when Password does not have any capital letter : "+acctSecurity.getText_txt_Error_SetPassword_Info_Msg());
					 }
				     else
				     {
				     Assert.fail("Displayed Error Message is not the expected : "+acctSecurity.getText_txt_Error_SetPassword_Info_Msg()); 
				     }    
				    }
					else
					{
						Assert.fail("Error message is not displayed when Password doesnt have any capital letter :"+acctSecurity.getText_txt_Error_SetPassword_Info_Msg());
					}	
		     
	  // Password does not have number
				acctSecurity.type_txt_Set_Password1_Field(Pwd_NoNumber);
				acctSecurity.click_txt_Set_Password2_Field();
				if(acctSecurity.isDisplayed_txt_Error_SetPassword_Info_Msg())
				    {
				     if(Error_Msg.equals(acctSecurity.getText_txt_Error_SetPassword_Info_Msg()))
				     {
				     Reporter.log("Error message is displayed when Password does not have any number : "+acctSecurity.getText_txt_Error_SetPassword_Info_Msg());
					 }
				     else
				     {
				     Assert.fail("Displayed Error Message is not the expected : "+acctSecurity.getText_txt_Error_SetPassword_Info_Msg()); 
				     }    
				    }
					else
					{
						Assert.fail("Error message is not displayed when Password doesnt have any number :"+acctSecurity.getText_txt_Error_SetPassword_Info_Msg());
					}	
		        // Password does not have lower letter
				acctSecurity.type_txt_Set_Password1_Field(Pwd_NoLower);
				acctSecurity.click_txt_Set_Password2_Field();
				if(acctSecurity.isDisplayed_txt_Error_SetPassword_Info_Msg())
				    {
				     if(Error_Msg.equals(acctSecurity.getText_txt_Error_SetPassword_Info_Msg()))
				     {
				     Reporter.log("Error message is displayed when Password does not have any lower letter : "+acctSecurity.getText_txt_Error_SetPassword_Info_Msg());
					 }
				     else
				     {
				     Assert.fail("Displayed Error Message is not the expected : "+acctSecurity.getText_txt_Error_SetPassword_Info_Msg()); 
				     }    
				    }
					else
					{
						Assert.fail("Error message is not displayed when Password doesnt have any lower letter :"+acctSecurity.getText_txt_Error_SetPassword_Info_Msg());
					}	
	      }
					 catch(Exception e)
					    {
					    	System.out.println(e);
					    	Assert.fail("Error in Reset Password ");
					    }
						return driver;
	}
	public WebDriver ResetPIN_ErrorMsgValidation(WebDriver driver,String Functionality,String TCName) throws IOException, InterruptedException, AWTException 
	{
		POM_Generated_AccountSecurityPage acctSecurity= new POM_Generated_AccountSecurityPage(driver);
		Data obj=new Data();
		 try
		    {
			    new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
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
				obj.waitForElement(driver, acctSecurity.txt_Email_Address_Field);
				acctSecurity.type_txt_Set_Pin1_Field(valid_pin);
				acctSecurity.type_txt_Set_Pin2_Field(Confirm_Pin);
				acctSecurity.click_txt_Set_Pin1_Field();
				new Readexcel_RowName().excelRead("ErrorMessageSheet",Functionality,"Error_ConfirmPIN_NotMachingPIN_Msg");
				Error_Msg= Readexcel_RowName.getValue("Error_Message");
				if(acctSecurity.isDisplayed_txt_Error_NotSamePINs_Msg())
				    {
				     if(Error_Msg.equals(acctSecurity.getText_txt_Error_NotSamePINs_Msg()))
				     {
				     Reporter.log("Error message is displayed when PINs are not matching : "+acctSecurity.getText_txt_Error_NotSamePINs_Msg());
					 }
				     else
				     {
				     Assert.fail("Displayed Error Message is not the expected : "+acctSecurity.getText_txt_Error_NotSamePINs_Msg()); 
				     }
				     }
					else
					{
						Assert.fail("Error message is not displayed when PINs are not matching :"+acctSecurity.getText_txt_Error_NotSamePINs_Msg());
					}	
		//Repeating Digit PIN error validation
				acctSecurity.type_txt_Set_Pin2_Field("");
				acctSecurity.type_txt_Set_Pin1_Field(PIN_Repeat);
				acctSecurity.click_txt_Set_Pin2_Field();
				new Readexcel_RowName().excelRead("ErrorMessageSheet",Functionality,"Error_Pin_Error_RepeatingNumbers_Msg");
				Error_Msg= Readexcel_RowName.getValue("Error_Message");
				if(acctSecurity.isDisplayed_txt_Error_SetPIN_Info_Msg())
				    {
					System.out.println(Error_Msg);
					System.out.println(acctSecurity.getText_txt_Error_SetPIN_Info_Msg());
				     if(Error_Msg.equals(acctSecurity.getText_txt_Error_SetPIN_Info_Msg()))
				     {
				     Reporter.log("Error message is displayed when repeated digits PIN is entered : "+acctSecurity.getText_txt_Error_SetPIN_Info_Msg());
				    /* Actions builder = new Actions(driver);
				     builder.moveToElement(myaccountpage.click_Info_Icon).perform();*/
				     /* if(acctSecurity.click_Info_Icon.isDisplayed())
				      	{
				    	 System.out.println("Pop up");
				    	 Reporter.log("PIN requirement pop up is opened when error message is displayed :"+acctSecurity.getText_click_Info_Icon());
				      	}
				    */ /* else
				      	{
				    	 Assert.fail("PIN requirement pop up is NOT opened when error message is displayed");
				        }*/
					  }
				     else
				     {
				     Assert.fail("Error message is NOT displayed when repeated digits PIN is entered : "+acctSecurity.getText_txt_Error_SetPIN_Info_Msg()); 
				     }
				     }
				else
					{
						Assert.fail("Error message is NOT displayed when repeated digits PIN is entered :"+acctSecurity.getText_txt_Error_SetPIN_Info_Msg());
					}	
		//Easily guessable PIN error validation
					acctSecurity.type_txt_Set_Pin1_Field(PIN_EasilyGuessable);
					acctSecurity.click_txt_Set_Pin2_Field();
					new Readexcel_RowName().excelRead("ErrorMessageSheet",Functionality,"Error_Pin_Error_RepeatingNumbers_Msg");
					Error_Msg= Readexcel_RowName.getValue("Error_Message");
					if(acctSecurity.isDisplayed_txt_Error_SetPIN_Info_Msg())
					    {
						System.out.println("Repeat");
					    if(Error_Msg.equals(acctSecurity.getText_txt_Error_SetPIN_Info_Msg()))
					     Reporter.log(" Error message displayed is same as Error message expected if PIN is easily guessable : "+acctSecurity.getText_txt_Error_SetPIN_Info_Msg());
					     else
					     {
					     Assert.fail("Error message displayed is NOT same as Error message expected if PIN is easily guessable : "+acctSecurity.getText_txt_PIN_Requirement_Popup()); 
					     }
					     } 
					else
						{
							Assert.fail("Error message is NOT displayed when easily guessable digits PIN is entered :"+acctSecurity.getText_txt_PIN_Requirement_Popup());
						}	
		//House Number PIN Error Validation
					System.out.println(PIN_House);
						acctSecurity.type_txt_Set_Pin1_Field(PIN_House);
						acctSecurity.click_txt_Set_Pin2_Field();
						new Readexcel_RowName().excelRead("ErrorMessageSheet",Functionality,"Error_Pin_Error_RepeatingNumbers_Msg");
						Error_Msg= Readexcel_RowName.getValue("Error_Message");
						if(acctSecurity.isDisplayed_txt_Error_SetPIN_Info_Msg())
						    {
							if(Error_Msg.equals(acctSecurity.getText_txt_Error_SetPIN_Info_Msg()))
							     Reporter.log(" Error message displayed is same as Error message expected if PIN is house number: "+acctSecurity.getText_txt_Error_SetPIN_Info_Msg());
							else
							     Assert.fail("Error message displayed is NOT same as Error message expected if PIN is house number: "+acctSecurity.getText_txt_PIN_Requirement_Popup()); 
						    }
						     else
						     {
						     Assert.fail("Error message is NOT displayed when house number is entered as PIN number : "+acctSecurity.getText_txt_PIN_Requirement_Popup()); 
						     }
							
		//CRC Number PIN Error Validation
						  /*  System.out.println(PIN_CRC);
							acctSecurity.type_txt_Set_Pin1_Field(PIN_CRC);
							acctSecurity.click_txt_Set_Pin2_Field();
							new Readexcel_RowName().excelRead("ErrorMessageSheet",Functionality,"Error_Pin_Error_RepeatingNumbers_Msg");
							Error_Msg= Readexcel_RowName.getValue("Error_Message");
							if(acctSecurity.isDisplayed_txt_Error_SetPIN_Info_Msg())
						    {
							if(Error_Msg.equals(acctSecurity.getText_txt_Error_SetPIN_Info_Msg()))
							     Reporter.log(" Error message displayed is same as Error message expected if PIN is CRC id : "+acctSecurity.getText_txt_Error_SetPIN_Info_Msg());
							else
							     Assert.fail("Error message displayed is NOT same as Error message expected if PIN is CRC id : "+acctSecurity.getText_txt_PIN_Requirement_Popup()); 
						    }
							else
								{
									Assert.fail("Error message is NOT displayed when CRC number is entered as PIN number :"+acctSecurity.getText_txt_PIN_Requirement_Popup());
								}	*/
			//Phone Number PIN Error Validation
							acctSecurity.type_txt_Set_Pin1_Field(PIN_Phone);
							acctSecurity.click_txt_Set_Pin2_Field();
								new Readexcel_RowName().excelRead("ErrorMessageSheet",Functionality,"Error_Pin_Error_RepeatingNumbers_Msg");
								Error_Msg= Readexcel_RowName.getValue("Error_Message");
								if(acctSecurity.isDisplayed_txt_Error_SetPIN_Info_Msg())
							    {
								if(Error_Msg.equals(acctSecurity.getText_txt_Error_SetPIN_Info_Msg()))
								     Reporter.log(" Error message displayed is same as Error message expected if PIN is last 4 digits of phone number : "+acctSecurity.getText_txt_Error_SetPIN_Info_Msg());
								else
								     Assert.fail("Error message displayed is NOT same as Error message expected if PIN is last 4 digits of phone number: "+acctSecurity.getText_txt_Error_SetPIN_Info_Msg()); 
							    }
								else
									{
										Assert.fail("Error message is NOT displayed when Phone number is entered as PIN number :"+acctSecurity.getText_txt_PIN_Requirement_Popup());
									}	
		//Entering Wrong PIN for 3 times
								    acctSecurity.type_txt_Set_Pin1_Field(valid_pin);
								    acctSecurity.type_txt_Set_Pin2_Field(PIN_Repeat);
								    acctSecurity.click_txt_Set_Pin1_Field();
								 
									if(acctSecurity.isDisplayed_txt_Error_ConfirmPIN_Info_Msg())
									{
	
										 Reporter.log(" Appropriate Error message is displayed when invalid PIN is given for first time : "+acctSecurity.getText_txt_Error_ConfirmPIN_Info_Msg());
									}
									else
									{
										Assert.fail("Appropriate Error message is NOT displayed when invalid PIN is given for first time : "+acctSecurity.getText_txt_Error_ConfirmPIN_Info_Msg());
									}
								    acctSecurity.type_txt_Set_Pin2_Field(PIN_EasilyGuessable);
								    acctSecurity.click_txt_Set_Pin1_Field();
								    if(acctSecurity.isDisplayed_txt_Error_ConfirmPIN_Info_Msg())
								    {
										 Reporter.log(" Appropriate Error message is displayed when invalid PIN is given for Second time : "+acctSecurity.getText_txt_Error_ConfirmPIN_Info_Msg());
								    }
									else
									{
										Assert.fail("Appropriate Error message is NOT displayed when invalid PIN is given for second time : "+acctSecurity.getText_txt_Error_ConfirmPIN_Info_Msg());
								    }
								    acctSecurity.type_txt_Set_Pin2_Field(PIN_House);
								    acctSecurity.click_txt_Set_Pin1_Field();
									new Readexcel_RowName().excelRead("ErrorMessageSheet",Functionality,"Error_PIN_Error_After3 attempts_Msg");
									Error_Msg= Readexcel_RowName.getValue("Error_Message");
									if(acctSecurity.isDisplayed_txt_Error_InvalidPins_3Times_Msg())
									    {
									     if(Error_Msg.equals(acctSecurity.getText_txt_Error_InvalidPins_3Times_Msg()))
									     Reporter.log("Appropriate Error message is displayed when invalid PIN is given for third time : "+acctSecurity.getText_txt_Error_InvalidPins_3Times_Msg());
									     else
									    	 Assert.fail("Appropriate Error message is NOT displayed when invalid PIN is given for third time : "+acctSecurity.getText_txt_Error_InvalidPins_3Times_Msg());
									    }
		    }
									    
		    catch(Exception e)
		    {
		    	System.out.println(e);
		    	Assert.fail("PIN section is not displayed ");
		    }
			return driver;
	}
	
	public WebDriver PIN_Field_Validation(WebDriver driver,String Functionality,String TCName) throws IOException, InterruptedException, AWTException 
	{
		POM_Generated_AccountSecurityPage acctSecurity= new POM_Generated_AccountSecurityPage(driver);
		Actions action = new Actions(driver);
		 try
		    {
			    new Readexcel_RowName().excelRead("Global_TestData_Sheet",Functionality,TCName);
				String PIN_Character=Readexcel_RowName.getValue("Pin");
				String Confirm_Pin =Readexcel_RowName.getValue("Confirm_Pin");
				acctSecurity.type_txt_Set_Pin1_Field(PIN_Character);
			    acctSecurity.click_txt_Set_Pin2_Field();
			    if(acctSecurity.getText_txt_Set_Pin1_Field().equals(""))
			    {
			    	System.out.println("special");
			    	Reporter.log("PIN Field accepts character or special character");
			    }
			    else
			    {
			    	Assert.fail("PIN Field does not accept character or special character");
			    }
			    //PIN HELP TEXT
			    if(acctSecurity.isDisplayed_click_Info_Icon_SetPIN())
			    {
			    	Reporter.log("Info icon is displayed in Set PIN Field");
			    	action.moveToElement(acctSecurity.click_Info_Icon_SetPIN).build().perform();
			    	action.moveToElement(acctSecurity.click_Info_Icon_SetPIN).moveToElement(acctSecurity.txt_PIN_Requirement_Popup).click().build().perform();
			        String ax=acctSecurity.getText_txt_PIN_Requirement_Popup();
			        System.out.println(ax);
			        if(ax.contains("Must not be four repeating digits"))
			        {
			        	Reporter.log("PIN help text is displayed while mouse oing on Info icon");
			        }
			        else
			        {
			        	Assert.fail("PIN help text is NOT  displayed while mouse oing on Info icon");
			        }
			        //EYE ICON
			        acctSecurity.type_txt_Set_Pin1_Field(Confirm_Pin);
				    acctSecurity.click_txt_Set_Pin2_Field();
				    String Type= acctSecurity.txt_Set_Pin1_Field.getAttribute("type");
				    if(Type.equals("password"))
				    {
				    	Reporter.log("PIN is displayed in encrypted form");
				    }
				    else
				    {
				    	Assert.fail("PIN is not displayed in encrypted form");
				    }
				    acctSecurity.click_click_Eye_Icon_SetPIN();
				    String Type1= acctSecurity.txt_Set_Pin1_Field.getAttribute("type");
				    if(Type1.equals("text"))
				    {
				    	Reporter.log("User is able to see the numbers after clicking Eye icon");
				    }
				    else
				    {
				    	Assert.fail("User is NOT able to see the numbers after clicking Eye icon");
				    }
				    
				    
				    
			    }
		    }
			    catch(Exception e)
			    {
			    	System.out.println(e);
			    	Assert.fail("PIN section is not displayed ");
			    }
			return driver;
	}
				
	}
	
