package trialAndError;

import com.qtpselenium.core.ddf.util.Xls_Reader;

public class Trial
{

	public static void main(String[] args) 
	{
		Xls_Reader excel = new Xls_Reader("C:\\Users\\Mir\\eclipse-workspace\\DataDriven_Core_Framework\\src\\test\\resources\\login.xlsx");
        System.out.println(excel.getCellData("Data", 0, 1));
        System.out.println(excel.getRowCount("Login"));
         
         
         
         
	}

}
