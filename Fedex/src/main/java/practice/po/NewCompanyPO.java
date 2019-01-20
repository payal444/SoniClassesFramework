package practice.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import practice.base.BasePageObject;

public class NewCompanyPO extends BasePageObject{

	public NewCompanyPO(WebDriver driver) {
		super(driver);
	}

	By status = By.name("status");
	
	public void SelectStatus(String selectVlaue)
	{
		select(status,"selectByValue",selectVlaue);
	}
}
