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
        	driver.get(URL);  
        }
        else if(browserName.equalsIgnoreCase("IE"))
        {
        	try
        	{
        		System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe");  
        		DesiredCapabilities dc=new DesiredCapabilities();
        		dc.setCapability(InternetExplorerDriver.ENABLE_ELEMENT_CACHE_CLEANUP, true);
    			dc.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
    		//	dc.setJavascriptEnabled(false);
            	driver = new InternetExplorerDriver(dc);
            	driver.manage().window().maximize();
            	Thread.sleep(1000);
            	driver.get(URL); 
            	System.out.println("done");
        	}
        	catch(Exception e)
        	{
        		System.out.println(e);
        	}
        }
        
       
       System.out.println(URL);
      
        
      //wait
        Thread.sleep(2000);
       
        return driver;
      
        }
}
