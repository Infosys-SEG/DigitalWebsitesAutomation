package Utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Data 
{
	public static WebDriver driver;
	WebElement webElement = null;
	WebDriverWait webDriverWait;
	String Pass_screenShot=".\\ScreenShot_Pass\\";
	String Fail_screenShot=".\\ScreenShot_Failed\\";	
	
	//Get row num
	public int rownum(String SheetName) throws IOException
	{
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Global_TestData_Sheet.xlsx");
		@SuppressWarnings("resource")
		Workbook wb = new XSSFWorkbook(fs);
		Sheet sh = wb.getSheet(SheetName);
		int lastRow = sh.getLastRowNum()+1;
		return lastRow;
	}

	//Screen Shots 
	public void Screenshot(WebDriver driver,String name,String Path) throws IOException
	{
		File scrfile=(File)((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File(Path+name+".jpeg"));
	}
	//Ashot
	public  void Ashot_Screenshot(WebDriver driver,String Path) throws IOException
	{
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100))
				.takeScreenshot(driver);

		// To save the screenshot in desired location
		ImageIO.write(screenshot.getImage(), "PNG",
				new File(Path+".png"));
	}
	//waitForElementClickable
	public WebElement waitForElementClickable(WebDriver driver,WebElement item)
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable((By) item));
		return item;
	}
	
	//wait for element	
	public WebDriver waitForElement(WebDriver driver,WebElement item)
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(item));
		return driver;
	}
	public List<WebElement> waitForElements(WebDriver driver, List<WebElement> elements) 
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf((WebElement) elements));
		return elements;
	}
	public WebElement waitForElementselected(WebDriver driver, WebElement element) 
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeSelected(element));
		return element;
	}
	//scrollingToElementofAPage
	public WebDriver scrollingToElementofAPage(WebDriver driver,WebElement item) 
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", item);
		return driver;
	}
	public WebDriver scrollingToTop(WebDriver driver) 
	{
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,0)");
		return driver;
	}
	
	
	//move to element
	public WebDriver movetoElementofAPage(WebDriver driver,WebElement item) 
	{
		Actions actions = new Actions(driver);

		actions.moveToElement(item).build().perform();
		return driver;
	}
	
	//move to element and click
	public WebDriver movetoElementofAPage_Click(WebDriver driver,WebElement item) 
	{
		Actions actions = new Actions(driver);

		actions.moveToElement(item).click().perform();
		return driver;
	}
	public WebDriver movetoElement_JS(WebDriver driver,WebElement item) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", (item));
		return driver;
	}
	//WindowPopup
	public String popuppath()
	{
		String popup=System.getProperty("user.dir")+"\\Windowpopup\\b.exe";
		return popup;	
	}
}
