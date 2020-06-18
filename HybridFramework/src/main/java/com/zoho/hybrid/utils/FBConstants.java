package com.zoho.hybrid.utils;

public class FBConstants {
	// Path
	public static final String ExtentReports_Path = "C:\\Users\\Mir\\eclipse-workspace\\com.facebookPageObject.Mir\\ExtentReports\\";

	// Mozilla Browser
	public static final String CHROME_DRIVER_EXE = System.getProperty("user.dir") + "\\Driver\\geckodriver.exe";
	public static final String BROWSER_LOGFILE = System.getProperty("user.dir") + "\\DriverLog\\mozila.log";
	// Chrome Browser
	public static final String GECKO_DRIVER_EXE = System.getProperty("user.dir") + "\\Driver\\chromedriver.exe";
	public static final String CHROME_DRIVER_LOGFILE = System.getProperty("user.dir") + "\\DriverLog\\chrome.log";
	// Locators-->Login Page
	public static final String LOGIN_USERNAME = "//*[@id='email']";
	public static final String LOGIN_PASSWORD = "//*[@id='pass']";
	// Landing Page
	public static final String PROFILEPAGE_LINK = "//span[@class='_1vp5']";
	// TopMenu
	public static final String NAVIGATE_LINK = "//div[@id='userNavigationLabel']";
	public static final String LOGOUT_LINK = "//span[text()='Log Out']";
	public static final String SETTINGS_LINK = "//span[text()='Settings']";
	public static final String SECURITYandLOGIN_LINK = "//a[@title='Security and Login']";
	public static final String CHANGEpassword = "//span[contains(text(),'Change password')]";
	public static final String OLD_PASSWORD = "//input[@id='password_old']";
	public static final String NEW_PASSWORD = "//input[@id='password_new']";
	public static final String CONFIRM_PASSWORD = "//input[@id='password_confirm']";
	public static final String SAVE_CHANGES = "//label[@class='submit uiButton uiButtonConfirm']";
	
	public static final String REVIEW_DEVICES = "//div[contains(text(),'Review other devices')]";
	public static final String STAY_LOGGED = "//div[contains(text(),'Stay logged in')]";
	public static final String CONTINUE_PASSWORD_CHANGE_BUTTON = "//button[text()='Continue']";
	public static final String CLOSE = "//button[contains(text(),'Close')]";
	// URLs
	public static final String HOMEPAGE_URL = "http://facebook.com";
	// EXCEL
	public static final String DATA_XLS_PATH = System.getProperty("user.dir") + "\\data\\Data.xlsx";
	public static final String TESTDATA_SHEET = "TestData";
	public static final Object RUNMODE_COL = "Runmode";
	public static final String TESTCASES_SHEET = "TestCases";

	public static final CharSequence CURRENTPASSWORD = "Chanchal9";
	public static final CharSequence NEWPASSWORD = "Chanchal12";

	

}
