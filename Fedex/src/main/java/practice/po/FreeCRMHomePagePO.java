package practice.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import practice.base.BasePageObject;

public class FreeCRMHomePagePO extends BasePageObject{
	SoftAssert soft;
	public FreeCRMHomePagePO(WebDriver driver, SoftAssert soft) {
		super(driver);
		this.soft=soft;
	}

	By companyMenubar = By.xpath("//a[@title='Companies']");
	By newcompanyIteam = By.xpath("//a[@title='New Company']");
	By Title = By.xpath("//a[@title='Import']");
	
	public void switchoFrame()
	{
		frameSwitching("mainpanel");
	}

	public void movetoMenuBar(String TypeofMenu)
	{
		if(TypeofMenu.equalsIgnoreCase("company")) {
			WebElement ele = findElement(companyMenubar);
			Actions act = new Actions(driver);
			act.moveToElement(ele).build().perform();
			click(newcompanyIteam);
		}
		
	}
		public void import1 ()
		{
			driver.findElement(Title).click();
			String actual = driver.findElement(Title).getText();
			String expected = "Import";
			soft.assertEquals(actual, expected, "Import title is not displaying");
			
			
		}
	
}
