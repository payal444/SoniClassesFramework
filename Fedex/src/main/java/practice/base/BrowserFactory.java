package practice.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {

	static String rootFolder=System.getProperty("user.dir");
	static WebDriver driver;
	public static WebDriver initializeBrowser(String BrowserType,String appUrl) throws Exception {

		if(BrowserType.equalsIgnoreCase("chrome")) {
			System.out.println("Root folder is:"+rootFolder);
			
			ChromeOptions chromeOptions= new ChromeOptions();
			chromeOptions.setBinary("C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
			System.setProperty("webdriver.chrome.driver", rootFolder+"/Drivers/chromedriver.exe");
			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
			driver.get(appUrl);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Thread.sleep(4000);
		}
		else if (BrowserType.equalsIgnoreCase("firefox"))
		{

		}
		else if (BrowserType.equalsIgnoreCase("IE"))
		{

		}
		return driver;
	}
}
