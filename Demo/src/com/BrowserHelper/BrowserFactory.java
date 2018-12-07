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
       
        public WebDriver startbrowser(String browserName,String URL) throws InterruptedException, IOException
        {
       
        if(browserName.equalsIgnoreCase("Safari"))
        {
                      
                        driver = new SafariDriver();;
                        driver.manage().window().maximize();
        }
        else if(browserName.equalsIgnoreCase("Chrome"))
        {
        	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe"); 
        	ChromeOptions chromeOptions = new ChromeOptions();
        	chromeOptions.addArguments("--start-maximized");
        	chromeOptions.addArguments("--dns-prefetch-disable");
        	driver = new ChromeDriver(chromeOptions);
        	     
        }
        else if(browserName.equalsIgnoreCase("IE"))
        {
    
        	DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        	capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
        	
        	System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe"); 
        	driver = new InternetExplorerDriver();
        	driver.manage().window().maximize();
        }
        
       
       
        driver.get(URL);
        
      //wait
        Thread.sleep(1000);
       
        return driver;
      
        }
}
