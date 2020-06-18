package com.zoho.hybrid.Base;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.BeforeTest;

import com.zoho.hybrid.driver.DriverScript;
import com.zoho.hybrid.utils.ExcelReadWrite;

public class BaseTest {
	public Properties envProp;
	public Properties prop;
	public ExcelReadWrite excel;
	public String testName;
	public DriverScript ds;

	@BeforeTest
	public void init() {
		System.out.println("Initialization");

		// Initialize the testName
		// Dynamically passing the test name
		testName = this.getClass().getSimpleName();
		System.out.println("Class name--" + testName);

		// Initialize the excel file
		// Get the Package name
		// Every package has separate excel file
		// All classes in the particular package will belong to same excel file
		// Package(SuiteA) name and excel file path's key(SuiteA_xls)
		// name(SuiteA_xls=C:\\Users\\Mir\\eclipse-workspace\\HybridFramework\\excel\\SuiteA.xlsx)
		// should be same
		// src/test/resources-->In 'prod.properties' file I keep excel file paths
		// SuiteA_xls=C:\\Users\\Mir\\eclipse-workspace\\HybridFramework\\excel\\SuiteA.xlsx
		// SuiteB_xls=C:\\Users\\Mir\\eclipse-workspace\\HybridFramework\\excel\\SuiteB.xlsx
		// My target here dynamically passing the test excel file name. Package name and
		// excel file's key name should be same
		// How do I come to know Suite name?

		System.out.println(this.getClass().getPackage().getName());

		// com.zoho.hybrid.SuiteA
		// Now I am going to split 'com.zoho.hybrid.SuiteA'---> By '.' and '.' is a
		// special character in java so I need to treat it special way'
		// So I need to use '\\' in my split() method

		String[] excelFile = this.getClass().getPackage().getName().split("\\.");

		// Here String array holds com,zoho,hybrid,SuiteA string
		// First index holds 'com'----And Last index hold 'SuiteA'
		// My target to get last string 'SuiteA'

		String suiteName = excelFile[excelFile.length - 1];
		// The result of suiteName is --> 'SuiteA'

		envProp = new Properties();
		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\env.properties");
			prop.load(fis);
			String env1 = prop.getProperty("env");
			fis = new FileInputStream(".\\src\\test\\resources\\" + env1 + ".properties");
			envProp.load(fis);

		} catch (Exception e) {

			e.printStackTrace();
		}

		// SuiteA_xls=C:\\Users\\Mir\\eclipse-workspace\\HybridFramework\\excel\\SuiteA.xlsx
		// SuiteB_xls=C:\\Users\\Mir\\eclipse-workspace\\HybridFramework\\excel\\SuiteB.xlsx

		// excel = new ExcelReadWrite(prodUat.getProperty("SuiteA_xls"));
		excel = new ExcelReadWrite(envProp.getProperty(suiteName + "_xls"));
		ds = new DriverScript();
		ds.setEnvProp(envProp);
		ds.setProp(prop);

	}

}
