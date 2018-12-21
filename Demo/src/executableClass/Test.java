package executableClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javafx.scene.paint.Color;
public class Test {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		/*WebDriver driver = null;
		
		Browserbanner br=new Browserbanner();
	
		driver= br.BrowserBanner(driver, "Fully_Enrolled_Customers_Flow");
		
		driver= br.Clearcookie(driver, "Fully_Enrolled_Customers_Flow");
		WebElement element=driver.findElement(By.xpath("//img[@alt='BI-LO Logo']"));
		Thread.sleep(2000);
		element.click();
		Thread.sleep(2000);
		System.out.println("done");*/
		
		
		try
		{
		/*System.out.println(element.getAttribute("background"));
		System.out.println(element.getAttribute("style"));
		System.out.println(element.getAttribute("background-color")) ;
		System.out.println(element.getCssValue("style"));*/
		//System.out.println(element.getCssValue("color"));
			/*String col=driver.findElement(By.xpath("//img[@alt='BI-LO Logo']")).getCssValue("color");
			String bg=driver.findElement(By.xpath("//button[text()='Log in / Register']")).getCssValue("background-color");
			System.out.println(bg);
			System.out.println(col);
			String hex = Color.fromString(bg).asHex();*/
			Color whiteColor = Color.valueOf("00a94f");
			System.out.println(whiteColor);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
