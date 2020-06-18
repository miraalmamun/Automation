package com.qtpselenium.core.ddf.base2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Browser 
{
    @Test
    public void openBrowser()
    {   
    	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\driver\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
    	driver.quit();
    	
    }
}
