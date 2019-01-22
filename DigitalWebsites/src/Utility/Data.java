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
import ru.yandex.qatools.ashot.screentaker.ViewportPastingStrategy;

public class Data 
{
	/*public static WebDriver driver;
	WebElement webElement = null;
	WebDriverWait webDriverWait;
	String Pass_screenShot=".\\ScreenShot_Pass\\";
	String Fail_screenShot=".\\ScreenShot_Failed\\";	*/
	
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
	public  void Ashot_Screenshot(WebDriver driver,String Functionality,String TCName,String screenshotName) throws IOException
	{
		System.out.println(driver);
		System.out.println(Functionality);
		System.out.println(TCName);
		String Path = System.getProperty("user.dir")+"\\Screenshots/"+Functionality+"/"+TCName+"/";
		File file=new File(Path);
		if (!file.exists()) {
			
			file=file.getParentFile();
			System.out.println("File created " + file);
			file=new File(file+"/"+TCName);
			file.mkdirs();
			file.createNewFile();
           
		}

		
		Screenshot screenshot = new AShot().shootingStrategy(new ViewportPastingStrategy(1000)).takeScreenshot(driver);
		
		// To save the screenshot in desired location
		ImageIO.write(screenshot.getImage(), "PNG",
				new File(file+"/"+screenshotName+".png"));
	}
	//waitForElementClickable
	public WebDriver waitForElementClickable(WebDriver driver,WebElement item)
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(item));
		return driver;
	}
	
	//wait for element	
	public WebDriver waitForElement(WebDriver driver,WebElement item)
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(item));
		return driver;
	}
	@SuppressWarnings("unchecked")
	public List<WebDriver> waitForElements(WebDriver driver, List<WebElement> elements) 
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
		return (List<WebDriver>) driver;
		
	}
	public WebDriver waitForElementselected(WebDriver driver, WebElement element) 
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeSelected(element));
		return driver;
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

		actions.moveToElement(item).pause(500).click().build().perform();
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
