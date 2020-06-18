package com.qtpselenium.core.ddf.base2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
   WebDriver driver;
	public void openBrowser(String bType) {

		if (bType.equalsIgnoreCase("Mozila")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\driver\\geckodriver.exe");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,
					System.getProperty("user.dir") + "\\DriverLog\\mozila.log");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		} else if (bType.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\geckodriver.exe");
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--disable-notifications");
			ops.addArguments("disable-infobars");
			ops.addArguments("--start-maximized");
			System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,
					System.getProperty("user.dir") + "\\DriverLog\\chrome.log");
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			driver = new ChromeDriver(ops);
		} else if (bType.equalsIgnoreCase("IE")) {

		} else if (bType.equalsIgnoreCase("Edge")) {

		}
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	}
	
}
