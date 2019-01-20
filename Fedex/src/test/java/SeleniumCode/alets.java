package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alets {
	public static void main(String[] args) throws Exception {
	String rootFolder=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", rootFolder+"/Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()=\"Simple Alert\"]")).click();
	
	driver.switchTo().alert().accept();
	System.out.println("working fine");
	driver.findElement(By.xpath("//button[text()=\"Confirm Pop up\"]")).click();
	
	driver.switchTo().alert().dismiss();
	System.out.println("Dismiss");
	driver.findElement(By.xpath("//button[text()=\"Prompt Pop up\"]")).click();

	driver.switchTo().alert().sendKeys("");
	driver.switchTo().alert().accept();
	System.out.println("Hey value entered");
	

}
}
