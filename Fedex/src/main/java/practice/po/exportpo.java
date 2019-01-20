package practice.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import practice.base.BasePageObject;

public class exportpo extends BasePageObject{

	public exportpo(WebDriver driver) {
		super(driver);
	}
	
	By Export = By.xpath("//a[@title='Export']");

	public void export() {
		driver.findElement(Export).click();
	}
}
