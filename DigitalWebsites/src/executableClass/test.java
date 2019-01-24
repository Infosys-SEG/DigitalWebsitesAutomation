package executableClass;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

import computedClass.Computed_HardLogin;
import computedClass.Computed_Static_Info_bar;

public class test 
{
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
		Browserbanner br=new Browserbanner();
		Computed_Static_Info_bar staticinfobar = new Computed_Static_Info_bar();
		Computed_HardLogin hardlogin = new Computed_HardLogin();
		driver= br.BrowserBanner(driver, "HardLogin_Loggedin_Account");
		
		driver= br.Clearcookie(driver, "HardLogin_Loggedin_Account");
		driver=hardlogin.Global_HardLogin(driver, "HardLogin_Loggedin_Account","TC001_HardLogin_Access_features");
		//driver = staticinfobar.LoginStaticinfobar_Rewards(driver, "Static_Infobar_loggedin_Users");
		driver = staticinfobar.LoginStaticinfobar_Rewards(driver, "Static_Infobar_loggedin_Users","");
		List<WebElement> s=driver.findElements(By.xpath("//div[@class='col-md-4 col-sm-4 col-xs-12 p-0 text-center r-cells']"));
		int len=s.size();
		
		if(len!=0)
		{
			int ch1=0;
			int ch2=1;
			int ch3=2;
			for (int i = 0; i<len-2;i++)
			{
				if(i==ch1)
				{
					ch1+=3;
					String firstcol=s.get(i).getText();		
					boolean savedval=firstcol.startsWith("Saved");		
					Character f=firstcol.charAt(0);
					String clr=driver.findElement(By.xpath("//span[text()= '"+firstcol+" ']")).getAttribute("class");
					if(clr.equalsIgnoreCase("tran-points negative-points"))
					{
						clr="negative-points";
					}		
					String color = driver.findElement(By.className(clr)).getCssValue("color");
					String hex = Color.fromString(color).asHex();
					if(f.equals('+'))
					{
						if(hex.equalsIgnoreCase("#1399d1"))
						{
							System.out.println("Positive color matched");
						}
						else
						{
							System.out.println("Positive color not matched");
						}
						if(i+2==ch3)
						{
							ch3+=3;
							String thirdcol=s.get(i+2).getText();
							
							System.out.println(thirdcol);
						}
					}
					else if(f.equals('-'))
					{
						System.out.println("Negative");
					}
					else if(savedval==true)
					{
						if(hex.equalsIgnoreCase("#d0324b"))
						{
							System.out.println("Saved value color matched");
						}
						else
						{
							System.out.println("Saved value color not matched");
						}
						if(i+2==ch3)
						{
							ch3+=3;
							String thirdcol=s.get(i+2).getText();
							if(thirdcol.equalsIgnoreCase("Fuel savings at the pump "))
							{
								System.out.println("matched for fuel saving");
							}
							
							else
							{
							System.out.println(thirdcol);
							}
						}
					}
					else
					{
						System.out.println("No symbols");
					}
				}
				if(i+1==ch2)
				{
					ch2+=3;
					String seccol=s.get(i+1).getText();
					if(seccol.isEmpty())
					{
						Assert.fail("Transaction date and store is not displayed");
					}
				}
				
			}
		}
		else
		{
			System.out.println("No recent transactions");
		}
	}

}
