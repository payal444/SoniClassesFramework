package practice.base;

import practice.Utility.ExcelReaderWriter;

public class BaseTest {
	public static ConfigReader config;
	public static ExcelReaderWriter excel;
	
	static
	{
		config = new ConfigReader();
		config.readconfig();
		excel = new ExcelReaderWriter();
		try {
			excel.readExcelData(config.ExcelPath());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
