package executableClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import computedClass.Computed_FuelPerk;
import computedClass.Computed_MyStore;

public class Fuelperks_Locator_Page 
{
	WebDriver driver;
	String Functionality="Fuelperks_Locator_Page";
	
	@Test
	public void TC001_Fuelperks_locator_Search_with_ZIP() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner br=new Browserbanner();
		Computed_FuelPerk fuelperk=new Computed_FuelPerk();
		
		driver= br.BrowserBanner(driver, Functionality);
		driver=br.Clearcookie(driver, Functionality);
	
		driver=fuelperk.FuelPerk_Zipcode(driver, Functionality, TCName);
		driver.close();
	}
	@Test
	public void TC002_Fuelperks_locator_Search_with_city_and_state() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, AWTException
	{
		String TCName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		Browserbanner br=new Browserbanner();
		Computed_FuelPerk fuelperk=new Computed_FuelPerk();
		
		driver= br.BrowserBanner(driver, Functionality);
		driver=br.Clearcookie(driver, Functionality);
	
		driver=fuelperk.FuelPerk_CityState(driver, Functionality, TCName);
		driver.close();
	}
	


}
