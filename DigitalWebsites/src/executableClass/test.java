package executableClass;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
			int ch3=0;
			for (int i = 0; i<len;i++)
			{
				if(i==ch1)
				{
					ch1+=3;
					String firstcol=s.get(i).getText();
					Character f=firstcol.charAt(0);
					if(f.equals('+'))
					{
						System.out.println("Positive");
					}
					else if(f.equals('-'))
					{
						System.out.println("Negative");
					}
					else
					{
						System.out.println("No symbols");
					}
				}
				else if(i==ch2)
				{
					
				}
			}
		}
		else
		{
			System.out.println("No recent transactions");
		}
	}

}
