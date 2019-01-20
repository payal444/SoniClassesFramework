package practice.Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptMethod {

	public static void scrolling(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,500)");
	}
	public static void scrollingintoView1(WebDriver driver,WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public static void scrollingintoView(WebDriver driver,WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	}
	public static void highLightElement(WebDriver driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].setAttribute('style','border: 2px solid red;');", element);

	}
	public static void typeUsingJavaScript(WebDriver driver,WebElement element,String valueTotype) {
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].value= '"+valueTotype+"';", element);

	}
	public static void clickusingjavascript(WebDriver driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].click();", element);

	}
	public static String getTitleUsingJavaScript(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		String sText= js.executeScript("return document.title").toString();
		return sText;
	}
}
