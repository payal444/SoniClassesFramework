package practice.base;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import practice.po.exportpo;

public class BasePageObject {
	protected WebDriver driver;
	WebDriverWait wait;
	
	public BasePageObject(WebDriver driver)
	{
		this.driver=driver;
		this.wait = new WebDriverWait(driver, 10);
	}

	public void type(By locator,String value)
	{
		findElement(locator).sendKeys(value);
	}

	public void frameSwitching(String framename)
	{
		driver.switchTo().frame(framename);

	}

	public void select(By sel,String ByMethod,String value)

	{
		WebElement el = findElement(sel);
		Select S1  = new Select(el);

		switch(ByMethod) {
		case "selectByIndex":
			S1.selectByIndex(Integer.parseInt(value));
		case "selectByValue":
			S1.selectByValue(value);
		case "selectByVisibleText":
			S1.selectByVisibleText(value);

		}

	}
	public void click(By locator)
	{

		findElement(locator).click();
	}
	public WebElement findElement(final By Locator) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){

			public WebElement apply(WebDriver driver) {
				return driver.findElement(Locator);
			}
		});
		return clickseleniumlink;

	}
	
	public WebElement isElementVisible(By locator)
	{
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public WebElement isElementClickable(By locator)
	{
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	public void isElementInVisible(By locator)
	{
		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}
}
