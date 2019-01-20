package SeleniumCode;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleCode {

	public static void main(String[] args) throws Exception {
		
		String rootFolder=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder+"/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-table/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(5000);
		WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']"));
		List <WebElement> rowlist = (ArrayList<WebElement>) table.findElements(By.tagName("tr"));
		
		for (int i=0;i<rowlist.size();i++)
		{
			String nameofRow = rowlist.get(i).getText();
			System.out.println(nameofRow);
			List <WebElement> collist = (ArrayList<WebElement>) table.findElements(By.tagName("td"));
		for (int j=0;j<collist.size();j++)
		{
			String name = collist.get(j).getText();
			System.out.println(name);
		}
		}
	}  

}
