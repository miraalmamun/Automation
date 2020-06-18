package com.zoho.hybrid.driver;

import java.util.Hashtable;
import java.util.Properties;

import com.zoho.hybrid.utils.ExcelReadWrite;

public class DriverScript {

	public Properties envProp;
	public Properties prop;

	public void executeKeywords(String testName, ExcelReadWrite excel, Hashtable<String, String> testData) {

		int rowNumber = excel.getRowCount("Keywords");
		int row = excel.getRowCount("Hello");
		System.out.println("********* " + row);
		System.out.println("Number of rows in Keywords sheet: " + rowNumber);

		for (int rNum = 2; rNum <= rowNumber; rNum++) {
			String tcid = excel.getCellData("Keywords", "TCID", rNum);
			if (tcid.equals(testName)) {
				String keyword = excel.getCellData("Keywords", "Keyword", rNum);

				String objectKey = excel.getCellData("Keywords", "Object", rNum);

				String dataKey = excel.getCellData("Keywords", "Data", rNum);

				String data = testData.get(dataKey);

				System.out.println(tcid + " -->" + keyword + "-->" + prop.getProperty(objectKey) + " -->" + data);

			}
		}
	}

	/**
	 * @return the envProp
	 */
	public Properties getEnvProp() {
		return envProp;
	}

	/**
	 * @param envProp the envProp to set
	 */
	public void setEnvProp(Properties envProp) {
		this.envProp = envProp;
	}

	/**
	 * @return the prop
	 */
	public Properties getProp() {
		return prop;
	}

	/**
	 * @param prop the prop to set
	 */
	public void setProp(Properties prop) {
		this.prop = prop;
	}

}
