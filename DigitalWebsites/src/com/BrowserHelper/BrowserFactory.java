package com.BrowserHelper;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
public class BrowserFactory 
{		     
	public WebDriver startbrowser(WebDriver driver,String browserName,String URL) throws InterruptedException, IOException
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
        		DesiredCapabilities dc=new DesiredCapabilities();        		
        		dc.setBrowserName("internet explorer");
    			dc.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
    			dc.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
    			dc.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
    			dc.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, true);
    			dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
    			dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
    			dc.setCapability("ignoreProtectedModeSettings", true);
    			dc.setCapability("ignoreZoomSetting", true);
    			dc.setJavascriptEnabled(true);
    			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\Drivers\\New folder\\IEDriverServer.exe");
            	driver = new InternetExplorerDriver(dc);
            	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            	driver.manage().window().maximize();
            	driver.manage().deleteAllCookies();
            	driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
    			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    			System.out.println("before");
            	driver.get(URL);
            	//driver.navigate().to(URL);
            	System.out.println("done");
        	}
        	catch(Exception e)
        	{
        		System.out.println(e);
        	}
        }
		System.out.println(URL);       
		//wait
		Thread.sleep(1000);     
		return driver;     
	}
}
