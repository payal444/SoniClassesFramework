package practice.module;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;

import practice.Utility.ExcelReaderWriter;
import practice.Utility.SceenShot;
import practice.po.NewCompanyPO;

public class NewCompnayModule {

	WebDriver driver;
	

	public NewCompnayModule(WebDriver driver)
	{
		this.driver=driver;
		
	}

	public void addValues(ExcelReaderWriter excel) throws Exception
	{
		LinkedHashMap<String,String> getTestData=excel.getTestCaseData("NewCompany", 1);
		NewCompanyPO f1 = new NewCompanyPO(driver);
		//f1.SelectStatus("New");
		f1.SelectStatus(getTestData.get("CompanyItem"));
		SceenShot.captureVisiblePart(driver, "G:\\SeleniumWorkspace_N\\Fedex\\Reports\\screenshot", "freeCRMHOMEpage");
	}
	
}

