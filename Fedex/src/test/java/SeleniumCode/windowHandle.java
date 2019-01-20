package SeleniumCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {

	public static void main(String[] args) throws Exception {
		String rootFolder=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder+"/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		String ParentWindow = driver.getWindowHandle();
		System.out.println(ParentWindow);
		
		driver.findElement(By.xpath("//a[text()='terms and conditions']")).click();
		driver.findElement(By.xpath("//a[text()='privacy policy']")).click();
		Thread.sleep(4000);
		Set<String> windowSet = driver.getWindowHandles();
		System.out.println(windowSet);
		
		List<String> windowsList = new ArrayList<String>(windowSet);
		Thread.sleep(5000);
		driver.switchTo().window(windowsList.get(1)).findElement(By.xpath("//div[@class='floatR']/following::input[@type='button']")).click();
		driver.switchTo().window(windowsList.get(2)).close();
		driver.switchTo().window(windowsList.get(0)).close();
		/*Iterator<String> itr = windowSet.iterator();
		while(itr.hasNext()) {
			String windowAddress = itr.next();
			System.out.println(windowAddress);
			if(!(ParentWindow.equals(windowAddress)))
			{
				System.out.println("child addresss" +windowAddress);
				driver.switchTo().window(windowAddress).close();
				//driver.switchTo().window(windowAddress).findElement(By.xpath("//div[@class='floatR']/following::input[@type='button']")).getText();
				//driver.switchTo().window(windowAddress).findElement(By.xpath("//div[@class='floatR']/following::input[@type='button']")).click();
			}
			
		}
		//driver.switchTo().window(ParentWindow).close();
		
*/
	}

}
