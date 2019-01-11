package com.BrowserHelper;


import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
public class BrowserFactory 
{
		static WebDriver driver;
        Robot rb;
       
        public WebDriver startbrowser(String browserName) throws InterruptedException, IOException
        {
       
       if(browserName.equalsIgnoreCase("IE"))
        {
        	System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe"); 
        	DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        	capabilities.setCapability("requireWindowFocus", true);  
        	capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, false);
        	capabilities.setCapability("ie.ensureCleanSession", true);
        	capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        	capabilities.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, true);    	
        	driver = new InternetExplorerDriver(capabilities);
        	driver.manage().window().maximize();
        	 //driver.get(URL); 
        	//driver.navigate().to(URL);
        }
        
       
       
        
        
      //wait
        Thread.sleep(1000);
       
        return driver;
      
        }
}
