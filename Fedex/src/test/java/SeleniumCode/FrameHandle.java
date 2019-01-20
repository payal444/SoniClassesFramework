package SeleniumCode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) throws Exception {
		String rootFolder=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder+"/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		int frameCount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(frameCount);
		List<WebElement> frameList = driver.findElements(By.tagName("iframe"));
		
		for(int i=0;i<frameList.size();i++)
		{
			String frameID = frameList.get(i).getAttribute("name");
			System.out.println(frameID);
		}
		Thread.sleep(2000);
		//driver.switchTo().frame(frameList.get(0));
		//driver.switchTo().frame(0);
		driver.switchTo().frame("iframe1");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("payal");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame("iframe2");
		driver.findElement(By.xpath("//a[@id='ui-id-3']")).click();
	}

}
