package computedClass;


	import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Utility.Data;
import Utility.Readexcel_RowName;
import generatedClass.POM_Generated_Homepage;

	public class Computed_HomePage {
         
		Data obj=new Data();
		
		String Global="Global";
		String value="";
		WebElement logo=null;
	
		public WebDriver Home_general(WebDriver driver,String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException
		{
		
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		new Readexcel_RowName().excelRead("Global_TestData_Sheet",Global,Functionality);
		
		if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
		{
			
			value="winndixie";
			logo=homepage.click_Winndixie_logo;
		}
		else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
		{
			
			value="bi-lo";
			logo=homepage.click_Bilo_logo;
		}
		else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
		{
			
			value="harveyssupermarkets";
			logo=homepage.click_Harveys_logo;
		}
		obj.waitForElement(driver, logo);
		logo.click();
		return driver;
		}	
		public WebDriver Home_topbanner(WebDriver driver,String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException 
		{
			
			POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
			
			try
			{
			    //*obj.waitForElement(driver,staticinfobar.click_Static_info_WeeklyAds_link);
				//*if(staticinfobar.isDisplayed_click_Static_info_WeeklyAds_link())
				{
					
					if(homepage.isDisplayed_txt_Homebanner_carousel())
					{
					Reporter.log("Home banner carousel is displayed in home page");
					}
					
				}
				
			}
			catch(Exception e)
			{
				System.out.println(e);
				Assert.fail("Error in logged in Home page");
			}
			return driver;
			
		}
		
		public WebDriver Home_logos(WebDriver driver,String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException  
					
		{
			POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
			String curl=driver.getCurrentUrl();
			
			try
			{
				if(!(value.equals("harveyssupermarkets")))
				{
					if(homepage.isDisplayed_click_Online_Grocery_Logo())				
					{  	
						String 	logo1=homepage.getText_click_Online_Grocery_Logo();	
						Reporter.log(logo1 +" logo is displayed in home page");
						
			       	}
					else
					{
						Assert.fail("Online Grocery logo is not displaying");
					}
						  }
					if(homepage.isDisplayed_click_WeeklyAd_Logo())
					{
					    String wa_orP="https://"+value+".pdn.retaileriq.com/weeklyad/ - Google Chrome";
				    	String ie="Windows Security";
				    	String bro="";
				    	if(Readexcel_RowName.getValue("Chrome(Y/N)").equalsIgnoreCase("Y"))
				    	{
				    		bro= wa_orP;
				    	}	
				    	else if(Readexcel_RowName.getValue("IE(Y/N)").equalsIgnoreCase("Y"))
				    	{
				    		bro=ie;
				    	}
				    	String Val = obj.popuppath()+" "+bro;
			    	    Runtime.getRuntime().exec(Val);
			    	    
			    	    String 	logo2=homepage.getText_click_WeeklyAd_Logo();	
						Reporter.log(logo2 +" logo is displayed in home page");	
						
					    homepage.click_click_WeeklyAd_Logo();
					    String adurl=driver.getCurrentUrl();
					    //* System.out.println(adurl);
						String adurl1="https://"+value+".pdn.retaileriq.com/weeklyad/storelocator/";
						if(adurl.equalsIgnoreCase(adurl1))
						{
							Reporter.log("User is navigated successfully to Weekly ad page on clicking weekly ad logo from home page");
						}
						else
						{
							Assert.fail("User is not navigated to Weekly ad page");
						}
						driver.navigate().to(curl);
					}
					else
					{
						Assert.fail("Weekly ad logo is not displaying");
					}
					if(homepage.isDisplayed_click_PersonalizedAd_Logo())
					{
						String 	logo3=homepage.getText_click_PersonalizedAd_Logo();	
						Reporter.log(logo3 +" logo is displayed in home page");	
					    homepage.click_click_PersonalizedAd_Logo();
					   
					    String adurl=driver.getCurrentUrl();
					    System.out.println(adurl);
					    String adurl1="https://"+value+".pdn.retaileriq.com/weeklyad/";
						//*String adurl1="https://"+value+".pdn.retaileriq.com/weeklyad/?s=";
						if(adurl.equalsIgnoreCase(adurl1))
						{
							Reporter.log("User is navigated successfully to microsite page on clicking Personalized ad logo from home page");
						}
						
						
							//*String adurl2="https://"+value+".pdn.retaileriq.com/weeklyad/storelocator/";
							
						
						else
						{
							Assert.fail("User is not navigated to microsite page");
						}
					    driver.navigate().to(curl);
					}
					else
					{
						Assert.fail("Personalized ad logo is not displaying");
					}
					if(homepage.isDisplayed_click_Digitial_Coupons_Logo())
					{
						//*String 	logo4=homepage.getText_click_Digitial_Coupons_Logo();
						Reporter.log("Digital Coupons logo is displayed in home page");	
					    homepage.click_click_Digitial_Coupons_Logo();
					    String adurl=driver.getCurrentUrl();

						if(value.equals("winndixie"))
						{
							
						    String adurl1="https://"+value+".pdn.retaileriq.com/coupons/";
						if(adurl.equalsIgnoreCase(adurl1))
						 {
							Reporter.log("User is navigated successfully to digital coupons page on clicking digital coupons logo from home page");
						 }
						else
						 {
							Assert.fail("User is not navigated to microsite coupons page");
						 }
						}
						else
						{
							String adurl2="https://"+value+".pdn.retaileriq.com/";
							if(adurl.equalsIgnoreCase(adurl2))
							 {
								Reporter.log("User is navigated successfully to digital coupons page on clicking digital coupons logo from home page");
							 }
							else
							 {
								Assert.fail("User is not navigated to microsite coupons page");
							 }
						 }
					 
					    driver.navigate().to(curl);

					}
		
					else
					{
						Assert.fail("Digital Coupons logo is not displaying");
					}
					if(homepage.isDisplayed_txt_NeverMissADeal_text())
						
					{
					    String str = homepage.getText_txt_NeverMissADeal_text();
						Reporter.log(str+ " blocks are displayed in home page");
					}
					else
					{
						Assert.fail("Never miss out on a deal block is not displayed");
					}
				
		   }
		   catch(Exception e)
				{
					Assert.fail("Home page logos are not displayed");
				}
			    return driver;
		}
		public WebDriver Home_logosguest(WebDriver driver,String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException  
		
		{
			POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
			String curl=driver.getCurrentUrl();
			
			try{
				  if(!(value.equals("harveyssupermarkets")))
						  {
				   if(homepage.isDisplayed_click_Online_Grocery_Logo())				
					{  	
						String 	logo1=homepage.getText_click_Online_Grocery_Logo();	
						Reporter.log(logo1 +" logo is displayed in home page");
						
			       	}
					else
					{
						Assert.fail("Online Grocery logo is not displaying");
					}
						  }
					if(homepage.isDisplayed_click_WeeklyAd_Logo())
					{
						
						
					    
					    String wa_orP="https://"+value+".pdn.retaileriq.com/weeklyad/ - Google Chrome";
				    	String ie="Windows Security";
				    	String bro="";
				    	if(Readexcel_RowName.getValue("Chrome(Y/N)").equalsIgnoreCase("Y"))
				    	{
				    		bro= wa_orP;
				    	}	
				    	else if(Readexcel_RowName.getValue("IE(Y/N)").equalsIgnoreCase("Y"))
				    	{
				    		bro=ie;
				    	}
				    	String Val = obj.popuppath()+" "+bro;
			    	    Runtime.getRuntime().exec(Val);
			    	
			    	    
			    	    String 	logo2=homepage.getText_click_WeeklyAd_Logo();	
						Reporter.log(logo2 +" logo is displayed in home page");	
					    homepage.click_click_WeeklyAd_Logo();
					    
					    String adurl=driver.getCurrentUrl();
					    //* System.out.println(adurl);
						String adurl1="https://"+value+".pdn.retaileriq.com/weeklyad/storelocator/";
						if(adurl.equalsIgnoreCase(adurl1))
						{
							Reporter.log("User is navigated successfully to Weekly ad page on clicking weekly ad logo from home page");
						}
						else
						{
							Assert.fail("User is not navigated to Weekly ad page");
						}
						driver.navigate().to(curl);
					}
					else
					{
						Assert.fail("Weekly ad logo is not displaying");
					}
					if(homepage.isDisplayed_click_PersonalizedAd_Logo())
					{
						String 	logo3=homepage.getText_click_PersonalizedAd_Logo();	
						Reporter.log(logo3 +" logo is displayed in home page");	
					    homepage.click_click_PersonalizedAd_Logo();
					   
					    String adurl=driver.getCurrentUrl();
					    //*System.out.println(adurl);
					    String adurl1="https://"+value+".pdn.retaileriq.com/weeklyad/storelocator/";
						//*String adurl1="https://"+value+".pdn.retaileriq.com/weeklyad/?s=";
						if(adurl.equalsIgnoreCase(adurl1))
						{
							Reporter.log("User is navigated successfully to microsite page on clicking Personalized ad logo from home page");
						}
						
						else
						{
							Assert.fail("User is not navigated to microsite page");
						}
					    driver.navigate().to(curl);
					}
					else
					{
						Assert.fail("Personalized ad logo is not displaying");
					}
					if(homepage.isDisplayed_click_Digitial_Coupons_Logo())
					{
						//*String 	logo4=homepage.getText_click_Digitial_Coupons_Logo();
						Reporter.log("Digital Coupons logo is displayed in home page");	
					    homepage.click_click_Digitial_Coupons_Logo();
					    String adurl=driver.getCurrentUrl();

						if(value.equals("winndixie"))
						{
							
						    String adurl1="https://"+value+".pdn.retaileriq.com/coupons/";
						if(adurl.equalsIgnoreCase(adurl1))
						 {
							Reporter.log("User is navigated successfully to digital coupons page on clicking digital coupons logo from home page");
						 }
						else
						 {
							Assert.fail("User is not navigated to microsite coupons page");
						 }
						}
						else
						{
							String adurl2="https://"+value+".pdn.retaileriq.com/";
							if(adurl.equalsIgnoreCase(adurl2))
							 {
								Reporter.log("User is navigated successfully to digital coupons page on clicking digital coupons logo from home page");
							 }
							else
							 {
								Assert.fail("User is not navigated to microsite coupons page");
							 }
						 }
					 
					    driver.navigate().to(curl);

					}
		
					else
					{
						Assert.fail("Digital Coupons logo is not displaying");
					}
					if(homepage.isDisplayed_txt_NeverMissADeal_text())
						
					{
					    String str = homepage.getText_txt_NeverMissADeal_text();
						Reporter.log(str+ " blocks are displayed in home page");
					}
					else
					{
						Assert.fail("Never miss out on a deal block is not displayed");
					}
				
		   }
		   catch(Exception e)
				{
					Assert.fail("Home page logos are not displayed");
				}
			    return driver;
		}	
		
		
		
		public WebDriver Home_CouponRotator(WebDriver driver,String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException  	
		       
		{
			    POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
				
				try {
					
		    	    //*obj.scrollingToElementofAPage(driver, (WebElement) homepage.click_Save_Coupon_Button);
		    	    
		    	    //*obj.waitForElement(driver, (WebElement) homepage.click_Save_Coupon_Button);
		    	   
		    	    List<WebElement> buttons = (List<WebElement>) homepage.click_Save_Coupon_Button; 
		    	   
		  		    int sizee=buttons.size();
                    int count = 0;
		  		    for(int n=1;n<sizee;n++)
		  		    {
		  			
		  			  {
		  				
		  				 if(buttons.get(n).isDisplayed())
		  				 {	  	
		  					obj.scrollingToElementofAPage(driver, buttons.get(n));
		  					count = count+1;
		  					//*System.out.println(count);
		  				 }
		  			  }
		  		    }	
		  					
		  		Reporter.log(count+" Digital coupons are displayed in the Coupons Rotator.");			
				}
				catch(Exception e)
				{
					Assert.fail("Error in coupons rotator in home page");
				}
				return driver;
			}
		
	public WebDriver Home_bottomblock(WebDriver driver,String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException  	
	       
		{
			    POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
				
			try 
			{	
				if(homepage.isDisplayed_txt_Home_bottomblock_title())
				{
					String str = homepage.getText_txt_Home_bottomblock_title();
					Reporter .log(str + " title is displayed in the bottom of the home page with 3 blocks");
					
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
				Assert.fail("Error in logged in Home page");
			}
			return driver;
		}
	
	public WebDriver Myrewardfooterlink(WebDriver driver,String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		Data obj1 =new Data();
		try 
		{
			String trm1="http://www.segrewards.com/terms";
			String hom= driver.getCurrentUrl();
	    	//obj1.waitForElement(driver, homepage.txt_Home_bottomblock_title);
	    	obj1.scrollingToElementofAPage(driver,homepage.click_Home_screen_footer_Rewards_TC);
	    	homepage.click_click_Home_screen_footer_Rewards_TC();
	    	String trm=driver.getCurrentUrl();
	    	//System.out.println(trm);
	    	
	    	if(trm.equalsIgnoreCase(trm1))
	    	{
	    		Reporter.log("user is navigated to terms and conditions page");
	    	}
	    	else
	    	{
	    		Assert.fail("user is not navigated to terms and conditions page");
	    	}
	    	driver.navigate().to(hom);
			
		   }
		catch(Exception e)
		{
			Assert.fail("Issue in home page");
		}
		return driver;
	}
	
	public WebDriver Globalnavupdate(WebDriver driver,String Functionality) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	
	{
		POM_Generated_Homepage homepage = new POM_Generated_Homepage(driver);
		Data obj1 =new Data();
		try
		{
			if(homepage.isDisplayed_click_Rewards_link_Hover())
			{
				homepage.click_click_Rewards_link_Hover();
				if(homepage.isDisplayed_click_Rewards_RegisterNow_Button()&& homepage.isDisplayed_click_Rewards_Rewards_Button())
				{
					String link1  = homepage.getText_click_Rewards_RegisterNow_Button();
					String link2 = homepage.getText_click_Rewards_Rewards_Button();
					
					Reporter.log(link1+ " and "+link2+ " links are present under 'Rewards' menu in Global Nav");
				}
			}
			
			String hom= driver.getCurrentUrl();
		    homepage.click_click_Rewards_link_Hover();
			homepage.click_click_Rewards_RegisterNow_Button();
			String reg = driver.getCurrentUrl();
			String regactual = "https://scqa." +value+ ".com/register-now";
			if(reg.equalsIgnoreCase(regactual))
			{
				Reporter.log("On clicking Register link,navigated to enrollment page");
			}
			driver.navigate().to(hom);
			
			homepage.click_click_Rewards_link_Hover();
			homepage.click_click_Rewards_Rewards_Button();
			String rew = driver.getCurrentUrl();
			String rewactual = "https://scqa." +value+ ".com/register-now";
			if(rew.equalsIgnoreCase(rewactual))
			{
				Reporter.log("On clicking Rewards link,navigated to the rewards page");
			}
			driver.navigate().to(hom);
			
			if(homepage.isDisplayed_Click_Shopping_link())
			{
				homepage.click_Click_Shopping_link();
				if(homepage.isDisplayed_Click_Shopping_whatsnew_link())
				{
					String str =homepage.getText_Click_Shopping_whatsnew_link();
					Reporter.log(str+ " link is displayed under Shopping menu in Global Navigation");
				}
			}
		}
		catch(Exception e)
		{
		Assert.fail("Issue in home page");
		}
		
		return driver;
	}
	
	}
