package com.zoho.hybrid.SuiteA;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zoho.hybrid.Base.BaseTest;
import com.zoho.hybrid.utils.DataUtil;

//Name of java file(java class-->LoginTest) should be same as name in excel file
//Here LoginTest class name same as in excel file--> 'TestCases' sheet's under--> 'TCID' 
//name same--->'Data' sheet's test name also same
public class LoginTest extends BaseTest {

	// Make sure that I have my properties and excel file object initialize
	// before test starts

	@Test(dataProvider = "getData")
	public void doLogin(Hashtable<String, String> data) {
		System.out.println("Running LoginTest");

		if (data.get("Runmode").equals("N")) {
			throw new SkipException("Runmode is set to No");
		}

		ds.executeKeywords(testName, excel, data);
	}

	@DataProvider
	public Object[][] getData() {

		return DataUtil.getTestData(testName, excel);
	}

}
