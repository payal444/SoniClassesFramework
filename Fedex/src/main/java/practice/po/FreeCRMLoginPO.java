package practice.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import practice.Utility.JavaScriptMethod;
import practice.Utility.SceenShot;
import practice.base.BasePageObject;

public class FreeCRMLoginPO extends BasePageObject {
	SoftAssert soft;
	public FreeCRMLoginPO(WebDriver driver, SoftAssert soft){
		//this.driver = driver;
		super(driver);
		this.soft=soft;
		
	}

	By username = By.name("username");
	By password = By.name("password");
	By Login = By.xpath("//input[@type=\"submit\"]");
	
	public void VerifyTitle()
	{
	String expectedTitle = "#1 Free CRM software in the cloud for sales and service";
    String actualTitle = driver.getTitle();
	//Assert.assertEquals(actualTitle, expectedTitle);
    soft.assertEquals(actualTitle, expectedTitle);
	}
	public void setusername(String uname)
	{
		isElementVisible(username).sendKeys(uname);
		//driver.findElement(username).sendKeys(uname);
		//type(username, uname);
	}
	
	public void setpassword(String pass)
	{
		//driver.findElement(password).sendKeys(pass);
		//type(password, pass);
		WebElement elm=findElement(password);
		JavaScriptMethod.typeUsingJavaScript(driver, elm, pass);
	}
	
	public void setLogin() throws Exception
	{
		isElementClickable(Login).click(); //explicit wait
		//driver.findElement(Login).click();
		
		
		/*WebElement elm=findElement(Login);
		
		JavaScriptMethod.highLightElement(driver, elm);
		SceenShot.captureVisiblePart(driver, "G:\\SeleniumWorkspace_N\\Fedex\\Reports\\screenshot", "Login");
		SceenShot.captureFullPage(driver, "G:\\SeleniumWorkspace_N\\Fedex\\Reports\\screenshot", "Login1");
		
		JavaScriptMethod.clickusingjavascript(driver, elm);*/
	}

}
