package javaprogram;

import practice.Utility.ExcelReaderWriter;

public class MainExecutionClass {
	
	public static void main(String[] args) throws Exception {
		//c cna = new c();
		//cna.C1method().B1method().A1method();
		ExcelReaderWriter ab = new ExcelReaderWriter();
		/*ab.readExcelData();
		ab.getsheetData("Login");
		ab.getTestCaseData("Login", 2);*/
		
		System.out.println(ab.getColumnData("Login", 2, "Username"));
	}

}


