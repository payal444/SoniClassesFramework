package practice.po;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.gargoylesoftware.htmlunit.javascript.host.event.KeyboardEvent;

import practice.base.BasePageObject;

public class ImportPo extends BasePageObject {

	public ImportPo(WebDriver driver) {
		super(driver);
	}
	
	By ChooseFile = By.xpath("//input[@type='file']");
	
	public void choosefile() throws Exception {
		System.out.println(driver.findElement(ChooseFile).getText());
		Assert.assertEquals(driver.findElement(ChooseFile).getText(), "", "Choose file is not displaying");
		driver.findElement(ChooseFile).click();
	//	driver.findElement(ChooseFile).sendKeys("C:\\\\Users\\\\User\\\\Desktop\\\\Payal_Resume.docx");
		Thread.sleep(5000);
		uploadFile("C:\\Users\\User\\Desktop\\Payal_Resume.docx");

	}
	public static void setClipboardData(String string) {
		//StringSelection is a class that can be used for copy and paste operations.
		   StringSelection stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,
		null);
		}
		public static void uploadFile(String fileLocation) {
		        try {
		        //Setting clipboard with file location
		            setClipboardData(fileLocation);
		            //native key strokes for CTRL, V and ENTER keys
		            Robot robot = new Robot();
		            robot.keyPress(KeyEvent.VK_CONTROL);
		            robot.keyPress(KeyEvent.VK_V);
		            robot.keyRelease(KeyEvent.VK_V);
		            robot.keyRelease(KeyEvent.VK_CONTROL);
		            robot.keyPress(KeyEvent.VK_ENTER);
		            robot.keyRelease(KeyEvent.VK_ENTER);
		        } catch (Exception exp) {
		        exp.printStackTrace();
		        }
		    }

}
